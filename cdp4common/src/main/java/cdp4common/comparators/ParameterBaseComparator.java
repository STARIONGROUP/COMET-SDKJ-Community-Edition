/*
 * ParameterBaseComparator.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.ParameterBase;
import cdp4common.sitedirectorydata.ParameterType;

import java.util.Comparator;

/**
 * The {@link Comparator} used to sort {@link ParameterBase} from the Name of its {@link ParameterType}
 */
public class ParameterBaseComparator implements Comparator<ParameterBase> {
    /**
     * Compares two {@link ParameterBase} and returns a value indicating whether one is less than, equal to, or greater than the other.
     *
     * @param x The first {@link ParameterBase}
     * @param y The second {@link ParameterBase}
     * @return Less than zero : x is less than y. Zero: x equals y. Greater than zero: x is greater than y.
     */
    public int compare(ParameterBase x, ParameterBase y) {
        return x.getParameterType().getName().compareToIgnoreCase(y.getParameterType().getName());
    }
}
