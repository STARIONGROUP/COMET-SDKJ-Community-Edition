/*
 * UriUtils.java
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

package cdp4dal;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;

/**
 * The static helper class that provides utilities to validate {@link URI}.
 */
public class UriUtils {

  /**
   * Asserts that the uri is following the http or https schema.
   *
   * @param uri The uri.
   * @throws IllegalArgumentException If the {@link URI} is not either a HTTP or a HTTPS schema,
   * this exception is thrown.
   */
  public static void assertUriIsHttpOrHttpsSchema(URI uri) {
    if (!(uri.getScheme().equals("http") || uri.getScheme().equals("https"))) {
      throw new IllegalArgumentException(String.format("Invalid URI scheme for: %s", uri));
    }
  }

  /**
   * Asserts that the uri is following the file schema.
   *
   * @param uri The uri.
   * @throws IllegalArgumentException If the {@link URI} is not File schema, this exception is
   * thrown.
   */
  public static void assertUriIsFileSchema(URI uri) {
    if (!uri.getScheme().equals("file")) {
      throw new IllegalArgumentException(String.format("Invalid URI scheme for: %s", uri));
    }
  }

  /**
   * Gets a file {@link Path} from a {@link URI} with a file schema.
   *
   * @param uri The {@link URI} with a file schema.
   * @return {@link Path} to the file from the supplied {@link URI}.
   * @throws IllegalArgumentException If the {@link URI} is not File schema, this exception is
   * thrown.
   */
  public static Path getFilePathFromUri(URI uri) {
    assertUriIsFileSchema(uri);

    var path = uri.getPath();

    // Check whether it is on a Unix file system
    if (File.separatorChar != '/') {
      path = path.substring(1); // delete leading '/' symbol. It is Windows OS
    }

    return Path.of(path);
  }
}
