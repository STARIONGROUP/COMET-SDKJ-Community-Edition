/*
 * JsonFileDalMinimalContentTest.java
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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import cdp4common.commondata.ClassKind;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.EngineeringModelSetup;
import cdp4common.sitedirectorydata.IterationSetup;
import cdp4common.sitedirectorydata.ParameterType;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import cdp4dal.Session;
import cdp4dal.SessionImpl;
import cdp4dal.dal.Credentials;
import com.google.common.collect.MoreCollectors;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JsonFileDalMinimalContentTest {

  private JsonFileDal dal;
  private Credentials credentials;
  private Session session;

  @BeforeEach
  void SetUp() {
    Path path = Paths.get("src/test/java/cdp4jsonfiledal/files/minimalcontent.zip");

    this.credentials = new Credentials("admin", "pass", path.toUri(), null);
    this.dal = new JsonFileDal();
    this.session = new SessionImpl(this.dal, this.credentials);
  }

  @Test
  void verifyThatSiteDirectoryCanBeOpened() {
    this.session.open().join();
    assertEquals(62, this.session.getAssembler().getCache().size());

    List<IterationSetup> iterationSetups =
        this.session.getAssembler().getCache().asMap().values().stream()
            .filter(x -> x.getClassKind() == ClassKind.IterationSetup)
            .map(x -> (cdp4common.sitedirectorydata.IterationSetup) x)
            .collect(Collectors.toList());

    IterationSetup iterationSetupToRead =
        iterationSetups.stream()
            .filter(x -> x.getIid().equals(UUID.fromString("11111111-0c20-417a-a83f-c80fbc93e394")))
            .collect(MoreCollectors.onlyElement());

    EngineeringModelSetup engineeringModelSetup = (cdp4common.sitedirectorydata.EngineeringModelSetup) iterationSetupToRead
        .getContainer();

    List<DomainOfExpertise> domainsOfExpertise = this.session.getAssembler().getCache().asMap().values().stream()
        .filter(x -> x.getClassKind() == ClassKind.DomainOfExpertise)
        .map(x -> (cdp4common.sitedirectorydata.DomainOfExpertise) x)
        .collect(Collectors.toList());

    DomainOfExpertise domainOfExpertise = domainsOfExpertise.stream()
        .filter(x -> x.getIid().equals(UUID.fromString("8790fe92-d1fa-42ea-9520-e0ddac52f1ad")))
        .collect(MoreCollectors.onlyElement());

    EngineeringModel model = new cdp4common.engineeringmodeldata.EngineeringModel(
        engineeringModelSetup.getEngineeringModelIid(), this.session.getAssembler().getCache(),
        this.session.getCredentials().getUri());
    model.setEngineeringModelSetup(engineeringModelSetup);

    Iteration iteration = new cdp4common.engineeringmodeldata.Iteration(
        iterationSetupToRead.getIterationIid(), this.session.getAssembler().getCache(),
        this.session.getCredentials().getUri());

    model.getIteration().add(iteration);

    this.session.read(iteration, domainOfExpertise).join();

    assertEquals(93, this.session.getAssembler().getCache().size());

    SiteReferenceDataLibrary siteReferenceDataLibrary = this.session.getAssembler().getCache()
        .asMap().values().stream()
        .filter(x -> x.getClassKind() == ClassKind.SiteReferenceDataLibrary)
        .map(x -> (cdp4common.sitedirectorydata.SiteReferenceDataLibrary) x)
        .filter(x -> x.getIid().equals(UUID.fromString("bff9f871-3b7f-4e57-ac82-5ab499f9baf5")))
        .collect(MoreCollectors.onlyElement());

    assertNotNull(siteReferenceDataLibrary);

    assertFalse(siteReferenceDataLibrary.getParameterType().isEmpty());

    ParameterType simpleQuantityKind = siteReferenceDataLibrary.getParameterType().stream()
        .filter(x -> x.getIid().equals(UUID.fromString("66766f44-0a0b-4e0a-9bc7-8ae027c2da5c")))
        .collect(MoreCollectors.onlyElement());

    assertEquals("length", simpleQuantityKind.getName());
    assertEquals("l", simpleQuantityKind.getShortName());
  }
}
