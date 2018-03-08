/* --------------------------------------------------------------------------------------------------------------------
 * PermissibleAnnotationProvider.java
 * Copyright (c) 2018 RHEA System S.A.
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.helpers;

import cdp4common.commondata.ClassKind;

/**
 * The permissible annotation provider interface.
 */
public interface PermissibleAnnotationProvider {
    /**
     * Gets the array of ClassKind that support ReviewItemDiscrepancy
     */
    ClassKind[] getReviewItemDiscrepancyApplicableClassKind();

    /**
     * Gets the array of ClassKind that support RequestForWaiver
     */
    ClassKind[] getRequestForWaiverApplicableClassKind();

    /**
     * Gets the array of ClassKind that support RequestForDeviation
     */
    ClassKind[] getRequestForDeviationApplicableClassKind();

    /**
     * Gets the array of ClassKind that support ChangeRequest
     */
    ClassKind[] getChangeRequestApplicableClassKind();
}
