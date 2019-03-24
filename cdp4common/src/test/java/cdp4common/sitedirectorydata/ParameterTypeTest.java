/*
 * PersonTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.sitedirectorydata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterTypeTest {
    @Test
    void testGetNumberOfValue() {
        BooleanParameterType type = new BooleanParameterType();
        assertEquals(1, type.getNumberOfValues());
    }
}
