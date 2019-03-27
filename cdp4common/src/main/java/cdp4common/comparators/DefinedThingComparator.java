/*
 * DefinedThingComparator.java
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
package cdp4common.comparators;

import cdp4common.commondata.DefinedThing;

import java.util.Comparator;

/**
 * The {@link Comparator} used to sort {@link DefinedThing} from the Name of its {@link DefinedThing}
 */
public class DefinedThingComparator implements Comparator<DefinedThing> {
    /**
     * Compares two {@link DefinedThing} and returns a value indicating whether one is less than, equal to, or greater than the other.
     *
     * @param x The first {@link DefinedThing}
     * @param y The second {@link DefinedThing}
     * @return Less than zero : x is less than y. Zero: x equals y. Greater than zero: x is greater than y.
     */
    public int compare(DefinedThing x, DefinedThing y) {
        return x.getName().compareToIgnoreCase(y.getName());
    }
}
