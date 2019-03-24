/*
 * DerivedQuantityKindTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.sitedirectorydata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DerivedQuantityKindTest {
    private DerivedQuantityKind derivedQuantityKind;

    @Test
    void verifyThatErrorListContainsErrorWhenNoPossibleScalesAreSet() {
        this.derivedQuantityKind = new DerivedQuantityKind();
        this.derivedQuantityKind.validatePojo();

        assertTrue(this.derivedQuantityKind.getValidationErrors().contains("The PossibleScale property is empty."));
    }
}
