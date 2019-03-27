/*
 * ShortNameThingComparator.java
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

import cdp4common.commondata.ShortNamedThing;

import java.util.Comparator;

public class ShortNameThingComparator implements Comparator<ShortNamedThing> {
    /**
     * Compares two objects and returns a value indicating whether one is less than, equal to, or greater than the other.
     *
     * @param x The first object to compare.
     * @param y The second object to compare.
     * @return A signed integer that indicates the relative values of {@code x} and {@code y}, as shown in the following table.
     * Value Meaning Less than zero {@code x} is less than {@code y}. Zero {@code x} equals {@code y}.
     * Greater than zero {@code x} is greater than {@code y}.
     */
    public int compare(ShortNamedThing x, ShortNamedThing y) {
        return x.getShortName().compareToIgnoreCase(y.getShortName());
    }
}
