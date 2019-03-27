/* --------------------------------------------------------------------------------------------------------------------
 * PersonAccessRightKind.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
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
     * read-only access to information contained in EngineeringModelSetups where the authenticated Person is a ParticipantNote: If an authenticated Person has PersonAccessRightKind.MODIFY_OWN_PERSON to the ClassKind.Person, then READ_IF_PARTICIPANT also implies READ access on any Person that is associated with any Participant in any of the EngineeringModelSetups in which the authenticated Person is a Participant. In other words, READ access to the union of Persons referenced by Participants in the union of EngineeringModelSetups for which the authenticated Person has at least READ_IF_PARTICIPANT access. Basically this means that a Participant has access to the information describing the other Participants and Persons in a team that he or she is a member of.
     */
    READ_IF_PARTICIPANT,

    /**
     * modify access to information contained in EngineeringModelSetups where the authenticated Person is a Participant
     */
    MODIFY_IF_PARTICIPANT,

    /**
     * modify access to the Person data of the actual authenticated person (i.e. user) in a session
     */
    MODIFY_OWN_PERSON,
}
