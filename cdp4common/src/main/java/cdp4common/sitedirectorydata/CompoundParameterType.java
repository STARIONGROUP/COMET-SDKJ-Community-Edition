/* --------------------------------------------------------------------------------------------------------------------
 * CompoundParameterType.java
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
 * representation of a non-scalar compound parameter type that is composed of one or more other (component) ParameterTypes
 * Note 1: The purpose of this parameter type is to allow manipulation of a set of related (usually scalar) parameters as one compound parameter for those cases where all component parameter values need to be considered together. The CompoundParameterType allows modelling parameter types similar to structured datatypes in programming languages and to vectors, matrices and tensors in mathematics and physics.
 * Note 2: The default owner DomainOfExpertises of any associated ParameterTypeComponents are ignored, only the defaultOwner of this CompoundParameterType is taken into account.
 * Example 1: An "event_occurrence" parameter type can be defined by a CompoundParameterType with a "type" and a "timestamp" component. The "type" component would be an EnumerationParameterType that enumerates a number of known event names and the "timestamp" component would be a DateTimeParameterType.
 * Example 2: A 3D Cartesian coordinate position can be defined by a CompoundParameterType (or actually an ArrayParameterType) with "x", "y" and "z" components that would each be QuantityKinds with a quantityKind "position" and a scale "mm" (for "millimetre").
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
public class CompoundParameterType extends AbstractCompoundParameterType {
    /**
     * Initializes a new instance of the <code>CompoundParameterType<code/> class.
     *
     * @see CompoundParameterType
     */
    public CompoundParameterType() {
        super();
    }

    /**
     * Initializes a new instance of the <code>CompoundParameterType<code/> class.
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
     * @see CompoundParameterType
     */
    public CompoundParameterType(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
