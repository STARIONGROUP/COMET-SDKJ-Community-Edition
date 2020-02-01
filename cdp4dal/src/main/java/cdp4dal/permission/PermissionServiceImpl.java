/*
 * PermissionServiceImpl.java
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

import cdp4common.Container;
import cdp4common.commondata.ClassKind;
import cdp4common.commondata.ParticipantAccessRightKind;
import cdp4common.commondata.PersonAccessRightKind;
import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.OwnedThing;
import cdp4common.exceptions.IncompleteModelException;
import cdp4common.helpers.StaticDefaultPermissionProvider;
import cdp4common.helpers.Utils;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.EngineeringModelSetup;
import cdp4common.sitedirectorydata.Participant;
import cdp4common.sitedirectorydata.ParticipantRole;
import cdp4common.sitedirectorydata.Person;
import cdp4common.sitedirectorydata.PersonRole;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import cdp4dal.Session;
import com.google.common.base.Strings;
import com.google.common.collect.MoreCollectors;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.tuple.Pair;

/**
 * The Permission Service class for the CDP4 application.
 */
@Log4j2
public class PermissionServiceImpl implements PermissionService {

  /**
   * Initializes a new instance of the {@link PermissionService} class.
   *
   * @param session The {@link Session} that this {@link PermissionService} is handling.
   */
  public PermissionServiceImpl(Session session) {
    this.session = session;
  }

  /**
   * Gets the {@link Session} that these permission service are responsible for.
   */
  @Getter
  private Session session;

  /**
   * Returns whether a Read operation can be performed by the active user on the current {@link
   * Thing}.
   *
   * @param thing The {@link Thing} to read.
   * @return True if a Read operation can be performed.
   */
  @Override
  public boolean canRead(Thing thing) {
    // if the thing is null cancel out
    return thing != null && this.canRead(thing, thing.getClass());
  }

  /**
   * Returns whether a Read operation can be performed by the active user on the current {@link
   * Thing} based on the supplied {@link Class}. The {@link Class} ultimately determines the
   * access.
   *
   * @param thing The {@link Thing} to read, or the container if the permissions are based on the
   * container.
   * @param thingType The {@link Class} that ultimately determines the permissions.
   * @return True if Read operation can be performed.
   */
  private boolean canRead(Thing thing, Class thingType) {
    log.trace("CanRead invoked on Thing {} of type {}", thing, thingType);
    var topContainerClassKind = thing.getTopContainer().getClassKind();

    this.checkOwnedThing(thing);

    switch (topContainerClassKind) {
      case SiteDirectory:
        return this.canReadSiteDirectoryContainedThing(thing, thingType);
      case EngineeringModel:
        return this.canReadEngineeringModelContainedThing(thing, thingType);
    }

    return false;
  }

  /**
   * Checks if thing is an OwnedThing without an actual Owner.
   *
   * @param thing The {@link Thing} to check.
   */
  private void checkOwnedThing(Thing thing) {
    if (thing instanceof OwnedThing && ((OwnedThing) thing).getOwner() == null) {
      throw new IncompleteModelException(String
          .format("Owner of %s with id %s is empty.", thing.getClass().getName(), thing.getIid()));
    }
  }

  /**
   * Returns whether a Read operation can be performed by the active user on the current {@link
   * EngineeringModel} contained {@link Thing} based on the supplied {@link Class}. The {@link
   * Class} ultimately determines the access.
   *
   * @param thing The {@link Thing} to read, or the container if the permissions are based on the
   * container.
   * @param thingType The {@link Class} that ultimately determines the permissions.
   * @return True if Read operation can be performed.
   */
  private boolean canReadEngineeringModelContainedThing(Thing thing, Class thingType) {
    var engineeringModel = thing.getTopContainer();
    var participant =
        this.session.getActivePersonParticipants()
            .stream()
            .filter(x -> ((EngineeringModelSetup) x.getContainer()).getEngineeringModelIid()
                .equals(engineeringModel.getIid()))
            .findFirst();

    if (participant.isEmpty() || participant.get().getRole() == null) {
      return false;
    }

    switch (getParticipantPermission(thing, thingType, participant.get())) {
      case SAME_AS_CONTAINER:
        return this.canRead(thing.getContainer(), thing.getContainer().getClass());
      case SAME_AS_SUPERCLASS:
        return this.canRead(thing, thing.getClass().getSuperclass());
      case MODIFY:
      case MODIFY_IF_OWNER:
        return true;
      default:
        return false;
    }
  }

