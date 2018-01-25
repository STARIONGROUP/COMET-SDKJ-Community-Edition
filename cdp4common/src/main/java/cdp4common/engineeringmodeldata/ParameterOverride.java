/* --------------------------------------------------------------------------------------------------------------------
 * ParameterOverride.java
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
 * representation of a parameter at ElementUsage level that allows to override the values of a Parameter defined at ElementDefinition level
 * Note 1: The <i>parameter</i> that is overridden must be a Parameter of the ElementDefinition that is the <i>elementDefinition</i> of the containing ElementUsage.
 * Note 2: The owner DomainOfExpertise of this ParameterOverride is the same as the owner of the elementDefinition.
 */
@Container(clazz = ElementUsage.class, propertyName = "parameterOverride")
public class ParameterOverride extends AbstractParameterOverride {
    /**
     * Initializes a new instance of the <code>ParameterOverride<code/> class.
     *
     * @see ParameterOverride
     */
    public ParameterOverride() {
        super();
    }

    /**
     * Initializes a new instance of the <code>ParameterOverride<code/> class.
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
     * @see ParameterOverride
     */
    public ParameterOverride(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
