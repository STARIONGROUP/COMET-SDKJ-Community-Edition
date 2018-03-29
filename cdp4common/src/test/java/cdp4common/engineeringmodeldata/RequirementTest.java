/* --------------------------------------------------------------------------------------------------------------------
 *    RequirementTest.java
 *    Copyright (c) 2015-2018 RHEA System S.A.
 *
 *    Author: Sam Gerené, Merlin Bieze, Alex Vorobiev, Naron Phou
 *
 *    This file is part of CDP4-SDK Community Edition
 *
 *    The CDP4-SDK Community Edition is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General
 *    License as published by the Free Software Foundation; either
 *    version 3 of the License, or (at your option) any later version.
 *
 *    The CDP4-SDK Community Edition is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General  License for more details.
 *
 *    You should have received a copy of the GNU Lesser General  License
 *    along with this program; if not, write to the Free Software Foundation,
 *    Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *  --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RequirementTest {
    @Test
    void verifyThatInvalidOperationIsThrownWhenContainerIsNotSet() {
        Requirement requirement = new Requirement();
        assertThrows(IllegalStateException.class, () -> requirement.getGroupPath(null));
    }

    @Test
    void verifyThatGroupPathReturnsExpectedResultWhenGroupedAndDefaultDelimiterIsUsed() {
        RequirementsSpecification requirementsSpecification = new RequirementsSpecification();
        requirementsSpecification.setShortName("spec");

        Requirement requirement = new Requirement();
        requirement.setShortName("req");

        requirementsSpecification.getRequirement().add(requirement);

        RequirementsGroup requirementsGroupA = new RequirementsGroup();
        requirementsGroupA.setShortName("a");

        RequirementsGroup requirementsGroupAA = new RequirementsGroup();
        requirementsGroupAA.setShortName("a_a");

        requirementsGroupA.getGroup().add(requirementsGroupAA);
        requirementsSpecification.getGroup().add(requirementsGroupA);

        requirement.setGroup(requirementsGroupAA);

        assertEquals("spec.a.a_a.req", requirement.getGroupPath(null));
    }

    @Test
    void verifyThatGroupPathReturnsExpectedResultWhenGroupedAndNonDefaultDelimiterIsUsed() {
        RequirementsSpecification requirementsSpecification = new RequirementsSpecification();
        requirementsSpecification.setShortName("spec");

        Requirement requirement = new Requirement();
        requirement.setShortName("req");

        requirementsSpecification.getRequirement().add(requirement);

        RequirementsGroup requirementsGroupA = new RequirementsGroup();
        requirementsGroupA.setShortName("a");

        RequirementsGroup requirementsGroupAA = new RequirementsGroup();
        requirementsGroupAA.setShortName("a_a");

        requirementsGroupA.getGroup().add(requirementsGroupAA);
        requirementsSpecification.getGroup().add(requirementsGroupA);

        requirement.setGroup(requirementsGroupAA);

        assertEquals("spec;a;a_a;req", requirement.getGroupPath(';'));
    }

    @Test
    void verifyThatGroupPathReturnsExpectedResultWhenNotGroupedAndDefaultDelimiterIsUsed() {
        RequirementsSpecification requirementsSpecification = new RequirementsSpecification();
        requirementsSpecification.setShortName("spec");

        Requirement requirement = new Requirement();
        requirement.setShortName("req");

        requirementsSpecification.getRequirement().add(requirement);

        assertEquals("spec.req", requirement.getGroupPath(null));
    }

    @Test
    void verifyThatGroupPathReturnsExpectedResultWhenNotGroupedAndNonDefaultDelimiterIsUsed() {
        RequirementsSpecification requirementsSpecification = new RequirementsSpecification();
        requirementsSpecification.setShortName("spec");

        Requirement requirement = new Requirement();
        requirement.setShortName("req");

        requirementsSpecification.getRequirement().add(requirement);

        assertEquals("spec,req", requirement.getGroupPath(','));
    }
}
