/*
 * UnitPrefixTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.sitedirectorydata;

import cdp4common.commondata.Thing;
import cdp4common.types.CacheKey;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.Collection;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UnitPrefixTest {
    private URI uri;
    private Cache<CacheKey, Thing> cache;

    @BeforeEach
    void setup() {
        this.uri = URI.create("http://www.rheagroup.com");
        this.cache = CacheBuilder.newBuilder().build();
    }

    @Test
    void verifyThatGetRequiredRdlsReturnsExpectedResults() {
        SiteReferenceDataLibrary srdl1 = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
        SiteReferenceDataLibrary srdl1_1 = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
        SiteReferenceDataLibrary mrdl = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);
        SiteReferenceDataLibrary srdl2 = new SiteReferenceDataLibrary(UUID.randomUUID(), this.cache, this.uri);

        UnitPrefix unitPrefix = new UnitPrefix(UUID.randomUUID(), this.cache, this.uri);

        srdl1_1.setRequiredRdl(srdl1);
        mrdl.setRequiredRdl(srdl1_1);
        srdl2.setRequiredRdl(srdl1);

        mrdl.getUnitPrefix().add(unitPrefix);

        Collection<ReferenceDataLibrary> requiredRdls = unitPrefix.getRequiredRdls();

        assertTrue(requiredRdls.contains(mrdl));
        assertTrue(requiredRdls.contains(srdl1_1));
        assertTrue(requiredRdls.contains(srdl1));

        assertFalse(requiredRdls.contains(srdl2));
    }
}
