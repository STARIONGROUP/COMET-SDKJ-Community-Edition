/* --------------------------------------------------------------------------------------------------------------------
 * CategorizableThing.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Interface. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

import java.util.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;

/**
 * representation of a Thing that can be categorized to be a member of a       user-defined       Category
 * Note 1: Categorization using Categories establishes a runtime       classification       mechanism,       that       can       be       used       to       classify       architectural       elements,       parameter       types,       etc.,       and       form       the       basis       for       view       definitions,       filter       operations       and       validation       rules.
 * Note 2: Categories are (pre)defined in ReferenceDataLibraries.
 * Note 3: Assignment of a given Category to the <i>category</i> property       of       a       CategorizableThing       asserts       that       it       is       a       member       of       the       given       Category.
 */
public interface CategorizableThing {
    /**
     * Gets a list of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    ArrayList<Category> getCategory();

    /**
     * Sets a list of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    void setCategory(ArrayList<Category> category);
}
