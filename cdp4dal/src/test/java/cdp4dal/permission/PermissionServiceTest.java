/*
 * PermissionServiceTest.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import cdp4common.commondata.ClassKind;
import cdp4common.commondata.Definition;
import cdp4common.commondata.ParticipantAccessRightKind;
import cdp4common.commondata.PersonAccessRightKind;
import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.BinaryRelationship;
import cdp4common.engineeringmodeldata.CommonFileStore;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.Parameter;
import cdp4common.engineeringmodeldata.ParameterValueSet;
import cdp4common.engineeringmodeldata.Requirement;
import cdp4common.engineeringmodeldata.RequirementsSpecification;
import cdp4common.exceptions.IncompleteModelException;
import cdp4common.sitedirectorydata.BooleanParameterType;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.EngineeringModelSetup;
import cdp4common.sitedirectorydata.IterationSetup;
import cdp4common.sitedirectorydata.Participant;
import cdp4common.sitedirectorydata.ParticipantPermission;
import cdp4common.sitedirectorydata.ParticipantRole;
import cdp4common.sitedirectorydata.Person;
import cdp4common.sitedirectorydata.PersonPermission;
import cdp4common.sitedirectorydata.PersonRole;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import cdp4common.types.CacheKey;
import cdp4dal.Assembler;
import cdp4dal.Session;
import cdp4dal.dal.Dal;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MoreCollectors;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PermissionServiceTest {

  private Session session;
  private Assembler assembler;
  private SiteDirectory sitedir;
  private EngineeringModelSetup modelsetup;
  private IterationSetup iterationSetup;
  private cdp4common.sitedirectorydata.Person person;
  private Person person2;
  private DomainOfExpertise domain1;
  private DomainOfExpertise domain2;
  private PersonRole personRole;
  private Participant participant;
  private ParticipantRole participantRole;
  private EngineeringModel model;
  private Iteration iteration;
  private URI uri = URI.create("http://www.stariongroup.eu");
  private Definition definition;
  private SiteReferenceDataLibrary srdl;
  private BooleanParameterType booleanpt;
  private ElementDefinition elementDef;
  private BinaryRelationship relationship;
  private Parameter parameter;
  private ParameterValueSet valueset;
  private Requirement requirement;
  private RequirementsSpecification requirementsSpecification;

  private PermissionService permissionService;
  private CommonFileStore commonFileStore;
  private Cache<CacheKey, Thing> cache;

  @BeforeEach
  void setup() {
    this.cache = CacheBuilder.newBuilder().build();

    this.session = mock(Session.class);

    Dal dal = mock(Dal.class);
    when(dal.isReadOnly()).thenReturn(false);
    when(session.getDal()).thenReturn(dal);

    this.sitedir = new SiteDirectory(UUID.randomUUID(), this.cache, this.uri);
    this.modelsetup = new EngineeringModelSetup(UUID.randomUUID(), this.cache, this.uri);
    this.iterationSetup = new IterationSetup(UUID.randomUUID(), this.cache, this.uri);
    this.person = new Person(UUID.randomUUID(), this.cache, this.uri);
    this.domain1 = new DomainOfExpertise(UUID.randomUUID(), this.cache, this.uri);
    this.domain2 = new DomainOfExpertise(UUID.randomUUID(), this.cache, this.uri);
    this.personRole = new PersonRole(UUID.randomUUID(), this.cache, this.uri);
    this.participant = new Participant(UUID.randomUUID(), this.cache, this.uri);
    this.participantRole = new ParticipantRole(UUID.randomUUID(), this.cache, this.uri);
    this.model = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    this.model.setEngineeringModelSetup(this.modelsetup);
    this.iteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    this.iteration.setIterationSetup(this.iterationSetup);
    this.definition = new Definition(UUID.randomUUID(), this.cache, this.uri);
    this.srdl = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
    this.booleanpt = new BooleanParameterType(UUID.randomUUID(), this.cache, this.uri);
    this.person2 = new Person(UUID.randomUUID(), this.cache, this.uri);
    this.elementDef = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
    this.relationship = new BinaryRelationship(UUID.randomUUID(), this.cache, this.uri);
    this.parameter = new Parameter(UUID.randomUUID(), this.cache, this.uri);
    this.valueset = new ParameterValueSet(UUID.randomUUID(), this.cache, this.uri);

    this.requirementsSpecification = new RequirementsSpecification(UUID.randomUUID(), this.cache,
        this.uri);
    this.requirement = new Requirement(UUID.randomUUID(), this.cache, this.uri);
    this.commonFileStore = new CommonFileStore(UUID.randomUUID(), this.cache, this.uri);

    this.sitedir.getModel().add(this.modelsetup);
    this.sitedir.getPerson().add(this.person);
    this.sitedir.getPerson().add(this.person2);
    this.sitedir.getPersonRole().add(this.personRole);
    this.sitedir.getDomain().add(this.domain1);
    this.sitedir.getDomain().add(this.domain2);
    this.modelsetup.getIterationSetup().add(this.iterationSetup);
    this.modelsetup.getParticipant().add(this.participant);
    this.sitedir.getParticipantRole().add(this.participantRole);
    this.model.getIteration().add(this.iteration);
    this.person.setRole(this.personRole);
    this.participant.setPerson(this.person);
    this.participant.setRole(this.participantRole);
    this.participant.getDomain().add(this.domain1);
    this.modelsetup.getDefinition().add(this.definition);
    this.sitedir.getSiteReferenceDataLibrary().add(this.srdl);
    this.srdl.getParameterType().add(this.booleanpt);
    this.iteration.getElement().add(this.elementDef);
    this.iteration.getRelationship().add(this.relationship);
    this.elementDef.getParameter().add(this.parameter);
    this.parameter.getValueSet().add(this.valueset);

    this.modelsetup.setEngineeringModelIid(this.model.getIid());
    this.iterationSetup.setIterationIid(this.iteration.getIid());
    this.elementDef.setOwner(this.domain1);
    this.relationship.setOwner(this.domain1);
    this.parameter.setOwner(this.domain1);
    this.requirementsSpecification.getRequirement().add(this.requirement);
    this.iteration.getRequirementsSpecification().add(this.requirementsSpecification);
    this.model.getCommonFileStore().add(this.commonFileStore);

    when(this.session.getActivePerson()).thenReturn(this.person);
    when(this.session.getOpenIterations()).thenReturn(ImmutableMap.of(this.iteration, Pair
        .of(this.domain1, this.participant)));

    this.permissionService = new PermissionServiceImpl(this.session);
  }

  @Test
  void testCanWriteFalseWithDefaultPermission() {
    assertFalse(this.permissionService.canWrite(this.sitedir));
    assertFalse(this.permissionService.canWrite(this.modelsetup));
    assertFalse(this.permissionService.canWrite(this.iterationSetup));
    assertFalse(this.permissionService.canWrite(this.person));
    assertFalse(this.permissionService.canWrite(this.participant));
    assertFalse(this.permissionService.canWrite(ClassKind.Person, this.sitedir));

    assertFalse(this.permissionService.canWrite(this.model));
    assertFalse(this.permissionService.canWrite(this.iteration));

    assertFalse(this.permissionService.canRead(this.sitedir));
    assertFalse(this.permissionService.canRead(this.modelsetup));
    assertFalse(this.permissionService.canRead(this.iterationSetup));
    assertFalse(this.permissionService.canRead(this.person));
    assertFalse(this.permissionService.canRead(this.participant));

    assertFalse(this.permissionService.canRead(this.model));
    assertFalse(this.permissionService.canRead(this.iteration));
  }

  @Test
  void verifyThatPersonPermissionReadModifyWorks() {
    PersonPermission sdPermission = this.personRole.getPersonPermission()
        .stream()
        .filter(x -> x.getObjectClass() == ClassKind.SiteDirectory)
        .collect(MoreCollectors.onlyElement());
    sdPermission.setAccessRight(PersonAccessRightKind.READ);

    assertFalse(this.permissionService.canWrite(this.sitedir));
    assertFalse(this.permissionService.canWrite(this.modelsetup));
    assertFalse(this.permissionService.canWrite(this.iterationSetup));
    assertFalse(this.permissionService.canWrite(this.person));
    assertFalse(this.permissionService.canWrite(this.definition));

    assertTrue(this.permissionService.canRead(this.sitedir));
    assertFalse(this.permissionService.canRead(this.person));
    assertFalse(this.permissionService.canRead(this.definition));

    sdPermission.setAccessRight(PersonAccessRightKind.MODIFY);
    assertTrue(this.permissionService.canWrite(this.sitedir));
    assertFalse(this.permissionService.canWrite(this.modelsetup));
    assertTrue(this.permissionService.canRead(this.sitedir));
    assertFalse(this.permissionService.canRead(this.person));
    assertFalse(this.permissionService.canWrite(ClassKind.EngineeringModel, this.sitedir));
    assertFalse(this.permissionService.canWrite(this.definition));
    assertFalse(this.permissionService.canRead(this.definition));
  }

  @Test
  void verifyThatSameAsContainerPermissionWorks() {
    PersonPermission sdPermission = this.personRole.getPersonPermission()
        .stream()
        .filter(x -> x.getObjectClass() == ClassKind.EngineeringModelSetup)
        .collect(MoreCollectors.onlyElement());
    sdPermission.setAccessRight(PersonAccessRightKind.READ);

    assertTrue(this.permissionService.canRead(this.modelsetup));
    assertTrue(this.permissionService.canRead(this.definition));
    assertFalse(this.permissionService.canWrite(this.definition));

    sdPermission.setAccessRight(PersonAccessRightKind.MODIFY);
    assertTrue(this.permissionService.canRead(this.definition));
    assertTrue(this.permissionService.canWrite(this.definition));
  }

  @Test
  void verifyThatSameAsSuperclassPermissionWorks() {
    assertFalse(this.permissionService.canRead(this.booleanpt));
    assertFalse(this.permissionService.canWrite(this.booleanpt));

    PersonPermission permission = this.personRole.getPersonPermission()
        .stream()
        .filter(x -> x.getObjectClass() == ClassKind.SiteReferenceDataLibrary)
        .collect(MoreCollectors.onlyElement());

    permission.setAccessRight(PersonAccessRightKind.READ);
    assertTrue(this.permissionService.canRead(this.booleanpt));
    assertFalse(this.permissionService.canWrite(this.booleanpt));
    assertFalse(this.permissionService.canWrite(ClassKind.BooleanParameterType, this.srdl));

    permission.setAccessRight(PersonAccessRightKind.MODIFY);
    assertTrue(this.permissionService.canRead(this.booleanpt));
    assertTrue(this.permissionService.canWrite(this.booleanpt));
    assertFalse(this.permissionService.canWrite(ClassKind.BooleanParameterType, this.srdl));
  }

  @Test
  void verifyThatModifyIfOwnPersonPermissionWork() {
    assertFalse(this.permissionService.canRead(this.person));
    assertFalse(this.permissionService.canWrite(this.person));
    assertFalse(this.permissionService.canRead(this.person2));
    assertFalse(this.permissionService.canWrite(this.person2));

    PersonPermission permission = this.personRole.getPersonPermission()
        .stream()
        .filter(x -> x.getObjectClass() == ClassKind.Person)
        .collect(MoreCollectors.onlyElement());

    permission.setAccessRight(PersonAccessRightKind.MODIFY_OWN_PERSON);

    assertTrue(this.permissionService.canRead(this.person));
    assertTrue(this.permissionService.canWrite(this.person));

    assertFalse(this.permissionService.canRead(this.person2));
    assertFalse(this.permissionService.canWrite(this.person2));

    PersonPermission sdpermission = this.personRole.getPersonPermission()
        .stream()
        .filter(x -> x.getObjectClass() == ClassKind.SiteDirectory)
        .collect(MoreCollectors.onlyElement());

    sdpermission.setAccessRight(PersonAccessRightKind.MODIFY_OWN_PERSON);
    assertFalse(this.permissionService.canRead(this.sitedir));
    assertFalse(this.permissionService.canWrite(this.sitedir));

    assertTrue(this.permissionService.canRead(this.person));
    assertTrue(this.permissionService.canWrite(this.person));
  }

  @Test
  void verifyThatReadWriteIfParticipantWorks() {
    when(this.session.getActivePersonParticipants())
        .thenReturn(Arrays.asList(this.participant));

    PersonPermission sdpermission = this.personRole.getPersonPermission()
        .stream()
        .filter(x -> x.getObjectClass() == ClassKind.SiteDirectory)
        .collect(MoreCollectors.onlyElement());

    sdpermission.setAccessRight(PersonAccessRightKind.READ_IF_PARTICIPANT);

    PersonPermission permission = this.personRole.getPersonPermission()
        .stream()
        .filter(x -> x.getObjectClass() == ClassKind.EngineeringModelSetup)
        .collect(MoreCollectors.onlyElement());

    permission.setAccessRight(PersonAccessRightKind.READ_IF_PARTICIPANT);

    assertFalse(this.permissionService.canRead(this.sitedir));
    assertFalse(this.permissionService.canWrite(this.sitedir));

    assertTrue(this.permissionService.canRead(this.modelsetup));
    assertFalse(this.permissionService.canWrite(this.modelsetup));

    sdpermission.setAccessRight(PersonAccessRightKind.MODIFY_IF_PARTICIPANT);
    permission.setAccessRight(PersonAccessRightKind.MODIFY_IF_PARTICIPANT);
    assertFalse(this.permissionService.canRead(this.sitedir));
    assertFalse(this.permissionService.canWrite(this.sitedir));

    assertTrue(this.permissionService.canRead(this.modelsetup));
    assertTrue(this.permissionService.canWrite(this.modelsetup));
  }

  @Test
  void verifyReadWriteParticipantPermission() {
    when(this.session.getActivePersonParticipants())
        .thenReturn(Arrays.asList(this.participant));
    assertFalse(this.permissionService.canWrite(this.model));
    assertFalse(this.permissionService.canRead(this.model));

    ParticipantPermission permission = this.participantRole.getParticipantPermission()
        .stream()
        .filter(x -> x.getObjectClass() == ClassKind.EngineeringModel)
        .collect(MoreCollectors.onlyElement());

    permission.setAccessRight(ParticipantAccessRightKind.MODIFY);
    assertTrue(this.permissionService.canRead(this.model));
    assertTrue(this.permissionService.canWrite(this.model));
  }

  @Test
  void verifyModifyIfOwnerForIterationsWithoutDomainOfExpertiseAndParticipant() {
    when(this.session.getActivePersonParticipants())
        .thenReturn(Arrays.asList(this.participant));
    assertFalse(this.permissionService.canWrite(this.model));
    assertFalse(this.permissionService.canRead(this.model));

    ParticipantPermission permission =
        this.participantRole.getParticipantPermission()
            .stream()
            .filter(x -> x.getObjectClass() == ClassKind.EngineeringModel)
            .collect(MoreCollectors.onlyElement());
    ParticipantPermission defpermission =
        this.participantRole.getParticipantPermission()
            .stream()
            .filter(x -> x.getObjectClass() == ClassKind.ElementDefinition)
            .collect(MoreCollectors.onlyElement());

    permission.setAccessRight(ParticipantAccessRightKind.MODIFY_IF_OWNER);
    defpermission.setAccessRight(ParticipantAccessRightKind.MODIFY_IF_OWNER);

    assertTrue(this.permissionService.canRead(this.model));
    assertFalse(this.permissionService.canWrite(this.model));

    assertTrue(this.permissionService.canWrite(this.elementDef));
    assertTrue(this.permissionService.canRead(this.elementDef));

    when(this.session.getOpenIterations()).thenReturn(ImmutableMap.of(this.iteration, Pair
        .of(null, null)));

    assertFalse(this.permissionService.canWrite(this.elementDef));
    assertTrue(this.permissionService.canRead(this.elementDef));
  }

  @Test
  void verifyModifyIfOwnerForRequirement() {
    when(this.session.getActivePersonParticipants()).thenReturn(Arrays.asList(this.participant));
    assertFalse(this.permissionService.canWrite(this.model));
    assertFalse(this.permissionService.canRead(this.model));

    ParticipantPermission permission =
        this.participantRole.getParticipantPermission().stream()
            .filter(x -> x.getObjectClass() == ClassKind.Requirement)
            .collect(MoreCollectors.onlyElement());

    ParticipantPermission specPermission =
        this.participantRole.getParticipantPermission().stream()
            .filter(x -> x.getObjectClass() == ClassKind.RequirementsSpecification)
            .collect(MoreCollectors.onlyElement());

    permission.setAccessRight(ParticipantAccessRightKind.MODIFY_IF_OWNER);
    specPermission.setAccessRight(ParticipantAccessRightKind.MODIFY);

    // Requirement has no owner
    assertThrows(IncompleteModelException.class,
        () -> this.permissionService.canWrite(this.requirement));
    assertThrows(IncompleteModelException.class,
        () -> this.permissionService.canRead(this.requirement));

    // RequirementsSpecification has no owner
    assertThrows(IncompleteModelException.class,
        () -> this.permissionService.canWrite(this.requirementsSpecification));
    assertThrows(IncompleteModelException.class,
        () -> this.permissionService.canRead(this.requirementsSpecification));

    // Requirement has same owner as user's domain of expertise
    this.requirement.setOwner(this.domain1);
    assertTrue(this.permissionService.canWrite(this.requirement));
    assertTrue(this.permissionService.canRead(this.requirement));

    // Requirement has other owner than user's domain of expertise
    this.requirement.setOwner(this.domain2);
    assertFalse(this.permissionService.canWrite(this.requirement));
    assertTrue(this.permissionService.canRead(this.requirement));

    // RequirementsSpecification has same owner as user's domain of expertise
    this.requirementsSpecification.setOwner(this.domain1);
    specPermission.setAccessRight(ParticipantAccessRightKind.MODIFY_IF_OWNER);
    assertTrue(this.permissionService.canWrite(this.requirementsSpecification));
    assertTrue(this.permissionService.canRead(this.requirementsSpecification));

    // RequirementsSpecification has other owner than user's domain of expertise
    this.requirementsSpecification.setOwner(this.domain2);
    assertFalse(this.permissionService.canWrite(this.requirementsSpecification));
    assertTrue(this.permissionService.canRead(this.requirementsSpecification));
  }

  @Test
  void verifyModifyIfOwnerForThingsThatAreDirectlyUnderEngineeringModel() {
    when(this.session.getActivePersonParticipants()).thenReturn(Arrays.asList(this.participant));
    assertFalse(this.permissionService.canWrite(this.model));
    assertFalse(this.permissionService.canRead(this.model));

    ParticipantPermission permission =
        this.participantRole.getParticipantPermission().stream()
            .filter(x -> x.getObjectClass() == ClassKind.CommonFileStore)
            .collect(MoreCollectors.onlyElement());

    permission.setAccessRight(ParticipantAccessRightKind.MODIFY_IF_OWNER);

    // Thing has no owner
    assertThrows(IncompleteModelException.class,
        () -> this.permissionService.canWrite(this.commonFileStore));
    assertThrows(IncompleteModelException.class,
        () -> this.permissionService.canRead(this.commonFileStore));

    // Thing has same owner as User's participant
    this.commonFileStore.setOwner(this.domain1);
    assertTrue(this.permissionService.canWrite(this.commonFileStore));
    assertTrue(this.permissionService.canRead(this.commonFileStore));

    // Thing has other owner as User's participant
    this.commonFileStore.setOwner(this.domain2);
    assertTrue(this.permissionService.canWrite(this.commonFileStore));
    assertTrue(this.permissionService.canRead(this.commonFileStore));
  }

  @Test
  void verifySameAsSuperclassParticipantPermission() {
    when(this.session.getActivePersonParticipants())
        .thenReturn(Arrays.asList(this.participant));
    assertFalse(this.permissionService.canWrite(this.relationship));
    assertFalse(this.permissionService.canRead(this.relationship));

    ParticipantPermission permission = this.participantRole.getParticipantPermission()
        .stream()
        .filter(x -> x.getObjectClass() == ClassKind.Relationship)
        .collect(MoreCollectors.onlyElement());

    permission.setAccessRight(ParticipantAccessRightKind.MODIFY);

    assertTrue(this.permissionService.canWrite(this.relationship));
    assertTrue(this.permissionService.canRead(this.relationship));
  }

  @Test
  void verifySameAsContainerParticipantPermission() {
    when(this.session.getActivePersonParticipants())
        .thenReturn(Arrays.asList(this.participant));
    assertFalse(this.permissionService.canWrite(this.valueset));
    assertFalse(this.permissionService.canRead(this.valueset));

    ParticipantPermission permission = this.participantRole.getParticipantPermission()
        .stream()
        .filter(x -> x.getObjectClass() == ClassKind.Parameter)
        .collect(MoreCollectors.onlyElement());

    permission.setAccessRight(ParticipantAccessRightKind.MODIFY);
    assertTrue(this.permissionService.canWrite(this.valueset));
    assertTrue(this.permissionService.canRead(this.valueset));
  }

  @Test
  void verifyCanWriteReturnsFalseWithFrozenIterationSetup() {
    when(this.session.getActivePersonParticipants())
        .thenReturn(Arrays.asList(this.participant));
    ParticipantPermission permission = this.participantRole.getParticipantPermission()
        .stream()
        .filter(x -> x.getObjectClass() == ClassKind.ElementDefinition)
        .collect(MoreCollectors.onlyElement());

    permission.setAccessRight(ParticipantAccessRightKind.MODIFY);
    permission = this.participantRole.getParticipantPermission()
        .stream()
        .filter(x -> x.getObjectClass() == ClassKind.Iteration)
        .collect(MoreCollectors.onlyElement());

    permission.setAccessRight(ParticipantAccessRightKind.MODIFY);

    assertNull(this.iterationSetup.getFrozenOn());
    assertTrue(this.permissionService.canWrite(this.elementDef));
    assertTrue(this.permissionService.canWrite(this.iteration));
    assertTrue(this.permissionService.canWrite(ClassKind.ElementDefinition, this.iteration));

    this.iterationSetup.setFrozenOn(OffsetDateTime.now());
    assertNotNull(this.iterationSetup.getFrozenOn());
    assertFalse(this.permissionService.canWrite(this.elementDef));
    assertFalse(this.permissionService.canWrite(this.iteration));
    assertFalse(this.permissionService.canWrite(ClassKind.ElementDefinition, this.iteration));
  }
}
