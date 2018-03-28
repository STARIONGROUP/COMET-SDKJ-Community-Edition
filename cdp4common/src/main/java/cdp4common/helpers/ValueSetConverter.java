/*
 * ValueSetConverter.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.helpers;

import cdp4common.commondata.DefinedThing;
import cdp4common.sitedirectorydata.EnumerationParameterType;
import cdp4common.sitedirectorydata.EnumerationValueDefinition;
import cdp4common.sitedirectorydata.ParameterType;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.MoreCollectors;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * Converter used to associate a string value in the ValueArray to an object which type depend on the Parameter-type
 */
public class ValueSetConverter {
    /**
     * The logger
     */
    private static Logger LOGGER = Logger.getLogger(ValueSetConverter.class.getName());

    /**
     * Convert an object to a string to post to the data-source
     *
     * @param value         The object to convert
     * @param parameterType The {@link ParameterType} associated to the value to convert
     * @return The string value
     */
    public static String toValueSetString(Object value, ParameterType parameterType) {
        if (parameterType == null) {
            throw new NullPointerException("parameterType");
        }

        if (value == null) {
            return "-";
        }

        if (value.toString().equals("-")) {
            return "-";
        }

        if (value instanceof Boolean) {
            Boolean booleanValue = (Boolean) value;
            return booleanValue ? "true" : "false";
        }

        if (value instanceof Float) {
            return value.toString();
        }

        if (value instanceof Double) {
            return value.toString();
        }

        if (value instanceof String) {
            String stringValue = value.toString();

            try {
                // try parse double in any culture - allow the user to still use "." as separator
                // By default comma is not valid
                if (value.toString().contains(",")) {
                    throw new ParseException("String contains illegal symbol \",\"", value.toString().indexOf(","));
                }
                Double doubleValue = Double.parseDouble(value.toString());
                return doubleValue.toString();
            } catch (Exception ex) {
                LOGGER.log(Level.FINE, ex.toString(), ex);
            }

            try {
                // convert the comma separator to dot
                DecimalFormat format;
                format = (DecimalFormat) NumberFormat.getInstance();
                DecimalFormatSymbols symbols = format.getDecimalFormatSymbols();
                symbols.setDecimalSeparator(',');
                format.setDecimalFormatSymbols(symbols);
                Double doubleValue = format.parse(value.toString()).doubleValue();
                return doubleValue.toString();
            } catch (Exception ex) {
                LOGGER.log(Level.FINE, ex.toString(), ex);
            }

            try {
                Boolean booleanValue = Boolean.parseBoolean(stringValue);
                return booleanValue ? "true" : "false";
            } catch (Exception ex) {
                LOGGER.log(Level.FINE, ex.toString(), ex);
            }

            return Strings.isNullOrEmpty(value.toString()) ? "-" : value.toString();
        }

        // single enum
        EnumerationValueDefinition enumValueDef = value instanceof EnumerationValueDefinition ? (EnumerationValueDefinition) value : null;
        if (enumValueDef != null) {
            return enumValueDef.getShortName();
        }

        // multi enum
        Collection objects = value instanceof Collection ? (Collection) value : null;
        if (objects != null) {
            try {
                Collection<EnumerationValueDefinition> enumList = (Collection<EnumerationValueDefinition>) objects;
                return enumList.size() == 0 ? "-" : String.join(Constants.PADDED_MULTI_ENUM_SEPARATOR, enumList.stream().map(DefinedThing::getShortName).collect(Collectors.toList()));
            } catch (Exception ex) {
                LOGGER.log(Level.FINE, ex.toString(), ex);
            }
        }

        // datetime
        if (value instanceof LocalDateTime) {
            LocalDateTime datetime = (LocalDateTime) value;
            datetime.format(DateTimeFormatter.ofPattern("yyyy-MM-ddTHH:mm:ss"));
            return datetime.toString();
        }

        // date
        if (value instanceof LocalDate) {
            LocalDate date = (LocalDate) value;
            date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return date.toString();
        }

        // time
        if (value instanceof LocalTime) {
            LocalTime time = (LocalTime) value;
            time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            return time.toString();
        }

        return value.toString();
    }

    /**
     * Convert to an object of the right type depending on the {@link ParameterType}
     *
     * @param value         The string value from the value-array
     * @param parameterType The {@link ParameterType} of the value
     * @return The associated object
     */
    public static Object toValueSetObject(String value, ParameterType parameterType) {
        // enum parameter type
        EnumerationParameterType enumParameterType = parameterType instanceof EnumerationParameterType ? (EnumerationParameterType) parameterType : null;
        if (enumParameterType != null) {
            if (enumParameterType.isAllowMultiSelect()) {
                String[] splitEnumString = value.split(Constants.MULTI_VALUE_ENUM_SEPARATOR);
                List<String> splitString = Lists.newArrayList(splitEnumString);
                splitString.forEach(String::trim);
                List<EnumerationValueDefinition> list = enumParameterType.getValueDefinition().stream().filter(x -> splitString.contains(x.getShortName())).collect(Collectors.toList());
                return list;
            }

            return enumParameterType.getValueDefinition().stream().filter(x -> x.getShortName().equals(value.trim())).collect(MoreCollectors.toOptional()).orElse(null);
        }

        // datetime
        switch (parameterType.getClassKind()) {
            case BOOLEAN_PARAMETER_TYPE:
                try {
                    return Boolean.parseBoolean(value);
                } catch (Exception ex) {
                    LOGGER.log(Level.FINE, ex.toString(), ex);
                    return null;
                }
            case DATE_TIME_PARAMETER_TYPE:
                try {
                    return LocalDateTime.parse(value);
                } catch (Exception ex) {
                    LOGGER.log(Level.FINE, ex.toString(), ex);
                    return null;
                }
            case DATE_PARAMETER_TYPE:
                try {
                    return LocalDate.parse(value, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                } catch (Exception ex) {
                    LOGGER.log(Level.FINE, ex.toString(), ex);
                    return null;
                }
            case TIME_OF_DAY_PARAMETER_TYPE:
                try {
                    return LocalTime.parse(value);
                } catch (Exception ex) {
                    LOGGER.log(Level.FINE, ex.toString(), ex);
                    return null;
                }
        }

        return value != null ? value : "-";
    }

    /**
     * Return the default object associated to a {@link ParameterType}
     *
     * @param parameterType The {@link ParameterType}
     * @return The default object
     */
    public static Object defaultObject(ParameterType parameterType) {
        switch (parameterType.getClassKind()) {
            case ENUMERATION_PARAMETER_TYPE:
            case BOOLEAN_PARAMETER_TYPE:
            case DATE_PARAMETER_TYPE:
            case DATE_TIME_PARAMETER_TYPE:
            case TIME_OF_DAY_PARAMETER_TYPE:
                return null;
            default:
                return "-";
        }
    }
}
