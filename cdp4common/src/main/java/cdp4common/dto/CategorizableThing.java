/* --------------------------------------------------------------------------------------------------------------------
 * CategorizableThing.java
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
 * representation of a Thing that can be categorized to be a member of a       user-defined       Category
 * Note 1: Categorization using Categories establishes a runtime       classification       mechanism,       that       can       be       used       to       classify       architectural       elements,       parameter       types,       etc.,       and       form       the       basis       for       view       definitions,       filter       operations       and       validation       rules.
 * Note 2: Categories are (pre)defined in ReferenceDataLibraries.
 * Note 3: Assignment of a given Category to the <i>category</i> property       of       a       CategorizableThing       asserts       that       it       is       a       member       of       the       given       Category.
 */
public interface CategorizableThing
{
    /**
     * Gets the unique identifiers of the referenced category instances.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    ArrayList<UUID> getCategory();

    /**
     * Sets the unique identifiers of the referenced category instances.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    void setCategory(ArrayList<UUID> category);
}
