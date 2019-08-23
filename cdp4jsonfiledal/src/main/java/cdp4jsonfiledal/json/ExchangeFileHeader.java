/*
 * ExchangeFileHeader.java
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

import java.time.ZonedDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * The ECSS-E-TM-10-25-AnnexC mandated exchange file header. This is to be included in the root of
 * any exchange archive.
 */
@Getter
@Setter
public class ExchangeFileHeader {

  /**
   * Initializes a new instance of the {@link ExchangeFileHeader} class.
   */
  public ExchangeFileHeader() {
    this.mediaType = "application/ecss-e-tm-10-25+json";
    this.exchangeFileFormatVersion = "1.0.0";
    this.createdOn = new ExchangeDateTime(ZonedDateTime.now());
  }

  /**
   * The media type.
   *
   * @param mediaType The media type.
   * @retrun The media type.
   */
  private String mediaType;

  /**
   * The data model version.
   *
   * @param dataModelVersion The data model version.
   * @retrun The data model version.
   */
  private String dataModelVersion;

  /**
   * The exchange file format version.
   *
   * @param exchangeFileFormatVersion The exchange file format version.
   * @retrun The exchange file format version.
   */
  private String exchangeFileFormatVersion;

  /**
   * The creator organization.
   *
   * @param creatorOrganization The creator organization.
   * @retrun The creator organization.
   */
  private OrganizationInfo creatorOrganization;

  /**
   * The copyright.
   *
   * @param copyright The copyright.
   * @retrun The copyright.
   */
  private String copyright;

  /**
   * The creator person.
   *
   * @param creatorPerson The creator person.
   * @retrun The creator person.
   */
  private ExchangeFileInitiator creatorPerson;

  /**
   * The created on.
   *
   * @param createdOn The created on.
   * @retrun The created on.
   */
  private ExchangeDateTime createdOn;

  /**
   * The last modified on.
   *
   * @param lastModifiedOn The last modified on.
   * @retrun The last modified on.
   */
  private ExchangeDateTime lastModifiedOn;

  /**
   * The remark.
   *
   * @param remark The remark.
   * @retrun The remark.
   */
  private String remark;

  /**
   * The extensions.
   *
   * @param extensions The extensions.
   * @retrun The extensions.
   */
  private String extensions;
}
