/*
 * ActualFiniteStateComparator.java
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
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.ActualFiniteState;
import cdp4common.engineeringmodeldata.ActualFiniteStateList;
import cdp4common.engineeringmodeldata.PossibleFiniteStateList;

import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * The {@link Comparator} used to sort {@link ActualFiniteState} from its Name
 */
public class ActualFiniteStateComparator implements Comparator<ActualFiniteState> {
    /**
     * Compares two {@link ActualFiniteState} and returns a value indicating whether one is less than, equal to, or greater than the other.
     *
     * @param x The first {@link ActualFiniteState}
     * @param y The second {@link ActualFiniteState}
     * @return Less than zero : x is less than y. Zero: x equals y. Greater than zero: x is greater than y.
     */
    public int compare(ActualFiniteState x, ActualFiniteState y) {
        var xContainer = x.getContainer() instanceof ActualFiniteStateList ? (ActualFiniteStateList) x.getContainer() : null;
        var yContainer = y.getContainer() instanceof ActualFiniteStateList ? (ActualFiniteStateList) y.getContainer() : null;

        if (xContainer == null || yContainer == null || xContainer.getIid() != yContainer.getIid()) {
            throw new IllegalArgumentException("Cannot compare 2 ActualFiniteState in different Lists or one of the container is null.");
        }

        if (x.getIid() == y.getIid()) {
            return 0;
        }

        var xKey = this.getComputedSortKey(x, xContainer);
        var yKey = this.getComputedSortKey(y, yContainer);

        return xKey - yKey;
    }

    /**
     * Compute the sort key of a {@link ActualFiniteState} based on the {@link ActualFiniteState#getPossibleState()} property
     *
     * @param actualState The {@link ActualFiniteState}
     * @param actualList  The  {@link ActualFiniteStateList} container
     * @return The sort-key
     */
    private int getComputedSortKey(ActualFiniteState actualState, ActualFiniteStateList actualList) {
        // The OCDT WSP may return a broken model where the actualState.PossibleState is empty.
        if (actualState.getPossibleState().size() == 0) {
            return Integer.MAX_VALUE;
        }

        var possibleFiniteStateListsSize = actualList.getPossibleFiniteStateList().getSortedItems().values()
                .stream()
                .map(x -> x.getPossibleState().size())
                .collect(Collectors.toList());
        var orderKey = 0;
        for (var possibleState : actualState.getPossibleState()) {
            var power = 1;
            var containerPossibleFiniteStateList = (PossibleFiniteStateList) possibleState.getContainer();
            var position = containerPossibleFiniteStateList.getPossibleState().indexOf(possibleState);

            for (var i = actualList.getPossibleFiniteStateList().indexOf(containerPossibleFiniteStateList) + 1; i < possibleFiniteStateListsSize.size(); i++) {
                power = power * possibleFiniteStateListsSize.get(i);
            }

            orderKey += power * position;
        }

        return orderKey;
    }
}
