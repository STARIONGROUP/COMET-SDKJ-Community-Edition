/*
 * InvalidOperationKindException.java
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

import cdp4dal.dal.Dal;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;

/**
 * A InvalidOperationKindException is thrown whenever an {@link OperationContainer} contains {@link
 * Operation} that are not supported by the implementation of an {@link Dal}.
 */
public class InvalidOperationKindException extends RuntimeException {

  /**
   * Initializes a new instance of the {@link InvalidOperationKindException} class.
   */
  public InvalidOperationKindException() {
  }

  /**
   * Initializes a new instance of the {@link InvalidOperationKindException} class.
   *
   * @param message The exception message.
   */
  public InvalidOperationKindException(String message) {
    super(message);
  }

  /**
   * Initializes a new instance of the {@link InvalidOperationKindException} class.
   *
   * @param message The exception message.
   * @param innerException A reference to the inner {@link Exception}.
   */
  public InvalidOperationKindException(String message, Exception innerException) {
    super(message, innerException);
  }
}
