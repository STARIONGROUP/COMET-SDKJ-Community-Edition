/*
 * ParameterSubscriptionValueSetComparator.java
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

import cdp4common.engineeringmodeldata.ParameterSubscriptionValueSet;
import cdp4common.engineeringmodeldata.ParameterValueSet;

import java.util.Comparator;

/**
 * A comparator class for {@link ParameterSubscriptionValueSet} where the order of a {@link ParameterSubscriptionValueSet}
 * is determined by the referenced option and actual finite state and their order
 */
public class ParameterSubscriptionValueSetComparator implements Comparator<ParameterSubscriptionValueSet> {
    /**
     * Compares two {@link ParameterValueSet}s
     *
     * @param x The first instance of {@link ParameterValueSet} to compare.
     * @param y The second instance of {@link ParameterValueSet} to compare.
     * @return Less than zero : x is less than y. Zero: x equals y. Greater than zero: x is greater than y.
     */
    public int compare(ParameterSubscriptionValueSet x, ParameterSubscriptionValueSet y) {
        return ComparatorUtil.compareValueSet(x, y);
    }
}
