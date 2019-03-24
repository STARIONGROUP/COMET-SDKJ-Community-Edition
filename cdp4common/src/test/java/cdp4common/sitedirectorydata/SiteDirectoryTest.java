/*
 * SiteDirectoryTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.sitedirectorydata;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SiteDirectoryTest {
    @Test
    void verifyThatAvailableReferenceDataLibrariesReturnsExpected() {
        SiteDirectory siteDirectory = new SiteDirectory(UUID.randomUUID(), null, null);

        SiteReferenceDataLibrary siterefenceDataLibrary = new SiteReferenceDataLibrary(UUID.randomUUID(), null, null);
        siteDirectory.getSiteReferenceDataLibrary().add(siterefenceDataLibrary);

        EngineeringModelSetup engineeringModelSetup = new EngineeringModelSetup(UUID.randomUUID(), null, null);
        ModelReferenceDataLibrary modelReferenceDataLibrary = new ModelReferenceDataLibrary(UUID.randomUUID(), null, null);
        engineeringModelSetup.getRequiredRdl().add(modelReferenceDataLibrary);
        siteDirectory.getModel().add(engineeringModelSetup);

        List<ReferenceDataLibrary> availableReferenceDataLibraries = siteDirectory.getAvailableReferenceDataLibraries();

        assertTrue(availableReferenceDataLibraries.contains(siterefenceDataLibrary));
        assertTrue(availableReferenceDataLibraries.contains(modelReferenceDataLibrary));
    }
}
