/* --------------------------------------------------------------------------------------------------------------------
 * ParameterTypeComponent.java
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
 * representation of a component of a CompoundParameterType
 * Example 1: ParameterTypeComponents with shortNames "x", "y" and "z" for the components of a
 * ArrayParameterType that represents a 3D Cartesian coordinate position.
 * Example 2: Components "nr" and  "connector_type" for a CompoundParameterType that defines the number of a certain type of connectors. The "nr" component would be a "count" QuantityKind and the "connector_type" would be a EnumerationParameterType with an enumeration of known connector types.
 */
@Container(clazz = CompoundParameterType.class, propertyName = "component")
public class ParameterTypeComponent extends AbstractParameterTypeComponent {
    /**
     * Initializes a new instance of the <code>ParameterTypeComponent<code/> class.
     *
     * @see ParameterTypeComponent
     */
    public ParameterTypeComponent() {
        super();
    }

    /**
     * Initializes a new instance of the <code>ParameterTypeComponent<code/> class.
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
     * @see ParameterTypeComponent
     */
    public ParameterTypeComponent(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
