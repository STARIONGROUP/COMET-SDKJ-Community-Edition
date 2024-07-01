/*
 * WSPDal.java
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

import cdp4common.dto.Person;
import cdp4common.dto.ReferenceDataLibrary;
import cdp4common.dto.Thing;
import cdp4common.exceptions.IncompleteModelException;
import cdp4common.sitedirectorydata.EngineeringModelSetup;
import cdp4common.sitedirectorydata.IterationSetup;
import cdp4common.sitedirectorydata.ModelReferenceDataLibrary;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4dal.UriUtils;
import cdp4dal.composition.DalExport;
import cdp4dal.composition.DalType;
import cdp4dal.dal.Credentials;
import cdp4dal.dal.Dal;
import cdp4dal.dal.DalBase;
import cdp4dal.dal.QueryAttributes;
import cdp4dal.dal.ecss1025annexc.ExtentQueryAttribute;
import cdp4dal.dal.ecss1025annexc.QueryAttributesImpl;
import cdp4dal.exceptions.DalReadException;
import cdp4dal.exceptions.DalWriteException;
import cdp4dal.exceptions.InvalidOperationKindException;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import cdp4dal.operations.OperationKind;
import cdp4dal.operations.OperationUtils;
import cdp4jsonserializer.Cdp4JsonSerializer;
import cdp4jsonserializer.Cdp4JsonSerializerImpl;
import com.google.common.base.Stopwatch;
import com.google.common.base.Strings;
import com.google.common.collect.MoreCollectors;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.NotImplementedException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClientBuilder;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.message.BasicHeader;

/**
 * Provides the Data Access LAyer for OCDT's WSP.
 */
@Log4j2
@DalExport(name = "OCDT WSP", description = "An OCDT WSP Data Access Layer", cdpVersion = "1.0.0", dalType = DalType.WEB)
public class WSPDal extends DalBase {

  /**
   * The {@link CloseableHttpAsyncClient} that is reused for each HTTP request by the current {@link
   * Dal}.
   */
  private CloseableHttpAsyncClient httpClient;

  /**
   * Initializes a new instance of the {@link WSPDal} class.
   */
  public WSPDal() {
    this.serializer = new Cdp4JsonSerializerImpl(this.getDalVersion());
  }

