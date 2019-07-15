/*
 * CopyOperationHandler.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package cdp4servicesdal;

import cdp4common.commondata.ClassKind;
import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.ElementUsage;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.OwnedThing;
import cdp4common.engineeringmodeldata.Parameter;
import cdp4common.engineeringmodeldata.ParameterGroup;
import cdp4common.engineeringmodeldata.ParameterOverride;
import cdp4common.engineeringmodeldata.ParameterSubscription;
import cdp4dal.Session;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import cdp4dal.operations.OperationKind;
import cdp4dal.operations.OperationUtils;
import cdp4dal.permission.CopyPermissionHelper;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MoreCollectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * The purpose of the {@link CopyOperationHandler} is to modify a copy {@link Operation} into
 * multiple create {@link Operation}s.
 */
class CopyOperationHandler {

  /**
   * The associated {@link Session}.
   */
  private final Session session;

  /**
   * A {@link Map} that map the original {@link cdp4common.commondata.Thing} to the copied version.
   */
  private Map<Thing, Thing> copyThingMap;

  /**
   * A list of {@link UUID} of the copyable {@link Thing}s.
   */
  private List<UUID> copyableIds;

  /**
   * The list of {@link Operation} to create.
   */
  private List<Operation> operations;

  /**
   * Initializes a new instance of the {@link CopyOperationHandler} class.
   *
   * @param session The {@link Session}.
   */
  public CopyOperationHandler(Session session) {
    this.session = session;
  }

  /**
   * Gets the {@link ImmutableMap} that map the original {@link cdp4common.commondata.Thing} to the
   * copied version.
   */
  public ImmutableMap<Thing, Thing> getCopyThingMap() {
    return ImmutableMap.copyOf(this.copyThingMap);
  }

  /**
   * Modify the {@link OperationContainer} if it contains copy {@link Operation}.
   *
   * @param operationContainer The {@link OperationContainer} to modify.
   */
  public void modifiedCopyOperation(OperationContainer operationContainer) {
    var operationsToAdd = new ArrayList<Operation>();

    var copyOperationCount = operationContainer.getOperations()
        .stream()
        .filter(x -> OperationUtils.isCopyOperation(x.getOperationKind()))
        .count();

    if (copyOperationCount > 1) {
      // TODO: support this if needed
      throw new UnsupportedOperationException(
          "Only one copy operation per transaction is supported.");
    }

    var copyOperation = operationContainer.getOperations()
        .stream()
        .filter(x -> OperationUtils.isCopyOperation(x.getOperationKind()))
        .collect(MoreCollectors.toOptional());

    if (copyOperation.isEmpty()) {
      return;
    }

    this.computeOperations(copyOperation.get());
    operationsToAdd.addAll(this.operations);

    for (var operation : operationsToAdd) {
      operationContainer.addOperation(operation);
    }

    // remove the copy operations
    operationContainer.removeOperation(copyOperation.get());

    // update the update iteration operation
    var iterationOperation = operationContainer.getOperations()
        .stream()
        .filter(x -> x.getOperationKind() == OperationKind.UPDATE)
        .collect(MoreCollectors.onlyElement());

    var updatedIteration = iterationOperation.getModifiedThing().querySourceThing();
    var originalIteration = iterationOperation.getOriginalThing().querySourceThing();

    operationContainer.removeOperation(iterationOperation);
    operationContainer.addOperation(
        new Operation(originalIteration.toDto(), updatedIteration.toDto(), OperationKind.UPDATE));
  }

  /**
   * Compute a set of {@link List<Operation>} from a copy {@link Operation}.
   *
   * @param copyOperation The copy {@link Operation}.
   */
  private void computeOperations(Operation copyOperation) {
    this.copyThingMap = new HashMap<>();
    this.copyableIds = new ArrayList<>();
    this.operations = new ArrayList<>();

    var copyDto = copyOperation.getModifiedThing();
    var copyPojo = copyDto.querySourceThing();

    var originalDto = copyOperation.getOriginalThing();
    var originalPojo = originalDto.querySourceThing();

    if (copyPojo.getTopContainer().getClassKind() != ClassKind.EngineeringModel) {
      throw new IllegalArgumentException(
          "The copy operation on WSP is only implemented for things contained by EngineeringModel.");
    }

    this.copyThingMap.put(originalPojo, copyPojo);

    // compute the things to copy
    var copyPermissionHelper = new CopyPermissionHelper(this.session,
        OperationUtils.isCopyChangeOwnerOperation(copyOperation.getOperationKind()));
    var copyPermissionResult = copyPermissionHelper
        .computeCopyPermission(originalPojo, copyPojo.getContainer());

    // Add all contained objects
    this.copyableIds.addAll(copyPermissionResult.getCopyableThings()
        .stream()
        .map(Thing::getIid)
        .collect(Collectors.toList()));

    if (this.copyableIds.contains(originalPojo.getIid())) {
      var updatedIteration = copyPojo.getContainerOfType(Iteration.class);

      this.createPojoCopy(copyPojo, updatedIteration);

      // modify the references to point to the copy thing
      this.modifyReferences();

      if (OperationUtils.isCopyChangeOwnerOperation(copyOperation.getOperationKind())) {
        this.changeOwner(updatedIteration);
      }

      this.createOperations();
    }
  }

