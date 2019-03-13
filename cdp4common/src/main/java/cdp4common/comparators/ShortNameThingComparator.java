/*
 * ShortNameThingComparator.java
 * Copyright (c) 2019 RHEA System S.A.
 */
package cdp4common.comparators;

import cdp4common.commondata.ShortNamedThing;

import java.util.Comparator;

public class ShortNameThingComparator implements Comparator<ShortNamedThing> {
    /**
     * Compares two objects and returns a value indicating whether one is less than, equal to, or greater than the other.
     *
     * @param x The first object to compare.
     * @param y The second object to compare.
     * @return A signed integer that indicates the relative values of {@code x} and {@code y}, as shown in the following table.
     * Value Meaning Less than zero {@code x} is less than {@code y}. Zero {@code x} equals {@code y}.
     * Greater than zero {@code x} is greater than {@code y}.
     */
    public int compare(ShortNamedThing x, ShortNamedThing y) {
        return x.getShortName().compareToIgnoreCase(y.getShortName());
    }
}
