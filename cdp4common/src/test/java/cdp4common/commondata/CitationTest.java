/* --------------------------------------------------------------------------------------------------------------------
 *    CitationTest.java
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

package cdp4common.commondata;

import cdp4common.sitedirectorydata.ReferenceSource;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CitationTest {
    private URI uri;
    private Cache<Pair<UUID, UUID>, Thing> cache;

    @BeforeEach
    void setup() {
        this.uri = URI.create("http://www.rheagroup.com");
        this.cache = CacheBuilder.newBuilder().build();
    }

    @Test
    void verifyThatGetRequiredRdlsWorks() {
        SiteReferenceDataLibrary srdl1 = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
        SiteReferenceDataLibrary mrdl = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
        SiteReferenceDataLibrary srdl2 = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);

        ReferenceSource source = new ReferenceSource(UUID.randomUUID(), this.cache, this.uri);

        mrdl.setRequiredRdl(srdl1);
        srdl2.setRequiredRdl(srdl1);

        mrdl.getReferenceSource().add(source);
        Citation citation = new Citation(UUID.randomUUID(), this.cache, this.uri);
        citation.setSource(source);

        assertTrue(citation.getRequiredRdls().contains(srdl1));
        assertTrue(citation.getRequiredRdls().contains(mrdl));
        assertFalse(citation.getRequiredRdls().contains(srdl2));
    }
}
