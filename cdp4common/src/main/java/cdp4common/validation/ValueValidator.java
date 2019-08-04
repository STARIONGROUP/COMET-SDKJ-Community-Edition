/*
 * ValueValidator.java
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

package cdp4common.validation;

import cdp4common.engineeringmodeldata.Parameter;
import cdp4common.helpers.Constants;
import cdp4common.sitedirectorydata.*;
import com.google.common.base.Strings;
import lombok.extern.log4j.Log4j2;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.regex.Pattern;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_TIME;
import static java.time.temporal.ChronoField.*;

/**
 * The purpose of the {@link ValueValidator} is to validate the value of a {@link Parameter} with respect to
 * it's referenced {@link ParameterType}. The default value is a hyphen "-", which is a valid value for all {@link ParameterType}s.
 * <p>
 * The {@link ValueValidator} uses the {@link java.util.Locale#ROOT}.
 */
@Log4j2
public class ValueValidator {
    /**
     * The default value that is valid for all {@link ParameterType}s
     */
    public static final String DEFAULT_VALUE = "-";

    /**
     * VALID {@link Boolean} values
     */
    public static final String[] VALID_BOOLEAN = {"-", "true", "false", "True", "False", "1", "0"};

    /**
     * Validates the  to check whether the {@code value} is valid with respect to the {@code parameterType}
     *
     * @param parameterType    A {@link BooleanParameterType}
     * @param value            The value that is to be validated
     * @param measurementScale The measurement Scale.
     * @param format           The {@link NumberFormat} that used to validate, if set to null {@link Locale#getDefault()} will be used.
     * @return a {@link ValidationResult} that carries the {@link ValidationResultKind} and an optional message.
     */
    public static ValidationResult validate(ParameterType parameterType, Object value, MeasurementScale measurementScale, NumberFormat format) {
        ValidationResult result = new ValidationResult();

        if (value instanceof String && value.equals(DEFAULT_VALUE)) {
            result.setResultKind(ValidationResultKind.VALID);
            result.setMessage("");
            return result;
        }

        if (parameterType instanceof BooleanParameterType) {
            return validate((BooleanParameterType) parameterType, value);
        }

        if (parameterType instanceof DateParameterType) {
            return validate((DateParameterType) parameterType, value);
        }

        if (parameterType instanceof DateTimeParameterType) {
            return validate((DateTimeParameterType) parameterType, value);
        }

        if (parameterType instanceof EnumerationParameterType) {
            return validate((EnumerationParameterType) parameterType, value);
        }

        if (parameterType instanceof QuantityKind) {
            return validate((QuantityKind) parameterType, measurementScale, value, format);
        }

        if (parameterType instanceof TextParameterType) {
            return validate((TextParameterType) parameterType, value);
        }

        if (parameterType instanceof TimeOfDayParameterType) {
            return validate((TimeOfDayParameterType) parameterType, value);
        }

        throw new UnsupportedOperationException(String.format("The validate method is not supported for parameterType: %1$s", parameterType));
    }

    /**
     * Validates the {@code value} to check whether it is a {@link Boolean}
     *
     * @param parameterType A {@link BooleanParameterType}
     * @param value         The value that is to be validated.
     * @return a {@link ValidationResult} that carries the {@link ValidationResultKind} and an optional message.
     */
    public static ValidationResult validate(BooleanParameterType parameterType, Object value) {
        ValidationResult result = new ValidationResult();

        if (value instanceof Boolean) {
            result.setResultKind(ValidationResultKind.VALID);
            result.setMessage("");
            return result;
        }

        if (value instanceof Integer) {
            int intValue = (int) value;
            if (intValue == 0 || intValue == 1) {
                result.setResultKind(ValidationResultKind.VALID);
                result.setMessage("");
                return result;
            }
        }

        if (value instanceof String) {
            String lowerCaseValue = ((String) value).toLowerCase();

            if (Arrays.asList(VALID_BOOLEAN).contains(lowerCaseValue)) {
                result.setResultKind(ValidationResultKind.VALID);
                result.setMessage("");
                return result;
            }

            boolean booleanResult = Boolean.parseBoolean((String) value);

            if (booleanResult) {
                result.setResultKind(ValidationResultKind.VALID);
                result.setMessage("");
                return result;
            }
        }

        result.setResultKind(ValidationResultKind.INVALID);
        result.setMessage(String.format("%1$s is not a valid boolean, valid values are: %2$s", value, String.join(",", VALID_BOOLEAN)));
        return result;
    }

