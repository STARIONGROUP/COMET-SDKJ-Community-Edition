/* --------------------------------------------------------------------------------------------------------------------
 * RuleVerificationList.java
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
 * representation of a list of RuleVerifications
 * Note: The list allows to define an ordered set of built-in and user defined rules that must be verified for the current state of an Iteration in an EngineeringModel. The contained RuleVerifications can be made active or inactive during a session and can capture the current verification result - e.g. passed or failed - and explanatory information.
 */
@Container(clazz = Iteration.class, propertyName = "ruleVerificationList")
public class RuleVerificationList extends AbstractRuleVerificationList {
    /**
     * Initializes a new instance of the <code>RuleVerificationList<code/> class.
     *
     * @see RuleVerificationList
     */
    public RuleVerificationList() {
        super();
    }

    /**
     * Initializes a new instance of the <code>RuleVerificationList<code/> class.
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
     * @see RuleVerificationList
     */
    public RuleVerificationList(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
