/* --------------------------------------------------------------------------------------------------------------------
 * Annotation.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Interface. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.commondata;

import java.time.LocalDateTime;
import java.util.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;

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
