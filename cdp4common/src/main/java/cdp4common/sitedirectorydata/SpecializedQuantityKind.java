/* --------------------------------------------------------------------------------------------------------------------
 * SpecializedQuantityKind.java
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
 * specialization of QuantityKind that represents a kind of quantity that
 * is a specialization of another kind of quantity
 * Example: The kinds of quantity "distance", "width", "depth", "radius"
 * and "wavelength" can all be specified as specializations of the "length"
 * SimpleQuantityKind.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
public class SpecializedQuantityKind extends AbstractSpecializedQuantityKind {
    /**
     * Initializes a new instance of the <code>SpecializedQuantityKind<code/> class.
     *
     * @see SpecializedQuantityKind
     */
    public SpecializedQuantityKind() {
        super();
    }

    /**
     * Initializes a new instance of the <code>SpecializedQuantityKind<code/> class.
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
     * @see SpecializedQuantityKind
     */
    public SpecializedQuantityKind(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
