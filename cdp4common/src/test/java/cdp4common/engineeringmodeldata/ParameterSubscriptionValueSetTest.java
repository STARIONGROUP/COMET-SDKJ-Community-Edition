/*
 * ParameterSubscriptionValueSetTest.java
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
import cdp4common.sitedirectorydata.BooleanParameterType;
import cdp4common.sitedirectorydata.CompoundParameterType;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.ParameterTypeComponent;
import cdp4common.types.ValueArray;
import java.util.Collection;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ParameterSubscriptionValueSetTest {
    private ElementDefinition elementDefinition1;
    private ElementDefinition elementDefinition2;
    private ElementUsage elementUsage;
    private ParameterOverride parameterOverride;
    private Parameter parameter;

    private ParameterSubscriptionValueSet parameterSubscriptionValueSet;
    private ParameterValueSetBase parameterValueSetBase;
    private ParameterSubscription parameterSubscription;
    private BooleanParameterType booleanParameterType;

    @BeforeEach
    void setup() {
        this.elementDefinition1 = new ElementDefinition(UUID.randomUUID(), null, null);
        this.elementDefinition1.setShortName("Sat");
        this.elementDefinition2 = new ElementDefinition(UUID.randomUUID(), null, null);
        this.elementDefinition2.setShortName("Bat");
        this.elementUsage = new ElementUsage(UUID.randomUUID(), null, null);
        this.elementUsage.setShortName("battery_1");
        this.elementUsage.setElementDefinition(this.elementDefinition2);
        this.booleanParameterType = new BooleanParameterType(UUID.randomUUID(), null, null);
        booleanParameterType.setShortName("bool");

        this.elementDefinition1.getContainedElement().add(this.elementUsage);
        this.parameter = new Parameter(UUID.randomUUID(), null, null);

        this.parameter.setParameterType(this.booleanParameterType);

        this.elementDefinition2.getParameter().add(this.parameter);
        this.parameterOverride = new ParameterOverride(UUID.randomUUID(), null, null);
        this.parameterOverride.setParameter(this.parameter);

        this.parameterSubscriptionValueSet = new ParameterSubscriptionValueSet();
        this.parameterValueSetBase = new ParameterValueSet();
        this.parameterValueSetBase.setPublished(new ValueArray<String>(Arrays.asList("computed"), String.class));
        this.parameterValueSetBase.setComputed(new ValueArray<String>(Arrays.asList("computed"), String.class));
        this.parameterValueSetBase.setReference(new ValueArray<String>(Arrays.asList("ref"), String.class));
        this.parameterValueSetBase.setActualState(new ActualFiniteState());
        this.parameterValueSetBase.setActualOption(new Option());

        this.parameterSubscriptionValueSet.setSubscribedValueSet(this.parameterValueSetBase);
        this.parameterSubscriptionValueSet.setManual(new ValueArray<String>(Arrays.asList("manual"), String.class));

        this.parameterSubscription = new ParameterSubscription();
        this.parameterSubscription.getValueSet().add(this.parameterSubscriptionValueSet);
        this.parameterSubscription.setOwner(new DomainOfExpertise());
    }

    @Test
    void testGetComputed() {
        assertTrue(this.parameterValueSetBase.getPublished() == this.parameterSubscriptionValueSet.getComputed());
    }

    @Test
    void testGetReference() {
        assertEquals("ref", this.parameterSubscriptionValueSet.getReference().get(0));
    }

    @Test
    void testGetActualValue() {
        this.parameterSubscriptionValueSet.setValueSwitch(ParameterSwitchKind.COMPUTED);
        assertEquals("computed", this.parameterSubscriptionValueSet.getActualValue().get(0));

        this.parameterSubscriptionValueSet.setValueSwitch(ParameterSwitchKind.REFERENCE);
        assertEquals("ref", this.parameterSubscriptionValueSet.getActualValue().get(0));

        this.parameterSubscriptionValueSet.setValueSwitch(ParameterSwitchKind.MANUAL);
        assertEquals("manual", this.parameterSubscriptionValueSet.getActualValue().get(0));
    }

    @Test
    void testGetActualState() {
        assertTrue(this.parameterValueSetBase.getActualState() == this.parameterSubscriptionValueSet.getActualState());
    }

    @Test
    void testGetActualOption() {
        assertTrue(this.parameterValueSetBase.getActualOption() == this.parameterSubscriptionValueSet.getActualOption());
    }

    @Test
    void testGetOwner() {
        assertTrue(this.parameterSubscription.getOwner() == this.parameterSubscriptionValueSet.getOwner());
    }

    @Test
    void testGetOwnerThrowsException() {
        this.parameterSubscriptionValueSet = new ParameterSubscriptionValueSet();
        assertThrows(ContainmentException.class, () -> this.parameterSubscriptionValueSet.getOwner());

    }

    @Test
    void verifyThatParameterSubscriptionModelCodeReturnsExpectedResult() {
        ParameterValueSet parameterValueSet = new ParameterValueSet();
        this.parameter.getValueSet().add(parameterValueSet);

        ParameterSubscription subscription = new ParameterSubscription();
        ParameterSubscriptionValueSet subscriptionValueSet = new ParameterSubscriptionValueSet();
        subscription.getValueSet().add(subscriptionValueSet);

        subscriptionValueSet.setSubscribedValueSet(parameterValueSet);

        this.parameter.getParameterSubscription().add(subscription);

        assertEquals("Bat.bool", subscriptionValueSet.modelCode(0));
    }

    @Test
    void verifyThatParameterOverrideSubscriptionModelCodeReturnsExpectedResult() {
        ParameterOverride parameterOverride = new ParameterOverride();
        this.elementUsage.getParameterOverride().add(parameterOverride);

        ParameterOverrideValueSet parameterOverrideValueSet = new ParameterOverrideValueSet();
        parameterOverride.getValueSet().add(parameterOverrideValueSet);

        parameterOverride.setParameter(this.parameter);

        ParameterSubscription subscription = new ParameterSubscription();
        ParameterSubscriptionValueSet subscriptionValueSet = new ParameterSubscriptionValueSet();
        subscription.getValueSet().add(subscriptionValueSet);

        subscriptionValueSet.setSubscribedValueSet(parameterOverrideValueSet);

        parameterOverride.getParameterSubscription().add(subscription);

        assertEquals("Sat.battery_1.bool", subscriptionValueSet.modelCode(0));
    }

    @Test
    void verifyThatCloneWithCloneValueArrayReturnsCloneWithNewValueArrays() {
        String manualValue = "manual";
        String newManualValue = "new manual";

        ValueArray<String> manualValueArray = new ValueArray<>(Arrays.asList(manualValue), String.class);

        this.parameterSubscriptionValueSet.setManual(manualValueArray);

        assertEquals(manualValue, this.parameterSubscriptionValueSet.getManual().get(0));

        ParameterSubscriptionValueSet clone = this.parameterSubscriptionValueSet.clone(false);
        clone.getManual().set(0, newManualValue);

        assertEquals(newManualValue, clone.getManual().get(0));
        assertEquals(manualValue, this.parameterSubscriptionValueSet.getManual().get(0));
    }

    @Test
    void verify_that_Validate_pojo_returns_errors_when_size_of_valuearray_is_incorrect() {
        ParameterTypeComponent component_1 = new ParameterTypeComponent(UUID.randomUUID(), null, null);
        component_1.setParameterType(this.booleanParameterType);

        ParameterTypeComponent component_2 = new ParameterTypeComponent(UUID.randomUUID(), null, null);
        component_2.setParameterType(this.booleanParameterType);

        CompoundParameterType compoundParameterType = new CompoundParameterType(UUID.randomUUID(), null, null);
        compoundParameterType.getComponent().add(component_1);
        compoundParameterType.getComponent().add(component_2);

        Parameter parameter = new Parameter(UUID.randomUUID(), null, null);
        parameter.setParameterType(compoundParameterType);

        ParameterSubscription parameterSubscription = new ParameterSubscription(UUID.randomUUID(), null, null);
        ParameterSubscriptionValueSet parameterSubscriptionValueSet = new ParameterSubscriptionValueSet(UUID.randomUUID(), null, null);
        parameterSubscriptionValueSet.setManual(new ValueArray<>(Arrays.asList("true", "false"), String.class));

        parameterSubscriptionValueSet.setSubscribedValueSet(new ParameterValueSet(UUID.randomUUID(), null, null));

        parameterSubscription.getValueSet().add(parameterSubscriptionValueSet);

        parameter.getParameterSubscription().add(parameterSubscription);

        parameterSubscriptionValueSet.validatePojo();

        Collection<String> errors = parameterSubscriptionValueSet.getValidationErrors();

        assertEquals(2, errors.size());
    }

    @Test
    void verify_that_Manual_value_can_be_reset() {
        ValueArray<String> defaultValueArray = new ValueArray<>(Arrays.asList("-"), String.class);

        Parameter p = new Parameter(UUID.randomUUID(), null, null);
        p.setParameterType(this.booleanParameterType);

        ParameterSubscription ps = new ParameterSubscription(UUID.randomUUID(), null, null);
        ParameterSubscriptionValueSet psvs = new ParameterSubscriptionValueSet(UUID.randomUUID(), null, null);
        ps.getValueSet().add(psvs);
        p.getParameterSubscription().add(ps);

        psvs.resetManual();
        assertIterableEquals(defaultValueArray, psvs.getManual());

        psvs.resetManual();
        assertIterableEquals(defaultValueArray, psvs.getManual());
    }

    @Test
    void verify_that_ResetComputed_throws_exception() {
        ParameterSubscriptionValueSet psvs = new ParameterSubscriptionValueSet(UUID.randomUUID(), null, null);
        assertThrows(UnsupportedOperationException.class, () -> psvs.resetComputed());
    }

    @Test
    void verify_that_ResetReference_throws_exception() {
        ParameterSubscriptionValueSet psvs = new ParameterSubscriptionValueSet(UUID.randomUUID(), null, null);
        assertThrows(UnsupportedOperationException.class, () -> psvs.resetReference());
    }

    @Test
    void verify_that_ResetFormula_throws_exception() {
        ParameterSubscriptionValueSet psvs = new ParameterSubscriptionValueSet(UUID.randomUUID(), null, null);
        assertThrows(UnsupportedOperationException.class, () -> psvs.resetFormula());
    }
}
