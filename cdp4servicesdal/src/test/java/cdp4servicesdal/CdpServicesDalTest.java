/*
 * CdpServicesDalTest.java
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

package cdp4servicesdal;

import static cdp4common.helpers.Utils.as;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cdp4common.commondata.ClassKind;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.sitedirectorydata.EngineeringModelSetup;
import cdp4common.sitedirectorydata.IterationSetup;
import cdp4common.sitedirectorydata.ModelReferenceDataLibrary;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import cdp4common.types.CacheKey;
import cdp4common.types.OrderedItem;
import cdp4dal.Assembler;
import cdp4dal.CDPMessageBus;
import cdp4dal.Session;
import cdp4dal.SessionImpl;
import cdp4dal.dal.Credentials;
import cdp4dal.dal.DalQueryAttributes;
import cdp4dal.dal.ProxySettings;
import cdp4dal.dal.ecss1025annexc.ExtentQueryAttribute;
import cdp4dal.dal.ecss1025annexc.QueryAttributesImpl;
import cdp4dal.exceptions.DalReadException;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import cdp4dal.operations.OperationKind;
import com.google.common.base.Stopwatch;
import com.google.common.collect.MoreCollectors;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.message.BasicHeader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CdpServicesDalTest {

  private CdpServicesDal dal;
  private Credentials credentials;
  private Session session;

  private final URI uri = URI.create("https://cdp4services-test.rheagroup.com");
  private AtomicBoolean cancelled;

  private SiteDirectory siteDirectory;
  private EngineeringModel engineeringModel;
  private EngineeringModelSetup engineeringModelSetup;
  private Iteration iteration;
  private IterationSetup iterationSetup;
  private SiteReferenceDataLibrary siteReferenceDataLibrary;
  private ModelReferenceDataLibrary modelReferenceDataLibrary;

  @BeforeEach
  void setup() {
    this.cancelled = new AtomicBoolean();

    this.credentials = new Credentials("admin", "pass", this.uri, null);
    this.dal = new CdpServicesDal();
    this.session = new SessionImpl(this.dal, this.credentials);

    // Add SiteDirectory to cache
    this.siteDirectory = new SiteDirectory(UUID.fromString("f13de6f8-b03a-46e7-a492-53b2f260f294"),
        this.session.getAssembler().getCache(), this.uri);
    this.siteDirectory.getCache()
        .put(new CacheKey(this.siteDirectory.getIid(), null), this.siteDirectory);

    this.populateSiteDirectory();
  }

  /**
   * populates the {@link SiteDirectory}
   */
  private void populateSiteDirectory() {
    this.siteReferenceDataLibrary = new SiteReferenceDataLibrary(
        UUID.fromString("c454c687-ba3e-44c4-86bc-44544b2c7880"),
        this.session.getAssembler().getCache(), this.uri);
    this.modelReferenceDataLibrary = new ModelReferenceDataLibrary(
        UUID.fromString("3483f2b5-ea29-45cc-8a46-f5f598558fc3"),
        this.session.getAssembler().getCache(), this.uri);
    this.modelReferenceDataLibrary.setRequiredRdl(this.siteReferenceDataLibrary);

    this.engineeringModel = new EngineeringModel(
        UUID.fromString("9ec982e4-ef72-4953-aa85-b158a95d8d56"),
        this.session.getAssembler().getCache(), this.uri);
    this.iteration = new Iteration(UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c"),
        this.session.getAssembler().getCache(), this.uri);
    this.engineeringModel.getIteration().add(this.iteration);

    this.engineeringModelSetup = new EngineeringModelSetup(
        UUID.fromString("86163b0e-8341-4316-94fc-93ed60ad0dcf"),
        this.session.getAssembler().getCache(), this.uri);
    this.engineeringModelSetup.setEngineeringModelIid(this.engineeringModel.getIid());
    this.engineeringModelSetup.getRequiredRdl().add(this.modelReferenceDataLibrary);

    this.iterationSetup = new IterationSetup(UUID.randomUUID(),
        this.session.getAssembler().getCache(), this.uri);
    this.iterationSetup.setIterationIid(this.iteration.getIid());
    this.engineeringModelSetup.getIterationSetup().add(this.iterationSetup);

    this.siteDirectory.getModel().add(this.engineeringModelSetup);
  }

  @AfterEach
  void tearDown() {
    CDPMessageBus.getCurrent().clearSubscriptions();
    this.credentials = null;
    this.dal = null;
    this.session = null;
    this.siteDirectory = null;
    this.siteReferenceDataLibrary = null;
    this.modelReferenceDataLibrary = null;
    this.iterationSetup = null;
    this.engineeringModelSetup = null;
    this.engineeringModel = null;
  }

  @Test
  void verifyThatCdpServicesDalCanBeConstructed() {

    assertNotNull(dal);
  }

  @Test
  @Tag("WebServicesDependent")
  void verifyThatOpenReturnsDTOs()
      throws ExecutionException, InterruptedException, URISyntaxException {
    var uriBuilder = new URIBuilder(this.credentials.getUri());
    uriBuilder.setPath("/Data/Restore");
    HttpAsyncClientBuilder httpClientBuilder = HttpAsyncClients.custom();

    httpClientBuilder.setDefaultHeaders(Arrays.asList(
        new BasicHeader(HttpHeaders.AUTHORIZATION, "Basic " + Base64.getEncoder()
            .encodeToString(String.format("%s:%s", credentials.getUserName(),
                credentials.getPassword()).getBytes(StandardCharsets.US_ASCII)))
    ));

    CloseableHttpAsyncClient client = httpClientBuilder.build();
    client.start();

    var post = new HttpPost(uriBuilder.build());
    client.execute(post, null).get();

    var result = this.dal.open(this.credentials, new AtomicBoolean()).get();

    var amountOfDtos = result.size();

    assertEquals(86, amountOfDtos);
  }

  @Test
  @Tag("WebServicesDependent")
  void verifyThatAClosedDalCannotBeClosedAgain() throws ExecutionException, InterruptedException {
    this.dal.open(this.credentials, new AtomicBoolean()).get();

    this.dal.close();

    assertThrows(IllegalArgumentException.class, this.dal::close);
  }

  @Test
  void verifyThatIfCredentialsAreNullExceptionIsThrown() {
    // CompletableFuture wraps all execution exceptions as ExecutionException
    try {
      this.dal.open(null, new AtomicBoolean()).get();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      assertTrue(e.getCause() instanceof NullPointerException);
    }
  }

  @Test
  void verifyThatIfNotHttpOrHttpsExceptionIsThrown() {
    var uri = URI.create("https://cdp4services-test.rheagroup.com");
    var invalidCredentials = new Credentials("John", "a password", uri, null);

    try {
      this.dal.open(invalidCredentials, new AtomicBoolean()).get();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      assertTrue(e.getCause() instanceof DalReadException);
    }
  }

  @Test
  void verifyThatIfCredentialsAreNullOnReadExceptionIsThrown() {
    var organizationIid = UUID.fromString("44d1ff16-8195-47d0-abfa-163bbba9bf39");
    var organizationDto = new cdp4common.dto.Organization(organizationIid, 0);
    organizationDto.addContainer(ClassKind.SiteDirectory,
        UUID.fromString("eb77f3e1-a0f3-412d-8ed6-b8ce881c0145"));

    try {
      dal.read(organizationDto, new AtomicBoolean(), null).get();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      assertTrue(e.getCause() instanceof IllegalArgumentException);
    }
  }

  @Test
  void verifyThatWriteCreateException() {
    var alias = new cdp4common.dto.Alias();
    assertThrows(NotImplementedException.class, () -> this.dal.create(alias));
  }

  @Test
  void verifyThatUpdateThrowsException() {
    var alias = new cdp4common.dto.Alias();
    assertThrows(NotImplementedException.class, () -> this.dal.update(alias));
  }

  @Test
  void verifyThatDeleteThrowsException() {
    var alias = new cdp4common.dto.Alias();
    assertThrows(NotImplementedException.class, () -> this.dal.delete(alias));
  }

  @Test
  void verifyThatDalThatIsNotOpenCannotBeClosed() {
    assertNull(this.dal.getCredentials());
    assertThrows(IllegalArgumentException.class, () -> this.dal.close());
  }

  @Test
  @Tag("WebServicesDependent")
  void verifyThatReadReturnsCorrectDTO() throws ExecutionException, InterruptedException {

    var returned = dal.open(this.credentials, this.cancelled).get();
    assertNotNull(returned);
    assertFalse(returned.isEmpty());

    var sd = returned.stream().findFirst().get();

    var attributes = new QueryAttributesImpl();
    var readResult = dal.read(sd, this.cancelled, attributes).get();

    // General assertions for any kind of Thing we read
    assertNotNull(readResult);
    assertEquals(1, readResult.size());
    var sd1 = readResult.stream().collect(MoreCollectors.onlyElement());
    assertEquals(sd.getClassKind(), sd1.getClassKind());
    assertEquals(sd.getIid(), sd1.getIid());
    assertEquals(sd.getRoute(), sd1.getRoute());

    // Specific assertions for Sitedirectory ClassKind
    var castedSd = as(sd, cdp4common.dto.SiteDirectory.class);
    var castedSd1 = as(sd1, cdp4common.dto.SiteDirectory.class);
    assertNotNull(castedSd);
    assertNotNull(castedSd1);
    assertEquals(castedSd.getName(), castedSd1.getName());
    assertEquals(castedSd.getDomain().size(), castedSd1.getDomain().size());
    assertEquals(castedSd.getSiteReferenceDataLibrary(), castedSd1.getSiteReferenceDataLibrary());
    assertEquals(castedSd.getModel(), castedSd1.getModel());
  }

  @Test
  @Tag("WebServicesDependent")
  void integrationTest() throws ExecutionException, InterruptedException {
    this.dal = new CdpServicesDal();
    var returned = this.dal.open(this.credentials, this.cancelled).get();
    var assembler = new Assembler(this.credentials.getUri());

    assembler.synchronize(returned, true).get();

    var attributes = new DalQueryAttributes();
    attributes.setRevisionNumber(0);
    var topcontainers = assembler.getCache()
        .asMap()
        .values()
        .stream()
        .filter(x -> x instanceof cdp4common.commondata.TopContainer)
        .collect(Collectors.toList());

    for (var container : topcontainers) {
      returned = this.dal.read(container.toDto(), this.cancelled, attributes).get();
      assembler.synchronize(returned, true);
    }
  }

  @Test
  void verifyThatPostBodyIsCorrectlyResolves() throws IOException {
    var siteDirectoryIid = UUID.fromString("f289023d-41e8-4aaf-aae5-1be1ecf24bac");
    var domainOfExpertiseIid = UUID.randomUUID();

    var context = "/SiteDirectory/f289023d-41e8-4aaf-aae5-1be1ecf24bac";
    var operationContainer = new OperationContainer(context, null);

    var testDtoOriginal = new cdp4common.dto.Alias(UUID.randomUUID(), 1);
    testDtoOriginal.setContent("content");
    testDtoOriginal.setSynonym(false);
    testDtoOriginal.setLanguageCode("en");
    testDtoOriginal.addContainer(ClassKind.DomainOfExpertise, domainOfExpertiseIid);
    testDtoOriginal.addContainer(ClassKind.SiteDirectory, siteDirectoryIid);

    var testDtoModified = new cdp4common.dto.Alias(testDtoOriginal.getIid(), 1);
    testDtoModified.setContent("content2");
    testDtoModified.setSynonym(true);
    testDtoModified.setLanguageCode("en");
    testDtoModified.addContainer(ClassKind.DomainOfExpertise, domainOfExpertiseIid);
    testDtoModified.addContainer(ClassKind.SiteDirectory, siteDirectoryIid);

    var testDtoOriginal2 = new cdp4common.dto.Definition(UUID.randomUUID(), 1);
    testDtoOriginal2.setContent("somecontent");
    testDtoOriginal2.setLanguageCode("en");
    testDtoOriginal2.addContainer(ClassKind.DomainOfExpertise, domainOfExpertiseIid);
    testDtoOriginal2.addContainer(ClassKind.SiteDirectory, siteDirectoryIid);

    var testDtoModified2 = new cdp4common.dto.Definition(testDtoOriginal2.getIid(), 1);
    testDtoModified2.setContent("somecontent2");
    testDtoModified2.setLanguageCode("en");
    testDtoModified2.addContainer(ClassKind.DomainOfExpertise, domainOfExpertiseIid);
    testDtoModified2.addContainer(ClassKind.SiteDirectory, siteDirectoryIid);

    testDtoModified2.getCitation().add(UUID.randomUUID());
    testDtoModified2.getCitation().add(UUID.randomUUID());
    testDtoModified2.getCitation().add(UUID.randomUUID());
    testDtoModified2.getCitation().add(UUID.randomUUID());

    testDtoOriginal2.getCitation().add(testDtoModified2.getCitation().get(0));
    testDtoOriginal2.getCitation().add(testDtoModified2.getCitation().get(1));
    testDtoOriginal2.getCitation().add(testDtoModified2.getCitation().get(2));

    testDtoModified2.getCitation().remove(testDtoModified2.getCitation().get(1));

    testDtoOriginal2.getNote().add(new OrderedItem(
        1234,
        UUID.randomUUID()
    ));

    testDtoOriginal2.getNote().add(new OrderedItem(
        2345,
        UUID.randomUUID()
    ));

    testDtoModified2.getNote().add(new OrderedItem(
        234,
        UUID.randomUUID()
    ));

    testDtoModified2.getNote().add(new OrderedItem(
        2346,
        testDtoOriginal2.getNote().get(1).getV()
    ));

    // make a few operations
    var operation1 = new Operation(null, testDtoModified, OperationKind.CREATE);
    var operation2 = new Operation(null, testDtoModified, OperationKind.DELETE);
    var operation3 = new Operation(testDtoOriginal, testDtoModified, OperationKind.UPDATE);
    var operation4 = new Operation(testDtoOriginal2, testDtoModified2, OperationKind.UPDATE);

    operationContainer.addOperation(operation1);
    operationContainer.addOperation(operation2);
    operationContainer.addOperation(operation3);
    operationContainer.addOperation(operation4);

    var stream = new ByteArrayOutputStream();
    this.dal.constructPostRequestBodyStream("", operationContainer, stream);

    assertNotEquals(0, stream.size());
  }

  @Test
  @Tag("WebServicesDependent")
  void verifyThatReadIterationWorks() throws ExecutionException, InterruptedException {

    dal.setSession(this.session);
    var credentials = new Credentials("admin", "pass",
        URI.create("https://cdp4services-public.rheagroup.com"), null);
    var session = new SessionImpl(dal, credentials);

    var returned = dal.open(credentials, this.cancelled).get();

    session.getAssembler().synchronize(returned, true).get();

    var siteDir = session.getAssembler().retrieveSiteDirectory();
    var modelSetup = siteDir.getModel()
        .stream()
        .filter(x -> x.getShortName().equals("LOFT"))
        .collect(MoreCollectors.onlyElement());

    var iterationSetup = modelSetup.getIterationSetup()
        .stream()
        .findFirst()
        .orElseThrow();

    var openCount = session.getAssembler().getCache().size();

    var model = new EngineeringModel(modelSetup.getEngineeringModelIid(), null, null);
    var iteration = new Iteration(iterationSetup.getIterationIid(), null, null);
    iteration.setContainer(model);

    var modelDtos = dal.read((cdp4common.dto.Iteration) iteration.toDto(), this.cancelled, null)
        .get();
    session.getAssembler().synchronize(modelDtos, true).get();

    var readCount = session.getAssembler().getCache().size();
    assertTrue(readCount > openCount);
  }

  @Test
  @Tag("WebServicesDependent")
  @Tag("Performance")
  void assemblerSynchronizePerformanceTest() throws ExecutionException, InterruptedException {
    this.dal = new CdpServicesDal();

    var returnedlist = this.dal.open(this.credentials, this.cancelled).get();
    final int iterationNumber = 1000;
    var elapsedTimes = new ArrayList<Long>();

    for (int i = 0; i < iterationNumber; i++) {
      var assemble = new Assembler(this.uri);
      var stopwatch = Stopwatch.createStarted();
      assemble.synchronize(returnedlist, true).get();
      elapsedTimes.add(stopwatch.elapsed(TimeUnit.MILLISECONDS));
      assemble.clear().get();
    }

    var synchronizeMeanElapsedTime = elapsedTimes
        .stream()
        .mapToLong(x -> x)
        .average();
    System.out
        .println(String.format("Average time: %s [ms]", synchronizeMeanElapsedTime.getAsDouble()));

    var maxElapsedTime = elapsedTimes
        .stream()
        .mapToLong(x -> x)
        .max();
    System.out.println(String.format("Maximum time: %s [ms]", maxElapsedTime.getAsLong()));

    var minElapsedTime = elapsedTimes
        .stream()
        .mapToLong(x -> x)
        .min();
    System.out.println(String.format("Minimum time: %s [ms]", minElapsedTime.getAsLong()));

    // Results vary depending on the environment
    // C# implementation [ms]
    // average | min | max
    //    1.88 | 1   | 155

    // Java implementation [ms]
    //    1.07 | 0   | 85
  }

  @Test
  @Tag("WebServicesDependent")
  void verifyThatFileCanBeUploaded() throws ExecutionException, InterruptedException {
    var filename = "src/test/java/cdp4servicesdal/testdata/testfile.pdf";
    var files = Arrays.asList(filename);

    var contentHash = "F73747371CFD9473C19A0A7F99BCAB008474C4CA";
    var uri = URI.create("https://cdp4services-test.rheagroup.com");
    this.credentials = new Credentials("admin", "pass", uri, null);

    this.dal.open(this.credentials, this.cancelled).get();

    var engineeringModelIid = UUID.fromString("9ec982e4-ef72-4953-aa85-b158a95d8d56");
    var iterationIid = UUID.fromString("e163c5ad-f32b-4387-b805-f4b34600bc2c");
    var domainFileStoreIid = UUID.fromString("da7dddaa-02aa-4897-9935-e8d66c811a96");
    var fileIid = UUID.randomUUID();
    var fileRevisionIid = UUID.randomUUID();
    var domainOfExpertiseIid = UUID.fromString("0e92edde-fdff-41db-9b1d-f2e484f12535");
    var fileTypeIid = UUID.fromString("b16894e4-acb5-4e81-a118-16c00eb86d8f"); //PDF
    var participantIid = UUID.fromString("284334dd-e8e5-42d6-bc8a-715c507a7f02");

    var originalDomainFileStore = new cdp4common.dto.DomainFileStore(domainFileStoreIid, 0);
    originalDomainFileStore.addContainer(ClassKind.Iteration, iterationIid);
    originalDomainFileStore.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    var modifiedDomainFileStore = new cdp4common.dto.DomainFileStore(domainFileStoreIid, 0);
    modifiedDomainFileStore.getFile().add(fileIid);
    modifiedDomainFileStore.addContainer(ClassKind.Iteration, iterationIid);
    modifiedDomainFileStore.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    var file = new cdp4common.dto.File(fileIid, 0);
    file.setOwner(domainOfExpertiseIid);
    file.getFileRevision().add(fileRevisionIid);
    file.addContainer(ClassKind.DomainFileStore, domainFileStoreIid);
    file.addContainer(ClassKind.Iteration, iterationIid);
    file.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    var fileRevision = new cdp4common.dto.FileRevision(fileRevisionIid, 0);
    fileRevision.setName("testfile");
    fileRevision.setContentHash(contentHash);
    fileRevision.getFileType().add(new OrderedItem(1, fileTypeIid));
    fileRevision.setCreator(participantIid);
    fileRevision.addContainer(ClassKind.File, fileIid);
    fileRevision.addContainer(ClassKind.DomainFileStore, domainFileStoreIid);
    fileRevision.addContainer(ClassKind.Iteration, iterationIid);
    fileRevision.addContainer(ClassKind.EngineeringModel, engineeringModelIid);

    var context = String
        .format("/EngineeringModel/%s/iteration/%s", engineeringModelIid, iterationIid);
    var operationContainer = new OperationContainer(context, null);

    var updateCommonFileStoreOperation = new Operation(originalDomainFileStore,
        modifiedDomainFileStore, OperationKind.UPDATE);
    operationContainer.addOperation(updateCommonFileStoreOperation);

    var createFileOperation = new Operation(null, file, OperationKind.CREATE);
    operationContainer.addOperation(createFileOperation);

    var createFileRevisionOperation = new Operation(null, fileRevision, OperationKind.CREATE);
    operationContainer.addOperation(createFileRevisionOperation);

    assertDoesNotThrow(() -> dal.write(operationContainer, files).get());
  }

  @Test
  void verifyThatIsValidUriReturnsExpectedResult() {

    assertTrue(dal.isValidURI("http://cdp4services-test.rheagroup.com"));
    assertTrue(dal.isValidURI("https://cdp4services-test.rheagroup.com"));
    assertFalse(dal.isValidURI("file://some file"));
  }

  @Test
  void verifyThatSessionMustBeSetToReadIteration() {
    var iterationDto = new cdp4common.dto.Iteration(UUID.randomUUID(), 0);

    try {
      dal.setSession(null);
      dal.read(iterationDto, new AtomicBoolean(), null).get();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
      assertTrue(e.getCause() instanceof IllegalArgumentException);
    }
  }

  @Test
  void verifyThatWritingMultipleOperationContainersIsNotSupported() {

    this.setDalToBeOpen(dal);

    var contextOne = String
        .format("/EngineeringModel/%s/iteration/%s", UUID.randomUUID(), UUID.randomUUID());
    var contextTwo = String
        .format("/EngineeringModel/%s/iteration/%s", UUID.randomUUID(), UUID.randomUUID());

    var operationContainerOne = new OperationContainer(contextOne, null);
    var operationContainerTwo = new OperationContainer(contextTwo, null);

    List<OperationContainer> operationContainers = Arrays
        .asList(operationContainerOne, operationContainerTwo);

    assertThrows(NotImplementedException.class, () -> dal.write(operationContainers, null).get());
    assertThrows(NotImplementedException.class, () -> dal.write(operationContainers, null).get());
  }

  @Test
  @Tag("WebServicesDependent")
  void verify_that_opens_returns_expected_result()
      throws ExecutionException, InterruptedException {
    var uri = URI.create("https://cdp4services-test.rheagroup.com");
    this.credentials = new Credentials("admin", "pass", uri, null);

    var result = dal.open(this.credentials, new AtomicBoolean()).get();

    assertNotNull(result);
  }

  @Test
  @Tag("WebServicesDependent")
  @Tag("AppVeyorExclusion")
  void verify_that_opens_and_close_removes_items_from_cache()
      throws ExecutionException, InterruptedException {
    this.credentials = new Credentials("admin", "pass",
        URI.create("https://cdp4services-public.rheagroup.com"), null);

    this.session = new SessionImpl(dal, credentials);
    this.session.open().get();

    this.siteDirectory = session.getAssembler().retrieveSiteDirectory();
    this.engineeringModelSetup = this.siteDirectory.getModel()
        .stream()
        .filter(x -> x.getShortName().equals("LOFT"))
        .collect(MoreCollectors.onlyElement());

    this.iterationSetup = this.engineeringModelSetup.getIterationSetup()
        .stream()
        .findFirst()
        .orElseThrow();

    var domainOfExpertise = this.engineeringModelSetup.getActiveDomain()
        .stream()
        .filter(x -> x.getShortName().equals("SYS"))
        .findFirst()
        .orElseThrow();

    var openCount = this.session.getAssembler().getCache().size();

    var model = new EngineeringModel(this.engineeringModelSetup.getEngineeringModelIid(), null,
        null);
    this.iteration = new Iteration(this.iterationSetup.getIterationIid(), null, null);
    this.iteration.setContainer(model);

    this.session.read(iteration, domainOfExpertise).get();

    var readCount = this.session.getAssembler().getCache().size();
    assertTrue(readCount > openCount);

    this.session.closeIterationSetup(this.iterationSetup).get();

    var closeCount = this.session.getAssembler().getCache().size();

    assertTrue(closeCount < readCount);
  }

  //  TODO find a better way to test this on GitHub side, not only locally
