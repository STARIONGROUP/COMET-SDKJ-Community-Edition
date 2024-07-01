/*
 * OrderedItemList.java
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

package cdp4common.types;

import static cdp4common.helpers.Utils.as;

import cdp4common.commondata.Thing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.jetbrains.annotations.NotNull;

/**
 * A CDP4 Ordered List
 *
 * @param <T> The type of the items to sort
 */
public class OrderedItemList<T> implements Collection<T> {

  /**
   * The default key interval to be used for initial spacing between keys of adjacent items.
   */
  private final long defaultKeyInterval = 100000000L;

  /**
   * Random number generator used by the {@link #computeSortKey} method
   */
  private final RandomDataGenerator random;

  /**
   * The underlying sorted list of items.
   */
  private final SortedMap<Long, T> sortedItems;

  /**
   * Backing field for the container of this {@link OrderedItemList}
   */
  public final Thing container;

  /**
   * A value indicating that this {@link OrderedItemList} is a container
   */
  public final boolean isComposite;

  /**
   * The highest sort key currently in this {@link OrderedItemList}.
   */
  private long highestKey = -defaultKeyInterval;

  /**
   * The type of the created {@link OrderedItemList}
   */
  private final Class<T> clazz;

  /**
   * Initializes a new instance of the {@link OrderedItemList} class
   *
   * @param container The {@link Thing} that contains this {@link OrderedItemList}
   * @param clazz The type of the contained elements
   */
  public OrderedItemList(Thing container, Class<T> clazz) {
    this(container, false, clazz);
  }

  /**
   * Initializes a new instance of the {@link OrderedItemList} class
   *
   * @param container The {@link Thing} that contains this {@link OrderedItemList}
   * @param isComposite Value indicating whether the {@link T} in this {@link OrderedItemList} are
   * part of a composition relationship.
   * @param clazz The type of the contained elements
   */
  public OrderedItemList(Thing container, boolean isComposite, Class<T> clazz) {
    this.container = container;
    this.sortedItems = new TreeMap<>();
    this.random = new RandomDataGenerator();
    this.isComposite = isComposite;
    this.clazz = clazz;
  }

  /**
   * Initializes a new instance of the {@link OrderedItemList} class
   *
   * @param orderedItemList The {@link OrderedItemList} which values are copied
   * @param container The owner of this {@link OrderedItemList}
   * @param clazz The type of the contained elements
   */
  public OrderedItemList(OrderedItemList<T> orderedItemList, Thing container, Class<T> clazz) {
    this.container = container;
    this.sortedItems = new TreeMap<>(orderedItemList.sortedItems);
    this.random = new RandomDataGenerator();
    this.isComposite = orderedItemList.isComposite;

    if (!this.sortedItems.isEmpty()) {
      this.highestKey = this.sortedItems.keySet().stream().mapToLong(i -> i).max().getAsLong();
    }

    this.clazz = clazz;
  }

  /**
   * Queries the 0-based index of the item in the order list
   *
   * @param item The item which is queried
   * @return The index of the queried item. When the item is not contained by the map "-1" is
   * returned
   */
  public int indexOf(T item) {
    if (!this.sortedItems.containsValue(item)) {
      return -1;
    }

    return new ArrayList<>(this.sortedItems.values()).indexOf(item);
  }

  /**
   * Retrieve the index of the item that matches the {@link Predicate}
   *
   * @param match The {@link Predicate}
   * @return The index of the item if there is a match, else -1
   */
  public int findIndex(Predicate<T> match) {
    this.validateValueForNull(match, "A match cannot be null");

    for (T item : this) {
      if (match.test(item)) {
        return this.indexOf(item);
      }
    }

    return -1;
  }


  /**
   * Gets the underlying {@link TreeMap} of items.
   */
  public SortedMap<Long, T> getSortedItems() {
    return this.sortedItems;
  }

  /**
   * Gets the value of the item associated with the specified index.
   *
   * @param index The zero-based index of the item to get.
   * @return The value of the item with the specified index.
   */
  public T get(int index) {
    this.validateIndex(index);

    return this.clazz.cast(this.sortedItems.values().toArray()[index]);
  }

