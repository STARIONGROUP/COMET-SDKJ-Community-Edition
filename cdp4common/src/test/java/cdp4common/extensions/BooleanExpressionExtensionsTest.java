// --------------------------------------------------------------------------------------------------------------------
// <copyright file="BooleanExpressionExtensionsTest.java" company="RHEA System S.A.">
//    Copyright (c) 2015-2019 RHEA System S.A.
//
//    Author: Sam Gerené, Merlin Bieze, Alex Vorobiev, Naron Phou, Alexander van Delft, Yevhen Ikonnykov
//
//    This file is part of CDP4-SDK Community Edition
//
//    The CDP4-SDK Community Edition is free software; you can redistribute it and/or
//    modify it under the terms of the GNU Lesser General Public
//    License as published by the Free Software Foundation; either
//    version 3 of the License, or (at your option) any later version.
//
//    The CDP4-SDK Community Edition is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//    Lesser General Public License for more details.
//
//    You should have received a copy of the GNU Lesser General Public License
//    along with this program; if not, write to the Free Software Foundation,
//    Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
// </copyright>
// --------------------------------------------------------------------------------------------------------------------

package cdp4common.extensions;

import static org.assertj.core.api.Assertions.assertThat;

import cdp4common.ExpressionNumber;
import cdp4common.engineeringmodeldata.AndExpression;
import cdp4common.engineeringmodeldata.BooleanExpression;
import cdp4common.engineeringmodeldata.ExclusiveOrExpression;
import cdp4common.engineeringmodeldata.NotExpression;
import cdp4common.engineeringmodeldata.OrExpression;
import cdp4common.engineeringmodeldata.RelationalExpression;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Suite of tests for the {@link BooleanExpressionExtensions} class
 */
class BooleanExpressionExtensionsTest {

  private List<BooleanExpression> booleanExpressions;

  /**
   * Because we are using TestCase as a source, a static object must be used to execute tests. In
   * the Testcases, the {@link ExpressionNumber} enum is used and runtime the matching {@link
   * BooleanExpression} can be found in this {@link Map}
   */
  private Map<ExpressionNumber, BooleanExpression> testCaseList;

  private AndExpression andExpression;

  private OrExpression orExpression;

  private ExclusiveOrExpression exclusiveOrExpression;

  private NotExpression notExpression;

  private RelationalExpression relationalExpression1;

  private RelationalExpression relationalExpression2;

  private RelationalExpression relationalExpression3;

  private RelationalExpression relationalExpression4;

  @BeforeEach
  void setUp() {
    this.andExpression = new AndExpression();
    this.orExpression = new OrExpression();
    this.exclusiveOrExpression = new ExclusiveOrExpression();
    this.notExpression = new NotExpression();
    this.relationalExpression1 = new RelationalExpression();
    this.relationalExpression2 = new RelationalExpression();
    this.relationalExpression3 = new RelationalExpression();
    this.relationalExpression4 = new RelationalExpression();

    this.booleanExpressions = Lists.newArrayList(
        this.andExpression,
        this.orExpression,
        this.exclusiveOrExpression,
        this.notExpression,
        this.relationalExpression1,
        this.relationalExpression2,
        this.relationalExpression3,
        this.relationalExpression4
    );

    this.testCaseList = Map.of(
        ExpressionNumber.And, this.andExpression,
        ExpressionNumber.Or, this.orExpression,
        ExpressionNumber.ExclusiveOr, this.exclusiveOrExpression,
        ExpressionNumber.Not, this.notExpression,
        ExpressionNumber.Relational1, this.relationalExpression1,
        ExpressionNumber.Relational2, this.relationalExpression2,
        ExpressionNumber.Relational3, this.relationalExpression3,
        ExpressionNumber.Relational4, this.relationalExpression4
    );
  }

  @ParameterizedTest
  @EnumSource(ExpressionNumber.class)
  void verifyThatAllBooleanExpressionsAreReturned(ExpressionNumber expressionNumber) {
    var toplevelCollection = BooleanExpressionExtensions
        .getTopLevelExpressions(this.booleanExpressions);

    assertThat(toplevelCollection).contains(this.testCaseList.get(expressionNumber));
  }

  private static Stream<Arguments> provideTestCasesSet1() {
    return Stream.of(
        Arguments.of(ExpressionNumber.And, true),
        Arguments.of(ExpressionNumber.Or, true),
        Arguments.of(ExpressionNumber.ExclusiveOr, true),
        Arguments.of(ExpressionNumber.Not, true),
        Arguments.of(ExpressionNumber.Relational1, false),
        Arguments.of(ExpressionNumber.Relational2, false),
        Arguments.of(ExpressionNumber.Relational3, true),
        Arguments.of(ExpressionNumber.Relational4, true));
  }

