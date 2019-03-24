/*
 * ElementUsageTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import cdp4common.exceptions.ContainmentException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ElementUsageTest {
    private String edShortname1;

    private ElementDefinition elementDefinition1;

    private String edShortname2;

    private ElementDefinition elementDefinition2;

    private String euShortname;

    private ElementUsage elementUsage;

    @BeforeEach
    void setup() {
        this.edShortname1 = "Sat";
        this.elementDefinition1 = new ElementDefinition(UUID.randomUUID(), null, null);
        this.elementDefinition1.setShortName(this.edShortname1);

        this.edShortname2 = "Bat";
        this.elementDefinition2 = new ElementDefinition(UUID.randomUUID(), null, null);
        this.elementDefinition2.setShortName(this.edShortname2);

        this.euShortname = "bat_1";
        this.elementUsage = new ElementUsage(UUID.randomUUID(), null, null);
        this.elementUsage.setShortName(this.euShortname);
        this.elementUsage.setElementDefinition(this.elementDefinition2);

        this.elementDefinition1.getContainedElement().add(this.elementUsage);
    }

    @Test
    void verifyThatModelCodeReturnsTheExpectedResult() {
        String modelcode = "Sat.bat_1";

        assertEquals(modelcode, this.elementUsage.modelCode(null));
    }

    @Test
    void verifyThatWhenContainmentNotSetAContainmentExceptionIsThrown() {
        ElementUsage elementUsage = new ElementUsage(UUID.randomUUID(), null, null);
        assertThrows(ContainmentException.class, () -> elementUsage.modelCode(null));
    }

    @Test
    void verifyThatWhenComponentIndexNotNullArgumentExceptionIsThrown() {
        assertThrows(IllegalArgumentException.class, () -> elementUsage.modelCode(1));
    }
}
