/*
 * RequirementsContainerVerifierTest.java
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

import static org.junit.jupiter.api.Assertions.assertEquals;

import cdp4common.engineeringmodeldata.BinaryRelationship;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.ElementUsage;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.ParameterOrOverrideBase;
import cdp4common.engineeringmodeldata.ParametricConstraint;
import cdp4common.engineeringmodeldata.RelationalExpression;
import cdp4common.engineeringmodeldata.RelationalOperatorKind;
import cdp4common.engineeringmodeldata.Requirement;
import cdp4common.engineeringmodeldata.RequirementsSpecification;
import cdp4requirementsverification.RequirementStateOfCompliance;
import cdp4requirementsverification.builders.ParameterBuilder;
import cdp4requirementsverification.builders.RelationalExpressionBuilder;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Suite of tests for the {@link RequirementsContainerVerifier} class.
 */
class RequirementsContainerVerifierTest {

  private RequirementsContainerVerifier requirementsContainerVerifier;

  private RequirementsSpecification requirementsSpecification;

  private Requirement requirement;

  private ParametricConstraint parametricConstraint;

  private RelationalExpression relationalExpression;

  private Iteration iteration;
  private ElementDefinition elementDefinition;

  @BeforeEach
  void setUp() {
    this.parametricConstraint = new ParametricConstraint(UUID.randomUUID(), null, null);

    this.relationalExpression =
        new RelationalExpressionBuilder()
            .withSimpleQuantityKindParameterType()
            .withRelationalOperatorKind(RelationalOperatorKind.EQ)
            .withValue("10")
            .build();

    this.parametricConstraint.getExpression().add(this.relationalExpression);

    this.requirement = new Requirement(UUID.randomUUID(), null, null);

    this.requirement.getParametricConstraint().add(this.parametricConstraint);

    this.requirementsSpecification = new RequirementsSpecification(UUID.randomUUID(), null, null);
    this.requirementsSpecification.getRequirement().add(this.requirement);

    this.requirementsContainerVerifier = new RequirementsContainerVerifier(
        this.requirementsSpecification);

    this.iteration = new Iteration(UUID.randomUUID(), null, null);

    this.elementDefinition = new ElementDefinition(UUID.randomUUID(), null, null);
    var elementUsage = new ElementUsage(UUID.randomUUID(), null, null);
    elementUsage.setElementDefinition(this.elementDefinition);
    this.elementDefinition.getContainedElement().add(elementUsage);

    var parameter =
        new ParameterBuilder()
            .withSimpleQuantityKindParameterType()
            .withValue("10")
            .addToElementDefinition(this.elementDefinition)
            .build();

    this.iteration.getElement().add(this.elementDefinition);

    this.registerBinaryRelationShip(parameter, this.relationalExpression);
  }

  private void registerBinaryRelationShip(ParameterOrOverrideBase parameter,
      RelationalExpression expression) {
    var relationShip = new BinaryRelationship(UUID.randomUUID(), null, null);
    relationShip.setSource(parameter);
    relationShip.setTarget(expression);

    expression.getRelationships().add(relationShip);
    relationShip.getSource().getRelationships().add(relationShip);
    relationShip.getTarget().getRelationships().add(relationShip);

    this.iteration.getRelationship().add(relationShip);
  }

  @Test
  void verify_that_state_of_compliances_are_properly_calculated() {
    this.requirementsContainerVerifier.verifyRequirements(this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Pass,
        this.requirementsContainerVerifier.getRequirementStateOfCompliance());
  }

  @Test
  void verify_that_state_of_compliances_are_properly_calculated_when_requirement_is_deprecated() {
    this.requirement.setDeprecated(true);
    this.requirementsContainerVerifier.verifyRequirements(this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.requirementsContainerVerifier.getRequirementStateOfCompliance());
  }

  @Test
  void verify_that_state_of_compliances_are_properly_calculated_when_no_requirements_are_present() {
    this.requirementsSpecification.getRequirement().clear();
    this.requirementsContainerVerifier.verifyRequirements(this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.requirementsContainerVerifier.getRequirementStateOfCompliance());
  }
}
