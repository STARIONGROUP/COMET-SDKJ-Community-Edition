/*
 * ThingTransactionImpl.java
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

import cdp4common.ChangeKind;
import cdp4common.commondata.DeprecatableThing;
import cdp4common.commondata.Thing;
import cdp4common.commondata.TopContainer;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.sitedirectorydata.SiteDirectory;
import cdp4common.types.ContainerList;
import cdp4common.types.OrderedItemList;
import cdp4dal.StringUtils;
import cdp4dal.exceptions.TransactionException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.MoreCollectors;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.apache.commons.lang3.tuple.Pair;

/**
 * The Transaction class contains all requests for the creations, updates, deletions of things.
 */
@Log4j2
@Getter
public class ThingTransactionImpl extends Transaction {

  /**
   * The parent {@link Transaction}.
   */
  @Getter(AccessLevel.PROTECTED)
  private final Transaction parentTransaction;

  /**
   * The clone of the {@link Thing} associated with the current {@link ThingTransaction}.
   */
  @Getter(AccessLevel.PROTECTED)
  private final Thing associatedClone;

  /**
   * Gets the {@link TransactionContext}.
   */
  @Getter(AccessLevel.PROTECTED)
  private TransactionContext transactionContext;

  /**
   * Initializes a new instance of the {@link ThingTransaction} class.
   *
   * @param transactionContext The {@link SiteDirectory} or {@link Iteration} that represents the
   * {@link Thing} the current {@link ThingTransaction} is operated on.
   * @param clone In the context of sub-transactions: The clone of the {@link Thing} associated with
   * the root {@link ThingTransaction}. This clone shall be the clone of the highest {@link Thing}
   * in the chain of operations if not null. The clone is added in the list of updated things if not
   * null. In the context of a single transaction: The clone of a {@link Thing} to add or update.
   *
   * In the context of sub-transactions, this constructor shall be used for the root-transaction.
   */
  public ThingTransactionImpl(TransactionContext transactionContext, Thing clone)
      throws TransactionException {
    super();
    if (transactionContext == null) {
      throw new NullPointerException("The transactionContext may not be null");
    }

    this.transactionContext = transactionContext;
    this.parentTransaction = null;

    if (clone != null) {
      this.associatedClone = clone;
      this.createOrUpdate(clone);
    } else {
      this.associatedClone = null;
    }
  }

  /**
   * Initializes a new instance of the {@link ThingTransactionImpl} class. In the context of
   * sub-transactions: This constructor shall be used for sub-transactions. The {@code clone} is the
   * associated clone for the current transaction. The {@code parentTransaction} shall not be null.
   * The {@code containerClone} may be null. In the context of a single-transaction: The {@code
   * clone} is added to the list of added or updated thing {@code parentTransaction} shall be null.
   * {@code containerClone} shall not be null as it is added as well and updated with the clone.
   *
   * @param clone The clone of the {@link Thing} to add or update.
   * @param parentTransaction The parent {@link Transaction}.
   * @param containerClone The container {@link Thing} for the current added or updated operation.
   */
  public ThingTransactionImpl(Thing clone, Transaction parentTransaction,
      Thing containerClone) throws TransactionException {
    super();
    if (clone == null) {
      throw new NullPointerException("The clone may not be null.");
    }

    this.associatedClone = clone;

    this.parentTransaction = parentTransaction;
    this.createOrUpdate(clone);

    if (this.parentTransaction != null) {
      this.transactionContext = parentTransaction.getTransactionContext();
      this.initializeSubTransaction(this, containerClone);
    } else {
      if (containerClone == null) {
        throw new NullPointerException("The containerClone may not be null");
      }

      this.createOrUpdate(containerClone);
      this.updateContainer(clone, containerClone, null);
    }
  }

  /**
   * Gets the added {@link Thing}s.
   */
  public ImmutableList<Thing> getAddedThing() {
    return ImmutableList.copyOf(this.getAddedThings());
  }

  /**
   * Gets the deleted {@link Thing}s.
   */
  public ImmutableList<Thing> getDeletedThing() {
    return ImmutableList.copyOf(this.getDeletedThings());
  }

  /**
   * Gets the Updated {@link Thing}s where the Key is the original {@link Thing} and the value the
   * cloned {@link Thing}.
   */
  public ImmutableMap<Thing, Thing> getUpdatedThing() {
    return ImmutableMap.copyOf(this.getUpdatedThings());
  }

  /**
   * Gets the copied {@link Thing}s.
   */
  public ImmutableMap<Pair<Thing, Thing>, OperationKind> getCopiedThing() {
    return ImmutableMap.copyOf(this.getCopiedThings());
  }

