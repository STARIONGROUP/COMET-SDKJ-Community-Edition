/*
 * PropertyKind.java
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
 */

package cdp4common;

/**
 * The property kind which is applied to the metadata of a property.
 * This is directly related to its cardinality and stereotypes applied in the uml model.
 */
public enum PropertyKind {
    /**
     * Assertion that the property is a single scalar value property.
     */
    SCALAR,

    /**
     * Assertion that the property is an unordered collection property.
     */
    LIST,

    /**
     * Assertion that the property is an ordered collection property.
     */
    ORDERED_LIST,

    /**
     * Assertion that the property is a value array property.
     */
    VALUE_ARRAY
}
