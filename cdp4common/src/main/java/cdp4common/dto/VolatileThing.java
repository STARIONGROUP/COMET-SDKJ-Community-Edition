/* --------------------------------------------------------------------------------------------------------------------
 * VolatileThing.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated DTO Interface. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;
import cdp4common.commondata.*;

/**
 * representation of a thing that can be volatile
 * Note: A volatile thing may or may not be persisted in a persistent data store, depending on the value of its <i>isVolatile</i> property. This serves to enable runtime-only use of such instances in a client application.
 */
public interface VolatileThing
{
    /**
     * Gets the isVolatile.
     * Note: When an instance is marked volatile it will not be persisted in the persistent data store. This meant to allow for runtime-only use of such instances in a client application.
     */
    boolean isVolatile();

    /**
     * Sets the isVolatile.
     * Note: When an instance is marked volatile it will not be persisted in the persistent data store. This meant to allow for runtime-only use of such instances in a client application.
     */
    void setVolatile(boolean isVolatile);
}
