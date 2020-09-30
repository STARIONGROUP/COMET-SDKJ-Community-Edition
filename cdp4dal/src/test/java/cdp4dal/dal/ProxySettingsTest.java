/*
 * ProxySettingsTest.java
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.net.URI;
import org.junit.jupiter.api.Test;

class ProxySettingsTest {

  @Test
  void verify_that_null_Address_throws_exception() {
    assertThrows(NullPointerException.class, () -> new ProxySettings(null, "", ""));
  }

  @Test
  void verify_that_properties_are_set() {
    URI address = URI.create("http://proxy.cdp4.org");
    String userName = "John";
    String password = "Doe";

    ProxySettings proxySettings = new ProxySettings(address, userName, password);

    assertEquals(address, proxySettings.getAddress());
    assertEquals(userName, proxySettings.getUserName());
    assertEquals(password, proxySettings.getPassword());
  }
}
