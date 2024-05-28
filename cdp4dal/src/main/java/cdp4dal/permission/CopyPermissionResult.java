/*
 * CopyPermissionResult.java
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

package cdp4dal.permission;

import cdp4common.commondata.Thing;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import lombok.AccessLevel;
import lombok.Setter;

/**
 * A structure that contains information about the possibilities to copy a {@link Thing}.
 */
public class CopyPermissionResult {

  /**
   * A field fpopulated by the {@link CopyPermissionHelper} class.
   */
  @Setter(AccessLevel.PACKAGE)
  private List<Thing> copyableThings;

  /**
   * A field populated by the {@link CopyPermissionHelper} class.
   */
  @Setter(AccessLevel.PACKAGE)
  private Map<Thing, String> errorMap;

  /**
   * Gets the {@link Thing}s that may be copied as a {@link List}.
   */
  List<Thing> getCopyableThingsList() {
    return this.copyableThings;
  }

  /**
   * Gets the error list for the {@link Thing}s that may not be copied.
   */
  Map<Thing, String> getErrorMap() {
    return this.errorMap;
  }

  /**
   * Gets the {@link Thing}s that may be copied as a {@link ImmutableList}.
   */
  public ImmutableList<Thing> getCopyableThings() {
    return ImmutableList.copyOf(this.copyableThings);
  }

  /**
   * Gets the error list for the {@link Thing}s that may not be copied.
   */
  public ImmutableMap<Thing, String> getErrors() {
    return ImmutableMap.copyOf(this.errorMap);
  }
}