  /**
   * Returns whether a Read operation can be performed by the active user on the current {@link
   * SiteDirectory} contained. {@link Thing} based on the supplied {@link Class}. The {@link Class}
   * ultimately determines the access.
   *
   * @param thing The {@link Thing} to read, or the container if the permissions are based on the
   * container.
   * @param thingType The {@link Class} that ultimately determines the permissions.
   * @return True if Read operation can be performed.
   */
  private boolean canReadSiteDirectoryContainedThing(Thing thing, Class thingType) {
    if (!isPersonActiveAndHasRole()) {
      return false;
    }

    switch (getPersonPermission(thing, thingType)) {
      case SAME_AS_CONTAINER:
        return this.canRead(thing.getContainer(), thing.getContainer().getClass());
      case SAME_AS_SUPERCLASS:
        return this.canRead(thing, thingType.getSuperclass());
      case READ:
      case MODIFY:
        return true;
      case MODIFY_IF_PARTICIPANT:
      case READ_IF_PARTICIPANT:
        if (thing instanceof EngineeringModelSetup || thing
            .getContainer() instanceof EngineeringModelSetup) {
          return hasParticipantPermissionForEngineeringModelSetup(thing);
        }

        if (thing instanceof SiteReferenceDataLibrary) {
          var rdl =
              this.getSession().retrieveSiteDirectory()
                  .getModel()
                  .stream()
                  .flatMap(ems -> this.getSession().getEngineeringModelSetupRdlChain(ems).stream())
                  .collect(Collectors.toList());

          return rdl.contains(thing);
        }

        return false;
      case MODIFY_OWN_PERSON:
        return thing == this.getSession().getActivePerson();
      default:
        return false;
    }
  }

  /**
   * Returns whether an active {@link Person} is present in the current {@link Session} and it has a
   * {@link PersonRole}.
   *
   * @return True if an active {@link Person} is present and has a {@link PersonRole}.
   */
  private boolean isPersonActiveAndHasRole() {
    if (this.getSession().getActivePerson() == null) {
      return false;
    }

    return this.getSession().getActivePerson().getRole() != null;
  }

  /**
   * Returns {@link PersonAccessRightKind} for the active {@link Person} concerning the supplied
   * {@link Thing}. {@link Thing} based on the supplied {@link Class}. The {@link Class} ultimately
   * determines the access.
   *
   * @param thing The {@link Thing} to read/write, or the container if the permissions are based on
   * the container.
   * @param thingType The {@link Class} that ultimately determines the permissions.
   * @return {@link PersonAccessRightKind} concerning the given {@link Thing}.
   */
  private PersonAccessRightKind getPersonPermission(Thing thing, Class thingType) {
    var personRole = this.getSession().getActivePerson().getRole();
    var permission = personRole.getPersonPermission()
        .stream()
        .filter(perm -> perm.getObjectClass() == thing.getClassKind())
        .collect(MoreCollectors.toOptional())
        .orElse(null);

    if (thing.getClass() != thingType) {
      ClassKind superClassKind = Utils.parseClassToClassKind(thingType);

      if (superClassKind != null) {
        permission = personRole.getPersonPermission()
            .stream()
            .filter(perm -> perm.getObjectClass() == superClassKind)
            .collect(MoreCollectors.toOptional())
            .orElse(null);
      }
    }

    // if the permission is not found or superclass derivation is used then get the default one.
    return permission == null ? StaticDefaultPermissionProvider
        .getDefaultPersonPermission(thingType.toString()) : permission.getAccessRight();
  }

