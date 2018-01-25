/* --------------------------------------------------------------------------------------------------------------------
 * ActualFiniteState.java
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
 * representation of an actual finite state in an ActualFiniteStateList
 * Note: Such an actual finite state may is composed of as many possible finite states as there are PossibleFiniteStateLists associated to the containing ActualFiniteStateList of this ActualFiniteState. An ActualFiniteState can be associated with a ParameterValueSet for a Parameter (or ParameterOverride) that has a <i>stateDependence</i>, as well as for a ParameterSubscriptionValueSet for such a Parameter or ParameterOverride.
 */
@Container(clazz = ActualFiniteStateList.class, propertyName = "actualState")
public class ActualFiniteState extends AbstractActualFiniteState {
    /**
     * Initializes a new instance of the <code>ActualFiniteState<code/> class.
     *
     * @see ActualFiniteState
     */
    public ActualFiniteState() {
        super();
    }

    /**
     * Initializes a new instance of the <code>ActualFiniteState<code/> class.
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
     * @see ActualFiniteState
     */
    public ActualFiniteState(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
