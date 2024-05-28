/*
 * OrganizationInfo.java
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

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Holds the organization info that is included in an exchange header file.
 */
@Getter
@Setter
@AllArgsConstructor
public class OrganizationInfo {

  /**
   * An optional unique identifier of the organization.
   *
   * @param iid A unique identifier of the organization.
   * @return A unique identifier of the organization.
   */
  private UUID iid;

  /**
   * The name of the organization.
   *
   * @param name The name of the organization.
   * @return The name of the organization.
   */
  private String name;

  /**
   * The optional abbreviated name of a unit inside of the organization.
   *
   * @param unit The abbreviated name of a unit inside of the organization.
   * @return The abbreviated name of a unit inside of the organization.
   */
  private String unit;

  /**
   * The optional geographic location of the organization.
   *
   * @param site The geographic location of the organization.
   * @retrun The geographic location of the organization.
   */
  private String site;
}