  /**
   * Returns {@link ParticipantAccessRightKind} for the active {@link Participant} concerning the
   * supplied {@link Thing}. {@link Thing} based on the supplied {@link Class}. The {@link Class}
   * ultimately determines the access.
   *
   * @param thing The {@link Thing} to read/write, or the container if the permissions are based on
   * the container.
   * @param thingType The {@link Class} that ultimately determines the permissions.
   * @param participant The {@link Participant} to find permission for.
   * @return {@link ParticipantAccessRightKind} concerning the given {@link Thing}.
   */
  private ParticipantAccessRightKind getParticipantPermission(Thing thing, Class thingType,
      Participant participant) {
    var permission = participant.getRole().getParticipantPermission()
        .stream()
        .filter(perm -> perm.getObjectClass() == thing.getClassKind())
        .collect(MoreCollectors.toOptional())
        .orElse(null);

    if (thing.getClass() != thingType) {
      ClassKind superClassKind = Utils.parseClassToClassKind(thingType);

      if (superClassKind != null) {
        permission = participant.getRole().getParticipantPermission()
            .stream()
            .filter(perm -> perm.getObjectClass() == superClassKind)
            .collect(MoreCollectors.toOptional())
            .orElse(null);
      }
    }

    // if the permission is not found then get the default one.
    return permission == null ? StaticDefaultPermissionProvider
        .getDefaultParticipantPermission(thingType.getSimpleName()) : permission.getAccessRight();
  }

  /**
   * Returns whether an active {@link Person} has a permission to operate with the supplied {@link
   * Thing}.
   *
   * @param thing The {@link Thing} that should be of type {@code EngineeringModelSetup} or its
   * container of this type.
   * @return True if an active {@link Person} has a corresponding {@link Participant} in the
   * supplied {@link Thing}.
   */
  private boolean hasParticipantPermissionForEngineeringModelSetup(Thing thing) {
    var setup = Utils.as(thing, EngineeringModelSetup.class) != null ? Utils
        .as(thing, EngineeringModelSetup.class)
        : Utils.as(thing.getContainer(), EngineeringModelSetup.class);
    return setup.getParticipant()
        .stream()
        .anyMatch(x -> x.getPerson() == this.getSession().getActivePerson());
  }

  /**
   * Returns whether a Write operation can be performed by the active user on the current {@link
   * Thing}.
   *
   * @param thing The {@link Thing} to write.
   * @return True if a Write operation can be performed.
   */
  @Override
  public boolean canWrite(Thing thing) {
    log.trace("canWrite invoked on Thing {} ", thing);

    return thing != null && !this.getSession().getDal().isReadOnly() && !thing
        .hasSentinelInstances() && this.canWrite(thing, thing.getClass());
  }

  /**
   * Returns whether a Write operation can be performed by the active user on the current {@link
   * Thing} based on the supplied {@link Class}. The {@link Class} ultimately determines the
   * access.
   *
   * @param thing The {@link Thing} to write, or the container if the permissions are based on the
   * container.
   * @param thingType The {@link Class} that ultimately determines the permissions.
   * @return True if Write operation can be performed.
   */
  private boolean canWrite(Thing thing, Class thingType) {
    this.checkOwnedThing(thing);
    var topContainerClassKind = thing.getTopContainer().getClassKind();

    switch (topContainerClassKind) {
      case SiteDirectory:
        return this.canWriteSiteDirectoryContainedThing(thing, thingType);
      case EngineeringModel:
        return this.canWriteEngineeringModelContainedThing(thing, thingType);
      default:
        log.error("The top container of the {} could not be resolved", thing.getClassKind());
        return false;
    }
  }

