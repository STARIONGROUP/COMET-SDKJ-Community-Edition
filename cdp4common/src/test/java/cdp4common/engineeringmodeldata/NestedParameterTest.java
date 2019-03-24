/*
 * NestedParameterTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import cdp4common.sitedirectorydata.SimpleQuantityKind;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NestedParameterTest {
    private SimpleQuantityKind simpleQuantityKind;
    private Parameter parameter;
    private NestedParameter nestedParameter;

    @BeforeEach
    void setup() {
        this.simpleQuantityKind = new SimpleQuantityKind();
        this.simpleQuantityKind.setShortName("TST");
        this.simpleQuantityKind.setName("TEST");
        this.parameter = new Parameter();
        this.parameter.setParameterType(this.simpleQuantityKind);
        this.nestedParameter = new NestedParameter();
        this.nestedParameter.setAssociatedParameter(this.parameter);
    }

    @Test
    void verifyThatUserFriendlyShortNameReturnsExpectedResult() {
        assertEquals("TST", this.nestedParameter.getUserFriendlyShortName());
    }

    @Test
    void verifyThatUserFriendlyNameReturnsExpectedResult() {
        assertEquals("TST", this.nestedParameter.getUserFriendlyName());
    }
}
