/*
 * JsonFileDalTest.java
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
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import cdp4common.commondata.ClassKind;
import cdp4common.commondata.Thing;
import cdp4common.dto.Alias;
import cdp4common.dto.EngineeringModelSetup;
import cdp4common.dto.Iteration;
import cdp4common.dto.IterationSetup;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.ModelReferenceDataLibrary;
import cdp4common.sitedirectorydata.Participant;
import cdp4common.sitedirectorydata.Person;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4common.types.CacheKey;
import cdp4dal.Session;
import cdp4dal.dal.Credentials;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import cdp4dal.operations.OperationKind;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.MoreCollectors;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class JsonFileDalTest {

  private JsonFileDal dal;
  private Credentials credentials;
  private AtomicBoolean cancelled;
  private Session session;
  private SiteDirectory siteDirectoryData;

  @BeforeEach
  void setup() {
    Path path = Paths.get("src/test/java/cdp4jsonfiledal/files/LOFT_ECSS-E-TM-10-25_AnnexC.zip");
    this.cancelled = new AtomicBoolean();

    this.credentials = new Credentials("admin", "pass", path.toUri(), null);
    this.session = mock(Session.class);
    this.dal = new JsonFileDal();
    this.dal.setSession(this.session);

    this.siteDirectoryData = new SiteDirectory();
    this.siteDirectoryData.setIid(UUID.fromString("00000000-0000-0000-0000-000000000000"));
    when(this.session.retrieveSiteDirectory()).thenReturn(this.siteDirectoryData);
    when(this.session.getCredentials()).thenReturn(this.credentials);
  }

  @AfterEach
  void tearDown() {
    this.credentials = null;
    this.dal = null;
  }

  @Test
  void verifyCacheIsPresentOnOperationThing() {
    EngineeringModel container = new EngineeringModel();
    container.setIid(UUID.randomUUID());
    cdp4common.engineeringmodeldata.Iteration iterationPojo = new cdp4common.engineeringmodeldata.Iteration();
    iterationPojo.setIid(UUID.randomUUID());
    iterationPojo.setContainer(container);
    iterationPojo.setCache(CacheBuilder.newBuilder().build());
    cdp4common.dto.Thing iterationDto = iterationPojo.toDto();

    assertNotNull(iterationDto.querySourceThing());

    Operation operation = new Operation(iterationDto, iterationDto, OperationKind.CREATE);
    assertNotNull(JsonFileDal.getAssociatedCache(operation));
  }

  @Test
  void verifyCacheRetrievalThrowsExceptionIfSourceThingMissing() {
    Iteration iterationDto = new cdp4common.dto.Iteration();
    Operation operation = new Operation(iterationDto, iterationDto, OperationKind.CREATE);

    assertThrows(IllegalStateException.class, () -> JsonFileDal.getAssociatedCache(operation));
  }

  @Test
  @Tag("AppVeyorExclusion")
  void verifyThatOpenCreatesAConnection() {
    List<cdp4common.dto.Thing> returned = this.dal.open(this.credentials, this.cancelled).join();
    assertNotNull(returned);
    assertFalse(returned.isEmpty());
  }

  @Test
  void verifyThatUpdateThrowsException() {
    Alias alias = new cdp4common.dto.Alias();
    assertThrows(UnsupportedOperationException.class, () -> this.dal.update(alias));
  }

  @Test
  void verifyThatDeleteThrowsException() {
    Alias alias = new cdp4common.dto.Alias();
    assertThrows(UnsupportedOperationException.class, () -> this.dal.delete(alias));
  }

  @Test
  void verifyThatAJsonDalThatIsNotOpenCannotBeClosed() {
    assertNull(this.dal.getCredentials());
    assertThrows(IllegalArgumentException.class, () -> this.dal.close());
  }

  @Test
  @Tag("AppVeyorExclusion")
  void verifyThatReadReturnsCorrectDTO() {
    List<cdp4common.dto.Thing> returned = this.dal.open(this.credentials, this.cancelled).join();

    assertNotNull(returned);
    assertFalse(returned.isEmpty());

    // read info from the open call
    EngineeringModelSetup engineeringModelSetupDto = returned.stream()
        .filter(d -> d.getClassKind() == ClassKind.EngineeringModelSetup)
        .map(x -> (EngineeringModelSetup) x)
        .collect(MoreCollectors.onlyElement());

    IterationSetup iterationSetupDto = returned.stream()
        .filter(d -> d.getClassKind() == ClassKind.IterationSetup)
        .map(x -> (IterationSetup) x)
        .findFirst().orElse(null);

    assertNotNull(engineeringModelSetupDto);
    assertNotNull(iterationSetupDto);

    // setup expected SiteDirectory instance
    cdp4common.sitedirectorydata.IterationSetup iterationSetupData = new cdp4common.sitedirectorydata.IterationSetup();
    iterationSetupData.setIterationIid(iterationSetupDto.getIterationIid());
    ModelReferenceDataLibrary modelRdlData = new cdp4common.sitedirectorydata.ModelReferenceDataLibrary();
    modelRdlData.setIid(
        engineeringModelSetupDto.getRequiredRdl().stream().collect(MoreCollectors.onlyElement()));
    cdp4common.sitedirectorydata.EngineeringModelSetup engineeringModelSetupData = new cdp4common.sitedirectorydata.EngineeringModelSetup();
    engineeringModelSetupData
        .setEngineeringModelIid(engineeringModelSetupDto.getEngineeringModelIid());

    engineeringModelSetupData.getRequiredRdl().add(modelRdlData);
    engineeringModelSetupData.getIterationSetup().add(iterationSetupData);
    this.siteDirectoryData.getModel().add(engineeringModelSetupData);

    Iteration iterObject = new cdp4common.dto.Iteration();
    iterObject.setIid(iterationSetupDto.getIterationIid());

    List<cdp4common.dto.Thing> readResult = this.dal.read(iterObject, this.cancelled, null).join();

    // General assertions for any kind of Thing we read
    assertNotNull(readResult);
    assertTrue(readResult.size() != 1);
    cdp4common.dto.Thing iter1 = readResult.stream()
        .filter(d -> d.getClassKind() == ClassKind.Iteration)
        .collect(MoreCollectors.onlyElement());

    assertSame(iterObject.getClassKind(), iter1.getClassKind());
    assertEquals(iterObject.getIid(), iter1.getIid());
  }

  @Test
  void verifyThatReadWithNonIterationInstanceSuppliedThrowsException() {
    Alias alias = new cdp4common.dto.Alias();

    // CompletableFuture wraps all execution exceptions as ExecutionException
    try {
      this.dal.read(alias, new AtomicBoolean(), null).get();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      assertTrue(e.getCause() instanceof UnsupportedOperationException);
    }
  }

  @Test
  void verifyThatWriteAsyncOperationContainerThrowsException() {
    OperationContainer operationContainer = new OperationContainer(
        "/SiteDirectory/47363f0d-eb6d-4a58-95f5-fa7854995650", 1);

    assertThrows(UnsupportedOperationException.class,
        () -> this.dal.write(operationContainer, null));
  }

  @Test
  void verifyWriteEnumerableOperationContainer() {
    Cache<CacheKey, Thing> cache = CacheBuilder.newBuilder().build();

    List<String> files = Arrays.asList("file1");
    assertThrows(NullPointerException.class,
        () -> this.dal.write((List<OperationContainer>) null, files));
    assertThrows(IllegalArgumentException.class, () -> this.dal.write(new ArrayList<>(), files));

    List<OperationContainer> operationContainers = Arrays
        .asList(new OperationContainer("/SiteDirectory/00000000-0000-0000-0000-000000000000", 0));
    assertThrows(IllegalArgumentException.class, () -> this.dal.write(operationContainers, files));

    DomainOfExpertise domain = new DomainOfExpertise(UUID.randomUUID(), cache, this.credentials.getUri());
    domain.setShortName("SYS");
    this.siteDirectoryData.getDomain().add(domain);

    cdp4common.dto.SiteDirectory sitedirectoryDto = (cdp4common.dto.SiteDirectory) this.siteDirectoryData.toDto();
    cdp4common.dto.SiteDirectory clone = sitedirectoryDto.deepClone(cdp4common.dto.SiteDirectory.class);
    Operation operation = new Operation(sitedirectoryDto, clone, OperationKind.UPDATE);
    assertEquals(0,
        operationContainers.stream().collect(MoreCollectors.onlyElement()).getOperations().size());
    operationContainers.stream().collect(MoreCollectors.onlyElement()).addOperation(operation);

    assertEquals(1,
        operationContainers.stream().collect(MoreCollectors.onlyElement()).getOperations().size());
    assertThrows(IllegalArgumentException.class, () -> this.dal.write(operationContainers, files));

    operationContainers.stream().collect(MoreCollectors.onlyElement()).removeOperation(operation);
    assertEquals(0,
        operationContainers.stream().collect(MoreCollectors.onlyElement()).getOperations().size());

    UUID iterationIid = UUID.fromString("b58ea73d-350d-4520-b9d9-a52c75ac2b5d");
    IterationSetup iterationSetup = new IterationSetup(UUID.randomUUID(), 0);
    cdp4common.sitedirectorydata.IterationSetup iterationSetupPojo = new cdp4common.sitedirectorydata.IterationSetup(
        iterationSetup.getIid(), cache, this.credentials.getUri());
    EngineeringModel model = new EngineeringModel(UUID.randomUUID(), cache, this.credentials.getUri());
    cdp4common.sitedirectorydata.EngineeringModelSetup modelSetup = new cdp4common.sitedirectorydata.EngineeringModelSetup();
    modelSetup.getActiveDomain().add(domain);
    modelSetup.setIid(UUID.fromString("00000000-0000-0000-0000-000000000000"));

    ModelReferenceDataLibrary requiredRdl = new cdp4common.sitedirectorydata.ModelReferenceDataLibrary();
    requiredRdl.setIid(UUID.fromString("00000000-0000-0000-0000-000000000000"));
    Person person = new Person();
    person.setShortName("admin");
    person.setIid(UUID.randomUUID());
    person.setContainer(this.siteDirectoryData);
    Participant participant = new Participant(UUID.randomUUID(), cache, this.credentials.getUri());
    participant.setPerson(person);
    participant.getDomain().add(domain);
    modelSetup.getParticipant().add(participant);

    cdp4common.engineeringmodeldata.Iteration iterationPojo = new cdp4common.engineeringmodeldata.Iteration(iterationIid, cache,
        this.credentials.getUri());
    iterationPojo.setIterationSetup(iterationSetupPojo);
    model.getIteration().add(iterationPojo);
    Iteration iteration = (Iteration) iterationPojo.toDto();
    model.setEngineeringModelSetup(modelSetup);
    this.siteDirectoryData.getModel().add(modelSetup);
    modelSetup.getRequiredRdl().add(requiredRdl);
    modelSetup.getIterationSetup().add(iterationSetupPojo);
    cache.put(new CacheKey(person.getIid(), this.siteDirectoryData.getIid()), person);
    this.siteDirectoryData.setCache(cache);
    iteration.setIterationSetup(iterationSetup.getIid());
    Iteration clone1 = iteration.deepClone(Iteration.class);
    operation = new Operation(iteration, clone1, OperationKind.UPDATE);
    List<OperationContainer> operationContainers2 = Arrays.asList(new OperationContainer(
        "/EngineeringModel/" + model.getIid() + "/iteration/" + iteration.getIid(), 0));
    operationContainers2.stream().collect(MoreCollectors.onlyElement()).addOperation(operation);

    assertTrue(this.dal.write(operationContainers2, files).join().isEmpty());
  }
}
