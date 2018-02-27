/* --------------------------------------------------------------------------------------------------------------------
 * EngineeringModel.java
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
 * A Data Transfer Object representation of the {@link "EngineeringModel"} class.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public class EngineeringModel extends TopContainer implements Cloneable {
    /**
     * Initializes a new instance of the {@link "EngineeringModel"} class.
     */
    public EngineeringModel()
    {
        this.book = new ArrayList<OrderedItem>();
        this.commonFileStore = new ArrayList<UUID>();
        this.genericNote = new ArrayList<UUID>();
        this.iteration = new ArrayList<UUID>();
        this.logEntry = new ArrayList<UUID>();
        this.modellingAnnotation = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "EngineeringModel"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public EngineeringModel(UUID iid, int rev) {
        super(iid, rev);
        this.book = new ArrayList<OrderedItem>();
        this.commonFileStore = new ArrayList<UUID>();
        this.genericNote = new ArrayList<UUID>();
        this.iteration = new ArrayList<UUID>();
        this.logEntry = new ArrayList<UUID>();
        this.modellingAnnotation = new ArrayList<UUID>();
    }

    /**
     * The unique identifiers of the contained book instances.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<OrderedItem> book;

    /**
     * The unique identifiers of the contained commonFileStore instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> commonFileStore;

    /**
     * The unique identifier of the referenced engineeringModelSetup.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID engineeringModelSetup;

    /**
     * The unique identifiers of the contained genericNote instances.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> genericNote;

    /**
     * The unique identifiers of the contained iteration instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> iteration;

    /**
     * The unique identifiers of the contained logEntry instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> logEntry;

    /**
     * The unique identifiers of the contained modellingAnnotation instances.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> modellingAnnotation;

    /**
     * Gets the route for the current {@link EngineeringModel}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link EngineeringModel}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getBook());
        containers.add(this.getCommonFileStore());
        containers.add(this.getGenericNote());
        containers.add(this.getIteration());
        containers.add(this.getLogEntry());
        containers.add(this.getModellingAnnotation());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.EngineeringModel} from a {@link EngineeringModel}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.EngineeringModel}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<Pair<UUID, UUID>, cdp4common.commondata.Thing> cache, URI uri)
    {
        return new cdp4common.engineeringmodeldata.EngineeringModel(this.getIid(), cache, uri);
    }
}
