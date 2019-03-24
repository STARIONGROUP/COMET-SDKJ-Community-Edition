/*
 * AndExpressionTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AndExpressionTest {

    private AndExpression andExpression;

    @BeforeEach
    void setup() {
        this.andExpression = new AndExpression();
    }

    @Test
    void verifyThatStringValueReturnsExpectedResult() {
        Assertions.assertEquals("AND", this.andExpression.getStringValue());
    }
}