  /**
   * Gets or sets the {@link Cdp4JsonSerializer}
   */
  @Getter
  private Cdp4JsonSerializer serializer;

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isReadOnly() {
    return false;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<List<Thing>> write(OperationContainer operationContainer,
      List<String> files) {
    return CompletableFuture.supplyAsync(() -> {
      if (this.getCredentials() == null || this.getCredentials().getUri() == null) {
        throw new IllegalArgumentException("The CDP4 DAL is not open.");
      }

      if (operationContainer == null) {
        throw new NullPointerException("The operationContainer may not be null");
      }

      Stopwatch watch = Stopwatch.createStarted();

      boolean hasCopyValuesOperations = operationContainer.getOperations()
          .stream()
          .anyMatch(op -> OperationUtils.isCopyKeepOriginalValuesOperation(op.getOperationKind()));

      OperationModifier modifier = new OperationModifier(this.getSession());
      CopyOperationHandler copyHandler = new CopyOperationHandler(this.getSession());

      copyHandler.modifiedCopyOperation(operationContainer);
      modifier.modifyOperationContainer(operationContainer);

      boolean invalidOperationKind = operationContainer.getOperations()
          .stream()
          .anyMatch(
              operation -> operation.getOperationKind() == OperationKind.MOVE || OperationUtils
                  .isCopyOperation(operation.getOperationKind()));

      if (invalidOperationKind) {
        throw new InvalidOperationKindException(
            "The WSP DAL does not support Copy or Move operations");
      }

      List<Thing> result = new ArrayList<>();

      if (files != null && !files.isEmpty()) {
        this.operationContainerFileVerification(operationContainer, files);
      }

      QueryAttributesImpl attribute = new QueryAttributesImpl();
      attribute.setRevisionNumber(operationContainer.getTopContainerRevisionNumber());

      String postToken = operationContainer.getToken();
      String resourcePath = operationContainer.getContext() + attribute.toString();
      URI uri;
      try {
        uri = new URIBuilder(this.getCredentials().getUri()).setPath(resourcePath).build();
      } catch (URISyntaxException e) {
        e.printStackTrace();
        log.error(e.getMessage());
        throw new IncompleteModelException(
            "It is impossible to create URI to request a service.");
      }
      log.debug("WSP Dal POST: {} - {}", postToken, uri);

      HttpPost requestContent;
      try {
        requestContent = this.createHttpPost(postToken, operationContainer, files);
      } catch (IOException e) {
        e.printStackTrace();
        throw new RuntimeException(e.getMessage());
      }

      Stopwatch requestSw = Stopwatch.createStarted();

      requestContent.setURI(uri);
      try {
        Future<HttpResponse> future = this.httpClient.execute(requestContent, null);
        HttpResponse response = future.get();
        requestSw.stop();
        log.info("The ECSS-E-TM-10-25A Annex C Services responded in {} [ms] to POST {}",
            requestSw.elapsed(TimeUnit.MILLISECONDS),
            postToken);

        if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
          String errorResponse;

          try (BufferedReader br = new BufferedReader(
              new InputStreamReader(response.getEntity().getContent()))) {
            errorResponse = br.lines().collect(Collectors.joining(System.lineSeparator()));
          }

          String msg = String.format(
              "The The ECSS-E-TM-10-25A Annex C Services replied with code %s: %s: %s",
              response.getStatusLine().getStatusCode(), response.getStatusLine().getReasonPhrase(),
              errorResponse);
          log.error(msg);
          throw new DalWriteException(msg);
        }

        result.addAll(this.serializer.deserialize(response.getEntity().getContent()));

        UUID iterationId = this.tryExtractIterationIdFromURI(uri);
        if (iterationId != null) {
          this.setIterationContainer(result, iterationId);
        }
      } catch (IOException e) {
        e.printStackTrace();
        log.error(e.getMessage());
        throw new RuntimeException("There probably was a problem or the connection was aborted.");
      } catch (InterruptedException e) {
        e.printStackTrace();
        log.error(e.getMessage());
        throw new RuntimeException("The thread with a request was interrupted.");
      } catch (ExecutionException e) {
        e.printStackTrace();
        log.error(e.getMessage());
        throw new RuntimeException("There probably was an exception during a request.");
      }

      // Update value-sets
      if (hasCopyValuesOperations) {
        ValueSetOperationCreator valueSetCopyHandler = new ValueSetOperationCreator(this.getSession());
        OperationContainer valueSetOperationContainer = valueSetCopyHandler
            .createValueSetsUpdateOperations(operationContainer.getContext(), result,
                copyHandler.getCopyThingMap());
        List<Thing> valueSetResult = this.write(valueSetOperationContainer, null).join();

        // merge dtos
        for (Thing valueSetDto : valueSetResult) {
          Optional<Thing> element = result.stream().filter(x -> x.getIid().equals(valueSetDto.getIid()))
              .findFirst();
          if (element.isPresent()) {
            int index = result.indexOf(element.get());
            if (index >= 0) {
              result.set(index, valueSetDto);
            }
          }
        }
      }

      watch.stop();
      log.info("Write Operation completed in {} [ms]", watch.elapsed(TimeUnit.MILLISECONDS));

      return result;
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<List<Thing>> write(List<OperationContainer> operationContainer,
      List<String> files) {
    throw new NotImplementedException(
        "Writing multiple OperationContainers to the data-source is not supported.");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<List<Thing>> read(cdp4common.dto.Iteration iteration,
      AtomicBoolean cancelled, QueryAttributes queryAttributes) {
    return CompletableFuture.supplyAsync(() -> {
      if (this.getSession() == null) {
        throw new IllegalArgumentException(
            "The Session may not be null and must be set prior to reading an Iteration.");
      }

      // Get the RequiredRdl to load
      SiteDirectory siteDirectory = this.getSession().getAssembler().retrieveSiteDirectory();
      Optional<IterationSetup> iterationSetup = siteDirectory.getModel()
          .stream()
          .flatMap(mod -> mod.getIterationSetup().stream())
          .filter(it -> it.getIterationIid().equals(iteration.getIid()))
          .collect(MoreCollectors.toOptional());

      if (!iterationSetup.isPresent()) {
        throw new IllegalArgumentException(
            "The Iteration to open does not have any associated IterationSetup.");
      }

      EngineeringModelSetup modelSetup = (EngineeringModelSetup) iterationSetup.get().getContainer();
      Optional<ModelReferenceDataLibrary> modelReferenceDataLibrary = modelSetup.getRequiredRdl()
          .stream()
          .collect(MoreCollectors.toOptional());

      if (!modelReferenceDataLibrary.isPresent()) {
        throw new IllegalArgumentException(
            "The model to open does not have a Required Reference-Data-Library.");
      }

      Thing modelReferenceDataLibraryDto = modelReferenceDataLibrary.get().toDto();

      List<Thing> result = new ArrayList<>();
      List<Thing> referenceData = this.read(modelReferenceDataLibraryDto, cancelled, null).join();
      result.addAll(referenceData);

      List<Thing> engineeringModelData = this.read((Thing) iteration, cancelled, null).join();
      result.addAll(engineeringModelData);

      return result;
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <T extends Thing> CompletableFuture<List<Thing>> read(T thing, AtomicBoolean cancelled,
      QueryAttributes queryAttributes) {
    return CompletableFuture.supplyAsync(() -> {
      if (this.getCredentials() == null || this.getCredentials().getUri() == null) {
        throw new IllegalArgumentException("The WSPDal is not open.");
      }

      if (thing == null) {
        throw new NullPointerException("The thing may not be null");
      }

      Stopwatch watch = Stopwatch.createStarted();

      List<Thing> result = new ArrayList<>();

      String thingRoute = this.cleanURIFinalSlash(thing.getRoute());

      QueryAttributes attributes = queryAttributes;
      if (attributes == null) {
        boolean includeReferenceData = thing instanceof ReferenceDataLibrary;

        attributes = this.getURIQueryAttributes(includeReferenceData);
      }

      String resourcePath = String.format("%s%s", thingRoute, attributes.toString());

      String readToken = cdp4common.helpers.TokenGenerator.generateRandomToken();
      URIBuilder uriBuilder = new URIBuilder(this.getCredentials().getUri());
      uriBuilder.setPath(resourcePath);
      log.debug("WSP GET {}: {}", readToken, uriBuilder.toString());

      Stopwatch requestsw = Stopwatch.createStarted();

      try {
        URI uri = uriBuilder.build();
        HttpGet requestMessage = new HttpGet(uri);

        Future<HttpResponse> future = this.httpClient.execute(requestMessage, null);

        // Check whether a request was cancelled
        while (!future.isDone()) {
          if (cancelled.get()) {
            requestMessage.abort();

            return new ArrayList<>();
          }

          TimeUnit.MILLISECONDS.sleep(10);
        }

        HttpResponse response = future.get();

        requestsw.stop();
        log.info("The ECSS-E-TM-10-25A Annex C Services responded in {} [ms] to GET {}",
            requestsw.elapsed(TimeUnit.MILLISECONDS),
            readToken);

        if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
          String msg = String.format("The data-source replied with code %s: %s",
              response.getStatusLine().getStatusCode(), response.getStatusLine().getReasonPhrase());
          log.error(msg);
          throw new DalReadException(msg);
        }

        result.addAll(this.serializer.deserialize(response.getEntity().getContent()));

        UUID iterationId = this.tryExtractIterationIdFromURI(uri);
        if (iterationId != null) {
          this.setIterationContainer(result, iterationId);
        }

      } catch (InterruptedException e) {
        e.printStackTrace();
        log.error(e.getMessage());
        throw new RuntimeException("A running thread was unexpectedly interrupted.");
      } catch (IOException e) {
        e.printStackTrace();
        log.error(e.getMessage());
        throw new RuntimeException(
            "There probably was a problem with response deserialization  or access to input stream.");
      } catch (URISyntaxException e) {
        e.printStackTrace();
        log.error(e.getMessage());
        throw new RuntimeException("Unable to create a URI for a request.");
      } catch (ExecutionException e) {
        e.printStackTrace();
        log.error(e.getMessage());
        throw new RuntimeException("There was an exception during a request.");
      }

      watch.stop();
      log.info("JSON Deserializer completed in {} [ms]",
          watch.elapsed(TimeUnit.MILLISECONDS));

      return result;
    });
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <T extends Thing> List<Thing> create(T thing) {
    throw new UnsupportedOperationException(
        "The Create operation is not supported by the WSP.");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <T extends Thing> List<Thing> update(T thing) {
    throw new UnsupportedOperationException(
        "The Update operation is not supported by the WSP.");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <T extends Thing> List<Thing> delete(T thing) {
    throw new UnsupportedOperationException(
        "The Delete operation is not supported by the WSP.");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<List<Thing>> open(Credentials credentials, AtomicBoolean cancelled) {
    return CompletableFuture.supplyAsync(() -> {
      if (credentials == null) {
        throw new NullPointerException("The credentials may not be null");
      }

      if (credentials.getUri() == null) {
        throw new NullPointerException("The Credentials URI may not be null");
      }

      List<Thing> result = new ArrayList<>();

      UriUtils.assertUriIsHttpOrHttpsSchema(credentials.getUri());

      QueryAttributesImpl queryAttributes = new QueryAttributesImpl();
      queryAttributes.setExtent(ExtentQueryAttribute.deep);
      queryAttributes.setIncludeReferenceData(false);

      String resourcePath = String.format("SiteDirectory%s", queryAttributes.toString());

      String openToken = cdp4common.helpers.TokenGenerator.generateRandomToken();

      this.httpClient = this.createHttpClient(credentials);

      Stopwatch watch = Stopwatch.createStarted();

      URIBuilder uriBuilder = new URIBuilder(credentials.getUri());
      uriBuilder.setPath(resourcePath);
      log.debug("WSP Open {}: {}", openToken, uriBuilder);

      Stopwatch requestsw = Stopwatch.createStarted();

      try {
        URI uri = uriBuilder.build();
        HttpGet requestMessage = new HttpGet(uri);

        Future<HttpResponse> future = this.httpClient.execute(requestMessage, null);

        // Check whether a request was cancelled
        while (!future.isDone()) {
          if (cancelled.get()) {
            requestMessage.abort();

            return new ArrayList<>();
          }

          TimeUnit.MILLISECONDS.sleep(10);
        }

        HttpResponse response = future.get();

        requestsw.stop();
        log.info("The ECSS-E-TM-10-25A Annex C Services responded in {} [ms] to Open {}",
            requestsw.elapsed(TimeUnit.MILLISECONDS),
            openToken);

        if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
          String msg = String.format("The data-source replied with code %s: %s",
              response.getStatusLine().getStatusCode(), response.getStatusLine().getReasonPhrase());
          log.error(msg);
          throw new DalReadException(msg);
        }

        watch.stop();
        log.info("WSP DAL Open {}: {} completed in {} [ms]", openToken, uriBuilder,
            watch.elapsed(TimeUnit.MILLISECONDS));

        watch = Stopwatch.createStarted();

        result.addAll(this.serializer.deserialize(response.getEntity().getContent()));

        watch.stop();
        log.info("JSON Deserializer completed in {} [ms]", watch.elapsed(TimeUnit.MILLISECONDS));

        Optional<Person> returnedPerson = result
            .stream()
            .filter(x -> x instanceof cdp4common.dto.Person)
            .map(x -> (cdp4common.dto.Person) x)
            .filter(x -> x.getShortName().equals(credentials.getUserName()))
            .collect(MoreCollectors.toOptional());

        if (!returnedPerson.isPresent()) {
          throw new IllegalArgumentException("User not found.");
        }

        this.setCredentials(credentials);
      } catch (InterruptedException e) {
        e.printStackTrace();
        log.error(e.getMessage());
        throw new RuntimeException("A running thread was unexpectedly interrupted.");
      } catch (ExecutionException e) {
        e.printStackTrace();
        log.error(e.getMessage());
        throw new RuntimeException("There was an exception during a request.");
      } catch (URISyntaxException e) {
        e.printStackTrace();
        log.error(e.getMessage());
        throw new RuntimeException("Unable to create a URI for a request.");
      } catch (IOException e) {
        e.printStackTrace();
        log.error(e.getMessage());
        throw new RuntimeException(
            "There probably was a problem with response deserialization or access to input stream.");
      }

      return result;
    });
  }

  /**
   * Create a new {@link CloseableHttpAsyncClient}.
   *
   * @param credentials The {@link Credentials} used to set the connection and authentication
   * settings as well as the proxy server settings.
   * @return An instance of {@link HttpClient} with the DefaultRequestHeaders set.
   */
  private CloseableHttpAsyncClient createHttpClient(Credentials credentials) {
    HttpAsyncClientBuilder result;

    if (credentials.getProxySettings() == null) {
      log.debug("Creating HttpClient without proxy.");
      result = HttpAsyncClients.custom();
    } else {
      log.debug("Creating HttpClient with proxy: {}", credentials.getProxySettings().getAddress());
      HttpHost proxy = HttpHost.create(credentials.getProxySettings().getAddress().toASCIIString());

      //Creating the CredentialsProvider object
      CredentialsProvider credentialsProvider = new BasicCredentialsProvider();

      if (!Strings.isNullOrEmpty(credentials.getProxySettings().getUserName())) {
        //Setting the credentials
        credentialsProvider.setCredentials(new AuthScope(proxy),
            new UsernamePasswordCredentials(credentials.getProxySettings().getUserName(),
                credentials.getProxySettings().getPassword()));
      }

      result = HttpAsyncClients
          .custom()
          .setDefaultCredentialsProvider(credentialsProvider)
          .setProxy(proxy);
    }

    result.setDefaultHeaders(Arrays.asList(
        new BasicHeader(HttpHeaders.ACCEPT, "application/json"),
        new BasicHeader(HttpHeaders.AUTHORIZATION, "Basic " + Base64.getEncoder()
            .encodeToString(String.format("%s:%s", credentials.getUserName(),
                credentials.getPassword()).getBytes(StandardCharsets.US_ASCII))),
        new BasicHeader(HttpHeaders.USER_AGENT, "CDP4 (ECSS-E-TM-10-25 Annex C.2) WspDal")
    ));

    CloseableHttpAsyncClient client = result.build();
    client.start();

    return client;
  }

  /**
   * Creates {@link HttpPost} for a request.
   *
   * @param token The POST token that is used to track the POST request.
   * @param operationContainer The {@link OperationContainer} that contains the {@link Operation}s
   * that are part of the transaction that is sent to the DAL.
   * @param files A list of file-paths that is used to construct the {@link HttpPost}.
   * @return An instance of {@link HttpPost}.
   * @throws IOException if there is a problem with serialization or {@code outputStream} access.
   */
  private HttpPost createHttpPost(String token, OperationContainer operationContainer,
      List<String> files)
      throws IOException {
    HttpPost post = new HttpPost();

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    this.constructPostRequestBodyStream(token, operationContainer, outputStream);

    if (files == null) {
      HttpEntity body = EntityBuilder
          .create()
          .setBinary(outputStream.toByteArray())
          .setContentType(ContentType.APPLICATION_JSON.withCharset(""))
          .build();
      post.setEntity(body);

      return post;
    } else {
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      builder.addBinaryBody("files[]", outputStream.toByteArray(),
          ContentType.APPLICATION_JSON.withCharset(""),
          "jsonFile");

      for (String fileName : files) {
        File file = new File(fileName);
        builder.addBinaryBody("files[]", new FileInputStream(file),
            ContentType.APPLICATION_OCTET_STREAM.withCharset(""),
            String.format("attachment; filename=\"%s\"", fileName));
      }

      post.setEntity(new BufferedHttpEntity(builder.build()));

      return post;
    }
  }

  /**
   * Constructs the JSON stream containing the full POST body of the given {@link
   * OperationContainer}.
   *
   * @param token The POST token that is used to track the POST request in a log.
   * @param operationContainer The {@link OperationContainer} that is serialized to a JSON stream.
   * @param outputStream The stream to which is written.
   * @throws IOException if there is a problem with serialization or {@code outputStream} access.
   */
  void constructPostRequestBodyStream(String token, OperationContainer operationContainer,
      ByteArrayOutputStream outputStream)
      throws IOException {
    WSPPostOperation postOperation = new WSPPostOperation();

    // add the simple operations to the WSP container
    for (Operation operation : operationContainer.getOperations()) {
      postOperation.constructFromOperation(operation);
    }

    this.serializer.serializeToStream(postOperation, outputStream);

    if (log.isTraceEnabled()) {
      log.trace("POST JSON BODY {} /r/n {}", token, outputStream.toString());
    }
  }

  /**
   * Closes the connection to an active WSP. Disposes of the underlying {@link HttpClient}.
   *
   * @throws IllegalArgumentException If the Data Access Layer is already closed.
   */
  @Override
  public void close() {
    if (this.getCredentials() == null) {
      throw new IllegalArgumentException(
          "An already closed Data Access Layer may not be closed again.");
    }

    if (this.httpClient != null) {
      try {
        this.httpClient.close();
      } catch (IOException e) {
        e.printStackTrace();
        log.error("There was a problem with closing the HttpClient with the message {}.",
            e.getMessage());
      }
      this.httpClient = null;
    }

    this.closeSession();
  }

  /**
   * Assertion that the provided String is a valid {@link URI} to connect to a data-source with the
   * current implementation of the {@link Dal}. Only HTTP and HTTPS are valid.
   *
   * @param uri a string representing a {@link URI}.
   * @return {@code true} when valid, {@code false} when invalid.
   */
  @Override
  public boolean isValidURI(String uri) {
    try {
      URI validURIAssertion = new URI(uri);
      UriUtils.assertUriIsHttpOrHttpsSchema(validURIAssertion);
      return true;
    } catch (IllegalArgumentException | URISyntaxException e) {
      return false;
    }
  }

  /**
   * Gets the {@link QueryAttributes} associated to the {@link WSPDal}.
   *
   * @param includeReferenceData Assertion to include reference data or not.
   * @return the {@link QueryAttributes}.
   */
  private QueryAttributes getURIQueryAttributes(boolean includeReferenceData) {
    QueryAttributesImpl queryAttributes = new QueryAttributesImpl();
    queryAttributes.setExtent(ExtentQueryAttribute.deep);
    queryAttributes.setIncludeAllContainers(true);

    if (includeReferenceData) {
      queryAttributes.setIncludeReferenceData(true);
    }

    return queryAttributes;
  }
}
