/*
 * ValueArrayParser.java
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

package cdp4common.types;

import cdp4common.exceptions.ValueArrayParseException;
import com.google.common.base.Strings;

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
        if (Strings.isNullOrEmpty(stringArray)) {
            throw new ValueArrayParseException("The string is null or blank.");
        }

        Pattern pattern = Pattern.compile(VALUE_ARRAY_PATTERN);
        Matcher matcher = pattern.matcher(stringArray);
        List<String> matches = new ArrayList<>();

        while (matcher.find()) {
            matches.add(matcher.group(1));
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
