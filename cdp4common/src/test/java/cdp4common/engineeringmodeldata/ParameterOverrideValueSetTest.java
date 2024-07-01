/*
 * ParameterOverrideValueSetTest.java
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
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.CompoundParameterType;
import cdp4common.sitedirectorydata.ParameterTypeComponent;
import cdp4common.sitedirectorydata.SimpleQuantityKind;
import cdp4common.types.ValueArray;
import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

        ValueArray<String> manualValueArray = new ValueArray<>(Arrays.asList(manualValue), String.class);
        ValueArray<String> referenceValueArray = new ValueArray<>(Arrays.asList(referenceValue), String.class);
        ValueArray<String> computedValueArray = new ValueArray<>(Arrays.asList(computedValue), String.class);

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
        ParameterOverrideValueSet parameterOverrideValueSet = new ParameterOverrideValueSet(UUID.randomUUID(), null, null);

        assertThrows(ContainmentException.class, () -> parameterOverrideValueSet.queryParameterType());
    }
}