  /**
   * Returns whether a Write operation can be performed by the active user on the current {@link
   * ClassKind}. based on the supplied {@link Container}. The {@link ClassKind} ultimately
   * determines the access. This method is primarily used for creation of a certain {@link Thing}.
   *
   * @param classKind The {@link ClassKind} that ultimately determines the permissions.
   * @param containerThing he {@link Thing} to write to.
   * @return True if Write operation can be performed.
   */
  @Override
  public boolean canWrite(ClassKind classKind, Thing containerThing) {
    log.trace("CanWrite invoked on ClassKind {} and Container {}", classKind, containerThing);

    if (this.getSession().getDal().isReadOnly()) {
      return false;
    }

    this.checkOwnedThing(containerThing);

    var topContainerClassKind = containerThing.getTopContainer().getClassKind();
    switch (topContainerClassKind) {
      case SiteDirectory:
        return this.canWriteSiteDirectoryContainedThing(classKind, containerThing, classKind);
      case EngineeringModel:
        return this.canWriteEngineeringModelContainedThing(classKind, containerThing, classKind);
    }

    return false;
  }

  /**
   * Returns whether a Write operation can be performed by the active user on the current {@link
   * EngineeringModel} contained {@link Thing} based on the supplied {@link Class}. The {@link
   * Class} ultimately determines the access.
   *
   * @param thing The {@link Thing} to write, or the container if the permissions are based on the
   * container.
   * @param thingType The {@link Class} that ultimately determines the permissions.
   * @return True if Write operation can be performed.
   */
  private boolean canWriteEngineeringModelContainedThing(Thing thing, Class thingType) {
    var engineeringModel = thing.getTopContainer();

    var participantOptional = getParticipantIfActiveAndIterationNotFrozen(thing,
        (EngineeringModel) engineeringModel);

    if (participantOptional.isEmpty()) {
      return false;
    }

    switch (getParticipantPermission(thing, thingType, participantOptional.get())) {
      case SAME_AS_CONTAINER:
        return this.canWrite(thing.getContainer(), thing.getContainer().getClass());
      case SAME_AS_SUPERCLASS:
        return this.canWrite(thing, thing.getClass().getSuperclass());
      case MODIFY:
        return true;
      case MODIFY_IF_OWNER:
        var ownedThing = Utils.as(thing, OwnedThing.class);

        if (ownedThing != null) {
          return this.canWriteIfParticipantOwned(ownedThing);
        }
        break;
      default:
        return false;
    }

    return false;
  }

  /**
   * Returns whether a Write operation can be performed by the active user on the current {@link
   * EngineeringModel} contained {@link Thing} based on the supplied {@link Class}. The {@link
   * Class} ultimately determines the access.
   *
   * @param containerThing The {@link Thing} to operate on.
   * @return {@link Optional<Participant>}. It will be empty if {@link Iteration} is null or frozen
   * or the current {@link Person} does not have a corresponding {@link Participant} for the
   * supplied {@link EngineeringModel} or if a corresponding {@link Participant} does not have a
   * {@link ParticipantRole}.
   */
  private Optional<Participant> getParticipantIfActiveAndIterationNotFrozen(Thing containerThing,
      EngineeringModel engineeringModel) {
    var iteration = containerThing instanceof Iteration ? (Iteration) containerThing
        : containerThing.getContainerOfType(Iteration.class);

    if (iteration != null && iteration.getIterationSetup().getFrozenOn() != null) {
      return Optional.empty();
    }

    var participant = this.getSession().getActivePersonParticipants()
        .stream()
        .filter(x -> ((EngineeringModelSetup) x.getContainer()).getEngineeringModelIid()
            .equals(engineeringModel.getIid()))
        .findFirst();

    if (participant.isEmpty() || participant.get().getRole() == null) {
      return Optional.empty();
    }

    return participant;
  }