    /**
     * Validates the {@code value} to check whether it is a {@link java.time.LocalDate} that does not contain any time data.
     *
     * @param parameterType A {@link DateParameterType}
     * @param value         the string representation of a {@link java.time.LocalDate} value that only contains date data and not any time data.
     * @return a {@link ValidationResult} that carries the {@link ValidationResultKind} and an optional message.
     */
    public static ValidationResult validate(DateParameterType parameterType, Object value) {
        ValidationResult result = new ValidationResult();

        if (value instanceof String) {
            if (value.equals(DEFAULT_VALUE)) {
                result.setResultKind(ValidationResultKind.VALID);
                result.setMessage("");
                return result;
            }

            try {
                LocalDate.parse(value.toString(), ISO_LOCAL_DATE);
                // If exception is not thrown than it is valid date
                result.setResultKind(ValidationResultKind.VALID);
                result.setMessage("");
                return result;
            } catch (Exception ex) {
                log.trace(ex.toString());
            }
        }

        try {
            LocalDate dateValue = (LocalDate) value;
            result.setResultKind(ValidationResultKind.VALID);
            result.setMessage("");
            return result;
        } catch (Exception ex) {
            log.trace(ex.toString());
        }

        result.setResultKind(ValidationResultKind.INVALID);
        result.setMessage(String.format("%1$s is not a valid Date, valid dates are specified in ISO 8601 YYYY-MM-DD", value));
        return result;
    }

    /**
     * Validates the {@code value} to check whether it is a {@link OffsetDateTime}
     *
     * @param parameterType A {@link DateTimeParameterType}
     * @param value         the string representation of a {@link OffsetDateTime} value
     * @return a {@link ValidationResult} that carries the {@link ValidationResultKind} and an optional message.
     */
    public static ValidationResult validate(DateTimeParameterType parameterType, Object value) {
        ValidationResult result = new ValidationResult();

        if (value instanceof String) {
            if (value.equals(DEFAULT_VALUE)) {
                result.setResultKind(ValidationResultKind.VALID);
                result.setMessage("");
                return result;
            }

            try {
                DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                        .parseCaseInsensitive()
                        .append(ISO_LOCAL_DATE)
                        .optionalStart()
                        .appendLiteral('T')
                        .append(ISO_LOCAL_TIME)
                        .optionalStart()
                        .appendFraction(MILLI_OF_SECOND, 0, 9, true)
                        .optionalEnd()
                        .optionalStart()
                        .appendOffset("+HH:mm", "Z")
                        .toFormatter();

                OffsetDateTime dateTime = OffsetDateTime.parse(value.toString(), formatter);
                log.debug(String.format("DateTimeParameterType %1$s validated", dateTime));

                result.setResultKind(ValidationResultKind.VALID);
                result.setMessage("");
                return result;
            } catch (Exception ex) {
                log.debug(ex.toString());

                result.setResultKind(ValidationResultKind.INVALID);
                result.setMessage(String.format("%1$s is not a valid DateTime, valid date-times are specified in ISO 8601, see http://www.w3.org/TR/xmlschema-2/#dateTime.", value));
                return result;
            }
        }

        try {
            OffsetDateTime dateTimeValue = (OffsetDateTime) value;
            log.debug(String.format("DateTimeParameterType %1$s validated", dateTimeValue));

            result.setResultKind(ValidationResultKind.VALID);
            result.setMessage("");
            return result;
        } catch (Exception ex) {
            log.trace(ex.toString());
        }

        result.setResultKind(ValidationResultKind.INVALID);
        result.setMessage(String.format("%1$s is not a valid DateTime, valid date-times are specified in ISO 8601, see http://www.w3.org/TR/xmlschema-2/#dateTime.", value));
        return result;
    }

