/* --------------------------------------------------------------------------------------------------------------------
 * Publication.java
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
 * representation of a saved state within an Iteration where all <i>computed</i> values of the ParameterValueSets of a selected set of Parameters and ParameterOverrides are published to (i.e. copied to) the <i>published</i> values
 * Note: The purpose of publishing Publications is to isolate all Participants that hold a ParameterSubscription on a particular Parameter or ParameterOverride from continuous (and potential disruptive) changes to the <i>computed</i> values of those ParameterSubscriptions. The <i>computed</i> values in the ParameterSubscriptionValueSets of ParameterSubscriptions are updated to the latest <i>actualValue</i> in the ParameterValueSets of the corresponding Parameter or ParameterOverride only at the point in time when a Publication takes place. This mechanism allows the owners, i.e. Participant(s) representing the owner DomainOfExpertise, of Parameters and ParameterOverrides to freely experiment with their parameter values without disrupting the other Participants.
 */
@Container(clazz = Iteration.class, propertyName = "publication")
public class Publication extends AbstractPublication {
    /**
     * Initializes a new instance of the <code>Publication<code/> class.
     *
     * @see Publication
     */
    public Publication() {
        super();
    }

    /**
     * Initializes a new instance of the <code>Publication<code/> class.
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
     * @see Publication
     */
    public Publication(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
