/*
 * RequirementsContainerVerifier.java
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

import cdp4common.commondata.Thing;
import cdp4common.engineeringmodeldata.BooleanExpression;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.ElementUsage;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.Requirement;
import cdp4common.engineeringmodeldata.RequirementsContainer;
import cdp4common.engineeringmodeldata.RequirementsSpecification;
import cdp4dal.CDPMessageBus;
import cdp4requirementsverification.HaveRequirementStateOfCompliance;
import cdp4requirementsverification.RequirementStateOfCompliance;
import cdp4requirementsverification.events.RequirementStateOfComplianceChangedEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

/**
 * Class used for the verification if a {@link RequirementsContainer} is compliant to data in an
 * {@link Iteration}
 */
@Log4j2
public class RequirementsContainerVerifier implements HaveRequirementStateOfCompliance {

  /**
   * The {@link RequirementsContainer} internally used for verification
   */
  @Getter
  private final RequirementsContainer container;

  /**
   * Backing field for {@link RequirementStateOfCompliance}
   */
  private RequirementStateOfCompliance requirementStateOfCompliance;

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
              this.container, null);
    }
  }

  /**
   * Initializes this instance of {@link RequirementsContainerVerifier}
   *
   * @param container The container {@link Thing}
   */
  public RequirementsContainerVerifier(RequirementsContainer container) {
    this.container = container;
  }

  /**
   * Entrance methods for verifying if a {@link Requirement} and its underlying tree of {@link
   * BooleanExpression}s is compliant to data ({@link ElementDefinition} and {@link ElementUsage})
   * in an {@link Iteration}
   *
   * @param iteration The {@link Iteration} that hold the data for verification
   * @return A {@link CompletableFuture} that completes when all (underlying) verifications are
   * completed
   */
  public CompletableFuture<cdp4requirementsverification.RequirementStateOfCompliance> verifyRequirements(
      Iteration iteration) {
    return CompletableFuture.supplyAsync(() -> {
      this.setRequirementStateOfCompliance(RequirementStateOfCompliance.Calculating);

      var tasks = new ArrayList<CompletableFuture<RequirementStateOfCompliance>>();
      var verifiers = new ArrayList<HaveRequirementStateOfCompliance>();

      for (var requirementsGroup : this.container.getGroup()) {
        var requirementsContainerVerifier = new RequirementsContainerVerifier(
            requirementsGroup);
        verifiers.add(requirementsContainerVerifier);
        tasks.add(requirementsContainerVerifier.verifyRequirements(iteration));
      }

      if (this.container instanceof RequirementsSpecification) {
        for (var requirement : this.getAllowedRequirements(
            ((RequirementsSpecification) this.container).getRequirement())) {
          var requirementsVerifier = new RequirementVerifier(requirement);
          verifiers.add(requirementsVerifier);
          tasks.add(requirementsVerifier.verifyRequirements(iteration));
        }
      }

        CompletableFuture.allOf(tasks.toArray(CompletableFuture[]::new)).join();

      this.setRequirementStateOfCompliance(
          !verifiers.isEmpty()
              ? verifiers.stream().anyMatch(x -> x.getRequirementStateOfCompliance()
              == RequirementStateOfCompliance.Inconclusive)
              ? RequirementStateOfCompliance.Inconclusive
              : verifiers.stream().anyMatch(x -> x.getRequirementStateOfCompliance()
                  == RequirementStateOfCompliance.Failed)
                  ? RequirementStateOfCompliance.Failed
                  : RequirementStateOfCompliance.Pass
              : RequirementStateOfCompliance.Inconclusive);

      return this.getRequirementStateOfCompliance();
    });
  }

  /**
   * Get the {@link Requirement}s that are allowed in the verification process
   *
   * @param requirements Unfiltered list of {@link Requirement}s
   * @return unmodifiable {@link List} of {@link Requirement}s
   */
  private List<Requirement> getAllowedRequirements(Iterable<Requirement> requirements) {
    var allowedRequirements = new ArrayList<Requirement>();

    requirements.forEach(x -> {
      if (!x.isDeprecated()) {
        allowedRequirements.add(x);
      }
    });

    return List.copyOf(allowedRequirements);
  }
}
