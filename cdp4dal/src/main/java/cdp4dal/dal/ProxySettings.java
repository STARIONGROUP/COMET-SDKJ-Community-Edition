/*
 * ProxySettings.java
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
package cdp4dal.dal;

import cdp4dal.composition.DalType;
import java.net.URI;
import lombok.Getter;

/**
 * The purpose of the {@link ProxySettings} is to encapsulate the proxy server settings used when
 * connecting to a {@link DalType#WEB} data-source
 */
@Getter
public class ProxySettings {

  /**
   * Initializes a new instance of the {@link ProxySettings} class.
   *
   * @param address The address of the Web-Proxy server.
   * @param userName the userName used to authenticate on the Web-Proxy server.
   * @param password the password used to authenticate on the Web-Proxy server.
   *
   * if the {@code userName} is null, then no authentication will be used on the Web-Proxy server.
   */
  public ProxySettings(URI address, String userName, String password) {
    if (address == null) {
      throw new NullPointerException("The Web-Proxy address may not be null");
    }

    this.address = address;
    this.userName = userName;
    this.password = password;
  }

  /**
   * The {@link URI} of the Web-Proxy server
   */
  private URI address;

  /**
   * The userName used to authenticate when connection to the Web-Proxy server
   *
   *
   * This may be null if no Web-Proxy server authentication is required
   */
  private String userName;

  /**
   * Gets the Password used to authenticate when connection to the Web-Proxy server
   *
   *
   * This may be null if no Web-Proxy server authentication is required
   */
  private String password;
}
