/*
 * AndExpressionVerifier.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené, Alexander van Delft
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

package cdp4requirementsverification.verifiers;

import cdp4common.engineeringmodeldata.AndExpression;
import cdp4common.engineeringmodeldata.BooleanExpression;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4requirementsverification.RequirementStateOfCompliance;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import lombok.extern.log4j.Log4j2;

/**
 * Class used for the verification if a {@link AndExpression} is compliant to data in an {@link
 * Iteration}
 */
@Log4j2
public class AndExpressionVerifier extends BooleanExpressionVerifierBase<AndExpression> {

  /**
   * Initializes a new instance of the {@link AndExpressionVerifier} class.
   *
   * @param andExpression The {@link AndExpression} that is verified.
   */
  public AndExpressionVerifier(AndExpression andExpression) {
    this.setExpression(andExpression);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<RequirementStateOfCompliance> verifyRequirementStateOfCompliance(
      Map<BooleanExpression, BooleanExpressionVerifier> booleanExpressionVerifiers,
      Iteration iteration) {
    return CompletableFuture.supplyAsync(() -> {
      this.setRequirementStateOfCompliance(RequirementStateOfCompliance.Calculating);

      if (this.isNoTermAvailable()) {
        this.setRequirementStateOfCompliance(RequirementStateOfCompliance.Inconclusive);
        return this.getRequirementStateOfCompliance();
      }

      ArrayList<RequirementStateOfCompliance> requirementStateOfCompliances = new ArrayList<RequirementStateOfCompliance>();

      for (BooleanExpression expression : this.getExpression().getTerm()) {
        BooleanExpressionVerifier expressionVerifier = booleanExpressionVerifiers.get(expression);
        requirementStateOfCompliances.add(expressionVerifier
            .verifyRequirementStateOfCompliance(booleanExpressionVerifiers, iteration).join());
      }

      this.setRequirementStateOfCompliance(
          requirementStateOfCompliances.stream()
              .anyMatch(x -> x == RequirementStateOfCompliance.Inconclusive)
              ? RequirementStateOfCompliance.Inconclusive
              : requirementStateOfCompliances.stream()
                  .anyMatch(x -> x == RequirementStateOfCompliance.Failed)
                  ? RequirementStateOfCompliance.Failed
                  : RequirementStateOfCompliance.Pass);

      return this.getRequirementStateOfCompliance();
    });
  }

  /**
   * Checks whether any {@link BooleanExpression} is available in term of this expression.
   *
   * @return {@code true} if no {@link BooleanExpression} is available, otherwise {@code false}.
   */
  private boolean isNoTermAvailable() {
    if (this.getExpression() == null) {
      return true;
    }

    if (this.getExpression().getTerm() == null) {
      return true;
    }

    return this.getExpression().getTerm().size() == 0;
  }
}
