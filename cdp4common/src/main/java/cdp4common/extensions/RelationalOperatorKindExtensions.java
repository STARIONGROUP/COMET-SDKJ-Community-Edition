/*
 * RelationalOperatorKindExtensions.java
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

package cdp4common.extensions;

import cdp4common.engineeringmodeldata.RelationalOperatorKind;

/**
 * Extension methods for the {@link RelationalOperatorKind} enum.
 */
public class RelationalOperatorKindExtensions {

  /**
   * A method that converts a {@link RelationalOperatorKind} to a readable string.
   *
   * @param value {@link RelationalOperatorKind}  to convert.
   * @return String that contains a scientific representation of the {@link RelationalOperatorKind}.
   */
  public static String toScientificNotationString(RelationalOperatorKind value) {
    switch (value) {
      case EQ:
        return "=";

      case GE:
        return "≥";

      case GT:
        return ">";

      case LT:
        return "<";

      case LE:
        return "≤";

      case NE:
        return "≠";

      default:
        return value.toString();
    }
  }
}
