/* --------------------------------------------------------------------------------------------------------------------
 *    ParameterSubscriptionValueSetTest.java
 *    Copyright (c) 2015-2018 RHEA System S.A.
 *
 *    Author: Sam Gerené, Merlin Bieze, Alex Vorobiev, Naron Phou
 *
 *    This file is part of CDP4-SDK Community Edition
 *
 *    The CDP4-SDK Community Edition is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 3 of the License, or (at your option) any later version.
 *
 *    The CDP4-SDK Community Edition is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with this program; if not, write to the Free Software Foundation,
 *    Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *  --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.BooleanParameterType;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.types.ValueArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @BeforeEach
    void setup() {
        this.elementDefinition1 = new ElementDefinition(UUID.randomUUID(), null, null);
        this.elementDefinition1.setShortName("Sat");
        this.elementDefinition2 = new ElementDefinition(UUID.randomUUID(), null, null);
        this.elementDefinition2.setShortName("Bat");
        this.elementUsage = new ElementUsage(UUID.randomUUID(), null, null);
        this.elementUsage.setShortName("battery_1");
        this.elementUsage.setElementDefinition(this.elementDefinition2);

        this.elementDefinition1.getContainedElement().add(this.elementUsage);
        this.parameter = new Parameter(UUID.randomUUID(), null, null);
        BooleanParameterType booleanParameterType = new BooleanParameterType(UUID.randomUUID(), null, null);
        booleanParameterType.setShortName("bool");
        this.parameter.setParameterType(booleanParameterType);

        this.elementDefinition2.getParameter().add(this.parameter);
        this.parameterOverride = new ParameterOverride(UUID.randomUUID(), null, null);
        this.parameterOverride.setParameter(this.parameter);

        this.parameterSubscriptionValueSet = new ParameterSubscriptionValueSet();
        this.parameterValueSetBase = new ParameterValueSet();
        this.parameterValueSetBase.setPublished(new ValueArray<String>(List.of("computed"), String.class));
        this.parameterValueSetBase.setComputed(new ValueArray<String>(List.of("computed"), String.class));
        this.parameterValueSetBase.setReference(new ValueArray<String>(List.of("ref"), String.class));
        this.parameterValueSetBase.setActualState(new ActualFiniteState());
        this.parameterValueSetBase.setActualOption(new Option());

        this.parameterSubscriptionValueSet.setSubscribedValueSet(this.parameterValueSetBase);
        this.parameterSubscriptionValueSet.setManual(new ValueArray<String>(List.of("manual"), String.class));

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

        ValueArray<String> manualValueArray = new ValueArray<>(List.of(manualValue), String.class);

        this.parameterSubscriptionValueSet.setManual(manualValueArray);

        assertEquals(manualValue, this.parameterSubscriptionValueSet.getManual().get(0));

        ParameterSubscriptionValueSet clone = this.parameterSubscriptionValueSet.clone(false);
        clone.getManual().set(0, newManualValue);

        assertEquals(newManualValue, clone.getManual().get(0));
        assertEquals(manualValue, this.parameterSubscriptionValueSet.getManual().get(0));
    }
}
