/*
 * SimpleParameterValueTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SimpleParameterValueTest {
    @Test
    void testGetOwner() {
        SimpleParameterValue simpleParameterValue = new SimpleParameterValue();
        Requirement requirement = new Requirement();
        requirement.setOwner(new DomainOfExpertise());
        requirement.getParameterValue().add(simpleParameterValue);

        assertTrue(requirement.getOwner() == simpleParameterValue.getOwner());
    }

    @Test
    void testGetOwnerThrowEx() {
        SimpleParameterValue simpleParameterValue = new SimpleParameterValue();
        assertThrows(ContainmentException.class, simpleParameterValue::getOwner);
    }
}
