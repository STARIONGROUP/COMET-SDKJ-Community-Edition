/*
 * OrExpressionTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrExpressionTest {
    private OrExpression orExpression;

    @BeforeEach
    void setup() {
        this.orExpression = new OrExpression();
    }

    @Test
    void verifyThatStringValueReturnsExpectedResult() {
        Assertions.assertEquals("OR", this.orExpression.getStringValue());
    }
}
