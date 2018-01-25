/* --------------------------------------------------------------------------------------------------------------------
 * PossibleFiniteState.java
 * Copyright (c) 2018 RHEA System S.A.
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

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
 * representation of one of the finite states of a PossibleFiniteStateList
 * Note: Finite states are used as a general concept to represent mission phases as well as system, subsystem and equipment modes, and in general any set of discrete states that are useful for a system definition. Parameters may have different values depending on the state that an element of a system is in, see the <i>stateDependence</i> property of Parameter.
 */
@Container(clazz = PossibleFiniteStateList.class, propertyName = "possibleState")
public class PossibleFiniteState extends AbstractPossibleFiniteState {
    /**
     * Initializes a new instance of the <code>PossibleFiniteState<code/> class.
     *
     * @see PossibleFiniteState
     */
    public PossibleFiniteState() {
        super();
    }

    /**
     * Initializes a new instance of the <code>PossibleFiniteState<code/> class.
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
     * @see PossibleFiniteState
     */
    public PossibleFiniteState(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
