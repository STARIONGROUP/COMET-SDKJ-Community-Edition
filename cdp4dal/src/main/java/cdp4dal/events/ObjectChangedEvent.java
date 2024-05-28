/*
 * ObjectChangedEvent.java
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

import cdp4common.commondata.Thing;
import lombok.Getter;
import lombok.Setter;

/**
 * The purpose of the {@link ObjectChangedEvent} is to notify an observer that the referenced {@link
 * Thing} has changed in some way and what that change is.
 */
@Getter
@Setter
public class ObjectChangedEvent {

  /**
   * Initializes a new instance of the {@link ObjectChangedEvent} class.
   *
   * @param thing The payload {@link Thing}.
   * @param eventKind The event kind.
   */
  public ObjectChangedEvent(Thing thing, EventKind eventKind) {
    this.changedThing = thing;
    this.eventKind = eventKind;
  }

  /**
   * Initializes a new instance of the {@link ObjectChangedEvent} class.
   *
   * @param thing The payload {@link Thing}
   */
  public ObjectChangedEvent(Thing thing) {
    this.changedThing = thing;
    this.eventKind = EventKind.UPDATED;
  }

  /**
   * Gets or sets the changed {@link Thing}
   */
  private Thing changedThing;

  /**
   * Gets or sets the {@link EventKind} to be transported.
   */
  private EventKind eventKind;
}
