/* --------------------------------------------------------------------------------------------------------------------
 * ExternalIdentifierMap.java
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
 * representation of a mapping that relates E-TM-10-25 instance UUIDs to identifiers of corresponding items in an external tool / model
 * Note: The purpose of such a correspondence mapping is to provide the data to reduce as much as possible the loss of information when performing round trip import / export data transfer between an E-TM-10-25 compliant model and a model in the format of an external tool.
 */
@Container(clazz = Iteration.class, propertyName = "externalIdentifierMap")
public class ExternalIdentifierMap extends AbstractExternalIdentifierMap {
    /**
     * Initializes a new instance of the <code>ExternalIdentifierMap<code/> class.
     *
     * @see ExternalIdentifierMap
     */
    public ExternalIdentifierMap() {
        super();
    }

    /**
     * Initializes a new instance of the <code>ExternalIdentifierMap<code/> class.
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
     * @see ExternalIdentifierMap
     */
    public ExternalIdentifierMap(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
