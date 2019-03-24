/*
 * ParameterBaseTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.UUID;

class ParameterBaseTest {
    private ArrayList<UUID> valueSets;

    @BeforeEach
    void setup() {
        this.valueSets = new ArrayList<>();
        this.valueSets.add(UUID.randomUUID());
        this.valueSets.add(UUID.randomUUID());
    }

    @Test
    void verifyThatParameterReturnsValueSets() {
        Parameter parameter = new Parameter(UUID.randomUUID(), 1);
        parameter.setValueSet(this.valueSets);

        Assertions.assertIterableEquals(this.valueSets, parameter.getValueSets());
    }

    @Test
    void verifyThatParameterOverrideReturnsValueSets() {
        ParameterOverride parameterOverride = new ParameterOverride(UUID.randomUUID(), 1);
        parameterOverride.setValueSet(this.valueSets);

        Assertions.assertIterableEquals(this.valueSets, parameterOverride.getValueSets());
    }

    @Test
    void verifyThatParameterSubscriptionReturnsValueSets() {
        ParameterSubscription parameterSubscription = new ParameterSubscription(UUID.randomUUID(), 1);
        parameterSubscription.setValueSet(this.valueSets);

        Assertions.assertIterableEquals(this.valueSets, parameterSubscription.getValueSets());
    }
}
