/* --------------------------------------------------------------------------------------------------------------------
 * DerivedQuantityKind.java
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
 * specialization of QuantityKind that represents a kind of quantity that is defined as a product of powers of one or more other kinds of quantity
 * Note: A DerivedQuantityKind must define at least one <i>possibleScale</i>.
 * Examples 1: DerivedQuantityKind "velocity" can be specified as the product of SimpleQuantityKind "length" to the power one times SimpleQuantityKind "time" to the power minus one.
 * Example 2: DerivedQuantityKind "linear expansion coefficient" can be specified as the product of "length" to the power one times "length" to the power minus one. So, it is permissible to use the same QuantityKind more than once in the list of <i>quantityKindFactor</i>.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
public class DerivedQuantityKind extends AbstractDerivedQuantityKind {
    /**
     * Initializes a new instance of the <code>DerivedQuantityKind<code/> class.
     *
     * @see DerivedQuantityKind
     */
    public DerivedQuantityKind() {
        super();
    }

    /**
     * Initializes a new instance of the <code>DerivedQuantityKind<code/> class.
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
     * @see DerivedQuantityKind
     */
    public DerivedQuantityKind(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
