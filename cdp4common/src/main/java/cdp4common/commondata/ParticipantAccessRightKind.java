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
    N_O_T__A_P_P_L_I_C_A_B_L_E,

    /**
     * no access
     */
    N_O_N_E,

    /**
     * access right to a given class of objects is the same as that of the class of its container object
     */
    S_A_M_E__A_S__C_O_N_T_A_I_N_E_R,

    /**
     * access right to a given class of objects is the same as that of its superclass
     */
    S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S,

    /**
     * read-only access
     */
    R_E_A_D,

    /**
     * modify access
     */
    M_O_D_I_F_Y,

    /**
     * modify access for objects owned by a selected DomainOfExpertiseNote: A Participant in a concurrent engineering session can only represent one DomainOfExpertise at a time, but may switch between the (possible) domains assigned to the Participant.
     */
    M_O_D_I_F_Y__I_F__O_W_N_E_R,
}
