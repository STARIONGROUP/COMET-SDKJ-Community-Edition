/*
 * ParameterOverrideTest.java
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

package cdp4common.engineeringmodeldata;

import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.ValueArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ParameterOverrideTest {
    private ElementDefinition elementDefinition1;
    private ElementDefinition elementDefinition2;
    private ElementUsage elementUsage;
    private ParameterOverride parameterOverride;
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
        this.elementDefinition1 = new ElementDefinition(UUID.randomUUID(), null, null);
        this.elementDefinition1.setOwner(this.domain);
        this.elementDefinition1.setShortName("Sat");
        this.elementDefinition2 = new ElementDefinition(UUID.randomUUID(), null, null);
        this.elementDefinition2.setOwner(this.domain);
        this.elementDefinition2.setShortName("Bat");
        this.elementUsage = new ElementUsage(UUID.randomUUID(), null, null);
        this.elementUsage.setShortName("battery_1");
        this.elementUsage.setElementDefinition(this.elementDefinition2);

        this.elementDefinition1.getContainedElement().add(this.elementUsage);

        this.parameterOverride = new ParameterOverride(UUID.randomUUID(), null, null);
        this.parameterOverride.setOwner(this.domain);
        this.parameter = new Parameter(UUID.randomUUID(), null, null);
        this.parameter.setOwner(this.domain);

        BooleanParameterType booleanParameterType = new BooleanParameterType(UUID.randomUUID(), null, null);
        booleanParameterType.setShortName("bool");
        this.parameter.setParameterType(booleanParameterType);
        this.parameter.setOptionDependent(true);
        this.parameter.setScale(new LogarithmicScale(UUID.randomUUID(), null, null));
        this.parameter.setStateDependence(new ActualFiniteStateList(UUID.randomUUID(), null, null));
        this.parameter.setGroup(new ParameterGroup(UUID.randomUUID(), null, null));

        this.parameterOverride.setParameter(this.parameter);

        this.elementDefinition2.getParameter().add(this.parameter);

        this.iteration = new Iteration(UUID.randomUUID(), null, null);
        this.option1 = new Option(UUID.randomUUID(), null, null);
        this.option1.setName("option1");
        this.option1.setShortName("o1");
        this.option2 = new Option(UUID.randomUUID(), null, null);
        this.option2.setName("option2");
        this.option2.setShortName("o2");

        this.possibleList = new PossibleFiniteStateList(UUID.randomUUID(), null, null);
        this.possibleList.setName("possible list");
        this.possibleList.setShortName("p1");
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

        this.iteration.getOption().add(this.option1);
        this.iteration.getOption().add(this.option2);
        this.iteration.getPossibleFiniteStateList().add(this.possibleList);
        this.iteration.getActualFiniteStateList().add(this.actualList);
        this.iteration.getElement().add(this.elementDefinition1);
        this.iteration.getElement().add(this.elementDefinition2);

        this.elementUsage.getParameterOverride().add(this.parameterOverride);
    }

    @Test
    void testGets() {
        assertTrue(this.parameter.getParameterType() == this.parameterOverride.getParameterType());
        assertEquals(this.parameter.isOptionDependent(), this.parameterOverride.isOptionDependent());
        assertTrue(this.parameter.getScale() == this.parameterOverride.getScale());
        assertTrue(this.parameter.getStateDependence() == this.parameterOverride.getStateDependence());
        assertTrue(this.parameter.getGroup() == this.parameterOverride.getGroup());
    }

    @Test
    void verifyThatScalarParameterOverrideReturnsExpectedModelCode() {
        ParameterOverride parameterOverride = new ParameterOverride();
        parameterOverride.setParameter(this.parameter);
        this.elementUsage.getParameterOverride().add(parameterOverride);

        assertEquals("Sat.battery_1.bool", parameterOverride.modelCode(null));
    }

    @Test
    void verifyThatCompoundParameterOverrideReturnsExpectedModelCode() {
        SimpleQuantityKind simpleQuantityKind = new SimpleQuantityKind(UUID.randomUUID(), null, null);
        simpleQuantityKind.setShortName("1");

        CompoundParameterType compoundParameterType = new CompoundParameterType(UUID.randomUUID(), null, null);
        compoundParameterType.setShortName("coord");
        ParameterTypeComponent component = new ParameterTypeComponent(UUID.randomUUID(), null, null);
        component.setParameterType(simpleQuantityKind);
        component.setShortName("x");
        compoundParameterType.getComponent().add(component);

        this.parameter.setParameterType(compoundParameterType);

        ParameterOverride parameterOverride = new ParameterOverride();
        parameterOverride.setParameter(this.parameter);

        this.elementUsage.getParameterOverride().add(parameterOverride);

        assertEquals("Sat.battery_1.coord.x", parameterOverride.modelCode(0));
    }

    @Test
    void verifyThatCompoundParameterOverrideReturnsExpectedModelCodeNoComponent() {
        SimpleQuantityKind simpleQuantityKind = new SimpleQuantityKind(UUID.randomUUID(), null, null);
        simpleQuantityKind.setShortName("1");

        CompoundParameterType compoundParameterType = new CompoundParameterType(UUID.randomUUID(), null, null);
        compoundParameterType.setShortName("coord");
        ParameterTypeComponent component = new ParameterTypeComponent(UUID.randomUUID(), null, null);
        component.setParameterType(simpleQuantityKind);
        component.setShortName("x");
        compoundParameterType.getComponent().add(component);

        this.parameter.setParameterType(compoundParameterType);

        ParameterOverride parameterOverride = new ParameterOverride();
        parameterOverride.setParameter(this.parameter);

        this.elementUsage.getParameterOverride().add(parameterOverride);

        assertEquals("Sat.battery_1.coord", parameterOverride.modelCode(null));
    }

    @Test
    void verifyThatExpectedExceptionIsThrownWhenComponentIndexIsSuppliedForScalarParameterType() {
        ParameterOverride parameterOverride = new ParameterOverride();
        parameterOverride.setParameter(this.parameter);
        this.elementUsage.getParameterOverride().add(parameterOverride);
        assertThrows(IllegalArgumentException.class, () -> parameterOverride.modelCode(1));
    }

    @Test
    void verifyThatWhenContainmentNotSetAContainmentExceptionIsThrown() {
        ParameterOverride parameterOverride = new ParameterOverride();
        parameterOverride.setParameter(this.parameter);
        assertThrows(ContainmentException.class, () -> parameterOverride.modelCode(null));
    }

    @Test
    void verifyThatParameterHasErrorWhenNoValueSet() {
        // no option, no state
        this.parameterOverride.validatePojo();
        assertFalse(this.parameterOverride.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterHasErrorWhenNoValueSet2() {
        // option/State dependent
        this.parameter.setOptionDependent(true);
        this.parameter.setStateDependence(this.actualList);

        this.parameterOverride.validatePojo();
        assertFalse(this.parameterOverride.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterHasErrorWhenNoValueSet3() {
        // option dependent
        this.parameter.setOptionDependent(true);

        this.parameterOverride.validatePojo();
        assertFalse(this.parameterOverride.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterHasErrorWhenNoValueSet4() {
        // State dependent
        this.parameter.setStateDependence(this.actualList);

        this.parameterOverride.validatePojo();
        assertFalse(this.parameterOverride.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterWithEmptyArrayValueSetHasError() {
        ParameterValueSet valuesetoverriden = new ParameterValueSet(UUID.randomUUID(), null, null);
        ParameterOverrideValueSet valueset = new ParameterOverrideValueSet(UUID.randomUUID(), null, null);
        valueset.setParameterValueSet(valuesetoverriden);
        this.parameter.setOptionDependent(false);
        this.parameter.setStateDependence(null);

        this.parameterOverride.getValueSet().add(valueset);
        valueset.validatePojo();
        this.parameterOverride.validatePojo();

        assertFalse(this.parameterOverride.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatParameterHasNoError() {
        ParameterValueSet valuesetoverriden = new ParameterValueSet(UUID.randomUUID(), null, null);
        ParameterOverrideValueSet valueset = new ParameterOverrideValueSet(UUID.randomUUID(), null, null);
        valueset.setParameterValueSet(valuesetoverriden);
        List<String> data = Arrays.asList("-");
        valueset.setManual(new ValueArray<>(data, String.class));
        valueset.setComputed(new ValueArray<>(data, String.class));
        valueset.setReference(new ValueArray<>(data, String.class));
        valueset.setPublished(new ValueArray<>(data, String.class));
        valueset.setFormula(new ValueArray<>(data, String.class));

        this.parameter.setOptionDependent(false);
        this.parameter.setStateDependence(null);

        this.parameterOverride.getValueSet().add(valueset);
        valueset.validatePojo();
        this.parameterOverride.validatePojo();

        assertTrue(this.parameterOverride.getValidationErrors().isEmpty());
    }

    @Test
    void verifyThatCanBePublishedReturnsExpectedResult() {
        ParameterValueSet valuesetoverriden = new ParameterValueSet(UUID.randomUUID(), null, null);
        ParameterOverrideValueSet valueset = new ParameterOverrideValueSet(UUID.randomUUID(), null, null);
        valueset.setParameterValueSet(valuesetoverriden);
        List<String> data = Arrays.asList("-");
        valueset.setValueSwitch(ParameterSwitchKind.MANUAL);
        valueset.setManual(new ValueArray<>(data, String.class));
        valueset.setComputed(new ValueArray<>(data, String.class));
        valueset.setReference(new ValueArray<>(data, String.class));
        valueset.setPublished(new ValueArray<>(data, String.class));
        valueset.setFormula(new ValueArray<>(data, String.class));

        this.parameterOverride.getValueSet().add(valueset);

        assertFalse(this.parameterOverride.canBePublished());

        List<String> updatedData = Arrays.asList("1");
        valueset.setManual(new ValueArray<>(updatedData, String.class));

        assertTrue(this.parameterOverride.canBePublished());
    }

    @Test
    void verifyThatToBePublishedReturnsExpectedResult() {
        ParameterValueSet valuesetoverriden = new ParameterValueSet(UUID.randomUUID(), null, null);
        ParameterOverrideValueSet valueset = new ParameterOverrideValueSet(UUID.randomUUID(), null, null);
        valueset.setParameterValueSet(valuesetoverriden);
        List<String> data = Arrays.asList("-");
        valueset.setValueSwitch(ParameterSwitchKind.MANUAL);
        valueset.setManual(new ValueArray<>(data, String.class));
        valueset.setComputed(new ValueArray<>(data, String.class));
        valueset.setReference(new ValueArray<>(data, String.class));
        valueset.setPublished(new ValueArray<>(data, String.class));
        valueset.setFormula(new ValueArray<>(data, String.class));

        this.parameterOverride.getValueSet().add(valueset);

        assertFalse(this.parameterOverride.getToBePublished());

        this.parameterOverride.setToBePublished(true);

        assertFalse(this.parameterOverride.getToBePublished());

        List<String> updatedData = Arrays.asList("1");
        valueset.setManual(new ValueArray<>(updatedData, String.class));

        assertTrue(this.parameterOverride.getToBePublished());
    }

    @Test
    void verify_that_when_QueryParameterType_throws_exception_when_container_not_set() {
        ParameterOverrideValueSet parameterOverrideValueSet = new ParameterOverrideValueSet(UUID.randomUUID(), null, null);

        assertThrows(ContainmentException.class, () -> parameterOverrideValueSet.queryParameterType());
    }

    @Test
    void verify_that_Manual_Value_can_be_reset() {
        ValueArray<String> defaultValueArray = new ValueArray<>(Arrays.asList("-"), String.class);

        ParameterOverrideValueSet parameterOverrideValueSet = new ParameterOverrideValueSet(UUID.randomUUID(), null, null);
        parameterOverride.getValueSet().add(parameterOverrideValueSet);

        parameterOverrideValueSet.resetManual();
        assertIterableEquals(defaultValueArray, parameterOverrideValueSet.getManual());

        parameterOverrideValueSet.resetManual();
        assertIterableEquals(defaultValueArray, parameterOverrideValueSet.getManual());
    }

    @Test
    void verify_that_Computed_Value_can_be_reset() {
        ValueArray<String> defaultValueArray = new ValueArray<>(Arrays.asList("-"), String.class);

        ParameterOverrideValueSet parameterOverrideValueSet = new ParameterOverrideValueSet(UUID.randomUUID(), null, null);
        parameterOverride.getValueSet().add(parameterOverrideValueSet);

        parameterOverrideValueSet.resetComputed();
        assertIterableEquals(defaultValueArray, parameterOverrideValueSet.getComputed());

        parameterOverrideValueSet.resetComputed();
        assertIterableEquals(defaultValueArray, parameterOverrideValueSet.getComputed());
    }

    @Test
    void verify_that_Formula_Value_can_be_reset() {
        ValueArray<String> defaultValueArray = new ValueArray<>(Arrays.asList("-"), String.class);

        ParameterOverrideValueSet parameterOverrideValueSet = new ParameterOverrideValueSet(UUID.randomUUID(), null, null);
        parameterOverride.getValueSet().add(parameterOverrideValueSet);

        parameterOverrideValueSet.resetFormula();
        assertIterableEquals(defaultValueArray, parameterOverrideValueSet.getFormula());

        parameterOverrideValueSet.resetFormula();
        assertIterableEquals(defaultValueArray, parameterOverrideValueSet.getFormula());
    }

    @Test
    void verify_that_Reference_Value_can_be_reset() {
        ValueArray<String> defaultValueArray = new ValueArray<>(Arrays.asList("-"), String.class);

        ParameterOverrideValueSet parameterOverrideValueSet = new ParameterOverrideValueSet(UUID.randomUUID(), null, null);
        parameterOverride.getValueSet().add(parameterOverrideValueSet);

        parameterOverrideValueSet.resetReference();
        assertIterableEquals(defaultValueArray, parameterOverrideValueSet.getReference());

        parameterOverrideValueSet.resetReference();
        assertIterableEquals(defaultValueArray, parameterOverrideValueSet.getReference());
    }
}
