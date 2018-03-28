/*
 * StaticDefaultPermissibleAnnotationProvider.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.helpers;

import cdp4common.commondata.ClassKind;

/**
 * A static utility class that supplies the ClassKind that support specific Annotation concept
 */
public class StaticDefaultPermissibleAnnotationProvider {
    /**
     * The {@link PermissibleAnnotationProvider}
     */
    private static PermissibleAnnotationProvider provider = new PermissibleAnnotationProviderImpl();

    /**
     * Gets the array of ClassKind that support ReviewItemDiscrepancy
     */
    public static ClassKind[] getReviewItemDiscrepancyApplicableClassKind() {
        return provider.getReviewItemDiscrepancyApplicableClassKind();
    }

    /**
     * Gets the array of ClassKind that support RequestForWaiver
     */
    public static ClassKind[] getRequestForWaiverApplicableClassKind() {
        return provider.getRequestForWaiverApplicableClassKind();
    }

    /**
     * Gets the array of ClassKind that support RequestForDeviation
     */
    public static ClassKind[] getRequestForDeviationApplicableClassKind() {
        return provider.getRequestForDeviationApplicableClassKind();
    }

    /**
     * Gets the array of ClassKind that support ChangeRequest
     */
    public static ClassKind[] getChangeRequestApplicableClassKind() {
        return provider.getChangeRequestApplicableClassKind();
    }
}
