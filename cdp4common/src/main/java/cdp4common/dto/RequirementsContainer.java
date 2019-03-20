/* --------------------------------------------------------------------------------------------------------------------
 * RequirementsContainer.java
 * Copyright (c) 2019 RHEA System S.A.
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
 * A Data Transfer Object representation of the {@link "RequirementsContainer"} class.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class RequirementsContainer extends DefinedThing implements Cloneable, CategorizableThing, OwnedThing {
    /**
     * Initializes a new instance of the {@link "RequirementsContainer"} class.
     */
    protected RequirementsContainer() {
        this.category = new ArrayList<UUID>();
        this.group = new ArrayList<UUID>();
        this.parameterValue = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "RequirementsContainer"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected RequirementsContainer(UUID iid, int rev) {
        super(iid, rev);
        this.category = new ArrayList<UUID>();
        this.group = new ArrayList<UUID>();
        this.parameterValue = new ArrayList<UUID>();
    }

    /**
     * The list of unique identifiers of the referenced category instances.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> category;

    /**
     * The unique identifiers of the contained group instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> group;

    /**
     * The unique identifier of the referenced owner.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID owner;

    /**
     * The unique identifiers of the contained parameterValue instances.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> parameterValue;

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link RequirementsContainer}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getGroup());
        containers.add(this.getParameterValue());
        return containers;
    }
}
