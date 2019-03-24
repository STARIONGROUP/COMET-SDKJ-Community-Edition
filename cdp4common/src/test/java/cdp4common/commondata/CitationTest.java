/*
 * CitationTest.java
 * Copyright (c) 2015-2018 RHEA System S.A.
 */

package cdp4common.commondata;

import cdp4common.sitedirectorydata.ReferenceSource;
import cdp4common.sitedirectorydata.SiteReferenceDataLibrary;
import cdp4common.types.CacheKey;
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
    private Cache<CacheKey, Thing> cache;

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
