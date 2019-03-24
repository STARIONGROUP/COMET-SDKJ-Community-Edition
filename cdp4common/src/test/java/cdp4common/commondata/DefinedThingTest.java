/*
 * DefinedThingTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.commondata;

import cdp4common.engineeringmodeldata.ElementDefinition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefinedThingTest {
    private ElementDefinition elementDefinition;

    @BeforeEach
    void setup() {
        this.elementDefinition = new ElementDefinition();
        this.elementDefinition.setShortName("shortname");
        this.elementDefinition.setName("this is a name");
    }

    @Test
    void VerifyThatUserFriendlyNameReturnsExpectedResult() {
        assertEquals("this is a name", this.elementDefinition.getUserFriendlyName());
    }

    @Test
    void VerifyThatUserFriendlyShortNameReturnsExpectedResult() {
        assertEquals("shortname", this.elementDefinition.getUserFriendlyShortName());
    }
}
