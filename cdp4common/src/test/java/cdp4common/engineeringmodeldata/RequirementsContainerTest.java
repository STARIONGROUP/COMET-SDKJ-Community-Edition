/*
 * RequirementsContainerTest.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.

 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené

 * This file is part of CDP4-SDKJ Community Edition

 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.

 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package cdp4common.engineeringmodeldata;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RequirementsContainerTest {
    @Test
    void verifyThatGetAllGroupsWorks() {
        RequirementsSpecification spec = new RequirementsSpecification();
        RequirementsGroup grp1 = new RequirementsGroup();
        RequirementsGroup grp11 = new RequirementsGroup();
        RequirementsGroup grp111 = new RequirementsGroup();
        RequirementsGroup grp12 = new RequirementsGroup();

        RequirementsGroup grp2 = new RequirementsGroup();
        RequirementsGroup grp21 = new RequirementsGroup();

        RequirementsGroup grp3 = new RequirementsGroup();

        spec.getGroup().add(grp1);
        spec.getGroup().add(grp2);
        spec.getGroup().add(grp3);

        grp1.getGroup().add(grp11);
        grp1.getGroup().add(grp12);

        grp11.getGroup().add(grp111);

        grp2.getGroup().add(grp21);

        List<RequirementsGroup> specAllGroups = spec.getAllContainedGroups();
        assertEquals(7, specAllGroups.size());

        List<RequirementsGroup> grp1AllGroup = grp1.getAllContainedGroups();
        assertEquals(3, grp1AllGroup.size());

        List<RequirementsGroup> grp2AllGroup = grp2.getAllContainedGroups();
        assertEquals(1, grp2AllGroup.size());
    }

    @Test
    void verifyThatPathReturnsTheExpectedResultWithDefaultDelimiter() {
        Iteration iteration = new Iteration();
        RequirementsSpecification spec = new RequirementsSpecification();
        spec.setShortName("spec");

        RequirementsGroup group_a = new RequirementsGroup();
        group_a.setShortName("a");

        RequirementsGroup group_a_a = new RequirementsGroup();
        group_a_a.setShortName("a_a");

        RequirementsGroup group_a_a_a = new RequirementsGroup();
        group_a_a_a.setShortName("a_a_a");

        iteration.getRequirementsSpecification().add(spec);

        assertEquals("a", group_a.getPath(null));
        assertEquals("a_a", group_a_a.getPath(null));
        assertEquals("a_a_a", group_a_a_a.getPath(null));

        group_a_a.getGroup().add(group_a_a_a);
        assertEquals("a_a.a_a_a", group_a_a_a.getPath(null));

        group_a.getGroup().add(group_a_a);
        assertEquals("a.a_a.a_a_a", group_a_a_a.getPath(null));

        spec.getGroup().add(group_a);
        assertEquals("spec.a.a_a.a_a_a", group_a_a_a.getPath(null));
    }

    @Test
    void verifyThatPathReturnsShortNameOfSpec() {
        Iteration iteration = new Iteration();
        RequirementsSpecification spec = new RequirementsSpecification();
        spec.setShortName("spec");
        iteration.getRequirementsSpecification().add(spec);

        assertEquals("spec", spec.getPath(null));
    }

    @Test
    void verifyThatPathReturnsTheExpectedResultWithNonDefaultDelimiter() {
        Iteration iteration = new Iteration();
        RequirementsSpecification spec = new RequirementsSpecification();
        spec.setShortName("spec");

        RequirementsGroup group_a = new RequirementsGroup();
        group_a.setShortName("a");

        RequirementsGroup group_a_a = new RequirementsGroup();
        group_a_a.setShortName("a_a");

        RequirementsGroup group_a_a_a = new RequirementsGroup();
        group_a_a_a.setShortName("a_a_a");

        iteration.getRequirementsSpecification().add(spec);

        assertEquals("a", group_a.getPath(';'));
        assertEquals("a_a", group_a_a.getPath(';'));
        assertEquals("a_a_a", group_a_a_a.getPath(';'));

        group_a_a.getGroup().add(group_a_a_a);
        assertEquals("a_a;a_a_a", group_a_a_a.getPath(';'));

        group_a.getGroup().add(group_a_a);
        assertEquals("a;a_a;a_a_a", group_a_a_a.getPath(';'));

        spec.getGroup().add(group_a);
        assertEquals("spec;a;a_a;a_a_a", group_a_a_a.getPath(';'));
    }
}
