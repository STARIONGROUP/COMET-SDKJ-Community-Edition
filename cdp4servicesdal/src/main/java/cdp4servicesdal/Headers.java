/*
 * Headers.java
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

package cdp4servicesdal;

/**
 * Definition of header constants.
 */
class Headers {

  /**
   * The header that is used to communicate the version of the server that is being used. The
   * version is specified as a String with the following format: x.y.z.
   */
  final static String CDP_SERVER = "CDP4-Server";

  /**
   * The header that specifies the version of the CDP4Common library that is being used. The version
   * is specified as a String with the following format: x.y.z.
   */
  final static String CDP_COMMON = "CDP4-Common";

  /**
   * The header that is used to communicate the operation token that can be used on the server to
   * correlate operations executed on the server to a request.
   */
  final static String CDP_TOKEN = "CDP4-Token";

  /**
   * The header that specifies the ECSS-E-TM-10-25 protocol and it's version. the value shall have
   * the following form: application/ecss-e-tm-10-25+json; version=x.y.z.
   */
  final static String CONTENT_TYPE = "Content-Type";

  /**
   * The header that specifies that the client accepts CDP extensions.
   */
  final static String ACCEPT_CDP_VERSION = "Accept-CDP";

  /**
   * The header that specifies the version of CDP extensions that are accepted.
   */
  final static String ACCEPT_CDP_VERSION_VALUE = "1.1.0";
}