  /**
   * Sets the value of the item associated with the specified index.
   *
   * @param index The zero-based index of the item to set.
   */
  public void set(int index, T value) {
    this.validateIndex(index);
    this.validateValueForNull(value, "An item cannot be null");

    if (value instanceof Thing) {
      this.validateItemForExistence(value);
    }

    if ((value instanceof Thing) && this.isComposite) {
      ((Thing) value).setContainer(this.container);
    }

    long sortKey = 0;
    T oldValue = this.clazz.cast(this.sortedItems.values().toArray()[index]);

    for (Map.Entry<Long, T> item : this.sortedItems.entrySet()) {
      if (item.getValue().equals(oldValue)) {
        sortKey = item.getKey();
        break;
      }
    }

    this.sortedItems.put(sortKey, value);
  }

  /**
   * Add the {@link Iterable} of {@link OrderedItem} keeping the same keys
   *
   * @param itemsToAdd the items to add
   */
  public void addOrderedItems(Iterable<OrderedItem> itemsToAdd) {
    for (OrderedItem item : itemsToAdd) {
      if (this.clazz.isInstance(item.getV())) {
        this.add(item.getK(), this.clazz.cast(item.getV()));
      } else {
        // Try to convert
        String value = item.getV().toString();
        this.add(item.getK(), getConvertedValue(value));
      }
    }
  }

  /**
   * Inserts the specified item into this ordered set at the specified integer index.
   *
   * @param index The index before which to insert the item.
   * @param item The item to insert.
   */
  public void insert(int index, T item) {
    this.validateValueForNull(item, "An item cannot be null");

    if (index < this.size()) {
      long upperSortKey = (long) this.sortedItems.keySet().toArray()[index];
      long lowerSortKey;
      if (index == 0) {
        lowerSortKey = upperSortKey - (2L * defaultKeyInterval);
      } else {
        lowerSortKey = (long) this.sortedItems.keySet().toArray()[index - 1];
      }

      this.add(this.computeSortKey(lowerSortKey, upperSortKey), item);
    } else {
      this.add(item);
    }
  }

  /**
   * Move the position of an item to the specified index.
   * <p>
   * The method will move every item between the two specified indexes
   *
   * @param index The index of the item to move
   * @param destinationIndex The destination index
   */
  public void move(int index, int destinationIndex) {
    this.validateIndex(index);
    this.validateIndex(destinationIndex);

    int minIndex = Math.min(index, destinationIndex);
    int maxIndex = Math.max(index, destinationIndex);

    List<Object> keyList = new ArrayList<>(Arrays.asList(this.sortedItems.keySet().toArray()))
        .subList(minIndex, maxIndex - minIndex + 1);
    keyList.sort(Comparator.comparingLong((Object o) -> (Long) o));

    if (destinationIndex < index) {
      keyList.sort((Object o1, Object o2) -> Long.compare((Long) o2, (Long) o1));
    }

    // Move all items between the 2 specified indexes
    T initialItem = this.sortedItems.get(keyList.get(0));
    for (int i = 1; i < keyList.size(); i++) {
      Long key = (Long) keyList.get(i);
      Long previousKey = (Long) keyList.get(i - 1);

      T itemToMove = this.sortedItems.get(key);
      this.sortedItems.put(key, null);
      this.sortedItems.put(previousKey, itemToMove);
    }

    this.sortedItems.put((Long) keyList.get(keyList.size() - 1), initialItem);
  }

  /**
   * Converts this {@link OrderedItemList} to a {@link List} of {@link OrderedItem} to be passed to
   * the {@link cdp4common.dto.Thing}
   *
   * @return The corresponding {@link List} of {@link OrderedItem}
   */
  public List<OrderedItem> toDtoOrderedItemList() {
    List<OrderedItem> dtoOrderedItems = new ArrayList<>();
    for (Map.Entry<Long, T> item : this.sortedItems.entrySet()) {
      OrderedItem orderedItem = new OrderedItem();
      orderedItem.setK(item.getKey());

      if (item.getValue() instanceof Thing) {
        orderedItem.setV(((Thing) item.getValue()).getIid());
      } else {
        orderedItem.setV(item.getValue());
      }

      dtoOrderedItems.add(orderedItem);
    }

    return dtoOrderedItems;
  }