  /**
   * Registers the provided {@link Thing} to be created in the current transaction.
   *
   * @param clone The {@link Thing} to create
   * @param containerClone The clone of the container in which {@code clone} is added. This argument
   * is not used in the context of sub-transactions.
   *
   * The {@code containerClone} is only updated in the context where there are no sub-transaction.
   * @throws IllegalArgumentException Thrown if a {@link TopContainer} or {@link Iteration} is
   * registered.
   */
  public void create(Thing clone, Thing containerClone) throws TransactionException {
    if (clone == null) {
      throw new NullPointerException("The clone may not be null");
    }

    if (clone instanceof TopContainer || clone instanceof Iteration) {
      throw new IllegalArgumentException(
          "The creation of a TopContainer or an Iteration is not allowed.");
    }

    if (clone.getCache() != null) {
      if (clone.getIid() != null && !clone.getIid().equals(new UUID(0L, 0L))
          && clone.getCache().getIfPresent(clone.getCacheKey()) != null) {
        throw new IllegalArgumentException("The clone is an original thing present in the cache.");
      }
    }

    if (this.getAddedThings().contains(clone)) {
      return;
    }

    if (clone.getIid() == null || clone.getIid().equals(new UUID(0L, 0L))) {
      clone.setIid(UUID.randomUUID());
    }

    clone.setChangeKind(ChangeKind.CREATE);

    this.getAddedThings().add(clone);

    if (this.parentTransaction == null && containerClone != null) {
      this.updateContainer(clone, containerClone, null);
    }
  }

  /**
   * Registers the provided {@link Thing} to be created in the current transaction along with all
   * its potential contained {@link Thing}s.
   *
   * @param clone The {@link Thing} to create.
   * @param containerClone The clone of the container in which {@code clone} is added.
   *
   * {@code containerClone} is only updated in the context where there are no sub-transaction.
   * @throws IllegalArgumentException Thrown if a {@link TopContainer} or {@link Iteration} is
   * registered.
   */
  public void createDeep(Thing clone, Thing containerClone) throws TransactionException {
    this.create(clone, containerClone);
    this.registerContainedThings(clone, false);
  }

  /**
   * Register a deep copy operations for the {@link Thing}.
   *
   * @param deepClone The {@link Thing} to copy.
   * @param containerClone The container.
   */
  public void copyDeep(Thing deepClone, Thing containerClone) throws TransactionException {
    this.create(deepClone, containerClone);
    this.registerContainedThings(deepClone, true);
  }

  /**
   * Registers the provided {@link Thing} to be created or updated in the current transaction.
   *
   * @param clone The clone of the {@link Thing} to update.
   */
  public void createOrUpdate(Thing clone) throws TransactionException {
    if (clone == null) {
      throw new NullPointerException("The clone may not be null");
    }

    if (this.getUpdatedThings().values().stream().anyMatch(x -> x == clone) || this.getAddedThings()
        .stream()
        .anyMatch(x -> x == clone)) {
      return;
    }

    if (this.getUpdatedThings().values().stream().anyMatch(x -> x.getIid().equals(clone.getIid()))
        || this.getAddedThings().stream().anyMatch(x -> x.getIid().equals(clone.getIid()))) {
      return;
    }

    var updatedThing = this.getUpdatedThing(clone);
    if (updatedThing != null) {
      if (clone.getIid() == null || clone.getIid().equals(new UUID(0L, 0L))) {
        throw new IllegalArgumentException("The Iid of the clone cannot be null.");
      }

      clone.setChangeKind(ChangeKind.UPDATE);
      this.getUpdatedThings().put(updatedThing, clone);
    } else {
      this.create(clone, null);
    }
  }

  /**
   * Registers the provided clone of a {@link Thing} as a deleted.
   *
   * @param clone The clone of the {@link Thing} to delete.
   * @param containerClone The clone of the container (mandatory in dialogs).
   */
  public void delete(Thing clone, Thing containerClone) throws TransactionException {
    if (clone == null) {
      throw new NullPointerException("The clone may not be null.");
    }

    if (this.getDeletedThings().stream().anyMatch(x -> x.getIid().equals(clone.getIid()))) {
      return;
    }

    // Verify that a new clone is passed - reference check - only copy allowed
    var previousUpdatedReference = this.getUpdatedThing(clone);

    if (previousUpdatedReference != null && clone instanceof DeprecatableThing) {
      throw new UnsupportedOperationException("Delete of Deprecatable thing is not implemented.");
    }

    if (this.parentTransaction != null) {
      if (containerClone == null) {
        throw new NullPointerException(
            "The clone of the container is mandatory in a dialog context.");
      }

      if (previousUpdatedReference != null) {
        // remove potential reference from the list of updated thing in the current transaction
        var updatedThingKey = this.getUpdatedThings().keySet().stream()
            .filter(x -> x.getIid().equals(clone.getIid())).collect(MoreCollectors.toOptional());
        updatedThingKey.ifPresent(this.getUpdatedThings()::remove);

        // replace references
        this.updateContainer(clone, containerClone, null);
      } else {
        // remove from the list of added thing
        var thingInAddedList = this.getAddedThings().stream()
            .filter(x -> x.getIid().equals(clone.getIid())).collect(MoreCollectors.toOptional());
        thingInAddedList.ifPresent(this.getAddedThings()::remove);

        this.removeThingFromContainer(clone);
      }
    }

    clone.setChangeKind(ChangeKind.DELETE);
    this.getDeletedThings().add(clone);
  }

  /**
   * Registers the provided clone of a {@link Thing} as a copy with its destination.
   *
   * @param clone The {@link Thing} to copy.
   * @param containerDestinationClone The new container.
   * @param operationKind The {@link OperationKind} that specify the kind of copy operation.
   */
  public void copy(Thing clone, Thing containerDestinationClone, OperationKind operationKind)
      throws TransactionException {
    if (!OperationUtils.isCopyOperation(operationKind)) {
      throw new IllegalArgumentException(
          "The copy operation may only be performed with Copy or CopyDefaultValuesChangeOwner or CopyKeepValues or CopyKeepValuesChangeOwner");
    }

    if (containerDestinationClone == null) {
      throw new NullPointerException("The containerDestinationClone may not be null");
    }

    this.copy(clone, operationKind);
    this.addCloneToContainer(clone, containerDestinationClone, null);
    this.createOrUpdate(containerDestinationClone);
  }

