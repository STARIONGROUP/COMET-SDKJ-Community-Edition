/* --------------------------------------------------------------------------------------------------------------------
 * QuantityKind.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 *
 * This is an auto-generated DTO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.dto;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MoreCollectors;
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "QuantityKind"} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class QuantityKind extends ScalarParameterType implements Cloneable {
    /**
     * Initializes a new instance of the {@link "QuantityKind"} class.
     */
    protected QuantityKind() {
        this.possibleScale = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "QuantityKind"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected QuantityKind(UUID iid, int rev) {
        super(iid, rev);
        this.possibleScale = new ArrayList<UUID>();
    }

    /**
     * The unique identifier of the referenced defaultScale.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID defaultScale;

    /**
     * The list of unique identifiers of the referenced possibleScale instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> possibleScale;

    /**
     * The quantityDimensionSymbol.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String quantityDimensionSymbol;

    /**
     * Gets the list of unique identifiers of the referenced AllPossibleScale instances.
     * @throws UnsupportedOperationException The allPossibleScale property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public ArrayList<UUID> getAllPossibleScale() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property QuantityKind.allPossibleScale");
    }

    /**
     * Gets a list of ordered String.
     * @throws UnsupportedOperationException The quantityDimensionExponent property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public ArrayList<OrderedItem> getQuantityDimensionExponent() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property QuantityKind.quantityDimensionExponent");
    }

    /**
     * Gets the quantityDimensionExpression.
     * @throws UnsupportedOperationException The quantityDimensionExpression property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public String getQuantityDimensionExpression() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property QuantityKind.quantityDimensionExpression");
    }

    /**
     * Sets the list of unique identifiers of the referenced AllPossibleScale instances.
     * @throws UnsupportedOperationException The allPossibleScale property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setAllPossibleScale(ArrayList<UUID> allPossibleScale) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property QuantityKind.allPossibleScale");
    }

    /**
     * Sets a list of ordered String.
     * @throws UnsupportedOperationException The quantityDimensionExponent property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setQuantityDimensionExponent(ArrayList<OrderedItem> quantityDimensionExponent) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property QuantityKind.quantityDimensionExponent");
    }

    /**
     * Sets the quantityDimensionExpression.
     * @throws UnsupportedOperationException The quantityDimensionExpression property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setQuantityDimensionExpression(String quantityDimensionExpression) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property QuantityKind.quantityDimensionExpression");
    }

    /**
     * Gets the route for the current {@link QuantityKind}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }
}
