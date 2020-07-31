/*
 * ParametricConstraintVerifier.java
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

import cdp4common.engineeringmodeldata.AndExpression;
import cdp4common.engineeringmodeldata.BooleanExpression;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.ElementUsage;
import cdp4common.engineeringmodeldata.ExclusiveOrExpression;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.NotExpression;
import cdp4common.engineeringmodeldata.OrExpression;
import cdp4common.engineeringmodeldata.ParametricConstraint;
import cdp4common.engineeringmodeldata.RelationalExpression;
import cdp4common.extensions.BooleanExpressionExtensions;
import cdp4dal.CDPMessageBus;
import cdp4requirementsverification.RequirementStateOfCompliance;
import cdp4requirementsverification.events.RequirementStateOfComplianceChangedEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

/**
 * Class used for the verification if a {@link ParametricConstraint} is compliant to data in an
 * {@link Iteration}
 */
@Log4j2
public class ParametricConstraintVerifier implements BooleanExpressionVerifier {

  /**
   * The {@link ParametricConstraint} internally used for verification
   */
  private final ParametricConstraint parametricConstraint;

  /**
   * Backing field for {@link RequirementStateOfCompliance}
   */
  private RequirementStateOfCompliance requirementStateOfCompliance;

  /**
   * Dictionary that contains all {@link BooleanExpression}s and their {@link
   * BooleanExpressionVerifier{T}}s
   */
  @Getter
  private final Map<BooleanExpression, BooleanExpressionVerifier> booleanExpressionVerifiers = new HashMap<>();

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

      CDPMessageBus.getCurrent()
          .sendMessage(new RequirementStateOfComplianceChangedEvent(requirementStateOfCompliance),
              this.parametricConstraint, null);
    }
  }

  /**
   * Initializes this instance of {@link ParametricConstraintVerifier}
   *
   * @param parametricConstraint The {@link ParametricConstraint} that is used for verification
   */
  public ParametricConstraintVerifier(ParametricConstraint parametricConstraint) {
    this.parametricConstraint = parametricConstraint;
  }

  /**
   * Entrance methods for verifying if a {@link ParametricConstraint} and its underlying tree of
   * {@link BooleanExpression}s is compliant to data ({@link ElementDefinition} and {@link
   * ElementUsage}) in an {@link Iteration}
   *
   * @return A {@link CompletableFuture} that completes when all (underlying) verifications are
   * completed
   */
  public CompletableFuture<RequirementStateOfCompliance> verifyRequirements(Iteration iteration) {
    this.setRequirementStateOfCompliance(RequirementStateOfCompliance.Calculating);

    this.createBooleanExpressionVerifiers();

    return this.verifyRequirementStateOfCompliance(this.booleanExpressionVerifiers, iteration);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public CompletableFuture<RequirementStateOfCompliance> verifyRequirementStateOfCompliance(
      Map<BooleanExpression, BooleanExpressionVerifier> booleanExpressionVerifiers,
      Iteration iteration) {
    return CompletableFuture.supplyAsync(() -> {
      var tasks = new ArrayList<CompletableFuture<RequirementStateOfCompliance>>();

      CompletableFuture.allOf(tasks.toArray(CompletableFuture[]::new)).join();

      var topLevelBooleanExpressions = BooleanExpressionExtensions
          .getTopLevelExpressions(this.parametricConstraint.getExpression());

      var topLevelBooleanExpressionVerifiers =
          this.booleanExpressionVerifiers.entrySet().stream()
              .filter(x -> topLevelBooleanExpressions.contains(x.getKey()))
              .map(Entry::getValue)
              .collect(Collectors.toList());

      this.setRequirementStateOfCompliance(
          topLevelBooleanExpressionVerifiers.stream()
              .anyMatch(x -> x.getRequirementStateOfCompliance()
                  == RequirementStateOfCompliance.Inconclusive)
              ? RequirementStateOfCompliance.Inconclusive
              : topLevelBooleanExpressionVerifiers.stream()
                  .anyMatch(x -> x.getRequirementStateOfCompliance()
                      == RequirementStateOfCompliance.Failed)
                  ? RequirementStateOfCompliance.Failed
                  : RequirementStateOfCompliance.Pass);

      return this.getRequirementStateOfCompliance();
    });
  }

  /**
   * Clear and (re)fill the list of {@link BooleanExpression}s and their matching {@link
   * BooleanExpressionVerifier{T}}s.
   */
  private void createBooleanExpressionVerifiers() {
    this.booleanExpressionVerifiers.clear();

    for (var booleanExpression : this.parametricConstraint.getExpression()) {
      this.booleanExpressionVerifiers
          .put(booleanExpression, this.getBooleanExpressionVerifier(booleanExpression));
    }
  }

  /**
   * Return a {@link BooleanExpressionVerifier} that can deal with a {@link BooleanExpression}
   *
   * @param booleanExpression The {@link BooleanExpression} where the matching {@link
   * BooleanExpressionVerifier} needs te be created for
   * @return {@link BooleanExpressionVerifier} that matches the {@link BooleanExpression} parameter,
   * or Null if one cannot be found
   */
  private BooleanExpressionVerifier getBooleanExpressionVerifier(
      BooleanExpression booleanExpression) {
    if (booleanExpression instanceof NotExpression) {
      return new NotExpressionVerifier((NotExpression) booleanExpression);
    }

    if (booleanExpression instanceof AndExpression) {
      return new AndExpressionVerifier((AndExpression) booleanExpression);
    }

    if (booleanExpression instanceof OrExpression) {
      return new OrExpressionVerifier((OrExpression) booleanExpression);
    }

    if (booleanExpression instanceof ExclusiveOrExpression) {
      return new ExclusiveOrExpressionVerifier((ExclusiveOrExpression) booleanExpression);
    }

    if (booleanExpression instanceof RelationalExpression) {
      return new RelationalExpressionVerifier((RelationalExpression) booleanExpression);
    }

    return null;
  }
}
