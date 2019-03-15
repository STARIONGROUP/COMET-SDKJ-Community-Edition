/*
 * ParameterBaseComparatorTest.java
 * Copyright (c) 2019 RHEA System S.A.
 */
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.Parameter;
import cdp4common.sitedirectorydata.BooleanParameterType;
import cdp4common.sitedirectorydata.CompoundParameterType;
import cdp4common.sitedirectorydata.EnumerationParameterType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterBaseComparatorTest {
    @Test
    void testComparator() {
        var type1 = new EnumerationParameterType();
        type1.setName("a");
        var type2 = new EnumerationParameterType();
        type2.setName("c");

        var parameter1 = new Parameter();
        parameter1.setParameterType(type1);
        var parameter2 = new Parameter();
        parameter2.setParameterType(type2);

        var comparator = new ParameterBaseComparator();
        assertEquals(-2, comparator.compare(parameter1, parameter2));

        type1.setName("d");
        assertEquals(1, comparator.compare(parameter1, parameter2));

        type2.setName("d");
        assertEquals(0, comparator.compare(parameter1, parameter2));
    }

    @Test
    void testComparator2() {
        var type1 = new CompoundParameterType();
        type1.setName("C");
        var type2 = new BooleanParameterType();
        type2.setName("a");

        var parameter1 = new Parameter();
        parameter1.setParameterType(type1);
        var parameter2 = new Parameter();
        parameter2.setParameterType(type2);

        var comparator = new ParameterBaseComparator();
        assertEquals(2, comparator.compare(parameter1, parameter2));
    }
}
