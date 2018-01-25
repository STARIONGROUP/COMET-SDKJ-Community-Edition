/* --------------------------------------------------------------------------------------------------------------------
 * ElementDefinition.java
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
 * definition of an element in a design solution for a system-of-interest
 * Note 1: An element is defined once (as an ElementDefinition) and then can be used (as an ElementUsage) any number of times in a design solution for the system-of-interest.
 * Note 2: The ElementDefinition and ElementUsage structure together form the representation of the hierarchical design composition / decomposition of the system-of-interest. Through the combination of the <i>containedElement</i> property and the <i>referencedElement</i> property of ElementUsage a hybrid product tree can be represented in which both logical and concrete (aka physical) architecture are combined.
 * Note 3: Because of the containment relationship between ElementDefinition and ElementUsage, there is special behaviour with respect to Category membership. If an ElementDefinition is defined to be a member of a Category (through its category property), then also any ElementUsage that is typed by this ElementDefinition is a member of that Category.
 * Example: The design of gyroscope "GS-123" is defined in an ElementDefinition and then 4 gyroscopes of this type are used as part of the attitude and orbit control equipment through 4 ElementUsages with names "x-gyro", "y-gyro", "z-gyro" and "xyz-gyro". All 4 usages are said to be of <i>type</i> "GS-123".
 * Note 3: ElementDefinition is the equivalent of the concept of <i>Block</i> in OMG SysML. ElementUsage is the equivalent of the concept of <i>Part</i> in OMG SysML.
 */
@Container(clazz = Iteration.class, propertyName = "element")
public class ElementDefinition extends AbstractElementDefinition {
    /**
     * Initializes a new instance of the <code>ElementDefinition<code/> class.
     *
     * @see ElementDefinition
     */
    public ElementDefinition() {
        super();
    }

    /**
     * Initializes a new instance of the <code>ElementDefinition<code/> class.
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
     * @see ElementDefinition
     */
    public ElementDefinition(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
