/*
 * DalBase.java
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

package cdp4dal.dal;

import static cdp4common.helpers.Utils.as;

import cdp4common.commondata.ClassKind;
import cdp4common.dto.Iteration;
import cdp4common.dto.Thing;
import cdp4common.helpers.Constants;
import cdp4common.helpers.ContainerPropertyHelper;
import cdp4common.helpers.EngineeringModelContainmentClassType;
import cdp4dal.Session;
import cdp4common.Version;
import cdp4dal.composition.DalExport;
import cdp4dal.exceptions.InvalidOperationContainerException;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import cdp4dal.utilities.StreamToHashComputer;
import com.google.common.base.Strings;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/**
 * An abstract Data Access Layer class.
 */
public abstract class DalBase implements Dal {
//TODO: the EngineeringModelKinds property should be generated from the model, the risk by coding it here is that
  // we forget to update this when we update the uml data-model. -> T1459

  /**
   * Initializes a new instance of the {@link Dal} class.
   */
  protected DalBase() {
    this.setCdpVersion();
  }

  /**
   * Gets the supported version of the data-model.
   */
  @Getter(onMethod = @__({@Override}))
  @Setter(AccessLevel.PRIVATE)
  private Version dalVersion;

  /**
   * Gets or sets the {@link Session} that uses this {@link Dal}.
   */
  @Getter(onMethod = @__({@Override}))
  @Setter
  private Session session;

  /**
   * Gets or sets the {@link Credentials} that are used to connect the data-store.
   */
  @Getter
  @Setter(AccessLevel.PROTECTED)
  private Credentials credentials;

  /**
   * Closes the active session
   */
  public void closeSession() {
    this.setCredentials(null);
  }

  /**
   * If the given URI ends with '/' remove it.
   *
   * @param uri The uri to clean up.
   * @return The {@link String} consisting of either the uri.
   */
  protected String cleanURIFinalSlash(String uri) {
    if (Strings.isNullOrEmpty(uri)) {
      return "";
    }

    return uri.endsWith("/") ? uri.substring(0, uri.length() - 1) : uri;
  }

  /**
   * Set the {@link Iteration} container id for all applicable {@link Thing}.
   *
   * @param dtos The {@link Thing} to set.
   * @param iterationId The iteration Id.
   * @throws NullPointerException if {@code dtos} is null.
   * @throws IllegalArgumentException if {@code iterationId} is null or empty.
   */
  public void setIterationContainer(@NonNull List<Thing> dtos, UUID iterationId) {
    if (iterationId == null || iterationId.equals(new UUID(0L, 0L))) {
      throw new IllegalArgumentException("The Iteration Id must be set.");
    }

    var engineeringModelContainmentClassKind = Arrays
        .asList(EngineeringModelContainmentClassType.CLASS_KIND_ARRAY);

    for (var thing : dtos.stream()
        .filter(x -> !engineeringModelContainmentClassKind.contains(x.getClassKind())).collect(
            Collectors.toList())) {
      // all the returned thing are iteration contained
      thing.setIterationContainerId(iterationId);
    }
  }

  /**
   * Extract the iteration containment id from the supplied uri.
   *
   * @param uri The uri route of the iteration contained resource.
   * @return {@link UUID} if iteration id was extracted from the uri, otherwise {@code null}.
   * @throws NullPointerException if {@code uri} is null.
   */
  public UUID tryExtractIterationIdFromURI(@NonNull URI uri) {
    try {
      var uriString = uri.toString();
      var iterationURIName = ContainerPropertyHelper.getContainerPropertyName(ClassKind.Iteration);
      var regexPattern =
          iterationURIName + Constants.URI_PATH_SEPARATOR + Constants.URI_UUID_PATTERN;

      Pattern pattern = Pattern.compile(regexPattern);
      Matcher matcher = pattern.matcher(uriString);

      if (!matcher.find()) {
        return null;
      }

      var elements = matcher.group().split(Constants.URI_PATH_SEPARATOR);
      return UUID.fromString(elements[elements.length - 1]);
    } catch (IllegalArgumentException ex) {
      return null;
    }
  }

