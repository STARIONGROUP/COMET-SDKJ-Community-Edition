/* --------------------------------------------------------------------------------------------------------------------
 * Parameter.java
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
 * A Data Transfer Object representation of the {@link "Parameter"} class.
 */
@Container(clazz = ElementDefinition.class, propertyName = "parameter")
@ToString
@EqualsAndHashCode(callSuper = true)
public class Parameter extends ParameterOrOverrideBase implements Cloneable {
    /**
     * Initializes a new instance of the {@link "Parameter"} class.
     */
    public Parameter() {
        this.valueSet = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "Parameter"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public Parameter(UUID iid, int rev) {
        super(iid, rev);
        this.valueSet = new ArrayList<UUID>();
    }

    /**
     * Value indicating whether allowDifferentOwnerOfOverride.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private boolean allowDifferentOwnerOfOverride;

    /**
     * Value indicating whether expectsOverride.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private boolean expectsOverride;

    /**
     * The unique identifier of the referenced requestedBy.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID requestedBy;

    /**
     * The unique identifiers of the contained valueSet instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> valueSet;

    /**
     * Gets the route for the current {@link Parameter}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link Parameter}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getValueSet());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.Parameter} from a {@link Parameter}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.Parameter}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.Parameter(this.getIid(), cache, uri);
    }
}
