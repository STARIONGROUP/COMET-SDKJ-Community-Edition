/*
 * ValueArray.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.types;

import cdp4common.commondata.Thing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/**
 * The {@link ValueArray<T>} class is a collection of a given class type where its order is fixed, and that
 * it can be represented by a simple array structure.
 * <p>
 * Note: In comparison with Thing C# implementation the following properties and methods were abandoned due
 * to the language specifics:
 * - IEnumerator IEnumerable.GetEnumerator(){}
 *
 * @param <T> The {@link Thing} contained by the Value Array.
 */
public class ValueArray<T> implements Iterable<T> {
    /**
     * The underlying collection of items.
     */
    private final ArrayList<T> items;

    /**
     * The container of this {@link ValueArray<T>}
     */
    private Thing container;

    /**
     * Initializes a new instance of the {@link ValueArray<T>} class.
     */
    public ValueArray() {
        this.items = new ArrayList<>();
    }

    /**
     * Initializes a new instance of the {@link ValueArray<T>} class.
     *
     * @param container The container of this {@link ValueArray<T>}
     */
    public ValueArray(Thing container) {
        this.container = container;
        this.items = new ArrayList<>();
    }

    /**
     * Initializes a new instance of the {@link ValueArray<T>} class.
     *
     * @param initializationCollection Collection to initialize this {@link Collection<T>}.
     */
    public ValueArray(Collection<T> initializationCollection) {
        this.items = initializationCollection == null ? new ArrayList<>() : new ArrayList<>(initializationCollection);
    }

    /**
     * Initializes a new instance of the {@link ValueArray<T>} class.
     *
     * @param initializationCollection Collection to initialize this {@link Collection<T>}.
     * @param container                The container of this {@link ValueArray<T>}
     */
    public ValueArray(Collection<T> initializationCollection, Thing container) {
        this.items = initializationCollection == null ? new ArrayList<>() : new ArrayList<>(initializationCollection);
        this.container = container;
    }

    /**
     * Gets the type of the items of this collection.
     */
    public Class getItemType() {
        return this.items.size() > 0 ? this.items.get(0).getClass() : null;
    }

    /**
     * Gets the value of the item associated with the specified index.
     *
     * @param index The zero-based index of the item to get or set.
     * @return The value of the item with the specified index.
     */
    public T get(int index) {
        return this.items.get(index);
    }

    /**
     * Sets the value of the item associated with the specified index.
     *
     * @param index The zero-based index of the item to get or set.
     * @return The value of the item with the specified index.
     */
    public T set(int index, T element) {
        return this.items.set(index, element);
    }

    /**
     * Returns an Iterator that iterates through this collection.
     *
     * @return The {@link Iterator<T>}.
     */
    @Override
    public Iterator<T> iterator() {
        return this.items.iterator();
    }

    /**
     * Returns a string representation of the {@link ValueArray}
     *
     * @return The string representation.
     */
    @Override
    public String toString() {
        if (this.items.size() == 0) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(0).getClass().isAssignableFrom(String.class)) {
                sb.append("\"");
                sb.append(String.format(Locale.ROOT, "%1$s", this.items.get(i)));
                sb.append("\"");
            } else {
                sb.append(String.format(Locale.ROOT, "%1$s", this.items.get(i)));
            }

            if (i != this.items.size() - 1) {
                sb.append("; ");
            }
        }

        sb.append("}");
        return sb.toString();
    }
}
