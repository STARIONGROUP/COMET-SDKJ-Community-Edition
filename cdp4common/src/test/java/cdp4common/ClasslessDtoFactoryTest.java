/*
 * ClasslessDtoFactoryTest.java
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
package cdp4common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cdp4common.commondata.ClassKind;
import cdp4common.dto.ParameterGroup;
import cdp4common.dto.SiteDirectory;
import cdp4common.dto.Thing;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class ClasslessDtoFactoryTest {

    @Test
    void testFromThing() {
        SiteDirectory siteDirectory = new SiteDirectory(UUID.randomUUID(), 2);
        siteDirectory.setDefaultParticipantRole(UUID.randomUUID());

        List<String> properties = Arrays.asList("defaultPersonRole", "iid", "classKind", "defaultParticipantRole", "createdOn");

        ClasslessDTO classlessDTO = ClasslessDtoFactory.fromThing(siteDirectory, properties);

        assertEquals(5, classlessDTO.size());
        UUID uuid = (UUID) classlessDTO.get("defaultPersonRole");
        assertEquals(siteDirectory.getDefaultPersonRole(), uuid);
        assertEquals(siteDirectory.getDefaultParticipantRole(), classlessDTO.get("defaultParticipantRole"));
        assertEquals("", classlessDTO.get("createdOn"));
    }

    @Test
    void testFromThingWithNullProperties() {
        SiteDirectory siteDirectory = new SiteDirectory(UUID.randomUUID(), 2);
        siteDirectory.setDefaultParticipantRole(UUID.randomUUID());

        List<String> properties = null;

        ClasslessDTO classlessDTO = ClasslessDtoFactory.fromThing(siteDirectory, properties);

        assertEquals(2, classlessDTO.size());
        assertEquals(ClassKind.SiteDirectory, classlessDTO.get("classKind"));
        assertTrue(classlessDTO.get("iid") instanceof UUID);
    }

    @Test
    void testFromThingThrowsExceptionForUnknownProperty() {
        SiteDirectory siteDirectory = new SiteDirectory(UUID.randomUUID(), 2);
        siteDirectory.setDefaultParticipantRole(UUID.randomUUID());

        List<String> properties = Arrays.asList("defaultPersonRole", "iid", "classKind", "unknownProperty");

        assertThrows(NoSuchElementException.class, () -> ClasslessDtoFactory.fromThing(siteDirectory, properties));
    }

    @Test
    void testFromThingFull() {
        SiteDirectory siteDirectory = new SiteDirectory(UUID.randomUUID(), 2);
        siteDirectory.setPersonRole(Lists.newArrayList(UUID.randomUUID()));

        ClasslessDTO classlessDTO = ClasslessDtoFactory.fullFromThing(siteDirectory);

        assertTrue(classlessDTO.containsKey("classKind"));
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
        assertTrue(classlessDTO.containsKey("thingPreference"));

        assertEquals(24, classlessDTO.size());

        UUID uuid = (UUID) classlessDTO.get("defaultPersonRole");
        assertEquals(siteDirectory.getDefaultPersonRole(), uuid);
    }

    @Test
    void testNullThingInFromThing() {
        assertThrows(NullPointerException.class, () -> ClasslessDtoFactory.fromThing(null, null));
    }

    @Test
    void testNullThingInFullFromThing() {
        assertThrows(NullPointerException.class, () -> ClasslessDtoFactory.fullFromThing(null));
    }

    @Test
    void verifyThatNullableIsTakenIntoAccount() {
        Thing thing = new ParameterGroup();
        ClasslessDTO classlessDTO = ClasslessDtoFactory.fullFromThing(thing);
        Object containingGroup = classlessDTO.get("containingGroup");
        assertNull(containingGroup);
        Object name = classlessDTO.get("name");

        assertNotNull(name);
        assertEquals("", name);
    }
}
