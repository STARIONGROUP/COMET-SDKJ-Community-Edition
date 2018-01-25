/* --------------------------------------------------------------------------------------------------------------------
 * PossibleFiniteStateList.java
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
 * specialization of CategorizableThing that defines a finite ordered
 * collection of one or more named States
 * Note: A PossibleFiniteStateList may form the basis for later definition of a
 * finite state machine.
 * Example 1: A PossibleFiniteStateList may be used to define "MissionPhases" with
 * the sequence of states "PreLaunch", "Launch",  "Ascent",
 * "TransferOrbit", "OperationalOrbit".
 * Example 2: A PossibleFiniteStateList may be used to define "SpacecraftModes"
 * with states "SafeMode", "Hibernation", "Operation".
 */
@Container(clazz = Iteration.class, propertyName = "possibleFiniteStateList")
public class PossibleFiniteStateList extends AbstractPossibleFiniteStateList {
    /**
     * Initializes a new instance of the <code>PossibleFiniteStateList<code/> class.
     *
     * @see PossibleFiniteStateList
     */
    public PossibleFiniteStateList() {
        super();
    }

    /**
     * Initializes a new instance of the <code>PossibleFiniteStateList<code/> class.
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
     * @see PossibleFiniteStateList
     */
    public PossibleFiniteStateList(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
