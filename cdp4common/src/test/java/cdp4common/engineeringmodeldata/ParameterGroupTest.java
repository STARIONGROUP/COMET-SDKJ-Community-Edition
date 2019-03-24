/*
 * ParameterGroupTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ParameterGroupTest {
    @Test
    void verifyThatIfContainerIsNullReturnsEmptyGroupIEnumerable() {
        ParameterGroup parameterGroup = new ParameterGroup(UUID.randomUUID(), null, null);
        assertTrue(parameterGroup.getContainedGroup(false).isEmpty());
    }

    @Test
    void verifyThatContainedGroupsReturnsGroupsThatAreContained() {
        ElementDefinition elementDefinition = new ElementDefinition(UUID.randomUUID(), null, null);

        ParameterGroup parameterGroup_1 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_1);
        ParameterGroup parameterGroup_2 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_2);

        ParameterGroup parameterGroup_1_1 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_1_1);
        parameterGroup_1_1.setContainingGroup(parameterGroup_1);

        ParameterGroup parameterGroup_1_2 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_1_2);
        parameterGroup_1_2.setContainingGroup(parameterGroup_1);

        ParameterGroup parameterGroup_1_1_1 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_1_1_1);
        parameterGroup_1_1_1.setContainingGroup(parameterGroup_1_1);

        assertTrue(parameterGroup_2.getContainedGroup(elementDefinition.getParameterGroup(), false).isEmpty());

        assertTrue(parameterGroup_1.getContainedGroup(elementDefinition.getParameterGroup(), false).contains(parameterGroup_1_1));
        assertTrue(parameterGroup_1.getContainedGroup(false).contains(parameterGroup_1_1));

        assertTrue(parameterGroup_1.getContainedGroup(elementDefinition.getParameterGroup(), false).contains(parameterGroup_1_2));
        assertTrue(parameterGroup_1.getContainedGroup(false).contains(parameterGroup_1_2));

        assertFalse(parameterGroup_1.getContainedGroup(elementDefinition.getParameterGroup(), false).contains(parameterGroup_1_1_1));
        assertFalse(parameterGroup_1.getContainedGroup(false).contains(parameterGroup_1_1_1));
    }

    @Test
    void verifyThatContainedGroupsDeepReturnsGroupsThatAreContained() {
        ElementDefinition elementDefinition = new ElementDefinition(UUID.randomUUID(), null, null);

        ParameterGroup parameterGroup_1 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_1);
        ParameterGroup parameterGroup_2 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_2);

        ParameterGroup parameterGroup_1_1 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_1_1);
        parameterGroup_1_1.setContainingGroup(parameterGroup_1);

        ParameterGroup parameterGroup_1_2 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_1_2);
        parameterGroup_1_2.setContainingGroup(parameterGroup_1);

        ParameterGroup parameterGroup_1_1_1 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_1_1_1);
        parameterGroup_1_1_1.setContainingGroup(parameterGroup_1_1);

        assertTrue(parameterGroup_2.getContainedGroup(true).isEmpty());

        assertFalse(parameterGroup_1.getContainedGroup(true).contains(parameterGroup_1));
        assertTrue(parameterGroup_1.getContainedGroup(true).contains(parameterGroup_1_1));
        assertTrue(parameterGroup_1.getContainedGroup(true).contains(parameterGroup_1_2));
        assertTrue(parameterGroup_1.getContainedGroup(true).contains(parameterGroup_1_1_1));
        assertEquals(3, parameterGroup_1.getContainedGroup(true).size());

        assertTrue(parameterGroup_1_1.getContainedGroup(true).contains(parameterGroup_1_1_1));
        assertEquals(1, parameterGroup_1_1.getContainedGroup(true).size());

        assertTrue(parameterGroup_1_2.getContainedGroup(true).isEmpty());
    }

    @Test
    void verifyThatIfContainerIsNullReturnsEmptyParameterIEnumerable() {
        ParameterGroup parameterGroup = new ParameterGroup(UUID.randomUUID(), null, null);
        assertTrue(parameterGroup.getContainedParameter().isEmpty());
    }

    @Test
    void verifyThatParameterGroupReturnsContainedParameters() {
        ElementDefinition elementDefinition = new ElementDefinition(UUID.randomUUID(), null, null);

        ParameterGroup parameterGroup_1 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_1);

        ParameterGroup parameterGroup_2 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_2);

        Parameter parameter_0 = new Parameter(UUID.randomUUID(), null, null);
        elementDefinition.getParameter().add(parameter_0);

        Parameter parameter_1_1 = new Parameter(UUID.randomUUID(), null, null);
        elementDefinition.getParameter().add(parameter_1_1);
        parameter_1_1.setGroup(parameterGroup_1);

        Parameter parameter_1_2 = new Parameter(UUID.randomUUID(), null, null);
        elementDefinition.getParameter().add(parameter_1_2);
        parameter_1_2.setGroup(parameterGroup_1);

        Parameter parameter_2_1 = new Parameter(UUID.randomUUID(), null, null);
        elementDefinition.getParameter().add(parameter_2_1);
        parameter_2_1.setGroup(parameterGroup_2);

        assertTrue(parameterGroup_1.getContainedParameter().contains(parameter_1_1));
        assertTrue(parameterGroup_1.getContainedParameter().contains(parameter_1_2));
        assertFalse(parameterGroup_1.getContainedParameter().contains(parameter_0));
        assertFalse(parameterGroup_1.getContainedParameter().contains(parameter_2_1));

        assertTrue(parameterGroup_2.getContainedParameter().contains(parameter_2_1));
        assertFalse(parameterGroup_2.getContainedParameter().contains(parameter_1_1));
        assertFalse(parameterGroup_2.getContainedParameter().contains(parameter_1_2));
        assertFalse(parameterGroup_2.getContainedParameter().contains(parameter_0));
    }

    @Test
    void verifyThatLevelReturnsExpectedResult() {
        ElementDefinition elementDefinition = new ElementDefinition(UUID.randomUUID(), null, null);

        ParameterGroup parameterGroup_0 = new ParameterGroup(UUID.randomUUID(), null, null);

        ParameterGroup parameterGroup_1 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_1);

        ParameterGroup parameterGroup_1_1 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_1_1);
        parameterGroup_1_1.setContainingGroup(parameterGroup_1);

        ParameterGroup parameterGroup_1_1_1 = new ParameterGroup(UUID.randomUUID(), null, null);
        elementDefinition.getParameterGroup().add(parameterGroup_1_1_1);
        parameterGroup_1_1_1.setContainingGroup(parameterGroup_1_1);

        assertEquals(-1, parameterGroup_0.getLevel());
        assertEquals(0, parameterGroup_1.getLevel());
        assertEquals(1, parameterGroup_1_1.getLevel());
        assertEquals(2, parameterGroup_1_1_1.getLevel());
    }
}
