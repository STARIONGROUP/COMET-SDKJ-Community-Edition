/*
 * Operation.java
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

package cdp4dal.operations;

import cdp4common.dto.Thing;
import lombok.Getter;

/**
 * The change that is to be supplied to the data source via a Data-Access-Layer implementation.
 */
@Getter
public class Operation {

  /**
   * Initializes a new instance of the {@link Operation} class.
   *
   * @param originalThing The original {@link Thing} fom the local domain store.
   * @param modifiedThing The modified {@link Thing}.
   * @param operationKind The kind of operation that is to be executed.
   */
  public Operation(Thing originalThing, Thing modifiedThing, OperationKind operationKind) {
    this.originalThing = originalThing;
    this.modifiedThing = modifiedThing;
    this.operationKind = operationKind;
  }

  /**
   * Gets the kind of operation represented by this {@link Operation} object.
   */
  private OperationKind operationKind;

  /**
   * Gets the original {@link Thing} that is the subject of the {@link Operation}.
   */
  private Thing originalThing;

  /**
   * Gets the modified {@link Thing} that is the subject of the {@link Operation}.
   */
  private Thing modifiedThing;
}
