/*
 * TransactionException.java
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

package cdp4dal.exceptions;

import cdp4dal.operations.ThingTransaction;

/**
 * A {@link TransactionException} is thrown by the {@link ThingTransaction} whenever the transaction
 * is in an inconsistent state.
 */
public class TransactionException extends Exception {

  /**
   * Initializes a new instance of the {@link TransactionException} class.
   */
  public TransactionException() {
  }

  /**
   * Initializes a new instance of the {@link TransactionException} class.
   *
   * @param message The exception message
   */
  public TransactionException(String message) {
    super(message);
  }

  /**
   * Initializes a new instance of the {@link TransactionException} class.
   *
   * @param message The exception message
   * @param cause A reference to the cause {@link Throwable}
   */
  public TransactionException(String message, Throwable cause) {
    super(message, cause);
  }
}
