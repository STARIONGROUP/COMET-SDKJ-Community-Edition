/* --------------------------------------------------------------------------------------------------------------------
 * Annotation.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated DTO Interface. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;
import cdp4common.commondata.*;

/**
 * abstract supertype that represents information expressed in human-readable natural language
 * Note: Multiple alternative annotations may be given in different natural languages.
 */
public interface Annotation
{
    /**
     * Gets the content.
     * textual content of the annotation expressed in the natural language as
     * specified in <i>languageCode</i>
     */
    String getContent();

    /**
     * Sets the content.
     * textual content of the annotation expressed in the natural language as
     * specified in <i>languageCode</i>
     */
    void setContent(String content);
    /**
     * Gets the languageCode.
     * code that defines the natural language in which the annotation is written
     */
    String getLanguageCode();

    /**
     * Sets the languageCode.
     * code that defines the natural language in which the annotation is written
     */
    void setLanguageCode(String languageCode);
}
