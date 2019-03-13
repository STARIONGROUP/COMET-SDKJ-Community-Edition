/*
 * ParameterSubscriptionValueSetComparatorTest.java
 * Copyright (c) 2019 RHEA System S.A.
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

        var possibleFiniteStateList = new PossibleFiniteStateList(UUID.randomUUID(), null, null);
        var possibleFiniteStateA = new PossibleFiniteState(UUID.randomUUID(), null, null);
        possibleFiniteStateA.setName("state a");
        possibleFiniteStateA.setShortName("statea");
        var possibleFiniteStateB = new PossibleFiniteState(UUID.randomUUID(), null, null);
        possibleFiniteStateB.setName("state b");
        possibleFiniteStateB.setShortName("stateb");
        possibleFiniteStateList.getPossibleState().add(possibleFiniteStateB);
        possibleFiniteStateList.getPossibleState().add(possibleFiniteStateA);
        this.iteration.getPossibleFiniteStateList().add(possibleFiniteStateList);

        var actualFiniteStateList = new ActualFiniteStateList(UUID.randomUUID(), null, null);
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
        var parameterValueSetA = new ParameterValueSet();
        parameterValueSetA.setActualOption(this.optionA);
        var parameterValueSetB = new ParameterValueSet();
        parameterValueSetB.setActualOption(this.optionB);

        var subscriptionValueSetA = new ParameterSubscriptionValueSet();
        subscriptionValueSetA.setSubscribedValueSet(parameterValueSetA);

        var subscriptionValueSetB = new ParameterSubscriptionValueSet();
        subscriptionValueSetB.setSubscribedValueSet(parameterValueSetB);

        var comparator = new ParameterSubscriptionValueSetComparator();
        var comparisonAB = comparator.compare(subscriptionValueSetA, subscriptionValueSetB);
        assertEquals(1, comparisonAB);

        var comparisonBA = comparator.compare(subscriptionValueSetB, subscriptionValueSetA);
        assertEquals(-1, comparisonBA);

        var comparisonAA = comparator.compare(subscriptionValueSetA, subscriptionValueSetA);
        assertEquals(0, comparisonAA);

        var comparisonBB = comparator.compare(subscriptionValueSetB, subscriptionValueSetB);
        assertEquals(0, comparisonBB);
    }

    @Test
    void verifyThatStateFullValueSetsComparatorCompareReturnsExpectedResults() {
        var parameterValueSetA = new ParameterValueSet();
        parameterValueSetA.setActualState(this.actualFiniteStateA);
        var parameterValueSetB = new ParameterValueSet();
        parameterValueSetB.setActualState(this.actualFiniteStateB);

        var subscriptionValueSetA = new ParameterSubscriptionValueSet();
        subscriptionValueSetA.setSubscribedValueSet(parameterValueSetA);

        var subscriptionValueSetB = new ParameterSubscriptionValueSet();
        subscriptionValueSetB.setSubscribedValueSet(parameterValueSetB);

        var comparer = new ParameterSubscriptionValueSetComparator();
        var comparisonAB = comparer.compare(subscriptionValueSetA, subscriptionValueSetB);
        assertEquals(1, comparisonAB);

        var comparisonBA = comparer.compare(subscriptionValueSetB, subscriptionValueSetA);
        assertEquals(-1, comparisonBA);

        var comparisonAA = comparer.compare(subscriptionValueSetA, subscriptionValueSetA);
        assertEquals(0, comparisonAA);

        var comparisonBB = comparer.compare(subscriptionValueSetB, subscriptionValueSetB);
        assertEquals(0, comparisonBB);
    }

    @Test
    void verifyThatOptionDepStateFullValueSetsComparatorCompareReturnsExpectedResults() {
        var parameterValueSetAA = new ParameterValueSet();
        parameterValueSetAA.setActualOption(this.optionA);
        parameterValueSetAA.setActualState(this.actualFiniteStateA);

        var aa = new ParameterSubscriptionValueSet();
        aa.setSubscribedValueSet(parameterValueSetAA);

        var parameterValueSetAB = new ParameterValueSet();
        parameterValueSetAB.setActualOption(this.optionA);
        parameterValueSetAB.setActualState(this.actualFiniteStateB);

        var ab = new ParameterSubscriptionValueSet();
        ab.setSubscribedValueSet(parameterValueSetAB);

        var parameterValueSetBB = new ParameterValueSet();
        parameterValueSetBB.setActualOption(this.optionB);
        parameterValueSetBB.setActualState(this.actualFiniteStateB);

        var bb = new ParameterSubscriptionValueSet();
        bb.setSubscribedValueSet(parameterValueSetBB);

        var parameterValueSetBA = new ParameterValueSet();
        parameterValueSetBA.setActualOption(this.optionB);
        parameterValueSetBA.setActualState(this.actualFiniteStateA);

        var ba = new ParameterSubscriptionValueSet();
        ba.setSubscribedValueSet(parameterValueSetBA);

        var comparer = new ParameterSubscriptionValueSetComparator();

        var comparison_aa_ab = comparer.compare(aa, ab);
        assertEquals(1, comparison_aa_ab);

        var comparison_aa_bb = comparer.compare(aa, bb);
        assertEquals(1, comparison_aa_bb);

        var comparison_ab_ab = comparer.compare(ab, ab);
        assertEquals(0, comparison_ab_ab);
    }
}
