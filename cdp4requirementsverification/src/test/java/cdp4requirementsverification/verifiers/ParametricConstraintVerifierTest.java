/*
 * ParametricConstraintVerifierTest.java
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

import cdp4common.engineeringmodeldata.AndExpression;
import cdp4common.engineeringmodeldata.BinaryRelationship;
import cdp4common.engineeringmodeldata.ElementDefinition;
import cdp4common.engineeringmodeldata.ElementUsage;
import cdp4common.engineeringmodeldata.ExclusiveOrExpression;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.NotExpression;
import cdp4common.engineeringmodeldata.Option;
import cdp4common.engineeringmodeldata.OrExpression;
import cdp4common.engineeringmodeldata.Parameter;
import cdp4common.engineeringmodeldata.ParameterOrOverrideBase;
import cdp4common.engineeringmodeldata.ParameterOverride;
import cdp4common.engineeringmodeldata.ParameterOverrideValueSet;
import cdp4common.engineeringmodeldata.ParameterSwitchKind;
import cdp4common.engineeringmodeldata.ParametricConstraint;
import cdp4common.engineeringmodeldata.RelationalExpression;
import cdp4common.engineeringmodeldata.RelationalOperatorKind;
import cdp4common.types.ValueArray;
import cdp4requirementsverification.RequirementStateOfCompliance;
import cdp4requirementsverification.builders.ParameterBuilder;
import cdp4requirementsverification.builders.RelationalExpressionBuilder;
import java.util.Arrays;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Suite of tests for the {@link ParametricConstraintVerifier} class.
 */
class ParametricConstraintVerifierTest {

  private ParametricConstraintVerifier parametricConstraintVerifier;

  private ParametricConstraint parametricConstraint;

  private OrExpression orExpression;

  private AndExpression andExpression;

  private ExclusiveOrExpression exclusiveOrExpression;

  private NotExpression notExpression;

  private RelationalExpression relationalExpression1;

  private RelationalExpression relationalExpression2;

  private RelationalExpression relationalExpression3;

  private RelationalExpression relationalExpression4;

  private Iteration iteration;

  private Parameter parameter;

  private ParameterOverrideValueSet parameterOverrideValueSet;

  private final String okValue = "10";

  private final String notOkValue = "11";

  private Option option1;

  private Option option2;

  private ElementDefinition elementDefinition;

