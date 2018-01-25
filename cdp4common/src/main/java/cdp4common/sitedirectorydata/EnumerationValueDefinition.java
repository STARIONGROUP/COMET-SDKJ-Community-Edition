/* --------------------------------------------------------------------------------------------------------------------
 * EnumerationValueDefinition.java
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
 * representation of one enumeration value of an EnumerationParameterType
 * Note 1: The <i>shortName</i> defines the enumeration literal value for the EnumerationParameterType. These are the values that are shown in an implementation of such an EnumerationParameterType in e.g. a drop down list in a graphical user interface.
 * Note 2: The <i>name</i> can be used as a more extensive description of the meaning of the enumeration value, and could be shown e.g. as a tooltip in a user interface. If needed more detailed information can be provided in the associated <i>definition</i>, <i>hyperLink</i> and <i>alias</i>, but this is optional.
 */
@Container(clazz = EnumerationParameterType.class, propertyName = "valueDefinition")
public class EnumerationValueDefinition extends AbstractEnumerationValueDefinition {
    /**
     * Initializes a new instance of the <code>EnumerationValueDefinition<code/> class.
     *
     * @see EnumerationValueDefinition
     */
    public EnumerationValueDefinition() {
        super();
    }

    /**
     * Initializes a new instance of the <code>EnumerationValueDefinition<code/> class.
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
     * @see EnumerationValueDefinition
     */
    public EnumerationValueDefinition(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
