/*
 * ValueArrayUtilsTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */
package cdp4common.helpers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ValueArrayUtilsTest {
    @Test
    void verify_that_when_size_smaller_than_one_IndexOutOfBoundsException_is_trown() {
        var size = 0;
        assertThrows(IndexOutOfBoundsException.class, () -> ValueArrayUtils.createDefaultValueArray(size));
    }

    @Test
    void verify_that_when_ValueArray_is_created_the_correct_amount_of_slots_are_created() {
        var size = 3;
        var result = ValueArrayUtils.createDefaultValueArray(size);

        assertEquals(size, result.size());
    }
}