    /**
     * Validates the {@code value} to check whether it is a valid {@link EnumerationValueDefinition} of the {@link EnumerationParameterType}
     *
     * @param parameterType A {@link EnumerationParameterType}
     * @param value         the string representation of a {@link EnumerationValueDefinition} value
     * @return a {@link ValidationResult} that carries the {@link ValidationResultKind} and an optional message.
     */
    public static ValidationResult validate(EnumerationParameterType parameterType, Object value) {
        ValidationResult result = new ValidationResult();

        if (value instanceof String) {
            if (value.equals(DEFAULT_VALUE)) {
                result.setResultKind(ValidationResultKind.VALID);
                result.setMessage("");
                return result;
            }

            String[] values = ((String) value).split(Pattern.quote(Constants.MULTI_VALUE_ENUM_SEPARATOR));

            if (!parameterType.isAllowMultiSelect() && values.length > 1) {
                result.setResultKind(ValidationResultKind.INVALID);
                result.setMessage(String.format("The %1$s Enumeration ParameterType does not allow multi-selection, multiple values seem to be selected", parameterType.getName()));
                return result;
            }

            for (String enumerationValue : values) {
                boolean any = parameterType.getValueDefinition().stream().anyMatch(x -> x.getShortName().equals(enumerationValue.trim()));
                if (!any) {
                    StringBuilder joinedShortNames = new StringBuilder();
                    Collection<EnumerationValueDefinition> sortedItems = parameterType.getValueDefinition().getSortedItems().values();
                    for (EnumerationValueDefinition enumerationValueDefinition : sortedItems) {
                        if (joinedShortNames.toString().equals("")) {
                            joinedShortNames = new StringBuilder(enumerationValueDefinition.getShortName());
                        } else {
                            joinedShortNames.append(", ").append(enumerationValueDefinition.getShortName());
                        }
                    }

                    result.setResultKind(ValidationResultKind.INVALID);
                    result.setMessage(String.format("The %1$s Enumeration ParameterType does not contain the following value definition %2$s, allowed values are: %3$s", parameterType.getName(), enumerationValue, joinedShortNames));
                    return result;
                }
            }

            result.setResultKind(ValidationResultKind.VALID);
            result.setMessage("");
            return result;
        }

        result.setResultKind(ValidationResultKind.INVALID);
        result.setMessage(String.format("The %1$s Enumeration ParameterType does not contain the following value definition %2$s", parameterType.getName(), value));
        return result;
    }

    /**
     * Validates the  to check whether it is a {@link ScalarParameterType}
     *
     * @param quantityKind A {@link QuantityKind}
     * @param scale        The {@link MeasurementScale}
     * @param value        The value that is to be validated.
     * @param format       The {@link NumberFormat} that used to validate, if set to null {@link Locale#getDefault()} will be used.
     * @return a {@link ValidationResult} that carries the {@link ValidationResultKind} and an optional message.
     */
    public static ValidationResult validate(QuantityKind quantityKind, MeasurementScale scale, Object value, NumberFormat format) {
        ValidationResult result = new ValidationResult();

        if (scale == null) {
            log.error("The scale is null with a quantity kind as the parameter type.");
            result.setResultKind(ValidationResultKind.INVALID);
            result.setMessage("The scale is null with a quantity kind as the parameter type.");
            return result;
        }

        if (value instanceof String && value.equals(DEFAULT_VALUE)) {
            result.setResultKind(ValidationResultKind.VALID);
            result.setMessage("");
            return result;
        }

        result = validate(scale, value, format);
        return result;
    }

