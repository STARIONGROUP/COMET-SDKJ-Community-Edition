/*
 * ParameterOverrideValueSetComparatorTest.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
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

class ParameterOverrideValueSetComparatorTest {
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
        var parameter = new Parameter(UUID.randomUUID(), null, null);
        parameter.setOptionDependent(true);
        var parameterValueSetA = new ParameterValueSet();
        var parameterValueSetB = new ParameterValueSet();
        parameter.getValueSet().add(parameterValueSetA);
        parameter.getValueSet().add(parameterValueSetB);

        parameterValueSetA.setActualOption(this.optionA);
        parameterValueSetB.setActualOption(this.optionB);

        var parameterOverride = new ParameterOverride();
        parameterOverride.setParameter(parameter);

        var parameterOverrideValueSetA = new ParameterOverrideValueSet();
        parameterOverrideValueSetA.setParameterValueSet(parameterValueSetA);

        var parameterOverrideValueSetB = new ParameterOverrideValueSet();
        parameterOverrideValueSetB.setParameterValueSet(parameterValueSetB);

        var comparer = new ParameterOverrideValueSetComparator();
        var comparisonAB = comparer.compare(parameterOverrideValueSetA, parameterOverrideValueSetB);
        assertEquals(1, comparisonAB);

        var comparisonBA = comparer.compare(parameterOverrideValueSetB, parameterOverrideValueSetA);
        assertEquals(-1, comparisonBA);

        var comparisonAA = comparer.compare(parameterOverrideValueSetA, parameterOverrideValueSetA);
        assertEquals(0, comparisonAA);

        var comparisonBB = comparer.compare(parameterOverrideValueSetB, parameterOverrideValueSetB);
        assertEquals(0, comparisonBB);
    }

    @Test
    void verifyThatStateFullValueSetsComparatorCompareReturnsExpectedResults() {
        var parameter = new Parameter(UUID.randomUUID(), null, null);
        parameter.setOptionDependent(true);
        var parameterValueSetA = new ParameterValueSet();
        var parameterValueSetB = new ParameterValueSet();
        parameter.getValueSet().add(parameterValueSetA);
        parameter.getValueSet().add(parameterValueSetB);

        parameterValueSetA.setActualState(this.actualFiniteStateA);
        parameterValueSetB.setActualState(this.actualFiniteStateB);

        var parameterOverride = new ParameterOverride();
        parameterOverride.setParameter(parameter);

        var parameterOverrideValueSetA = new ParameterOverrideValueSet();
        parameterOverrideValueSetA.setParameterValueSet(parameterValueSetA);

        var parameterOverrideValueSetB = new ParameterOverrideValueSet();
        parameterOverrideValueSetB.setParameterValueSet(parameterValueSetB);

        var comparer = new ParameterOverrideValueSetComparator();
        var comparisonAB = comparer.compare(parameterOverrideValueSetA, parameterOverrideValueSetB);
        assertEquals(1, comparisonAB);

        var comparisonBA = comparer.compare(parameterOverrideValueSetB, parameterOverrideValueSetA);
        assertEquals(-1, comparisonBA);

        var comparisonAA = comparer.compare(parameterOverrideValueSetA, parameterOverrideValueSetA);
        assertEquals(0, comparisonAA);

        var comparisonBB = comparer.compare(parameterOverrideValueSetB, parameterOverrideValueSetB);
        assertEquals(0, comparisonBB);
    }

    @Test
    void verifyThatOptionDepStateFullValueSetsComparatorCompareReturnsExpectedResults() {
        var parameter = new Parameter(UUID.randomUUID(), null, null);
        parameter.setOptionDependent(true);
        var parameterValueSetAA = new ParameterValueSet();
        var parameterValueSetAB = new ParameterValueSet();
        var parameterValueSetBB = new ParameterValueSet();
        var parameterValueSetBA = new ParameterValueSet();
        parameter.getValueSet().add(parameterValueSetAA);
        parameter.getValueSet().add(parameterValueSetAB);
        parameter.getValueSet().add(parameterValueSetBB);
        parameter.getValueSet().add(parameterValueSetBA);

        parameterValueSetAA.setActualOption(this.optionA);
        parameterValueSetAA.setActualState(this.actualFiniteStateA);

        parameterValueSetAB.setActualOption(this.optionA);
        parameterValueSetAB.setActualState(this.actualFiniteStateB);

        parameterValueSetBB.setActualOption(this.optionB);
        parameterValueSetBB.setActualState(this.actualFiniteStateB);

        parameterValueSetBA.setActualOption(this.optionB);
        parameterValueSetBA.setActualState(this.actualFiniteStateA);

        var parameterOverride = new ParameterOverride();
        parameterOverride.setParameter(parameter);

        var aa = new ParameterOverrideValueSet();
        aa.setParameterValueSet(parameterValueSetAA);

        var ab = new ParameterOverrideValueSet();
        ab.setParameterValueSet(parameterValueSetAB);

        var bb = new ParameterOverrideValueSet();
        bb.setParameterValueSet(parameterValueSetBB);

        var ba = new ParameterOverrideValueSet();
        ba.setParameterValueSet(parameterValueSetBA);

        var comparator = new ParameterOverrideValueSetComparator();

        var comparison_aa_ab = comparator.compare(aa, ab);
        assertEquals(1, comparison_aa_ab);

        var comparison_aa_bb = comparator.compare(aa, ab);
        assertEquals(1, comparison_aa_bb);
    }
}
