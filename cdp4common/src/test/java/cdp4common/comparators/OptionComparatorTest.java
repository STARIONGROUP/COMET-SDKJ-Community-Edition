/*
 * OptionComparatorTest.java
 * Copyright (c) 2019 RHEA System S.A.
 */
package cdp4common.comparators;

import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.Option;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OptionComparatorTest {
    private Iteration iteration;

    private Option optionA;

    private Option optionB;

    @BeforeEach
    void SetUp() {
        this.iteration = new Iteration(UUID.randomUUID(), null, null);
        this.optionA = new Option(UUID.randomUUID(), null, null);
        this.optionA.setName("option a");
        this.optionA.setShortName("optionB");
        this.optionB = new Option(UUID.randomUUID(), null, null);
        this.optionB.setName("option b");
        this.optionB.setShortName("optionB");
        this.iteration.getOption().add(this.optionB);
        this.iteration.getOption().add(this.optionA);
    }

    @Test
    void verifyThatOptionDependentValueSetsComparatorCompareReturnsExpectedResults() {
        var comparator = new OptionComparator();

        assertEquals(0, comparator.compare(null, null));

        assertEquals(1, comparator.compare(null, this.optionA));

        assertEquals(-1, comparator.compare(this.optionA, null));

        var comparisonAB = comparator.compare(this.optionA, this.optionB);
        assertEquals(1, comparisonAB);

        var comparisonBA = comparator.compare(this.optionB, this.optionA);
        assertEquals(-1, comparisonBA);

        var comparisonAA = comparator.compare(this.optionA, this.optionA);
        assertEquals(0, comparisonAA);

        var comparisonBB = comparator.compare(this.optionB, this.optionB);
        assertEquals(0, comparisonBB);
    }

    @Test
    void verifyThatOptionsContainedInDifferentIterationsThrowsException() {
        var comparator = new OptionComparator();

        var iterationX = new Iteration(UUID.randomUUID(), null, null);
        var optionX = new Option(UUID.randomUUID(), null, null);

        iterationX.getOption().add(optionX);

        var iterationY = new Iteration(UUID.randomUUID(), null, null);
        var optionY = new Option(UUID.randomUUID(), null, null);

        iterationY.getOption().add(optionY);

        assertThrows(IllegalArgumentException.class, () -> comparator.compare(optionX, optionY));
    }
}