  @ParameterizedTest
  @MethodSource("provideTestCasesSet1")
  void verifyThatAllCollectionChecksAreOKWhenRelationalExpressionsAreAddedToAndExpression(
      ExpressionNumber expressionNumber, boolean shouldContain) {
    this.andExpression.getTerm().add(this.relationalExpression1);
    this.andExpression.getTerm().add(this.relationalExpression2);

    var toplevelCollection = BooleanExpressionExtensions
        .getTopLevelExpressions(this.booleanExpressions);

    if (shouldContain) {
      assertThat(toplevelCollection).contains(this.testCaseList.get(expressionNumber));
    } else {
      assertThat(this.testCaseList.get(expressionNumber)).isNotIn(toplevelCollection);
    }
  }

  @ParameterizedTest
  @MethodSource("provideTestCasesSet1")
  void verifyThatAllCollectionChecksAreOKWhenRelationalExpressionsAreAddedToOrExpression(
      ExpressionNumber expressionNumber, boolean shouldContain) {
    this.orExpression.getTerm().add(this.relationalExpression1);
    this.orExpression.getTerm().add(this.relationalExpression2);

    var toplevelCollection = BooleanExpressionExtensions
        .getTopLevelExpressions(this.booleanExpressions);

    if (shouldContain) {
      assertThat(toplevelCollection).contains(this.testCaseList.get(expressionNumber));
    } else {
      assertThat(this.testCaseList.get(expressionNumber)).isNotIn(toplevelCollection);
    }
  }

  @ParameterizedTest
  @MethodSource("provideTestCasesSet1")
  void verifyThatAllCollectionChecksAreOKWhenRelationalExpressionsAreAddedToExclusiveOrExpression(
      ExpressionNumber expressionNumber, boolean shouldContain) {
    this.exclusiveOrExpression.getTerm().add(this.relationalExpression1);
    this.exclusiveOrExpression.getTerm().add(this.relationalExpression2);

    var toplevelCollection = BooleanExpressionExtensions
        .getTopLevelExpressions(this.booleanExpressions);

    if (shouldContain) {
      assertThat(toplevelCollection).contains(this.testCaseList.get(expressionNumber));
    } else {
      assertThat(this.testCaseList.get(expressionNumber)).isNotIn(toplevelCollection);
    }
  }

  private static Stream<Arguments> provideTestCasesSet2() {
    return Stream.of(
        Arguments.of(ExpressionNumber.And, true),
        Arguments.of(ExpressionNumber.Or, true),
        Arguments.of(ExpressionNumber.ExclusiveOr, true),
        Arguments.of(ExpressionNumber.Not, true),
        Arguments.of(ExpressionNumber.Relational1, false),
        Arguments.of(ExpressionNumber.Relational2, true),
        Arguments.of(ExpressionNumber.Relational3, true),
        Arguments.of(ExpressionNumber.Relational4, true));
  }

  @ParameterizedTest
  @MethodSource("provideTestCasesSet2")
  void verifyThatAllCollectionChecksAreOKWhenRelationalExpressionIsAddedToNotExpression(
      ExpressionNumber expressionNumber, boolean shouldContain) {
    this.notExpression.setTerm(this.relationalExpression1);

    var toplevelCollection = BooleanExpressionExtensions
        .getTopLevelExpressions(this.booleanExpressions);

    if (shouldContain) {
      assertThat(toplevelCollection).contains(this.testCaseList.get(expressionNumber));
    } else {
      assertThat(this.testCaseList.get(expressionNumber)).isNotIn(toplevelCollection);
    }
  }

  private static Stream<Arguments> provideTestCasesSet3() {
    return Stream.of(
        Arguments.of(ExpressionNumber.And, false),
        Arguments.of(ExpressionNumber.Or, false),
        Arguments.of(ExpressionNumber.ExclusiveOr, false),
        Arguments.of(ExpressionNumber.Not, true),
        Arguments.of(ExpressionNumber.Relational1, false),
        Arguments.of(ExpressionNumber.Relational2, false),
        Arguments.of(ExpressionNumber.Relational3, false),
        Arguments.of(ExpressionNumber.Relational4, false));
  }

  @ParameterizedTest
  @MethodSource("provideTestCasesSet3")
  void verifyThatAllCollectionChecksAreOKWhenRelationalExpressionsAreNested(
      ExpressionNumber expressionNumber, boolean shouldContain) {
    this.andExpression.getTerm().add(this.relationalExpression1);
    this.andExpression.getTerm().add(this.relationalExpression2);

    this.orExpression.getTerm().add(this.relationalExpression3);
    this.orExpression.getTerm().add(this.relationalExpression4);

    this.exclusiveOrExpression.getTerm()
        .addAll(List.of(this.andExpression, this.orExpression));

    this.notExpression.setTerm(this.exclusiveOrExpression);

    var toplevelCollection = BooleanExpressionExtensions
        .getTopLevelExpressions(this.booleanExpressions);

    if (shouldContain) {
      assertThat(toplevelCollection).contains(this.testCaseList.get(expressionNumber));
    } else {
      assertThat(this.testCaseList.get(expressionNumber)).isNotIn(toplevelCollection);
    }
  }
}
