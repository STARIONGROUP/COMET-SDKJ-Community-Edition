/*
 * VersionTest.java
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

package cdp4common;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VersionTest {

  @Test
  void comparesVersionsCorrectly() {
    var version_1_0_0 = new Version("1.0.0");
    var version_1_1_0 = new Version("1.1.0");
    var version_1_1_1 = new Version("1.1.1");
    var version_2_0_0 = new Version("2.0.0");

    assertEquals(0, version_1_0_0.compareTo(version_1_0_0));
    assertEquals(1, version_1_1_0.compareTo(version_1_0_0));
    assertEquals(1, version_1_1_0.compareTo(version_1_0_0));
    assertEquals(1, version_1_1_1.compareTo(version_1_1_0));
    assertEquals(1, version_2_0_0.compareTo(version_1_1_1));
    assertEquals(-1, version_1_0_0.compareTo(version_1_1_0));
    assertEquals(-1, version_1_0_0.compareTo(version_1_1_0));
    assertEquals(-1, version_1_1_0.compareTo(version_1_1_1));
    assertEquals(-1, version_1_1_1.compareTo(version_2_0_0));
  }
}
