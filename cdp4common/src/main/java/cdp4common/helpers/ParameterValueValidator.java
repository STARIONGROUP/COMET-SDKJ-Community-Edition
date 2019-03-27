/*
 * ParameterValueValidator.java
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

import cdp4common.engineeringmodeldata.ParameterSubscriptionValueSet;
import cdp4common.engineeringmodeldata.ParameterValueSetBase;
import cdp4common.sitedirectorydata.MeasurementScale;
import cdp4common.sitedirectorydata.ParameterType;
import cdp4common.sitedirectorydata.QuantityKind;
import cdp4common.validation.ValidationResult;
import cdp4common.validation.ValidationResultKind;
import cdp4common.validation.ValueValidator;
import lombok.extern.log4j.Log4j2;

/**
 * A utility class that validates a parameter value using the {@link ValueValidator}
 */
@Log4j2
public class ParameterValueValidator {
    /**
     * Validates the new value of a {@link ParameterValueSetBase} or {@link ParameterSubscriptionValueSet} and return an error if any
     *
     * @param newValue      The new value to validate
     * @param parameterType The associated {@link ParameterType}
     * @param scale         An optional {@link MeasurementScale} if the {@code parameterType} is a {@link QuantityKind}
     * @return An error message if any
     */
    public static String validate(Object newValue, ParameterType parameterType, MeasurementScale scale) {
        if (parameterType == null) {
            log.error("The parameter type is null.");
            return "Error: The parameter type is null.";
        }

        String stringValue = ValueSetConverter.toValueSetString(newValue, parameterType);
        ValidationResult result = ValueValidator.validate(parameterType, stringValue, scale, null);
        return (result.getResultKind() == ValidationResultKind.VALID) ? null : result.getMessage();
    }
}
