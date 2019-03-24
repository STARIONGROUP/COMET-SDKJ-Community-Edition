/*
 * ElementUsageComparator.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.ElementUsage;

import java.util.Comparator;

/**
 * The {@link Comparator} used to sort {@link ElementUsage} from its Name
 */
public class ElementUsageComparator implements Comparator<ElementUsage> {
    /**
     * Compares two {@link ElementUsage} and returns a value indicating whether one is less than, equal to, or greater than the other.
     *
     * @param x The first {@link ElementUsage}
     * @param y The second {@link ElementUsage}
     * @return Less than zero : x is less than y. Zero: x equals y. Greater than zero: x is greater than y.
     */
    public int compare(ElementUsage x, ElementUsage y) {
        return x.getName().compareToIgnoreCase(y.getName());
    }
}
