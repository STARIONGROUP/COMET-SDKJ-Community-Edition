/*
 * StaticDefaultPermissionProvider.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
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
   * @param typeName The type name for which the {@link ParticipantAccessRightKind} is to be
   * returned.
   * @return The default {@link ParticipantAccessRightKind}.
   * @throws IllegalArgumentException If type not found, this should never happen
   */
  public static ParticipantAccessRightKind getDefaultParticipantPermission(String typeName) {
    return provider.getDefaultParticipantPermission(Utils.getOnlyClassName(typeName));
  }

  /**
   * Return the default {@link PersonAccessRightKind} for the supplied type.
   *
   * @param typeName The type name for which the {@link PersonAccessRightKind} is to be returned.
   * @return The default {@link PersonAccessRightKind}.
   * @throws IllegalArgumentException If type not found, this should never happen
   */
  public static PersonAccessRightKind getDefaultPersonPermission(String typeName) {
    return provider.getDefaultPersonPermission(Utils.getOnlyClassName(typeName));
  }
}
