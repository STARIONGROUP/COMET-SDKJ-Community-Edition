/*
 * Utils.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.helpers;

public class Utils {
    /**
     * Capitalize the constant according to the Java naming convention
     *
     * @param input The subject input string
     * @return A string
     */
    public static String getConstantNotation(String input) {
        if (input.trim().isEmpty()) {
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
}
