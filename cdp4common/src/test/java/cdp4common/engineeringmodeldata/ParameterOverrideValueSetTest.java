/*
 * ParameterOverrideValueSetTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.CompoundParameterType;
import cdp4common.sitedirectorydata.ParameterTypeComponent;
import cdp4common.sitedirectorydata.SimpleQuantityKind;
import cdp4common.types.ValueArray;
import com.google.common.collect.Iterables;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ParameterOverrideValueSetTest {
    private ElementDefinition elementDefinition1;
    private ElementDefinition elementDefinition2;
    private ElementUsage elementUsage;
    private Parameter scalarParameter;

    @BeforeEach
    void setup() {
        SimpleQuantityKind scalarParameterType = new SimpleQuantityKind();
        scalarParameterType.setName("length");
        scalarParameterType.setShortName("1");

        CompoundParameterType compoundParameterType = new CompoundParameterType();
        compoundParameterType.setName("cartesian coordinate");
        compoundParameterType.setShortName("coord");

        ParameterTypeComponent component = new ParameterTypeComponent();
        component.setShortName("x");
        component.setParameterType(scalarParameterType);
        compoundParameterType.getComponent().add(component);

        this.elementDefinition1 = new ElementDefinition(UUID.randomUUID(), null, null);
        this.elementDefinition1.setShortName("Sat");

        this.elementDefinition2 = new ElementDefinition(UUID.randomUUID(), null, null);
        this.elementDefinition2.setShortName("Bat");

        this.elementUsage = new ElementUsage(UUID.randomUUID(), null, null);
        this.elementUsage.setShortName("battery_1");
        this.elementUsage.setElementDefinition(this.elementDefinition2);

        this.elementDefinition1.getContainedElement().add(this.elementUsage);

        this.scalarParameter = new Parameter();
        this.scalarParameter.setParameterType(scalarParameterType);

        ParameterValueSet scalarParameterValueSet = new ParameterValueSet();
        this.scalarParameter.getValueSet().add(scalarParameterValueSet);

        this.elementDefinition2.getParameter().add(this.scalarParameter);
    }

    @Test
    void testGets() {
        ParameterOverrideValueSet thing = new ParameterOverrideValueSet(UUID.randomUUID(), null, null);
        ParameterValueSet parameterValueSet = new ParameterValueSet(UUID.randomUUID(), null, null);
        parameterValueSet.setActualOption(new Option(UUID.randomUUID(), null, null));
        parameterValueSet.setActualState(new ActualFiniteState(UUID.randomUUID(), null, null));
        thing.setParameterValueSet(parameterValueSet);

        assertTrue(parameterValueSet.getActualState() == thing.getActualState());
        assertTrue(parameterValueSet.getActualOption() == thing.getActualOption());
    }

    @Test
    void verifyThatParameterOverrideValueSetReturnsExpectedModelCode() {
        ParameterOverride parameterOverride = new ParameterOverride();
        parameterOverride.setParameter(this.scalarParameter);
        this.elementUsage.getParameterOverride().add(parameterOverride);

        ParameterOverrideValueSet parameterOverrideValueSet = new ParameterOverrideValueSet();
        parameterOverride.getValueSet().add(parameterOverrideValueSet);

        parameterOverrideValueSet.setParameterValueSet(Iterables.getOnlyElement(this.scalarParameter.getValueSet()));

        assertEquals("Sat.battery_1.1", parameterOverrideValueSet.modelCode(0));
    }

    @Test
    void verifyThatOptionDependentParameterOverrideValueSetReturnsExpectedModelCode() {
        Option option = new Option();
        option.setShortName("option_1");

        ParameterValueSet parameterValueSet = Iterables.getOnlyElement(this.scalarParameter.getValueSet());
        parameterValueSet.setActualOption(option);

        this.scalarParameter.setOptionDependent(true);

        ParameterOverride parameterOverride = new ParameterOverride();
        parameterOverride.setParameter(this.scalarParameter);
        this.elementUsage.getParameterOverride().add(parameterOverride);

        ParameterOverrideValueSet parameterOverrideValueSet = new ParameterOverrideValueSet();
        parameterOverride.getValueSet().add(parameterOverrideValueSet);

        parameterOverrideValueSet.setParameterValueSet(parameterValueSet);

        assertEquals("Sat.battery_1.1\\option_1", parameterOverrideValueSet.modelCode(0));
    }

    @Test
    void verifyThatStateDependentParameterOverrideValueSetReturnsExpectedModelCode() {
        PossibleFiniteStateList possibleFiniteStateList = new PossibleFiniteStateList();
        PossibleFiniteState possibleFiniteState = new PossibleFiniteState();
        possibleFiniteState.setShortName("SM");
        possibleFiniteStateList.getPossibleState().add(possibleFiniteState);

        ActualFiniteStateList actualFiniteStateList = new ActualFiniteStateList();
        actualFiniteStateList.getPossibleFiniteStateList().add(possibleFiniteStateList);
        ActualFiniteState actualFiniteState = new ActualFiniteState();
        actualFiniteState.getPossibleState().add(possibleFiniteState);
        actualFiniteStateList.getActualState().add(actualFiniteState);

        this.scalarParameter.setStateDependence(actualFiniteStateList);
        ParameterValueSet parameterValueSet = Iterables.getOnlyElement(this.scalarParameter.getValueSet());
        parameterValueSet.setActualState(actualFiniteState);

        ParameterOverride parameterOverride = new ParameterOverride();
        parameterOverride.setParameter(this.scalarParameter);
        this.elementUsage.getParameterOverride().add(parameterOverride);

        ParameterOverrideValueSet parameterOverrideValueSet = new ParameterOverrideValueSet();
        parameterOverrideValueSet.setParameterValueSet(parameterValueSet);
        parameterOverride.getValueSet().add(parameterOverrideValueSet);

        parameterOverrideValueSet.setParameterValueSet(parameterValueSet);

        assertEquals("Sat.battery_1.1\\SM", parameterOverrideValueSet.modelCode(0));
    }

    @Test
    void verifyThatOptionAndStateDependentParameterOverrideValueSetReturnsExpectedModelCode() {
        Option option = new Option();
        option.setShortName("option_1");

        PossibleFiniteStateList possibleFiniteStateList = new PossibleFiniteStateList();
        PossibleFiniteState possibleFiniteState = new PossibleFiniteState();
        possibleFiniteState.setShortName("SM");
        possibleFiniteStateList.getPossibleState().add(possibleFiniteState);

        ActualFiniteStateList actualFiniteStateList = new ActualFiniteStateList();
        actualFiniteStateList.getPossibleFiniteStateList().add(possibleFiniteStateList);
        ActualFiniteState actualFiniteState = new ActualFiniteState();
        actualFiniteState.getPossibleState().add(possibleFiniteState);
        actualFiniteStateList.getActualState().add(actualFiniteState);

        this.scalarParameter.setOptionDependent(true);

        this.scalarParameter.setStateDependence(actualFiniteStateList);
        ParameterValueSet parameterValueSet = Iterables.getOnlyElement(this.scalarParameter.getValueSet());
        parameterValueSet.setActualState(actualFiniteState);
        parameterValueSet.setActualOption(option);

        ParameterOverride parameterOverride = new ParameterOverride();
        parameterOverride.setParameter(this.scalarParameter);
        this.elementUsage.getParameterOverride().add(parameterOverride);

        ParameterOverrideValueSet parameterOverrideValueSet = new ParameterOverrideValueSet();
        parameterOverrideValueSet.setParameterValueSet(parameterValueSet);
        parameterOverride.getValueSet().add(parameterOverrideValueSet);

        parameterOverrideValueSet.setParameterValueSet(parameterValueSet);

        assertEquals("Sat.battery_1.1\\option_1\\SM", parameterOverrideValueSet.modelCode(0));
    }

    @Test
    void verifyThatCloneWithCloneValueArrayReturnsCloneWithNewValueArrays() {
        ParameterOverrideValueSet parameterOverrideValueSet = new ParameterOverrideValueSet();

        String manualValue = "manual";
        String newManualValue = "new manual";

        String referenceValue = "reference";
        String newReferenceValue = "new referennce";

        String computedValue = "computed";
        String newComputedValue = "new computedValue";

        ValueArray<String> manualValueArray = new ValueArray<>(List.of(manualValue), String.class);
        ValueArray<String> referenceValueArray = new ValueArray<>(List.of(referenceValue), String.class);
        ValueArray<String> computedValueArray = new ValueArray<>(List.of(computedValue), String.class);

        parameterOverrideValueSet.setManual(manualValueArray);
        parameterOverrideValueSet.setReference(referenceValueArray);
        parameterOverrideValueSet.setComputed(computedValueArray);

        assertEquals(manualValue, parameterOverrideValueSet.getManual().get(0));
        assertEquals(referenceValue, parameterOverrideValueSet.getReference().get(0));
        assertEquals(computedValue, parameterOverrideValueSet.getComputed().get(0));

        ParameterOverrideValueSet clone = parameterOverrideValueSet.clone(false);
        clone.getManual().set(0, newManualValue);
        clone.getReference().set(0, newReferenceValue);
        clone.getComputed().set(0, newComputedValue);

        assertEquals(newManualValue, clone.getManual().get(0));
        assertEquals(manualValue, parameterOverrideValueSet.getManual().get(0));

        assertEquals(newReferenceValue, clone.getReference().get(0));
        assertEquals(referenceValue, parameterOverrideValueSet.getReference().get(0));

        assertEquals(newComputedValue, clone.getComputed().get(0));
        assertEquals(computedValue, parameterOverrideValueSet.getComputed().get(0));
    }

    @Test
    void verify_that_when_QueryParameterType_throws_exception_when_container_not_set() {
        var parameterOverrideValueSet = new ParameterOverrideValueSet(UUID.randomUUID(), null, null);

        assertThrows(ContainmentException.class, () -> parameterOverrideValueSet.queryParameterType());
    }
}
