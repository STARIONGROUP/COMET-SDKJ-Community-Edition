/*
 * CacheKeyTest.java
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
