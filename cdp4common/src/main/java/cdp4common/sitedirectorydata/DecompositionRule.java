/* --------------------------------------------------------------------------------------------------------------------
 * DecompositionRule.java
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
 * representation of a validation rule for system-of-interest decomposition through <i>containingElement</i> ElementDefinitions and <i>containedElement</i> ElementUsages
 * Note: A DecompositionRule specifies for ElementDefinitions that are a member of the <i>containingCategory</i> what are the valid Categories (specified by <i>containedCategory</i>) for the <i>type</i> of contained ElementUsages. A <i>subCategory</i> of a valid Category is also valid.
 * Example: A rule where the <i>containingCategory</i> is Category "Equipment" and the <i>containedCategory</i> is Category "Subequipment".
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "rule")
public class DecompositionRule extends AbstractDecompositionRule {
    /**
     * Initializes a new instance of the <code>DecompositionRule<code/> class.
     *
     * @see DecompositionRule
     */
    public DecompositionRule() {
        super();
    }

    /**
     * Initializes a new instance of the <code>DecompositionRule<code/> class.
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
     * @see DecompositionRule
     */
    public DecompositionRule(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
