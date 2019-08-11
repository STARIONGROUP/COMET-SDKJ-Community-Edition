/*
 * OperationModifier.java
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

package cdp4wspdal;

import static cdp4common.helpers.Utils.as;

import cdp4common.commondata.ClassKind;
import cdp4common.commondata.Thing;
import cdp4common.dto.ActualFiniteState;
import cdp4common.dto.ElementUsage;
import cdp4common.dto.ParameterOverride;
import cdp4common.dto.ParameterSubscription;
import cdp4common.engineeringmodeldata.ActualFiniteStateKind;
import cdp4common.engineeringmodeldata.ActualFiniteStateList;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.Parameter;
import cdp4common.types.CacheKey;
import cdp4dal.Session;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import cdp4dal.operations.OperationKind;
import com.google.common.collect.MoreCollectors;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * The class that compensate operations non performed directly by the WSP.
 */
class OperationModifier {

  /**
   * The {@link Session} associated.
   */
  private final Session session;

  /**
   * Initializes a new instance of the {@link OperationModifier} class.
   *
   * @param session The {@link Session}.
   */
  OperationModifier(Session session) {
    this.session = session;
  }

  /**
   * Modify the {@link OperationContainer} to compensate for operations that should be performed by
   * the data-source but is not by the WSP.
   *
   * @param operationContainer The {@link OperationContainer} to modify.
   */
  void modifyOperationContainer(OperationContainer operationContainer) {
    var operationsToAdd = new ArrayList<Operation>();

    for (var operation : operationContainer.getOperations()) {
      if (operation.getOperationKind() == OperationKind.CREATE) {
        var parameterOverride = as(operation.getModifiedThing(), ParameterOverride.class);
        if (parameterOverride != null) {
          operationsToAdd.addAll(
              this.addParameterSubscriptionCreateOperation(operationContainer, parameterOverride));
        }
      } else if (operation.getOperationKind() == OperationKind.UPDATE) {
        var possibleStateList = as(operation.getModifiedThing(),
            cdp4common.dto.PossibleFiniteStateList.class);
        if (possibleStateList != null) {
          operationsToAdd
              .addAll(this.modifyActualStateKindOnDefaultPossibleStateUpdate(possibleStateList));
        }
      }
    }

    for (var operation : operationsToAdd) {
      operationContainer.addOperation(operation);
    }
  }

  /**
   * Add {@link cdp4common.dto.ParameterSubscription} to the list of operation if a {@link
   * ParameterOverride} is created.
   *
   * @param operationContainer The {@link OperationContainer} to modify.
   * @param parameterOverride The {@link ParameterOverride} to create.
   * @return A {@link List} of new {@link Operation}s.
   */
  private List<Operation> addParameterSubscriptionCreateOperation(
      OperationContainer operationContainer, ParameterOverride parameterOverride) {
    var parameterId = parameterOverride.getParameter();
    var parameter = (Parameter) this.session.getAssembler().getCache()
        .getIfPresent(new CacheKey(parameterId, parameterOverride.getIterationContainerId()));

    var operations = new ArrayList<Operation>();
    if (parameter == null) {
      return operations;
    }

    for (var subscription : parameter.getParameterSubscription()
        .stream()
        .filter(x -> !x.getOwner().getIid().equals(parameterOverride.getOwner()))
        .collect(Collectors.toList())) {
      var parameterSubscription = new ParameterSubscription();
      parameterSubscription.setIid(UUID.randomUUID());
      parameterSubscription.setOwner(subscription.getOwner().getIid());

      // Build Route for this Parameter subscription
      var elementUsageContainerDto =
          operationContainer.getOperations().stream()
              .map(x -> x.getModifiedThing())
              .filter(x -> x instanceof ElementUsage)
              .map(x -> (ElementUsage) x)
              .filter(x -> x.getParameterOverride().contains(parameterOverride.getIid()))
              .collect(MoreCollectors.toOptional()).orElse(null);

      if (elementUsageContainerDto == null) {
        continue;
      }

      var elementUsageContainer = this.session.getAssembler().getCache().getIfPresent(
          new CacheKey(elementUsageContainerDto.getIid(),
              elementUsageContainerDto.getIterationContainerId()));
      if (elementUsageContainer == null) {
        continue;
      }

      var elementDef = elementUsageContainer.getContainerOfType(ElementDefinition.class);
      var iteration = elementUsageContainer.getContainerOfType(Iteration.class);
      var model = elementUsageContainer.getContainerOfType(EngineeringModel.class);

      if (elementDef == null || iteration == null || model == null) {
        continue;
      }

      parameterSubscription.addContainer(ClassKind.ParameterOverride, parameterOverride.getIid());
      parameterSubscription.addContainer(ClassKind.ElementUsage, elementUsageContainer.getIid());
      parameterSubscription.addContainer(ClassKind.ElementDefinition, elementDef.getIid());
      parameterSubscription.addContainer(ClassKind.Iteration, iteration.getIid());
      parameterSubscription.addContainer(ClassKind.EngineeringModel, model.getIid());

      parameterOverride.getParameterSubscription().add(parameterSubscription.getIid());
      operations.add(new Operation(null, parameterSubscription, OperationKind.CREATE));
    }

    return operations;
  }

