/*
 * Dal.java
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

package cdp4dal.dal;

import cdp4common.Version;
import cdp4common.dto.EngineeringModel;
import cdp4common.dto.Iteration;
import cdp4common.dto.SiteDirectory;
import cdp4common.dto.Thing;
import cdp4dal.Session;
import cdp4dal.exceptions.InvalidOperationKindException;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import java.net.URI;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * The Data Access Layer interface.
 */
public interface Dal {

  /**
   * Gets the supported version of the data-model.
   */
  Version getDalVersion();

  /**
   * Gets the {@link Session} that uses this {@link Dal}.
   */
  Session getSession();

  /**
   * Sets the {@link Session} that uses this {@link Dal}.
   */
  void setSession(Session session);

  /**
   * Gets the value indicating whether this {@link Dal} is read only.
   *
   * @return {@code true} if this {@link Dal} is read only, otherwise {@code false}
   */
  boolean isReadOnly();

  /**
   * Write all the {@link Operation}s from all the {@link OperationContainer}s asynchronously.
   *
   * @param operationContainers The provided {@link OperationContainer} to write.
   * @param files The path to the files that need to be uploaded. If {@code files} is null, then no
   * files are to be uploaded.
   * @return A list of {@link Thing}s that has been created or updated since the last Read or Write
   * operation.
   */
  CompletableFuture<List<Thing>> write(List<OperationContainer> operationContainers,
      List<String> files);

  /**
   * Write all the {@link Operation}s from an {@link OperationContainer} asynchronously.
   *
   * @param operationContainer The provided {@link OperationContainer} to write.
   * @param files The path to the files that need to be uploaded. If {@code files} is null, then no
   * files are to be uploaded.
   * @return A list of {@link Thing}s that has been created or updated since the last Read or Write
   * operation.
   * @throws InvalidOperationKindException if unsupported operations are performed.
   */
  CompletableFuture<List<Thing>> write(OperationContainer operationContainer, List<String> files);

  /**
   * Reads the data related to the provided {@link Thing} from the data-source.
   *
   * @param <T> an type of {@link Thing}.
   * @param thing An instance of {@link Thing} that needs to be read from the data-source.
   * @param cancelled a flag that signals whether the thread should be cancelled or not.
   * @param queryAttributes An instance of {@link QueryAttributes} to be used with the request.
   * @return A list of {@link Thing} that are contained by the provided {@link Thing} including the
   * {@link Thing}.
   */
  <T extends Thing> CompletableFuture<List<Thing>> read(T thing, AtomicBoolean cancelled,
      QueryAttributes queryAttributes);

  /**
   * Reads the data related to the provided {@link Iteration} from the data-source.
   *
   * @param iteration An instance of {@link Iteration} that needs to be read from the data-source.
   * @param cancelled a flag that signals whether the thread should be cancelled or not.
   * @param queryAttributes An instance of {@link QueryAttributes} to be used with the request.
   * @return A list of {@link Thing} that are contained by the provided {@link EngineeringModel}
   * including the Reference-Data. All the {@link Thing}s that have been updated since the last read
   * will be returned.
   * @throws IllegalArgumentException when the {@link Session} property has not been set.
   */
  CompletableFuture<List<Thing>> read(Iteration iteration, AtomicBoolean cancelled,
      QueryAttributes queryAttributes);

  /**
   * Creates the specified {@link Thing} on the data-source.
   *
   * @param thing The {@link Thing} that is to be created.
   * @param <T> The type of {@link Thing}.
   * @return A list of {@link Thing} that have been created.
   */
  <T extends Thing> List<Thing> create(T thing);

  /**
   * Performs an update to the {@link Thing} on the data-source.
   *
   * @param thing The {@link Thing} that is to be updated.
   * @param <T> a type of {@link Thing}.
   * @return A list of {@link Thing} that have been updated.
   */
  <T extends Thing> List<Thing> update(T thing);

  /**
   * Deletes the specified {@link Thing} from the data-source.
   *
   * @param thing The {@link Thing} that is to be deleted.
   * @param <T> a type of {@link Thing}.
   * @return A list of {@link Thing} that have been updated since the last Read has been performed.
   */
  <T extends Thing> List<Thing> delete(T thing);

  /**
   * Opens a connection to a data-source {@link URI}.
   *
   * @param credentials The {@link Credentials} that are used to connect to the data source such as
   * username, password and {@link URI}.
   * @param cancelled a flag that signals whether the thread should be cancelled or not.
   * @return The {@link List} that the services return when connecting to the {@link
   * SiteDirectory}.
   */
  CompletableFuture<List<Thing>> open(Credentials credentials, AtomicBoolean cancelled);

  /**
   * Closes the connection to the data-source.
   */
  void close();

  /**
   * Assertion that the provided String is a valid {@link URI} to connect to a data-source with the
   * current implementation of the {@link Dal}
   *
   * @param uri a String representing a {@link URI }
   * @return true when valid, false when invalid
   */
  boolean isValidURI(String uri);
}
