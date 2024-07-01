/*
 * RequirementVerifier.java
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
import cdp4common.engineeringmodeldata.ParametricConstraint;
import cdp4common.engineeringmodeldata.Requirement;
import cdp4dal.CDPMessageBus;
import cdp4requirementsverification.HaveRequirementStateOfCompliance;
import cdp4requirementsverification.RequirementStateOfCompliance;
import cdp4requirementsverification.events.RequirementStateOfComplianceChangedEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import lombok.extern.log4j.Log4j2;

/**
 * Class used for the verification if a {@link Requirement} is compliant to data in an {@link
 * Iteration}
 */
@Log4j2
public class RequirementVerifier implements HaveRequirementStateOfCompliance {

  /**
   * The {@link Requirement} internally used for verification
   */
  private final Requirement requirement;

  /**
   * Backing field for {@link RequirementStateOfCompliance}
   */
  private RequirementStateOfCompliance requirementStateOfCompliance;

  /**
   * The list containing all {@link ParametricConstraintVerifier}s to verify for this {@link
   * Requirement}
   */
  private final List<ParametricConstraintVerifier> parametricConstraintVerifiers = new ArrayList<>();

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
              this.requirement, null);
    }
  }

  /**
   * Initializes this instance of {@link RequirementVerifier}
   *
   * @param requirement The {@link Requirement} used for verification
   */
  public RequirementVerifier(Requirement requirement) {
    this.requirement = requirement;
  }

  /**
   * Entrance methods for verifying if a {@link Requirement} and its underlying tree of {@link
   * BooleanExpression}s is compliant to data ({@link ElementDefinition} and {@link ElementUsage})
   * in an {@link Iteration}
   *
   * @return A {@link CompletableFuture} that completes when all (underlying) verifications are
   * completed
   */
  public CompletableFuture<RequirementStateOfCompliance> verifyRequirements(Iteration iteration) {
    return CompletableFuture.supplyAsync(() -> {
      this.setRequirementStateOfCompliance(RequirementStateOfCompliance.Calculating);
      this.parametricConstraintVerifiers.clear();

      ArrayList<CompletableFuture<RequirementStateOfCompliance>> tasks = new ArrayList<CompletableFuture<RequirementStateOfCompliance>>();

      for (ParametricConstraint parametricConstraint : this.requirement.getParametricConstraint()) {
        ParametricConstraintVerifier parametricConstraintVerifier = new ParametricConstraintVerifier(
            parametricConstraint);
        this.parametricConstraintVerifiers.add(parametricConstraintVerifier);

        tasks.add(parametricConstraintVerifier.verifyRequirements(iteration));
      }

      CompletableFuture[] tasksArray = new CompletableFuture [tasks.size()];
      tasksArray = tasks.toArray(tasksArray);
      CompletableFuture.allOf(tasksArray).join();

      this.calculateRequirementStateOfCompliance();

      return this.getRequirementStateOfCompliance();
    });
  }

  /**
   * Calculate the {@link RequirementStateOfCompliance} for this instance of {@link
   * RequirementVerifier}
   */
  private void calculateRequirementStateOfCompliance() {
    if (this.parametricConstraintVerifiers.isEmpty()) {
      this.requirementStateOfCompliance = RequirementStateOfCompliance.Inconclusive;
    } else if (this.parametricConstraintVerifiers.stream()
        .allMatch(x -> x.getRequirementStateOfCompliance() == RequirementStateOfCompliance.Pass)) {
      this.requirementStateOfCompliance = RequirementStateOfCompliance.Pass;
    } else if (this.parametricConstraintVerifiers.stream().allMatch(
        x -> x.getRequirementStateOfCompliance() == RequirementStateOfCompliance.Failed)) {
      this.requirementStateOfCompliance = RequirementStateOfCompliance.Failed;
    } else {
      this.requirementStateOfCompliance = RequirementStateOfCompliance.Inconclusive;
    }
  }
}
