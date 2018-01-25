/* --------------------------------------------------------------------------------------------------------------------
 * DeprecatableThing.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Interface. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.commondata;

import java.util.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;

/**
 * thing that can be deprecated, meaning it is declared to be obsolescent
 * Note: Deprecation is used on objects that become obsolescent and should no longer be used, but cannot be deleted because that would potentially invalidate existing (e.g. archived) datasets that still reference such data. Typically this is the case for instances contained by a SiteDirectory and by ReferenceDataLibraries.
 */
public interface DeprecatableThing {
    /**
     * Gets the IsDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    boolean getDeprecated();

    /**
     * Sets the IsDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    void setDeprecated(boolean isDeprecated);
}
