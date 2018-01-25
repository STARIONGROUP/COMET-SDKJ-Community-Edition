/*
 * PropertyKind.java
 * Copyright (c) RHEA System S.A.
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
