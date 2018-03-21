/* --------------------------------------------------------------------------------------------------------------------
 *    ValueArrayParserTest.java
 *    Copyright (c) 2015-2018 RHEA System S.A.
 *
 *    Author: Sam Gerené, Merlin Bieze, Alex Vorobiev, Naron Phou
 *
 *    This file is part of CDP4-SDK Community Edition
 *
 *    The CDP4-SDK Community Edition is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 3 of the License, or (at your option) any later version.
 *
 *    The CDP4-SDK Community Edition is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with this program; if not, write to the Free Software Foundation,
 *    Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *  --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.types;

import cdp4common.exceptions.ValueArrayParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ValueArrayParserTest {
    private ValueArray<Integer> result;

    @BeforeEach
    void setup() {
        result = null;
    }

    @Test
    void verifyThatStringToValueArrayIntWorks() {
        String stringArray = "{1;2;3}";
        this.result = ValueArrayParser.parseToIntValueArray(stringArray);

        assertEquals(1, (int) this.result.get(0));
        assertEquals(2, (int) this.result.get(1));
        assertEquals(3, (int) this.result.get(2));
    }

    @Test
    void verifyThatStringToValueArrayIntWorks2() {
        String stringArray = "{1}";
        this.result = ValueArrayParser.parseToIntValueArray(stringArray);

        assertEquals(1, (int) this.result.get(0));
    }

    @Test
    void verifyThatExceptionThrown1() {
        String stringArray = "";

        assertThrows(ValueArrayParseException.class, () -> ValueArrayParser.parseToIntValueArray(stringArray));
    }

    @Test
    void verifyThatExceptionThrown2() {
        String stringArray = "1";

        assertThrows(ValueArrayParseException.class, () -> ValueArrayParser.parseToIntValueArray(stringArray));
    }

    @Test
    void verifyThatExceptionThrown3() {
        String stringArray = "{1,2}";

        assertThrows(ValueArrayParseException.class, () -> ValueArrayParser.parseToIntValueArray(stringArray));
    }
}
