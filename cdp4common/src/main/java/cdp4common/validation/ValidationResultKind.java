/*
 * ValidationResultKind.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
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

package cdp4common.validation;

import cdp4common.sitedirectorydata.QuantityKind;
import cdp4common.sitedirectorydata.MeasurementScale;

/**
* Enumeration data type that defines the overall result of processing the Parameter sheet
*/
public enum ValidationResultKind {
    /**
    * The validation result is inconclusive
    */        
    IN_CONCLUSIVE(0),

    /**
    * The value is valid
    */
    VALID(1),

    /**
    * The value is valid, but outside of the permissible values
    * <p>
    * This is only relevant for {@link QuantityKind}s where 
     * the {@link MeasurementScale} minimumPermissibleValue and maximumPermissibleValue are set.
    */
    OUT_OF_BOUNDS(2),

    /**
    * The value is invalid
    */
    INVALID(3);


    private final int validationResultKind;

    ValidationResultKind(int validationResultKind) {
        this.validationResultKind = validationResultKind;
    }
}
