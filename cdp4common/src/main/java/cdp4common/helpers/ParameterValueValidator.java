/*
 * ParameterValueValidator.java
 * Copyright (c) 2018 RHEA System S.A.
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

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A utility class that validates a parameter value using the {@link ValueValidator}
 */
public class ParameterValueValidator {
    /**
     * The logger
     */
    private static Logger LOGGER = Logger.getLogger(ParameterValueValidator.class.getName());

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
            LOGGER.log(Level.SEVERE, "The parameter type is null.");
            return "Error: The parameter type is null.";
        }

        String stringValue = ValueSetConverter.toValueSetString(newValue, parameterType);
        ValidationResult result = ValueValidator.validate(parameterType, stringValue, scale, null);
        return (result.getResultKind() == ValidationResultKind.VALID) ? null : result.getMessage();
    }
}
