/* --------------------------------------------------------------------------------------------------------------------
 * ParticipantAccessRightKind.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated Enumeration. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.commondata;

/**
 * enumeration datatype that defines the possible access rights for a class of objects in a ParticipantPermissionNote 1: The relevant class of objects is specified in the <i>objectClass</i> property of a ParticipantPermission.Note 2: ParticipantAccessRightKind.MODIFY implies read, create and update actions, and if delete is allowed, deleted actions as well.Note 3: ParticipantAccessRightKind.MODIFY access to an object also implies the right to modify the container collection that contains the object, even if the access right to the container collection object is limited to ParticipantAccessRightKind.READ.
 */
public enum ParticipantAccessRightKind
{
    /**
     * assertion that Participant access to the given class of objects is not applicable
     */
    NOT_APPLICABLE,

    /**
     * no access
     */
    NONE,

    /**
     * access right to a given class of objects is the same as that of the class of its container object
     */
    SAME_AS_CONTAINER,

    /**
     * access right to a given class of objects is the same as that of its superclass
     */
    SAME_AS_SUPERCLASS,

    /**
     * read-only access
     */
    READ,

    /**
     * modify access
     */
    MODIFY,

    /**
     * modify access for objects owned by a selected DomainOfExpertiseNote: A Participant in a concurrent engineering session can only represent one DomainOfExpertise at a time, but may switch between the (possible) domains assigned to the Participant.
     */
    MODIFY_IF_OWNER,
}
