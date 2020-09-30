/*
 * RequirementStateOfComplianceCalculatorImplTest.java
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

package cdp4requirementsverification.calculations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cdp4common.engineeringmodeldata.Parameter;
import cdp4common.engineeringmodeldata.RelationalExpression;
import cdp4common.engineeringmodeldata.RelationalOperatorKind;
import cdp4requirementsverification.RequirementStateOfCompliance;
import cdp4requirementsverification.builders.ParameterBuilder;
import cdp4requirementsverification.builders.RelationalExpressionBuilder;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


/**
 * Suite of tests for the {@link RequirementStateOfComplianceCalculatorImplTest} class.
 */
class RequirementStateOfComplianceCalculatorImplTest {
    private RequirementStateOfComplianceCalculator requirementStateOfComplianceCalculator;

    private static final double HighValue = 2D;
    private static final double LowValue = 1D;

    @BeforeEach
    void setUp() {
        this.requirementStateOfComplianceCalculator = new RequirementStateOfComplianceCalculatorImpl();
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void verify_that_state_of_compliances_are_properly_calculated(
            double value1, double value2, RelationalOperatorKind relationalOperatorKind, RequirementStateOfCompliance expectedResult) {
      RelationalExpression relationalExpression =
                new RelationalExpressionBuilder()
                        .withSimpleQuantityKindParameterType()
                        .withValue(value1)
                        .withRelationalOperatorKind(relationalOperatorKind)
                        .build();

      Parameter parameter = new ParameterBuilder()
                .withSimpleQuantityKindParameterType()
                .withValue(value2)
                .build();

        assertEquals(expectedResult, this.requirementStateOfComplianceCalculator.calculate(parameter.getValueSet().get(0), relationalExpression));
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(LowValue, LowValue, RelationalOperatorKind.EQ, RequirementStateOfCompliance.Pass),
                Arguments.of(LowValue, LowValue, RelationalOperatorKind.NE, RequirementStateOfCompliance.Failed),
                Arguments.of(LowValue, LowValue, RelationalOperatorKind.GE, RequirementStateOfCompliance.Pass),
                Arguments.of(LowValue, LowValue, RelationalOperatorKind.GT, RequirementStateOfCompliance.Failed),
                Arguments.of(LowValue, LowValue, RelationalOperatorKind.LE, RequirementStateOfCompliance.Pass),
                Arguments.of(LowValue, LowValue, RelationalOperatorKind.LT, RequirementStateOfCompliance.Failed),

                Arguments.of(LowValue, HighValue, RelationalOperatorKind.EQ, RequirementStateOfCompliance.Failed),
                Arguments.of(LowValue, HighValue, RelationalOperatorKind.NE, RequirementStateOfCompliance.Pass),
                Arguments.of(LowValue, HighValue, RelationalOperatorKind.GE, RequirementStateOfCompliance.Pass),
                Arguments.of(LowValue, HighValue, RelationalOperatorKind.GT, RequirementStateOfCompliance.Pass),
                Arguments.of(LowValue, HighValue, RelationalOperatorKind.LE, RequirementStateOfCompliance.Failed),
                Arguments.of(LowValue, HighValue, RelationalOperatorKind.LT, RequirementStateOfCompliance.Failed),

                Arguments.of(HighValue, LowValue, RelationalOperatorKind.EQ, RequirementStateOfCompliance.Failed),
                Arguments.of(HighValue, LowValue, RelationalOperatorKind.NE, RequirementStateOfCompliance.Pass),
                Arguments.of(HighValue, LowValue, RelationalOperatorKind.GE, RequirementStateOfCompliance.Failed),
                Arguments.of(HighValue, LowValue, RelationalOperatorKind.GT, RequirementStateOfCompliance.Failed),
                Arguments.of(HighValue, LowValue, RelationalOperatorKind.LE, RequirementStateOfCompliance.Pass),
                Arguments.of(HighValue, LowValue, RelationalOperatorKind.LT, RequirementStateOfCompliance.Pass),

                Arguments.of(HighValue, HighValue, RelationalOperatorKind.EQ, RequirementStateOfCompliance.Pass),
                Arguments.of(HighValue, HighValue, RelationalOperatorKind.NE, RequirementStateOfCompliance.Failed),
                Arguments.of(HighValue, HighValue, RelationalOperatorKind.GE, RequirementStateOfCompliance.Pass),
                Arguments.of(HighValue, HighValue, RelationalOperatorKind.GT, RequirementStateOfCompliance.Failed),
                Arguments.of(HighValue, HighValue, RelationalOperatorKind.LE, RequirementStateOfCompliance.Pass),
                Arguments.of(HighValue, HighValue, RelationalOperatorKind.LT, RequirementStateOfCompliance.Failed));
    }
}
