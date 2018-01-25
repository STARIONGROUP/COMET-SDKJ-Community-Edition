/* --------------------------------------------------------------------------------------------------------------------
 * OrdinalScale.java
 * Copyright (c) 2018 RHEA System S.A.
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

import java.util.*;
import java.util.concurrent.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import org.apache.commons.lang3.tuple.Pair;

/**
 * kind of MeasurementScale in which the possible valid values are ordered
 * but where the intervals between the values do not have particular
 * significance
 * Note 1: It is therefore is not meaningful to add or subtract values on
 * such a scale. It is possible to compare values numerically.
 * Note 2:The MeasurementUnit associated with such scales should be the number one.
 * Example 1: The NASA/ESA Technology Readiness Level (TRL) scale with
 * ScaleValueDefinitions: 1 : "Basic principles observed and reported"; 2 :
 * "Technology concept and/or application formulated"; 3 : "Analytical and
 * experimental critical function and/or characteristic proof-of- concept";
 * 4 : "Component and/or breadboard validation in laboratory environment";
 * 5 : "Component and/or breadboard validation in relevant environment"; 6
 * : "System/subsystem model or prototype demonstration in a relevant
 * environment (ground or space)"; 7 : "System prototype demonstration in a
 * space environment"; 8 : "Actual system completed and 'flight qualified'
 * through test and demonstration (ground or space)"; 9 : "Actual system
 * 'flight proven' through successful mission operations".
 * Example 2: The Beaufort wind force scale with ScaleValueDefinitions (as
 * defined by the <i>World Meteorological Organization</i>): 0 : "Calm"; 1
 * : "Light air"; 2: "Light breeze"; 3: "Gentle breeze"; 4: "Moderate
 * breeze"; 5: "Fresh breeze"; 6: "Strong breeze"; 7: "Near gale"; 8:
 * "Gale"; 9: "Strong gale"; 10: "Storm"; 11: "Violent storm"; 12:
 * "Hurricane".
 * Example 3: A simple "Priority" scale with ScaleValueDefinitions
 * 1: "low"; 2: "medium"; 3: "high"; that is used to distinguish between
 * different priorities and be able to tell whether a given priority is
 * higher or lower than another.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "scale")
public class OrdinalScale extends AbstractOrdinalScale {
    /**
     * Initializes a new instance of the <code>OrdinalScale<code/> class.
     *
     * @see OrdinalScale
     */
    public OrdinalScale() {
        super();
    }

    /**
     * Initializes a new instance of the <code>OrdinalScale<code/> class.
     * @param iid The unique identifier.
     * @param cache The <code>ConcurrentHashMap<K,V></code> where the current thing is stored.
     * The <code>Pair<L,R><code/> of <code>UUID<code/> is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its <code>Iteration<code/> container if applicable or null.
     * @param iDalUri The <code>URI</code> of this thing
     *
     * @see ConcurrentHashMap
     * @see URI
     * @see UUID
     * @see Pair
     * @see Iteration
     * @see OrdinalScale
     */
    public OrdinalScale(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
