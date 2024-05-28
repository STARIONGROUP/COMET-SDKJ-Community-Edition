/*
 * StringUtils.java
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

import com.google.common.base.Strings;

/**
 * The static helper class that provides utilities to operate with strings.
 */
public class StringUtils {

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
}