//  @Test
  @Tag("WebServicesDependent")
  @Tag("AppVeyorExclusion")
  void verify_that_open_with_proxy_returns_expected_result()
      throws ExecutionException, InterruptedException {
    var proxySettings = new ProxySettings(URI.create("http://tinyproxy:8888"), null, null);

    var uri = URI.create("https://cdp4services-test.rheagroup.com");
    this.credentials = new Credentials("admin", "pass", uri, proxySettings);

    var result = dal.open(this.credentials, new AtomicBoolean()).get();

    assertNotNull(result);
  }

  @Test
  @Tag("WebServicesDependent")
  void verify_that_multiple_read_requests_can_be_made_in_parallel()
      throws ExecutionException, InterruptedException {
    var uri = URI.create("https://cdp4services-test.rheagroup.com");
    var credentials = new Credentials("admin", "pass", uri, null);

    var result = dal.open(credentials, new AtomicBoolean()).get();

    var siteDirectory = result
        .stream()
        .filter(x -> x instanceof cdp4common.dto.SiteDirectory)
        .map(x -> (cdp4common.dto.SiteDirectory) x)
        .collect(MoreCollectors.onlyElement());

    var queryAttributes = new QueryAttributesImpl();
    queryAttributes.setExtent(ExtentQueryAttribute.deep);

    for (int i = 0; i < 9; i++) {
      dal.read(siteDirectory, new AtomicBoolean(), queryAttributes);
    }

    var readResult = dal.read(siteDirectory, new AtomicBoolean(), null).get();
  }

  @Test
  @Tag("WebServicesDependent")
  void verify_that_person_can_be_Posted() throws ExecutionException, InterruptedException {
    var cdpServicesDal = new CdpServicesDal();
    var dtos = cdpServicesDal.open(this.credentials, this.cancelled).get();

    var siteDirectory = (cdp4common.dto.SiteDirectory) dtos
        .stream()
        .filter(x -> x.getClassKind() == ClassKind.SiteDirectory)
        .collect(MoreCollectors.onlyElement());

    var context = siteDirectory.getRoute();
    var operationContainer = new OperationContainer(context, siteDirectory.getRevisionNumber());

    var person = new cdp4common.dto.Person(UUID.randomUUID(), 1);
    person.setShortName(UUID.randomUUID().toString());
    person.setSurname(UUID.randomUUID().toString());
    person.setGivenName(UUID.randomUUID().toString());
    person.addContainer(ClassKind.SiteDirectory, siteDirectory.getIid());

    var operation1 = new Operation(null, person, OperationKind.CREATE);
    operationContainer.addOperation(operation1);

    var siteDirectoryClone = siteDirectory.deepClone(cdp4common.dto.SiteDirectory.class);
    siteDirectoryClone.getPerson().add(person.getIid());
    var operation2 = new Operation(siteDirectory, siteDirectoryClone, OperationKind.UPDATE);
    operationContainer.addOperation(operation2);

    var result = cdpServicesDal.write(operationContainer, null).get();

    var resultPerson = (cdp4common.dto.Person) result
        .stream()
        .filter(x -> x.getIid().equals(person.getIid()))
        .collect(MoreCollectors.onlyElement());

    assertNotNull(resultPerson);
  }

  /**
   * Set the credentials property so DAL appears to be open.
   *
   * @param dal The {@link CdpServicesDal} that is to be opened.
   */
  private void setDalToBeOpen(CdpServicesDal dal) {
    try {
      FieldUtils.writeField(dal, "credentials", this.credentials, true);
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}
