/* --------------------------------------------------------------------------------------------------------------------
 * DomainOfExpertiseGroup.java
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
 * representation of a group of domains of expertise (DomainOfExpertise) defined for this SiteDirectory
 * Note: The purpose of DomainOfExpertiseGroup is to organize related domains of expertise in convenient ways in order to assist setting up and managing domains for EngineeringModelSetups as well as mapping domains when datasets are exchanged between partnering concurrent engineering organizations.
 */
@Container(clazz = SiteDirectory.class, propertyName = "domainGroup")
public class DomainOfExpertiseGroup extends AbstractDomainOfExpertiseGroup {
    /**
     * Initializes a new instance of the <code>DomainOfExpertiseGroup<code/> class.
     *
     * @see DomainOfExpertiseGroup
     */
    public DomainOfExpertiseGroup() {
        super();
    }

    /**
     * Initializes a new instance of the <code>DomainOfExpertiseGroup<code/> class.
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
     * @see DomainOfExpertiseGroup
     */
    public DomainOfExpertiseGroup(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
