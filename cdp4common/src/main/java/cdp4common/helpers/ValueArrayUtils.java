/*
 * ValueArrayUtils.java
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
package cdp4common.helpers;

import cdp4common.types.ValueArray;

import java.util.ArrayList;

/**
 * The purpose of the {@link ValueArrayUtils} <see cref="ValueArrayUtils"/> is to provide static helper methods for handling
 * business logic related to {@link ValueArray}
 */
public class ValueArrayUtils {
    /**
     * Creates a {@link ValueArray} of strings with as many slots containing "-" as the provided {@code numberOfValues}
     *
     * @param numberOfValues An integer denoting the number of slots, this may not be lower than one.
     * @return An instance of {@link ValueArray}
     */
    public static ValueArray<String> createDefaultValueArray(int numberOfValues) {
        if (numberOfValues < 1) {
            throw new IndexOutOfBoundsException(String.format("The %s may not be smaller than 1.", numberOfValues));
        }

        var defaultValue = new ArrayList<String>(numberOfValues);

        for (int i = 0; i < numberOfValues; i++) {
            defaultValue.add("-");
        }

        return new ValueArray<>(defaultValue, String.class);
    }
}