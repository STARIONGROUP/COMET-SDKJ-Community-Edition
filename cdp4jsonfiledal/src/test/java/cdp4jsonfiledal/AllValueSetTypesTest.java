/*
 * AllValueSetTypesTest.java
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

package cdp4jsonfiledal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.NestedParameter;
import cdp4common.helpers.NestedElementTreeGenerator;
import cdp4common.types.CacheKey;
import cdp4dal.Session;
import cdp4dal.SessionImpl;
import cdp4dal.dal.Credentials;
import com.google.common.collect.MoreCollectors;
import java.net.URI;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AllValueSetTypesTest {

  private JsonFileDal dal;

  private URI uri;

  private Credentials credentials;

  private Session session;

  private NestedElementTreeGenerator nestedElementTreeGenerator;

  @BeforeEach
  void setup() {
    var path = Path.of("src/test/java/cdp4jsonfiledal/data/allvaluesettypes.zip");
    this.uri = path.toUri();

    this.credentials = new Credentials("admin", "pass", this.uri, null);

    this.dal = new JsonFileDal();

    this.session = new SessionImpl(this.dal, this.credentials);
    this.session.open().join();

    this.nestedElementTreeGenerator = new NestedElementTreeGenerator();
  }

  @Test
  void verify_that_NestedElementTree_generates_expected_ValueSets() {
    var siteDirectory = session.retrieveSiteDirectory();
    var system = siteDirectory.getDomain().stream()
        .filter(x -> x.getIid().equals(UUID.fromString("8790fe92-d1fa-42ea-9520-e0ddac52f1ad")))
        .collect(MoreCollectors.onlyElement());

    assertNotNull(siteDirectory);

    var engineeringModelSetup = siteDirectory.getModel().stream()
        .collect(MoreCollectors.onlyElement());
    var iterationSetup = engineeringModelSetup.getIterationSetup().stream()
        .collect(MoreCollectors.onlyElement());

    var engineeringModel = new EngineeringModel(engineeringModelSetup.getEngineeringModelIid(),
        engineeringModelSetup.getCache(), this.uri);
    var iteration = new Iteration(iterationSetup.getIterationIid(), iterationSetup.getCache(),
        this.uri);
    engineeringModel.getIteration().add(iteration);

    session.read(iteration, system).join();

    iteration = (Iteration) session.getAssembler().getCache()
        .getIfPresent(new CacheKey(iteration.getIid(), null));
    assertNotNull(iteration);

    var option_1 = iteration.getOption().stream()
        .filter(x -> x.getIid().equals(UUID.fromString("7476595f-e1f7-4a40-ba6f-720ce40fc0b2")))
        .collect(MoreCollectors.onlyElement());

    assertEquals("Option 1", option_1.getName());

    var option_2 = iteration.getOption().stream()
        .filter(x -> x.getIid().equals(UUID.fromString("635e84b2-64c4-4905-a71d-0d8e83757570")))
        .collect(MoreCollectors.onlyElement());
    assertEquals("Option 2", option_2.getName());

    var nestedElements = this.nestedElementTreeGenerator.generate(option_1, system, false);

    assertEquals(10, nestedElements.size());

    var nestedParameters = new ArrayList<NestedParameter>();

    for (var nestedElement : nestedElements) {
      System.out.println(nestedElement.getShortName() + " - " + nestedElement.getName());

      nestedParameters.addAll(nestedElement.getNestedParameter());
    }

    var DT_ATO = nestedElements.stream()
        .filter(x -> x.getShortName().equals("DT.ATO"))
        .collect(MoreCollectors.onlyElement());
    assertEquals(12, DT_ATO.getNestedParameter().size());
  }
}
