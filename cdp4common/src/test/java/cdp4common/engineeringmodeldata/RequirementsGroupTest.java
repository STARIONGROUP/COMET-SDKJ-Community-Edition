/*
 * RequirementsGroupTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
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