  /**
   * Registers the provided clone of a {@link Thing} as a copy.
   *
   * @param clone The {@link Thing} to copy.
   * @param operationKind The {@link OperationKind} that specify the kind of copy operation.
   */
  public void copy(Thing clone, OperationKind operationKind) {
    if (clone == null) {
      throw new NullPointerException("The clone may not be null");
    }

    if (!OperationUtils.isCopyOperation(operationKind)) {
      throw new IllegalArgumentException(
          "The copy operation may only be performed with Copy or CopyDefaultValuesChangeOwner or CopyKeepValues or CopyKeepValuesChangeOwner");
    }

    var original = this.getUpdatedThing(clone);

    // setting a new iid for the copy
    clone.setIid(UUID.randomUUID());
    var originalCopyPair = Pair.of(original, clone);

    if (this.getCopiedThings().containsKey(originalCopyPair)) {
      return;
    }

    // setting a new iid for the copy
    clone.setIid(UUID.randomUUID());
    this.getCopiedThings().put(originalCopyPair, operationKind);
  }

  /**
   * Get the clone of the {@link Thing} used in the current sub-{@link ThingTransaction} if any.
   *
   * @param thing the {@link Thing} which clone to get.
   * @return The clone of the {@link Thing} used in the current transaction if it exists. Null
   * otherwise.
   */
  public Thing getClone(Thing thing) {
    if (thing == null) {
      throw new NullPointerException("The thing may not be null.");
    }

    if (thing.getIid() == null || thing.getIid().equals(new UUID(0L, 0L))) {
      throw new IllegalArgumentException("The Iid of thing may not be the empty UUID.");
    }

    var clone = this.getUpdatedThings().values().stream()
        .filter(x -> x.getIid().equals(thing.getIid()))
        .collect(MoreCollectors.toOptional());

    if (clone.isPresent()) {
      return clone.get();
    }

    clone = this.getAddedThings().stream().filter(x -> x.getIid().equals(thing.getIid()))
        .collect(MoreCollectors.toOptional());
    return clone.orElse(null);

  }

  /**
   * Get the last clone of a specified {@link Thing} with a specific id in the current chain of
   * operations.
   *
   * @param thing The {@link Thing}.
   * @return The last clone created if any, null otherwise.
   */
  public Thing getLastCloneCreated(Thing thing) {
    if (thing == null) {
      throw new NullPointerException("The thing may not be null");
    }

    if (thing.getIid() == null || thing.getIid().equals(new UUID(0L, 0L))) {
      throw new IllegalArgumentException("The Iid of thing may not be the empty UUID.");
    }

    var allAddedThing = this.getAllAddedThings();
    var clone = allAddedThing.stream().filter(x -> x.getIid().equals(thing.getIid()))
        .collect(MoreCollectors.toOptional());
    if (clone.isPresent()) {
      return clone.get();
    }

    var allUpdatedThing = this.getAllUpdatedThings();
    clone = allUpdatedThing.stream().filter(x -> x.getIid().equals(thing.getIid()))
        .collect(MoreCollectors.toOptional());
    return clone.orElse(null);
  }

  /**
   * Finalize the sub-transaction by resolving and updating the containers and by merging the
   * current transaction into its parent. Calling this method for a root-transaction will not do
   * anything.
   *
   * @param clone The clone {@link Thing} to update.
   * @param containerClone The container.
   * @param nextThing The next (following) {@link Thing} in an {@link OrderedItemList} where the new
   * {@link Thing} is created if {@code nextThing} is null, the {@code clone} is appended to the
   * list.
   */
  public void finalizeSubTransaction(Thing clone, Thing containerClone, Thing nextThing)
      throws TransactionException {
    if (this.parentTransaction == null) {
      throw new IllegalArgumentException("This method shall only be called on a sub-transaction.");
    }

    // also update thing of the same type as it may be that one of the container in the current sub-transaction was changed
    // to a thing which is not in the normal "chain of operations".
    if (clone == null) {
      throw new NullPointerException("The clone may not null.");
    }

    if (containerClone == null) {
      throw new NullPointerException("The container clone may not be null.");
    }

    this.updateContainer(clone, containerClone, nextThing);

    // update the reference of possible other clones of the same type which were added when a contained item
    // of the current associatedClone was updated to another one
    var rootClone = getOperationRootClone();
    var cloneTypeToUpdate = this.associatedClone.getContainerInformation().getLeft();

    for (var addedthing : this.getAddedThings().stream().filter(x -> x != this.associatedClone
        && x.getContainerInformation().getLeft() == cloneTypeToUpdate).collect(
        Collectors.toList())) {
      if (!addedthing.isContainedBy(rootClone.getIid())) {
        // no need to update the container as it cannot be accessed through the current chain of operations
        continue;
      }

      // the clone should have been added
      var containerOfAddedThing = this.getClone(addedthing.getContainer());
      if (containerOfAddedThing == null) {
        throw new TransactionException(
            "Could not find the corresponding clone for the container of the added thing added outside the chain of transaction.");
      }

      this.updateContainer(addedthing, containerOfAddedThing, null);
    }

    for (
        var updatedThing :
        this.getUpdatedThings().values().stream().filter(x -> x != this.associatedClone
            && x.getContainerInformation().getLeft() == cloneTypeToUpdate).collect(
            Collectors.toList())) {
      if (!updatedThing.isContainedBy(rootClone.getIid())) {
        // no need to update the container as it cannot be access through the current chain of operations
        continue;
      }

      // the clone should have been added
      var containerOfUpdatedThing = this.getClone(updatedThing.getContainer());
      if (containerOfUpdatedThing == null) {
        throw new TransactionException(
            "Could not find the corresponding clone for the container of the updated thing added outside the chain of transaction.");
      }

      this.updateContainer(updatedThing, containerOfUpdatedThing, null);
    }

    this.parentTransaction.merge(this);
  }

