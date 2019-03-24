/* --------------------------------------------------------------------------------------------------------------------
 * DerivedQuantityKind.java
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
 * A Data Transfer Object representation of the {@link "DerivedQuantityKind"} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
@EqualsAndHashCode(callSuper = true)
public class DerivedQuantityKind extends QuantityKind implements Cloneable {
    /**
     * Initializes a new instance of the {@link "DerivedQuantityKind"} class.
     */
    public DerivedQuantityKind() {
        this.quantityKindFactor = new ArrayList<OrderedItem>();
    }

    /**
     * Initializes a new instance of the {@link "DerivedQuantityKind"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public DerivedQuantityKind(UUID iid, int rev) {
        super(iid, rev);
        this.quantityKindFactor = new ArrayList<OrderedItem>();
    }

    /**
     * The unique identifiers of the contained quantityKindFactor instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<OrderedItem> quantityKindFactor;

    /**
     * Gets the route for the current {@link DerivedQuantityKind}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link DerivedQuantityKind}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getQuantityKindFactor());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.sitedirectorydata.DerivedQuantityKind} from a {@link DerivedQuantityKind}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.DerivedQuantityKind}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.sitedirectorydata.DerivedQuantityKind(this.getIid(), cache, uri);
    }
}
