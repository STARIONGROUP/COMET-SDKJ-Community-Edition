/*
 * DefinedThingComparator.java
 * Copyright (c) 2019 RHEA System S.A.
 */
package cdp4common.comparators;

import cdp4common.commondata.DefinedThing;

import java.util.Comparator;

/**
 * The {@link Comparator} used to sort {@link DefinedThing} from the Name of its {@link DefinedThing}
 */
public class DefinedThingComparator implements Comparator<DefinedThing> {
    /**
     * Compares two {@link DefinedThing} and returns a value indicating whether one is less than, equal to, or greater than the other.
     *
     * @param x The first {@link DefinedThing}
     * @param y The second {@link DefinedThing}
     * @return Less than zero : x is less than y. Zero: x equals y. Greater than zero: x is greater than y.
     */
    public int compare(DefinedThing x, DefinedThing y) {
        return x.getName().compareToIgnoreCase(y.getName());
    }
}
