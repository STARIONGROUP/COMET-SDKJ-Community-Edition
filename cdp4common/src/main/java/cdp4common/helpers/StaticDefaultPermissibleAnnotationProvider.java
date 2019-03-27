/*
 * StaticDefaultPermissibleAnnotationProvider.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
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
