/*
 * ElementDefinitionComparatorTest.java
 * Copyright (c) 2019 RHEA System S.A.
 */
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.ElementDefinition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ElementDefinitionComparatorTest {
    @Test
    void TestComparer() {
        var usage1 = new ElementDefinition();
        usage1.setName("type1");
        var usage2 = new ElementDefinition();
        usage2.setName("type5");

        var comparator = new ElementDefinitionComparator();

        assertEquals(-4, comparator.compare(usage1, usage2));
    }
}
