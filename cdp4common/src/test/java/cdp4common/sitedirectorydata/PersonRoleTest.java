/*
 * PersonRoleTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.sitedirectorydata;

import cdp4common.commondata.PersonAccessRightKind;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonRoleTest {
    @Test
    void verifyPopulatePersonPermissions() {
        PersonRole personRole = new PersonRole();
        Assertions.assertEquals(17, personRole.getPersonPermission().size());
        Assertions.assertTrue(personRole.getPersonPermission().stream().allMatch(x -> x.getAccessRight() == PersonAccessRightKind.NONE));
    }
}
