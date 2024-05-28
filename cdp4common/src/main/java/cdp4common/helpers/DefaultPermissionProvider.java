/*
 * DefaultPermissionProvider.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
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
