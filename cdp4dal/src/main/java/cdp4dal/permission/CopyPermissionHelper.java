/*
 * CopyPermissionHelper.java
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

package cdp4dal.permission;

import static cdp4common.helpers.Utils.as;

import cdp4common.commondata.ClassKind;
import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.ElementUsage;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.OwnedThing;
import cdp4common.engineeringmodeldata.Parameter;
import cdp4common.engineeringmodeldata.ParameterSubscription;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.ModelReferenceDataLibrary;
import cdp4common.sitedirectorydata.ReferenceDataLibrary;
import cdp4dal.Session;
import com.google.common.collect.MoreCollectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

/**
 * A service class that computes the copy permission for {@link Thing}s.
 */
public class CopyPermissionHelper {

  /**
   * The {@link Session}.
   */
  private final Session session;

  /**
   * The {@link PermissionService} associated with this {@link #session}.
   */
  private final PermissionService permissionService;

  /**
   * The {@link ReferenceDataLibrary} available.
   */
  private final List<ReferenceDataLibrary> availableRdls;

  /**
   * The active {@link DomainOfExpertise}.
   */
  private final List<DomainOfExpertise> activeDomains;

  /**
   * A value indicating whether the {@link DomainOfExpertise} of {@link OwnedThing} is changed.
   */
  private final boolean ownerIsChanged;

  /**
   * The new {@link DomainOfExpertise} for {@link OwnedThing} if applicable.
   */
  private DomainOfExpertise changedOwner;

  /**
   * Initializes a new instance of the {@link CopyPermissionHelper} class.
   *
   * @param session The {@link Session} associated to the copy operation target.
   * @param ownerIsChanged A value indicating whether the {@link DomainOfExpertise} of {@link
   * OwnedThing} is changed.
   */
  public CopyPermissionHelper(Session session, boolean ownerIsChanged) {
    if (session == null) {
      throw new NullPointerException("session");
    }

    this.ownerIsChanged = ownerIsChanged;

    this.availableRdls = new ArrayList<>();
    this.activeDomains = new ArrayList<>();
    this.session = session;
    this.permissionService = this.session.getPermissionService();
  }

  /**
   * Computes the copy permission asynchronously.
   *
   * @param thingToCopy The {@link Thing} to copy.
   * @param targetContainer The target container.
   * @return The {@link CopyPermissionResult}.
   */
  public CompletableFuture<CopyPermissionResult> computeCopyPermissionAsync(Thing thingToCopy,
      Thing targetContainer) {
    return CompletableFuture
        .supplyAsync(() -> this.computeCopyPermission(thingToCopy, targetContainer));
  }

  /**
   * Compute the copy permission for the {@code thingToCopy}.
   *
   * @param thingToCopy The {@link Thing} to copy.
   * @param targetContainer The target container.
   * @return The {@link CopyPermissionResult}.
   */
  public CopyPermissionResult computeCopyPermission(Thing thingToCopy, Thing targetContainer) {
    if (thingToCopy == null) {
      throw new NullPointerException("thingToCopy");
    }

    if (targetContainer == null) {
      throw new NullPointerException("The destination of the thing to copy cannot be null.");
    }

    if (!this.checkContainment(thingToCopy, targetContainer)) {
      throw new IllegalArgumentException("The container is invalid for the thing to copy.");
    }

    if (!(thingToCopy instanceof ElementDefinition)
        && thingToCopy.getContainerOfType(cdp4common.engineeringmodeldata.ElementDefinition.class)
        == null) {
      throw new UnsupportedOperationException(
          "The method is only implemented for things contained by ElementDefinition. The RequiredRdls property needs to be implemented in all things.");
    }

    CopyPermissionResult result = new CopyPermissionResult();
    result.setErrorMap(new HashMap<>());
    result.setCopyableThings(new ArrayList<>());

    EngineeringModel model = as(targetContainer.getTopContainer(), EngineeringModel.class);
    Thing iteration = targetContainer instanceof Iteration
        ? targetContainer : targetContainer.getContainerOfType(Iteration.class);
    this.changedOwner = this.session.getOpenIterations().entrySet()
        .stream()
        .filter(x -> x.getKey().getIid().equals(iteration.getIid()))
        .collect(MoreCollectors.onlyElement())
        .getValue().getLeft();

    if (model != null) {
      if (thingToCopy.getTopContainer() == targetContainer.getTopContainer()) {
        throw new IllegalArgumentException(
            "The copy operation is only supported between 2 different models.");
      }

      this.computeAvailableRdl(model);
      this.computeActiveDomains(model);
      this.computeModelCopyPermission(thingToCopy, targetContainer, result);
    }

    return result;
  }

