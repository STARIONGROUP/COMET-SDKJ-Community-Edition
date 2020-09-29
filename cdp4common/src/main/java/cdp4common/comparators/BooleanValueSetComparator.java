/*
 * BooleanValueSetComparator.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené, Alexander van Delft
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

import cdp4common.types.ValueArray;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Default comparer to be used when comparing {@link ValueArray<String>}s of the Boolean type.
 */
public class BooleanValueSetComparator implements Comparator<ValueArray<String>> {
    /**
     * Compares two objects and returns a value indicating whether one is less than, equal to, or greater than the other.
     *
     * @param x The first object to compare.
     * @param y The second object to compare.
     * @return A signed integer that indicates the relative values of {@code x} and {@code y}, as shown in the following table.
     * Value
     * Meaning
     * Less than zero
     * {@code x} is less than {@code y}.
     * Zero
     * {@code x} equals {@code y}.
     * Greater than zero
     * {@code x} is greater than {@code y}.
     */
    public int compare(ValueArray<String> x, ValueArray<String> y) {
        var xAsBooleanList = new ArrayList<Boolean>();
        var yAsBooleanList = new ArrayList<Boolean>();

        if (this.tryConvertStringValueArrayToBooleanList(x, xAsBooleanList) && this.tryConvertStringValueArrayToBooleanList(y, yAsBooleanList)) {
            if (xAsBooleanList.size() == yAsBooleanList.size()) {
                var areEqual = true;

                for (int i = 0; i < xAsBooleanList.size(); i++) {
                    if (!xAsBooleanList.get(i).equals(yAsBooleanList.get(i))) {
                        areEqual = false;
                        break;
                    }
                }

                if (areEqual) {
                    return 0;
                }
            }
        }

        return x.toString().toLowerCase().compareTo(y.toString().toLowerCase());
    }

    /**
     * Try to convert a {@link ValueArray{String}} to a {@link List{Boolean}}
     *
     * @param stringArray The {@link ValueArray<String>}
     * @param booleanList The {@link List<String>}
     * @return true is conversion was successful, otherwise false
     */
    public boolean tryConvertStringValueArrayToBooleanList(ValueArray<String> stringArray, List<Boolean> booleanList) {
        for (var value : stringArray) {
            if (!"true".equalsIgnoreCase(value) && !"false".equalsIgnoreCase(value)) {
                return false;
            }

            booleanList.add("true".equalsIgnoreCase(value));
        }

        return true;
    }
}
