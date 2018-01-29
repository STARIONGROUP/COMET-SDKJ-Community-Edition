/*
 * AggregationKind.java
 * Copyright (c) 2018 RHEA System S.A.
 */

package cdp4common;

/**
 * <code>cdp4common.AggregationKind</code> is an Enumeration for specifying the kind of aggregation of a Property.
 *
 * @see AggregationKind
 */
public enum AggregationKind {
    /**
     * Indicates that the Property has no aggregation.
     */
    NONE,

    /**
     * Indicates that the Property has shared aggregation.
     */
    SHARED,

    /**
     * Indicates that the Property is aggregated compositely, i.e.,
     * the composite object has responsibility for the existence and storage of the composed objects (parts).
     */
    COMPOSITE
}
