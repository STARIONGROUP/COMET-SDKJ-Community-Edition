/* --------------------------------------------------------------------------------------------------------------------
 * PermissibleAnnotationProvider.java
 * Copyright (c) 2018 RHEA System S.A.
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
