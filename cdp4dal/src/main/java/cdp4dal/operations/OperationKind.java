/*
 * OperationKind.java
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
import cdp4common.dto.Thing;

/**
 * The kind of {@link Operation} acting on the object.
 */
public enum OperationKind {
  /**
   * Specifies that the {@link Operation} on the {@link Thing} is a Create operation.
   */
  CREATE,

  /**
   * Specifies that the {@link Operation} on the {@link Thing} is an Update operation.
   */
  UPDATE,

  /**
   * Specifies that the {@link Operation} on the {@link Thing} is a Delete operation.
   */
  DELETE,

  /**
   * Specifies that the {@link Operation} on the {@link Thing} is a Move operation.
   */
  MOVE,

  /**
   * Specifies that the {@link Operation} on the {@link Thing} is a "shift" Copy operation.
   * If {@link ParameterBase} are copied their value-sets shall contain default "-" values. A copy
   * {@link OwnedThing} shall keep its original owner.
   */
  COPY,

  /**
   * Specifies that the {@link Operation} on the {@link Thing} is a "ctrl" Copy operation.
   * If {@link ParameterBase} are copied their value-sets shall contain original values. A copy
   * {@link OwnedThing} shall have its owner set to the active one in the target destination.
   */
  COPY_KEEP_VALUES_CHANGE_OWNER,

  /**
   * Specifies that the {@link Operation} on the {@link Thing} is a "dry" Copy operation.
   * If {@link ParameterBase} are copied their value-sets shall contain default "-" values. A copy
   * {@link OwnedThing} shall have its owner set to the active one in the target destination.
   */
  COPY_DEFAULT_VALUES_CHANGE_OWNER,

  /**
   * Specifies that the {@link Operation} on the {@link Thing} is a "ctrl + shift" Copy operation.
   * If {@link ParameterBase} are copied their value-sets shall contain the original values. A copy
   * {@link OwnedThing} shall keep its original owner.
   */
  COPY_KEEP_VALUES
}
