/*
 * IdCorrespondenceTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

import cdp4common.exceptions.ContainmentException;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IdCorrespondenceTest {
    @Test
    void verifyGetOwner() {
        IdCorrespondence thing = new IdCorrespondence(UUID.randomUUID(), null, null);
        ExternalIdentifierMap externalIdentifierMap = new ExternalIdentifierMap(UUID.randomUUID(), null, null);
        externalIdentifierMap.setOwner(new DomainOfExpertise(UUID.randomUUID(), null, null));

        thing.setContainer(externalIdentifierMap);

        assertTrue(thing.getOwner() == externalIdentifierMap.getOwner());
    }

    @Test
    void verifyGetOwnerThrowException() {
        IdCorrespondence thing = new IdCorrespondence(UUID.randomUUID(), null, null);
        assertThrows(ContainmentException.class, thing::getOwner);
    }
}
