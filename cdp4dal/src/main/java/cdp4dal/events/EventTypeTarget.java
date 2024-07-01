/*
 * EventTypeTarget.java
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

import lombok.Getter;

/**
 * Qualified message type that can be published and subscribed to through this message hub.
 */
@Getter
public class EventTypeTarget {

  /**
   * The message type.
   */
  private final Class eventType;

  /**
   * The qualifier.
   */
  private final Object target;

  /**
   * Initializes a new instance of the {@link EventTypeTarget}.
   *
   * @param eventType The event type.
   * @param target Optional qualifier that can be used to make the message type more specific.
   */
  public EventTypeTarget(Class eventType, Object target) {
    this.eventType = eventType;
    this.target = target;
  }

  /**
   * Equality operator.
   *
   * @param obj The {@link Object} to compare to.
   * @return True if the objects fulfil certain criteria.
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    return (obj instanceof EventTypeTarget) && this.equals((EventTypeTarget) obj);
  }

  /**
   * Equality operator overload.
   *
   * @param other The other object cast to {@link EventTypeTarget}.
   * @return The boolean indicating equality.
   */
  public boolean equals(EventTypeTarget other) {
    if (other == null) {
      return false;
    }

    return this.getEventType().equals(other.getEventType()) && (
        (this.getTarget() == null && other.getTarget() == null) || (this.getTarget() != null
            && other.getTarget() != null && this.getTarget()
            .equals(other.getTarget())));
  }

  /**
   * Gets the hash code of this instance of {@link EventTypeTarget}
   *
   * @return The {@link int} indicating the HashCode.
   */
  @Override
  public int hashCode() {
    return ((this.getEventType() != null ? this.getEventType().hashCode() : 0) * 397) ^ (
        this.getTarget() != null ? this.getTarget().hashCode() : 0);
  }
}

