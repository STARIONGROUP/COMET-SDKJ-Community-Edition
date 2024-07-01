/*
 * BooleanExpressionExtensions.java
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

package cdp4common.extensions;

import cdp4common.engineeringmodeldata.AndExpression;
import cdp4common.engineeringmodeldata.BooleanExpression;
import cdp4common.engineeringmodeldata.ExclusiveOrExpression;
import cdp4common.engineeringmodeldata.NotExpression;
import cdp4common.engineeringmodeldata.OrExpression;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class contains methods for specific BooleanExpression related functionality
 */
public class BooleanExpressionExtensions {

  /**
   * Gets the expressions that are toplevel for this list of {@link BooleanExpression}
   *
   * @return Unmodifiable {@link List} containing top level {BooleanExpression}s
   */
  public static List<BooleanExpression> getTopLevelExpressions(
      List<BooleanExpression> expressionList) {
    ArrayList<BooleanExpression> notInTerms = new ArrayList<BooleanExpression>();

    for (BooleanExpression thingExpression : expressionList) {
      switch (thingExpression.getClassKind()) {
        case NotExpression:
          if (thingExpression instanceof NotExpression && !notInTerms
              .contains(((NotExpression) thingExpression).getTerm())) {
            notInTerms.add(((NotExpression) thingExpression).getTerm());
          }

          break;

        case AndExpression:
          notInTerms.addAll(((AndExpression) thingExpression).getTerm().stream()
              .filter(x -> !notInTerms.contains(x)).collect(
                  Collectors.toList()));

          break;

        case OrExpression:
          notInTerms.addAll(((OrExpression) thingExpression).getTerm().stream()
              .filter(x -> !notInTerms.contains(x)).collect(
                  Collectors.toList()));

          break;

        case ExclusiveOrExpression:
          notInTerms.addAll(((ExclusiveOrExpression) thingExpression).getTerm().stream()
              .filter(x -> !notInTerms.contains(x)).collect(
                  Collectors.toList()));

          break;
      }
    }

    return ImmutableList.copyOf(expressionList.stream().filter(x -> !notInTerms.contains(x))
        .collect(Collectors.toList()));
  }
}
