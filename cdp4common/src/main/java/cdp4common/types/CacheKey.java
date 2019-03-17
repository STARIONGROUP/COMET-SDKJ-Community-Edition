/*
 * CacheKey.java
 * Copyright (c) 2018 RHEA System S.A.
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
