/*
 * NotExpressionTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NotExpressionTest {
    private NotExpression notExpression;

    @BeforeEach
    void setup() {
        this.notExpression = new NotExpression();
    }

    @Test
    void verifyThatStringValueReturnsExpectedResult() {
        Assertions.assertEquals("NOT", this.notExpression.getStringValue());
    }
}