  /**
   * Finalizes all operations that happened during this {@link ThingTransaction}.
   *
   * @return The {@link OperationContainer}.
   */
  public OperationContainer finalizeTransaction() {
    if (this.parentTransaction != null) {
      throw new IllegalArgumentException("This shall only be possible for a root transaction.");
    }

    this.filterOperationCausedByDelete();

    var context = this.transactionContext.getContextRoute();
    var operationContainer = new OperationContainer(context, this.getTopContainerRevisionNumber());

    this.createNewThingOperation(operationContainer);
    this.createUpdatedThingOperation(operationContainer);
    this.createDeletedThingOperation(operationContainer);
    this.createCopyThingOperation(operationContainer);

    return operationContainer;
  }

  /**
   * Get the last version of a specified {@link Thing} registered in the current chain of operations
   * which {@code clone} is an update of.
   *
   * @param clone The new version of a {@link Thing}.
   * @return The last version of a {@link Thing} which {@code clone} is an update of.
   */
  private Thing getUpdatedThing(Thing clone) {
    // case1: the updated thing is already in the transaction as an updated thing
    var allUpdatedThings = this.getAllUpdatedThings();

    var updatedThing = allUpdatedThings.stream().filter(x -> x.getIid().equals(clone.getIid()))
        .collect(MoreCollectors.toOptional());
    if (updatedThing.isPresent()) {
      if (updatedThing.get() == clone) {
        throw new IllegalArgumentException(
            "The clone and its previous version cannot be the same.");
      }

      return updatedThing.get();
    }

    // case2: the updated thing is already in the transaction as an added thing
    var allAddedThings = this.getAllAddedThings();
    updatedThing = allAddedThings.stream().filter(x -> x.getIid().equals(clone.getIid()))
        .collect(MoreCollectors.toOptional());
    if (updatedThing.isPresent()) {
      if (updatedThing.get() == clone) {
        throw new IllegalArgumentException(
            "The clone and its previous version cannot be the same.");
      }

      return null;
    }

    // case 2 bis
    // the updated thing is a new thing to be created, its cache may be null.
    if (clone.getCache() == null) {
      return null;
    }

    // case3: the cache does not contain the key, its a new
    var value = clone.getCache().getIfPresent(clone.getCacheKey());
    if (value == null) {
      return null;
    }

    // case4: the updated thing is the original
    if (value == clone) {
      throw new IllegalArgumentException("The transaction only accepts clones.");
    }

    return value;
  }

  /**
   * Get all the added {@link Thing} in the current chain of transaction.
   *
   * @return A list of all the added things.
   */
  private List<Thing> getAllAddedThings() {
    var allAddedThing = new ArrayList<>(this.getAddedThings());
    if (this.parentTransaction != null) {
      this.populateAllAddedThingsList(this.parentTransaction, allAddedThing);
    }

    return allAddedThing;
  }

  /**
   * Populates the list of all the added things in a specified transaction.
   *
   * @param transaction The {@link Transaction}.
   * @param allAddedThing The list containing all the added things.
   */
  private void populateAllAddedThingsList(Transaction transaction, List<Thing> allAddedThing) {
    var thingsToAdd = transaction.getAddedThing().stream()
        .filter(x -> allAddedThing.stream().noneMatch(y -> y.getIid().equals(x.getIid())))
        .collect(Collectors.toList());
    allAddedThing.addAll(thingsToAdd);
    if (transaction.getParentTransaction() != null) {
      this.populateAllAddedThingsList(transaction.getParentTransaction(), allAddedThing);
    }
  }

  /**
   * Get all the updated {@link Thing} in the current chain of transaction.
   *
   * @return A list of all the updated things.
   */
  private List<Thing> getAllUpdatedThings() {
    var allUpdatedThings = Lists.newArrayList(this.getUpdatedThings().values());
    if (this.parentTransaction != null) {
      this.populateAllUpdatedThingsList(this.parentTransaction, allUpdatedThings);
    }

    return allUpdatedThings;
  }

