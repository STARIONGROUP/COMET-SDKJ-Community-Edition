/*
 * RequirementStateOfCompliance.java
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

package cdp4requirementsverification;

import cdp4common.engineeringmodeldata.BooleanExpression;
import cdp4common.engineeringmodeldata.ParametricConstraint;

/**
 * State of compliance for a {@link ParametricConstraint} or a {@link BooleanExpression}
 */
public enum RequirementStateOfCompliance {
    /**
     * No verification ran yet
     */
    Unknown,

    /**
     * Verification process was started
     */
    Calculating,

    /**
     * Cannot verify because of some reason
     */
    Inconclusive,

    /**
     * All conditions are passed
     */
    Pass,

    /**
     * At least one condition does not pass
     */
    Failed
}
