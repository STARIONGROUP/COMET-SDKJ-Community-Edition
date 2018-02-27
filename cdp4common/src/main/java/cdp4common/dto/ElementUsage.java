/* --------------------------------------------------------------------------------------------------------------------
 * ElementUsage.java
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
 * A Data Transfer Object representation of the {@link "ElementUsage"} class.
 */
@Container(clazz = ElementDefinition.class, propertyName = "containedElement")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ElementUsage extends ElementBase implements Cloneable, OptionDependentThing {
    /**
     * Initializes a new instance of the {@link "ElementUsage"} class.
     */
    public ElementUsage()
    {
        this.excludeOption = new ArrayList<UUID>();
        this.parameterOverride = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "ElementUsage"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public ElementUsage(UUID iid, int rev) {
        super(iid, rev);
        this.excludeOption = new ArrayList<UUID>();
        this.parameterOverride = new ArrayList<UUID>();
    }

    /**
     * The unique identifier of the referenced elementDefinition.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID elementDefinition;

    /**
     * The list of unique identifiers of the referenced excludeOption instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> excludeOption;

    /**
     * The interfaceEnd.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private InterfaceEndKind interfaceEnd;

    /**
     * The unique identifiers of the contained parameterOverride instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> parameterOverride;

    /**
     * Gets the route for the current {@link ElementUsage}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link ElementUsage}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getParameterOverride());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.ElementUsage} from a {@link ElementUsage}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.ElementUsage}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<Pair<UUID, UUID>, cdp4common.commondata.Thing> cache, URI uri)
    {
        return new cdp4common.engineeringmodeldata.ElementUsage(this.getIid(), cache, uri);
    }
}
