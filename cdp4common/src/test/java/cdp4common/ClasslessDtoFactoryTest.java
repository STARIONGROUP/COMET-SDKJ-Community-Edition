/*
 * ClasslessDtoFactoryTest.java
 * Copyright (c) 2019 RHEA System S.A.
 */
package cdp4common;

import cdp4common.dto.ParameterGroup;
import cdp4common.dto.SiteDirectory;
import cdp4common.dto.Thing;
import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ClasslessDtoFactoryTest {

    @Test
    void testFromThing() {
        var siteDirectory = new SiteDirectory(UUID.randomUUID(), 2);
        siteDirectory.setDefaultParticipantRole(UUID.randomUUID());

        var properties = Arrays.asList("defaultPersonRole", "iid");

        var classlessDTO = ClasslessDtoFactory.fromThing(siteDirectory, properties);

        assertEquals(3, classlessDTO.size());
        UUID uuid = (UUID) classlessDTO.get("defaultPersonRole");
        assertEquals(siteDirectory.getDefaultPersonRole(), uuid);
    }

    @Test
    void testFromThingFull() {
        var siteDirectory = new SiteDirectory(UUID.randomUUID(), 2);
        siteDirectory.setPersonRole(Lists.newArrayList(UUID.randomUUID()));

        var classlessDTO = ClasslessDtoFactory.fullFromThing(siteDirectory);

        assertTrue(classlessDTO.containsKey("CLASS_KIND"));
        assertTrue(classlessDTO.containsKey("iid"));
        assertTrue(classlessDTO.containsKey("organization"));
        assertTrue(classlessDTO.containsKey("person"));
        assertTrue(classlessDTO.containsKey("participantRole"));
        assertTrue(classlessDTO.containsKey("defaultParticipantRole"));
        assertTrue(classlessDTO.containsKey("siteReferenceDataLibrary"));
        assertTrue(classlessDTO.containsKey("model"));
        assertTrue(classlessDTO.containsKey("personRole"));
        assertTrue(classlessDTO.containsKey("defaultPersonRole"));
        assertTrue(classlessDTO.containsKey("logEntry"));
        assertTrue(classlessDTO.containsKey("domainGroup"));
        assertTrue(classlessDTO.containsKey("domain"));
        assertTrue(classlessDTO.containsKey("naturalLanguage"));
        assertTrue(classlessDTO.containsKey("createdOn"));
        assertTrue(classlessDTO.containsKey("name"));
        assertTrue(classlessDTO.containsKey("shortName"));
        assertTrue(classlessDTO.containsKey("lastModifiedOn"));
        assertTrue(classlessDTO.containsKey("modifiedOn"));
        assertTrue(classlessDTO.containsKey("revisionNumber"));
        assertTrue(classlessDTO.containsKey("excludedDomain"));
        assertTrue(classlessDTO.containsKey("excludedPerson"));
        assertTrue(classlessDTO.containsKey("annotation"));

        assertEquals(23, classlessDTO.size());

        UUID uuid = (UUID) classlessDTO.get("defaultPersonRole");
        assertEquals(siteDirectory.getDefaultPersonRole(), uuid);
    }

    @Test
    void testNullThingInFromThing() {
        Thing thing = null;
        assertThrows(NullPointerException.class, () -> ClasslessDtoFactory.fromThing(thing, null));
    }

    @Test
    void testNullThingInFullFromThing() {
        Thing thing = null;
        assertThrows(NullPointerException.class, () -> ClasslessDtoFactory.fullFromThing(thing));
    }

    @Test
    void verifyThatNullableIsTakenIntoAccount() {
        Thing thing = new ParameterGroup();
        var classlessDTO = ClasslessDtoFactory.fullFromThing(thing);
        Object containingGroup = classlessDTO.get("containingGroup");
        assertNull(containingGroup);
        Object name = classlessDTO.get("name");

        assertNotNull(name);
        assertEquals("", name);
    }
}
