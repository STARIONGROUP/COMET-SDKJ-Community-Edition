/*
 * UriUtilsTest.java
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

package cdp4dal;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.net.URI;
import org.junit.jupiter.api.Test;

class UriUtilsTest {

  @Test
  void assertThatUriSchemaAssertionWorksForHttpAndHttps() {
    UriUtils.assertUriIsHttpOrHttpsSchema(URI.create("http://somehost.com:23/"));
    UriUtils.assertUriIsHttpOrHttpsSchema(URI.create("https://someotherhost.com"));
  }

  @Test
  void assertThatNonHttpAndHttpsSchemasThrow() {
    assertThrows(IllegalArgumentException.class,
        () -> UriUtils.assertUriIsHttpOrHttpsSchema(URI.create("file://somehost.com")));
    assertThrows(IllegalArgumentException.class,
        () -> UriUtils.assertUriIsHttpOrHttpsSchema(URI.create("ftp://somehost.com")));
  }

  @Test
  void assertThatUriSchemaAssertionWorksForFile() {
    UriUtils.assertUriIsFileSchema(URI.create("file://localhost/etc/fstab"));
    UriUtils.assertUriIsFileSchema(URI.create("file:///c:/WINDOWS/clock.avi"));
  }

  @Test
  void assertThatNonFileSchemasThrow() {
    assertThrows(IllegalArgumentException.class,
        () -> UriUtils.assertUriIsFileSchema(URI.create("http://somehost.com")));
    assertThrows(IllegalArgumentException.class,
        () -> UriUtils.assertUriIsFileSchema(URI.create("ftp://somehost.com")));
  }
}
