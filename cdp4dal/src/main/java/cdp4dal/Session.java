/*
 * Session.java
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

package cdp4dal;

import cdp4common.commondata.Thing;
import cdp4common.commondata.TopContainer;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.EngineeringModelSetup;
import cdp4common.sitedirectorydata.IterationSetup;
import cdp4common.sitedirectorydata.ModelReferenceDataLibrary;
import cdp4common.sitedirectorydata.Participant;
import cdp4common.sitedirectorydata.Person;
import cdp4common.sitedirectorydata.ReferenceDataLibrary;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import cdp4dal.dal.Credentials;
import cdp4dal.dal.Dal;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import cdp4dal.permission.PermissionService;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.apache.commons.lang3.tuple.Pair;

/**
 * The {@link Session} interface encapsulates an {@link Dal} and the associated {@link Assembler}.
 */
public interface Session {

  /**
   * Gets the {@link Credentials} that are use to connect to the data source.
   */
  Credentials getCredentials();

  /**
   * Gets all the {@link Participant}s that the active person is linked with.
   */
  List<Participant> getActivePersonParticipants();

  /**
   * Gets the {@link Dal} that the current {@link SessionImpl} communicates with.
   */
  Dal getDal();

  /**
   * Gets the version of the data-model that is supported by the connected {@link Dal}.
   */
  Version getDalVersion();

  /**
   * Asserts whether the {@link Version} is supported by the connected {@link Dal}.
   *
   * @param version The {@link Version} that is checked.
   * @return true if the version is supported, false if not.
   */
  boolean isVersionSupported(Version version);

  /**
   * Gets the {@link Assembler} associated with the current {@link Session} containing the Cache.
   */
  Assembler getAssembler();

  /**
   * Gets the active {@link Person} in this {@link Session}
   */
  Person getActivePerson();

  /**
   * Gets the {@link PermissionService} that handles access permissions for this cdp4dal.Session.
   */
  PermissionService getPermissionService();

  /**
   * Gets the uri of the connected data-source.
   */
  String getDataSourceUri();

  /**
   * Gets the name of the session which is the concatenation of the data-source uri and the active
   * person.
   */
  String getName();

  /**
   * Gets the list of {@link ReferenceDataLibrary} that are currently open in the running
   * application.
   */
  List<ReferenceDataLibrary> getOpenReferenceDataLibraries();

  /**
   * Gets the list of {@link Iteration}s that are currently open with the active {@link
   * DomainOfExpertise} and {@link Participant}.
   */
  ImmutableMap<Iteration, Pair<DomainOfExpertise, Participant>> getOpenIterations();

  /**
   * Retrieves the {@link SiteDirectory} in the context of the current session.
   *
   * @return The instance {@link SiteDirectory} that is loaded in the {@link Session}.
   */
  SiteDirectory retrieveSiteDirectory();

  /**
   * Queries the selected {@link DomainOfExpertise} from the session for provided current {@link
   * Iteration}.
   *
   * @param iteration The {@link Iteration} for which the selected {@link DomainOfExpertise} is
   * queried.
   * @return A {@link DomainOfExpertise} if has been selected for the {@link Iteration}, null
   * otherwise.
   */
  DomainOfExpertise querySelectedDomainOfExpertise(Iteration iteration);

  /**
   * Switches the current domain for an iteration.
   *
   * @param iterationId The iteration identifier.
   * @param domain The domain.
   */
  void switchDomain(UUID iterationId, DomainOfExpertise domain);

  /**
   * Convenience function to get the required reference data library chain for the passed in
   * engineeringModel.
   *
   * @param engineeringModel The engineering model.
   * @return Chain of required reference data libraries for this {@link EngineeringModel}.
   */
  List<ReferenceDataLibrary> getEngineeringModelRdlChain(EngineeringModel engineeringModel);

  /**
   * Convenience function to get the required reference data library chain for the passed in
   * engineeringModelSetup.
   *
   * @param engineeringModelSetup The engineering model setup.
   * @return Chain of required reference data libraries for this {@link EngineeringModelSetup}.
   */
  List<ReferenceDataLibrary> getEngineeringModelSetupRdlChain(
      EngineeringModelSetup engineeringModelSetup);

  /**
   * Open the underlying {@link Dal} and update the Cache with the retrieved objects. The {@link
   * CDPMessageBus} is used to send messages to notify listeners of {@link Thing}s that have been
   * added to the cache.
   *
   * @return The {@link CompletableFuture}.
   */
  CompletableFuture open();

  /**
   * Read an {@link Iteration} from the underlying {@link Dal} and set the active {@link
   * DomainOfExpertise} for the {@link Iteration}. The Cache is updated with the returned objects
   * and the {@link CDPMessageBus} is used to send messages to notify listeners of updates to the
   * Cache.
   *
   * @param iteration The {@link Iteration} to read.
   * @param domain The active {@link DomainOfExpertise} for the {@link Iteration}.
   * @return The {@link CompletableFuture}.
   */
  CompletableFuture read(Iteration iteration, DomainOfExpertise domain);

  /**
   * Read a {@link ReferenceDataLibrary} from the underlying {@link Dal}. The Cache is updated with
   * the returned objects and the {@link CDPMessageBus} is used to send messages to notify listeners
   * of updates to the Cache.
   *
   * @param rdl The {@link ReferenceDataLibrary} to read.
   * @return The {@link CompletableFuture}.
   */
  CompletableFuture read(ReferenceDataLibrary rdl);

  /**
   * Read a {@link Thing} in the associated {@link Dal}.
   *
   * @param thing The {@link Thing} to read.
   * @return The {@link CompletableFuture}.
   */
  CompletableFuture read(Thing thing);

  /**
   * Write all the {@link Operation}s from an {@link OperationContainer} asynchronously.
   *
   * @param operationContainer The provided {@link OperationContainer} to write.
   * @return The {@link CompletableFuture}.
   */
  CompletableFuture write(OperationContainer operationContainer);

  /**
   * Refreshes all the {@link TopContainer}s in the cache.
   *
   * @return The {@link CompletableFuture}.
   */
  CompletableFuture refresh();

  /**
   * Reloads all the {@link TopContainer}s the in cache.
   *
   * @return The {@link CompletableFuture}.
   */
  CompletableFuture reload();

  /**
   * Close the underlying {@link Dal} and clears the encapsulated {@link Assembler}.
   *
   * @return The {@link CompletableFuture}.
   */
  CompletableFuture close();

  /**
   * Cancel any Read or Open operation.
   */
  void cancel();

  /**
   * Close a {@link SiteReferenceDataLibrary} and all {@link SiteDirectory} that depends on it.
   *
   * @param sRdl The {@link SiteReferenceDataLibrary} to close.
   * @return The {@link CompletableFuture}.
   */
  CompletableFuture closeRdl(SiteReferenceDataLibrary sRdl);

  /**
   * Close a {@link IterationSetup} and its {@link ModelReferenceDataLibrary}.
   *
   * @param iterationSetup The iteration setup.
   * @return The {@link CompletableFuture}.
   */
  CompletableFuture closeIterationSetup(IterationSetup iterationSetup);

  /**
   * Close a {@link ModelReferenceDataLibrary}
   *
   * @param modelRdl The model RDL.
   * @return The {@link CompletableFuture}.
   */
  CompletableFuture closeModelRdl(ModelReferenceDataLibrary modelRdl);
}
