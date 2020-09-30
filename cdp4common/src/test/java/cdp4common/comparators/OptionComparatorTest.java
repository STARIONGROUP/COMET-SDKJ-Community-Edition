/*
 * OptionComparatorTest.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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
        OptionComparator comparator = new OptionComparator();

        assertEquals(0, comparator.compare(null, null));

        assertEquals(1, comparator.compare(null, this.optionA));

        assertEquals(-1, comparator.compare(this.optionA, null));

        int comparisonAB = comparator.compare(this.optionA, this.optionB);
        assertEquals(1, comparisonAB);

        int comparisonBA = comparator.compare(this.optionB, this.optionA);
        assertEquals(-1, comparisonBA);

        int comparisonAA = comparator.compare(this.optionA, this.optionA);
        assertEquals(0, comparisonAA);

        int comparisonBB = comparator.compare(this.optionB, this.optionB);
        assertEquals(0, comparisonBB);
    }

    @Test
    void verifyThatOptionsContainedInDifferentIterationsThrowsException() {
        OptionComparator comparator = new OptionComparator();

        Iteration iterationX = new Iteration(UUID.randomUUID(), null, null);
        Option optionX = new Option(UUID.randomUUID(), null, null);

        iterationX.getOption().add(optionX);

        Iteration iterationY = new Iteration(UUID.randomUUID(), null, null);
        Option optionY = new Option(UUID.randomUUID(), null, null);

        iterationY.getOption().add(optionY);

        assertThrows(IllegalArgumentException.class, () -> comparator.compare(optionX, optionY));
    }
}
