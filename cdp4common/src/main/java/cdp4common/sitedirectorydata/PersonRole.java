/* --------------------------------------------------------------------------------------------------------------------
 * PersonRole.java
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
 * representation of the named role of a Person (a user) that defines the Person's permissions and access rights with respect to data in a SiteDirectory
 * Note: When creating a new PersonRole, the user shall define PersonPermissions for all ClassKinds that have a <i>defaultPersonAccess</i> equal to PersonAccessRightKind.NONE. For all ClassKinds that have a <i>defaultPersonAccess</i> not equal to PersonAccessRightKind.NONE, a PersonPermission with <i>accessRight</i> equal to <i>defaultPersonAccess</i> for that ClassKind shall be defined. See PersonAccessRightKind for details.
 */
@Container(clazz = SiteDirectory.class, propertyName = "personRole")
public class PersonRole extends AbstractPersonRole {
    /**
     * Initializes a new instance of the <code>PersonRole<code/> class.
     *
     * @see PersonRole
     */
    public PersonRole() {
        super();
    }

    /**
     * Initializes a new instance of the <code>PersonRole<code/> class.
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
     * @see PersonRole
     */
    public PersonRole(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
