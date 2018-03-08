/*
 * ValueArrayParser.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.types;

import cdp4common.exceptions.ValueArrayParseException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Extension class for {@link ValueArray}
 * <p>
 * Note: In comparison with Thing C# implementation the following methods were modified due
 * to the language specifics:
 * - public static bool TryParseToIntValueArray(this string stringArray, out ValueArray<int> valueArray,
 * out string error){} - method signature and name were changed.
 */
public class ValueArrayParser {
    /**
     * The string pattern to retrieve the content of an array
     */
    private static final String VALUE_ARRAY_PATTERN = "\\{([^)]*)\\}";

    /**
     * The delimiter between two elements of the array
     */
    private static final String DELIMITER = ";";

    /**
     * The exception message when a string does not comply with the non-string value array format
     */
    private static final String NON_STRING_ARGUMENT_EXCEPTION_MESSAGE = "The value array shall start with a \"{\" and end with a \"}\". The values shall be delimited by a \";\".\nExample: {1;2;3}";

    /**
     * Parses a string into a {@link ValueArray<Integer>}.
     *
     * @param stringArray The {@link String} to parse
     * @return true if the parsing succeeded
     */
    public static ValueArray<Integer> parseToIntValueArray(String stringArray) {
        if (stringArray.trim().isEmpty()) {
            throw new ValueArrayParseException("The string is null or blank.");
        }

        Pattern pattern = Pattern.compile(VALUE_ARRAY_PATTERN);
        Matcher matcher = pattern.matcher(stringArray);
        List<String> matches = new ArrayList<>();

        while (matcher.find()) {
            matches.add(matcher.group());
        }

        if (matches.size() != 1) {
            throw new ValueArrayParseException(NON_STRING_ARGUMENT_EXCEPTION_MESSAGE);
        }

        String content = matches.get(0);
        String[] stringValues = content.split(DELIMITER);

        if (stringValues.length == 0) {
            throw new ValueArrayParseException(NON_STRING_ARGUMENT_EXCEPTION_MESSAGE);
        }

        List<Integer> intResults = new ArrayList<>();
        for (String stringValue : stringValues) {
            try {
                Integer result = Integer.parseInt(stringValue);
                intResults.add(result);
            } catch (NumberFormatException e) {
                throw new ValueArrayParseException("The content of the array are not integer values");
            }
        }

        return new ValueArray<>(intResults, Integer.class);
    }
}
