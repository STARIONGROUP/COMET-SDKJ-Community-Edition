/* --------------------------------------------------------------------------------------------------------------------
 * EngineeringModel.java
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
 * representation of a parametric concurrent engineering model that specifies the problem to be solved and defines one or more (possible) design solutions
 * Note 1: An EngineeringModel also references a chain of one or more ReferenceDataLibraries (through the <i>requiredRdl</i> property of the associated EngineeringModelSetup) that define the reference data that is or can be used in the model.
 * Note 2: When an EngineeringModel is created for first time, it shall contain one Iteration and one Option (with <i>name</i> and <i>shortName</i> set to "Default"), which shall also be referenced as the <i>defaultOption</i>.
 */
public class EngineeringModel extends AbstractEngineeringModel {
    /**
     * Initializes a new instance of the <code>EngineeringModel<code/> class.
     *
     * @see EngineeringModel
     */
    public EngineeringModel() {
        super();
    }

    /**
     * Initializes a new instance of the <code>EngineeringModel<code/> class.
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
     * @see EngineeringModel
     */
    public EngineeringModel(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
