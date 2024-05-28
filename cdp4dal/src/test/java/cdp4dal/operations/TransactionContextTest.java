/*
 * TransactionContextTest.java
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

package cdp4dal.operations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.sitedirectorydata.IterationSetup;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4common.types.CacheKey;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.net.URI;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransactionContextTest {

  private Cache<CacheKey, Thing> cache;
  private URI uri = URI.create("http://www.stariongroup.eu");

  private UUID siteDirectoryIid;
  private UUID engineeringModelIid;
  private UUID iterationIid;

  private SiteDirectory siteDirectory;
  private EngineeringModel engineeringModel;
  private Iteration iteration;

  @BeforeEach
  void setUp() {
    this.cache = CacheBuilder.newBuilder().build();

    this.siteDirectoryIid = UUID.fromString("7D445137-5E73-41A1-B326-983DB7A4E9A2");
    this.engineeringModelIid = UUID.fromString("BDDFB6A4-76B3-4CAC-ACAB-5540126C47B6");
    this.iterationIid = UUID.fromString("05F17A1A-1021-450F-976D-286037F04646");

    this.siteDirectory = new SiteDirectory(this.siteDirectoryIid, this.cache, this.uri);
    this.engineeringModel = new EngineeringModel(this.engineeringModelIid, this.cache, this.uri);

    this.iteration = new Iteration(this.iterationIid, this.cache, this.uri);
    IterationSetup iterationSetup = new IterationSetup(UUID.randomUUID(), this.cache, this.uri);
    iterationSetup.setRevisionNumber(1);
    this.iteration.setIterationSetup(iterationSetup);
    iterationSetup.setIterationIid(this.iteration.getIid());

    this.engineeringModel.getIteration().add(this.iteration);

    this.cache.put(new CacheKey(this.siteDirectory.getIid(), null), this.siteDirectory);
    this.cache.put(new CacheKey(this.engineeringModel.getIid(), null), this.engineeringModel);
    this.cache.put(new CacheKey(this.iteration.getIid(), null), this.iteration);
    this.cache.put(new CacheKey(iterationSetup.getIid(), null), iterationSetup);
  }

  @Test
  void verifyThatContextIsSet() {
    TransactionContext siteDirectoryTransactionContex = new TransactionContext(this.siteDirectory);
    assertEquals(this.siteDirectory, siteDirectoryTransactionContex.getContext());

    TransactionContext iterationTransactionContex = new TransactionContext(this.iteration);
    assertEquals(this.iteration, iterationTransactionContex.getContext());
  }

  @Test
  void verify_That_ContextRoute_Returns_Expected_Result_for_SiteDirectory() {
    TransactionContext siteDirectoryTransactionContext = new TransactionContext(this.siteDirectory);
    assertEquals("/SiteDirectory/7d445137-5e73-41a1-b326-983db7a4e9a2",
        siteDirectoryTransactionContext.getContextRoute());
  }

  @Test
  void verify_That_ContextRoute_Returns_Expected_Result_for_Iteration() {
    TransactionContext iterationTransactionContext = new TransactionContext(this.iteration);
    assertEquals(
        "/EngineeringModel/bddfb6a4-76b3-4cac-acab-5540126c47b6/iteration/05f17a1a-1021-450f-976d-286037f04646",
        iterationTransactionContext.getContextRoute());
  }
}
