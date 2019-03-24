/*
 * RuleVerificationTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RuleVerificationTest {
    @Test
    void testGetOwner() {
        UserRuleVerification thing = new UserRuleVerification();
        RuleVerificationList list = new RuleVerificationList();
        list.setOwner(new DomainOfExpertise());
        list.getRuleVerification().add(thing);

        assertTrue(list.getOwner() == thing.getOwner());
    }

    @Test
    void testGetOwnerThrowEx() {
        UserRuleVerification userRuleVerification = new UserRuleVerification();
        assertThrows(ContainmentException.class, userRuleVerification::getOwner);
    }
}
