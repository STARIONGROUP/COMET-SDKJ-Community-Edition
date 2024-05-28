/*
 * ValueSetOperationCreatorTest.java
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

package cdp4wspdal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import cdp4common.commondata.ClassKind;
import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.ActualFiniteState;
import cdp4common.engineeringmodeldata.ActualFiniteStateList;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.ElementUsage;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.Option;
import cdp4common.engineeringmodeldata.Parameter;
import cdp4common.engineeringmodeldata.ParameterOverride;
import cdp4common.engineeringmodeldata.ParameterSubscription;
import cdp4common.engineeringmodeldata.ParameterSubscriptionValueSet;
import cdp4common.engineeringmodeldata.ParameterValueSet;
import cdp4common.engineeringmodeldata.PossibleFiniteState;
import cdp4common.engineeringmodeldata.PossibleFiniteStateList;
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
import cdp4common.types.ValueArray;
import cdp4dal.Assembler;
import cdp4dal.Session;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import cdp4dal.operations.TransactionContext;
import cdp4dal.operations.TransactionContextResolver;
import cdp4dal.permission.PermissionService;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MoreCollectors;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValueSetOperationCreatorTest {

  private Session session;
  private PermissionService permissionService;
  private URI uri = URI.create("https://cdp4services-test.cdp4.org");
  private Assembler assembler;

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

  private ElementDefinition rootDef;
  private ElementDefinition def1;
  private ElementDefinition def2;
  private ElementUsage usage1;
  private ElementUsage usage11;
  private ElementUsage usage2;
  private ElementUsage usage21;
  private ElementUsage usage22;
  private Parameter parameter1;
  private ParameterOverride override1;
  private ParameterSubscription subscription1;

  private Map<Thing, Thing> map;

  private ElementDefinition def2Copy;
  private Parameter parameter1Copy;
  private ParameterSubscription subscriptionCopy;

  private Option option1;
  private Option option2;

  private PossibleFiniteStateList psl1;
  private PossibleFiniteState ps1;
  private ActualFiniteStateList asl1;
  private ActualFiniteState as1;

  private List<String> manual = Arrays.asList("manual");

  @BeforeEach
  void setup() {
    this.buildSiteDirData();
    this.buildModelData();

    this.map = new HashMap<>();
    this.def2Copy = new ElementDefinition(UUID.randomUUID(), null, null);
    this.parameter1Copy = new Parameter(UUID.randomUUID(), null, null);
    this.subscriptionCopy = new ParameterSubscription(UUID.randomUUID(), null, null);

    this.def2Copy.getParameter().add(this.parameter1Copy);
    this.parameter1Copy.getParameterSubscription().add(this.subscriptionCopy);

    this.map.put(this.def2, this.def2Copy);
    this.map.put(this.parameter1, this.parameter1Copy);
    this.map.put(this.subscription1, this.subscriptionCopy);
  }

  private void buildSiteDirData() {
    this.session = mock(Session.class);
    this.permissionService = mock(PermissionService.class);
    when(this.session.getPermissionService()).thenReturn(this.permissionService);

    this.assembler = new Assembler(this.uri);
    when(this.session.getAssembler()).thenReturn(this.assembler);

    this.siteDir = new SiteDirectory(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.modelsetup1 = new EngineeringModelSetup(UUID.randomUUID(), this.assembler.getCache(),
        this.uri);
    this.modelsetup2 = new EngineeringModelSetup(UUID.randomUUID(), this.assembler.getCache(),
        this.uri);
    this.iterationSetup1 = new IterationSetup(UUID.randomUUID(), this.assembler.getCache(),
        this.uri);
    this.iterationSetup2 = new IterationSetup(UUID.randomUUID(), this.assembler.getCache(),
        this.uri);
    this.person = new Person(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.participant1 = new Participant(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.participant2 = new Participant(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.domain1 = new DomainOfExpertise(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.domain2 = new DomainOfExpertise(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.domain3 = new DomainOfExpertise(UUID.randomUUID(), this.assembler.getCache(), this.uri);

    this.srdl1 = new SiteReferenceDataLibrary(UUID.randomUUID(), this.assembler.getCache(),
        this.uri);
    this.srdl2 = new SiteReferenceDataLibrary(UUID.randomUUID(), this.assembler.getCache(),
        this.uri);
    this.mrdl1 = new ModelReferenceDataLibrary(UUID.randomUUID(), this.assembler.getCache(),
        this.uri);
    this.mrdl2 = new ModelReferenceDataLibrary(UUID.randomUUID(), this.assembler.getCache(),
        this.uri);

    this.category = new Category(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.booleanPt = new BooleanParameterType(UUID.randomUUID(), this.assembler.getCache(),
        this.uri);

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
        .thenReturn(Arrays.asList(this.participant1, this.participant2));
  }

  private void buildModelData() {
    this.model1 = new EngineeringModel(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.model2 = new EngineeringModel(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.iteration1 = new Iteration(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.iteration2 = new Iteration(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.rootDef = new ElementDefinition(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.rootDef.setName("rootdef");
    this.def1 = new ElementDefinition(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.def1.setName("def1");
    this.def2 = new ElementDefinition(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.def2.setName("def2");
    this.usage1 = new ElementUsage(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.usage11 = new ElementUsage(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.usage2 = new ElementUsage(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.usage21 = new ElementUsage(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.usage22 = new ElementUsage(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.parameter1 = new Parameter(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.override1 = new ParameterOverride(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.subscription1 = new ParameterSubscription(UUID.randomUUID(), this.assembler.getCache(),
        this.uri);

    this.model1.setEngineeringModelSetup(this.modelsetup1);
    this.model2.setEngineeringModelSetup(this.modelsetup2);

    this.iteration1.setIterationSetup(this.iterationSetup1);
    this.iteration2.setIterationSetup(this.iterationSetup2);

    this.rootDef.setOwner(this.domain1);
    this.def1.setOwner(this.domain1);
    this.def2.setOwner(this.domain2);
    this.usage1.setOwner(this.domain1);
    this.usage1.setElementDefinition(this.def1);
    this.usage11.setOwner(this.domain1);
    this.usage11.setElementDefinition(this.def1);
    this.usage2.setOwner(this.domain1);
    this.usage2.setElementDefinition(this.def2);
    this.usage22.setOwner(this.domain1);
    this.usage22.setElementDefinition(this.def2);
    this.usage21.setOwner(this.domain1);
    this.usage21.setElementDefinition(this.def2);

    this.parameter1.setOwner(this.domain2);
    this.parameter1.setParameterType(this.booleanPt);
    this.parameter1.setAllowDifferentOwnerOfOverride(true);
    this.override1.setParameter(this.parameter1);
    this.override1.setOwner(this.domain2);
    this.subscription1.setOwner(this.domain1);

    this.model1.getIteration().add(this.iteration1);
    this.iteration1.getElement().add(this.def1);
    this.iteration1.getElement().add(this.def2);
    this.iteration1.getElement().add(this.rootDef);
    this.rootDef.getContainedElement().add(this.usage1);
    this.rootDef.getContainedElement().add(this.usage11);
    this.def1.getContainedElement().add(this.usage2);
    this.def1.getContainedElement().add(this.usage22);
    this.def1.getContainedElement().add(this.usage21);
    this.def2.getParameter().add(this.parameter1);
    this.usage1.getParameterOverride().add(this.override1);
    this.parameter1.getParameterSubscription().add(this.subscription1);

    this.model2.getIteration().add(this.iteration2);

    this.option1 = new Option(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.option2 = new Option(UUID.randomUUID(), this.assembler.getCache(), this.uri);

    this.psl1 = new PossibleFiniteStateList(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.ps1 = new PossibleFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.asl1 = new ActualFiniteStateList(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    this.as1 = new ActualFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);

    this.iteration1.getOption().add(this.option1);
    this.iteration1.getOption().add(this.option2);

    this.iteration1.getPossibleFiniteStateList().add(this.psl1);
    this.iteration1.getActualFiniteStateList().add(this.asl1);

    this.psl1.getPossibleState().add(this.ps1);
    this.asl1.getActualState().add(this.as1);

    this.iteration1.setDefaultOption(this.option1);
    this.psl1.setDefaultState(this.ps1);

    this.asl1.getPossibleFiniteStateList().add(this.psl1);
    this.as1.getPossibleState().add(this.ps1);
  }

  @Test
  void verifyThatCreateValueSetsUpdateOperationsWorks() {
    ParameterValueSet valueSet = new ParameterValueSet(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    valueSet.setManual(new ValueArray<>(manual, String.class));
    this.parameter1.getValueSet().add(valueSet);

    ParameterSubscriptionValueSet subscriptionvalueset = new ParameterSubscriptionValueSet(UUID.randomUUID(),
        this.assembler.getCache(), this.uri);
    subscriptionvalueset.setManual(new ValueArray<>(manual, String.class));
    this.subscription1.getValueSet().add(subscriptionvalueset);

    cdp4common.dto.Thing modelDto = this.model2.toDto();
    cdp4common.dto.Iteration iterationDto = (cdp4common.dto.Iteration) this.iteration2.toDto();
    cdp4common.dto.ElementDefinition def2Dto = new cdp4common.dto.ElementDefinition(this.def2Copy.getIid(), 2);
    cdp4common.dto.Parameter parameterDto = new cdp4common.dto.Parameter(this.parameter1Copy.getIid(), 2);
    cdp4common.dto.ParameterValueSet newValueSet = new cdp4common.dto.ParameterValueSet(UUID.randomUUID(), 2);

    cdp4common.dto.ParameterSubscription subscription = new cdp4common.dto.ParameterSubscription(this.subscriptionCopy.getIid(), 1);
    cdp4common.dto.ParameterSubscriptionValueSet subscriptionValueSet = new cdp4common.dto.ParameterSubscriptionValueSet(UUID.randomUUID(),
        1);

    iterationDto.getElement().add(def2Dto.getIid());
    def2Dto.getParameter().add(parameterDto.getIid());
    parameterDto.getValueSet().add(newValueSet.getIid());
    parameterDto.getParameterSubscription().add(subscription.getIid());
    subscription.getValueSet().add(subscriptionValueSet.getIid());

    List<cdp4common.dto.Thing> returnedDto = Arrays.asList(
        modelDto,
        iterationDto,
        def2Dto,
        parameterDto,
        newValueSet,
        subscription,
        subscriptionValueSet
    );

    TransactionContext transactionContext = TransactionContextResolver.resolveContext(this.iteration2);
    String context = transactionContext.getContextRoute();

    ValueSetOperationCreator operationCreator = new ValueSetOperationCreator(this.session);
    OperationContainer operationContainer = operationCreator
        .createValueSetsUpdateOperations(context, returnedDto, ImmutableMap.copyOf(this.map));

    assertEquals(2, operationContainer.getOperations().size());
    Operation operation = operationContainer.getOperations()
        .stream()
        .filter(x -> x.getOriginalThing().getClassKind() == ClassKind.ParameterValueSet)
        .collect(MoreCollectors.onlyElement());
    cdp4common.dto.ParameterValueSet originalPvs = (cdp4common.dto.ParameterValueSet) operation.getOriginalThing();
    cdp4common.dto.ParameterValueSet modifiedPvs = (cdp4common.dto.ParameterValueSet) operation.getModifiedThing();

    assertNotEquals(originalPvs.getManual(), modifiedPvs.getManual());
  }

  @Test
  void verifyThatCreateValueSetsUpdateOperationsWorksOptionDependent()
      {
        ParameterValueSet valueset1 = new ParameterValueSet(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    valueset1.setManual(new ValueArray<>(manual, String.class));
    this.parameter1.getValueSet().add(valueset1);
    valueset1.setActualOption(this.option1);

        ParameterValueSet valueset2 = new ParameterValueSet(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    valueset2.setManual(new ValueArray<>(String.class));
    this.parameter1.getValueSet().add(valueset2);
    valueset2.setActualOption(this.option2);

    this.parameter1.setOptionDependent(true);
    this.parameter1Copy.setOptionDependent(true);

        cdp4common.dto.Thing modeldto = this.model2.toDto();
        cdp4common.dto.Iteration iterationDto = (cdp4common.dto.Iteration) this.iteration2.toDto();
        cdp4common.dto.ElementDefinition def2Dto = new cdp4common.dto.ElementDefinition(this.def2Copy.getIid(), 2);
        cdp4common.dto.Parameter parameterDto = new cdp4common.dto.Parameter(this.parameter1Copy.getIid(), 2);
    parameterDto.setOptionDependent(true);
        cdp4common.dto.ParameterValueSet newValueSet = new cdp4common.dto.ParameterValueSet(UUID.randomUUID(), 2);

    iterationDto.getElement().add(def2Dto.getIid());
    def2Dto.getParameter().add(parameterDto.getIid());
    parameterDto.getValueSet().add(newValueSet.getIid());

        List<cdp4common.dto.Thing> returnedDto = Arrays.asList(
        modeldto,
        iterationDto,
        def2Dto,
        parameterDto,
        newValueSet
    );

        TransactionContext transactionContext = TransactionContextResolver.resolveContext(this.iteration2);
        String context = transactionContext.getContextRoute();

        ValueSetOperationCreator operationCreator = new ValueSetOperationCreator(this.session);
        OperationContainer operationContainer = operationCreator
        .createValueSetsUpdateOperations(context, returnedDto, ImmutableMap.copyOf(this.map));

        Operation operation = operationContainer.getOperations()
        .stream()
        .collect(MoreCollectors.onlyElement());
        cdp4common.dto.ParameterValueSet original = (cdp4common.dto.ParameterValueSet) operation.getOriginalThing();
        cdp4common.dto.ParameterValueSet modified = (cdp4common.dto.ParameterValueSet) operation.getModifiedThing();

    assertNotEquals(original.getManual(), modified.getManual());
  }

  @Test
  void verifyThatCreateValueSetsUpdateOperationsWorksStateDependent()
      {
        ParameterValueSet valueset1 = new ParameterValueSet(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    valueset1.setManual(new ValueArray<>(manual, String.class));
    this.parameter1.getValueSet().add(valueset1);
    valueset1.setActualState(this.as1);

    this.parameter1.setOptionDependent(true);
    this.parameter1Copy.setOptionDependent(true);
    this.parameter1.setStateDependence(this.asl1);

        cdp4common.dto.Thing modeldto = this.model2.toDto();
        cdp4common.dto.Iteration iterationDto = (cdp4common.dto.Iteration) this.iteration2.toDto();
        cdp4common.dto.ElementDefinition def2Dto = new cdp4common.dto.ElementDefinition(this.def2Copy.getIid(), 2);
        cdp4common.dto.Parameter parameterDto = new cdp4common.dto.Parameter(this.parameter1Copy.getIid(), 2);
    parameterDto.setOptionDependent(true);
        cdp4common.dto.ParameterValueSet newValueSet = new cdp4common.dto.ParameterValueSet(UUID.randomUUID(), 2);

    iterationDto.getElement().add(def2Dto.getIid());
    def2Dto.getParameter().add(parameterDto.getIid());
    parameterDto.getValueSet().add(newValueSet.getIid());

        List<cdp4common.dto.Thing> returnedDto = Arrays.asList(
        modeldto,
        iterationDto,
        def2Dto,
        parameterDto,
        newValueSet
    );

        TransactionContext transactionContext = TransactionContextResolver.resolveContext(this.iteration2);
        String context = transactionContext.getContextRoute();

        ValueSetOperationCreator operationCreator = new ValueSetOperationCreator(this.session);
        OperationContainer operationContainer = operationCreator
        .createValueSetsUpdateOperations(context, returnedDto, ImmutableMap.copyOf(this.map));

        Operation operation = operationContainer.getOperations()
        .stream()
        .collect(MoreCollectors.onlyElement());
        cdp4common.dto.ParameterValueSet original = (cdp4common.dto.ParameterValueSet) operation.getOriginalThing();
        cdp4common.dto.ParameterValueSet modified = (cdp4common.dto.ParameterValueSet) operation.getModifiedThing();

    assertNotEquals(original.getManual(), modified.getManual());
  }

  @Test
  void verifyThatCreateValueSetsUpdateOperationsWorksStateOptionDependent()
      {
        ParameterValueSet valueset1 = new ParameterValueSet(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    valueset1.setManual(new ValueArray<>(manual, String.class));
    this.parameter1.getValueSet().add(valueset1);
    valueset1.setActualOption(this.option1);
    valueset1.setActualState(this.as1);

        ParameterValueSet valueset2 = new ParameterValueSet(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    valueset2.setManual(new ValueArray<>(String.class));
    this.parameter1.getValueSet().add(valueset2);
    valueset2.setActualOption(this.option2);
    valueset2.setActualState(this.as1);

    this.parameter1.setOptionDependent(true);
    this.parameter1Copy.setOptionDependent(true);
    this.parameter1.setStateDependence(this.asl1);

        cdp4common.dto.Thing modeldto = this.model2.toDto();
        cdp4common.dto.Iteration iterationDto = (cdp4common.dto.Iteration) this.iteration2.toDto();
        cdp4common.dto.ElementDefinition def2Dto = new cdp4common.dto.ElementDefinition(this.def2Copy.getIid(), 2);
        cdp4common.dto.Parameter parameterDto = new cdp4common.dto.Parameter(this.parameter1Copy.getIid(), 2);
    parameterDto.setOptionDependent(true);
        cdp4common.dto.ParameterValueSet newValueSet = new cdp4common.dto.ParameterValueSet(UUID.randomUUID(), 2);

    iterationDto.getElement().add(def2Dto.getIid());
    def2Dto.getParameter().add(parameterDto.getIid());
    parameterDto.getValueSet().add(newValueSet.getIid());

        List<cdp4common.dto.Thing> returnedDto = Arrays.asList(
        modeldto,
        iterationDto,
        def2Dto,
        parameterDto,
        newValueSet
    );

        TransactionContext transactionContext = TransactionContextResolver.resolveContext(this.iteration2);
        String context = transactionContext.getContextRoute();

        ValueSetOperationCreator operationCreator = new ValueSetOperationCreator(this.session);
        OperationContainer operationContainer = operationCreator
        .createValueSetsUpdateOperations(context, returnedDto, ImmutableMap.copyOf(this.map));

        Operation operation = operationContainer.getOperations()
        .stream()
        .collect(MoreCollectors.onlyElement());
        cdp4common.dto.ParameterValueSet original = (cdp4common.dto.ParameterValueSet) operation.getOriginalThing();
        cdp4common.dto.ParameterValueSet modified = (cdp4common.dto.ParameterValueSet) operation.getModifiedThing();

    assertNotEquals(original.getManual(), modified.getManual());
  }

  @Test
  void verifyIllegalArgumentException() {
    ParameterValueSet valueset1 = new ParameterValueSet(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    valueset1.setManual(new ValueArray<>(manual, String.class));
    this.parameter1.getValueSet().add(valueset1);
    valueset1.setActualOption(this.option1);
    valueset1.setActualState(this.as1);

    cdp4common.dto.Thing modeldto = this.model2.toDto();
    cdp4common.dto.Iteration iterationDto = (cdp4common.dto.Iteration) this.iteration2.toDto();
    cdp4common.dto.ElementDefinition def2Dto = new cdp4common.dto.ElementDefinition(this.def2Copy.getIid(), 2);
    cdp4common.dto.Parameter parameterDto = new cdp4common.dto.Parameter(this.parameter1Copy.getIid(), 2);
    parameterDto.setOptionDependent(true);
    cdp4common.dto.ParameterValueSet newValueSet = new cdp4common.dto.ParameterValueSet(UUID.randomUUID(), 2);

    iterationDto.getElement().add(def2Dto.getIid());
    def2Dto.getParameter().add(parameterDto.getIid());
    parameterDto.getValueSet().add(newValueSet.getIid());

    List<cdp4common.dto.Thing> returnedDto = Arrays.asList(
        iterationDto,
        def2Dto,
        parameterDto,
        newValueSet
    );

    TransactionContext transactionContext = TransactionContextResolver.resolveContext(this.iteration2);
    String context = transactionContext.getContextRoute();

    ValueSetOperationCreator operationCreator = new ValueSetOperationCreator(this.session);

    assertThrows(IllegalArgumentException.class, () -> operationCreator
        .createValueSetsUpdateOperations(context, returnedDto, ImmutableMap.copyOf(this.map)));
  }
}
