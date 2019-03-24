/*
 * ExclusiveOrExpressionTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExclusiveOrExpressionTest {
    private ExclusiveOrExpression exclusiveOrExpression;

    @BeforeEach
    void setup() {
        this.exclusiveOrExpression = new ExclusiveOrExpression();
    }

    @Test
    void verifyThatStringValueReturnsExpectedResult() {
        Assertions.assertEquals("XOR", this.exclusiveOrExpression.getStringValue());
    }
}
