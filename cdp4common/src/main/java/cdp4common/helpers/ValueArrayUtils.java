/*
 * ValueArrayUtils.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */
package cdp4common.helpers;

import cdp4common.types.ValueArray;

import java.util.ArrayList;

/**
 * The purpose of the {@link ValueArrayUtils} <see cref="ValueArrayUtils"/> is to provide static helper methods for handling
 * business logic related to {@link ValueArray}
 */
public class ValueArrayUtils {
    /**
     * Creates a {@link ValueArray} of strings with as many slots containing "-" as the provided {@code numberOfValues}
     *
     * @param numberOfValues An integer denoting the number of slots, this may not be lower than one.
     * @return An instance of {@link ValueArray}
     */
    public static ValueArray<String> createDefaultValueArray(int numberOfValues) {
        if (numberOfValues < 1) {
            throw new IndexOutOfBoundsException(String.format("The %s may not be smaller than 1.", numberOfValues));
        }

        var defaultValue = new ArrayList<String>(numberOfValues);

        for (int i = 0; i < numberOfValues; i++) {
            defaultValue.add("-");
        }

        return new ValueArray<>(defaultValue, String.class);
    }
}