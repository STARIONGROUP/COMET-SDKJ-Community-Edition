/* --------------------------------------------------------------------------------------------------------------------
 * Category.java
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
 * representation of a user-defined category for categorization of instances that have common characteristics
 * Note 1: The Category concept provides a user-defined, runtime classification mechanism in addition to the UML classification (classifier, class, generalization, specialization) applied in the data model itself.
 * Note 2: The Category concept provides additional flexibility to assist in the definition and usage of views and filters on the instances in a population of the data model.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "definedCategory")
public class Category extends AbstractCategory {
    /**
     * Initializes a new instance of the <code>Category<code/> class.
     *
     * @see Category
     */
    public Category() {
        super();
    }

    /**
     * Initializes a new instance of the <code>Category<code/> class.
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
     * @see Category
     */
    public Category(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
