/* --------------------------------------------------------------------------------------------------------------------
 * DerivedUnit.java
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
 * A Data Transfer Object representation of the {@link "DerivedUnit"} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
@ToString
@EqualsAndHashCode(callSuper = true)
public class DerivedUnit extends MeasurementUnit implements Cloneable {
    /**
     * Initializes a new instance of the {@link "DerivedUnit"} class.
     */
    public DerivedUnit() {
        this.unitFactor = new ArrayList<OrderedItem>();
    }

    /**
     * Initializes a new instance of the {@link "DerivedUnit"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public DerivedUnit(UUID iid, int rev) {
        super(iid, rev);
        this.unitFactor = new ArrayList<OrderedItem>();
    }

    /**
     * The unique identifiers of the contained unitFactor instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<OrderedItem> unitFactor;

    /**
     * Gets the route for the current {@link DerivedUnit}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link DerivedUnit}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getUnitFactor());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.sitedirectorydata.DerivedUnit} from a {@link DerivedUnit}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.DerivedUnit}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.sitedirectorydata.DerivedUnit(this.getIid(), cache, uri);
    }
}
