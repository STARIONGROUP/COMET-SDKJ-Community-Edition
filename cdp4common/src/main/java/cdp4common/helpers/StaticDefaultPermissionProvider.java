/*
 * StaticDefaultPermissionProvider.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.helpers;

import cdp4common.commondata.ParticipantAccessRightKind;
import cdp4common.commondata.PersonAccessRightKind;
import cdp4common.commondata.Thing;

/**
 * A static utility class to retrieve the default permission for a {@link Thing}
 */
public class StaticDefaultPermissionProvider {
    /**
     * The {@link DefaultPermissionProvider}
     */
    private static DefaultPermissionProvider provider = new DefaultPermissionProviderImpl();

    /**
     * Return the default {@link ParticipantAccessRightKind} for the supplied type.
     *
     * @param typeName The type name for which the {@link ParticipantAccessRightKind} is to be returned.
     * @return The default {@link ParticipantAccessRightKind}.
     * @throws IllegalArgumentException If type not found, this should never happen
     */
    public static ParticipantAccessRightKind getDefaultParticipantPermission(String typeName) {
        return provider.getDefaultParticipantPermission(typeName);
    }

    /**
     * Return the default {@link PersonAccessRightKind} for the supplied type.
     *
     * @param typeName The type name for which the {@link PersonAccessRightKind} is to be returned.
     * @return The default {@link PersonAccessRightKind}.
     * @throws IllegalArgumentException If type not found, this should never happen
     */
    public static PersonAccessRightKind GetDefaultPersonPermission(String typeName) {
        return provider.getDefaultPersonPermission(typeName);
    }
}
