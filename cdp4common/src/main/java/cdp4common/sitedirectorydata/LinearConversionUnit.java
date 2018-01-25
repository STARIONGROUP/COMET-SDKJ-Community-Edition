/* --------------------------------------------------------------------------------------------------------------------
 * LinearConversionUnit.java
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
 * specialization of ConversionBasedUnit that represents a measurement unit that is defined with respect to another reference measurement unit through a linear conversion relation with a conversion factor
 * Note: The unit conversion relationship is defined by the following equation:
 * where: value<sub>RU</sub> is the quantity value expressed in the <i>referenceUnit</i>, and, value<sub>CU</sub> is the quantity value expressed in the LinearConversionUnit.
 * For example, in the definition of the LinearConversionUnit for "inch" with respect to the referenceUnit "metre", the <i>conversionFactor</i> would be 254/10000, because 0.0254 metre = 1 inch.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
public class LinearConversionUnit extends AbstractLinearConversionUnit {
    /**
     * Initializes a new instance of the <code>LinearConversionUnit<code/> class.
     *
     * @see LinearConversionUnit
     */
    public LinearConversionUnit() {
        super();
    }

    /**
     * Initializes a new instance of the <code>LinearConversionUnit<code/> class.
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
     * @see LinearConversionUnit
     */
    public LinearConversionUnit(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
