/* --------------------------------------------------------------------------------------------------------------------
 * ParticipantRole.java
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
 * representation of the named role of a Participant that defines the Participant's permissions and access rights with respect to data in an EngineeringModel
 * Note: When creating a new ParticipantRole, the user shall define ParticipantPermissions for all ClassKinds that have a <i>defaultPersonAccess</i> equal to ParticipantAccessRightKind.NONE. For all ClassKinds that have a <i>defaultParticipantAccess</i> not equal to ParticipantAccessRightKind.NONE, a ParticipantPermission with <i>accessRight</i> equal to <i>defaultParticipantAccess</i> for that ClassKind shall be defined. See ParticipantAccessRightKind for details.
 */
@Container(clazz = SiteDirectory.class, propertyName = "participantRole")
public class ParticipantRole extends AbstractParticipantRole {
    /**
     * Initializes a new instance of the <code>ParticipantRole<code/> class.
     *
     * @see ParticipantRole
     */
    public ParticipantRole() {
        super();
    }

    /**
     * Initializes a new instance of the <code>ParticipantRole<code/> class.
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
     * @see ParticipantRole
     */
    public ParticipantRole(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
