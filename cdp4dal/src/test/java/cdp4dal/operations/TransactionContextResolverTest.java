/*
 * TransactionContextResolverTest.java
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

package cdp4dal.operations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.exceptions.IncompleteModelException;
import cdp4common.reportingdata.Book;
import cdp4common.sitedirectorydata.IterationSetup;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import cdp4common.sitedirectorydata.TextParameterType;
import cdp4common.types.CacheKey;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.net.URI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransactionContextResolverTest {

  private URI uri;
  private Cache<CacheKey, Thing> cache;

  private SiteDirectory siteDirectory;
  private TextParameterType textParameterType;
  private EngineeringModel engineeringModel;
  private Iteration frozenIteration;
  private Iteration activeIteration;
  private ElementDefinition frozenElementDefinition;
  private ElementDefinition activeElementDefinition;
  private Book book;

  @BeforeEach
  void setUp() {
    this.uri = URI.create("http://www.rheagroup.com");
    this.cache = CacheBuilder.newBuilder().build();

    this.siteDirectory = new SiteDirectory(UUID.randomUUID(), this.cache, this.uri);
    var siteReferenceDataLibrary = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache,
        this.uri);
    this.siteDirectory.getSiteReferenceDataLibrary().add(siteReferenceDataLibrary);
    this.textParameterType = new TextParameterType(UUID.randomUUID(), this.cache, this.uri);
    siteReferenceDataLibrary.getParameterType().add(this.textParameterType);

    this.engineeringModel = new EngineeringModel(UUID.randomUUID(), this.cache, this.uri);
    this.engineeringModel.setRevisionNumber(2);

    var frozenIterationSetup = new IterationSetup(UUID.randomUUID(), this.cache, this.uri);
    frozenIterationSetup
        .setFrozenOn(LocalDateTime.of(LocalDate.parse("2012-12-12"), LocalTime.now()));

    this.frozenIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    this.frozenIteration.setRevisionNumber(1);
    this.frozenIteration.setIterationSetup(frozenIterationSetup);

    var activeIterationSetup = new IterationSetup(UUID.randomUUID(), this.cache, this.uri);

    this.activeIteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    this.activeIteration.setRevisionNumber(2);
    this.activeIteration.setIterationSetup(activeIterationSetup);

    this.engineeringModel.getIteration().add(this.frozenIteration);
    this.engineeringModel.getIteration().add(this.activeIteration);

    var frozenElementDefinitionIid = UUID.randomUUID();
    this.frozenElementDefinition = new ElementDefinition(frozenElementDefinitionIid, this.cache,
        this.uri);
    this.frozenElementDefinition.setRevisionNumber(1);
    this.frozenIteration.getElement().add(this.frozenElementDefinition);

    var activeElementDefinitionIid = UUID.randomUUID();
    this.activeElementDefinition = new ElementDefinition(activeElementDefinitionIid, this.cache,
        this.uri);
    this.activeElementDefinition.setRevisionNumber(2);
    this.activeIteration.getElement().add(this.activeElementDefinition);

    this.book = new Book(UUID.randomUUID(), this.cache, this.uri);
    this.engineeringModel.getBook().add(this.book);
  }

  @Test
  void verifyThatExpectedContextIsReturned() {
    TransactionContext transactionContext;

    transactionContext = TransactionContextResolver.resolveContext(this.siteDirectory);
    assertEquals(this.siteDirectory, transactionContext.getContext());

    transactionContext = TransactionContextResolver.resolveContext(this.textParameterType);
    assertEquals(this.siteDirectory, transactionContext.getContext());

    transactionContext = TransactionContextResolver.resolveContext(this.activeIteration);
    assertEquals(this.activeIteration, transactionContext.getContext());

    transactionContext = TransactionContextResolver.resolveContext(this.activeElementDefinition);
    assertEquals(this.activeIteration, transactionContext.getContext());

    transactionContext = TransactionContextResolver.resolveContext(this.frozenElementDefinition);
    assertEquals(this.frozenIteration, transactionContext.getContext());

    transactionContext = TransactionContextResolver.resolveContext(this.book);
    assertEquals(this.activeIteration, transactionContext.getContext());

    this.engineeringModel.getIteration().remove(this.activeIteration);
    transactionContext = TransactionContextResolver.resolveContext(this.book);
    assertEquals(this.frozenIteration, transactionContext.getContext());
  }

  @Test
  void verifyThatExceptionIsThrownWhenModelContainsNoIterations() {
    this.engineeringModel.getIteration().clear();

    assertThrows(IncompleteModelException.class,
        () -> TransactionContextResolver.resolveContext(this.book));
  }

  @Test
  void verifyThatContextValidates() {
    assertTrue(TransactionContextResolver
        .validateRouteContext("/SiteDirectory/47363f0d-eb6d-4a58-95f5-fa7854995650"));
    assertTrue(TransactionContextResolver.validateRouteContext(
        "/EngineeringModel/5e5dc7f8-833d-4331-b421-eb2c64fcf64b/iteration/b58ea73d-350d-4520-b9d9-a52c75ac2b5d"));

    assertFalse(TransactionContextResolver
        .validateRouteContext("SiteDirectory/47363f0d-eb6d-4a58-95f5-fa7854995650"));
    assertFalse(TransactionContextResolver.validateRouteContext(
        "EngineeringModel/5e5dc7f8-833d-4331-b421-eb2c64fcf64b/iteration/b58ea73d-350d-4520-b9d9-a52c75ac2b5d"));

    assertFalse(TransactionContextResolver
        .validateRouteContext("/SiteDirectory/47363f0d-eb6d-4a58-95f5-fa7854995650/whatever"));
    assertFalse(TransactionContextResolver.validateRouteContext(
        "/EngineeringModel/5e5dc7f8-833d-4331-b421-eb2c64fcf64b/iteration/b58ea73d-350d-4520-b9d9-a52c75ac2b5d/whatever"));
    assertFalse(TransactionContextResolver
        .validateRouteContext("/EngineeringModel/5e5dc7f8-833d-4331-b421-eb2c64fcf64b"));
  }
}
