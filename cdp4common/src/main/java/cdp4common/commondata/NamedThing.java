/* --------------------------------------------------------------------------------------------------------------------
 * NamedThing.java
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
 * representation of a Thing that has a human readable name
 */
public interface NamedThing {
    /**
     * Gets the Name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    String getName();

    /**
     * Sets the Name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    void setName(String name);
}
