/*
 * BooleanExpressionVerifierBase.java
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

import cdp4common.engineeringmodeldata.BooleanExpression;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.ElementUsage;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.Requirement;
import cdp4dal.CDPMessageBus;
import cdp4requirementsverification.RequirementStateOfCompliance;
import cdp4requirementsverification.events.RequirementStateOfComplianceChangedEvent;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Base class for the verification if a {@link BooleanExpression} is compliant to data in an {@link
 * Iteration}
 *
 * @param <T> The type of {@link BooleanExpression} that is used for this verifier.
 */
public abstract class BooleanExpressionVerifierBase<T extends BooleanExpression> implements
    BooleanExpressionVerifier {

  /**
   * Backing field for {@link RequirementStateOfCompliance}
   */
  private RequirementStateOfCompliance requirementStateOfCompliance = RequirementStateOfCompliance.Unknown;

  /**
   * The {@link BooleanExpression} that is used for the verification process
   */
  @Getter
  @Setter(value = AccessLevel.PROTECTED)
  private T expression;

  /**
   * Indication that the CDPMessageBus can be used.
   */
  @Getter(value = AccessLevel.PROTECTED)
  @Setter(value = AccessLevel.PROTECTED)
  protected boolean isMessageBusActive = true;

  /**
   * Get the current {@link RequirementStateOfCompliance}
   */
  public RequirementStateOfCompliance getRequirementStateOfCompliance() {
    return this.requirementStateOfCompliance;
  }

  /**
   * Set the current {@link RequirementStateOfCompliance}
   * <p>
   * Normally we don't put code in a property setter. In this exceptional case we do, because we
   * might want a {@link RequirementStateOfComplianceChangedEvent} to be called through the {@link
   * CDPMessageBus}
   */
  protected void setRequirementStateOfCompliance(
      RequirementStateOfCompliance requirementStateOfCompliance) {
    if (this.requirementStateOfCompliance != requirementStateOfCompliance) {
      this.requirementStateOfCompliance = requirementStateOfCompliance;

      if (this.isMessageBusActive()) {
        CDPMessageBus.getCurrent()
            .sendMessage(new RequirementStateOfComplianceChangedEvent(requirementStateOfCompliance),
                this.getExpression(), null);
      }
    }
  }

  /**
   * Verify a {@link BooleanExpression} with respect to a {@link Requirement} using data from a
   * given {@link Iteration}
   *
   * @param booleanExpressionVerifiers A dictionary that contains all {@link BooleanExpression}s and
   * their {@link BooleanExpressionVerifier}s
   * @param iteration The {@link Iteration} that contains the data ({@link ElementDefinition} and
   * {@link ElementUsage}) used for verification
   * @return {@link CompletableFuture} that returns the calculated {@link
   * RequirementStateOfCompliance} for this class
   */
  public abstract CompletableFuture<RequirementStateOfCompliance> verifyRequirementStateOfCompliance(
      Map<BooleanExpression, BooleanExpressionVerifier> booleanExpressionVerifiers,
      Iteration iteration);
}