  /**
   * Populates the list of all the updated things in a specified transaction.
   *
   * @param transaction The specified {@link Transaction}.
   * @param allUpdatedThing The list of all the updated things to populate.
   */
  private void populateAllUpdatedThingsList(Transaction transaction,
      List<Thing> allUpdatedThing) {
    var thingsToAdd = transaction.getUpdatedThing().values().stream()
        .filter(x -> allUpdatedThing.stream().noneMatch(y -> y.getIid().equals(x.getIid())))
        .collect(Collectors.toList());
    allUpdatedThing.addAll(thingsToAdd);
    if (transaction.getParentTransaction() != null) {
      this.populateAllUpdatedThingsList(transaction.getParentTransaction(), allUpdatedThing);
    }
  }

  /**
   * Update the {@link ContainerList} property of the container.
   *
   * @param thing The {@link Thing} to add.
   * @param containerClone The clone of the container {@link Thing}.
   * @param containerList The {@link ContainerList}.
   */
  private void updateContainerList(Thing thing, Thing containerClone,
      ContainerList<Thing> containerList) throws TransactionException {
    if (thing.getContainer() != null && thing.getContainer().getIid()
        .equals(containerClone.getIid())) {
      // replace the reference in the container list
      int index = -1;
      for (int i = 0; i < containerList.size(); i++) {
        if (containerList.get(i).getIid().equals(thing.getIid())) {
          index = i;
          break;
        }
      }

      if (index != -1) {
        containerList.set(index, thing);
      }
    } else {
      containerList.add(thing);
    }

    this.createOrUpdate(containerClone);
  }

  /**
   * Update the {@link OrderedItemList{T}} property of the container.
   *
   * @param thing The {@link Thing} to add.
   * @param containerClone The clone of the container {@link Thing}.
   * @param nextThing The {@link Thing} before which the new {@link Thing} is inserted.
   * @param orderedItemList The {@link OrderedItemList}.
   */
  private void updateOrderedItemList(Thing thing, Thing containerClone, Thing nextThing,
      OrderedItemList<Thing> orderedItemList) throws TransactionException {
    if (thing.getContainer() != null && thing.getContainer().getIid()
        .equals(containerClone.getIid())) {
      // replace the reference in the container list as another reference of the thing to add is already in the list
      int index = orderedItemList.findIndex(x -> x.getIid().equals(thing.getIid()));

      if (index != -1) {
        orderedItemList.set(index, thing);
      }
    } else {
      if (nextThing == null) {
        // normal add
        orderedItemList.add(thing);
      } else {
        // insert the new thing before nextThing
        var index = orderedItemList.indexOf(nextThing);
        if (index == -1) {
          throw new IllegalArgumentException(
              "The Thing before which the new item needs to be inserted does not exist.");
        }
        orderedItemList.insert(index, thing);
      }
    }

    this.createOrUpdate(containerClone);
  }

  /**
   * Remove the given {@link Thing} from its container in the current transaction.
   *
   * @param thing The {@link Thing} to be remove from the containers.
   */
  private void removeThingFromContainer(Thing thing) {
    var containers = new ArrayList<>(this.getAddedThings());
    containers.addAll(this.getUpdatedThings().values());

    Thing originalThing = null;
    if (thing.getCache() != null) {
      originalThing = thing.getCache().getIfPresent(thing.getCacheKey());
    }

    // Find in all the thing in the transaction the potential container that contains the current thing
    for (var container : containers) {
      if (originalThing != null) {
        if (originalThing.getContainer().getIid().equals(container.getIid())) {
          // Dal will handle the removal on the original container
          continue;
        }
      }

      var containerType = container.getClass();
      List<Field> fields = Lists.newArrayList(containerType.getDeclaredFields());

      var matchingPropertyInfos = fields.stream()
          .filter(x -> (x.getType() == ContainerList.class || x.getType() == OrderedItemList.class)
              && isGenericTypeOfClass(x.getGenericType(), thing.getClass()))
          .collect(Collectors.toList());

      for (var propertyInfo : matchingPropertyInfos) {
        Collection<Thing> containerList;
        try {
          containerList = (Collection<Thing>) (FieldUtils.readField(propertyInfo, container, true));
        } catch (IllegalAccessException e) {
          throw new RuntimeException("Unable to get value of a field: " + propertyInfo.getName());
        }

        Thing thingToRemove = null;
        for (Thing containedThing : containerList) {
          if (containedThing.getIid().equals(thing.getIid())) {
            thingToRemove = containedThing;
          }
        }

        if (thingToRemove == null) {
          continue;
        }

        var success = containerList.remove(thingToRemove);
        if (success) {
          thingToRemove.setContainer(null);
          return;
        }
      }
    }
  }

  /**
   * Checks whether a supplied {@link Type} is parameterized and contains only one {@link Type} that
   * equals a supplied {@link Class}.
   *
   * @param genericType The generic {@link Type} of a field.
   * @param clazz The {@link Class} {@code genericType} is compared.
   * @return true if a supplied {@code genericType} is parameterized and contains only one {@link
   * Type} that equals a supplied {@code clazz}, otherwise false
   */
  private boolean isGenericTypeOfClass(Type genericType, Class clazz) {
    ParameterizedType parameterizedType = (ParameterizedType) genericType;
    Type[] fieldArgTypes = parameterizedType.getActualTypeArguments();

    return fieldArgTypes.length == 1 && fieldArgTypes[0] == clazz;
  }

