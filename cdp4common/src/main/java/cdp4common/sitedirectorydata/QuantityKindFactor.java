/* --------------------------------------------------------------------------------------------------------------------
 * QuantityKindFactor.java
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
 * representation of a QuantityKind and an exponent that together define one factor in a product of powers of QuantityKinds
 */
@Container(clazz = DerivedQuantityKind.class, propertyName = "quantityKindFactor")
public class QuantityKindFactor extends AbstractQuantityKindFactor {
    /**
     * Initializes a new instance of the <code>QuantityKindFactor<code/> class.
     *
     * @see QuantityKindFactor
     */
    public QuantityKindFactor() {
        super();
    }

    /**
     * Initializes a new instance of the <code>QuantityKindFactor<code/> class.
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
     * @see QuantityKindFactor
     */
    public QuantityKindFactor(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
