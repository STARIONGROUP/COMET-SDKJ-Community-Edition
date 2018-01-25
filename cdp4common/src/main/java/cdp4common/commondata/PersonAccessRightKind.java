/* --------------------------------------------------------------------------------------------------------------------
 * PersonAccessRightKind.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated Enumeration. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.commondata;

/**
 * enumeration datatype that defines the possible access rights for a class of objects in a PersonPermissionNote 1: The relevant class of objects is specified in the <i>objectClass</i> property of a PersonPermission.Note 2: PersonAccessRightKind.MODIFY implies read, create and update actions, and if delete is allowed, deleted actions as well.Note 3: PersonAccessRightKind.MODIFY access to an object also implies the right to modify the container collection that contains the object, even if the access right to the container collection object is limited to PersonAccessRightKind.READ.
 */
public enum PersonAccessRightKind
{
    /**
     * assertion that Person access to the given class of objects is not applicable
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
     * read-only access to information contained in EngineeringModelSetups where the authenticated Person is a ParticipantNote: If an authenticated Person has PersonAccessRightKind.MODIFY_OWN_PERSON to the ClassKind.Person, then READ_IF_PARTICIPANT also implies READ access on any Person that is associated with any Participant in any of the EngineeringModelSetups in which the authenticated Person is a Participant. In other words, READ access to the union of Persons referenced by Participants in the union of EngineeringModelSetups for which the authenticated Person has at least READ_IF_PARTICIPANT access. Basically this means that a Participant has access to the information describing the other Participants and Persons in a team that he or she is a member of.
     */
    R_E_A_D__I_F__P_A_R_T_I_C_I_P_A_N_T,

    /**
     * modify access to information contained in EngineeringModelSetups where the authenticated Person is a Participant
     */
    M_O_D_I_F_Y__I_F__P_A_R_T_I_C_I_P_A_N_T,

    /**
     * modify access to the Person data of the actual authenticated person (i.e. user) in a session
     */
    M_O_D_I_F_Y__O_W_N__P_E_R_S_O_N,
}
