/*
 * ArrayParameterTypeTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.sitedirectorydata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ArrayParameterTypeTest {
    private ArrayParameterType arrayParameterType;

    @BeforeEach
    void setup() {
        this.arrayParameterType = new ArrayParameterType(UUID.randomUUID(), null, null);
    }

    @Test
    void testGetters() {
        assertEquals(0, this.arrayParameterType.getRank());
        assertFalse(this.arrayParameterType.getHasSingleComponentType());
    }
}
