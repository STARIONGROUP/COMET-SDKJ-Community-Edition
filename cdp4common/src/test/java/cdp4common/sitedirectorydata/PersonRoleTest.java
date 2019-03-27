/*
 * PersonRoleTest.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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