  /**
   * Compute the copy permission for the {@link Thing} contained by an {@link EngineeringModel}, its
   * contained {@link Thing}s and its dependencies.
   *
   * @param thingToCopy The {@link Thing} to copy.
   * @param targetContainer The target container.
   * @param permissionResult The {@link CopyPermissionResult} containing the result of the copy
   * permission computation.
   */
  private void computeModelCopyPermission(Thing thingToCopy, Thing targetContainer,
      CopyPermissionResult permissionResult) {
    if (thingToCopy.getClassKind() == ClassKind.ParameterValueSet
        || thingToCopy.getClassKind() == ClassKind.ParameterOverrideValueSet
        || thingToCopy.getClassKind() == ClassKind.ParameterSubscriptionValueSet) {
      // value sets are not copied
      return;
    }

    if (!this.permissionService.canWrite(thingToCopy.getClassKind(), targetContainer)) {
      permissionResult.getErrorMap().put(thingToCopy, String
          .format("You do not have permission to copy the %s with id %s.",
              thingToCopy.getClassKind(), thingToCopy.getIid()));
      return;
    }

    // all the required rdls for the thing to copy shall be available in the model destination
    Collection<ReferenceDataLibrary> requiredRdls = thingToCopy.getRequiredRdls();
    ArrayList<ReferenceDataLibrary> intersectRdls = new ArrayList<>(this.availableRdls);
    intersectRdls.retainAll(requiredRdls);
    if (intersectRdls.size() != requiredRdls.size()) {
      permissionResult.getErrorMap().put(thingToCopy, String.format(
          "The copy operation cannot be performed for the %s with id %s as some required reference data libraries are missing in the target model.",
          thingToCopy.getClassKind(), thingToCopy.getIid()));
      return;
    }

    OwnedThing ownedThing = as(thingToCopy, OwnedThing.class);
    if (ownedThing != null && !this.ownerIsChanged && !this.activeDomains
        .contains(ownedThing.getOwner())) {
      permissionResult.getErrorMap().put(thingToCopy, String.format(
          "The copy operation cannot be performed for the %s with id %s. The owner is not active in the target model",
          thingToCopy.getClassKind(), thingToCopy.getIid()));
      return;
    }

    // compute copy dependencies, if fail, dont copy
    if (!this.computeDependenciesCopyPermission(thingToCopy, targetContainer, permissionResult)) {
      permissionResult.getErrorMap().put(thingToCopy, String.format(
          "The copy operation cannot be performed for the %s with id %s. Some of its dependencies cannot be copied.",
          thingToCopy.getClassKind(), thingToCopy.getIid()));
      return;
    }

    ParameterSubscription subscription = as(thingToCopy, ParameterSubscription.class);
    if (subscription != null && this.ownerIsChanged && (subscription.getOwner() == this.changedOwner
        || (ownedThing != null && !this.activeDomains
        .contains(ownedThing.getOwner())))) {
      permissionResult.getErrorMap().put(thingToCopy, String.format(
          "The parameter subscription %s will not be copied. The owner of the subscribed parameter or override in the target destination is the same of the subscription or is not active in the target model.",
          thingToCopy.getIid()));
      return;
    }

    permissionResult.getCopyableThingsList().add(thingToCopy);
    this.computeModelContainedThingPermission(thingToCopy, targetContainer, permissionResult);
  }

