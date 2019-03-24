/* --------------------------------------------------------------------------------------------------------------------
 * Definition.java
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
 * A Data Transfer Object representation of the {@link "Definition"} class.
 */
@Container(clazz = DefinedThing.class, propertyName = "definition")
@ToString
@EqualsAndHashCode(callSuper = true)
public class Definition extends Thing implements Cloneable, Annotation {
    /**
     * Initializes a new instance of the {@link "Definition"} class.
     */
    public Definition() {
        this.citation = new ArrayList<UUID>();
        this.example = new ArrayList<OrderedItem>();
        this.note = new ArrayList<OrderedItem>();
    }

    /**
     * Initializes a new instance of the {@link "Definition"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public Definition(UUID iid, int rev) {
        super(iid, rev);
        this.citation = new ArrayList<UUID>();
        this.example = new ArrayList<OrderedItem>();
        this.note = new ArrayList<OrderedItem>();
    }

    /**
     * The unique identifiers of the contained citation instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> citation;

    /**
     * The content.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String content;

    /**
     * The list of ordered String.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<OrderedItem> example;

    /**
     * The languageCode.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String languageCode;

    /**
     * The list of ordered String.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<OrderedItem> note;

    /**
     * Gets the route for the current {@link Definition}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link Definition}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getCitation());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.commondata.Definition} from a {@link Definition}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.commondata.Definition}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.commondata.Definition(this.getIid(), cache, uri);
    }
}
