/*
 * OperationUtils.java
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

package cdp4dal.operations;

import cdp4common.dto.OwnedThing;
import cdp4common.dto.ParameterBase;

/**
 * The static helper class that provides utilities to validate {@link OperationKind}.
 */
public class OperationUtils {

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
