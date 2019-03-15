/*
 * ParameterGroupComparator.java
 * Copyright (c) 2019 RHEA System S.A.
 */
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.ParameterGroup;

import java.util.Comparator;

/**
 * The {@link Comparator} used to sort {@link ParameterGroup} from its Name
 */
public class ParameterGroupComparator implements Comparator<ParameterGroup> {
    /**
     * Compares two {@link ParameterGroup} and returns a value indicating whether one is less than, equal to, or greater than the other.
     *
     * @param x The first {@link ParameterGroup}
     * @param y The second {@link ParameterGroup}
     * @return Less than zero : x is less than y. Zero: x equals y. Greater than zero: x is greater than y.
     */
    public int compare(ParameterGroup x, ParameterGroup y) {
        return x.getName().compareToIgnoreCase(y.getName());
    }
}
