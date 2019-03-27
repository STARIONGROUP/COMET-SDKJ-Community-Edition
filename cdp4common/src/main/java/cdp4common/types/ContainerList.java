/*
 * ContainerList.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * List Type used for the 10-25 model for classes which are part of a composition relationship
 *
 * @param <T> the type of {@link Thing} that this List contains
 */
public class ContainerList<T extends Thing> extends ArrayList<T> {
    /**
     * Backing field for the container of this {@link ContainerList}
     */
    private final Thing container;

    /**
     * Initializes a new instance of the {@link ContainerList} class
     *
     * @param container the {@link Thing} that contains this {@link ContainerList}
     */
    public ContainerList(Thing container) {
        this.container = container;
    }

    /**
     * Initializes a new instance of the {@link ContainerList} class
     *
     * @param containerList            The {@link ContainerList} which values are copied.
     * @param updateContaineeContainer A value indicating whether the container of the contained items, the containees,
     *                                 in the provided {@code containerList} shall be set to the provided {@code container}.
     * @ param container The owner of this {@link ContainerList}.
     */
    public ContainerList(ContainerList<T> containerList, Thing container, boolean updateContaineeContainer) {
        super(containerList);
        this.container = container;

        if (updateContaineeContainer) {
            for (T item : containerList) {
                item.setContainer(this.container);
            }
        }
    }

    /**
     * Adds a new {@link Thing} in the {@link Thing} and sets its {@link Thing#setContainer} property
     *
     * @param thing The new {@link Thing} to add.
     */
    @Override
    public boolean add(T thing) {
        thing.setContainer(this.container);

        if (this.contains(thing)) {
            throw new IllegalArgumentException(String.format("The added item already exists %1$s.", thing.getIid()));
        }

        return super.add(thing);
    }

    /**
     * Adds a {@link Collection} of {@link Thing} in the {@link ArrayList} and sets their {@link Thing#getContainer()} property
     *
     * @param things The new {@link Thing}s to add.
     */
    @Override
    public boolean addAll(Collection<? extends T> things) {
        for (T thing : things) {
            this.add(thing);
        }

        return true;
    }

    /**
     * Gets or sets the value of the {@link Thing} associated with the specified index.
     *
     * @param index The index
     * @return The {@link Thing} with the specified index (only for get).
     */
    public T set(int index, T element) {
        if (index < 0 || index > this.size()){
            throw new IndexOutOfBoundsException(String.format("index is %1$s, valid range is 0 to %2$s", index, this.size() - 1));
        }

        if (element == null) {
            throw new IllegalArgumentException("value");
        }

        if (this.contains(element) && this.get(index) != element) {
            throw new IllegalArgumentException(String.format("The added item already exists %1$s.", element.getIid()));
        }

        element.setContainer(this.container);
        return super.set(index, element);
    }
}
