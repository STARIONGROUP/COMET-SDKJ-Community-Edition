/*
 * ParticipantRoleTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.sitedirectorydata;

import cdp4common.commondata.ParticipantAccessRightKind;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParticipantRoleTest {
    @Test
    void verifyPopulateParticipantPermissions() {
        ParticipantRole participantRole = new ParticipantRole();
        Assertions.assertEquals(48, participantRole.getParticipantPermission().size());
        Assertions.assertTrue(participantRole.getParticipantPermission().stream().allMatch(x -> x.getAccessRight() == ParticipantAccessRightKind.NONE));
    }
}
