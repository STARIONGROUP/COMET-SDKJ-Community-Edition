/* --------------------------------------------------------------------------------------------------------------------
 * LogarithmicScale.java
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
 * representation of a logarithmic MeasurementScale
 * Note: The logarithmic ratio quantity value <i>v</i> is computed as follows: <i>v</i> = <i>f</i> · log<sub>base</sub>( (<i>x</i> / <i>x<sub>ref</sub></i> )<i><sup>a</sup></i> ), where <i>f</i> is a multiplication factor, <i>base</i> is the base of the log function, <i>x</i> is the actual quantity, <i>x<sub>ref</sub></i> is a reference quantity, and <i>a</i> is an exponent.
 * Example 1: The base 10 logarithmic measurement scale for "sound pressure level" in "decibel", with <i>factor</i> is "10", <i>exponent</i> is "2", <i>referenceQuantityKind</i> is "sound pressure" and <i>referenceQuantityValue</i>.value is "20" on the "µPa" RatioScale. Source: ISO 80000-08.
 * Example 2: The natural logarithmic measurement scale for "electric field strength" in "neper".
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "scale")
public class LogarithmicScale extends AbstractLogarithmicScale {
    /**
     * Initializes a new instance of the <code>LogarithmicScale<code/> class.
     *
     * @see LogarithmicScale
     */
    public LogarithmicScale() {
        super();
    }

    /**
     * Initializes a new instance of the <code>LogarithmicScale<code/> class.
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
     * @see LogarithmicScale
     */
    public LogarithmicScale(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
