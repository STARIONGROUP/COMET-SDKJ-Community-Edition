/*
 * PermissionService.java
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

package cdp4dal.permission;

import cdp4common.Container;
import cdp4common.commondata.ClassKind;
import cdp4common.commondata.Thing;
import cdp4dal.Session;

/**
 * The interface for services that handle permissions.
 */
public interface PermissionService {

  /**
   * Gets the {@link Session} that these permission service are responsible for.
   */
  Session getSession();

  /**
   * Returns whether a Read operation can be performed by the active user on the current {@link
   * Thing}.
   *
   * @param thing The {@link Thing} to read.
   * @return True if a Read operation can be performed, false if not.
   */
  boolean canRead(Thing thing);

  /**
   * Returns whether a Write operation can be performed by the active user on the current {@link
   * Thing}.
   *
   * @param thing The {@link Thing} to write.
   * @return True if a Write operation can be performed, false it not.
   */
  boolean canWrite(Thing thing);

  /**
   * Returns whether a Write operation can be performed by the active user on the current {@link
   * ClassKind} based on the supplied {@link Container}. The {@link ClassKind} ultimately determines
   * the access. This method is primarily used for creation of a certain {@link Thing}.
   *
   * @param classKind The {@link ClassKind} that ultimately determines the permissions.
   * @param containerThing The {@link Thing} to write to.
   * @return True if Write operation can be performed.
   */
  boolean canWrite(ClassKind classKind, Thing containerThing);
}
