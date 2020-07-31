/*
 * RelationalExpressionVerifier.java
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

import static cdp4common.helpers.Utils.as;

import cdp4common.engineeringmodeldata.BinaryRelationship;
import cdp4common.engineeringmodeldata.BooleanExpression;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.ElementUsage;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.Parameter;
import cdp4common.engineeringmodeldata.ParameterOrOverrideBase;
import cdp4common.engineeringmodeldata.ParameterOverride;
import cdp4common.engineeringmodeldata.RelationalExpression;
import cdp4common.engineeringmodeldata.Requirement;
import cdp4requirementsverification.RequirementStateOfCompliance;
import cdp4requirementsverification.calculations.RequirementStateOfComplianceCalculatorImpl;
import cdp4requirementsverification.extensions.RequirementStateOfComplianceExtensions;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

/**
 * Class used for the verification if a {@link RelationalExpression} is compliant to data in an
 * {@link Iteration}
 */
@Log4j2
public class RelationalExpressionVerifier extends
    BooleanExpressionVerifierBase<RelationalExpression> {

  /**
   * The lock object
   */
  private final Semaphore threadLock = new Semaphore(1);

  /**
   * Initializes a new instance of the {@link RelationalExpressionVerifier} class.
   *
   * @param relationalExpression The {@link RelationalExpression} that is verified.
   */
  public RelationalExpressionVerifier(RelationalExpression relationalExpression) {
    this.setExpression(relationalExpression);
  }

  /**
   * A list containing all the {@link VerifiedRequirementStateOfComplianceList}s that were found
   * when verifying {@link Iteration} data ({@link ElementDefinition} and {@link ElementUsage})
   */
  @Getter
  private final VerifiedRequirementStateOfComplianceList verifiedRequirementStateOfComplianceList = new VerifiedRequirementStateOfComplianceList(
      new RequirementStateOfComplianceCalculatorImpl());

  /**
   * Verify a {@link RelationalExpression} with respect to a {@link Requirement} using data from a
   * given {@link Iteration}
   *
   * @param relationShips A IEnumerable of {@link BinaryRelationship}s to verify requirements with
   * @param iteration The {@link Iteration} that contains the data ({@link ElementDefinition} and
   * {@link ElementUsage}) used for verification
   * @return {@link CompletableFuture} that returns the calculated {@link
   * RequirementStateOfCompliance} for this class' {@code expression} property
   */
  public CompletableFuture<RequirementStateOfCompliance> verifyRequirementStateOfCompliance(
      Iterable<BinaryRelationship> relationShips, Iteration iteration) {
    this.isMessageBusActive = false;
    return CompletableFuture.supplyAsync(
        () -> this.verifyRequirementStateOfComplianceInternal(relationShips, iteration));
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<RequirementStateOfCompliance> verifyRequirementStateOfCompliance(
      Map<BooleanExpression, BooleanExpressionVerifier> booleanExpressionVerifiers,
      Iteration iteration) {
    var relations = this.getExpression().queryRelationships()
        .stream()
        .map(x -> (BinaryRelationship) x)
        .filter(
            x -> x.getSource() instanceof ParameterOrOverrideBase && !((ParameterOrOverrideBase) x
                .getSource()).getParameterType().isDeprecated() && x
                .getTarget() instanceof RelationalExpression)
        .collect(Collectors.toList());

    this.isMessageBusActive = true;
    return CompletableFuture
        .supplyAsync(() -> this.verifyRequirementStateOfComplianceInternal(relations, iteration));
  }

  private RequirementStateOfCompliance verifyRequirementStateOfComplianceInternal(
      Iterable<BinaryRelationship> relationShips, Iteration iteration) {
    try {
      this.threadLock.acquire();
      {
        if (RequirementStateOfComplianceExtensions
            .isCalculated(this.getRequirementStateOfCompliance())) {
          return this.getRequirementStateOfCompliance();
        }

        this.setRequirementStateOfCompliance(RequirementStateOfCompliance.Calculating);

        for (var binaryRelation : relationShips) {
          if (binaryRelation.getTarget() instanceof RelationalExpression) {
            var relationParameter = as(binaryRelation.getSource(), Parameter.class);

            var elementDefinitionParameters =
                iteration.getElement().stream()
                    .flatMap(x -> x.getParameter().stream())
                    .filter(x -> x == relationParameter)
                    .collect(Collectors.toList());

            if (relationParameter != null && !elementDefinitionParameters.isEmpty()) {
              for (var parameter : elementDefinitionParameters) {
                this.verifiedRequirementStateOfComplianceList
                    .verifyAndAdd(parameter.getValueSet(),
                        (RelationalExpression) binaryRelation.getTarget());
              }
            }

            var relationParameterOverride = as(binaryRelation.getSource(), ParameterOverride.class);

            var elementUsageParameterOverrides = iteration.getElement().stream()
                .flatMap(x -> x.getContainedElement().stream())
                .flatMap(x -> x.getParameterOverride().stream())
                .filter(x -> x == relationParameterOverride)
                .collect(Collectors.toList());

            if (relationParameterOverride != null && !elementUsageParameterOverrides.isEmpty()) {
              for (var parameterOverride : elementUsageParameterOverrides) {
                this.verifiedRequirementStateOfComplianceList
                    .verifyAndAdd(parameterOverride.getValueSet(),
                        (RelationalExpression) binaryRelation.getTarget());
              }
            }
          }
        }

        this.calculateRequirementStateOfCompliance();
      }
    } catch (InterruptedException e) {
      log.error("Unexpectedly synchronization thread was interrupted with message: {}",
          e.getMessage());
    } finally {
      this.threadLock.release();
      log.trace("RelationalExpressionVerifier thread released");
    }

    return this.getRequirementStateOfCompliance();
  }

  /**
   * Calculate the {@link RequirementStateOfCompliance} for this instance of {@link
   * RelationalExpression}
   */
  private void calculateRequirementStateOfCompliance() {
    if (this.verifiedRequirementStateOfComplianceList.isEmpty()) {
      this.setRequirementStateOfCompliance(RequirementStateOfCompliance.Inconclusive);
    } else if (this.verifiedRequirementStateOfComplianceList.entrySet().stream()
        .allMatch(x -> x.getValue() == RequirementStateOfCompliance.Pass)) {
      this.setRequirementStateOfCompliance(RequirementStateOfCompliance.Pass);
    } else if (this.verifiedRequirementStateOfComplianceList.entrySet().stream()
        .allMatch(x -> x.getValue() == RequirementStateOfCompliance.Failed)) {
      this.setRequirementStateOfCompliance(RequirementStateOfCompliance.Failed);
    } else {
      this.setRequirementStateOfCompliance(RequirementStateOfCompliance.Inconclusive);
    }
  }
}
