/*
 * ParameterGroupComparatorTest.java
 * Copyright (c) 2019 RHEA System S.A.
 */
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.ParameterGroup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterGroupComparatorTest {
    @Test
    void testComparator() {
        var parameter1 = new ParameterGroup();
        parameter1.setName("type1");
        var parameter2 = new ParameterGroup();
        parameter2.setName("type5");

        var comparator = new ParameterGroupComparator();
        assertEquals(-4, comparator.compare(parameter1, parameter2));
    }
}
