/*
 * RelationalExpressionVerifierTest.java
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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import cdp4common.engineeringmodeldata.BinaryRelationship;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.ElementUsage;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.Parameter;
import cdp4common.engineeringmodeldata.ParameterOrOverrideBase;
import cdp4common.engineeringmodeldata.RelationalExpression;
import cdp4common.engineeringmodeldata.RelationalOperatorKind;
import cdp4dal.CDPMessageBus;
import cdp4requirementsverification.RequirementStateOfCompliance;
import cdp4requirementsverification.builders.ParameterBuilder;
import cdp4requirementsverification.builders.RelationalExpressionBuilder;
import cdp4requirementsverification.events.RequirementStateOfComplianceChangedEvent;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Suite of tests for the {@link RelationalExpressionVerifier} class.
 */
class RelationalExpressionVerifierTest {

  private RelationalExpressionVerifier relationalExpressionVerifier;

  private RelationalExpression relationalExpression;

  private Iteration iteration;

  private ElementDefinition elementDefinition;

  private Boolean messageBusWasCalled;

  private RequirementStateOfCompliance requirementStateOfCompliance;

  @BeforeEach
  void setUp() {
    this.relationalExpression =
        new RelationalExpressionBuilder()
            .withSimpleQuantityKindParameterType()
            .withRelationalOperatorKind(RelationalOperatorKind.EQ)
            .withValue("10")
            .build();

    this.iteration = new Iteration(UUID.randomUUID(), null, null);

    this.elementDefinition = new ElementDefinition(UUID.randomUUID(), null, null);
    ElementUsage elementUsage = new ElementUsage(UUID.randomUUID(), null, null);
    elementUsage.setElementDefinition(this.elementDefinition);
    this.elementDefinition.getContainedElement().add(elementUsage);

    Parameter parameter =
        new ParameterBuilder()
            .withSimpleQuantityKindParameterType()
            .withValue("10")
            .addToElementDefinition(this.elementDefinition)
            .build();

    this.iteration.getElement().add(this.elementDefinition);

    this.registerBinaryRelationShip(parameter, this.relationalExpression);

    this.relationalExpressionVerifier = new RelationalExpressionVerifier(this.relationalExpression);
  }

  @AfterEach
  void tearDown() {
    CDPMessageBus.getCurrent().clearSubscriptions();
  }

  private void registerBinaryRelationShip(ParameterOrOverrideBase parameter,
      RelationalExpression expression) {
    BinaryRelationship relationShip = new BinaryRelationship(UUID.randomUUID(), null, null);
    relationShip.setSource(parameter);
    relationShip.setTarget(expression);

    expression.getRelationships().add(relationShip);
    relationShip.getSource().getRelationships().add(relationShip);
    relationShip.getTarget().getRelationships().add(relationShip);

    this.iteration.getRelationship().add(relationShip);
  }

  @Test
  void verify_that_state_of_compliances_are_properly_calculated() {
    this.messageBusWasCalled = false;
    this.requirementStateOfCompliance = RequirementStateOfCompliance.Unknown;

    CDPMessageBus.getCurrent()
        .listen(RequirementStateOfComplianceChangedEvent.class, this.relationalExpression, null)
        .subscribe(x ->
        {
          this.messageBusWasCalled = true;
          this.requirementStateOfCompliance = x.getRequirementStateOfCompliance();
        });

    this.relationalExpressionVerifier
        .verifyRequirementStateOfCompliance(new HashMap<>(), this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Pass,
        this.relationalExpressionVerifier.getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass, requirementStateOfCompliance);
    assertTrue(messageBusWasCalled);
  }

  @Test
  void verify_that_state_of_compliances_are_properly_calculated_without_messagebus_calls() {
    this.messageBusWasCalled = false;
    this.requirementStateOfCompliance = RequirementStateOfCompliance.Unknown;

    CDPMessageBus.getCurrent()
        .listen(RequirementStateOfComplianceChangedEvent.class, this.relationalExpression, null)
        .subscribe(x ->
        {
          this.messageBusWasCalled = true;
          this.requirementStateOfCompliance = x.getRequirementStateOfCompliance();
        });

    List<BinaryRelationship> binaryRelationships = this.relationalExpression.getRelationships()
        .stream()
        .filter(x -> x instanceof BinaryRelationship)
        .map(x -> (BinaryRelationship) x)
        .collect(Collectors.toList());

    this.relationalExpressionVerifier
        .verifyRequirementStateOfCompliance(binaryRelationships, this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Unknown, requirementStateOfCompliance);
    assertFalse(messageBusWasCalled);
    assertEquals(RequirementStateOfCompliance.Pass,
        this.relationalExpressionVerifier.getRequirementStateOfCompliance());
  }
}
