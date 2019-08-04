/* --------------------------------------------------------------------------------------------------------------------
 * Annotation.java
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
 *
 * This is an auto-generated POJO Interface. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.commondata;

/**
 * abstract supertype that represents information expressed in human-readable natural language
 * Note: Multiple alternative annotations may be given in different natural languages.
 */
public interface Annotation {
    /**
     * Gets the Content.
     * textual content of the annotation expressed in the natural language as
     * specified in <i>languageCode</i>
     */
    String getContent();

    /**
     * Gets the LanguageCode.
     * code that defines the natural language in which the annotation is written
     */
    String getLanguageCode();

    /**
     * Sets the Content.
     * textual content of the annotation expressed in the natural language as
     * specified in <i>languageCode</i>
     */
    void setContent(String content);

    /**
     * Sets the LanguageCode.
     * code that defines the natural language in which the annotation is written
     */
    void setLanguageCode(String languageCode);
}
