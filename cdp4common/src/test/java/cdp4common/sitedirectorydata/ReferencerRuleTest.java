/*
 * ReferencerRuleTest.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 */

package cdp4common.sitedirectorydata;

import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.types.CacheKey;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ReferencerRuleTest {
    private URI uri;
    private Cache<CacheKey, Thing> cache;
    private Iteration iteration;

    @BeforeEach
    void setup() {
        this.uri = URI.create("http://www.rheagroup.com");
        this.cache = CacheBuilder.newBuilder().build();

        this.iteration = new Iteration(UUID.randomUUID(), this.cache, this.uri);
    }

    @Test
    void verifyThatTheVerifyMethodThrowsException() {
        ReferencerRule rule = new ReferencerRule(UUID.randomUUID(), this.cache, this.uri);
        assertThrows(UnsupportedOperationException.class, () -> rule.verify(this.iteration));
    }
}
