/* --------------------------------------------------------------------------------------------------------------------
 * DeprecatableThing.java
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
 * thing that can be deprecated, meaning it is declared to be obsolescent
 * Note: Deprecation is used on objects that become obsolescent and should no longer be used, but cannot be deleted because that would potentially invalidate existing (e.g. archived) datasets that still reference such data. Typically this is the case for instances contained by a SiteDirectory and by ReferenceDataLibraries.
 */
public interface DeprecatableThing
{
    /**
     * Gets the isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    boolean isDeprecated();

    /**
     * Sets the isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    void setDeprecated(boolean isDeprecated);
}
