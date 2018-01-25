/* --------------------------------------------------------------------------------------------------------------------
 * DerivedUnit.java
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
 * specialization of MeasurementUnit that is defined as a product of powers of one or
 * more other measurement units
 * Examples 1: The measurement unit "metre per second" for "velocity"
 * is specified as the product of "metre" to the power one times "second"
 * to the power minus one.
 * Example 2: The measurement unit "micrometre per metre" for the
 * DerivedQuantityKind "linear expansion coefficient" is specified as the
 * product of (PrefixedUnit) "micrometre" to the power one times
 * (SimpleUnit) "metre" to the power minus one.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
public class DerivedUnit extends AbstractDerivedUnit {
    /**
     * Initializes a new instance of the <code>DerivedUnit<code/> class.
     *
     * @see DerivedUnit
     */
    public DerivedUnit() {
        super();
    }

    /**
     * Initializes a new instance of the <code>DerivedUnit<code/> class.
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
     * @see DerivedUnit
     */
    public DerivedUnit(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
