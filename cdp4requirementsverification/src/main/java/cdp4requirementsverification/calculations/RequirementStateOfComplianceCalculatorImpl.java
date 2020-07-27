/*
 * RequirementStateOfComplianceCalculatorImpl.java
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

import cdp4common.comparators.*;
import cdp4common.engineeringmodeldata.ParameterValueSetBase;
import cdp4common.engineeringmodeldata.RelationalExpression;
import cdp4common.sitedirectorydata.ParameterType;
import cdp4common.types.ValueArray;
import cdp4requirementsverification.RequirementStateOfCompliance;

import java.util.Comparator;

/**
 * Implementation of the {@link RequirementStateOfComplianceCalculator} interface that is used for the calculation of a {@link RequirementStateOfCompliance}
 */
public class RequirementStateOfComplianceCalculatorImpl implements RequirementStateOfComplianceCalculator {

    /**
     * The method that performs the necessary calculations and and returns the {@link RequirementStateOfCompliance} based on those calculations
     *
     * @param valueSet             The {@link ParameterValueSetBase} that is used for calculations
     * @param relationalExpression The {@link RelationalExpression} that is used for calculations
     * @return {@link RequirementStateOfCompliance} based on the calculations
     */
    public RequirementStateOfCompliance calculate(ParameterValueSetBase valueSet, RelationalExpression relationalExpression) {
        var comparator = this.getValueSetComparator(relationalExpression);

        switch (relationalExpression.getRelationalOperator()) {
            case EQ:
                return comparator.compare(valueSet.getActualValue(), relationalExpression.getValue()) == 0
                        ? RequirementStateOfCompliance.Pass
                        : RequirementStateOfCompliance.Failed;

            case GE:
                return comparator.compare(valueSet.getActualValue(), relationalExpression.getValue()) >= 0
                        ? RequirementStateOfCompliance.Pass
                        : RequirementStateOfCompliance.Failed;

            case GT:
                return comparator.compare(valueSet.getActualValue(), relationalExpression.getValue()) > 0
                        ? RequirementStateOfCompliance.Pass
                        : RequirementStateOfCompliance.Failed;

            case LE:
                return comparator.compare(valueSet.getActualValue(), relationalExpression.getValue()) <= 0
                        ? RequirementStateOfCompliance.Pass
                        : RequirementStateOfCompliance.Failed;

            case LT:
                return comparator.compare(valueSet.getActualValue(), relationalExpression.getValue()) < 0
                        ? RequirementStateOfCompliance.Pass
                        : RequirementStateOfCompliance.Failed;

            case NE:
                return comparator.compare(valueSet.getActualValue(), relationalExpression.getValue()) != 0
                        ? RequirementStateOfCompliance.Pass
                        : RequirementStateOfCompliance.Failed;

            default:
                throw new IllegalArgumentException(String.format("Unknown relational operator %s", relationalExpression.getRelationalOperator()));
        }
    }

    /**
     * Gets the ValueSet Comparator for this kind of {@link ParameterType}
     *
     * @param relationalExpression The {@link RelationalExpression}
     * @return The {@link Comparator<ValueArray>}
     */
    private Comparator<ValueArray<String>> getValueSetComparator(RelationalExpression relationalExpression) {
        Comparator<ValueArray<String>> comparator;

        switch (relationalExpression.getParameterType().getClassKind()) {
            case SpecializedQuantityKind:
            case DerivedQuantityKind:
            case SimpleQuantityKind:
                comparator = new QuantityKindValueSetComparator();
                break;

            case BooleanParameterType:
                comparator = new BooleanValueSetComparator();
                break;

            case EnumerationParameterType:
                comparator = new EnumerationValueSetComparator();
                break;

            case DateParameterType:
            case DateTimeParameterType:
            case TimeOfDayParameterType:
            case TextParameterType:
                comparator = new DateTimeValueSetComparator();
                break;

            default:
                comparator = new StringValueSetComparator();
                break;
        }

        return comparator;
    }
}
