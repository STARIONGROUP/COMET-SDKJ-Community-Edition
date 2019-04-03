/*
 * Utils.java
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

import cdp4common.dto.OwnedThing;
import cdp4common.dto.ParameterBase;
import cdp4dal.operations.OperationKind;
import com.google.common.base.Strings;
import java.net.URI;

/**
 * The static helper class that provides utilities to assist the Data Access Layer.
 */
public class Utils {

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
   * Asserts that the supplied {@link Object} is not null and throws a {@link NullPointerException}
   * if it is.
   *
   * @param thing The object which should not be null.
   * @param message The error message that will be used as error message on the thrown {@link
   * NullPointerException}.
   */
  public static void assertNotNull(Object thing, String message) {
    if (thing == null) {
      throw new NullPointerException(message);
    }
  }

  /**
   * Converts the first character of the String to an upper case letter.
   *
   * @param input The input String.
   * @return The {@link String} with the transformed first letter.
   */
  public static String capitalizeFirstLetter(String input) {
    // Check for empty String.
    if (Strings.isNullOrEmpty(input)) {
      throw new IllegalArgumentException("The input String may not be null or empty.");
    }

    return input.substring(0, 1).toUpperCase() + input.substring(1);
  }

  /**
   * Converts the first character of the String to a lower case letter.
   *
   * @param input The input String.
   * @return The {@link String} with the transformed first letter.
   */
  public static String lowerCaseFirstLetter(String input) {
    // Check for empty String.
    if (Strings.isNullOrEmpty(input)) {
      throw new IllegalArgumentException("The input String may not be null or empty.");
    }

    return input.substring(0, 1).toLowerCase() + input.substring(1);
  }

  /**
   * Assert whether an {@link OperationKind} is a copy operation.
   *
   * @param operationKind The {@link OperationKind}.
   * @return A value indicating whether it is a copy operation.
   */
  public static boolean isCopyOperation(final OperationKind operationKind) {
    return operationKind == OperationKind.COPY ||
        operationKind == OperationKind.COPY_DEFAULT_VALUES_CHANGE_OWNER ||
        operationKind == OperationKind.COPY_KEEP_VALUES ||
        operationKind == OperationKind.COPY_KEEP_VALUES_CHANGE_OWNER;
  }

  /**
   * Assert whether an {@link OperationKind} is a copy operation that changes the owner of a {@link
   * OwnedThing}.
   *
   * @param operationKind The {@link OperationKind}.
   * @return A value indicating whether it is a copy operation that changes the owner.
   */
  public static boolean isCopyChangeOwnerOperation(final OperationKind operationKind) {
    return operationKind == OperationKind.COPY_DEFAULT_VALUES_CHANGE_OWNER ||
        operationKind == OperationKind.COPY_KEEP_VALUES_CHANGE_OWNER;
  }

  /**
   * Assert whether an {@link OperationKind} is a copy operation that keeps the original values of a
   * {@link ParameterBase}.
   *
   * @param operationKind The {@link OperationKind}.
   * @return A value indicating whether it is a copy operation that keeps the original values of a
   * {@link ParameterBase}.
   */
  public static boolean isCopyKeepOriginalValuesOperation(final OperationKind operationKind) {
    return operationKind == OperationKind.COPY_KEEP_VALUES ||
        operationKind == OperationKind.COPY_KEEP_VALUES_CHANGE_OWNER;
  }
}
