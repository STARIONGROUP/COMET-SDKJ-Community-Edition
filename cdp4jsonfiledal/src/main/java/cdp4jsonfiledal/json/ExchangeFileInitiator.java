/*
 * ExchangeFileInitiator.java
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

package cdp4jsonfiledal.json;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * The initiator (person) of an exchange file export. This is included in the {@link
 * ExchangeFileHeader}.
 */
@Getter
@Setter
@AllArgsConstructor
public class ExchangeFileInitiator {

  /**
   * An optional unique identifier of the person who initiated the export.
   *
   * @param iid A unique identifier of the person who initiated the export.
   * @return A unique identifier of the person who initiated the export.
   */
  private UUID iid;

  /**
   * The given name of the person who initiated the export.
   *
   * @param givenName The given name of the person who initiated the export.
   * @return The given name of the person who initiated the export.
   */
  private String givenName;

  /**
   * The surname of the person who initiated the export.
   *
   * @param surname The surname of the person who initiated the export.
   * @return The surname of the person who initiated the export.
   */
  private String surname;

  /**
   * The optional email address of the person who initiated the export.
   *
   * @param email The optional email address of the person who initiated the export.
   * @return The optional email address of the person who initiated the export.
   */
  private String email;
}
