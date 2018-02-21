/*
 * Constants.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common.helpers;

import java.util.UUID;
import java.util.regex.Pattern;

/**
 * The constant class used in the application
 */
public class Constants {
    /**
     * The enumeration value separator when multi enumerations may be selected
     */
    public static final String MULTI_VALUE_ENUM_SEPARATOR = "|";

    /**
     * The padded multi enumeration separator
     */
    public static final String PADDED_MULTI_ENUM_SEPARATOR = " | ";

    /**
     * The uri path separator
     */
    public static final String URI_PATH_SEPARATOR = "/";

    /**
     * The uri path separator character
     */
    public static final char URI_PATH_SEPARATOR_CHAR = '/';

    /**
     * The length of the guid represented in a uri
     */
    public static final int URI_GUID_LENGTH = 32;

    /**
     * The {@link UUID} pattern used in the response from a data-source
     */
    public static final Pattern URI_UUID_PATTERN = Pattern.compile("[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}");
}
