/*
 * Credentials.java
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

import com.google.common.base.Strings;
import java.net.URI;
import lombok.Getter;

/**
 * The purpose of the {@link Credentials} class is to store the username, password and {@link
 * java.net.URI} of a data-store that an implementation of {@link Dal} will connect to.
 */
@Getter
public class Credentials {

  /**
   * The property where the password is stored
   */
  private final String password;

  /**
   * Initializes a new instance of the {@link Credentials} class.
   *
   * @param userName The username that is used to connect to a data-store
   * @param password the password that is sued to connect to a data-store
   * @param uri the {@link URI} of the data-store
   */
  public Credentials(String userName, String password, java.net.URI uri,
      ProxySettings proxySettings) {
    if (Strings.isNullOrEmpty(userName)) {
      throw new NullPointerException("The username may not be empty or null");
    }

    if (Strings.isNullOrEmpty(password)) {
      throw new NullPointerException("The password may not be empty or null");
    }

    if (uri == null) {
      throw new NullPointerException("The uri may not be null");
    }

    this.userName = userName;
    this.password = password;
    this.uri = uri;
    this.proxySettings = proxySettings;
  }

  /**
   * The username that is used to connect to a data-store
   */
  private String userName;

  /**
   * The {@link URI} of the data-store
   */
  private URI uri;

  /**
   * The settings used to connect to a Proxy server
   *
   *
   * The {@link ProxySettings} may be null, no proxy will be used in this case.
   */
  private ProxySettings proxySettings;
}
