/*
 * Utils.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
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

import cdp4common.sitedirectorydata.ParameterTypeComponent;
import cdp4common.types.OrderedItem;
import com.google.common.base.CaseFormat;
import com.google.common.base.Strings;

import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Utils {
    /**
     * Get constant notation from upper camel according to the Java naming convention
     *
     * @param input The subject input string
     * @return A string
     */
    public static String getConstantNotationFromUpperCamel(String input) {
        if (Strings.isNullOrEmpty(input)) {
            throw new IllegalArgumentException("String can't be empty!");
        }

        char[] chars = input.toCharArray();
        StringBuilder constantName = new StringBuilder(Character.toString(chars[0]).toUpperCase());

        for (int i = 1; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                constantName.append("_");
            }

            constantName.append(chars[i]);
        }

        return constantName.toString().toUpperCase();
    }

    /**
     * Get upper camel notation from constant according to the Java naming convention
     *
     * @param input The subject input string
     * @return A string
     */
    public static String getUpperCamelNotationFromConstant(String input) {
        if (Strings.isNullOrEmpty(input)) {
            throw new IllegalArgumentException("String can't be empty!");
        }

        return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, input);
    }

    /**
     * Extension method that extract the ordered Ids as a list of GUID from the passed in IEnumerable of {@link OrderedItem}.
     *
     * @param orderedList The ordered list of UUIDs.
     * @return A list instance with the extracted UUIDs.
     */
    public static List<UUID> toIdList(List<OrderedItem> orderedList) {
        return orderedList.stream().map(x -> (UUID) x.getV()).collect(Collectors.toList());
    }

    /**
     * Format a string using only the alpha numerical characters and underscore
     * <p>
     * This is used to format the {@link ParameterTypeComponent}'s short-name for a better readability
     *
     * @param shortName The string to format
     * @return The formatted string
     */
    public static String formatComponentShortName(String shortName) {
        if (Strings.isNullOrEmpty(shortName)) {
            return "";
        }

        // Replace all non alpha-numerical character by underscore
        String formatString = shortName.replaceAll("[^a-zA-Z0-9]+", "_");

        // remove the formatted string from its potential leading and trailing underscore
        return formatString.replaceAll("^_+|_+$", "");
    }
}
