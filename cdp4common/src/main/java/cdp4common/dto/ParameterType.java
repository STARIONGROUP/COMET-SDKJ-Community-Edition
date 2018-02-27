/* --------------------------------------------------------------------------------------------------------------------
 * ParameterType.java
 * Copyright (c) 2018 RHEA System S.A.
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
import org.apache.commons.lang3.tuple.Pair;
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "ParameterType"} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class ParameterType extends DefinedThing implements Cloneable, CategorizableThing, DeprecatableThing {
    /**
     * Initializes a new instance of the {@link "ParameterType"} class.
     */
    protected ParameterType()
    {
        this.category = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "ParameterType"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected ParameterType(UUID iid, int rev) {
        super(iid, rev);
        this.category = new ArrayList<UUID>();
    }

    /**
     * The list of unique identifiers of the referenced category instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> category;

    /**
     * Value indicating whether isDeprecated.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private boolean isDeprecated;

    /**
     * The symbol.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String symbol;

    /**
     * Gets the numberOfValues.
     * @throws UnsupportedOperationException The numberOfValues property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @XmlTransient
    public int getNumberOfValues() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterType.numberOfValues");
    }

    /**
     * Sets the numberOfValues.
     * @throws UnsupportedOperationException The numberOfValues property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @XmlTransient
    public void setNumberOfValues(int numberOfValues) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterType.numberOfValues");
    }

    /**
     * Gets the route for the current {@link ParameterType}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }
}
