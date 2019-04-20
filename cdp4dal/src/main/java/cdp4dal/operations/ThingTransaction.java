/*
 * ThingTransaction.java
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

package cdp4dal.operations;

import cdp4common.commondata.Thing;
import cdp4common.commondata.TopContainer;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.types.OrderedItemList;
import cdp4dal.exceptions.TransactionException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang3.tuple.Pair;

/**
 * The interface {@link Thing} operations.
 */
public interface ThingTransaction {

  /**
   * Gets the added {@link Thing}s as an {@link ImmutableList}.
   */
  ImmutableList<Thing> getAddedThing();

  /**
   * Gets the deleted {@link Thing}s as an {@link ImmutableList}.
   */
  ImmutableList<Thing> getDeletedThing();

  /**
   * Gets the Updated {@link Thing}s as an {@link ImmutableMap} where the Key is the original {@link
   * Thing} and the value the cloned {@link Thing}.
   */
  ImmutableMap<Thing, Thing> getUpdatedThing();

  /**
   * Gets the copied {@link Thing}s as an {@link ImmutableMap}.
   */
  ImmutableMap<Pair<Thing, Thing>, OperationKind> getCopiedThing();

  /**
   * Registers the provided {@link Thing} to be created in the current transaction along with all
   * its potential contained {@link Thing}s.
   *
   * @param clone The {@link Thing} to create.
   * @param containerClone The clone of the container in which {@code clone} is added. {@code
   * containerClone} is only updated in the context where there are no sub-transaction.
   * @throws IllegalArgumentException Thrown if a {@link TopContainer} or {@link Iteration} is
   * registered.
   */
  void createDeep(Thing clone, Thing containerClone) throws TransactionException;

  /**
   * Register a deep copy operations for the {@link Thing}.
   *
   * @param deepClone The {@link Thing} to copy.
   * @param containerClone The container.
   */
  void copyDeep(Thing deepClone, Thing containerClone) throws TransactionException;

  /**
   * Registers the provided {@link Thing} to be created in the current transaction.
   *
   * @param clone The {@link Thing} to create.
   * @param containerClone The clone of the container in which {@code clone} is added.
   *
   * {@code containerClone} is only updated in the context where there are no sub-transaction.
   * @throws IllegalArgumentException Thrown if a {@link TopContainer} or {@link Iteration} is
   * registered.
   */
  void create(Thing clone, Thing containerClone) throws TransactionException;

  /**
   * Registers the provided {@link Thing} to be created or updated in the current transaction.
   *
   * @param clone The clone of the {@link Thing}.
   */
  void createOrUpdate(Thing clone) throws TransactionException;

  /**
   * Creates a {@link Thing} deletion operation.
   *
   * @param thing The clone of the {@link Thing} to delete.
   * @param containerClone The clone of the container (mandatory in dialogs).
   */
  void delete(Thing thing, Thing containerClone) throws TransactionException;

  /**
   * Registers the provided clone of a {@link Thing} as a copy with its destination.
   *
   * @param clone The {@link Thing} to copy.
   * @param containerDestinationClone The new container.
   * @param operationKind The {@link OperationKind} that specify the kind of copy operation.
   */
  void copy(Thing clone, Thing containerDestinationClone, OperationKind operationKind)
      throws TransactionException;

  /**
   * Registers the provided clone of a {@link Thing} as a copy.
   *
   * @param clone The {@link Thing} to copy.
   * @param operationKind The {@link OperationKind} that specify the kind of copy operation.
   */
  void copy(Thing clone, OperationKind operationKind);

  /**
   * Finalize the sub-transaction by updating all the containing {@link Thing}s.
   *
   * @param clone The {@link Thing} to update.
   * @param containerClone The new container of {@code clone}.
   * @param nextThing The next (following) {@link Thing} in an {@link OrderedItemList} where the new
   * {@link Thing} is created if {@code nextThing} is null, the {@code clone} is appended to the
   * list.
   */
  void finalizeSubTransaction(Thing clone, Thing containerClone, Thing nextThing)
      throws TransactionException;

  /**
   * Get the clone of the {@link Thing} used in the current {@link ThingTransaction}.
   *
   * @param thing The original {@link Thing}.
   * @return The clone of the {@link Thing}.
   */
  Thing getClone(Thing thing);

  /**
   * Get the last clone of a specified {@link Thing} with a specific id in the current chain of
   * operations.
   *
   * @param thing The {@link Thing}.
   * @return The last clone created if any, null otherwise.
   */
  Thing getLastCloneCreated(Thing thing);

  /**
   * Finalizes all operations that happened during this {@link ThingTransaction}.
   *
   * @return The {@link OperationContainer}.
   */
  OperationContainer finalizeTransaction();
}
