/*
 * ParameterTypeComponentTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.sitedirectorydata;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterTypeComponentTest {
    @Test
    void verifyThatTheIndexOfAComponentReturnsTheExpectedResult() {
        CompoundParameterType compoundParameterType = new CompoundParameterType(UUID.randomUUID(), null, null);

        ParameterTypeComponent component0 = new ParameterTypeComponent(UUID.randomUUID(), null, null);
        ParameterTypeComponent component1 = new ParameterTypeComponent(UUID.randomUUID(), null, null);
        ParameterTypeComponent component2 = new ParameterTypeComponent(UUID.randomUUID(), null, null);
        ParameterTypeComponent componentnocontainer = new ParameterTypeComponent(UUID.randomUUID(), null, null);

        compoundParameterType.getComponent().add(component0);
        compoundParameterType.getComponent().add(component1);
        compoundParameterType.getComponent().add(component2);

        assertEquals(0, component0.getIndex());
        assertEquals(1, component1.getIndex());
        assertEquals(2, component2.getIndex());
        assertEquals(-1, componentnocontainer.getIndex());
    }
}
