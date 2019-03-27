/*
 * ValueArray.java
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

package cdp4common.types;

import cdp4common.commondata.Thing;
import com.google.common.collect.Lists;

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
     * The type of the created {@link OrderedItemList<T>}
     */
    private final Class<T> clazz;

    /**
     * Initializes a new instance of the {@link ValueArray<T>} class.
     *
     * @param clazz The type of the contained elements
     */
    public ValueArray(Class<T> clazz) {
        this.items = new ArrayList<>();
        this.clazz = clazz;
    }

    /**
     * Initializes a new instance of the {@link ValueArray<T>} class.
     *
     * @param container The container of this {@link ValueArray<T>}
     * @param clazz     The type of the contained elements
     */
    public ValueArray(Thing container, Class<T> clazz) {
        this.container = container;
        this.items = new ArrayList<>();
        this.clazz = clazz;
    }

    /**
     * Initializes a new instance of the {@link ValueArray<T>} class.
     *
     * @param initializationCollection Collection to initialize this {@link Collection<T>}.
     * @param clazz                    The type of the contained elements
     */
    public ValueArray(Iterable<T> initializationCollection, Class<T> clazz) {
        this.items = initializationCollection == null ? new ArrayList<>() : Lists.newArrayList(initializationCollection);
        this.clazz = clazz;
    }

    /**
     * Initializes a new instance of the {@link ValueArray<T>} class.
     *
     * @param initializationCollection Collection to initialize this {@link Collection<T>}.
     * @param container                The container of this {@link ValueArray<T>}
     * @param clazz                    The type of the contained elements
     */
    public ValueArray(Iterable<T> initializationCollection, Thing container, Class<T> clazz) {
        this.items = initializationCollection == null ? new ArrayList<>() : Lists.newArrayList(initializationCollection);
        this.container = container;
        this.clazz = clazz;
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

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    public int size() {
        return this.items.size();
    }
}
