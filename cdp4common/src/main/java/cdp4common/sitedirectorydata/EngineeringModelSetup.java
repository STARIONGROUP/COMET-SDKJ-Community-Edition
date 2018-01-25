/* --------------------------------------------------------------------------------------------------------------------
 * EngineeringModelSetup.java
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
 * representation of the set-up information of a concurrent engineering model
 * Note: The data that defines a complete engineering model is split over two containers: EngineeringModelSetup and EngineeringModel. The rationale behind this is as follows: the EngineeringModelSetup contains the minimum information needed to provide an overview of all models available on a site and the associated EngineeringModel contains the actual detailed content of the model. In E-TM-10-25 applications it is then possible that all EngineeringModelSetups reside inside the SiteDirectory database and each EngineeringModel resides in its own separate database.
 */
@Container(clazz = SiteDirectory.class, propertyName = "model")
public class EngineeringModelSetup extends AbstractEngineeringModelSetup {
    /**
     * Initializes a new instance of the <code>EngineeringModelSetup<code/> class.
     *
     * @see EngineeringModelSetup
     */
    public EngineeringModelSetup() {
        super();
    }

    /**
     * Initializes a new instance of the <code>EngineeringModelSetup<code/> class.
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
     * @see EngineeringModelSetup
     */
    public EngineeringModelSetup(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
