/* --------------------------------------------------------------------------------------------------------------------
 * Parameter.java
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
 * representation of a parameter that defines a characteristic or property of an ElementDefinition
 * Note 1: The concurrent engineering process is centered around a multi-disciplinary parametric definition of the system of interest. Parameters (with values) assigned to ElementDefinitions, ElementUsages and possibly NestedElements are the essential mechanism by which each DomainOfExpertise characterises, quantifies, communicates and shares their part of a design solution with all other domains of expertise (DomainOfExpertise).
 * Note 2: The associated ParameterType (through the parameterType property) provides name, shortName, and optionally alias, definition and hyperLink for this Parameter.
 */
@Container(clazz = ElementDefinition.class, propertyName = "parameter")
public class Parameter extends AbstractParameter {
    /**
     * Initializes a new instance of the <code>Parameter<code/> class.
     *
     * @see Parameter
     */
    public Parameter() {
        super();
    }

    /**
     * Initializes a new instance of the <code>Parameter<code/> class.
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
     * @see Parameter
     */
    public Parameter(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
