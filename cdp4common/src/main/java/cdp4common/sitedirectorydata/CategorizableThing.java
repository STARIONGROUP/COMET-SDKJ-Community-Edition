/* --------------------------------------------------------------------------------------------------------------------
 * CategorizableThing.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
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

package cdp4common.sitedirectorydata;

import java.time.OffsetDateTime;
import java.util.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import cdp4common.CDPVersion;

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
