/*
 * DalExportAttribute.java
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

package cdp4dal.composition;

import cdp4dal.dal.Dal;
import lombok.Getter;

/**
 * The purpose of the {@link DalExportAttribute} is to decorate {@link Dal} implementations
 */
@Getter
public class DalExportAttribute implements DalMetaData {

  /**
   * Initializes a new instance of the {@link DalExportAttribute} class.
   *
   * @param name The human readable name of the {@link Dal} implementation that is being decorated
   * @param description The human readable description of the {@link Dal} implementation that is
   * being decorated
   * @param modelVersion The max version of the CDP Model that is supported by the {@link Dal}
   * implementation that is being decorated
   * @param type The type of {@link Dal} based on {@link DalType} this export defines.
   */
  public DalExportAttribute(String name, String description, String modelVersion, DalType type) {
    this.name = name;
    this.description = description;
    this.cdpVersion = modelVersion;
    this.dalType = type;
  }

  /**
   * Human readable name of the exported {@link Dal}
   */
  private String name;

  /**
   * Human readable description of the exported {@link Dal}
   */
  private String description;

  /**
   * The maximum CDP Model version of the exported {@link Dal}
   */
  private String cdpVersion;

  /**
   * The type of {@link Dal} this export defines.
   */
  private DalType dalType;
}
