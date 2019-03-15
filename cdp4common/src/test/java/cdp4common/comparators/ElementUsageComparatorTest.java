/*
 * ElementUsageComparatorTest.java
 * Copyright (c) 2019 RHEA System S.A.
 */
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.ElementUsage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ElementUsageComparatorTest {
    @Test
    void testComparator() {
        var usage1 = new ElementUsage();
        usage1.setName("type1");
        var usage2 = new ElementUsage();
        usage2.setName("type5");

        var comparator = new ElementUsageComparator();

        assertEquals(-4, comparator.compare(usage1, usage2));
    }
}
