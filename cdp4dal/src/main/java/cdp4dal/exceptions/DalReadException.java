/*
 * DalReadException.java
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

package cdp4dal.exceptions;

/**
 * A {@link DalReadException} is thrown the when a during a Read operation the data-source returns
 * an exception
 */
public class DalReadException extends Exception {

  /**
   * Initializes a new instance of the {@link DalReadException} class.
   */
  public DalReadException() {
  }

  /**
   * Initializes a new instance of the {@link DalReadException} class.
   *
   * @param message The exception message
   */
  public DalReadException(String message) {

    super(message);
  }

  /**
   * Initializes a new instance of the {@link DalReadException} class.
   *
   * @param message The exception message
   * @param innerException A reference to the inner {@link Exception}
   */
  public DalReadException(String message, Exception innerException) {
    super(message, innerException);
  }
}
