/*
 * CacheKey.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
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

import cdp4common.engineeringmodeldata.Iteration;
import lombok.Getter;
import lombok.NonNull;

import java.util.Objects;
import java.util.UUID;

/**
 * Represents the key of the Cache
 * <p>
 * This class is optimized for performance to make the Cache lookups fast. The final fields
 * are used to compute the hashCode of the class.
 */
public final class CacheKey {
    /**
     * Backing field for the {@link cdp4common.commondata.Thing} property
     * <p>
     * Final properties are used to ensure the hashCode() function always returns the same value
     */
    @Getter
    private final UUID thing;

    /**
     * Backing field for the {@link Iteration} property
     * <p>
     * Final properties are used to ensure the GetHashCode() function always returns the same value
     */
    @Getter
    private final UUID iteration;

    /**
     * Initializes a new instance of the {@link CacheKey} class.
     *
     * @param thing     The unique identifier of the {@link cdp4common.commondata.Thing} that is cached
     * @param iteration The unique identifier of the container {@link cdp4common.engineeringmodeldata.Iteration} that is cached
     */
    public CacheKey(@NonNull UUID thing, UUID iteration) {
        this.thing = thing;
        this.iteration = iteration;
    }

    /**
     * Indicates whether this instance and a specified object are equal.
     *
     * @param o The {@link Object} to compare with the current instance.
     * @return true if {@code o} and this instance are the same type and represent the same value, otherwise false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CacheKey cacheKey = (CacheKey) o;
        return getThing().equals(cacheKey.getThing()) &&
                Objects.equals(getIteration(), cacheKey.getIteration());
    }

    /**
     * Returns the hash code for this instance.
     *
     * @return A 32-bit signed integer that is the hash code for this instance.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getThing(), getIteration());
    }
}
