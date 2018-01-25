/* --------------------------------------------------------------------------------------------------------------------
 * CyclicRatioScale.java
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
 * representation of a ratio MeasurementScale with a periodic cycle
 * Note: The magnitude of the periodic cycle is defined by the modulus of the scale.
 * Example: Planar angle with modulus 360 degree, therefore an angle of 450 degree is the same as an angle of 90 degree, and -60 degree is the same as 300 degree.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "scale")
public class CyclicRatioScale extends AbstractCyclicRatioScale {
    /**
     * Initializes a new instance of the <code>CyclicRatioScale<code/> class.
     *
     * @see CyclicRatioScale
     */
    public CyclicRatioScale() {
        super();
    }

    /**
     * Initializes a new instance of the <code>CyclicRatioScale<code/> class.
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
     * @see CyclicRatioScale
     */
    public CyclicRatioScale(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