  /**
   * Creates the deep copy of the {@link ElementUsage} to write. In this case, the usage's {@link
   * ElementDefinition} is created first.
   *
   * @param usage The {@link ElementUsage}.
   * @param targetIteration The clone of the target {@link Iteration}.
   */
  private void createPojoCopy(ElementUsage usage, Iteration targetIteration) {
    if (!this.copyThingMap.containsKey(usage.getElementDefinition())) {
      // create a copy of its element definition
      var usageDefinitionClone = usage.getElementDefinition().clone(false);
      usageDefinitionClone.setIid(UUID.randomUUID());

      this.createPojoCopy(usageDefinitionClone, targetIteration);

      // add to the target iteration clone
      targetIteration.getElement().add(usageDefinitionClone);
      this.copyThingMap.put(usage.getElementDefinition(), usageDefinitionClone);
    }

    this.createPojoCopy((Thing) usage, targetIteration);
  }

  /**
   * Creates the deep copy of the {@link Thing} to write.
   *
   * @param pojo The {@link Thing} to copy.
   * @param targetIteration The clone of the target {@link Iteration}.
   */
  private void createPojoCopy(Thing pojo, Iteration targetIteration) {
    for (var containerList : pojo.getContainerLists()) {
      var updatedContainerList = new ArrayList<Thing>();
      for (var containedObject : containerList) {
        var containedPojo = (Thing) containedObject;
        if (!this.copyableIds.contains(containedPojo.getIid())) {
          continue;
        }

        var clone = containedPojo.clone(false);
        clone.setIid(UUID.randomUUID());

        if (clone.getClassKind() == ClassKind.ElementUsage) {
          this.createPojoCopy((ElementUsage) clone, targetIteration);
        } else {
          this.createPojoCopy(clone, targetIteration);
        }

        this.copyThingMap.put(containedPojo, clone);
        updatedContainerList.add(clone);
      }

      // clear the list
      containerList.clear();

      if (updatedContainerList.isEmpty()) {
        continue;
      }

      // Add items
      containerList.addAll(updatedContainerList);
    }
  }

  /**
   * Creates a {@link List<Operation>} associated to a {@link cdp4common.commondata.Thing} to copy.
   */
  private void createOperations() {
    for (var copy : this.copyThingMap.values()) {
      var operation = new Operation(null, copy.toDto(), OperationKind.CREATE);
      this.operations.add(operation);
    }
  }

  /**
   * Modify the references for a {@link Thing} and all its contained elements.
   */
  private void modifyReferences() {
    for (var copy : this.copyThingMap.values()) {
      switch (copy.getClassKind()) {
        case ElementUsage:
          this.modifyReferences((ElementUsage) copy);
          break;
        case Parameter:
          this.modifyReferences((Parameter) copy);
          break;
        case ParameterGroup:
          this.modifyReferences((ParameterGroup) copy);
          break;
        case ParameterOverride:
          this.modifyReferences((ParameterOverride) copy);
          break;
      }
    }
  }

  /**
   * Modify the references for the copied {@link ElementUsage}.
   *
   * @param usage The {@link ElementUsage}.
   */
  private void modifyReferences(ElementUsage usage) {
    // There shall be a definition in the things to copy
    usage.setElementDefinition(
        (ElementDefinition) this.copyThingMap.get(usage.getElementDefinition()));
    usage.getExcludeOption().clear();
  }

  /**
   * Modify the references for the copied {@link Parameter}.
   *
   * @param parameter The {@link Parameter}.
   */
  private void modifyReferences(Parameter parameter) {
    parameter.setStateDependence(null);
    if (parameter.getGroup() == null) {
      return;
    }

    // if the group cannot be copied, set to null
    Thing groupCopy = this.copyThingMap.get(parameter.getGroup());
    parameter.setGroup(groupCopy != null ? (ParameterGroup) groupCopy : null);
  }

  /**
   * Modify the references for the copied {@link ParameterGroup}.
   *
   * @param group The {@link ParameterGroup}.
   */
  private void modifyReferences(ParameterGroup group) {
    if (group.getContainingGroup() == null) {
      return;
    }

    // if the group cannot be copied, set to null
    Thing groupCopy = this.copyThingMap.get(group.getContainingGroup());
    group.setContainingGroup(groupCopy != null ? (ParameterGroup) groupCopy : null);
  }

  /**
   * Modify the references for the copied {@link ParameterOverride}.
   *
   * @param parameterOverride The {@link ParameterOverride}.
   */
  private void modifyReferences(ParameterOverride parameterOverride) {
    // if an override is copied, the parameter it overrides shall be in the list of copied elements
    var copy = (Parameter) this.copyThingMap.get(parameterOverride.getParameter());
    parameterOverride.setParameter(copy);
  }

  /**
   * Changes the {@link cdp4common.dto.DomainOfExpertise} for all {@link OwnedThing}s in the current
   * copy operation.
   *
   * @param iteration The {@link Iteration} into which the {@link Thing}s are copied.
   */
  private void changeOwner(Iteration iteration) {
    var activeDomain = this.session.getOpenIterations()
        .entrySet()
        .stream()
        .filter(x -> x.getKey().getIid().equals(iteration.getIid()))
        .collect(MoreCollectors.onlyElement())
        .getValue().getLeft();

    if (activeDomain == null) {
      throw new IllegalArgumentException(
          "The active domain is null. The copy operation cannot be performed.");
    }

    var ownedThings = this.copyThingMap.values()
        .stream()
        .filter(x -> x instanceof OwnedThing)
        .collect(Collectors.toList());

    for (var ownedThing : ownedThings) {
      // the owner of a subscription shall not be set to the active one
      if (ownedThing instanceof ParameterSubscription) {
        continue;
      }

      ((OwnedThing) ownedThing).setOwner(activeDomain);
    }
  }
}