  /**
   * Modify the {@link ActualFiniteState#getKind()} state of the potential new default actual state
   * to "Mandatory".
   *
   * @param possibleFiniteStateList The updated {@link cdp4common.dto.PossibleFiniteStateList}.
   * @return A {@link List} of new {@link Operation}s.
   */
  private List<Operation> modifyActualStateKindOnDefaultPossibleStateUpdate(
      cdp4common.dto.PossibleFiniteStateList possibleFiniteStateList) {
    var operations = new ArrayList<Operation>();
    var defaultStateId = possibleFiniteStateList.getDefaultState();
    if (defaultStateId == null || defaultStateId.equals(new UUID(0L, 0L))) {
      return operations;
    }

    // gets the actualList that uses the updated possible list
    var actualLists = this.session.getAssembler().getCache()
        .asMap()
        .values()
        .stream()
        .filter(x -> x instanceof ActualFiniteStateList)
        .map(x -> (ActualFiniteStateList) x)
        .filter(x -> x.getPossibleFiniteStateList()
            .stream()
            .map(Thing::getIid)
            .anyMatch(y -> y.equals(possibleFiniteStateList.getIid()))
        )
        .collect(Collectors.toList());

    for (var actualFiniteStateList : actualLists) {
      var possibleLists = actualFiniteStateList.getPossibleFiniteStateList()
          .stream()
          .filter(x -> !x.getIid().equals(possibleFiniteStateList.getIid()))
          .collect(Collectors.toList());

      if (possibleLists
          .stream()
          .anyMatch(x -> x.getDefaultState() == null)) {
        // One of the possible list has no default state
        continue;
      }

      var defaultPossibleStatesIds = possibleLists
          .stream()
          .map(x -> x.getDefaultState().getIid())
          .collect(Collectors.toList());

      defaultPossibleStatesIds.add(defaultStateId);

      // get the "default" actual state
      var defaultActualState =
          actualFiniteStateList.getActualState()
              .stream()
              .filter(x -> {
                var list = x.getPossibleState()
                    .stream()
                    .map(Thing::getIid)
                    .collect(Collectors.toList());
                list.retainAll(defaultPossibleStatesIds);

                return list.size() == defaultPossibleStatesIds.size();
              })
              .collect(MoreCollectors.toOptional())
              .orElse(null);

      if (defaultActualState == null
          || defaultActualState.getKind() == ActualFiniteStateKind.MANDATORY) {
        continue;
      }

      // The new default is forbidden, send update with mandatory
      var actualStateDto = (ActualFiniteState) defaultActualState.toDto();
      actualStateDto.setKind(ActualFiniteStateKind.MANDATORY);
      var newOperation = new Operation(defaultActualState.toDto(), actualStateDto,
          OperationKind.UPDATE);
      operations.add(newOperation);
    }

    return operations;
  }
}