  /**
   * Returns whether a Write operation can be performed by the active user on the current {@link
   * ClassKind} based on the supplied {@link Container}. The {@link ClassKind} ultimately determines
   * the access. This method is primarily used for creation of a certain {@link EngineeringModel}
   * contained {@link Thing}.
   *
   * @param classKind The {@link ClassKind} that ultimately determines the permissions.
   * @param thing The {@link Thing} to write to.
   * @param thingType The {@link ClassKind} that ultimately determines the permissions.
   * @return True if Write operation can be performed.
   */
  private boolean canWriteEngineeringModelContainedThing(ClassKind classKind, Thing thing,
      ClassKind thingType) {
    var engineeringModel = Utils.as(thing.getTopContainer(), EngineeringModel.class);

    var participantOptional = getParticipantIfActiveAndIterationNotFrozen(thing,
        engineeringModel);

    if (participantOptional.isEmpty()) {
      return false;
    }

    var permission = participantOptional.get().getRole().getParticipantPermission()
        .stream()
        .filter(perm -> perm.getObjectClass() == classKind)
        .collect(MoreCollectors.toOptional())
        .orElse(null);

    // if the permission is not found then get the default one.
    var right = permission != null ? permission.getAccessRight()
        : StaticDefaultPermissionProvider.getDefaultParticipantPermission(thingType.toString());

    switch (right) {
      case SAME_AS_CONTAINER:
        return this.canWrite(thing.getContainer(), thing.getContainer().getClass());
      case SAME_AS_SUPERCLASS:
        return this.canWriteBasedOnSuperclassClassKind(thing, thingType);
      case MODIFY:
      case MODIFY_IF_OWNER:
        return true;
      default:
        return false;
    }
  }

  /**
   * Returns whether a Write operation can be performed by the active user on the current {@link
   * SiteDirectory} contained {@link Thing} based on the supplied {@link Class}. The {@link Class}
   * ultimately determines the access.
   *
   * @param thing The {@link Thing} to write, or the container if the permissions are based on the
   * container.
   * @param thingType The {@link Class} that ultimately determines the permissions.
   * @return True if Write operation can be performed.
   */
  private boolean canWriteSiteDirectoryContainedThing(Thing thing, Class thingType) {
    if (!isPersonActiveAndHasRole()) {
      return false;
    }

    switch (getPersonPermission(thing, thingType)) {
      case SAME_AS_CONTAINER:
        return this.canWrite(thing.getContainer(), thing.getContainer().getClass());
      case SAME_AS_SUPERCLASS:
        return this.canWrite(thing, thingType.getSuperclass());
      case MODIFY:
        return true;
      case MODIFY_IF_PARTICIPANT:
        if (thing instanceof EngineeringModelSetup || thing
            .getContainer() instanceof EngineeringModelSetup) {
          return hasParticipantPermissionForEngineeringModelSetup(thing);
        }

        if (thing instanceof SiteReferenceDataLibrary) {
          var rdl =
              this.getSession().retrieveSiteDirectory()
                  .getModel()
                  .stream()
                  .flatMap(ems -> this.getSession().getEngineeringModelSetupRdlChain(ems).stream())
                  .collect(Collectors.toList());
          return rdl.contains(thing);
        }

        return false;
      case MODIFY_OWN_PERSON:
        return thing == this.getSession().getActivePerson();
      default:
        return false;
    }
  }

