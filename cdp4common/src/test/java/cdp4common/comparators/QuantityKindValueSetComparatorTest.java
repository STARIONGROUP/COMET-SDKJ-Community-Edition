/*
 * QuantityKindValueSetComparatorTest.java
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

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Suite of tests for the {@link QuantityKindValueSetComparator}
 */
class QuantityKindValueSetComparatorTest {
    private ValueArray<String> valueArray1;
    private ValueArray<String> valueArray2;
    private ValueArray<String> valueArrayNull;
    private ValueArray<String> valueArrayNegative;
    private ValueArray<String> valueArray01Invariant;
    private ValueArray<String> valueArray01;
    private ValueArray<String> valueArray02Invariant;
    private ValueArray<String> valueArray02;

    private QuantityKindValueSetComparator quantityKindValueSetComparer;

    @BeforeEach
    void setUp() {
        var listWithNull = new ArrayList<String>();
        listWithNull.add(null);

        this.valueArray1 = new ValueArray<>(List.of("1"), String.class);
        this.valueArray2 = new ValueArray<>(List.of("2"), String.class);
        this.valueArrayNull = new ValueArray<>(listWithNull, String.class);
        this.valueArrayNegative = new ValueArray<>(List.of("-1"), String.class);

        this.valueArray01 = new ValueArray<>(List.of("0,1"), String.class);
        this.valueArray01Invariant = new ValueArray<>(List.of("0.1"), String.class);

        this.valueArray02 = new ValueArray<>(List.of("0,2"), String.class);
        this.valueArray02Invariant = new ValueArray<>(List.of("0.2"), String.class);

        quantityKindValueSetComparer = new QuantityKindValueSetComparator();
    }

    @Test
    void verify_that_value_equals() {
        assertEquals(-1, this.quantityKindValueSetComparer.compare(this.valueArray1, this.valueArray2));
        assertEquals(1, this.quantityKindValueSetComparer.compare(this.valueArray2, this.valueArray1));
        assertEquals(0, this.quantityKindValueSetComparer.compare(this.valueArray1, new ValueArray<>(this.valueArray1, String.class)));

        assertEquals(1, this.quantityKindValueSetComparer.compare(this.valueArray1, this.valueArrayNull));
        assertEquals(-1, this.quantityKindValueSetComparer.compare(this.valueArrayNull, this.valueArray1));
        assertEquals(0, this.quantityKindValueSetComparer.compare(this.valueArrayNull, new ValueArray<>(this.valueArrayNull, String.class)));

        assertEquals(1, this.quantityKindValueSetComparer.compare(this.valueArray1, this.valueArrayNegative));
        assertEquals(-1, this.quantityKindValueSetComparer.compare(this.valueArrayNegative, this.valueArray1));
        assertEquals(0, this.quantityKindValueSetComparer.compare(this.valueArrayNegative, new ValueArray<>(this.valueArrayNegative, String.class)));

        assertEquals(1, this.quantityKindValueSetComparer.compare(this.valueArray1, this.valueArray01));
        assertEquals(-1, this.quantityKindValueSetComparer.compare(this.valueArray01, this.valueArray1));
        assertEquals(0, this.quantityKindValueSetComparer.compare(this.valueArray01, new ValueArray<>(this.valueArray01, String.class)));

        assertEquals(1, this.quantityKindValueSetComparer.compare(this.valueArray1, this.valueArray01Invariant));
        assertEquals(-1, this.quantityKindValueSetComparer.compare(this.valueArray01Invariant, this.valueArray1));
        assertEquals(0, this.quantityKindValueSetComparer.compare(this.valueArray01Invariant, new ValueArray<>(this.valueArray01Invariant, String.class)));

        assertEquals(1, this.quantityKindValueSetComparer.compare(this.valueArray1, this.valueArray02));
        assertEquals(-1, this.quantityKindValueSetComparer.compare(this.valueArray02, this.valueArray1));
        assertEquals(0, this.quantityKindValueSetComparer.compare(this.valueArray02, new ValueArray<>(this.valueArray02, String.class)));

        assertEquals(1, this.quantityKindValueSetComparer.compare(this.valueArray1, this.valueArray02Invariant));
        assertEquals(-1, this.quantityKindValueSetComparer.compare(this.valueArray02Invariant, this.valueArray1));
        assertEquals(0, this.quantityKindValueSetComparer.compare(this.valueArray02Invariant, new ValueArray<>(this.valueArray02Invariant, String.class)));

        assertEquals(-1, this.quantityKindValueSetComparer.compare(this.valueArray01Invariant, this.valueArray02Invariant));
        assertEquals(1, this.quantityKindValueSetComparer.compare(this.valueArray02Invariant, this.valueArray01Invariant));

        assertEquals(-1, this.quantityKindValueSetComparer.compare(this.valueArray01, this.valueArray02));
        assertEquals(1, this.quantityKindValueSetComparer.compare(this.valueArray02, this.valueArray01));
    }
}