  /**
   * Compute the copy permission for the contained {@link Thing}s of the {@code thingToCopy}.
   *
   * @param thingToCopy The {@link Thing} to copy.
   * @param targetContainer The target container for {@code thingToCopy}.
   * @param permissionResult The {@link CopyPermissionResult}.
   */
  private void computeModelContainedThingPermission(Thing thingToCopy, Thing targetContainer,
      CopyPermissionResult permissionResult) {
    Thing thingToCopyClone = thingToCopy.clone(false);
    thingToCopyClone.setContainer(targetContainer);

    for (Collection containerList : thingToCopyClone.getContainerLists()) {
      for (Object thing : containerList) {
        this.computeModelCopyPermission((Thing) thing, thingToCopyClone, permissionResult);
      }
    }
  }

  /**
   * Compute the copy permissions for the dependencies of the {@code thingToCopy}.
   *
   * @param thingToCopy The {@link Thing} to copy.
   * @param targetContainer The target container for the {@code thingToCopy}.
   * @param permissionResult The {@link CopyPermissionResult} that is updated.
   * @return True if the mandatory data of the dependencies can be copied.
   */
  private boolean computeDependenciesCopyPermission(Thing thingToCopy, Thing targetContainer,
      CopyPermissionResult permissionResult) {
    switch (thingToCopy.getClassKind()) {
      case ElementUsage:
        return this.computeDependenciesCopyPermission((ElementUsage) thingToCopy,
            (ElementDefinition) targetContainer, permissionResult);
      default:
        return true;
    }
  }

  /**
   * Compute the copy permissions for the dependencies of the {@code usage}.
   *
   * @param usage The {@link ElementUsage} to copy.
   * @param targetContainer The target container for the {@code usage}.
   * @param permissionResult The {@link CopyPermissionResult} that is updated.
   * @return True if the {@link ElementDefinition} for the {@code usage} can be copied with all its
   * {@link Parameter}.
   */
  private boolean computeDependenciesCopyPermission(ElementUsage usage,
      ElementDefinition targetContainer, CopyPermissionResult permissionResult) {
    if (!permissionResult.getCopyableThings().contains(usage.getElementDefinition()) &&
        !permissionResult.getErrorMap().containsKey(usage.getElementDefinition())) {
      this.computeModelCopyPermission(usage.getElementDefinition(), targetContainer.getContainer(),
          permissionResult);
    }

    List<UUID> errorThingIds = permissionResult.getErrorMap().keySet().stream().map(Thing::getIid)
        .collect(
            Collectors.toList());

    // the element definition should be copyable along its parameters
    List<UUID> mandatoryIds = usage.getElementDefinition().getParameter().stream().map(Thing::getIid)
        .collect(
            Collectors.toList());
    mandatoryIds.add(usage.getElementDefinition().getIid());

    errorThingIds.retainAll(mandatoryIds);
    return errorThingIds.size() == 0;
  }

  /**
   * Compute the required {@link ReferenceDataLibrary} for the {@code model}.
   *
   * @param model The {@link EngineeringModel}.
   */
  private void computeAvailableRdl(EngineeringModel model) {
    this.availableRdls.clear();
    ModelReferenceDataLibrary requiredRdl = model.getEngineeringModelSetup().getRequiredRdl().stream().collect(
        MoreCollectors.onlyElement());
    this.availableRdls.add(requiredRdl);
    this.availableRdls.addAll(requiredRdl.getRequiredRdls());
  }

  /**
   * Compute the active {@link DomainOfExpertise} for the {@code model}.
   *
   * @param model The {@link EngineeringModel}.
   */
  private void computeActiveDomains(EngineeringModel model) {
    this.activeDomains.clear();
    this.activeDomains.addAll(model.getEngineeringModelSetup().getActiveDomain());
  }

  /**
   * Check that the target {@code container} is of the correct type for the {@code thing}.
   *
   * @param thing The {@link Thing} to add.
   * @param container The potential container.
   * @return True if the container is of the correct time.
   */
  private boolean checkContainment(Thing thing, Thing container) {
    Class containerType = thing.getContainerInformation().getLeft();
    return containerType.isInstance(container);
  }
}
