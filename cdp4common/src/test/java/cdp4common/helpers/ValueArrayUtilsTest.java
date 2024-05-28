/*
 * ValueArrayUtilsTest.java
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
package cdp4common.helpers;

import cdp4common.types.ValueArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ValueArrayUtilsTest {
    @Test
    void verify_that_when_size_smaller_than_one_IndexOutOfBoundsException_is_trown() {
        int size = 0;
        assertThrows(IndexOutOfBoundsException.class, () -> ValueArrayUtils.createDefaultValueArray(size));
    }

    @Test
    void verify_that_when_ValueArray_is_created_the_correct_amount_of_slots_are_created() {
        int size = 3;
        ValueArray<String> result = ValueArrayUtils.createDefaultValueArray(size);

        assertEquals(size, result.size());
    }
}
