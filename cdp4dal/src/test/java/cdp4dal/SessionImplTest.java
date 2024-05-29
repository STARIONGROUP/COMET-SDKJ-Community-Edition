/*
 * SessionImplTest.java
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

package cdp4dal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import cdp4common.Version;
import cdp4common.commondata.ClassKind;
import cdp4common.dto.EngineeringModel;
import cdp4common.dto.EngineeringModelSetup;
import cdp4common.dto.Iteration;
import cdp4common.dto.SiteDirectory;
import cdp4common.dto.Thing;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.IterationSetup;
import cdp4common.sitedirectorydata.ModelReferenceDataLibrary;
import cdp4common.sitedirectorydata.Participant;
import cdp4common.sitedirectorydata.Person;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import cdp4common.sitedirectorydata.TelephoneNumber;
import cdp4common.sitedirectorydata.VcardTelephoneNumberKind;
import cdp4common.types.CacheKey;
import cdp4dal.dal.Credentials;
import cdp4dal.dal.Dal;
import cdp4dal.dal.DalBase;
import cdp4dal.dal.QueryAttributes;
import cdp4dal.events.ObjectChangedEvent;
import cdp4dal.events.SessionEvent;
import cdp4dal.events.SessionStatus;
import cdp4dal.operations.OperationContainer;
import com.google.common.collect.MoreCollectors;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SessionImplTest {

  private Dal mockedDal;

  private List<Thing> dalOutputs;

  private URI uri;

  private Session session;

  private cdp4common.dto.Person person;

  private cdp4common.dto.SiteDirectory sieSiteDirectoryDto;

  @BeforeEach
  void setUp() {
    CDPMessageBus.getCurrent().clearSubscriptions();

    this.dalOutputs = new ArrayList<>();

    this.sieSiteDirectoryDto = new cdp4common.dto.SiteDirectory(UUID.randomUUID(), 22);
    this.person = new cdp4common.dto.Person(UUID.randomUUID(), 22);
    this.person.setShortName("John");
    this.person.setGivenName("John");
    this.person.setPassword("Doe");
    this.person.setActive(true);

    cdp4common.dto.TelephoneNumber phone1 = new cdp4common.dto.TelephoneNumber(UUID.randomUUID(), 22);
    phone1.setValue("123");
    phone1.getVcardType().add(VcardTelephoneNumberKind.HOME);

    cdp4common.dto.TelephoneNumber phone2 = new cdp4common.dto.TelephoneNumber(UUID.randomUUID(), 22);
    phone2.setValue("456");
    phone2.getVcardType().add(VcardTelephoneNumberKind.WORK);

    cdp4common.dto.TelephoneNumber phone3 = new cdp4common.dto.TelephoneNumber(UUID.randomUUID(), 22);
    phone3.setValue("789");
    phone3.getVcardType().add(VcardTelephoneNumberKind.FAX);

    this.sieSiteDirectoryDto.getPerson().add(this.person.getIid());

    this.person.getTelephoneNumber().add(phone1.getIid());
    this.person.getTelephoneNumber().add(phone2.getIid());
    this.person.getTelephoneNumber().add(phone3.getIid());

    this.dalOutputs.add(this.sieSiteDirectoryDto);
    this.dalOutputs.add(this.person);
    this.dalOutputs.add(phone1);
    this.dalOutputs.add(phone2);
    this.dalOutputs.add(phone3);

    this.uri = URI.create("http://www.stariongroup.eu/");
    Credentials credentials = new Credentials("John", "Doe", this.uri, null);

    this.mockedDal = mock(Dal.class);

    this.session = new SessionImpl(this.mockedDal, credentials);

    when(this.mockedDal.open(any(Credentials.class), any(AtomicBoolean.class)))
        .thenReturn(CompletableFuture.completedFuture(this.dalOutputs));
  }

  @Test
  void verifyThatOpenCallAssemblerSynchronizeWithDtos()
      throws ExecutionException, InterruptedException {
    AtomicBoolean eventReceived = new AtomicBoolean();
    CDPMessageBus.getCurrent().listen(ObjectChangedEvent.class, TelephoneNumber.class, null)
        .subscribe(x -> eventReceived.set(true));

    this.session.open().get();

    assertTrue(eventReceived.get());
  }

  @Test
  void verifyThatWriteWithEmptyResponseSendsMessages()
      throws ExecutionException, InterruptedException, IllegalAccessException {
    AtomicBoolean beginUpdateReceived = new AtomicBoolean();
    AtomicBoolean endUpdateReceived = new AtomicBoolean();

    when(this.mockedDal.write(any(OperationContainer.class), any()))
        .thenReturn(CompletableFuture.completedFuture(new ArrayList<>()));

    CDPMessageBus.getCurrent().listen(SessionEvent.class, null, null)
        .subscribe(x ->
        {
          if (x.getStatus() == SessionStatus.BEGIN_UPDATE) {
            beginUpdateReceived.set(true);
            return;
          }

          if (x.getStatus() == SessionStatus.END_UPDATE) {
            endUpdateReceived.set(true);
          }
        });

    String context = String.format("/SiteDirectory/%s", UUID.randomUUID());
    Person johnDoe = new cdp4common.sitedirectorydata.Person(this.person.getIid(),
        this.session.getAssembler().getCache(), this.uri);
    johnDoe.setShortName("John");
    FieldUtils.writeField(this.session, "activePerson", johnDoe, true);
    this.session.write(new OperationContainer(context, null)).get();

    assertTrue(beginUpdateReceived.get());
    assertTrue(endUpdateReceived.get());
  }

  @Test
  void verifyThatRefreshSynchronizeTheAssembler() throws ExecutionException, InterruptedException {
    AtomicBoolean eventReceived = new AtomicBoolean();

    when(this.mockedDal.read(any(Thing.class), any(AtomicBoolean.class), any()))
        .thenReturn(CompletableFuture.completedFuture(this.dalOutputs));

    this.session.open().get();

    CDPMessageBus.getCurrent().listen(ObjectChangedEvent.class, TelephoneNumber.class, null)
        .subscribe(x ->
            eventReceived.set(true));

    // refresh shouldn't do anything
    this.session.refresh().get();

    assertFalse(eventReceived.get());
  }

  @Test
  void verifyThatReloadSynchronizeTheAssembler() throws ExecutionException, InterruptedException {
    AtomicBoolean eventReceived = new AtomicBoolean();

    cdp4common.dto.TelephoneNumber updatedTel = new cdp4common.dto.TelephoneNumber(
        this.dalOutputs
            .stream()
            .filter(x -> x instanceof cdp4common.dto.TelephoneNumber)
            .findAny()
            .get().getIid(), 100);

    when(this.mockedDal.read(any(Thing.class), any(AtomicBoolean.class), any()))
        .thenReturn(CompletableFuture.completedFuture(
            Arrays.asList(updatedTel)));

    this.session.open().get();

    CDPMessageBus.getCurrent().listen(ObjectChangedEvent.class, TelephoneNumber.class, null)
        .subscribe(x ->
            eventReceived.set(true)
        );

    this.session.reload().get();
    TimeUnit.MILLISECONDS.sleep(10);
    assertTrue(eventReceived.get());
  }

  /**
   * The verify that get active person works.
   */
  @Test
  void verifyThatGetActivePersonWorks() throws ExecutionException, InterruptedException {
    this.session.open().get();

    Person activePerson = this.session.getActivePerson();
    assertNotNull(activePerson);
    assertEquals("John", activePerson.getShortName());
  }

  @Test
  void verifyThatOpenSiteRDLUpdatesListInSession()
      throws ExecutionException, InterruptedException, IllegalAccessException {
    cdp4common.sitedirectorydata.SiteDirectory siteDir = new cdp4common.sitedirectorydata.SiteDirectory(UUID.randomUUID(), null, null);
    Person johnDoe = new cdp4common.sitedirectorydata.Person(this.person.getIid(),
        this.session.getAssembler().getCache(), this.uri);
    johnDoe.setShortName("John");
    cdp4common.dto.SiteReferenceDataLibrary rdlDto = new cdp4common.dto.SiteReferenceDataLibrary();
    rdlDto.setIid(UUID.randomUUID());
    SiteDirectory siteDirDto = new cdp4common.dto.SiteDirectory();
    siteDirDto.setIid(UUID.randomUUID());
    cdp4common.dto.SiteReferenceDataLibrary requiredPojoDto = new cdp4common.dto.SiteReferenceDataLibrary();
    requiredPojoDto.setIid(UUID.randomUUID());
    SiteReferenceDataLibrary requiredPojoRdl = new cdp4common.sitedirectorydata.SiteReferenceDataLibrary(
        requiredPojoDto.getIid(), null, null);
    rdlDto.setRequiredRdl(requiredPojoDto.getIid());

    Credentials credentials = new Credentials("admin", "pass", URI.create("http://www.stariongroup.eu"),
        null);
    SessionImpl session2 = new SessionImpl(this.mockedDal, credentials);
    SiteReferenceDataLibrary rdlPojo = new cdp4common.sitedirectorydata.SiteReferenceDataLibrary();
    rdlPojo.setIid(rdlDto.getIid());
    rdlPojo.setName(rdlDto.getName());
    rdlPojo.setShortName(rdlDto.getShortName());
    rdlPojo.setContainer(siteDir);
    rdlPojo.setRequiredRdl(requiredPojoRdl);
    ArrayList<Thing> thingsToAdd = new ArrayList<Thing>();
    thingsToAdd.add(siteDirDto);
    thingsToAdd.add(requiredPojoDto);
    thingsToAdd.add(rdlDto);

    when(this.mockedDal.read(any(Thing.class), any(AtomicBoolean.class), any()))
        .thenReturn(CompletableFuture.completedFuture(new ArrayList<>()));

    FieldUtils.writeField(session2, "activePerson", johnDoe, true);
    session2.getAssembler().synchronize(thingsToAdd, true).get();
    assertTrue(session2.getOpenReferenceDataLibraries().isEmpty());

    session2.read(rdlPojo).get();
    assertEquals(2, session2.getOpenReferenceDataLibraries().size());

    session2.close().get();
    assertTrue(session2.getOpenReferenceDataLibraries().isEmpty());
  }

  @Test
  void verifyThatCloseRdlWorks()
      throws ExecutionException, InterruptedException, IllegalAccessException {
    cdp4common.sitedirectorydata.SiteDirectory siteDirectoryPojo = new cdp4common.sitedirectorydata.SiteDirectory(
        this.sieSiteDirectoryDto.getIid(), this.session.getAssembler().getCache(), this.uri);
    Person johnDoe = new cdp4common.sitedirectorydata.Person(this.person.getIid(),
        this.session.getAssembler().getCache(), this.uri);
    johnDoe.setShortName("John");

    cdp4common.dto.SiteReferenceDataLibrary rdlDto = new cdp4common.dto.SiteReferenceDataLibrary();
    rdlDto.setIid(UUID.randomUUID());
    SiteReferenceDataLibrary rdlPojo = new cdp4common.sitedirectorydata.SiteReferenceDataLibrary();
    rdlPojo.setIid(rdlDto.getIid());
    rdlPojo.setName(rdlDto.getName());
    rdlPojo.setShortName(rdlDto.getShortName());
    rdlPojo.setContainer(siteDirectoryPojo);

    cdp4common.dto.SiteReferenceDataLibrary requiredSiteReferenceDataLibraryDto = new cdp4common.dto.SiteReferenceDataLibrary();
    requiredSiteReferenceDataLibraryDto.setIid(UUID.randomUUID());
    SiteReferenceDataLibrary requiredSiteReferenceDataLibraryPojo = new cdp4common.sitedirectorydata.SiteReferenceDataLibrary(
        requiredSiteReferenceDataLibraryDto.getIid(), this.session.getAssembler().getCache(),
        this.uri);

    rdlDto.setRequiredRdl(requiredSiteReferenceDataLibraryDto.getIid());
    rdlPojo.setRequiredRdl(requiredSiteReferenceDataLibraryPojo);

    List<Thing> thingsToAdd = Arrays.asList(
        requiredSiteReferenceDataLibraryDto, rdlDto
    );

    when(this.mockedDal.read(any(Thing.class), any(AtomicBoolean.class), any()))
        .thenReturn(CompletableFuture.completedFuture(new ArrayList<>()));

    FieldUtils.writeField(session, "activePerson", johnDoe, true);
    session.getAssembler().synchronize(thingsToAdd, true).get();
    session.read(rdlPojo).get();
    assertEquals(2, session.getOpenReferenceDataLibraries().size());

    cdp4common.commondata.Thing rdlPojoToClose =
        session.getAssembler().getCache()
            .getIfPresent(new CacheKey(rdlPojo.getIid(), null));
    session.
        closeRdl((cdp4common.sitedirectorydata.SiteReferenceDataLibrary) rdlPojoToClose).get();
    assertEquals(1, session.getOpenReferenceDataLibraries().size());

    session.read(rdlPojo).get();
    assertEquals(2, session.getOpenReferenceDataLibraries().size());

    rdlPojoToClose = session.getAssembler().getCache()
        .getIfPresent(new CacheKey(rdlPojo.getIid(), null));
    cdp4common.commondata.Thing requiredRdlToClose =
        session.getAssembler().getCache()
            .getIfPresent(new CacheKey(requiredSiteReferenceDataLibraryPojo.getIid(), null));
    session.
        closeRdl((cdp4common.sitedirectorydata.SiteReferenceDataLibrary) requiredRdlToClose).get();

    assertEquals(0, session.getOpenReferenceDataLibraries().size());

    session.
        closeRdl((cdp4common.sitedirectorydata.SiteReferenceDataLibrary) rdlPojoToClose).get();
    assertEquals(0, session.getOpenReferenceDataLibraries().size());
  }

  @Test
  void verifyThatSiteRdlRequiredByModelRdlCannotBeClosed()
      throws ExecutionException, InterruptedException, IllegalAccessException {
    cdp4common.dto.SiteReferenceDataLibrary rdlDto = new cdp4common.dto.SiteReferenceDataLibrary();
    rdlDto.setIid(UUID.randomUUID());
    SiteDirectory siteDirDto = new cdp4common.dto.SiteDirectory();
    siteDirDto.setIid(UUID.randomUUID());
    cdp4common.dto.SiteReferenceDataLibrary requiredRdlDto = new cdp4common.dto.SiteReferenceDataLibrary();
    requiredRdlDto.setIid(UUID.randomUUID());
    rdlDto.setRequiredRdl(requiredRdlDto.getIid());
    siteDirDto.getSiteReferenceDataLibrary().add(rdlDto.getIid());
    siteDirDto.getSiteReferenceDataLibrary().add(requiredRdlDto.getIid());
    siteDirDto.getPerson().add(this.person.getIid());

    cdp4common.dto.ModelReferenceDataLibrary mrdl = new cdp4common.dto.ModelReferenceDataLibrary(UUID.randomUUID(), 0);
    mrdl.setRequiredRdl(requiredRdlDto.getIid());
    EngineeringModelSetup modelsetup = new cdp4common.dto.EngineeringModelSetup(UUID.randomUUID(), 0);
    modelsetup.getRequiredRdl().add(mrdl.getIid());

    EngineeringModel model = new cdp4common.dto.EngineeringModel(UUID.randomUUID(), 0);
    model.setEngineeringModelSetup(modelsetup.getIid());

    Iteration iteration = new cdp4common.dto.Iteration(UUID.randomUUID(), 0);
    model.getIteration().add(iteration.getIid());

    siteDirDto.getModel().add(modelsetup.getIid());

    List<Thing> readReturn = Arrays.asList(
        siteDirDto,
        mrdl,
        modelsetup,
        model,
        iteration,
        this.person
    );

    ModelReferenceDataLibrary mrdlPojo = new ModelReferenceDataLibrary(mrdl.getIid(), null, null);
    cdp4common.sitedirectorydata.EngineeringModelSetup modelSetupPojo = new cdp4common.sitedirectorydata.EngineeringModelSetup(modelsetup.getIid(),
        null, null);
    modelSetupPojo.getRequiredRdl().add(mrdlPojo);

    cdp4common.dto.Participant participant = new cdp4common.dto.Participant(UUID.randomUUID(), 0);
    participant.setPerson(this.person.getIid());
    modelsetup.getParticipant().add(participant.getIid());
    cdp4common.engineeringmodeldata.EngineeringModel modelPojo = new cdp4common.engineeringmodeldata.EngineeringModel(model.getIid(), null,
        null);
    modelPojo.setEngineeringModelSetup(modelSetupPojo);
    cdp4common.engineeringmodeldata.Iteration iterationPojo = new cdp4common.engineeringmodeldata.Iteration(iteration.getIid(), null,
        null);
    modelPojo.getIteration().add(iterationPojo);

    when(this.mockedDal.read(any(Iteration.class), any(AtomicBoolean.class), any()))
        .thenReturn(CompletableFuture.completedFuture(readReturn));

    List<Thing> thingsToAdd = Arrays.asList(
        siteDirDto, requiredRdlDto, rdlDto, this.person, participant, modelsetup
    );

    this.session.getAssembler().synchronize(thingsToAdd, true).get();

    Person johnDoe = this.session.retrieveSiteDirectory().getPerson()
        .stream()
        .filter(x -> x.getIid().equals(this.person.getIid()))
        .collect(MoreCollectors.onlyElement());
    FieldUtils.writeField(session, "activePerson", johnDoe, true);

    this.session.read(iterationPojo, null).get();

    assertEquals(2, this.session.getOpenReferenceDataLibraries().size());

    cdp4common.commondata.Thing requiredRdlToClose =
        this.session.getAssembler().getCache()
            .getIfPresent(new CacheKey(requiredRdlDto.getIid(), null));

    this.session.closeRdl((SiteReferenceDataLibrary) requiredRdlToClose).get();
    assertEquals(2, this.session.getOpenReferenceDataLibraries().size());
  }

  @Test
  void verifyThatCloseModelRdlWorks()
      throws ExecutionException, InterruptedException, IllegalAccessException {
    cdp4common.sitedirectorydata.SiteDirectory siteDir = new cdp4common.sitedirectorydata.SiteDirectory(UUID.randomUUID(), null, null);
    Person johnDoe = new cdp4common.sitedirectorydata.Person(this.person.getIid(),
        this.session.getAssembler().getCache(), this.uri);
    johnDoe.setShortName("John");
    cdp4common.dto.ModelReferenceDataLibrary modelRdlDto = new cdp4common.dto.ModelReferenceDataLibrary();
    modelRdlDto.setIid(UUID.randomUUID());
    SiteDirectory siteDirDto = new cdp4common.dto.SiteDirectory();
    siteDirDto.setIid(UUID.randomUUID());
    cdp4common.dto.SiteReferenceDataLibrary requiredPojoDto = new cdp4common.dto.SiteReferenceDataLibrary();
    requiredPojoDto.setIid(UUID.randomUUID());
    SiteReferenceDataLibrary requiredPojoRdl = new SiteReferenceDataLibrary(UUID.randomUUID(), null, null);
    EngineeringModelSetup containerEngModelSetupDto = new cdp4common.dto.EngineeringModelSetup();
    containerEngModelSetupDto.setIid(UUID.randomUUID());
    cdp4common.sitedirectorydata.EngineeringModelSetup containerEngModelSetup = new cdp4common.sitedirectorydata.EngineeringModelSetup();
    containerEngModelSetup.setIid(containerEngModelSetupDto.getIid());
    siteDir.getModel().add(containerEngModelSetup);
    modelRdlDto.setRequiredRdl(requiredPojoDto.getIid());
    siteDir.getPerson().add(johnDoe);

    Credentials credentials = new Credentials("admin", "pass", URI.create("http://www.stariongroup.eu"),
        null);
    SessionImpl session2 = new SessionImpl(this.mockedDal, credentials);
    FieldUtils.writeField(session2, "activePerson", johnDoe, true);

    ModelReferenceDataLibrary modelRdlPojo = new ModelReferenceDataLibrary();
    modelRdlPojo.setIid(modelRdlDto.getIid());
    modelRdlPojo.setName(modelRdlDto.getName());
    modelRdlPojo.setShortName(modelRdlPojo.getShortName());
    modelRdlPojo.setContainer(containerEngModelSetup);
    modelRdlPojo.setRequiredRdl(requiredPojoRdl);
    List<Thing> thingsToAdd = Arrays.asList(
        siteDirDto, requiredPojoDto, containerEngModelSetupDto, modelRdlDto
    );

    when(this.mockedDal.read(any(Thing.class), any(AtomicBoolean.class), any()))
        .thenReturn(CompletableFuture.completedFuture(new ArrayList<>()));

    session2.getAssembler().synchronize(thingsToAdd, true).get();
    session2.read(modelRdlPojo).get();
    assertEquals(2, session2.getOpenReferenceDataLibraries().size());

    cdp4common.commondata.Thing rdlPojoToClose =
        session2.getAssembler().getCache()
            .getIfPresent(new CacheKey(modelRdlPojo.getIid(), null));
    assertNotNull(rdlPojoToClose);
    session2.closeModelRdl((ModelReferenceDataLibrary) rdlPojoToClose).get();

    // Check that closing a modelRDL doesn't close it's required SiteRDL
    assertEquals(1, session2.getOpenReferenceDataLibraries().size());
    assertEquals(ClassKind.SiteReferenceDataLibrary,
        session2.getOpenReferenceDataLibraries().get(0).getClassKind());
  }

  @Test
  void verifyThatCloseModelWorks() throws ExecutionException, InterruptedException {
    cdp4common.sitedirectorydata.SiteDirectory siteDir = new cdp4common.sitedirectorydata.SiteDirectory(UUID.randomUUID(), null, null);
    cdp4common.dto.ModelReferenceDataLibrary modelRdlDto = new cdp4common.dto.ModelReferenceDataLibrary();
    modelRdlDto.setIid(UUID.randomUUID());
    SiteDirectory siteDirDto = new cdp4common.dto.SiteDirectory();
    siteDirDto.setIid(UUID.randomUUID());
    cdp4common.dto.SiteReferenceDataLibrary requiredPojoDto = new cdp4common.dto.SiteReferenceDataLibrary();
    requiredPojoDto.setIid(UUID.randomUUID());
    EngineeringModelSetup containerEngModelSetupDto = new EngineeringModelSetup();
    containerEngModelSetupDto.setIid(UUID.randomUUID());
    cdp4common.sitedirectorydata.EngineeringModelSetup containerEngModelSetup = new cdp4common.sitedirectorydata.EngineeringModelSetup();
    containerEngModelSetup.setIid(containerEngModelSetupDto.getIid());
    Iteration iterationDto = new Iteration();
    iterationDto.setIid(UUID.randomUUID());
    cdp4common.engineeringmodeldata.Iteration iteration = new cdp4common.engineeringmodeldata.Iteration();
    iteration.setIid(iterationDto.getIid());
    cdp4common.dto.IterationSetup iterationSetupDto = new cdp4common.dto.IterationSetup();
    iterationSetupDto.setIid(UUID.randomUUID());
    iterationSetupDto.setIterationIid(iterationDto.getIid());
    iterationDto.setIterationSetup(iterationSetupDto.getIterationIid());
    siteDir.getModel().add(containerEngModelSetup);
    modelRdlDto.setRequiredRdl(requiredPojoDto.getIid());

    Credentials credentials = new Credentials("admin", "pass", URI.create("http://www.stariongroup.eu"),
        null);
    SessionImpl session2 = new SessionImpl(this.mockedDal, credentials);

    IterationSetup iterationSetup = new cdp4common.sitedirectorydata.IterationSetup();
    iterationSetup.setIid(iterationSetupDto.getIid());
    iterationSetup.setContainer(containerEngModelSetup);
    iterationSetup.setIterationIid(iteration.getIid());
    List<Thing> thingsToAdd = Arrays.asList(
        siteDirDto, requiredPojoDto, containerEngModelSetupDto, modelRdlDto, iterationSetupDto
    );

    session2.getAssembler().synchronize(thingsToAdd, true).get();

    session2.getAssembler().getCache()
        .put(new CacheKey(iterationDto.getIid(), null), iteration);

    AtomicBoolean changedObject = new AtomicBoolean();
    CDPMessageBus.getCurrent()
        .listen(ObjectChangedEvent.class, cdp4common.engineeringmodeldata.Iteration.class, null)
        .subscribe(x -> {
          if (x.getChangedThing() != null) {
            changedObject.set(true);
          }
        });
    session2.closeIterationSetup(iterationSetup);
    assertNotNull(changedObject);
  }

  @Test
  void verifyThatReadRdlWorks()
      throws ExecutionException, InterruptedException, IllegalAccessException {
    cdp4common.sitedirectorydata.SiteDirectory siteDir = new cdp4common.sitedirectorydata.SiteDirectory(UUID.randomUUID(),
        this.session.getAssembler().getCache(), this.uri);
    Person johnDoe = new cdp4common.sitedirectorydata.Person(this.person.getIid(),
        this.session.getAssembler().getCache(), this.uri);
    johnDoe.setShortName("John");

    this.session.getAssembler().getCache().put(new CacheKey(siteDir.getIid(), null), siteDir);

    SiteDirectory sitedirDto = new SiteDirectory(siteDir.getIid(), 1);
    cdp4common.dto.SiteReferenceDataLibrary rdl = new cdp4common.dto.SiteReferenceDataLibrary(UUID.randomUUID(), 1);
    sitedirDto.getSiteReferenceDataLibrary().add(rdl.getIid());

    List<Thing> readOutput = Arrays.asList(
        sitedirDto,
        rdl
    );

    when(this.mockedDal.read(any(Thing.class), any(AtomicBoolean.class), any()))
        .thenReturn(CompletableFuture.completedFuture(readOutput));

    SiteReferenceDataLibrary srdl = new SiteReferenceDataLibrary(rdl.getIid(), null, null);
    srdl.setContainer(siteDir);

    FieldUtils.writeField(session, "activePerson", johnDoe, true);
    this.session.read(srdl).get();

    assertEquals(1, this.session.getOpenReferenceDataLibraries().size());
    assertTrue(siteDir.getSiteReferenceDataLibrary().size() > 0);
  }

  @Test
  void verifyThatReadIterationWorks()
      throws ExecutionException, InterruptedException, IllegalAccessException {
    cdp4common.sitedirectorydata.SiteDirectory siteDir = new cdp4common.sitedirectorydata.SiteDirectory(UUID.randomUUID(),
        this.session.getAssembler().getCache(), this.uri);
    Person johnDoe = new cdp4common.sitedirectorydata.Person(this.person.getIid(),
        this.session.getAssembler().getCache(), this.uri);
    johnDoe.setShortName("John");
    cdp4common.sitedirectorydata.EngineeringModelSetup modelSetup = new cdp4common.sitedirectorydata.EngineeringModelSetup(UUID.randomUUID(),
        this.session.getAssembler().getCache(), this.uri);
    IterationSetup iterationSetup = new cdp4common.sitedirectorydata.IterationSetup(UUID.randomUUID(),
        this.session.getAssembler().getCache(), this.uri);
    iterationSetup.setFrozenOn(OffsetDateTime.now());
    iterationSetup.setIterationIid(UUID.randomUUID());
    ModelReferenceDataLibrary mrdl = new ModelReferenceDataLibrary(UUID.randomUUID(),
        this.session.getAssembler().getCache(),
        this.uri);
    SiteReferenceDataLibrary srdl = new SiteReferenceDataLibrary(UUID.randomUUID(),
        this.session.getAssembler().getCache(),
        this.uri);
    DomainOfExpertise activeDomain = new DomainOfExpertise(UUID.randomUUID(),
        this.session.getAssembler().getCache(),
        this.uri);
    mrdl.setRequiredRdl(srdl);
    modelSetup.getRequiredRdl().add(mrdl);
    modelSetup.getIterationSetup().add(iterationSetup);
    siteDir.getModel().add(modelSetup);
    siteDir.getSiteReferenceDataLibrary().add(srdl);
    siteDir.getDomain().add(activeDomain);
    siteDir.getPerson().add(johnDoe);

    this.session.getAssembler().getCache().put(new CacheKey(siteDir.getIid(), null),
        siteDir);
    this.session.getAssembler().getCache().put(new CacheKey(johnDoe.getIid(), null),
        johnDoe);
    this.session.getAssembler().getCache().put(new CacheKey(modelSetup.getIid(), null),
        modelSetup);
    this.session.getAssembler().getCache().put(new CacheKey(mrdl.getIid(), null),
        mrdl);
    this.session.getAssembler().getCache().put(new CacheKey(srdl.getIid(), null),
        srdl);
    this.session.getAssembler().getCache().put(new CacheKey(siteDir.getIid(), null),
        siteDir);
    this.session.getAssembler().getCache().put(new CacheKey(iterationSetup.getIid(), null),
        iterationSetup);

    FieldUtils.writeField(session, "activePerson", johnDoe, true);

    Participant participant = new cdp4common.sitedirectorydata.Participant(UUID.randomUUID(),
        this.session.getAssembler().getCache(), this.uri);
    participant.setPerson(this.session.getActivePerson());
    modelSetup.getParticipant().add(participant);

    EngineeringModel model = new cdp4common.dto.EngineeringModel(UUID.randomUUID(), 1);
    Iteration iteration = new cdp4common.dto.Iteration(iterationSetup.getIterationIid(), 10);
    iteration.setIterationSetup(iterationSetup.getIid());
    model.getIteration().add(iteration.getIid());
    model.setEngineeringModelSetup(modelSetup.getIid());

    List<Thing> readOutput = Arrays.asList(
        model,
        iteration
    );

    when(this.mockedDal.read(any(cdp4common.dto.Iteration.class), any(AtomicBoolean.class), any()))
        .thenReturn(CompletableFuture.completedFuture(readOutput));

    cdp4common.engineeringmodeldata.Iteration iterationToOpen = new cdp4common.engineeringmodeldata.Iteration(iteration.getIid(), null,
        null);
    cdp4common.engineeringmodeldata.EngineeringModel modelToOpen = new cdp4common.engineeringmodeldata.EngineeringModel(model.getIid(), null,
        null);
    iterationToOpen.setContainer(modelToOpen);

    this.session.read(iterationToOpen, activeDomain).get();
    verify(this.mockedDal, times(1))
        .read(argThat(x -> x.getIid().equals(iteration.getIid())), any(AtomicBoolean.class), any());

    Entry<cdp4common.engineeringmodeldata.Iteration, Pair<DomainOfExpertise, Participant>> pair = this.session.getOpenIterations().asMultimap().entries().stream().collect(
        MoreCollectors.onlyElement());
    assertEquals(pair.getValue().getLeft(), activeDomain);

    this.session.read(iterationToOpen, activeDomain).get();
    verify(this.mockedDal, times(2))
        .read(argThat(x -> x.getIid().equals(iterationToOpen.getIid())), any(AtomicBoolean.class),
            any());

    pair = this.session.getOpenIterations().asMultimap().entries().stream().collect(
        MoreCollectors.onlyElement());
    assertEquals(pair.getValue().getLeft(), activeDomain);

    DomainOfExpertise selectedDomain = this.session.querySelectedDomainOfExpertise(iterationToOpen);
    assertEquals(activeDomain.getIid(), selectedDomain.getIid());

    when(this.mockedDal.read(any(Thing.class), any(AtomicBoolean.class), any()))
        .thenReturn(CompletableFuture.completedFuture(new ArrayList<>()));

    this.session.refresh().get();

    verify(this.mockedDal, times(1)).read(any(Thing.class), any(AtomicBoolean.class), any());
    assertThrows(ExecutionException.class, () ->
        this.session.read(iterationToOpen, null).get());
  }

  @Test
  void verify_that_when_active_person_is_null_Iteration_is_not_read() {
    IterationSetup iterationSetup = new cdp4common.sitedirectorydata.IterationSetup(UUID.randomUUID(), null,
        null);
    iterationSetup.setFrozenOn(OffsetDateTime.now());
    iterationSetup.setIterationIid(UUID.randomUUID());
    DomainOfExpertise activeDomain = new DomainOfExpertise(UUID.randomUUID(), null, null);
    EngineeringModel model = new EngineeringModel(UUID.randomUUID(), 1);
    Iteration iteration = new Iteration(UUID.randomUUID(), 10);
    iteration.setIterationSetup(iterationSetup.getIid());

    cdp4common.engineeringmodeldata.Iteration iterationToOpen = new cdp4common.engineeringmodeldata.Iteration(iteration.getIid(), null,
        null);
    cdp4common.engineeringmodeldata.EngineeringModel modelToOpen = new cdp4common.engineeringmodeldata.EngineeringModel(model.getIid(), null,
        null);
    iterationToOpen.setContainer(modelToOpen);

    assertThrows(IllegalStateException.class,
        () -> this.session.read(iterationToOpen, activeDomain).get());
  }

  @Test
  void verifyThatCDPVersionIsSet() {
    TestDal testDal = new TestDal();
    Credentials credentials = new Credentials("John", "Doe", this.uri, null);

    this.session = new SessionImpl(testDal, credentials);
    Version version = new Version("1.1.0");

    assertEquals(version.getMajor(), this.session.getDalVersion().getMajor());
    assertEquals(version.getMinor(), this.session.getDalVersion().getMinor());
    assertEquals(version.getMicro(), this.session.getDalVersion().getMicro());
  }

  @Test
  void verifyThatIsVersionSupportedReturnsExpectedResult() {
    TestDal testDal = new TestDal();
    Credentials credentials = new Credentials("John", "Doe", this.uri, null);
    this.session = new SessionImpl(testDal, credentials);

    Version supportedVersion = new Version("1.0.0");
    assertTrue(this.session.isVersionSupported(supportedVersion));

    supportedVersion = new Version("1.1.0");
    assertTrue(this.session.isVersionSupported(supportedVersion));

    Version notSupportedVersion = new Version("2.0.0");
    assertFalse(this.session.isVersionSupported(notSupportedVersion));
  }

  private class TestDal extends DalBase {

    Version getSupportedVersion() {
      return new Version(1, 0, 0);
    }

    public Version getDalVersion() {
      return new Version("1.1.0");
    }

    public boolean isReadOnly() {
      return false;
    }

    public CompletableFuture<List<Thing>> write(List<OperationContainer> operationContainers,
        List<String> files) {
      throw new NotImplementedException("Not implemented yet.");
    }

    public CompletableFuture<List<Thing>> write(OperationContainer operationContainer,
        List<String> files) {
      throw new NotImplementedException("Not implemented yet.");
    }

    public <T extends Thing> CompletableFuture<List<Thing>> read(T thing, AtomicBoolean cancelled,
        QueryAttributes attributes) {
      throw new NotImplementedException("Not implemented yet.");
    }

    public CompletableFuture<List<Thing>> read(Iteration iteration, AtomicBoolean cancelled,
        QueryAttributes attributes) {
      throw new NotImplementedException("Not implemented yet.");
    }

    public <T extends Thing> List<Thing> create(T thing) {
      throw new NotImplementedException("Not implemented yet.");
    }

    public <T extends Thing> List<Thing> update(T thing) {
      throw new NotImplementedException("Not implemented yet.");
    }

    public <T extends Thing> List<Thing> delete(T thing) {
      throw new NotImplementedException("Not implemented yet.");
    }

    public CompletableFuture<List<Thing>> open(Credentials credentials, AtomicBoolean cancelled) {
      throw new NotImplementedException("Not implemented yet.");
    }

    public void close() {
      throw new NotImplementedException("Not implemented yet.");
    }


    public boolean isValidURI(String uri) {
      throw new NotImplementedException("Not implemented yet.");
    }
  }
}
