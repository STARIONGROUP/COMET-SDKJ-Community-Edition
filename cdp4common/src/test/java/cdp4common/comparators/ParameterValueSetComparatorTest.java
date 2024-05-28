/*
 * ParameterValueSetComparatorTest.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
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

import cdp4common.engineeringmodeldata.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterValueSetComparatorTest {
    private Iteration iteration;

    private Option optionA;

    private Option optionB;

    private ActualFiniteState actualFiniteStateA;

    private ActualFiniteState actualFiniteStateB;

    @BeforeEach
    void setUp() {
        this.iteration = new Iteration(UUID.randomUUID(), null, null);
        this.optionA = new Option(UUID.randomUUID(), null, null);
        this.optionA.setName("option a");
        this.optionA.setShortName("optionB");
        this.optionB = new Option(UUID.randomUUID(), null, null);
        this.optionB.setName("option b");
        this.optionB.setShortName("optionB");
        this.iteration.getOption().add(this.optionB);
        this.iteration.getOption().add(this.optionA);

      PossibleFiniteStateList possibleFiniteStateList = new PossibleFiniteStateList(UUID.randomUUID(), null, null);
      PossibleFiniteState possibleFiniteStateA = new PossibleFiniteState(UUID.randomUUID(), null, null);
        possibleFiniteStateA.setName("state a");
        possibleFiniteStateA.setShortName("statea");
      PossibleFiniteState possibleFiniteStateB = new PossibleFiniteState(UUID.randomUUID(), null, null);
        possibleFiniteStateB.setName("state b");
        possibleFiniteStateB.setShortName("stateb");
        possibleFiniteStateList.getPossibleState().add(possibleFiniteStateB);
        possibleFiniteStateList.getPossibleState().add(possibleFiniteStateA);
        this.iteration.getPossibleFiniteStateList().add(possibleFiniteStateList);

      ActualFiniteStateList actualFiniteStateList = new ActualFiniteStateList(UUID.randomUUID(), null, null);
        this.actualFiniteStateA = new ActualFiniteState(UUID.randomUUID(), null, null);
        this.actualFiniteStateA.getPossibleState().add(possibleFiniteStateA);
        this.actualFiniteStateB = new ActualFiniteState(UUID.randomUUID(), null, null);
        this.actualFiniteStateB.getPossibleState().add(possibleFiniteStateB);
        actualFiniteStateList.getActualState().add(this.actualFiniteStateB);
        actualFiniteStateList.getActualState().add(this.actualFiniteStateA);
        this.iteration.getActualFiniteStateList().add(actualFiniteStateList);
    }

    @Test
    void verifyThatOptionDependentValueSetsComparatorCompareReturnsExpectedResults() {
      ParameterValueSet valueSetA = new ParameterValueSet();
        valueSetA.setActualOption(this.optionA);
      ParameterValueSet valueSetB = new ParameterValueSet();
        valueSetB.setActualOption(this.optionB);

      ParameterValueSetComparator comparator = new ParameterValueSetComparator();
      int comparisonAB = comparator.compare(valueSetA, valueSetB);
        assertEquals(1, comparisonAB);

      int comparisonBA = comparator.compare(valueSetB, valueSetA);
        assertEquals(-1, comparisonBA);

      int comparisonAA = comparator.compare(valueSetA, valueSetA);
        assertEquals(0, comparisonAA);

      int comparisonBB = comparator.compare(valueSetB, valueSetB);
        assertEquals(0, comparisonBB);
    }

    @Test
    void verifyThatStateFullValueSetsComparatorCompareReturnsExpectedResults() {
      ParameterValueSet valueSetA = new ParameterValueSet();
        valueSetA.setActualState(this.actualFiniteStateA);
      ParameterValueSet valueSetB = new ParameterValueSet();
        valueSetB.setActualState(this.actualFiniteStateB);

      ParameterValueSetComparator comparator = new ParameterValueSetComparator();
      int comparisonAB = comparator.compare(valueSetA, valueSetB);
        assertEquals(1, comparisonAB);

      int comparisonBA = comparator.compare(valueSetB, valueSetA);
        assertEquals(-1, comparisonBA);

      int comparisonAA = comparator.compare(valueSetA, valueSetA);
        assertEquals(0, comparisonAA);

      int comparisonBB = comparator.compare(valueSetB, valueSetB);
        assertEquals(0, comparisonBB);
    }

    @Test
    void verifyThatOptionDepStateFullValueSetsComparatorCompareReturnsExpectedResults() {
      ParameterValueSet aa = new ParameterValueSet();
        aa.setActualOption(this.optionA);
        aa.setActualState(this.actualFiniteStateA);

      ParameterValueSet ab = new ParameterValueSet();
        ab.setActualOption(this.optionA);
        ab.setActualState(this.actualFiniteStateB);

      ParameterValueSet ba = new ParameterValueSet();
        ba.setActualOption(this.optionB);
        ba.setActualState(this.actualFiniteStateA);

      ParameterValueSet bb = new ParameterValueSet();
        bb.setActualOption(this.optionB);
        bb.setActualState(this.actualFiniteStateB);

      ParameterValueSetComparator comparator = new ParameterValueSetComparator();

      int comparison_aa_ab = comparator.compare(aa, ab);
        assertEquals(1, comparison_aa_ab);

      int comparison_aa_bb = comparator.compare(aa, bb);
        assertEquals(1, comparison_aa_bb);
    }
}
