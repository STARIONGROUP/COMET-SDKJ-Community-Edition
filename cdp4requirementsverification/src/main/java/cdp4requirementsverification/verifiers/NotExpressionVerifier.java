/*
 * NotExpressionVerifier.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
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


import cdp4common.engineeringmodeldata.BooleanExpression;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.NotExpression;
import cdp4requirementsverification.RequirementStateOfCompliance;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import lombok.extern.log4j.Log4j2;

/**
 * Class used for the verification if a {@link NotExpression} is compliant to data in an {@link
 * Iteration}
 */
@Log4j2
public class NotExpressionVerifier extends BooleanExpressionVerifierBase<NotExpression> {

  /**
   * Initializes a new instance of the {@link AndExpressionVerifier} class.
   *
   * @param notExpression The {@link AndExpressionVerifier} that is verified.
   */
  public NotExpressionVerifier(NotExpression notExpression) {
    this.setExpression(notExpression);
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

      var expressionVerifier = booleanExpressionVerifiers.get(this.getExpression().getTerm());
      RequirementStateOfCompliance requirementStateOfCompliance;
      requirementStateOfCompliance = expressionVerifier
          .verifyRequirementStateOfCompliance(booleanExpressionVerifiers, iteration).join();

      this.setRequirementStateOfCompliance(
          requirementStateOfCompliance == RequirementStateOfCompliance.Pass
              ? RequirementStateOfCompliance.Failed
              : requirementStateOfCompliance == RequirementStateOfCompliance.Failed
                  ? RequirementStateOfCompliance.Pass
                  : requirementStateOfCompliance);

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

    return this.getExpression().getTerm() == null;
  }
}
