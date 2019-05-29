/*
 * CopyPermissionHelperTest.java
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import cdp4common.commondata.ClassKind;
import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.ElementUsage;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.Parameter;
import cdp4common.engineeringmodeldata.ParameterOverride;
import cdp4common.engineeringmodeldata.ParameterSubscription;
import cdp4common.sitedirectorydata.BooleanParameterType;
import cdp4common.sitedirectorydata.Category;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.EngineeringModelSetup;
import cdp4common.sitedirectorydata.IterationSetup;
import cdp4common.sitedirectorydata.ModelReferenceDataLibrary;
import cdp4common.sitedirectorydata.Participant;
import cdp4common.sitedirectorydata.Person;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import cdp4common.types.CacheKey;
import cdp4dal.Session;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableMap;
import java.net.URI;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CopyPermissionHelperTest {

  private Session session;
  private PermissionService permissionService;
  private URI uri = URI.create("http://test.com");

  private SiteDirectory siteDir;
  private EngineeringModelSetup modelsetup1;
  private EngineeringModelSetup modelsetup2;
  private IterationSetup iterationSetup1;
  private IterationSetup iterationSetup2;
  private Person person;
  private Participant participant1;
  private Participant participant2;
  private DomainOfExpertise domain1;
  private DomainOfExpertise domain2;
  private DomainOfExpertise domain3;

  private SiteReferenceDataLibrary srdl1;
  private SiteReferenceDataLibrary srdl2;
  private ModelReferenceDataLibrary mrdl1;
  private ModelReferenceDataLibrary mrdl2;

  private Category category;
  private BooleanParameterType booleanPt;

  private EngineeringModel model1;
  private Iteration iteration1;
  private EngineeringModel model2;
  private Iteration iteration2;

  private ElementDefinition def1;
  private ElementDefinition def2;
  private ElementUsage usage;
  private Parameter parameter1;
  private ParameterOverride override1;
  private ParameterSubscription subscription1;

  private Cache<CacheKey, Thing> cache;

  @BeforeEach
  void setup() {
    this.buildSiteDirData();
    this.buildModelData();
  }

  private void buildSiteDirData() {
    this.cache = CacheBuilder.newBuilder().build();

    this.session = mock(Session.class);
    this.permissionService = mock(PermissionService.class);
    when(this.session.getPermissionService()).thenReturn(this.permissionService);

    this.siteDir = new SiteDirectory(UUID.randomUUID(), this.cache, this.uri);
    this.modelsetup1 = new EngineeringModelSetup(UUID.randomUUID(), this.cache, this.uri);
    this.modelsetup2 = new EngineeringModelSetup(UUID.randomUUID(), this.cache, this.uri);
    this.iterationSetup1 = new IterationSetup(UUID.randomUUID(), this.cache, this.uri);
    this.iterationSetup2 = new IterationSetup(UUID.randomUUID(), this.cache, this.uri);
    this.person = new Person(UUID.randomUUID(), this.cache, this.uri);
    this.participant1 = new Participant(UUID.randomUUID(), this.cache, this.uri);
    this.participant2 = new Participant(UUID.randomUUID(), this.cache, this.uri);
    this.domain1 = new DomainOfExpertise(UUID.randomUUID(), this.cache, this.uri);
    this.domain2 = new DomainOfExpertise(UUID.randomUUID(), this.cache, this.uri);
    this.domain3 = new DomainOfExpertise(UUID.randomUUID(), this.cache, this.uri);

    this.srdl1 = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
    this.srdl2 = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
    this.mrdl1 = new ModelReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
    this.mrdl2 = new ModelReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);

    this.category = new Category(UUID.randomUUID(), this.cache, this.uri);
    this.booleanPt = new BooleanParameterType(UUID.randomUUID(), this.cache, this.uri);

    this.srdl2.setRequiredRdl(this.srdl1);
    this.mrdl1.setRequiredRdl(this.srdl2);
    this.mrdl2.setRequiredRdl(this.srdl1);

    this.participant1.setPerson(this.person);
    this.participant2.setPerson(this.person);

    this.modelsetup1.getActiveDomain().add(this.domain1);
    this.modelsetup1.getActiveDomain().add(this.domain2);
    this.modelsetup1.getActiveDomain().add(this.domain3);
    this.modelsetup2.getActiveDomain().add(this.domain1);
    this.modelsetup2.getActiveDomain().add(this.domain2);

    this.srdl1.getParameterType().add(this.booleanPt);
    this.srdl2.getDefinedCategory().add(this.category);

    this.siteDir.getModel().add(this.modelsetup1);
    this.siteDir.getModel().add(this.modelsetup2);
    this.siteDir.getPerson().add(this.person);
    this.siteDir.getDomain().add(this.domain1);
    this.siteDir.getDomain().add(this.domain2);
    this.siteDir.getDomain().add(this.domain3);
    this.siteDir.getSiteReferenceDataLibrary().add(this.srdl1);
    this.siteDir.getSiteReferenceDataLibrary().add(this.srdl2);
    this.modelsetup1.getIterationSetup().add(this.iterationSetup1);
    this.modelsetup2.getIterationSetup().add(this.iterationSetup2);
    this.modelsetup1.getParticipant().add(this.participant1);
    this.modelsetup2.getParticipant().add(this.participant2);
    this.modelsetup1.getRequiredRdl().add(this.mrdl1);
    this.modelsetup2.getRequiredRdl().add(this.mrdl2);

    when(this.session.getActivePerson()).thenReturn(this.person);
    when(this.session.getActivePersonParticipants())
        .thenReturn(List.of(this.participant1, this.participant2));
  }

  private void buildModelData() {
    this.model1 = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    this.model2 = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    this.iteration1 = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    this.iteration2 = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    this.def1 = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
    this.def2 = new ElementDefinition(UUID.randomUUID(), this.cache, this.uri);
    this.usage = new ElementUsage(UUID.randomUUID(), this.cache, this.uri);
    this.parameter1 = new Parameter(UUID.randomUUID(), this.cache, this.uri);
    this.override1 = new ParameterOverride(UUID.randomUUID(), this.cache, this.uri);
    this.subscription1 = new ParameterSubscription(UUID.randomUUID(), this.cache, this.uri);

    this.model1.setEngineeringModelSetup(this.modelsetup1);
    this.model2.setEngineeringModelSetup(this.modelsetup2);

    this.iteration1.setIterationSetup(this.iterationSetup1);
    this.iteration2.setIterationSetup(this.iterationSetup2);

    this.def1.setOwner(this.domain1);
    this.def2.setOwner(this.domain2);
    this.usage.setOwner(this.domain1);
    this.usage.setElementDefinition(this.def2);
    this.parameter1.setOwner(this.domain2);
    this.parameter1.setParameterType(this.booleanPt);
    this.parameter1.setAllowDifferentOwnerOfOverride(true);
    this.override1.setParameter(this.parameter1);
    this.override1.setOwner(this.domain2);
    this.subscription1.setOwner(this.domain1);

    this.model1.getIteration().add(this.iteration1);
    this.iteration1.getElement().add(this.def1);
    this.iteration1.getElement().add(this.def2);
    this.def1.getContainedElement().add(this.usage);
    this.def2.getParameter().add(this.parameter1);
    this.usage.getParameterOverride().add(this.override1);
    this.override1.getParameterSubscription().add(this.subscription1);

    this.model2.getIteration().add(this.iteration2);
  }

  @Test
  void verifyThatCanCopyAll() {
    when(this.permissionService.canWrite(any(ClassKind.class), any(Thing.class))).thenReturn(true);
    when(this.session.getOpenIterations()).thenReturn(ImmutableMap.of(this.iteration2, Pair
        .of(this.domain1, null)));

    var copy = this.def1.clone(false);
    var target = this.iteration2.clone(false);

    var helper = new CopyPermissionHelper(this.session, false);
    var canCopyRes = helper.computeCopyPermission(copy, target);

    assertEquals(0, canCopyRes.getErrors().size());
    assertEquals(6, canCopyRes.getCopyableThings().size());
  }

  @Test
  void verifyThatComputationWorksIfPermissionDenied() {
    when(this.permissionService.canWrite(argThat(
        x -> x == ClassKind.ELEMENT_DEFINITION || x == ClassKind.ELEMENT_USAGE
            || x == ClassKind.PARAMETER || x == ClassKind.PARAMETER_SUBSCRIPTION),
        any(Thing.class))).thenReturn(true);
    when(this.session.getOpenIterations()).thenReturn(ImmutableMap.of(this.iteration2, Pair
        .of(this.domain1, null)));

    var copy = this.def1.clone(false);
    var target = this.iteration2.clone(false);

    var helper = new CopyPermissionHelper(this.session, false);
    var canCopyRes = helper.computeCopyPermission(copy, target);

    assertEquals(1, canCopyRes.getErrors().size());
    assertEquals(4, canCopyRes.getCopyableThings().size());
  }

  @Test
  void verifyThatComputationWorksIfMissingRdls() {
    this.def2.getCategory().add(this.category);
    when(this.permissionService.canWrite(any(ClassKind.class), any(Thing.class))).thenReturn(true);
    when(this.session.getOpenIterations()).thenReturn(ImmutableMap.of(this.iteration2, Pair
        .of(this.domain1, null)));
    var copy = this.def1.clone(false);
    var target = this.iteration2.clone(false);

    var helper = new CopyPermissionHelper(this.session, false);
    var canCopyRes = helper.computeCopyPermission(copy, target);

    // element def for usage cant be copied - missing rdl
    // usage cant be copied as element def cannot
    assertEquals(2, canCopyRes.getErrors().size());
    assertEquals(1, canCopyRes.getCopyableThings().size());
  }

  @Test
  void verifyThatComputationWorksWithNonActiveDomain() {
    this.subscription1.setOwner(this.domain3);
    when(this.permissionService.canWrite(any(ClassKind.class), any(Thing.class))).thenReturn(true);
    when(this.session.getOpenIterations()).thenReturn(ImmutableMap.of(this.iteration2, Pair
        .of(this.domain1, null)));

    var copy = this.def1.clone(false);
    var target = this.iteration2.clone(false);

    var helper = new CopyPermissionHelper(this.session, false);
    var canCopyRes = helper.computeCopyPermission(copy, target);

    // subscription cant be copied
    assertEquals(1, canCopyRes.getErrors().size());
    assertEquals(5, canCopyRes.getCopyableThings().size());
  }

  @Test
  void verifyException1() {
    assertThrows(NullPointerException.class, () ->
        new CopyPermissionHelper(null, false)
    );
  }

  @Test
  void verifyException2() {
    var helper = new CopyPermissionHelper(this.session, false);
    var target = this.iteration2.clone(false);

    assertThrows(NullPointerException.class, () ->

        helper.computeCopyPermission(null, target)
    );
  }

  @Test
  void verifyException3() {
    var helper = new CopyPermissionHelper(this.session, false);
    var copy = this.def1.clone(false);

    assertThrows(NullPointerException.class, () ->

        helper.computeCopyPermission(copy, null)
    );
  }

  @Test
  void verifyException4() {
    when(this.session.getOpenIterations()).thenReturn(ImmutableMap.of(this.iteration2, Pair
        .of(this.domain1, null)));

    var helper = new CopyPermissionHelper(this.session, false);
    var copy = this.def1.clone(false);
    var target = this.model2.clone(false);

    assertThrows(IllegalArgumentException.class, () ->
        helper.computeCopyPermission(copy, target)
    );
  }

  @Test
  void verifyException5() {
    when(this.session.getOpenIterations()).thenReturn(ImmutableMap.of(this.iteration2, Pair
        .of(this.domain1, null)));

    var helper = new CopyPermissionHelper(this.session, false);
    var copy = this.def1.clone(false);
    var target = this.iteration1.clone(false);

    assertThrows(NoSuchElementException.class, () ->
        helper.computeCopyPermission(copy, target)
    );
  }
}
