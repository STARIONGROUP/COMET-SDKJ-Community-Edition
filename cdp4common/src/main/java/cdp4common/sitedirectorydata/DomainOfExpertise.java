/* --------------------------------------------------------------------------------------------------------------------
 * DomainOfExpertise.java
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
 * representation of a coherent set of experience, skills, methods, standards and tools in a specific field of knowledge relevant to an engineering process
 * Note 1: The definition of domain in the Concise English Oxford Dictionary is "sphere of activity or knowledge". This includes the notion of <i>discipline</i>. A DomainOfExpertise designates one of the fields of expertise that are needed in a particular modelling activity.
 * Note 2: In space system life cycle activities, typically for each required domain of expertise at least one person in the development or operation team is assigned responsibility for the domain related aspects. However, one person may be responsible for more than one domain / discipline.
 */
@Container(clazz = SiteDirectory.class, propertyName = "domain")
public class DomainOfExpertise extends AbstractDomainOfExpertise {
    /**
     * Initializes a new instance of the <code>DomainOfExpertise<code/> class.
     *
     * @see DomainOfExpertise
     */
    public DomainOfExpertise() {
        super();
    }

    /**
     * Initializes a new instance of the <code>DomainOfExpertise<code/> class.
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
     * @see DomainOfExpertise
     */
    public DomainOfExpertise(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
