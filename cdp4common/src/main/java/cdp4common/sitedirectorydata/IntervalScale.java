/* --------------------------------------------------------------------------------------------------------------------
 * IntervalScale.java
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
 * an arbitrary zero value
 * Note 1: The measurement unit defines how to interpret an interval of one
 * on the scale.
 * Note 2: Two interval scales of measurement for the same quantity kind do
 * not need to have coincident zero values. In other words, the zero value
 * can be chosen arbitrarily.
 * Note 3: On an interval scale of measurement it is possible to take the
 * difference between two values or to compute the average (arithmetic
 * mean) of two or more values. Addition or multiplication of values is not
 * defined. It is however possible to add a quantity value defined on a
 * compatible ratio scale to a quantity value defined on an interval scale:
 * e.g. add a temperature difference of 2 kelvin to a temperature of 100
 * degree Celsius.
 * Note 4: The numerical value of a quantity expressed on one interval
 * scale can be converted to the value of the same quantity expressed on a
 * second (different) interval scale if the ratio between the respective
 * measurement units is known (the "conversion factor") as well as the
 * value on the second scale that represents the same quantity as zero on
 * the first scale (the "conversion offset").
 * Example 1: The Celsius and Fahrenheit temperature scales are common
 * examples of interval scales.
 * Example 2: A "Performance" interval scale with values 0: "very low";
 * 5: "medium"; 10: "very high"; can be used to compute weighted average
 * performance for a simple system for which for each of its elements a
 * separate "Performance" measure is given.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "scale")
public class IntervalScale extends AbstractIntervalScale {
    /**
     * Initializes a new instance of the <code>IntervalScale<code/> class.
     *
     * @see IntervalScale
     */
    public IntervalScale() {
        super();
    }

    /**
     * Initializes a new instance of the <code>IntervalScale<code/> class.
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
     * @see IntervalScale
     */
    public IntervalScale(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