  /**
   * Initialize a {@link ThingTransaction} from its parent transaction
   *
   * @param subTransaction The {@link ThingTransaction} to initialize
   * @param containerClone The {@link Thing} that is supposed to contain the {@code
   * associatedClone}. May be null at initialization
   */
  private void initializeSubTransaction(ThingTransaction subTransaction, Thing containerClone) {
    var containerType = this.associatedClone.getContainerInformation().getLeft();

    if (containerClone != null) {
      var currentContainerType = containerClone.getClass();
      if (!containerType.isAssignableFrom(currentContainerType)) {
        throw new IllegalArgumentException(
            "The specified container is not allowed as a container.");
      }

      if (this.parentTransaction.getAddedThing().contains(containerClone)) {
        subTransaction.getAddedThing().add(containerClone);
      } else if (this.parentTransaction.getUpdatedThing().values().contains(containerClone)) {
        var entry =
            this.parentTransaction.getUpdatedThing().entrySet().stream()
                .filter(x -> x.getValue() == containerClone).collect(MoreCollectors.onlyElement());
        subTransaction.getUpdatedThing().put(entry.getKey(), entry.getValue());
      } else {
        throw new IllegalArgumentException(
            "The clone of the container is not in the parent transaction.");
      }
    }
  }

  /**
   * Add a new chain of clones to the current transaction for the update of a thing outside of the
   * current chain.
   *
   * @param clone The {@link Thing} being updated outside the current chain
   */
  private void addChainOfContainers(Thing clone) throws TransactionException {
    var topOperationClone = this.getOperationRootClone();
    if (!clone.isContainedBy(topOperationClone.getIid())) {
      return;
    }

    var chainOfTransactions = this.getChainOfSubTransactions();

    // root is first
    Collections.reverse(chainOfTransactions);

    // remove the root which does not contain an associated clone
    chainOfTransactions.remove(0);

    for (var transaction : chainOfTransactions) {
      if (clone.isContainedBy(transaction.getAssociatedClone().getIid())) {
        continue;
      }

      // add a new clone if newContainerClone is not contained by the current operation's chain of clones
      var containerType = transaction.getAssociatedClone().getClass();
      var container = clone.getContainerOfType(containerType);
      if (container == null) {
        return;
      }

      // check if the container was already updated, create a new clone
      var containerClone = this.getLastCloneCreated((Thing) container);
      containerClone =
          containerClone != null ? containerClone.clone(false) : ((Thing) container).clone(false);
      this.createOrUpdate(containerClone);
    }
  }

  /**
   * Get the clone of the {@link Thing} at the root of all the current {@link ThingTransaction}s
   *
   * @return The clone of the {@link Thing} at the root of all the current {@link ThingTransaction}s
   */
  private Thing getOperationRootClone() {
    var rootClone = this.associatedClone;
    var parent = this.parentTransaction;
    while (parent != null) {
      rootClone = parent.getAssociatedClone() != null ? parent.getAssociatedClone() : rootClone;
      parent = parent.getParentTransaction();
    }

    return rootClone;
  }

  /**
   * Gets the chain of {@link Transaction} for the current one
   *
   * @return The chain of {@link Transaction}
   */
  private List<Transaction> getChainOfSubTransactions() {
    var parent = this.parentTransaction;
    var listOfSubTransactions = new ArrayList<Transaction>();

    while (parent != null) {
      listOfSubTransactions.add(parent);
      parent = parent.getParentTransaction();
    }

    return listOfSubTransactions;
  }

  /**
   * Updates the container of the specified {@link Thing}.
   *
   * @param clone The {@link Thing} to ass or remove.
   * @param containerClone The container to update.
   * @param nextThing The next (following) {@link Thing} in an {@link OrderedItemList{T}} where the
   * new {@link Thing} is created if {@code nextThing} is null, the {@code clone} is appended to the
   * list.
   */
  private void updateContainer(Thing clone, Thing containerClone, Thing nextThing)
      throws TransactionException {
    var containerInformation = clone.getContainerInformation();
    if (!containerInformation.getLeft().isAssignableFrom(containerClone.getClass())) {
      throw new IllegalArgumentException("The containerClone does not have the right type");
    }

    // remove the current thing from its previous container if it was changed from original
    if (clone.getContainer() != null && clone.getContainer().getIid() != containerClone.getIid()) {
      this.removeThingFromContainer(clone);
      this.createOrUpdate(containerClone);
      this.addChainOfContainers(containerClone);
    }

    this.addCloneToContainer(clone, containerClone, nextThing);
  }

  /**
   * Add the {@code clone} to the {@code containerClone}.
   *
   * @param clone The {@link Thing} to add or remove.
   * @param containerClone The container to update.
   * @param nextThing The next (following) {@link Thing} in an {@link OrderedItemList} where the new
   * {@link Thing} is created if {@code nextThing} is null, the {@code clone} is appended to the
   * list.
   */
  private void addCloneToContainer(Thing clone, Thing containerClone, Thing nextThing)
      throws TransactionException {
    var containerInformation = clone.getContainerInformation();
    if (!containerInformation.getLeft().isAssignableFrom(containerClone.getClass())) {
      throw new IllegalArgumentException("The containerClone does not have the right type");
    }

    // add/replace the clone to its container and add the container in the list of updated object
    var containerType = containerClone.getClass();
    var containerPropertyGetter = MethodUtils.getAccessibleMethod(containerType,
        "get" + StringUtils.capitalizeFirstLetter(containerInformation.getRight()));

    if (containerPropertyGetter == null) {
      throw new TransactionException(
          String.format("The property %s could not be found", containerInformation.getRight()));
    }

    try {
      if (containerPropertyGetter.getReturnType() == ContainerList.class) {
        this.updateContainerList(clone, containerClone,
            (ContainerList<Thing>) (containerPropertyGetter.invoke(containerClone)));
      } else {
        // OrderedItemList
        this.updateOrderedItemList(clone, containerClone, nextThing,
            (OrderedItemList<Thing>) (containerPropertyGetter.invoke(containerClone)));
      }
    } catch (IllegalAccessException | InvocationTargetException ex) {
      throw new RuntimeException(
          String.format("Unable to access the property %s.", containerInformation.getRight()));
    }
  }