  @BeforeEach
  void setUp() {
    this.parametricConstraint = new ParametricConstraint(
        UUID.fromString("1f12693d-e0dc-4f0a-aa58-6c947cd292dd"), null, null);
    this.orExpression = new OrExpression(UUID.fromString("8867714a-a7fc-494f-8e90-e602ea1f1d19"),
        null, null);
    this.andExpression = new AndExpression(UUID.fromString("aa28b7c9-9c31-44d0-8489-69f8b36718e4"),
        null, null);
    this.exclusiveOrExpression = new ExclusiveOrExpression(
        UUID.fromString("3da6cc6b-82bc-4c9a-bb3a-8d42c531772b"), null, null);
    this.notExpression = new NotExpression(UUID.fromString("0b9e96d6-2ec3-44c7-9845-3b9d8dcf6a77"),
        null, null);

    this.relationalExpression1 =
        new RelationalExpressionBuilder()
            .withSimpleQuantityKindParameterType()
            .withRelationalOperatorKind(RelationalOperatorKind.EQ)
            .withValue(okValue)
            .build();

    this.relationalExpression2 =
        new RelationalExpressionBuilder()
            .withSimpleQuantityKindParameterType()
            .withRelationalOperatorKind(RelationalOperatorKind.EQ)
            .withValue(okValue)
            .build();

    this.relationalExpression3 =
        new RelationalExpressionBuilder()
            .withSimpleQuantityKindParameterType()
            .withRelationalOperatorKind(RelationalOperatorKind.EQ)
            .withValue(okValue)
            .build();

    this.relationalExpression4 =
        new RelationalExpressionBuilder()
            .withSimpleQuantityKindParameterType()
            .withRelationalOperatorKind(RelationalOperatorKind.EQ)
            .withValue(okValue)
            .build();

    this.orExpression.getTerm().add(this.relationalExpression1);
    this.orExpression.getTerm().add(this.relationalExpression2);
    this.andExpression.getTerm().add(this.relationalExpression3);
    this.andExpression.getTerm().add(this.relationalExpression4);
    this.exclusiveOrExpression.getTerm().add(this.relationalExpression3);
    this.exclusiveOrExpression.getTerm().add(this.relationalExpression4);

    this.parametricConstraint.getExpression().add(this.andExpression);
    this.parametricConstraint.getExpression().add(this.orExpression);
    this.parametricConstraint.getExpression().add(this.exclusiveOrExpression);
    this.parametricConstraint.getExpression().add(this.notExpression);
    this.parametricConstraint.getExpression().add(this.relationalExpression1);
    this.parametricConstraint.getExpression().add(this.relationalExpression2);
    this.parametricConstraint.getExpression().add(this.relationalExpression3);
    this.parametricConstraint.getExpression().add(this.relationalExpression4);

    this.parametricConstraintVerifier = new ParametricConstraintVerifier(this.parametricConstraint);

    this.iteration = new Iteration(UUID.randomUUID(), null, null);

    this.option1 = new Option();
    this.option2 = new Option();
    this.iteration.getOption().add(this.option1);
    this.iteration.getOption().add(this.option2);

    this.elementDefinition = new ElementDefinition(UUID.randomUUID(), null, null);
    ElementUsage elementUsage = new ElementUsage(UUID.randomUUID(), null, null);
    elementUsage.setElementDefinition(this.elementDefinition);
    this.elementDefinition.getContainedElement().add(elementUsage);

    this.parameter =
        new ParameterBuilder()
            .withOption(this.option1)
            .withSimpleQuantityKindParameterType()
            .withValue(okValue)
            .addToElementDefinition(this.elementDefinition)
            .build();

    this.iteration.getElement().add(this.elementDefinition);

    ParameterOverride parameterOverride = new ParameterOverride(
        UUID.fromString("1f12693d-e0dc-4f0a-aa58-6c947cd292dd"), null, null);
    parameterOverride.setParameter(this.parameter);
    this.parameterOverrideValueSet = new ParameterOverrideValueSet();
    this.parameterOverrideValueSet.setValueSwitch(ParameterSwitchKind.MANUAL);
    this.parameterOverrideValueSet.setManual(new ValueArray<>(Arrays.asList(okValue), String.class));
    parameterOverride.getValueSet().add(this.parameterOverrideValueSet);
    elementUsage.getParameterOverride().add(parameterOverride);

    this.registerBinaryRelationShip(this.parameter, this.relationalExpression1);
    this.registerBinaryRelationShip(parameterOverride, this.relationalExpression2);
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
  void verify_that_state_of_compliances_are_properly_set_when_valuesets_match() {
    this.parametricConstraintVerifier.verifyRequirements(this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression1).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression2).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.orExpression)
            .getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression3).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression4).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.andExpression)
            .getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.exclusiveOrExpression).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.notExpression)
            .getRequirementStateOfCompliance());
  }

  @Test
  void verify_that_state_of_compliances_are_properly_set_when_valuesets_do_not_match() {
    this.parameter.getValueSet().get(0)
        .setManual(new ValueArray<>(Arrays.asList(notOkValue), String.class));
    this.parameterOverrideValueSet.setManual(new ValueArray<>(Arrays.asList(notOkValue), String.class));

    this.parametricConstraintVerifier.verifyRequirements(this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression1).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression2).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.orExpression)
            .getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression3).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression4).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.andExpression)
            .getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.exclusiveOrExpression).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.notExpression)
            .getRequirementStateOfCompliance());
  }

  @Test
  void verify_that_state_of_compliances_are_properly_set_when_a_notExpression_is_used_on_a_orExpression_that_is_compliant() {
    this.notExpression.setTerm(this.orExpression);
    this.parametricConstraintVerifier.verifyRequirements(this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression1).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression2).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.orExpression)
            .getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.notExpression)
            .getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression3).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression4).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.andExpression)
            .getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.exclusiveOrExpression).getRequirementStateOfCompliance());
  }

  @Test
  void verify_that_state_of_compliances_are_properly_set_when_a_notExpression_is_used_on_a_orExpression_that_is_not_compliant() {
    this.notExpression.setTerm(this.orExpression);
    this.parameter.getValueSet().get(0)
        .setManual(new ValueArray<>(Arrays.asList(notOkValue), String.class));
    this.parameterOverrideValueSet.setManual(new ValueArray<>(Arrays.asList(notOkValue), String.class));

    this.parametricConstraintVerifier.verifyRequirements(this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression1).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression2).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.orExpression)
            .getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.notExpression)
            .getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression3).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression4).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.andExpression)
            .getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.exclusiveOrExpression).getRequirementStateOfCompliance());
  }

  @Test
  void verify_that_state_of_compliances_are_properly_set_when_a_orExpression_is_partially_compliant() {
    this.parameterOverrideValueSet.setManual(new ValueArray<>(Arrays.asList(notOkValue), String.class));
    this.parametricConstraintVerifier.verifyRequirements(this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression1).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression2).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.orExpression)
            .getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression3).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression4).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.andExpression)
            .getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.exclusiveOrExpression).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Inconclusive,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.notExpression)
            .getRequirementStateOfCompliance());
  }

  @Test
  void verify_that_state_of_compliances_are_properly_set_when_valuesets_are_compliant() {
    Parameter parameter1 = new ParameterBuilder()
        .withOption(this.option1)
        .withSimpleQuantityKindParameterType()
        .withValue(okValue)
        .addToElementDefinition(this.elementDefinition)
        .build();

    Parameter parameter2 = new ParameterBuilder()
        .withOption(this.option1)
        .withSimpleQuantityKindParameterType()
        .withValue(okValue)
        .addToElementDefinition(this.elementDefinition)
        .build();

    this.registerBinaryRelationShip(parameter1, this.relationalExpression3);
    this.registerBinaryRelationShip(parameter2, this.relationalExpression4);

    this.notExpression.setTerm(this.andExpression);

    this.parametricConstraintVerifier.verifyRequirements(this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression1).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression2).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.orExpression)
            .getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression3).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression4).getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.andExpression)
            .getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.exclusiveOrExpression).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.notExpression)
            .getRequirementStateOfCompliance());

    this.notExpression.setTerm(this.exclusiveOrExpression);
    this.parametricConstraintVerifier.verifyRequirements(this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.exclusiveOrExpression).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.notExpression)
            .getRequirementStateOfCompliance());
  }

  @Test
  void verify_that_state_of_compliances_are_properly_set_when_valuesets_are_not_compliant() {
    Parameter parameter1 = new ParameterBuilder()
        .withOption(this.option1)
        .withSimpleQuantityKindParameterType()
        .withValue(notOkValue)
        .addToElementDefinition(this.elementDefinition)
        .build();

    Parameter parameter2 = new ParameterBuilder()
        .withOption(this.option1)
        .withSimpleQuantityKindParameterType()
        .withValue(notOkValue)
        .addToElementDefinition(this.elementDefinition)
        .build();

    this.registerBinaryRelationShip(parameter1, this.relationalExpression3);
    this.registerBinaryRelationShip(parameter2, this.relationalExpression4);

    this.notExpression.setTerm(this.andExpression);

    this.parametricConstraintVerifier.verifyRequirements(this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression1).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression2).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.orExpression)
            .getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression3).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression4).getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.andExpression)
            .getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.exclusiveOrExpression).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.notExpression)
            .getRequirementStateOfCompliance());

    this.notExpression.setTerm(this.exclusiveOrExpression);
    this.parametricConstraintVerifier.verifyRequirements(this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.notExpression)
            .getRequirementStateOfCompliance());
  }

  @Test
  void verify_that_state_of_compliances_are_properly_set_when_valuesets_are_partially_compliant() {
    Parameter parameter1 = new ParameterBuilder()
        .withOption(this.option1)
        .withSimpleQuantityKindParameterType()
        .withValue(notOkValue)
        .addToElementDefinition(this.elementDefinition)
        .build();

    Parameter parameter2 = new ParameterBuilder()
        .withOption(this.option1)
        .withSimpleQuantityKindParameterType()
        .withValue(okValue)
        .addToElementDefinition(this.elementDefinition)
        .build();

    this.registerBinaryRelationShip(parameter1, this.relationalExpression3);
    this.registerBinaryRelationShip(parameter2, this.relationalExpression4);

    this.notExpression.setTerm(this.andExpression);

    this.parametricConstraintVerifier.verifyRequirements(this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression1).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression2).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.orExpression)
            .getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression3).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.relationalExpression4).getRequirementStateOfCompliance());

    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.andExpression)
            .getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers()
            .get(this.exclusiveOrExpression).getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Pass,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.notExpression)
            .getRequirementStateOfCompliance());

    this.notExpression.setTerm(this.exclusiveOrExpression);
    this.parametricConstraintVerifier.verifyRequirements(this.iteration).join();

    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getRequirementStateOfCompliance());
    assertEquals(RequirementStateOfCompliance.Failed,
        this.parametricConstraintVerifier.getBooleanExpressionVerifiers().get(this.notExpression)
            .getRequirementStateOfCompliance());
  }
}
