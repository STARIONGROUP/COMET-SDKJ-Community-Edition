/*
 * DalStubExport.java
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

import cdp4common.dto.EngineeringModel;
import cdp4common.dto.Iteration;
import cdp4common.dto.SiteDirectory;
import cdp4common.dto.Thing;
import cdp4dal.Session;
import cdp4dal.composition.DalExport;
import cdp4dal.composition.DalType;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import java.net.URI;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.lang3.NotImplementedException;

@DalExport(name = "CDP4", description = "CDP4 Webservices", cdpVersion = "1.1.0", dalType = DalType.WEB)
public class DalStubExport extends DalBase {

  /**
   * Sets the {@link Session} that uses this {@link Dal}.
   */
  @Override
  public void setSession(Session session) {
    throw new NotImplementedException("A stub.");
  }

  @Override
  public boolean isReadOnly() {
    return false;
  }

  /**
   * Write all the {@link Operation}s from all the {@link OperationContainer}s asynchronously.
   *
   * @param operationContainers The provided {@link OperationContainer} to write.
   * @param files The path to the files that need to be uploaded. If {@code files} is null, then no
   * files are to be uploaded.
   * @return A list of {@link Thing}s that has been created or updated since the last Read or Write
   * operation.
   */
  @Override
  public CompletableFuture<List<Thing>> write(List<OperationContainer> operationContainers,
      List<String> files) {
    throw new NotImplementedException("A stub.");
  }

  /**
   * Write all the {@link Operation}s from an {@link OperationContainer} asynchronously.
   *
   * @param operationContainer The provided {@link OperationContainer} to write.
   * @param files The path to the files that need to be uploaded. If {@code files} is null, then no
   * files are to be uploaded.
   * @return A list of {@link Thing}s that has been created or updated since the last Read or Write
   * operation.
   */
  @Override
  public CompletableFuture<List<Thing>> write(OperationContainer operationContainer,
      List<String> files) {
    throw new NotImplementedException("A stub.");
  }

  /**
   * Reads the data related to the provided {@link Thing} from the data-source.
   *
   * @param <T> an type of {@link Thing}.
   * @param thing An instance of {@link Thing} that needs to be read from the data-source.
   * @param cancelled a flag that signals whether the thread should be cancelled or not.
   * @param attributes An instance of {@link QueryAttributes} to be used with the request.
   * @return A list of {@link Thing} that are contained by the provided {@link Thing} including the
   * {@link Thing}.
   */
  @Override
  public <T extends Thing> CompletableFuture<List<Thing>> read(T thing, AtomicBoolean cancelled,
      QueryAttributes attributes) {
    throw new NotImplementedException("A stub.");
  }

  /**
   * Reads the data related to the provided {@link Iteration} from the data-source.
   *
   * @param iteration An instance of {@link Iteration} that needs to be read from the data-source.
   * @param cancelled a flag that signals whether the thread should be cancelled or not.
   * @param attributes An instance of {@link QueryAttributes} to be used with the request.
   * @return A list of {@link Thing} that are contained by the provided {@link EngineeringModel}
   * including the Reference-Data. All the {@link Thing}s that have been updated since the last read
   * will be returned.
   */
  @Override
  public CompletableFuture<List<Thing>> read(Iteration iteration, AtomicBoolean cancelled,
      QueryAttributes attributes) {
    throw new NotImplementedException("A stub.");
  }

  /**
   * Creates the specified {@link Thing} on the data-source.
   *
   * @param thing The {@link Thing} that is to be created.
   * @param <T> The type of {@link Thing}.
   * @return A list of {@link Thing} that have been created.
   */
  @Override
  public <T extends Thing> List<Thing> create(T thing) {
    throw new NotImplementedException("A stub.");
  }

  /**
   * Performs an update to the {@link Thing} on the data-source.
   *
   * @param thing The {@link Thing} that is to be updated.
   * @param <T> a type of {@link Thing}.
   * @return A list of {@link Thing} that have been updated.
   */
  @Override
  public <T extends Thing> List<Thing> update(T thing) {
    throw new NotImplementedException("A stub.");
  }

  /**
   * Deletes the specified {@link Thing} from the data-source.
   *
   * @param thing The {@link Thing} that is to be deleted.
   * @param <T> a type of {@link Thing}.
   * @return A list of {@link Thing} that have been updated since the last Read has been performed.
   */
  @Override
  public <T extends Thing> List<Thing> delete(T thing) {
    throw new NotImplementedException("A stub.");
  }

  /**
   * Opens a connection to a data-source {@link URI}.
   *
   * @param credentials The {@link Credentials} that are used to connect to the data source such as
   * username, password and {@link URI}.
   * @param cancelled a flag that signals whether the thread should be cancelled or not.
   * @return The {@link List {T}} that the services return when connecting to the {@link
   * SiteDirectory}.
   */
  @Override
  public CompletableFuture<List<Thing>> open(Credentials credentials, AtomicBoolean cancelled) {
    throw new NotImplementedException("A stub.");
  }

  /**
   * Closes the connection to the data-source.
   */
  @Override
  public void close() {
    throw new NotImplementedException("A stub.");
  }

  /**
   * Assertion that the provided String is a valid {@link URI} to connect to a data-source with the
   * current implementation of the {@link Dal}
   *
   * @param uri a String representing a {@link URI }
   * @return true when valid, false when invalid
   */
  @Override
  public boolean isValidURI(String uri) {
    throw new NotImplementedException("A stub.");
  }
}