  /**
   * Merge the sub-transaction into the current {@link Transaction}
   *
   * @param subTransaction The sub-{@link Transaction}
   */
  @Override
  public void merge(Transaction subTransaction) {
    // replace or add all element in addedThing
    for (var thing : subTransaction.getAddedThing()) {
      if (this.getAddedThings().contains(thing)) {
        continue;
      }

      var existingThing = this.getAddedThings().stream()
          .filter(x -> x.getIid().equals(thing.getIid()))
          .collect(MoreCollectors.toOptional()).orElse(null);
      if (existingThing != null) {
        // replace the current thing with the one from the sub-transaction
        var index = this.getAddedThings().indexOf(existingThing);
        this.getAddedThings().set(index, thing);
      } else {
        this.getAddedThings().add(thing);
      }
    }

    for (var keyValuePair : subTransaction.getUpdatedThing().entrySet()) {
      if (this.getUpdatedThings().containsKey(keyValuePair.getKey())) {
        var parentKeyValue = this.getUpdatedThings().entrySet().stream()
            .filter(x -> x.getKey().equals(keyValuePair.getKey()))
            .collect(MoreCollectors.onlyElement());
        if (parentKeyValue.getValue() != keyValuePair.getValue()) {
          throw new IllegalArgumentException(
              "2 clones have been created for the same thing.");
        }

        continue;
      }

      // check if the key in a sub-transaction correspond to a value in the current one
      var existingKeyValue =
          this.getUpdatedThings().entrySet().stream()
              .filter(x -> x.getValue().equals(keyValuePair.getKey()))
              .collect(MoreCollectors.toOptional()).orElse(null);
      this.getUpdatedThings()
          .put(Objects.requireNonNullElse(existingKeyValue, keyValuePair).getKey(),
              keyValuePair.getValue());
    }

    this.getDeletedThings().addAll(subTransaction.getDeletedThing());
  }

  /**
   * Registers all contained {@link Thing} for a created {@link Thing}.
   *
   * @param thing The {@link Thing} to register along its contained thing.
   * @param newId Indicates whether the contained {@link Thing}s to be created should have a new
   * ID.
   */
  private void registerContainedThings(Thing thing, boolean newId) throws TransactionException {
    for (var containerList : thing.getContainerLists()) {
      for (var containedThing : containerList) {
        if (newId) {
          ((Thing) containedThing).setIid(UUID.randomUUID());
        }

        this.create((Thing) containedThing, null);
        this.registerContainedThings((Thing) containedThing, newId);
      }
    }
  }

  /**
   * Create the {@link Operation}s related to the creation of new {@link Thing}s.
   *
   * @param operationContainer The returned {@link OperationContainer}.
   */
  private void createNewThingOperation(OperationContainer operationContainer) {
    for (var thing : this.getAddedThings()) {
      operationContainer.addOperation(new Operation(null, thing.toDto(), OperationKind.CREATE));
    }
  }

  /**
   * Create the {@link Operation}s related to the update of {@link Thing}s. This function makes use
   * of the original {@link Thing} as it is stored in the cache, and the cloned {@link Thing} to
   * populate the Update {@link Operation}. When the revision of the original {@link Thing} is
   * higher than the revision of the cloned {@link Thing}, this means that the original {@link
   * Thing} has been updated by a round trip to the data-source while the current {@link
   * ThingTransaction} was open.
   *
   * @param operationContainer The returned {@link OperationContainer}
   */
  private void createUpdatedThingOperation(OperationContainer operationContainer) {
    for (var keyValue : this.getUpdatedThings().entrySet()) {
      Thing originalThing;

      // keyValue.getValue() - the clone that has been updated in the context of the transaction
      // keyValue.getKey()   - the original that is present in the cache

      if (keyValue.getValue().getRevisionNumber() < keyValue.getKey().getRevisionNumber()) {
        log.trace("A newer revision {} than the expected {} of {}:{} exists in the Cache",
            keyValue.getKey().getRevisionNumber(), keyValue.getValue().getRevisionNumber(),
            keyValue.getKey().getClassKind(),
            keyValue.getKey().getIid());

        if (keyValue.getKey().getRevisions().containsKey(keyValue.getValue().getRevisionNumber())) {
          originalThing = keyValue.getKey().getRevisions()
              .get(keyValue.getValue().getRevisionNumber());
          log.trace("The matching revision {} of {}:{} is used for the Update Operation",
              keyValue.getValue().getRevisionNumber(), keyValue.getValue().getClassKind(),
              keyValue.getValue().getIid());
        } else {
          log.warn(
              "Revision {} instead of revision {} of {}:{} is used for the Update Operation",
              keyValue.getKey().getRevisionNumber(), keyValue.getValue().getRevisionNumber(),
              keyValue.getValue().getClassKind(),
              keyValue.getValue().getIid());
          originalThing = keyValue.getKey();
        }
      } else {
        originalThing = keyValue.getKey();
      }

      operationContainer.addOperation(
          new Operation(originalThing.toDto(), keyValue.getValue().toDto(), OperationKind.UPDATE));
    }
  }

