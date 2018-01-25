/* --------------------------------------------------------------------------------------------------------------------
 * NestedElement.java
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
 * representation of an explicit element of a system-of-interest in a fully expanded architectural decomposition tree for one Option
 * Note 1: The hierarchy of NestedElements can be automatically generated from the implicit composite structure defined by ElementDefinitions and contained ElementUsages, and configured for an Option.
 * Note 2: The unique path to a single, possibly deeply nested, NestedElement is defined by the <i>topElement</i> of the relevant Iteration (which is the same for all Options) and an ordered list of subtended ElementUsage references.
 * Note 3: The NestedElement is an explicit representation of the so-called "deeply nested connector" concept in OMG SysML (v1.3).
 * Example: Assume a spacecraft with a service module "sm" (an ElementUsage of ElementDefinition "SM") and two solar array wings with three panels each. The NestedElement representing panel 2 on wing 1 would be defined by the <i>topElement</i> ElementDefinition for the spacecraft (the "system-of-interest"), and a list of elementUsages referencing: the "sm" usage, the  "wing1" usage, the "panel2" usage, in that order.
 */
@Container(clazz = Option.class, propertyName = "nestedElement")
public class NestedElement extends AbstractNestedElement {
    /**
     * Initializes a new instance of the <code>NestedElement<code/> class.
     *
     * @see NestedElement
     */
    public NestedElement() {
        super();
    }

    /**
     * Initializes a new instance of the <code>NestedElement<code/> class.
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
     * @see NestedElement
     */
    public NestedElement(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
