/*
 * RequirementsContainerTest.java
 * Copyright (c) 2015-2018 RHEA System S.A.
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
