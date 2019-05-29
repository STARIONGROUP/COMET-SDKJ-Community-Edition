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

/**
 * The static helper class that provides utilities to assist the Data Access Layer.
 */
public class Utils {

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
}
