/*
 * ExchangeDateTime.java
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

package cdp4jsonfiledal.json;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * Exchange file date time format that holds the local and universal time.
 */
@Getter
@Setter
public class ExchangeDateTime {

  /**
   * Initializes a new instance of the {@link ExchangeDateTime} class.
   *
   * @param dateTime The date time.
   */
  public ExchangeDateTime(ZonedDateTime dateTime) {
    this.local = dateTime.toLocalDateTime();
    this.utc = dateTime.toInstant().atOffset(ZoneOffset.UTC);
  }

  /**
   * The local date time.
   *
   * @param local The local date time.
   * @return The local date time.
   */
  private LocalDateTime local;

  /**
   * The universal date time.
   *
   * @param universal The universal date time.
   * @return The universal date time.
   */
  private OffsetDateTime utc;
}
