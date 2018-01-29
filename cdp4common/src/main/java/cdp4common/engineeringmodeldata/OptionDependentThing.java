/* --------------------------------------------------------------------------------------------------------------------
 * OptionDependentThing.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Interface. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

import java.util.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;

/**
 * representation of a Thing that can be included in or excluded from one or     more     Options
 */
public interface OptionDependentThing {
    /**
     * Gets a list of Option.
     * reference to zero or more Options from which this OptionDependentThing is excluded
     * Note: By default all OptionDependentThings are included in all Options in an EngineeringModel. Only the exclusions are recorded in the data model because this is the most efficient way of storing and handling the option dependency. In client applications it may be more intuitive to show the included Options, but that is a simple transformation.
     */
    ArrayList<Option> getExcludeOption();

    /**
     * Sets a list of Option.
     * reference to zero or more Options from which this OptionDependentThing is excluded
     * Note: By default all OptionDependentThings are included in all Options in an EngineeringModel. Only the exclusions are recorded in the data model because this is the most efficient way of storing and handling the option dependency. In client applications it may be more intuitive to show the included Options, but that is a simple transformation.
     */
    void setExcludeOption(ArrayList<Option> excludeOption);
}
