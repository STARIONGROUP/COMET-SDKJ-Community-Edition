/*
 * ParametricConstraintTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParametricConstraintTest {
    @Test
    void testGetOwner() {
        ParametricConstraint thing = new ParametricConstraint();
        Requirement req = new Requirement();
        req.setOwner(new DomainOfExpertise());
        req.getParametricConstraint().add(thing);

        assertTrue(req.getOwner() == thing.getOwner());
    }

    @Test
    void testGetOwnerThrowEx() {
        ParametricConstraint parametricConstraint = new ParametricConstraint();
        assertThrows(ContainmentException.class, parametricConstraint::getOwner);
    }
}