  /**
   * Queries the request context from the uri which is either the route to an specific {@link
   * cdp4common.dto.SiteDirectory} or a specific {@link Iteration}.
   *
   * @param uri The {@link URI} to a 10-25 resource.
   * @return A String that represents the route to a specific {@link cdp4common.dto.SiteDirectory}
   * or {@link Iteration} using the following format: /SiteDirectory/{iid}.
   * /EngineeringModel/{iid}/iteration/{iid}
   */
  public String queryRequestContext(@NonNull URI uri) {
    var siteDirectoryPattern =
        "/SiteDirectory" + Constants.URI_PATH_SEPARATOR + Constants.URI_UUID_PATTERN;
    Pattern pattern = Pattern.compile(siteDirectoryPattern);
    Matcher matcher = pattern.matcher(uri.getPath());

    if (matcher.find()) {
      return matcher.group(0);
    }

    var iterationPattern =
        "/EngineeringModel" + Constants.URI_PATH_SEPARATOR + Constants.URI_UUID_PATTERN
            + Constants.URI_PATH_SEPARATOR + "iteration" + Constants.URI_PATH_SEPARATOR
            + Constants.URI_UUID_PATTERN;
    pattern = Pattern.compile(iterationPattern);
    matcher = pattern.matcher(uri.getPath());

    if (matcher.find()) {
      return matcher.group(0);
    }

    return uri.getPath();
  }

  /**
   * Verifies that the hash of the provided files matches the hashes of the {@link
   * cdp4common.dto.FileRevision} objects in the {@link OperationContainer}.
   *
   * @param operationContainer The {@link OperationContainer} that contains the {@link Operation}s
   * that need to be verified.
   * @param files The paths to the files whose sha1 hash needs to match the hash present in the
   * {@link OperationContainer}.
   * @throws InvalidOperationContainerException An {@link InvalidOperationContainerException} is
   * thrown when the {@link OperationContainer} does not contain an {@link Operation} that contains
   * a {@link cdp4common.dto.FileRevision} instant whose content hash matches the hash of the
   * provided {@code files}.
   */
  protected void operationContainerFileVerification(OperationContainer operationContainer,
      List<String> files) throws InvalidOperationContainerException {
    for (var file : files) {
      var hash = "";
      try (InputStream fileStream = Files.newInputStream(Path.of(file), StandardOpenOption.READ)) {
        hash = StreamToHashComputer.calculateSha1HashFromStream(fileStream);
      } catch (IOException e) {
        throw new InvalidOperationContainerException(
            String.format("Unable to read a file %s. Exception: %S", file, e.getMessage()));
      }

      var contentFoundInAnOperation = false;
      for (var operation : operationContainer.getOperations()) {
        var fileRevision = as(operation.getModifiedThing(), cdp4common.dto.FileRevision.class);
        if (fileRevision != null && fileRevision.getContentHash().toLowerCase().equals(hash.toLowerCase())) {
          contentFoundInAnOperation = true;
          break;
        }
      }

      if (!contentFoundInAnOperation) {
        throw new InvalidOperationContainerException(String
            .format("The hash of the specified file %s could not be found in the operation", file));
      }
    }
  }

  /**
   * Sets the CDP Version data model version that is supported by the current {@link Session}.
   *
   * In case the {@code dal} is not decorated with {@link DalExport} then the {@link Version} is set
   * to "1.0.0".
   */
  protected void setCdpVersion() {
    var dalExportAttribute = this.getClass().getAnnotationsByType(DalExport.class);
    if (dalExportAttribute.length > 0) {
      this.setDalVersion(new Version(dalExportAttribute[0].cdpVersion()));
    } else {
      this.setDalVersion(new Version("1.0.0"));
    }
  }
}
