/*
 * RequirementTest.java
 * Copyright (c) 2015-2018 RHEA System S.A.
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
