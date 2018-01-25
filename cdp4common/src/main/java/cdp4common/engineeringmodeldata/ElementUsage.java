/* --------------------------------------------------------------------------------------------------------------------
 * ElementUsage.java
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
 * named usage of an ElementDefinition in the context of a next higher level ElementDefinition that contains this ElementUsage
 * Note 1: An ElementUsage has one and only one ElementDefinition as its <i>containingElement</i>.
 * Note 2: When an ElementDefinition is made a member of a Category through its <i>category</i> property, then also any ElementUsage typed by such an ElementDefinition is implied to be a member of the same Category.
 * Note 3: A ParameterType "NumberOf" may be defined in an associated ReferenceDataLibrary. Subsequently a "NumberOf" Parameter or ParameterOverride may be added to an ElementUsage as a short-cut to define a number of containedElements that are not named individually. Setting "NumberOf" to a value greater than one is typically only done in early conceptual design. In a later detailed design phase each usage would normally be instantiated individually, so that where needed different usage level Parameters can have different values.
 * Note 4: Both the <i>owner</i> DomainOfExpertise of the <i>containingElement</i> and of the <i>elementDefinition</i> are owner(s) of this ElementUsage, i.e. the union of self.containingElement.owner and self.elementDefinition.owner.
 */
@Container(clazz = ElementDefinition.class, propertyName = "containedElement")
public class ElementUsage extends AbstractElementUsage {
    /**
     * Initializes a new instance of the <code>ElementUsage<code/> class.
     *
     * @see ElementUsage
     */
    public ElementUsage() {
        super();
    }

    /**
     * Initializes a new instance of the <code>ElementUsage<code/> class.
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
     * @see ElementUsage
     */
    public ElementUsage(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