    /**
     * Validates the {@code value} to check whether it is Text.
     *
     * @param parameterType A {@link TextParameterType}
     * @param value         The string value that is to be validated.
     * @return a {@link ValidationResult} that carries the {@link ValidationResultKind} and an optional message.
     */
    public static ValidationResult validate(TextParameterType parameterType, Object value) {
        ValidationResult result = new ValidationResult();

        if (value instanceof String) {
            result.setResultKind(ValidationResultKind.VALID);
            result.setMessage("");
        } else {
            result.setResultKind(ValidationResultKind.INVALID);
            result.setMessage(String.format("%1$s is not a valid value for a Text Parameter Type", value));
        }

        return result;
    }

    /**
     * Validates the {@code value} to check whether it is a valid time of day.
     *
     * @param parameterType A {@link TimeOfDayParameterType}
     * @param value         The string value that is to be validated.
     * @return a {@link ValidationResult} that carries the {@link ValidationResultKind} and an optional message.
     */
    public static ValidationResult validate(TimeOfDayParameterType parameterType, Object value) {
        ValidationResult result = new ValidationResult();

        if (value instanceof String) {
            if (value.equals(DEFAULT_VALUE)) {
                result.setResultKind(ValidationResultKind.VALID);
                result.setMessage("");
                return result;
            }

            try {
                DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                        .appendValue(HOUR_OF_DAY, 2)
                        .appendLiteral(':')
                        .appendValue(MINUTE_OF_HOUR, 2)
                        .optionalStart()
                        .appendLiteral(':')
                        .appendValue(SECOND_OF_MINUTE, 2)
                        .optionalStart()
                        .appendFraction(MILLI_OF_SECOND, 0, 9, true)
                        .optionalEnd()
                        .optionalStart()
                        .appendOffset("+HH:mm", "Z")
                        .toFormatter();
                LocalTime.parse(value.toString(), formatter);
                result.setResultKind(ValidationResultKind.VALID);
                result.setMessage("");
                return result;
            } catch (Exception ex) {
                log.trace(ex.toString());
            }
        }

        try {
            LocalTime timeOfDayValue = (LocalTime) value;
            result.setResultKind(ValidationResultKind.VALID);
            result.setMessage("");
            return result;
        } catch (Exception ex) {
            log.trace(ex.toString());
        }

        result.setResultKind(ValidationResultKind.INVALID);
        result.setMessage(String.format("%1$s is not a valid Time of Day, for valid Time Of Day formats see http://www.w3.org/TR/xmlschema-2/#time.", value));
        return result;
    }

