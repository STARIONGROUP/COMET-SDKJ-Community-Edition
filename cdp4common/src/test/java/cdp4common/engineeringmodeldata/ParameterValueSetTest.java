/*
 * ParameterValueSetTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.SimpleQuantityKind;
import cdp4common.types.ValueArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ParameterValueSetTest {
    private ElementDefinition elementDefinition;

    private Parameter parameter;

    private ParameterValueSet parameterValueSet;

    private SimpleQuantityKind simpleQuantityKind;

    @BeforeEach
    void setup() {
        this.simpleQuantityKind = new SimpleQuantityKind(UUID.randomUUID(), null, null);
        simpleQuantityKind.setShortName("m");

        this.elementDefinition = new ElementDefinition(UUID.randomUUID(), null, null);
        this.elementDefinition.setShortName("Sat");

        this.parameter = new Parameter(UUID.randomUUID(), null, null);
        this.parameter.setParameterType(this.simpleQuantityKind);

        this.elementDefinition.getParameter().add((this.parameter));

        this.parameterValueSet = new ParameterValueSet();
        this.parameterValueSet.setIid(UUID.randomUUID());

        this.parameter.getValueSet().add(this.parameterValueSet);
    }

    @Test
    void verifyThatParameterValueSetReturnsExpectedModelCode() {
        assertEquals("Sat.m", this.parameterValueSet.modelCode(0));
    }

    @Test
    void verifyThatOptionDependentParameterValueSetReturnsExpectedModelCode() {
        Option option = new Option(UUID.randomUUID(), null, null);
        option.setShortName("option_1");

        this.parameter.setOptionDependent(true);
        this.parameterValueSet.setActualOption(option);

        assertEquals("Sat.m\\option_1", this.parameterValueSet.modelCode(0));
    }

    @Test
    void verifyThatStateDependentParameterValueSetReturnsExpectedModelCode() {
        PossibleFiniteStateList possibleFiniteStateList = new PossibleFiniteStateList();
        PossibleFiniteState possibleFiniteState = new PossibleFiniteState();
        possibleFiniteState.setShortName("SM");
        possibleFiniteStateList.getPossibleState().add(possibleFiniteState);

        ActualFiniteStateList actualFiniteStateList = new ActualFiniteStateList();
        actualFiniteStateList.getPossibleFiniteStateList().add(possibleFiniteStateList);
        ActualFiniteState actualFiniteState = new ActualFiniteState();
        actualFiniteState.getPossibleState().add(possibleFiniteState);
        actualFiniteStateList.getActualState().add(actualFiniteState);

        this.parameter.setStateDependence(actualFiniteStateList);
        this.parameterValueSet.setActualState(actualFiniteState);

        assertEquals("Sat.m\\SM", this.parameterValueSet.modelCode(0));
    }

    @Test
    void verifyThatOptionDependentStateDependentParameterValueSetReturnsExpectedModelCode() {
        Option option = new Option(UUID.randomUUID(), null, null);
        option.setShortName("option_1");

        this.parameter.setOptionDependent(true);
        this.parameterValueSet.setActualOption(option);

        PossibleFiniteStateList possibleFiniteStateList = new PossibleFiniteStateList();
        PossibleFiniteState possibleFiniteState = new PossibleFiniteState();
        possibleFiniteState.setShortName("SM");
        possibleFiniteStateList.getPossibleState().add(possibleFiniteState);

        ActualFiniteStateList actualFiniteStateList = new ActualFiniteStateList();
        actualFiniteStateList.getPossibleFiniteStateList().add(possibleFiniteStateList);
        ActualFiniteState actualFiniteState = new ActualFiniteState();
        actualFiniteState.getPossibleState().add(possibleFiniteState);
        actualFiniteStateList.getActualState().add(actualFiniteState);

        this.parameter.setStateDependence(actualFiniteStateList);
        this.parameterValueSet.setActualState(actualFiniteState);

        assertEquals("Sat.m\\option_1\\SM", this.parameterValueSet.modelCode(0));
    }

    @Test
    void verifyThatCloneWithCloneValueArrayReturnsCloneWithNewValueArrays() {
        String manualValue = "manual";
        String newManualValue = "new manual";

        String referenceValue = "reference";
        String newReferenceValue = "new referennce";

        String computedValue = "computed";
        String newComputedValue = "new computedValue";

        ValueArray<String> manualValueArray = new ValueArray<>(List.of(manualValue), String.class);
        ValueArray<String> referenceValueArray = new ValueArray<>(List.of(referenceValue), String.class);
        ValueArray<String> computedValueArray = new ValueArray<>(List.of(computedValue), String.class);

        this.parameterValueSet.setManual(manualValueArray);
        this.parameterValueSet.setReference(referenceValueArray);
        this.parameterValueSet.setComputed(computedValueArray);

        assertEquals(manualValue, this.parameterValueSet.getManual().get(0));
        assertEquals(referenceValue, this.parameterValueSet.getReference().get(0));
        assertEquals(computedValue, this.parameterValueSet.getComputed().get(0));

        ParameterValueSet clone = this.parameterValueSet.clone(false);
        clone.getManual().set(0, newManualValue);
        clone.getReference().set(0, newReferenceValue);
        clone.getComputed().set(0, newComputedValue);

        assertEquals(newManualValue, clone.getManual().get(0));
        assertEquals(manualValue, this.parameterValueSet.getManual().get(0));

        assertEquals(newReferenceValue, clone.getReference().get(0));
        assertEquals(referenceValue, this.parameterValueSet.getReference().get(0));

        assertEquals(newComputedValue, clone.getComputed().get(0));
        assertEquals(computedValue, this.parameterValueSet.getComputed().get(0));
    }

    @Test
    void verify_that_when_container_not_set_ModelCode_throws_exception() {
        var parameterValueSet = new ParameterValueSet(UUID.randomUUID(), null, null);
        assertThrows(ContainmentException.class, () -> parameterValueSet.modelCode(0));
    }

    @Test
    void verify_that_QueryParameterType_returns_expected_result() {
        var parameterType = this.parameterValueSet.queryParameterType();
        assertEquals(this.simpleQuantityKind, parameterType);
    }

    @Test
    void Verify_that_when_container_not_set_QueryParameterType_throws_Exception() {
        var parameterValueSet = new ParameterValueSet(UUID.randomUUID(), null, null);
        assertThrows(ContainmentException.class, () -> parameterValueSet.queryParameterType());
    }

    @Test
    void Verify_that_Manual_Value_can_be_reset() {
        var defaultValueArray = new ValueArray<>(Arrays.asList("-"), String.class);

        this.parameterValueSet.resetManual();
        assertIterableEquals(defaultValueArray, this.parameterValueSet.getManual());

        this.parameterValueSet.resetManual();
        assertIterableEquals(defaultValueArray, this.parameterValueSet.getManual());
    }

    @Test
    void verify_that_Computed_Value_can_be_reset() {
        var defaultValueArray = new ValueArray<>(Arrays.asList("-"), String.class);

        this.parameterValueSet.resetComputed();
        assertIterableEquals(defaultValueArray, this.parameterValueSet.getComputed());

        this.parameterValueSet.resetComputed();
        assertIterableEquals(defaultValueArray, this.parameterValueSet.getComputed());
    }

    @Test
    void verify_that_Formula_Value_can_be_reset() {
        var defaultValueArray = new ValueArray<>(Arrays.asList("-"), String.class);

        this.parameterValueSet.resetFormula();
        assertIterableEquals(defaultValueArray, this.parameterValueSet.getFormula());

        this.parameterValueSet.resetFormula();
        assertIterableEquals(defaultValueArray, this.parameterValueSet.getFormula());
    }

    @Test
    void Verify_that_Reference_Value_can_be_reset() {
        var defaultValueArray = new ValueArray<>(Arrays.asList("-"), String.class);

        this.parameterValueSet.resetReference();
        assertIterableEquals(defaultValueArray, this.parameterValueSet.getReference());

        this.parameterValueSet.resetReference();
        assertIterableEquals(defaultValueArray, this.parameterValueSet.getReference());
    }
}
