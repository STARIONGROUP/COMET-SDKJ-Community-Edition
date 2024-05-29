/*
 * SiteDirectoryTest.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
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
