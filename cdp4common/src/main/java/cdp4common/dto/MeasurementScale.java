/* --------------------------------------------------------------------------------------------------------------------
 * MeasurementScale.java
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
 * A Data Transfer Object representation of the {@link "MeasurementScale"} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "scale")
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class MeasurementScale extends DefinedThing implements Cloneable, DeprecatableThing {
    /**
     * Initializes a new instance of the {@link "MeasurementScale"} class.
     */
    protected MeasurementScale() {
        this.mappingToReferenceScale = new ArrayList<UUID>();
        this.valueDefinition = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "MeasurementScale"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected MeasurementScale(UUID iid, int rev) {
        super(iid, rev);
        this.mappingToReferenceScale = new ArrayList<UUID>();
        this.valueDefinition = new ArrayList<UUID>();
    }

    /**
     * Value indicating whether isDeprecated.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private boolean isDeprecated;

    /**
     * Value indicating whether isMaximumInclusive.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private boolean isMaximumInclusive;

    /**
     * Value indicating whether isMinimumInclusive.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private boolean isMinimumInclusive;

    /**
     * The unique identifiers of the contained mappingToReferenceScale instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> mappingToReferenceScale;

    /**
     * The maximumPermissibleValue.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String maximumPermissibleValue;

    /**
     * The minimumPermissibleValue.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String minimumPermissibleValue;

    /**
     * The negativeValueConnotation.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String negativeValueConnotation;

    /**
     * The numberSet.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private NumberSetKind numberSet;

    /**
     * The positiveValueConnotation.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String positiveValueConnotation;

    /**
     * The unique identifier of the referenced unit.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID unit;

    /**
     * The unique identifiers of the contained valueDefinition instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> valueDefinition;

    /**
     * Gets the route for the current {@link MeasurementScale}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link MeasurementScale}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getMappingToReferenceScale());
        containers.add(this.getValueDefinition());
        return containers;
    }
}
