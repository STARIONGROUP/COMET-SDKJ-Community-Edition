/*
 * BooleanValueSetComparatorTest.java
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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Suite of tests for the {@link BooleanValueSetComparator}
 */
class BooleanValueSetComparatorTest {
    private ValueArray<String> valueArrayTrue;
    private ValueArray<String> valueArrayFalse;
    private ValueArray<String> valueArrayNotSet;
    private ValueArray<String> valueArrayLowerTrue;
    private ValueArray<String> valueArrayLowerFalse;
    private ValueArray<String> valueArrayWrongTrue;
    private ValueArray<String> valueArrayWrongFalse;

    private BooleanValueSetComparator booleanValueSetComparator;

    @BeforeEach
    void setUp() {
        this.valueArrayTrue = new ValueArray<>(List.of("True"), String.class);
        this.valueArrayFalse = new ValueArray<>(List.of("False"), String.class);
        this.valueArrayLowerTrue = new ValueArray<>(List.of("true"), String.class);
        this.valueArrayLowerFalse = new ValueArray<>(List.of("false"), String.class);
        this.valueArrayNotSet = new ValueArray<>(List.of("-"), String.class);
        this.valueArrayWrongTrue = new ValueArray<>(List.of("1"), String.class);
        this.valueArrayWrongFalse = new ValueArray<>(List.of("0"), String.class);

        this.booleanValueSetComparator = new BooleanValueSetComparator();
    }

    @Test
    void verify_that_values_are_correct() {
        assertTrue(this.booleanValueSetComparator.compare(this.valueArrayTrue, this.valueArrayFalse) > 0);
        assertTrue(this.booleanValueSetComparator.compare(this.valueArrayTrue, this.valueArrayNotSet) > 0);
        assertEquals(0, this.booleanValueSetComparator.compare(this.valueArrayTrue, this.valueArrayLowerTrue));
        assertEquals(0, this.booleanValueSetComparator.compare(this.valueArrayFalse, this.valueArrayLowerFalse));
        assertTrue(this.booleanValueSetComparator.compare(this.valueArrayTrue, this.valueArrayWrongTrue) > 0);
        assertTrue(this.booleanValueSetComparator.compare(this.valueArrayFalse, this.valueArrayWrongFalse) > 0);

        assertTrue(this.booleanValueSetComparator.compare(this.valueArrayFalse, this.valueArrayTrue) < 0);
        assertTrue(this.booleanValueSetComparator.compare(this.valueArrayNotSet, this.valueArrayTrue) < 0);
        assertEquals(0, this.booleanValueSetComparator.compare(this.valueArrayLowerTrue, this.valueArrayTrue));
        assertEquals(0, this.booleanValueSetComparator.compare(this.valueArrayLowerFalse, this.valueArrayFalse));
        assertTrue(this.booleanValueSetComparator.compare(this.valueArrayWrongTrue, this.valueArrayTrue) < 0);
        assertTrue(this.booleanValueSetComparator.compare(this.valueArrayWrongFalse, this.valueArrayFalse) < 0);
    }
}
