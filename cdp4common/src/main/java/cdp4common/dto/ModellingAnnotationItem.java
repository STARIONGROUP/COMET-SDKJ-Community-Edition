/* --------------------------------------------------------------------------------------------------------------------
 * ModellingAnnotationItem.java
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
 * A Data Transfer Object representation of the {@link "ModellingAnnotationItem"} class.
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = EngineeringModel.class, propertyName = "modellingAnnotation")
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class ModellingAnnotationItem extends EngineeringModelDataAnnotation implements Cloneable, CategorizableThing, OwnedThing, ShortNamedThing {
    /**
     * Initializes a new instance of the {@link "ModellingAnnotationItem"} class.
     */
    protected ModellingAnnotationItem() {
        this.approvedBy = new ArrayList<UUID>();
        this.category = new ArrayList<UUID>();
        this.sourceAnnotation = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "ModellingAnnotationItem"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected ModellingAnnotationItem(UUID iid, int rev) {
        super(iid, rev);
        this.approvedBy = new ArrayList<UUID>();
        this.category = new ArrayList<UUID>();
        this.sourceAnnotation = new ArrayList<UUID>();
    }

    /**
     * The unique identifiers of the contained approvedBy instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> approvedBy;

    /**
     * The list of unique identifiers of the referenced category instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> category;

    /**
     * The classification.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private AnnotationClassificationKind classification;

    /**
     * The unique identifier of the referenced owner.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID owner;

    /**
     * The shortName.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String shortName;

    /**
     * The list of unique identifiers of the referenced sourceAnnotation instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> sourceAnnotation;

    /**
     * The status.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private AnnotationStatusKind status;

    /**
     * The title.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String title;

    /**
     * Gets the route for the current {@link ModellingAnnotationItem}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link ModellingAnnotationItem}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getApprovedBy());
        return containers;
    }
}
