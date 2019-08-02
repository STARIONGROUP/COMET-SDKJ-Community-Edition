/*
 * AssemblerTest.java
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

package cdp4dal;

import static cdp4common.helpers.Utils.as;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cdp4common.commondata.Alias;
import cdp4common.commondata.Citation;
import cdp4common.commondata.ClassKind;
import cdp4common.dto.Thing;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.sitedirectorydata.EngineeringModelSetup;
import cdp4common.sitedirectorydata.IterationSetup;
import cdp4common.sitedirectorydata.NumberSetKind;
import cdp4common.sitedirectorydata.ParameterType;
import cdp4common.sitedirectorydata.ReferenceDataLibrary;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import cdp4common.types.CacheKey;
import cdp4common.types.OrderedItem;
import com.google.common.collect.Lists;
import com.google.common.collect.MoreCollectors;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AssemblerTest {

  private List<Thing> testInput;
  private cdp4common.dto.SiteDirectory siteDir;
  private cdp4common.dto.SiteReferenceDataLibrary siteRdl;
  private URI uri;

  @BeforeEach
  void setUp() {
    this.uri = URI.create("http://www.rheagroup.com");

    this.testInput = new ArrayList<>();

    // Top container
    this.siteDir = new cdp4common.dto.SiteDirectory(UUID.randomUUID(), 1);

    this.siteRdl = new cdp4common.dto.SiteReferenceDataLibrary(UUID.randomUUID(), 1);
    this.siteDir.getSiteReferenceDataLibrary().add(this.siteRdl.getIid());

    var category1 = new cdp4common.dto.Category(UUID.randomUUID(), 1);
    category1.getPermissibleClass().add(ClassKind.ParameterType);
    category1.getPermissibleClass().add(ClassKind.Person);
    var category2 = new cdp4common.dto.Category(UUID.randomUUID(), 1);
    category2.getPermissibleClass().add(ClassKind.TelephoneNumber);
    category2.getPermissibleClass().add(ClassKind.EmailAddress);

    this.siteRdl.getDefinedCategory().add(category1.getIid());
    this.siteRdl.getDefinedCategory().add(category2.getIid());

    //topContainer
    var siteRDL2 = new cdp4common.dto.SiteReferenceDataLibrary(UUID.randomUUID(), 1);
    this.siteDir.getSiteReferenceDataLibrary().add(siteRDL2.getIid());

    var booleanParameterType = new cdp4common.dto.BooleanParameterType(UUID.randomUUID(), 1);
    booleanParameterType.setCategory(Lists.newArrayList(category1.getIid(), category2.getIid()));
    var definition = new cdp4common.dto.Definition(UUID.randomUUID(), 1);
    booleanParameterType.getDefinition().add(definition.getIid());

    siteRDL2.getParameterType().add(booleanParameterType.getIid());

    this.testInput.add(this.siteDir);
    this.testInput.add(this.siteRdl);
    this.testInput.add(category1);
    this.testInput.add(category2);

    this.testInput.add(definition);
    this.testInput.add(siteRDL2);
    this.testInput.add(booleanParameterType);
  }

  @AfterEach
  void tearDown() {
    this.testInput.clear();
    CDPMessageBus.getCurrent().clearSubscriptions();
  }

  @Test
  void verifyThatAssemblerThrowsNullPointerExceptionWhenUriIsNull() {
    assertThrows(NullPointerException.class, () -> new Assembler(null));
  }

  @Test
  void assertThatCacheCanStoreThings() {
    var assembler = new Assembler(this.uri);

    // Check that the cache is empty
    assertTrue(assembler.getCache().size() == 0);

    var id = UUID.randomUUID();
    var testThing = new Alias(id, assembler.getCache(), this.uri);
    testThing.getCache().put(new CacheKey(testThing.getIid(), null), testThing);

    // Check that the cache is not empty anymore
    assertTrue(assembler.getCache().size() > 0);

    // Update the thing and the cache
    testThing = new Alias(id, assembler.getCache(), this.uri);
    testThing.getCache().put(new CacheKey(testThing.getIid(), null), testThing);

    // Check that the thing retrieved from the cache has the updated value
    cdp4common.commondata.Thing updatedThing = testThing.getCache()
        .getIfPresent(new CacheKey(testThing.getIid(), null));
    assertNotNull(updatedThing);

    // Check that we can remove things from the cache
    testThing.getCache().invalidate(new CacheKey(testThing.getIid(), null));
    assertTrue(assembler.getCache().size() == 0);
    assertTrue(testThing.getCache().size() == 0);
  }

  @Test
  void assertThatAssemblerSynchronizationWorks() throws ExecutionException, InterruptedException {
    var assembler = new Assembler(this.uri);

    // 1st call of synchronize
    assembler.synchronize(this.testInput, true).get();

    // Modification of the input Dtos
    assertTrue(assembler.getCache().size() > 0);
    assertEquals(7, assembler.getCache().size());

    // check containerList Element
    var siteDirId = this.testInput.get(0).getIid();
    cdp4common.commondata.Thing siteDirThing = assembler.getCache()
        .getIfPresent(new CacheKey(siteDirId, null));
    var siteDir = as(siteDirThing, SiteDirectory.class);
    assertEquals(siteDirId, siteDir.getSiteReferenceDataLibrary().get(0).getContainer().getIid());

    // get category to removes
    var categoryToRemove = as(this.testInput.get(3), cdp4common.dto.Category.class);

    // ParameterType
    var parameterTypeId = this.testInput.get(6).getIid();
    cdp4common.commondata.Thing pt = assembler.getCache()
        .getIfPresent(new CacheKey(parameterTypeId, null));
    assertEquals(2, as(pt, ParameterType.class).getCategory().size());

    //Check that route works
    cdp4common.commondata.Thing cat = assembler.getCache()
        .getIfPresent(new CacheKey(categoryToRemove.getIid(), null));
    assertNotNull(cat.getRoute());

    var siteRdl = as(this.testInput.get(1), cdp4common.dto.SiteReferenceDataLibrary.class);
    siteRdl.getDefinedCategory().remove(categoryToRemove.getIid());

    // 2nd call with updated values, sRdl lost a category
    var newInput = this.testInput.subList(0, 3);
    assembler.synchronize(newInput, true).get();

    // checks that the removed category is no longer in the cache
    assertEquals(6, assembler.getCache().size());
    assertNull(assembler.getCache().getIfPresent(new CacheKey(categoryToRemove.getIid(), null)));
  }

  @Test
  void verifyThatAssemblerCanUpdateExistingPojo() throws ExecutionException, InterruptedException {
    var assembler = new Assembler(this.uri);
    assembler.synchronize(this.testInput, true).get();

    var siteDir = assembler.getCache()
        .asMap()
        .values()
        .stream()
        .filter(x -> x instanceof SiteDirectory)
        .filter(x -> x.getIid().equals(this.siteDir.getIid()))
        .collect(MoreCollectors.onlyElement());

    var siteRdl1 =
        assembler.getCache()
            .asMap()
            .values()
            .stream()
            .filter(x -> x instanceof SiteReferenceDataLibrary)
            .filter(x -> x.getIid().equals(this.siteRdl.getIid()))
            .collect(MoreCollectors.onlyElement());

    assembler.synchronize(Lists.newArrayList(this.siteRdl), true).get();

    var siteRdl2 =
        assembler.getCache()
            .asMap()
            .values()
            .stream()
            .filter(x -> x instanceof SiteReferenceDataLibrary)
            .filter(x -> x.getIid().equals(this.siteRdl.getIid()))
            .collect(MoreCollectors.onlyElement());

    assertEquals(siteRdl1, siteRdl2);
    assertEquals(siteDir, siteRdl2.getContainer());
  }

  @Test
  void verifyThatArgumentThrown() {
    var assembler = new Assembler(this.uri);

    assertThrows(NullPointerException.class, () -> assembler.synchronize(null, true).get());
  }

  @Test
  void verifyThatAssemblerCanMoveThings() throws ExecutionException, InterruptedException {
    var sitedir = new cdp4common.dto.SiteDirectory(UUID.randomUUID(), 0);
    var srdl1 = new cdp4common.dto.SiteReferenceDataLibrary(UUID.randomUUID(), 0);
    var srdl2 = new cdp4common.dto.SiteReferenceDataLibrary(UUID.randomUUID(), 0);
    var category = new cdp4common.dto.Category(UUID.randomUUID(), 0);

    sitedir.getSiteReferenceDataLibrary().add(srdl1.getIid());
    sitedir.getSiteReferenceDataLibrary().add(srdl2.getIid());
    srdl1.getDefinedCategory().add(category.getIid());

    List<Thing> dtos = Lists.newArrayList(
        sitedir,
        srdl1,
        srdl2,
        category
    );

    var assembler = new Assembler(this.uri);
    assembler.synchronize(dtos, true).get();

    assertEquals(4, assembler.getCache().size());

    srdl1.getDefinedCategory().clear();
    srdl2.getDefinedCategory().add(category.getIid());

    // move category
    List<Thing> movedDtos = Lists.newArrayList(
        sitedir,
        srdl1,
        srdl2
    );

    assembler.synchronize(movedDtos, true).get();
    var srdl1Pojo = (SiteReferenceDataLibrary) assembler.getCache()
        .getIfPresent(new CacheKey(srdl1.getIid(), null));
    var srdl2Pojo = (SiteReferenceDataLibrary) assembler.getCache()
        .getIfPresent(new CacheKey(srdl2.getIid(), null));
    var catPojo = assembler.getCache().getIfPresent(new CacheKey(category.getIid(), null));

    assertEquals(4, assembler.getCache().size());
    assertTrue(srdl1Pojo.getDefinedCategory().isEmpty());
    assertTrue(srdl2Pojo.getDefinedCategory().contains(catPojo));
  }

  @Test
  void verifyThatMultipleIterationCanBeSynchronized()
      throws ExecutionException, InterruptedException {
    var sitedir = new cdp4common.dto.SiteDirectory(UUID.randomUUID(), 0);
    var srdl1 = new cdp4common.dto.SiteReferenceDataLibrary(UUID.randomUUID(), 0);
    var srdl2 = new cdp4common.dto.SiteReferenceDataLibrary(UUID.randomUUID(), 0);
    var category = new cdp4common.dto.Category(UUID.randomUUID(), 0);

    var modeldto = new cdp4common.dto.EngineeringModel(UUID.randomUUID(), 1);
    var iteration1dto = new cdp4common.dto.Iteration(UUID.randomUUID(), 1);
    var iteration2dto = new cdp4common.dto.Iteration(UUID.randomUUID(), 1);

    var element1dto = new cdp4common.dto.ElementDefinition(UUID.randomUUID(), 1);
    element1dto.setIterationContainerId(iteration1dto.getIid());
    element1dto.getCategory().add(category.getIid());

    var element2dto = new cdp4common.dto.ElementDefinition(element1dto.getIid(), 1);
    element2dto.setIterationContainerId(iteration2dto.getIid());
    element2dto.getCategory().add(category.getIid());

    var usage1dto = new cdp4common.dto.ElementUsage(UUID.randomUUID(), 1);
    usage1dto.setIterationContainerId(iteration1dto.getIid());
    usage1dto.getCategory().add(category.getIid());

    var usage2dto = new cdp4common.dto.ElementUsage(usage1dto.getIid(), 1);
    usage2dto.setIterationContainerId(iteration2dto.getIid());
    usage2dto.getCategory().add(category.getIid());

    sitedir.getSiteReferenceDataLibrary().add(srdl1.getIid());
    sitedir.getSiteReferenceDataLibrary().add(srdl2.getIid());
    srdl1.getDefinedCategory().add(category.getIid());

    modeldto.getIteration().add(iteration1dto.getIid());
    modeldto.getIteration().add(iteration2dto.getIid());

    iteration1dto.getElement().add(element1dto.getIid());
    iteration2dto.getElement().add(element2dto.getIid());

    element1dto.getContainedElement().add(usage1dto.getIid());
    element2dto.getContainedElement().add(usage2dto.getIid());

    List<cdp4common.dto.Thing> dtos = Lists.newArrayList(
        sitedir,
        srdl1,
        srdl2,
        category
    );

    var assembler = new Assembler(this.uri);
    assembler.synchronize(dtos, true).get();

    dtos = Lists.newArrayList(
        modeldto,
        iteration1dto,
        iteration2dto,
        element1dto,
        element2dto,
        usage1dto,
        usage2dto
    );

    assembler.synchronize(dtos, true).get();

    assertEquals(11, assembler.getCache().size());
  }

  @Test
  void verifyThatCloseRdlWorks() throws ExecutionException, InterruptedException {
    var assembler = new Assembler(this.uri);
    // 1st call of Synchronize
    assembler.synchronize(this.testInput, true).get();

    cdp4common.commondata.Thing rdlThing = assembler.getCache()
        .getIfPresent(new CacheKey(this.siteRdl.getIid(), null));
    var rdl = (ReferenceDataLibrary) rdlThing;
    assembler.closeRdl(rdl).get();

    assertTrue(rdl.getDefinedCategory().isEmpty());
    assertEquals(5, assembler.getCache().size()); // 2 categories should have been removed
  }

  @Test
  void verifyThatCitationIsResolvedWhenRdlIsLoaded()
      throws ExecutionException, InterruptedException {
    var sitedir = new cdp4common.dto.SiteDirectory(UUID.randomUUID(), 1);
    var domain = new cdp4common.dto.DomainOfExpertise(UUID.randomUUID(), 1);
    var definition = new cdp4common.dto.Definition(UUID.randomUUID(), 1);
    var citation = new cdp4common.dto.Citation(UUID.randomUUID(), 1);

    var referenceSource = new cdp4common.dto.ReferenceSource(UUID.randomUUID(), 1);
    var srdl = new cdp4common.dto.SiteReferenceDataLibrary(UUID.randomUUID(), 1);
    srdl.getReferenceSource().add(referenceSource.getIid());

    citation.setSource(referenceSource.getIid());

    sitedir.getDomain().add(domain.getIid());
    domain.getDefinition().add(definition.getIid());
    definition.getCitation().add(citation.getIid());

    var assembler = new Assembler(this.uri);
    var input = new ArrayList<Thing>();
    input.add(sitedir);
    input.add(domain);
    input.add(definition);
    input.add(citation);

    assembler.synchronize(input, true).get();

    var citationPojo = (Citation)
        assembler.getCache()
            .asMap()
            .values()
            .stream()
            .filter(x -> x.getIid().equals(citation.getIid()))
            .collect(MoreCollectors.onlyElement());

    assertEquals(new UUID(0L, 0L), citationPojo.getSource().getIid());
    assertFalse(citationPojo.getValidationErrors().isEmpty());

    sitedir.getSiteReferenceDataLibrary().add(srdl.getIid());
    input.clear();

    input.add(sitedir);
    input.add(srdl);
    input.add(referenceSource);

    assembler.synchronize(input, true).get();
    assertNotNull(citationPojo.getSource());
  }

  @Test
  void verifyThatIterationIsDeletedWhenSetupIsDeleted()
      throws ExecutionException, InterruptedException {
    var assembler = new Assembler(this.uri);

    var model = new EngineeringModel(UUID.randomUUID(), assembler.getCache(), this.uri);
    var it1 = new Iteration(UUID.randomUUID(), assembler.getCache(), this.uri);
    var it2 = new Iteration(UUID.randomUUID(), assembler.getCache(), this.uri);
    model.getIteration().add(it1);
    model.getIteration().add(it2);

    var sitedir = new SiteDirectory(UUID.randomUUID(), assembler.getCache(), this.uri);
    var modelsetup = new EngineeringModelSetup(UUID.randomUUID(), assembler.getCache(), this.uri);
    modelsetup.setEngineeringModelIid(model.getIid());
    var iterationsetup1 = new IterationSetup(UUID.randomUUID(), assembler.getCache(), this.uri);
    iterationsetup1.setIterationIid(it1.getIid());
    var iterationsetup2 = new IterationSetup(UUID.randomUUID(), assembler.getCache(), this.uri);
    iterationsetup2.setIterationIid(it2.getIid());

    sitedir.getModel().add(modelsetup);
    modelsetup.getIterationSetup().add(iterationsetup1);
    modelsetup.getIterationSetup().add(iterationsetup2);

    assembler.getCache().put(new CacheKey(sitedir.getIid(), null), sitedir);
    assembler.getCache().put(new CacheKey(modelsetup.getIid(), null), modelsetup);
    assembler.getCache().put(new CacheKey(iterationsetup1.getIid(), null), iterationsetup1);
    assembler.getCache().put(new CacheKey(iterationsetup2.getIid(), null), iterationsetup2);
    assembler.getCache().put(new CacheKey(model.getIid(), null), model);
    assembler.getCache().put(new CacheKey(it1.getIid(), null), it1);
    assembler.getCache().put(new CacheKey(it2.getIid(), null), it2);

    var sitedirdto = new cdp4common.dto.SiteDirectory(sitedir.getIid(), 1);
    sitedirdto.getModel().add(modelsetup.getIid());

    var itdto = (cdp4common.dto.IterationSetup) iterationsetup1.toDto();
    itdto.setDeleted(true);

    assertTrue(assembler.getCache().asMap().containsKey(new CacheKey(it1.getIid(), null)));
    assembler.synchronize(Arrays.asList(sitedirdto, itdto), true).get();
    assertFalse(assembler.getCache().asMap().containsKey(new CacheKey(it1.getIid(), null)));
  }

  @Test
  void verifyThatModelIsDeletedWhenSetupIsDeleted()
      throws ExecutionException, InterruptedException {
    var assembler = new Assembler(this.uri);

    var model = new EngineeringModel(UUID.randomUUID(), assembler.getCache(), this.uri);
    var it1 = new Iteration(UUID.randomUUID(), assembler.getCache(), this.uri);
    var it2 = new Iteration(UUID.randomUUID(), assembler.getCache(), this.uri);
    model.getIteration().add(it1);
    model.getIteration().add(it2);

    var sitedir = new SiteDirectory(UUID.randomUUID(), assembler.getCache(), this.uri);
    var modelsetup = new EngineeringModelSetup(UUID.randomUUID(), assembler.getCache(), this.uri);
    modelsetup.setEngineeringModelIid(model.getIid());
    var iterationsetup1 = new IterationSetup(UUID.randomUUID(), assembler.getCache(), this.uri);
    iterationsetup1.setIterationIid(it1.getIid());
    var iterationsetup2 = new IterationSetup(UUID.randomUUID(), assembler.getCache(), this.uri);
    iterationsetup2.setIterationIid(it2.getIid());

    sitedir.getModel().add(modelsetup);
    modelsetup.getIterationSetup().add(iterationsetup1);
    modelsetup.getIterationSetup().add(iterationsetup2);

    assembler.getCache().put(new CacheKey(sitedir.getIid(), null), sitedir);
    assembler.getCache().put(new CacheKey(modelsetup.getIid(), null), modelsetup);
    assembler.getCache().put(new CacheKey(iterationsetup1.getIid(), null), iterationsetup1);
    assembler.getCache().put(new CacheKey(iterationsetup2.getIid(), null), iterationsetup2);
    assembler.getCache().put(new CacheKey(model.getIid(), null), model);
    assembler.getCache().put(new CacheKey(it1.getIid(), null), it1);
    assembler.getCache().put(new CacheKey(it2.getIid(), null), it2);

    var sitedirdto = new cdp4common.dto.SiteDirectory(sitedir.getIid(), 1);

    assertEquals(7, assembler.getCache().size());
    assembler.synchronize(Arrays.asList(sitedirdto), true).get();
    assertEquals(1, assembler.getCache().size());
  }

  @Test
  void verifyThatSynchronizationPreservesKeysOfOrderedItemList() {
    var assembler = new Assembler(this.uri);

    var simpleUnit = new cdp4common.dto.SimpleUnit(UUID.randomUUID(), 1);
    simpleUnit.setName("Unit");
    simpleUnit.setShortName("unit");
    var ratioScale = new cdp4common.dto.RatioScale(UUID.randomUUID(), 1);
    ratioScale.setName("Ration");
    ratioScale.setShortName("ratio");
    ratioScale.setNumberSet(NumberSetKind.INTEGER_NUMBER_SET);
    ratioScale.setUnit(simpleUnit.getIid());

    var simpleQuantityKind1 = new cdp4common.dto.SimpleQuantityKind(UUID.randomUUID(), 1);
    simpleQuantityKind1.setName("Kind1");
    simpleQuantityKind1.setShortName("kind1");
    simpleQuantityKind1.setSymbol("symbol");
    simpleQuantityKind1.setDefaultScale(ratioScale.getIid());
    var orderedItem1 = new OrderedItem();
    orderedItem1.setK(1);
    orderedItem1.setV(simpleQuantityKind1.getIid());

    var simpleQuantityKind2 = new cdp4common.dto.SimpleQuantityKind(UUID.randomUUID(), 1);
    simpleQuantityKind2.setName("Kind2");
    simpleQuantityKind2.setShortName("kind2");
    simpleQuantityKind2.setSymbol("symbol");
    simpleQuantityKind2.setDefaultScale(ratioScale.getIid());
    var orderedItem2 = new OrderedItem();
    orderedItem2.setK(2);
    orderedItem2.setV(simpleQuantityKind2.getIid());

    this.siteRdl.getUnit().add(simpleUnit.getIid());
    this.siteRdl.getScale().add(ratioScale.getIid());
    this.siteRdl.getBaseQuantityKind().add(orderedItem1);
    this.siteRdl.getBaseQuantityKind().add(orderedItem2);

    this.testInput.add(simpleUnit);
    this.testInput.add(ratioScale);
    this.testInput.add(simpleQuantityKind1);
    this.testInput.add(simpleQuantityKind2);

    assembler.synchronize(this.testInput, true).join();

    var siteRdl = assembler.getCache().getIfPresent(new CacheKey(this.siteRdl.getIid(), null));
    var orderedItemList = ((SiteReferenceDataLibrary) siteRdl).getBaseQuantityKind()
        .toDtoOrderedItemList();

    assertEquals(1, orderedItemList.get(0).getK());
    assertEquals(simpleQuantityKind1.getIid(), orderedItemList.get(0).getV());

    assertEquals(2, orderedItemList.get(1).getK());
    assertEquals(simpleQuantityKind2.getIid(), orderedItemList.get(1).getV());
  }

  @Test
  void verifyThatSynchronizationUpdatesKeysOfOrderedItemList() {
    var assembler = new Assembler(this.uri);

    var simpleUnit = new cdp4common.dto.SimpleUnit(UUID.randomUUID(), 1);
    simpleUnit.setName("Unit");
    simpleUnit.setShortName("unit");
    var ratioScale = new cdp4common.dto.RatioScale(UUID.randomUUID(), 1);
    ratioScale.setName("Ration");
    ratioScale.setShortName("ratio");
    ratioScale.setNumberSet(NumberSetKind.INTEGER_NUMBER_SET);
    ratioScale.setUnit(simpleUnit.getIid());

    var simpleQuantityKind1 = new cdp4common.dto.SimpleQuantityKind(UUID.randomUUID(), 1);
    simpleQuantityKind1.setName("Kind1");
    simpleQuantityKind1.setShortName("kind1");
    simpleQuantityKind1.setSymbol("symbol");
    simpleQuantityKind1.setDefaultScale(ratioScale.getIid());
    var orderedItem1 = new OrderedItem();
    orderedItem1.setK(1);
    orderedItem1.setV(simpleQuantityKind1.getIid());

    var simpleQuantityKind2 = new cdp4common.dto.SimpleQuantityKind(UUID.randomUUID(), 1);
    simpleQuantityKind2.setName("Kind2");
    simpleQuantityKind2.setShortName("kind2");
    simpleQuantityKind2.setSymbol("symbol");
    simpleQuantityKind2.setDefaultScale(ratioScale.getIid());
    var orderedItem2 = new OrderedItem();
    orderedItem2.setK(2);
    orderedItem2.setV(simpleQuantityKind2.getIid());

    this.siteRdl.getUnit().add(simpleUnit.getIid());
    this.siteRdl.getScale().add(ratioScale.getIid());
    this.siteRdl.getBaseQuantityKind().add(orderedItem1);
    this.siteRdl.getBaseQuantityKind().add(orderedItem2);

    this.testInput.add(simpleUnit);
    this.testInput.add(ratioScale);
    this.testInput.add(simpleQuantityKind1);
    this.testInput.add(simpleQuantityKind2);

    // First call
    assembler.synchronize(this.testInput, true).join();

    var siteRdl = assembler.getCache().getIfPresent(new CacheKey(this.siteRdl.getIid(), null));
    var orderedItemList = ((SiteReferenceDataLibrary) siteRdl).getBaseQuantityKind()
        .toDtoOrderedItemList();

    assertEquals(1, orderedItemList.get(0).getK());
    assertEquals(simpleQuantityKind1.getIid(), orderedItemList.get(0).getV());

    assertEquals(2, orderedItemList.get(1).getK());
    assertEquals(simpleQuantityKind2.getIid(), orderedItemList.get(1).getV());

    orderedItem1.setK(2);
    orderedItem2.setK(1);
    this.siteRdl.setRevisionNumber(2);

    // Update call
    assembler.synchronize(Collections.singletonList(this.siteRdl), true).join();

    siteRdl = assembler.getCache().getIfPresent(new CacheKey(this.siteRdl.getIid(), null));
    orderedItemList = ((SiteReferenceDataLibrary) siteRdl).getBaseQuantityKind()
        .toDtoOrderedItemList();

    assertEquals(2, orderedItemList.get(1).getK());
    assertEquals(simpleQuantityKind1.getIid(), orderedItemList.get(1).getV());

    assertEquals(1, orderedItemList.get(0).getK());
    assertEquals(simpleQuantityKind2.getIid(), orderedItemList.get(0).getV());
  }
}
