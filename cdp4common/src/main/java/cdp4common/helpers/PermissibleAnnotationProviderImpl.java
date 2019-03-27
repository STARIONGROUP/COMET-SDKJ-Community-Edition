/* --------------------------------------------------------------------------------------------------------------------
 * PermissibleAnnotationProvider.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
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
 *
 * This is an auto-generated PermissibleAnnotationProvider class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.helpers;

import cdp4common.commondata.ClassKind;

/**
 * A utility class that supplies the ClassKind that support specific Annotation concept
 */
public class PermissibleAnnotationProviderImpl implements PermissibleAnnotationProvider
{
    /**
     * The array of ClassKind that support ReviewItemDiscrepancy
     */
    private final ClassKind[] reviewItemDiscrepancyApplicableClassKind = new ClassKind[] {
        ClassKind.ACTUAL_FINITE_STATE,
        ClassKind.ACTUAL_FINITE_STATE_LIST,
        ClassKind.BINARY_RELATIONSHIP,
        ClassKind.ELEMENT_DEFINITION,
        ClassKind.ELEMENT_USAGE,
        ClassKind.MULTI_RELATIONSHIP,
        ClassKind.OPTION,
        ClassKind.PARAMETER,
        ClassKind.PARAMETER_OVERRIDE,
        ClassKind.PARAMETER_OVERRIDE_VALUE_SET,
        ClassKind.PARAMETER_VALUE_SET,
        ClassKind.POSSIBLE_FINITE_STATE,
        ClassKind.POSSIBLE_FINITE_STATE_LIST,
        ClassKind.REQUIREMENT,
        ClassKind.REQUIREMENTS_GROUP,
        ClassKind.REQUIREMENTS_SPECIFICATION,
    };

    /**
     * The array of ClassKind that support RequestForWaiver
     */
    private final ClassKind[] requestForWaiverApplicableClassKind = new ClassKind[] {
        ClassKind.ACTUAL_FINITE_STATE,
        ClassKind.ACTUAL_FINITE_STATE_LIST,
        ClassKind.BINARY_RELATIONSHIP,
        ClassKind.ELEMENT_DEFINITION,
        ClassKind.ELEMENT_USAGE,
        ClassKind.MULTI_RELATIONSHIP,
        ClassKind.OPTION,
        ClassKind.PARAMETER,
        ClassKind.PARAMETER_OVERRIDE,
        ClassKind.PARAMETER_OVERRIDE_VALUE_SET,
        ClassKind.PARAMETER_VALUE_SET,
        ClassKind.POSSIBLE_FINITE_STATE,
        ClassKind.POSSIBLE_FINITE_STATE_LIST,
        ClassKind.REQUIREMENT,
        ClassKind.REQUIREMENTS_GROUP,
        ClassKind.REQUIREMENTS_SPECIFICATION,
    };

    /**
     * The array of ClassKind that support RequestForDeviation
     */
    private final ClassKind[] requestForDeviationApplicableClassKind = new ClassKind[] {
        ClassKind.ACTUAL_FINITE_STATE,
        ClassKind.ACTUAL_FINITE_STATE_LIST,
        ClassKind.BINARY_RELATIONSHIP,
        ClassKind.ELEMENT_DEFINITION,
        ClassKind.ELEMENT_USAGE,
        ClassKind.MULTI_RELATIONSHIP,
        ClassKind.OPTION,
        ClassKind.PARAMETER,
        ClassKind.PARAMETER_OVERRIDE,
        ClassKind.PARAMETER_OVERRIDE_VALUE_SET,
        ClassKind.PARAMETER_VALUE_SET,
        ClassKind.POSSIBLE_FINITE_STATE,
        ClassKind.POSSIBLE_FINITE_STATE_LIST,
        ClassKind.REQUIREMENT,
        ClassKind.REQUIREMENTS_GROUP,
        ClassKind.REQUIREMENTS_SPECIFICATION,
    };

    /**
     * The array of ClassKind that support ChangeRequest
     */
    private final ClassKind[] changeRequestApplicableClassKind = new ClassKind[] {
        ClassKind.ACTUAL_FINITE_STATE,
        ClassKind.ACTUAL_FINITE_STATE_LIST,
        ClassKind.BINARY_RELATIONSHIP,
        ClassKind.ELEMENT_DEFINITION,
        ClassKind.ELEMENT_USAGE,
        ClassKind.MULTI_RELATIONSHIP,
        ClassKind.OPTION,
        ClassKind.PARAMETER,
        ClassKind.PARAMETER_OVERRIDE,
        ClassKind.PARAMETER_OVERRIDE_VALUE_SET,
        ClassKind.PARAMETER_VALUE_SET,
        ClassKind.POSSIBLE_FINITE_STATE,
        ClassKind.POSSIBLE_FINITE_STATE_LIST,
        ClassKind.REQUIREMENT,
        ClassKind.REQUIREMENTS_GROUP,
        ClassKind.REQUIREMENTS_SPECIFICATION,
    };

    /**
     * Gets the array of ClassKind that support ReviewItemDiscrepancy
     */
    public ClassKind[] getReviewItemDiscrepancyApplicableClassKind() {
        return this.reviewItemDiscrepancyApplicableClassKind;
    }

    /**
     * Gets the array of ClassKind that support RequestForWaiver
     */
    public ClassKind[] getRequestForWaiverApplicableClassKind() {
        return this.requestForWaiverApplicableClassKind;
    }

    /**
     * Gets the array of ClassKind that support RequestForDeviation
     */
    public ClassKind[] getRequestForDeviationApplicableClassKind() {
        return this.requestForDeviationApplicableClassKind;
    }

    /**
     * Gets the array of ClassKind that support ChangeRequest
     */
    public ClassKind[] getChangeRequestApplicableClassKind() {
        return this.changeRequestApplicableClassKind;
    }
}
