/* --------------------------------------------------------------------------------------------------------------------
 * TimeStampedThing.java
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
 * representation of a thing with a timestamp that records its creation time
 */
public interface TimeStampedThing
{
    /**
     * Gets the createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    LocalDateTime getCreatedOn();

    /**
     * Sets the createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    void setCreatedOn(LocalDateTime createdOn);
}
