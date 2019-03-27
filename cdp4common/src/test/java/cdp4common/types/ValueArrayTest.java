/*
 * ValueArrayTest.java
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

package cdp4common.types;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValueArrayTest {
    @Test
    void verifyThatValueArrayToStringWorks() {
        ValueArray<Float> array = new ValueArray<>(List.of(1f, 2f, 3f, 4.1f), Float.class);
        String s = array.toString();

        assertEquals("{1.0; 2.0; 3.0; 4.1}", s);
    }

    @Test
    void verifyThatValueArrayToStringWorksWithStrings() {
        ValueArray<String> array = new ValueArray<>(List.of("abc", "def", "3", "4.1"), String.class);
        String s = array.toString();

        assertEquals("{\"abc\"; \"def\"; \"3\"; \"4.1\"}", s);
    }

    @Test
    void verifyThatEmptyArrayReturnsEmptyString() {
        ValueArray<String> array = new ValueArray<>(new ArrayList<>(), String.class);

        assertEquals(null, array.toString());
    }
}
