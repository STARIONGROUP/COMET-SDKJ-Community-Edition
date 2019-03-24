/*
 * ValueArrayTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
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
