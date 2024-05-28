/*
 * ParameterSubscriptionTest.java
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

package cdp4common.engineeringmodeldata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.BooleanParameterType;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.LogarithmicScale;
import cdp4common.types.ValueArray;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParameterSubscriptionTest {
    private ElementDefinition elementDefinition1;
    private ParameterSubscription parameterSubscription;
    private Parameter parameter;

    private DomainOfExpertise domain;
    private Iteration iteration;
    private Option option1;
    private Option option2;
    private PossibleFiniteStateList possibleList;
    private PossibleFiniteState possibleState1;
    private PossibleFiniteState possibleState2;
    private ActualFiniteStateList actualList;
    private ActualFiniteState actualState1;
    private ActualFiniteState actualState2;

    @BeforeEach
    void setup() {
        this.domain = new DomainOfExpertise(UUID.randomUUID(), null, null);
        this.domain.setName("domain");
        this.domain.setShortName("d");

        this.parameterSubscription = new ParameterSubscription(UUID.randomUUID(), null, null);
        this.parameterSubscription.setOwner(this.domain);

        this.parameter = new Parameter(UUID.randomUUID(), null, null);
        this.parameter.setOwner(this.domain);

        this.parameter.setParameterType(new BooleanParameterType(UUID.randomUUID(), null, null));
        this.parameter.setOptionDependent(true);
        this.parameter.setScale(new LogarithmicScale(UUID.randomUUID(), null, null));
        this.parameter.setStateDependence(new ActualFiniteStateList(UUID.randomUUID(), null, null));
        this.parameter.setGroup(new ParameterGroup(UUID.randomUUID(), null, null));

        this.parameter.getParameterSubscription().add(this.parameterSubscription);

        this.iteration = new Iteration(UUID.randomUUID(), null, null);
        this.option1 = new Option(UUID.randomUUID(), null, null);
        this.option1.setName("option1");
        this.option1.setShortName("o1");

        this.option2 = new Option(UUID.randomUUID(), null, null);
        this.option2.setName("option2");
        this.option2.setShortName("o2");

        this.possibleList = new PossibleFiniteStateList(UUID.randomUUID(), null, null);
        this.possibleList.setName("possible list");
        this.possibleList.setShortName("pl");
        this.possibleState1 = new PossibleFiniteState(UUID.randomUUID(), null, null);
        this.possibleState1.setName("ps1");
        this.possibleState1.setShortName("ps1");
        this.possibleState2 = new PossibleFiniteState(UUID.randomUUID(), null, null);
        this.possibleState2.setName("ps2");
        this.possibleState2.setShortName("ps2");
        this.possibleList.getPossibleState().add(this.possibleState1);
        this.possibleList.getPossibleState().add(this.possibleState2);

        this.actualList = new ActualFiniteStateList(UUID.randomUUID(), null, null);
        this.actualList.getPossibleFiniteStateList().add(this.possibleList);
        this.actualState1 = new ActualFiniteState(UUID.randomUUID(), null, null);
        this.actualState1.getPossibleState().add(this.possibleState1);
        this.actualState2 = new ActualFiniteState(UUID.randomUUID(), null, null);
        this.actualState2.getPossibleState().add(this.possibleState2);
        this.actualList.getActualState().add(this.actualState1);
        this.actualList.getActualState().add(this.actualState2);

        this.elementDefinition1 = new ElementDefinition(UUID.randomUUID(), null, null);
        this.elementDefinition1.setOwner(this.domain);

        this.iteration.getOption().add(this.option1);
        this.iteration.getOption().add(this.option2);
        this.iteration.getPossibleFiniteStateList().add(this.possibleList);
        this.iteration.getActualFiniteStateList().add(this.actualList);
        this.iteration.getElement().add(this.elementDefinition1);

        this.elementDefinition1.getParameter().add(this.parameter);
    }

    @Test
    void testGets() {
        assertTrue(this.parameter.getParameterType() == this.parameterSubscription.getParameterType());
        assertEquals(this.parameter.isOptionDependent(), this.parameterSubscription.isOptionDependent());
        assertTrue(this.parameter.getScale() == this.parameterSubscription.getScale());
        assertTrue(this.parameter.getStateDependence() == this.parameterSubscription.getStateDependence());
        assertTrue(this.parameter.getGroup() == this.parameterSubscription.getGroup());
    }

    @Test
    void testGetParameterType2() {
        ParameterOverride parameterOverride = new ParameterOverride(UUID.randomUUID(), null, null);
        this.parameter = new Parameter(UUID.randomUUID(), null, null);
        this.parameter.setParameterType(new BooleanParameterType(UUID.randomUUID(), null, null));
        this.parameter.setOptionDependent(true);
        this.parameter.setScale(new LogarithmicScale(UUID.randomUUID(), null, null));
        this.parameter.setStateDependence(new ActualFiniteStateList(UUID.randomUUID(), null, null));
        this.parameter.setGroup(new ParameterGroup(UUID.randomUUID(), null, null));

        parameterOverride.setParameter(this.parameter);

        parameterOverride.getParameterSubscription().add(this.parameterSubscription);

        assertTrue(this.parameter.getParameterType() == this.parameterSubscription.getParameterType());
    }

    @Test
    void testException() {
        this.parameterSubscription = new ParameterSubscription();

        assertThrows(ContainmentException.class, () -> this.parameterSubscription.getParameterType());
    }

    @Test
    void verifyThatParameterHasErrorWhenNoValueSet() {
        // no option, no state
        this.parameter.setOptionDependent(false);
        this.parameter.setStateDependence(null);
        this.parameterSubscription.validatePojo();
        assertFalse(this.parameterSubscription.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterHasErrorWhenNoValueSet2() {
        // option/State dependent
        this.parameter.setOptionDependent(true);
        this.parameter.setStateDependence(this.actualList);

        this.parameterSubscription.validatePojo();
        assertFalse(this.parameterSubscription.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterHasErrorWhenNoValueSet3() {
        // option dependent
        this.parameter.setOptionDependent(true);
        this.parameter.setStateDependence(null);

        this.parameterSubscription.validatePojo();
        assertFalse(this.parameterSubscription.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterHasErrorWhenNoValueSet4() {
        // State dependent
        this.parameter.setOptionDependent(false);
        this.parameter.setStateDependence(this.actualList);

        this.parameterSubscription.validatePojo();
        assertFalse(this.parameterSubscription.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterWithEmptyArrayValueSetHasError() {
        ParameterValueSet valuesetoverriden = new ParameterValueSet(UUID.randomUUID(), null, null);
        ParameterSubscriptionValueSet valueset = new ParameterSubscriptionValueSet(UUID.randomUUID(), null, null);
        valueset.setSubscribedValueSet(valuesetoverriden);
        this.parameter.setOptionDependent(false);
        this.parameter.setStateDependence(null);

        this.parameterSubscription.getValueSet().add(valueset);
        valueset.validatePojo();
        this.parameterSubscription.validatePojo();

        assertFalse(this.parameterSubscription.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterHasNoError() {
        ParameterValueSet valuesetoverriden = new ParameterValueSet(UUID.randomUUID(), null, null);
        ParameterSubscriptionValueSet valueset = new ParameterSubscriptionValueSet(UUID.randomUUID(), null, null);
        valueset.setSubscribedValueSet(valuesetoverriden);

        List<String> data = Arrays.asList("-");
        valueset.setManual(new ValueArray<>(data, String.class));
        valuesetoverriden.setComputed(new ValueArray<>(data, String.class));
        valuesetoverriden.setReference(new ValueArray<>(data, String.class));
        valuesetoverriden.setFormula(new ValueArray<>(data, String.class));
        valuesetoverriden.setPublished(new ValueArray<>(data, String.class));

        this.parameter.setOptionDependent(false);
        this.parameter.setStateDependence(null);

        this.parameterSubscription.getValueSet().add(valueset);
        valueset.validatePojo();
        this.parameterSubscription.validatePojo();

        assertTrue(this.parameterSubscription.getValidationErrors().isEmpty());
    }
}