  /**
   * Creates and returns a copy of this {@link OrderedItemList} that preserves order of each item.
   * If the type T of the contained objects is {@link Thing} then a clone of each object is made
   * with cloning all contained things, otherwise the object will be passed to a new item. Be
   * cautious about mutability.
   *
   * @param container The {@link Thing} that contains this {@link OrderedItemList} clone.
   * @return A cloned instance of {@link OrderedItemList}.
   */
  public OrderedItemList<T> clone(Thing container) {
    OrderedItemList<T> clonedOrderedItemList = new OrderedItemList<T>(container, this.isComposite, this.clazz);
    clonedOrderedItemList.addOrderedItems(this.sortedItems.entrySet().stream()
        .map(x -> {
          OrderedItem item = new OrderedItem();
          item.setK(x.getKey());
          Thing value = as(x.getValue(), Thing.class);
          if (value != null) {
            item.setV(value.clone(true));
          } else {
            item.setV(x.getValue());
          }

          return item;
        })
        .collect(Collectors.toList()));

    return clonedOrderedItemList;
  }

  /**
   * Compute a uniformly distributed random long sort key approximately in the middle between the
   * given lower and upper sort keys.
   *
   * @param lowerSortKey The lower sort key.
   * @param upperSortKey The upper sort key.
   * @return The computed new sort key. The new key is guaranteed to be non-zero and not already in
   * use in this ordered collection.
   */
  private long computeSortKey(long lowerSortKey, long upperSortKey) {
    final long numberOfBucketsInInterval = 5;
    final long numberOfBucketsToMiddleBucket = numberOfBucketsInInterval / 2;

    long interval = upperSortKey - lowerSortKey;
    long bucketSize = interval / numberOfBucketsInInterval;
    long newSortKey = 0L;
    while (newSortKey == 0L || this.sortedItems.containsKey(newSortKey)) {
      long randomOffset = this.random.nextLong(0, bucketSize);
      newSortKey = lowerSortKey + (numberOfBucketsToMiddleBucket * bucketSize) + randomOffset;
    }

    return newSortKey;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int size() {
    return this.sortedItems.size();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean isEmpty() {
    return this.sortedItems.isEmpty();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean contains(Object o) {
    return this.sortedItems.containsValue(o);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @NotNull
  public Iterator<T> iterator() {
    return this.sortedItems.values().iterator();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  @NotNull
  public Object[] toArray() {
    return this.sortedItems.values().toArray();
  }

  /*
   * Adds the specified item to the end of this list.
   *
   * @param item The item to be added.
   * @throws  NullPointerException when {@code item} is null.
   */
  @Override
  public boolean add(T item) {
    this.validateValueForNull(item, "An item cannot be null");

    if (item instanceof Thing) {
      this.validateItemForExistence(item);
    }

    if ((item instanceof Thing) && this.isComposite) {
      Thing pojoThing = (Thing) item;
      pojoThing.setContainer(this.container);
    }

    long newSortKey = this
        .computeSortKey(this.highestKey, this.highestKey + (2L * defaultKeyInterval));
    this.sortedItems.put(newSortKey, item);
    this.highestKey = newSortKey;

    return true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean remove(Object o) {
    long sortKey = 0;
    for (Map.Entry<Long, T> item : this.sortedItems.entrySet()) {
      if (item.getValue().equals(o)) {
        sortKey = item.getKey();
        break;
      }
    }

    this.sortedItems.remove(sortKey);
    return true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean addAll(@NotNull Collection<? extends T> c) {
    return addRange((Iterable<T>) c);
  }

  /*
   * Adds the specified items to the end of this list.
   *
   * @param itemsToAdd The items to be added.
   */
  public boolean addRange(@NotNull Iterable<T> itemsToAdd) {
    for (T item : itemsToAdd) {
      this.add(item);
    }

    return true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void clear() {
    this.sortedItems.clear();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean retainAll(@NotNull Collection c) {
    throw new UnsupportedOperationException("retainAll(Collection c) method is not supported.");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean removeAll(@NotNull Collection c) {
    throw new UnsupportedOperationException("removeAll(Collection c) method is not supported.");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public boolean containsAll(@NotNull Collection c) {
    throw new UnsupportedOperationException("containsAll((Collection c)) method is not supported.");
  }

  /**
   * {@inheritDoc}
   */
  @SuppressWarnings("unchecked")
  @Override
  @NotNull
  public Object[] toArray(@NotNull Object[] o) {
    throw new UnsupportedOperationException("toArray(Object[] o) method is not supported.");
  }

  /**
   * Adds the specified item to this list with the given sort key. If the item is a {@link Thing}
   * and its container is null, the container is set to the container of this list.
   *
   * @param sortKey The sort key of the item to be added.
   * @param item The item to be added.
   * @throws NullPointerException when {@code item} is null.
   */
  private void add(long sortKey, T item) {
    if ((item instanceof Thing) && this.isComposite) {
      Thing domainObject = (Thing) item;
      domainObject.setContainer(this.container);
    }

    if (this.sortedItems.containsKey(sortKey)) {
      throw new IllegalArgumentException("The key already exists");
    }

    if (item instanceof Thing) {
      if (this.sortedItems.containsValue(item)) {
        return;
      }
    }

    this.sortedItems.put(sortKey, item);
    this.highestKey = Math.max(sortKey, this.highestKey);
  }

  /**
   * Get the converted to a specified type value.
   *
   * @param value String value to convert.
   */
  private T getConvertedValue(String value) {
    // Boxed primitives
    switch (this.clazz.getName()) {
      case "java.lang.Boolean": {
        return this.clazz.cast(Boolean.parseBoolean(value));
      }
      case "java.lang.Byte": {
        return this.clazz.cast(Byte.parseByte(value));
      }
      case "java.lang.Short": {
        return this.clazz.cast(Short.parseShort(value));
      }
      case "java.lang.Integer": {
        return this.clazz.cast(Integer.parseInt(value));
      }
      case "java.lang.Long": {
        return this.clazz.cast(Long.parseLong(value));
      }
      case "java.lang.Float": {
        return this.clazz.cast(Float.parseFloat(value));
      }
      case "java.lang.Double": {
        return this.clazz.cast(Double.parseDouble(value));
      }
    }

    if (this.clazz == UUID.class) {
      return this.clazz.cast(UUID.fromString(value));
    }

    if (this.clazz == String.class) {
      return this.clazz.cast(value);
    }

    // Default attempt to cast
    return this.clazz.cast(value);
  }

  /**
   * Validates a value for being null.
   *
   * @param value The value to validate.
   * @param message The message to pass to an exception if validation not passes.
   * @throws NullPointerException when {@code value} is null.
   */
  private void validateValueForNull(Object value, String message) {
    if (value == null) {
      throw new NullPointerException(message);
    }
  }

  /**
   * Validates an index to be within an allowed range of the list of items.
   *
   * @param index The value to validate.
   * @throws IndexOutOfBoundsException when {@code index} is out of the allowed range.
   */
  private void validateIndex(int index) {
    if (index < 0 || index >= this.sortedItems.size()) {
      String rangeMessage = this.sortedItems.size() == 0 ? "the list is empty"
          : "valid range is 0 to " + (this.sortedItems.size() - 1);
      throw new IndexOutOfBoundsException(
          String.format("The index %s does not exist in the ordered item list, %s", index,
              rangeMessage));
    }
  }

  /**
   * Validates whether an item is already in the list of items.
   *
   * @param item The item to validate.
   * @throws IllegalArgumentException when {@code item} is already in the list.
   */
  private void validateItemForExistence(T item) {
    if (this.sortedItems.values().contains(item)) {
      Thing thing = as(item, Thing.class);
      String message = thing != null ? thing.getIid().toString()
          : "An item is not a Thing. Incorrect use of validation.";
      throw new IllegalArgumentException(
          String.format("OrderedItemList already contains the item: %s", message));
    }
  }
}
