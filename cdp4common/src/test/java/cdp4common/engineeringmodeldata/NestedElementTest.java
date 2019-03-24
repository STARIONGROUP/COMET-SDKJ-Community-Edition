/*
 * NestedElementTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import cdp4common.sitedirectorydata.DomainOfExpertise;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NestedElementTest {
    private NestedElement nestedElement;

    private ElementUsage elementUsage;
    private ElementUsage elementUsage2;
    private ElementDefinition elementDef;
    private DomainOfExpertise domain;
    private DomainOfExpertise domain2;

    @BeforeEach
    void setup() {
        this.nestedElement = new NestedElement(UUID.randomUUID(), null, null);
        this.elementUsage = new ElementUsage(UUID.randomUUID(), null, null);
        elementUsage.setName("ElementUsage");
        elementUsage.setShortName("Use1");

        this.elementUsage2 = new ElementUsage(UUID.randomUUID(), null, null);
        elementUsage2.setName("ElementUsage2");
        elementUsage2.setShortName("Use2");

        this.elementDef = new ElementDefinition(UUID.randomUUID(), null, null);
        elementDef.setName("ElementDef");
        elementDef.setShortName("Def");

        this.domain = new DomainOfExpertise(UUID.randomUUID(), null, null);
        this.domain2 = new DomainOfExpertise(UUID.randomUUID(), null, null);

        this.elementUsage.setOwner(this.domain2);
        this.elementUsage2.setOwner(this.domain2);
        this.elementDef.setOwner(this.domain);

        this.nestedElement.setRootElement(this.elementDef);
        this.nestedElement.getElementUsage().add(this.elementUsage);
        this.nestedElement.getElementUsage().add(this.elementUsage2);
    }

    @Test
    void verifyThatGetNameWorks() {
        assertEquals("ElementUsage2", this.nestedElement.getName());
    }

    @Test
    void verifyThatGetNameWorks2() {
        this.nestedElement.getElementUsage().clear();
        assertEquals("ElementDef", this.nestedElement.getName());
    }

    @Test
    void verifyShortName() {
        assertEquals("Def.Use1.Use2", this.nestedElement.getShortName());
    }

    @Test
    void verifyGetOwner() {
        assertTrue(this.domain2 == this.nestedElement.getOwner());
    }

    @Test
    void verifyGetOwner2() {
        this.nestedElement.getElementUsage().clear();
        assertTrue(this.domain == this.nestedElement.getOwner());
    }
}
