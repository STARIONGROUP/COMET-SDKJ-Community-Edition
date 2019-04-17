/*
 * OperationUtilsTest.java
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

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class OperationUtilsTest {

  @Test
  void isCopyOperationTrueTest() {
    assertTrue(OperationUtils.isCopyOperation(OperationKind.COPY));
    assertTrue(OperationUtils.isCopyOperation(OperationKind.COPY_DEFAULT_VALUES_CHANGE_OWNER));
    assertTrue(OperationUtils.isCopyOperation(OperationKind.COPY_KEEP_VALUES));
    assertTrue(OperationUtils.isCopyOperation(OperationKind.COPY_KEEP_VALUES_CHANGE_OWNER));
  }

  @Test
  void isCopyOperationFalseTest() {
    assertFalse(OperationUtils.isCopyOperation(OperationKind.CREATE));
  }

  @Test
  void isCopyChangeOwnerOperationTrueTest() {
    assertTrue(
        OperationUtils.isCopyChangeOwnerOperation(OperationKind.COPY_DEFAULT_VALUES_CHANGE_OWNER));
    assertTrue(
        OperationUtils.isCopyChangeOwnerOperation(OperationKind.COPY_KEEP_VALUES_CHANGE_OWNER));
  }

  @Test
  void isCopyChangeOwnerOperationFalseTest() {
    assertFalse(OperationUtils.isCopyChangeOwnerOperation(OperationKind.CREATE));
  }

  @Test
  void isCopyKeepOriginalValuesOperationTrueTest() {
    assertTrue(OperationUtils.isCopyKeepOriginalValuesOperation(OperationKind.COPY_KEEP_VALUES));
    assertTrue(OperationUtils
        .isCopyKeepOriginalValuesOperation(OperationKind.COPY_KEEP_VALUES_CHANGE_OWNER));
  }

  @Test
  void isCopyKeepOriginalValuesOperationFalseTest() {
    assertFalse(OperationUtils.isCopyKeepOriginalValuesOperation(OperationKind.CREATE));
  }
}
