/*
 * ParameterOverrideValueSetComparator.java
 * Copyright (c) 2019 RHEA System S.A.
 */
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.ParameterOverrideValueSet;
import cdp4common.engineeringmodeldata.ParameterValueSet;

import java.util.Comparator;

/**
 * A comparator class for {@link ParameterOverrideValueSet} where the order of a {@link ParameterOverrideValueSet}
 * is determined by the referenced option and actual finite state and their order
 */
public class ParameterOverrideValueSetComparator implements Comparator<ParameterOverrideValueSet> {
    /**
     * Compares two {@link ParameterValueSet}s
     *
     * @param x The first instance of {@link ParameterValueSet} to compare.</param>
     * @param y The second instance of {@link ParameterValueSet} to compare.</param>
     * @return Less than zero : x is less than y. Zero: x equals y. Greater than zero: x is greater than y.
     */
    public int compare(ParameterOverrideValueSet x, ParameterOverrideValueSet y) {
        return ComparatorUtil.compareValueSet(x, y);
    }
}
