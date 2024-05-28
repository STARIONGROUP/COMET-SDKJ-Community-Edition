/*
 * ParameterSubscriptionValueSetComparatorTest.java
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

class ParameterSubscriptionValueSetComparatorTest {
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
      ParameterValueSet parameterValueSetA = new ParameterValueSet();
        parameterValueSetA.setActualOption(this.optionA);
      ParameterValueSet parameterValueSetB = new ParameterValueSet();
        parameterValueSetB.setActualOption(this.optionB);

      ParameterSubscriptionValueSet subscriptionValueSetA = new ParameterSubscriptionValueSet();
        subscriptionValueSetA.setSubscribedValueSet(parameterValueSetA);

      ParameterSubscriptionValueSet subscriptionValueSetB = new ParameterSubscriptionValueSet();
        subscriptionValueSetB.setSubscribedValueSet(parameterValueSetB);

      ParameterSubscriptionValueSetComparator comparator = new ParameterSubscriptionValueSetComparator();
      int comparisonAB = comparator.compare(subscriptionValueSetA, subscriptionValueSetB);
        assertEquals(1, comparisonAB);

      int comparisonBA = comparator.compare(subscriptionValueSetB, subscriptionValueSetA);
        assertEquals(-1, comparisonBA);

      int comparisonAA = comparator.compare(subscriptionValueSetA, subscriptionValueSetA);
        assertEquals(0, comparisonAA);

      int comparisonBB = comparator.compare(subscriptionValueSetB, subscriptionValueSetB);
        assertEquals(0, comparisonBB);
    }

    @Test
    void verifyThatStateFullValueSetsComparatorCompareReturnsExpectedResults() {
      ParameterValueSet parameterValueSetA = new ParameterValueSet();
        parameterValueSetA.setActualState(this.actualFiniteStateA);
      ParameterValueSet parameterValueSetB = new ParameterValueSet();
        parameterValueSetB.setActualState(this.actualFiniteStateB);

      ParameterSubscriptionValueSet subscriptionValueSetA = new ParameterSubscriptionValueSet();
        subscriptionValueSetA.setSubscribedValueSet(parameterValueSetA);

      ParameterSubscriptionValueSet subscriptionValueSetB = new ParameterSubscriptionValueSet();
        subscriptionValueSetB.setSubscribedValueSet(parameterValueSetB);

      ParameterSubscriptionValueSetComparator comparer = new ParameterSubscriptionValueSetComparator();
      int comparisonAB = comparer.compare(subscriptionValueSetA, subscriptionValueSetB);
        assertEquals(1, comparisonAB);

      int comparisonBA = comparer.compare(subscriptionValueSetB, subscriptionValueSetA);
        assertEquals(-1, comparisonBA);

      int comparisonAA = comparer.compare(subscriptionValueSetA, subscriptionValueSetA);
        assertEquals(0, comparisonAA);

      int comparisonBB = comparer.compare(subscriptionValueSetB, subscriptionValueSetB);
        assertEquals(0, comparisonBB);
    }

    @Test
    void verifyThatOptionDepStateFullValueSetsComparatorCompareReturnsExpectedResults() {
      ParameterValueSet parameterValueSetAA = new ParameterValueSet();
        parameterValueSetAA.setActualOption(this.optionA);
        parameterValueSetAA.setActualState(this.actualFiniteStateA);

      ParameterSubscriptionValueSet aa = new ParameterSubscriptionValueSet();
        aa.setSubscribedValueSet(parameterValueSetAA);

      ParameterValueSet parameterValueSetAB = new ParameterValueSet();
        parameterValueSetAB.setActualOption(this.optionA);
        parameterValueSetAB.setActualState(this.actualFiniteStateB);

      ParameterSubscriptionValueSet ab = new ParameterSubscriptionValueSet();
        ab.setSubscribedValueSet(parameterValueSetAB);

      ParameterValueSet parameterValueSetBB = new ParameterValueSet();
        parameterValueSetBB.setActualOption(this.optionB);
        parameterValueSetBB.setActualState(this.actualFiniteStateB);

      ParameterSubscriptionValueSet bb = new ParameterSubscriptionValueSet();
        bb.setSubscribedValueSet(parameterValueSetBB);

      ParameterValueSet parameterValueSetBA = new ParameterValueSet();
        parameterValueSetBA.setActualOption(this.optionB);
        parameterValueSetBA.setActualState(this.actualFiniteStateA);

      ParameterSubscriptionValueSet ba = new ParameterSubscriptionValueSet();
        ba.setSubscribedValueSet(parameterValueSetBA);

      ParameterSubscriptionValueSetComparator comparer = new ParameterSubscriptionValueSetComparator();

      int comparison_aa_ab = comparer.compare(aa, ab);
        assertEquals(1, comparison_aa_ab);

      int comparison_aa_bb = comparer.compare(aa, bb);
        assertEquals(1, comparison_aa_bb);

      int comparison_ab_ab = comparer.compare(ab, ab);
        assertEquals(0, comparison_ab_ab);
    }
}
