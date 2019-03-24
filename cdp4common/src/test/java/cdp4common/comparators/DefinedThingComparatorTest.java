/*
 * DefinedThingComparatorTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.Requirement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefinedThingComparatorTest {
    @Test
    void testComparator() {
        var type1 = new Requirement();
        type1.setName("a");
        var type2 = new Requirement();
        type2.setName("c");

        var comparator = new DefinedThingComparator();

        assertEquals(-2, comparator.compare(type1, type2));
        assertEquals(2, comparator.compare(type2, type1));
        assertEquals(0, comparator.compare(type2, type2));
    }
}
