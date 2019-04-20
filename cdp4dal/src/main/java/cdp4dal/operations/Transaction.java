/*
 * Transaction.java
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.tuple.Pair;

/**
 * The base abstract transaction class that is supposed to be extended by a side implementation.
 */
public abstract class Transaction implements ThingTransaction {
  /**
   * The added {@link Thing}s.
   */
  private final List<Thing> addedThing;

  /**
   * The updated {@link Thing}s.
   */
  private final Map<Thing, Thing> updatedThing;

  /**
   * The deleted {@link Thing}s.
   */
  private final List<Thing> deletedThing;

  /**
   * The list of copied {@link Thing}.
   */
  private final Map<Pair<Thing, Thing>, OperationKind> copiedThing;

  protected Transaction(){
    this.addedThing = new ArrayList<>();
    this.updatedThing = new HashMap<>();
    this.deletedThing = new ArrayList<>();
    this.copiedThing = new HashMap<>();
  }

  /**
   * Gets the parent {@link Transaction}.
   */
  protected abstract Transaction getParentTransaction();

  /**
   * Gets the {@link TransactionContext}.
   */
  protected abstract TransactionContext getTransactionContext();

  /**
   * Gets the clone of the {@link Thing} associated with the current {@link ThingTransaction}.
   */
  protected abstract Thing getAssociatedClone();

  /**
   * Gets the added {@link Thing}s as a mutable {@link List}.
   */
  protected List<Thing> getAddedThings() {
    return addedThing;
  }

  /**
   * Gets the Updated {@link Thing}s as a mutable {@link Map} where the Key is the original {@link Thing} and the value the
   * cloned {@link Thing}.
   */
  protected Map<Thing, Thing> getUpdatedThings() {
    return updatedThing;
  }

  /**
   * Gets the deleted {@link Thing}s as a mutable {@link List}.
   */
  protected List<Thing> getDeletedThings() {
    return deletedThing;
  }

  /**
   * Gets the copied {@link Thing}s as a mutable {@link Map}.
   */
  protected Map<Pair<Thing, Thing>, OperationKind> getCopiedThings() {
    return copiedThing;
  }

  /**
   * Merge the sub-transaction into the current {@link ThingTransaction}
   *
   * @param subTransaction The sub-{@link ThingTransaction}
   */
  protected abstract void merge(Transaction subTransaction);
}