    /**
     * Validates whether the provided value is valid with respect to the {@link MeasurementScale}
     *
     * @param measurementScale The {@link MeasurementScale}
     * @param value            The value that is to be validated
     * @param format           The {@link NumberFormat} that used to validate, if set to null {@link Locale#getDefault()} will be used.
     * @return a {@link ValidationResult} that carries the {@link ValidationResultKind} and an optional message.
     */
    public static ValidationResult validate(MeasurementScale measurementScale, Object value, NumberFormat format) {
        ValidationResult result = new ValidationResult();

        switch (measurementScale.getNumberSet()) {
            case INTEGER_NUMBER_SET: {

                boolean isInteger = false;
                int integer = 0;

                if (value instanceof Integer) {
                    isInteger = true;
                    integer = (int) value;
                }

                // the value parameter may be passed as a double, provided it has no digits after
                // the decimal separator, we consider it may be an integer number
                if (value instanceof Double) {
                    double d = (double) value;
                    if (d % 1 == 0) {
                        isInteger = true;
                        integer = (int) d;
                    }
                }

                if (value instanceof String) {
                    try {
                        integer = Integer.parseInt(value.toString());
                        isInteger = true;
                    } catch (Exception ex) {
                        isInteger = false;
                        log.debug(ex.toString());
                    }
                }

                if (!isInteger) {
                    result.setResultKind(ValidationResultKind.INVALID);
                    result.setMessage(String.format("%1$s:\"%2$s\" is not a member of the INTEGER NUMBER SET", value.getClass().getSimpleName(), value));
                    return result;
                }

                if (!Strings.isNullOrEmpty(measurementScale.getMaximumPermissibleValue())) {
                    try {
                        int intMaximumPermissibleValue = Integer.parseInt(measurementScale.getMaximumPermissibleValue());
                        if (measurementScale.isMaximumInclusive() && integer > intMaximumPermissibleValue) {
                            result.setResultKind(ValidationResultKind.OUT_OF_BOUNDS);
                            result.setMessage(String.format("The value \"%1$s\" is greater than the maximum permissible value of \"%2$s\"", integer, intMaximumPermissibleValue));
                            return result;
                        }

                        if (!measurementScale.isMaximumInclusive() && integer >= intMaximumPermissibleValue) {
                            result.setResultKind(ValidationResultKind.OUT_OF_BOUNDS);
                            result.setMessage(String.format("The value \"%1$s\" is greater than or equal to the maximum permissible value of \"%2$s\"", integer, intMaximumPermissibleValue));
                            return result;
                        }
                    } catch (Exception ex) {
                        log.warn(String.format("The MaximumPermissibleValue \"%1$s\" of MeasurementScale \"%2$s\" is not a member of the INTEGER NUMBER SET", measurementScale.getMaximumPermissibleValue(), measurementScale.getIid()), ex);
                    }
                }

                if (!Strings.isNullOrEmpty(measurementScale.getMinimumPermissibleValue())) {
                    try {
                        int intMinimumPermissibleValue = Integer.parseInt(measurementScale.getMinimumPermissibleValue());
                        if (measurementScale.isMinimumInclusive() && integer > intMinimumPermissibleValue) {
                            result.setResultKind(ValidationResultKind.OUT_OF_BOUNDS);
                            result.setMessage(String.format("The value \"%1$s\" is smaller than the minimum permissible value of \"%2$s\"", integer, intMinimumPermissibleValue));
                            return result;
                        }

                        if (!measurementScale.isMinimumInclusive() && integer >= intMinimumPermissibleValue) {
                            result.setResultKind(ValidationResultKind.OUT_OF_BOUNDS);
                            result.setMessage(String.format("The value \"%1$s\" is smaller than or equal to the minimum permissible value of \"%2$s\"", integer, intMinimumPermissibleValue));
                            return result;
                        }
                    } catch (Exception ex) {
                        log.warn(String.format("The MinimumPermissibleValue \"%1$s\" of MeasurementScale \"%2$s\" is not a member of the INTEGER NUMBER SET", measurementScale.getMinimumPermissibleValue(), measurementScale.getIid()), ex);
                    }
                }

                result.setResultKind(ValidationResultKind.VALID);
                result.setMessage("");
                return result;
            }
            case NATURAL_NUMBER_SET: {

                int natural = 0;
                boolean isNatural = false;

                if (value instanceof Integer) {
                    isNatural = true;
                    natural = (int) value;
                }

                // the value parameter may be passed as a double, provided it has no digits after
                // the decimal separator, we consider it may be a natural number
                if (value instanceof Double) {
                    double d = (double) value;
                    if (d % 1 == 0) {
                        isNatural = true;
                        natural = (int) d;
                    }
                }

                if (value instanceof String) {
                    try {
                        natural = Integer.parseInt(value.toString());
                        isNatural = true;
                    } catch (Exception ex) {
                        isNatural = false;
                        log.debug(ex.toString());
                    }
                }

                if (!isNatural) {
                    result.setResultKind(ValidationResultKind.INVALID);
                    result.setMessage(String.format("%1$s:\"%2$s\" is not a member of the NATURAL NUMBER SET", value.getClass().getSimpleName(), value));
                    return result;
                }

                if (natural < 0) {
                    result.setResultKind(ValidationResultKind.INVALID);
                    result.setMessage(String.format("\"%1$s\" is not a member of the NATURAL NUMBER SET", value));
                    return result;
                }

                if (!Strings.isNullOrEmpty(measurementScale.getMaximumPermissibleValue())) {
                    try {
                        int naturalMaximumPermissibleValue = Integer.parseInt(measurementScale.getMaximumPermissibleValue());
                        if (measurementScale.isMaximumInclusive() && natural > naturalMaximumPermissibleValue) {
                            result.setResultKind(ValidationResultKind.OUT_OF_BOUNDS);
                            result.setMessage(String.format("The value \"%1$s\" is greater than the maximum permissible value of \"%2$s\"", natural, naturalMaximumPermissibleValue));
                            return result;
                        }

                        if (!measurementScale.isMaximumInclusive() && natural >= naturalMaximumPermissibleValue) {
                            result.setResultKind(ValidationResultKind.OUT_OF_BOUNDS);
                            result.setMessage(String.format("The value \"%1$s\" is greater than or equal to the maximum permissible value of \"%2$s\"", natural, naturalMaximumPermissibleValue));
                            return result;
                        }
                    } catch (Exception ex) {
                        log.warn(String.format("The MaximumPermissibleValue \"%1$s\" of MeasurementScale \"%2$s\" is not a member of the NATURAL NUMBER SET", measurementScale.getMaximumPermissibleValue(), measurementScale.getIid()), ex);
                    }
                }

                if (!Strings.isNullOrEmpty(measurementScale.getMinimumPermissibleValue())) {
                    try {
                        int naturalMinimumPermissibleValue = Integer.parseInt(measurementScale.getMinimumPermissibleValue());
                        if (measurementScale.isMinimumInclusive() && natural > naturalMinimumPermissibleValue) {
                            result.setResultKind(ValidationResultKind.OUT_OF_BOUNDS);
                            result.setMessage(String.format("The value \"%1$s\" is smaller than the minimum permissible value of \"%2$s\"", natural, naturalMinimumPermissibleValue));
                            return result;
                        }

                        if (!measurementScale.isMinimumInclusive() && natural >= naturalMinimumPermissibleValue) {
                            result.setResultKind(ValidationResultKind.OUT_OF_BOUNDS);
                            result.setMessage(String.format("The value \"%1$s\" is smaller than or equal to the minimum permissible value of \"%2$s\"", natural, naturalMinimumPermissibleValue));
                            return result;
                        }
                    } catch (Exception ex) {
                        log.warn(String.format("The MinimumPermissibleValue \"%1$s\" of MeasurementScale \"%2$s\" is not a member of the NATURAL NUMBER SET", measurementScale.getMinimumPermissibleValue(), measurementScale.getIid()), ex);
                    }
                }

                result.setResultKind(ValidationResultKind.VALID);
                result.setMessage("");
                return result;
            }
            case RATIONAL_NUMBER_SET: {
                log.warn("RATIONAL NUMBER SET currently not validated and always returns ValidationResultKind.VALID");

                result.setResultKind(ValidationResultKind.VALID);
                result.setMessage("RATIONAL NUMBER SET are not validated");
                return result;
            }
            case REAL_NUMBER_SET: {

                double real = 0;
                boolean isReal = false;

                // the real numbers include all the integers
                if (value instanceof Integer) {
                    isReal = true;
                    real = (double) ((int) value);
                }

                if (value instanceof Double) {
                    isReal = true;
                    real = (double) value;
                }

                if (value instanceof String) {
                    try {
                        if (format == null) {
                            // By default comma is not valid
                            if (value.toString().contains(",")) {
                                throw new ParseException("String contains illegal symbol \",\"", value.toString().indexOf(","));
                            }

                            format = NumberFormat.getInstance(Locale.getDefault());
                        }

                        // Check for exponent notation
                        if (value.toString().toLowerCase().contains("e")) {
                            // Try to parse without formatter
                            real = Double.valueOf(value.toString().toLowerCase());
                            isReal = true;
                        } else {
                            ParsePosition position = new ParsePosition(0);
                            Number number = format.parse(value.toString(), position);
                            if (position.getIndex() != value.toString().length()) {
                                throw new ParseException("failed to parse entire string: " + value.toString(), position.getIndex());
                            }
                            real = number.doubleValue();
                            isReal = true;
                        }
                    } catch (Exception ex) {
                        isReal = false;
                        log.debug(ex.toString());
                    }
                }

                if (!isReal) {
                    result.setResultKind(ValidationResultKind.INVALID);
                    result.setMessage(String.format("%1$s:\"%2$s\" is not a member of the REAL NUMBER SET", value.getClass().getSimpleName(), value));
                    return result;
                }

                if (!Strings.isNullOrEmpty(measurementScale.getMaximumPermissibleValue())) {
                    try {
                        double realMaximumPermissibleValue = Double.parseDouble(measurementScale.getMaximumPermissibleValue());
                        if (measurementScale.isMaximumInclusive() && real > realMaximumPermissibleValue) {
                            result.setResultKind(ValidationResultKind.OUT_OF_BOUNDS);
                            result.setMessage(String.format("The value \"%1$s\" is greater than the maximum permissible value of \"%2$s\"", real, realMaximumPermissibleValue));
                            return result;
                        }

                        if (!measurementScale.isMaximumInclusive() && real >= realMaximumPermissibleValue) {
                            result.setResultKind(ValidationResultKind.OUT_OF_BOUNDS);
                            result.setMessage(String.format("The value \"%1$s\" is greater than or equal to the maximum permissible value of \"%2$s\"", real, realMaximumPermissibleValue));
                            return result;
                        }
                    } catch (Exception ex) {
                        log.warn(String.format("The MaximumPermissibleValue \"%1$s\" of MeasurementScale \"%2$s\" is not a member of the REAL NUMBER SET", measurementScale.getMaximumPermissibleValue(), measurementScale.getIid()), ex);
                    }
                }

                if (!Strings.isNullOrEmpty(measurementScale.getMinimumPermissibleValue())) {
                    try {
                        double realMinimumPermissibleValue = Double.parseDouble(measurementScale.getMinimumPermissibleValue());
                        if (measurementScale.isMinimumInclusive() && real > realMinimumPermissibleValue) {
                            result.setResultKind(ValidationResultKind.OUT_OF_BOUNDS);
                            result.setMessage(String.format("The value \"%1$s\" is smaller than the minimum permissible value of \"%2$s\"", real, realMinimumPermissibleValue));
                            return result;
                        }

                        if (!measurementScale.isMinimumInclusive() && real >= realMinimumPermissibleValue) {
                            result.setResultKind(ValidationResultKind.OUT_OF_BOUNDS);
                            result.setMessage(String.format("The value \"%1$s\" is smaller than or equal to the minimum permissible value of \"%2$s\"", real, realMinimumPermissibleValue));
                            return result;
                        }
                    } catch (Exception ex) {
                        log.warn(String.format("The MinimumPermissibleValue \"%1$s\" of MeasurementScale \"%2$s\" is not a member of the REAL NUMBER SET", measurementScale.getMinimumPermissibleValue(), measurementScale.getIid()), ex);
                    }
                }

                result.setResultKind(ValidationResultKind.VALID);
                result.setMessage("");
                return result;
            }
            default:
                throw new IllegalArgumentException("Invalid NumberSetKind");
        }
    }
}
