/* --------------------------------------------------------------------------------------------------------------------
 * SimpleUnit.java
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
 * specialization of MeasurementUnit that represents a measurement unit that does not
 * depend on any other MeasurementUnit
 * Note: Typically a base unit would be specified as a SimpleUnit, but it
 * is not mandatory that base units are specified as SimpleUnits. The
 * notable exception in SI is the "kilogram" that needs to be defined as a
 * PrefixedUnit that references the "gram" SimpleUnit as a <i>referenceUnit</i>.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
public class SimpleUnit extends AbstractSimpleUnit {
    /**
     * Initializes a new instance of the <code>SimpleUnit<code/> class.
     *
     * @see SimpleUnit
     */
    public SimpleUnit() {
        super();
    }

    /**
     * Initializes a new instance of the <code>SimpleUnit<code/> class.
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
     * @see SimpleUnit
     */
    public SimpleUnit(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
