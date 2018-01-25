/* --------------------------------------------------------------------------------------------------------------------
 * BuiltInRuleVerification.java
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
 * representation of the verification of a built-in data model rule
 * Note: The name of a BuiltInRuleVerification shall be set to be the same as the name of the associated constraint in the E-TM-10-25 data model, e.g. with the help of a code generator.
 */
@Container(clazz = RuleVerificationList.class, propertyName = "ruleVerification")
public class BuiltInRuleVerification extends AbstractBuiltInRuleVerification {
    /**
     * Initializes a new instance of the <code>BuiltInRuleVerification<code/> class.
     *
     * @see BuiltInRuleVerification
     */
    public BuiltInRuleVerification() {
        super();
    }

    /**
     * Initializes a new instance of the <code>BuiltInRuleVerification<code/> class.
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
     * @see BuiltInRuleVerification
     */
    public BuiltInRuleVerification(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
