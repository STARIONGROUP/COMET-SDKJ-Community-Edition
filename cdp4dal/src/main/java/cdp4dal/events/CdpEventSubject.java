/*
 * CdpEventSubject.java
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

package cdp4dal.events;

import lombok.Getter;

/**
 * Representation of a subject-observable pair.
 **/
@Getter
public class CdpEventSubject {

  /**
   * Initializes a new instance of the {@link CdpEventSubject} class.
   *
   * @param subject The subject of the event.
   * @param observable The observable that results from the event.
   */
  public CdpEventSubject(Object subject, Object observable) {
    this.subject = subject;
    this.observable = observable;
  }

  /**
   * The subject.
   */
  private final Object subject;

  /**
   * The observable.
   */
  private final Object observable;
}
