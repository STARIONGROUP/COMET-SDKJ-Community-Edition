/*
 * EventKind.java
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

package cdp4dal.events;

import cdp4dal.CDPMessageBus;

/**
 * Enumerates the types of cdp4dal.events that can be published through the {@link CDPMessageBus}.
 */
public enum EventKind {
  /**
   * Signifies that the object is removed.
   */
  REMOVED(-1),

  /**
   * Signifies that the object is updated. Default value.
   */
  UPDATED(0),

  /**
   * Signifies that the object is added.
   */
  ADDED(1);

  private int value;

  EventKind(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }
}
