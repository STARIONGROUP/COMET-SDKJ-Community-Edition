/*
 * ElementDefinitionComparator.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.comparators;

import cdp4common.engineeringmodeldata.ElementDefinition;

import java.util.Comparator;

/**
 * The {@link Comparator} used to sort {@link ElementDefinition} from its Name
 */
public class ElementDefinitionComparator implements Comparator<ElementDefinition> {
    /**
     * Compares two {@link ElementDefinition} and returns a value indicating whether one is less than, equal to, or greater than the other.
     *
     * @param x The first {@link ElementDefinition}
     * @param y The second {@link ElementDefinition}
     * @return Less than zero : x is less than y. Zero: x equals y. Greater than zero: x is greater than y.
     */
    public int compare(ElementDefinition x, ElementDefinition y) {
        return x.getName().compareToIgnoreCase(y.getName());
    }
}
