/*
 * Publishable.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.engineeringmodeldata;

/**
 * A class that implements the {@link Publishable} interface exposes properties that
 * determine whether the instance is publishable or it is to be published in the next iteration
 */
public interface Publishable {
    /**
     * Gets a value indicating whether this {@link Publishable} is to be published in the next publication.
     */
    boolean getToBePublished ();

    /**
     * Sets a value indicating whether this {@link Publishable} is to be published in the next publication.
     *
     * @param toBePublished a value to set
     */
    void setToBePublished (boolean toBePublished);

    /**
     * Gets a value indicating whether a {@link Publishable} can be published.
     */
    boolean canBePublished ();
}