  /**
   * Returns whether a Write operation can be performed by the active user on the current {@link
   * ClassKind} based on the supplied {@link Container}. The {@link ClassKind} ultimately determines
   * the access. This method is primarily used for creation of a certain {@link SiteDirectory}
   * contained {@link Thing}.
   *
   * @param classKind The {@link ClassKind} that ultimately determines the permissions.
   * @param thing The {@link Thing} to write to.
   * @param thingType The {@link ClassKind} that determine the permission
   * @return True if Write operation can be performed.
   */
  private boolean canWriteSiteDirectoryContainedThing(ClassKind classKind, Thing thing,
      ClassKind thingType) {
    var person = this.getSession().getActivePerson();
    if (person == null) {
      return false;
    }

    var personRole = this.getSession().getActivePerson().getRole();
    if (personRole == null) {
      return false;
    }

    var permission = personRole.getPersonPermission()
        .stream()
        .filter(perm -> perm.getObjectClass() == classKind)
        .collect(MoreCollectors.toOptional())
        .orElse(null);

    // if the permission is not found or superclass derivation is used then get the default one.
    var accessRightKind = permission == null ? StaticDefaultPermissionProvider
        .getDefaultPersonPermission(thingType.name()) : permission.getAccessRight();

    switch (accessRightKind) {
      case SAME_AS_CONTAINER:
        return this.canWrite(thing.getContainer(), thing.getContainer().getClass());
      case SAME_AS_SUPERCLASS:
        return this.canWriteBasedOnSuperclassClassKind(thing, thingType);
      case MODIFY:
        return true;
      case MODIFY_IF_PARTICIPANT:
        if (thing instanceof EngineeringModelSetup) {
          var setup = Utils.as(thing, EngineeringModelSetup.class);
          return setup.getParticipant()
              .stream()
              .anyMatch(x -> x.getPerson() == this.getSession().getActivePerson());
        }

        if (thing instanceof SiteReferenceDataLibrary) {
          var rdl =
              this.getSession().retrieveSiteDirectory()
                  .getModel()
                  .stream()
                  .flatMap(ems -> this.getSession().getEngineeringModelSetupRdlChain(ems).stream())
                  .collect(Collectors.toList());
          return rdl.contains(thing);
        }
        return false;
      default:
        return false;
    }
  }

  /**
   * Resolves whether the write operation can be performed on a {@link Thing} of {@link ClassKind}
   * {@code  thingType} based on the superclass of {@code thingType}
   *
   * @param containerThing The container of the {@link Thing} that the write operation needs to be
   * performed on.
   * @param thingType The {@link ClassKind} of the {@link Thing} that will be write to.
   * @return True if the permissions of the superclass allow it.
   */
  private boolean canWriteBasedOnSuperclassClassKind(Thing containerThing, ClassKind thingType) {
    var baseType = Utils.getSuperClassNameForClassName(thingType.name());

    if (Strings.isNullOrEmpty(baseType)) {
      return false;
    }

    ClassKind superClassKind = Utils.parseTypeNameToClassKind(baseType);

    return superClassKind != null && this.canWrite(superClassKind, containerThing);
  }

  /**
   * Compute the write-permission for a {@link OwnedThing} contained in an {@link
   * EngineeringModel}.
   *
   * @param ownedThing The {@link OwnedThing} contained by an {@link EngineeringModel}.
   * @return True if write permission is granted.
   */
  private boolean canWriteIfParticipantOwned(OwnedThing ownedThing) {
    var thing = (Thing) ownedThing;

    // Check if the iteration domain is null
    if (thing.getContainer() instanceof EngineeringModel) {
      return this.getSession().getOpenIterations().entrySet()
          .stream()
          .filter(x -> x.getKey().getContainer().equals(thing.getContainer()))
          .map(Entry::getValue).count() > 0;
    }

    var participant = this.getThingParticipant(thing);

    return participant.isPresent() && participant.get().getDomain().contains(ownedThing.getOwner());
  }

  /**
   * Get the user's 'participant information for the Iteration where the thing input parameter
   * belongs to.
   *
   * @param thing General Thing for which the user's participant information is retrieved.
   * @return {@link Optional<Participant>} that contains {@link Participant} if found, otherwise
   * empty.
   */
  private Optional<Participant> getThingParticipant(Thing thing) {
    var iteration =
        thing instanceof Iteration ? (Iteration) thing : thing.getContainerOfType(Iteration.class);

    Participant participant = null;
    Pair<DomainOfExpertise, Participant> participation = this.getSession().getOpenIterations()
        .get(iteration);

    if (iteration != null
        && participation != null
        && participation.getLeft() != null
        && participation.getRight() != null) {
      participant = participation.getRight();
    }

    return Optional.ofNullable(participant);
  }
}
