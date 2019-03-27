/*
 * Constants.java
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
