/*
 * ParameterValueSetComparator.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.ParameterValueSet;

import java.util.Comparator;

/**
 * A comparator class for {@link ParameterValueSet} where the order of a {@link ParameterValueSet}
 * is determined by the referenced option and actual finite state and their order
 */
public class ParameterValueSetComparator implements Comparator<ParameterValueSet> {
    /**
     * Compares two {@link ParameterValueSet}s
     *
     * @param x The first instance of {@link ParameterValueSet} to compare.
     * @param y The second instance of {@link ParameterValueSet} to compare.
     * @return Less than zero : x is less than y. Zero: x equals y. Greater than zero: x is greater than y.
     */
    public int compare(ParameterValueSet x, ParameterValueSet y) {
        return ComparatorUtil.compareValueSet(x, y);
    }
}
