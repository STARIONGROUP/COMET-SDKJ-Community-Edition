/*
 * OptionComparator.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.Option;

import java.util.Comparator;

/**
 * A comparator class for {@link Option} where the order of a {@link Option}
 * is determined by Order of the {@link Option}s in the contained {@link Iteration}
 */
public class OptionComparator implements Comparator<Option> {
    /**
     * Compares two {@link Option}s
     *
     * @param x The first instance of {@link Option} to compare.
     * @param y The second instance of {@link Option} to compare.
     * @return Less than zero : x is less than y.Zero: x equals y. Greater than zero: x is greater than y.
     */
    public int compare(Option x, Option y) {
        return ComparatorUtil.compareOptions(x, y);
    }
}



