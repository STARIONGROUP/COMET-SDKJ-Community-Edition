/*
 * UserRuleVerificationTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import cdp4common.sitedirectorydata.DecompositionRule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserRuleVerificationTest {
    @Test
    void testGetDerivedName() {
        UserRuleVerification userRuleVerif = new UserRuleVerification();
        DecompositionRule decompositionRule = new DecompositionRule();
        decompositionRule.setName("rule");
        userRuleVerif.setRule(decompositionRule);

        assertEquals("rule", userRuleVerif.getName());
    }
}
