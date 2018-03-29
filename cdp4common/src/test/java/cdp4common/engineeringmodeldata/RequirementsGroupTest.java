/* --------------------------------------------------------------------------------------------------------------------
 *    RequirementsGroupTest.java
 *    Copyright (c) 2015-2018 RHEA System S.A.
 *
 *    Author: Sam Gerené, Merlin Bieze, Alex Vorobiev, Naron Phou
 *
 *    This file is part of CDP4-SDK Community Edition
 *
 *    The CDP4-SDK Community Edition is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 3 of the License, or (at your option) any later version.
 *
 *    The CDP4-SDK Community Edition is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public License
 *    along with this program; if not, write to the Free Software Foundation,
 *    Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *  --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RequirementsGroupTest {
    @Test
    void verifyThatContainedGroupsReturnsExpectedResult() {
        RequirementsGroup topGroup = new RequirementsGroup();
        RequirementsGroup group_1 = new RequirementsGroup();
        RequirementsGroup group_2 = new RequirementsGroup();

        RequirementsGroup group_1_1 = new RequirementsGroup();
        RequirementsGroup group_1_2 = new RequirementsGroup();

        topGroup.getGroup().add(group_1);
        topGroup.getGroup().add(group_2);

        group_1.getGroup().add(group_1_1);
        group_1.getGroup().add(group_1_2);

        List<RequirementsGroup> containedGroups = new ArrayList<>();
        containedGroups.add(group_1);
        containedGroups.add(group_2);
        containedGroups.add(group_1_1);
        containedGroups.add(group_1_2);

        List<RequirementsGroup> actualContainedGroups = topGroup.getContainedGroup();

        assertTrue(containedGroups.containsAll(actualContainedGroups) && containedGroups.size() == actualContainedGroups.size());
    }
}
