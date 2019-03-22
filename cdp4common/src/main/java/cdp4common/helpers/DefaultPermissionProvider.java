/* --------------------------------------------------------------------------------------------------------------------
 * DefaultPermissionProvider.java
 * Copyright (c) 2018 RHEA System S.A.
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.helpers;

import cdp4common.commondata.ClassKind;
import cdp4common.commondata.ParticipantAccessRightKind;
import cdp4common.commondata.PersonAccessRightKind;

import java.util.Map;
import java.util.stream.Stream;

/**
 * Default permission Utils interface.
 */
public interface DefaultPermissionProvider {
    /**
     * Return the default {@link ParticipantAccessRightKind} for the supplied type.
     *
     * @param typeName The type name for which the {@link ParticipantAccessRightKind} is to be returned.
     * @return The default {@link ParticipantAccessRightKind}.
     * @throws IllegalArgumentException If type not found, this should never happen
     */
    ParticipantAccessRightKind getDefaultParticipantPermission(String typeName);

    /**
     * Return the default {@link ParticipantAccessRightKind} for the supplied {@link ClassKind}.
     *
     * @param classKind The {@link ClassKind} for which the {@link ParticipantAccessRightKind} is to be returned.
     * @return The default {@link ParticipantAccessRightKind}.
     * @throws IllegalArgumentException If type not found, this should never happen
     */
    ParticipantAccessRightKind getDefaultParticipantPermission(ClassKind classKind);

    /**
     * Return the default {@link PersonAccessRightKind} for the supplied type.
     *
     * @param typeName The type name for which the {@link PersonAccessRightKind} is to be returned.
     * @return The default {@link PersonAccessRightKind}.
     * @throws IllegalArgumentException If type not found, this should never happen
     */
    PersonAccessRightKind getDefaultPersonPermission(String typeName);

    /**
     * Return the default {@link PersonAccessRightKind} for the supplied {@link ClassKind}.
     *
     * @param classKind The {@link ClassKind} for which the {@link PersonAccessRightKind} is to be returned.
     * @return The default {@link PersonAccessRightKind}.
     * @throws IllegalArgumentException If type not found, this should never happen
     */
    PersonAccessRightKind getDefaultPersonPermission(ClassKind classKind);

    /**
     * Get a stream of {@link Map.Entry} with a class type and the default {@link ParticipantAccessRightKind} for it.
     *
     * @return {@link Stream} of default participant permissions.
     */
    public Stream<Map.Entry<String, ParticipantAccessRightKind>> getDefaultTypeNameParticipantPermissions();

    /**
     * Get a stream of {@link Map.Entry} with a {@link ClassKind} and the default {@link ParticipantAccessRightKind} for it.
     *
     * @return {@link Stream} of default participant permissions.
     */
    public Stream<Map.Entry<ClassKind, ParticipantAccessRightKind>> getDefaultClassKindParticipantPermissions();

    /**
     * Get a stream of {@link Map.Entry} with a class type and the default {@link PersonAccessRightKind} for it.
     *
     * @return {@link Stream} of default person permissions.
     */
    public Stream<Map.Entry<String, PersonAccessRightKind>> getDefaultTypeNamePersonPermissions();

    /**
     * Get a stream of {@link Map.Entry} with a {@link ClassKind} and the default {@link PersonAccessRightKind} for it.
     *
     * @return {@link Stream} of default person permissions.
     */
    public Stream<Map.Entry<ClassKind, PersonAccessRightKind>> getDefaultClassKindPersonPermissions();
}
