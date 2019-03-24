/* --------------------------------------------------------------------------------------------------------------------
 * ElementDefinition.java
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
 * A Data Transfer Object representation of the {@link "ElementDefinition"} class.
 */
@Container(clazz = Iteration.class, propertyName = "element")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ElementDefinition extends ElementBase implements Cloneable {
    /**
     * Initializes a new instance of the {@link "ElementDefinition"} class.
     */
    public ElementDefinition() {
        this.containedElement = new ArrayList<UUID>();
        this.parameter = new ArrayList<UUID>();
        this.parameterGroup = new ArrayList<UUID>();
        this.referencedElement = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "ElementDefinition"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public ElementDefinition(UUID iid, int rev) {
        super(iid, rev);
        this.containedElement = new ArrayList<UUID>();
        this.parameter = new ArrayList<UUID>();
        this.parameterGroup = new ArrayList<UUID>();
        this.referencedElement = new ArrayList<UUID>();
    }

    /**
     * The unique identifiers of the contained containedElement instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> containedElement;

    /**
     * The unique identifiers of the contained parameter instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> parameter;

    /**
     * The unique identifiers of the contained parameterGroup instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> parameterGroup;

    /**
     * The list of unique identifiers of the referenced referencedElement instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> referencedElement;

    /**
     * Gets the route for the current {@link ElementDefinition}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link ElementDefinition}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getContainedElement());
        containers.add(this.getParameter());
        containers.add(this.getParameterGroup());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.ElementDefinition} from a {@link ElementDefinition}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.ElementDefinition}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.ElementDefinition(this.getIid(), cache, uri);
    }
}
