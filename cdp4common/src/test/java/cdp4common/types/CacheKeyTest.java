/*
 * CacheKeyTest.java
 * Copyright (c) 2018 RHEA System S.A.
 */
package cdp4common.types;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class CacheKeyTest {
    @Test
    void throwsExceptionForNullThing() {
        assertThrows(NullPointerException.class, () -> new CacheKey(null, null));
    }

    @Test
    void createsCacheKeyForNullIteration() {
        var cacheKey = new CacheKey(UUID.randomUUID(), null);
        assertNotNull(cacheKey.getThing());
        assertNull(cacheKey.getIteration());
    }

    @Test
    void equalsWorksAsExpectedWithNullIteration() {
        var cacheKeyA = new CacheKey(UUID.randomUUID(), null);
        var cacheKeyB = new CacheKey(UUID.randomUUID(), null);
        assertNotEquals(cacheKeyA, cacheKeyB);
        assertEquals(cacheKeyA, cacheKeyA);
        assertEquals(cacheKeyB, cacheKeyB);
        assertNotEquals(cacheKeyA, null);
        assertNotEquals(cacheKeyA, new Object());
    }

    @Test
    void equalsWorksAsExpectedWithNonNullIteration() {
        var cacheKeyA = new CacheKey(UUID.randomUUID(), UUID.randomUUID());
        var cacheKeyB = new CacheKey(UUID.randomUUID(), UUID.randomUUID());
        assertNotEquals(cacheKeyA, cacheKeyB);
        assertEquals(cacheKeyA, cacheKeyA);
        assertEquals(cacheKeyB, cacheKeyB);
        assertNotEquals(cacheKeyA, null);
        assertNotEquals(cacheKeyA, new Object());
    }
}
