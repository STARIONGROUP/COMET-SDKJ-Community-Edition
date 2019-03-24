/*
 * ValueArrayParserTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
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
