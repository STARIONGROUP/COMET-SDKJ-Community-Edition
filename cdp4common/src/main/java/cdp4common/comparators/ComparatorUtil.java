/*
 * ComparatorUtil.java
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
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.*;

import java.util.OptionalInt;

/**
 * A utility comparator class for common operations for other comparators
 */
final class ComparatorUtil {
    /**
     * Compare the two instances of {@link ValueSet}
     *
     * @param x The first instance of {@link ValueSet} to compare.
     * @param y The second instance of {@link ValueSet} to compare.
     * @return Less than zero : x is less than y. Zero: x equals y. Greater than zero: x is greater than y.
     */
    static int compareValueSet(ValueSet x, ValueSet y) {
        int optionCompare = compareOptions(x.getActualOption(), y.getActualOption());
        if (optionCompare == 0) {
            return compareActualState(x.getActualState(), y.getActualState());
        }

        return optionCompare;
    }

    /**
     * Compares two {@link Option}s. The order is determined by the ordering in the container collection
     *
     * @param x The first instance of {@link Option} to compare.
     * @param y The second instance of {@link Option} to compare.
     * @return Less than zero : x is less than y. Zero: x equals y. Greater than zero: x is greater than y.
     */
    static int compareOptions(Option x, Option y) {
        OptionalInt optional = ComparatorUtil.compareForNull(x, y);
        if (optional.isPresent()) return optional.getAsInt();

        Iteration iterationX = (Iteration) x.getContainer();
        Iteration iterationY = (Iteration) y.getContainer();

        if (iterationX != iterationY) {
            throw new IllegalArgumentException("The Options are not contained by the same Iteration and cannot be compared.");
        }

        int indexX = iterationX.getOption().indexOf(x);
        int indexY = iterationY.getOption().indexOf(y);

        return compareIndexes(indexX, indexY);
    }

    /**
     * Compare the two instances of {@link ActualFiniteState} the order is determined by the ordering in the container collection
     *
     * @param x The first instance of {@link ActualFiniteState} to compare.
     * @param y The second instance of {@link ActualFiniteState} to compare.
     * @return Less than zero : x is less than y. Zero: x equals y. Greater than zero: x is greater than y.
     */
    private static int compareActualState(ActualFiniteState x, ActualFiniteState y) {
        OptionalInt optional = ComparatorUtil.compareForNull(x, y);
        if (optional.isPresent()) return optional.getAsInt();

        ActualFiniteStateList actualFiniteStateListX = (ActualFiniteStateList) x.getContainer();
        ActualFiniteStateList actualFiniteStateListY = (ActualFiniteStateList) y.getContainer();

        if (actualFiniteStateListX != actualFiniteStateListY) {
            throw new IllegalArgumentException("The ActualFiniteStates are not contained by the same ActualFiniteStateList and cannot be compared.");
        }

        int indexX = actualFiniteStateListX.getActualState().indexOf(x);
        int indexY = actualFiniteStateListY.getActualState().indexOf(y);

        return compareIndexes(indexX, indexY);
    }

    /**
     * Compares two {@code int} values numerically.
     *
     * @param indexX the first {@code int} to compare
     * @param indexY the second {@code int} to compare
     * @return the value {@code 0} if {@code x == y};
     * a value less than {@code 0} if {@code x < y}; and
     * a value greater than {@code 0} if {@code x > y}
     */
    private static int compareIndexes(int indexX, int indexY) {
        return Integer.compare(indexX, indexY);
    }

    /**
     * Compare two {@code Objects} where each or both can be {@code null}
     *
     * @param x The first {@link Object} to compare.
     * @param y The second {@link Object} to compare.
     * @return {@link OptionalInt} of less than zero : x is not null and y is.
     * Zero: both x and y are null.
     * Greater than zero: x is null and y is not.
     * Empty if both are not null.
     */
    private static OptionalInt compareForNull(Object x, Object y) {
        if (x != null && y == null) {
            return OptionalInt.of(-1);
        }

        if (x == null && y != null) {
            return OptionalInt.of(1);
        }

        if (x == null) {
            return OptionalInt.of(0);
        }

        return OptionalInt.empty();
    }
}