  /**
   * Create the {@link Operation}s related to the deletion of {@link Thing}s.
   *
   * @param operationContainer The returned {@link OperationContainer}.
   */
  private void createDeletedThingOperation(OperationContainer operationContainer) {
    for (var thing : this.getDeletedThings()) {
      var dto = thing.toDto();
      operationContainer.addOperation(new Operation(dto, dto, OperationKind.DELETE));
    }
  }

  /**
   * Create the {@link Operation}s related to the copy of {@link Thing}s.
   *
   * @param operationContainer The returned {@link OperationContainer}.
   */
  private void createCopyThingOperation(OperationContainer operationContainer) {
    for (var pair : this.getCopiedThings().entrySet()) {
      var originalCopy = pair.getKey();
      var original = originalCopy.getLeft().toDto();
      var copy = originalCopy.getRight().toDto();
      var copyOperationKind = pair.getValue();

      if (OperationUtils.isCopyOperation(copyOperationKind)) {
        operationContainer.addOperation(new Operation(original, copy, copyOperationKind));
      }
    }
  }

  /**
   * Create the {@link Operation}s related to the moving of {@link Thing}s.
   *
   * @param operationContainer The returned {@link OperationContainer}.
   */
  private void createMoveThingOperation(OperationContainer operationContainer) {
    throw new UnsupportedOperationException();
  }

  /**
   * Returns the unique {@link TopContainer#getRevisionNumber()} of this Transaction.
   *
   * @return The {@link TopContainer#getRevisionNumber()}.
   */
  private int getTopContainerRevisionNumber() {
    var things = new ArrayList<>(this.getAddedThings());
    things.addAll(this.getUpdatedThings().keySet());
    things.addAll(this.getDeletedThings());

    var distinctTopContainer = things.stream().map(Thing::getTopContainer)
        .filter(distinctByKey(Thing::getIid))
        .collect(Collectors.toList());
    if (distinctTopContainer.size() != 1) {
      throw new IllegalArgumentException(
          "Multiple top container updates in one transaction, operation not allowed.");
    }

    return distinctTopContainer.get(0).getRevisionNumber();
  }

  /**
   * Returns the predicate to be used as a distinct by some key filter that is missed in standard
   * Java Stream API.
   *
   * @return The {@link Predicate<T>}.
   */
  private <T> Predicate<T> distinctByKey(
      Function<? super T, ?> key) {

    Map<Object, Boolean> seen = new ConcurrentHashMap<>();
    return t -> seen.putIfAbsent(key.apply(t), Boolean.TRUE) == null;
  }

  /**
   * Filter out update and added operations on {@link Thing}s contained by another {@link Thing}
   * that is registered for delete.
   */
  private void filterOperationCausedByDelete() {
    // filter out the added thing or updated thing that have been marked as deleted
    // filter out the contained thing of a deleted thing
    var deletedThing = new ArrayList<>(this.getDeletedThings());
    for (var thing : deletedThing) {
      var cloneType = thing.getClass();
      List<Field> fields = Lists.newArrayList(cloneType.getDeclaredFields());
      var containersInfo = fields.stream()
          .filter(x -> x.getType() == ContainerList.class || x.getType() == OrderedItemList.class)
          .collect(Collectors.toList());

      for (var containerInfo : containersInfo) {
        Collection<Thing> container;
        try {
          container = (Collection<Thing>) (FieldUtils.readField(containerInfo, thing, true));
        } catch (IllegalAccessException e) {
          throw new RuntimeException("Unable to get value of a field: " + containerInfo.getName());
        }

        for (Thing containedThing : container) {
          this.removeThingFromOperationLists(containedThing);
        }
      }

      this.removeThingFromOperationLists(thing);
    }
  }

  /**
   * Remove a {@link Thing} from the operation lists.
   *
   * @param thingToRemove The {@link Thing} to remove.
   */
  private void removeThingFromOperationLists(Thing thingToRemove) {
    // remove it from the list of updated thing in the current transaction
    var updatedThingKey = this.getUpdatedThings().keySet().stream()
        .filter(x -> x.getIid().equals(thingToRemove.getIid()))
        .collect(MoreCollectors.toOptional());
    updatedThingKey.ifPresent(this.getUpdatedThings()::remove);

    // remove from the list of added thing
    var thingInAddedList = this.getAddedThings().stream()
        .filter(x -> x.getIid().equals(thingToRemove.getIid()))
        .collect(MoreCollectors.toOptional());
    thingInAddedList.ifPresent(this.getAddedThings()::remove);

    // remove the thing as deleted if it is not cached
    if (!thingToRemove.isCached()) {
      var thingInDeletedList = this.getDeletedThings().stream()
          .filter(x -> x.getIid().equals(thingToRemove.getIid()))
          .collect(MoreCollectors.toOptional());
      thingInDeletedList.ifPresent(this.getDeletedThings()::remove);
    }
  }
}
