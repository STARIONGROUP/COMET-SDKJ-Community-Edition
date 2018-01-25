/* --------------------------------------------------------------------------------------------------------------------
 * RatioScale.java
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
 * kind of MeasurementScale that has ordered values, a measurement unit and
 * a fixed definition of the zero value on all scales for the same kind of
 * quantity
 * Note 1: The measurement unit defines how to interpret an interval of one
 * on the scale.
 * Note 2: Any two ratio scales of measurement for the same kind of
 * quantity have coincident zero values, they only differ in their
 * measurement unit.
 * Note 3: On a ratio scale of measurement it is possible to take the
 * difference between two values, to compute the average (arithmetic
 * mean) of two or more values, as well as to add, multiply and divide
 * values.
 * Note 4: The numerical value of quantity expressed on one ratio scale can
 * be converted to the value of the same quantity expressed on a second
 * (different) ratio scale through simple multiplication by a conversion
 * factor, which is the ratio between the respective measurement units.
 * Example: The majority of the physical quantities are expressed on ratio
 * scales, e.g.: length (metre, millimetre, kilometre, inch, foot, mile,
 * lightyear); mass (kilogram, gram, nanogram, ton, pound); time (second,
 * hour).
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "scale")
public class RatioScale extends AbstractRatioScale {
    /**
     * Initializes a new instance of the <code>RatioScale<code/> class.
     *
     * @see RatioScale
     */
    public RatioScale() {
        super();
    }

    /**
     * Initializes a new instance of the <code>RatioScale<code/> class.
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
     * @see RatioScale
     */
    public RatioScale(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
