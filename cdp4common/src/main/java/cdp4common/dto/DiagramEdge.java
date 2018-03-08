/* --------------------------------------------------------------------------------------------------------------------
 * DiagramEdge.java
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
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "DiagramEdge"} class.
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = DiagramElementContainer.class, propertyName = "diagramElement")
@ToString
@EqualsAndHashCode(callSuper = true)
public class DiagramEdge extends DiagramElementThing implements Cloneable {
    /**
     * Initializes a new instance of the {@link "DiagramEdge"} class.
     */
    public DiagramEdge()
    {
        this.point = new ArrayList<OrderedItem>();
    }

    /**
     * Initializes a new instance of the {@link "DiagramEdge"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public DiagramEdge(UUID iid, int rev) {
        super(iid, rev);
        this.point = new ArrayList<OrderedItem>();
    }

    /**
     * The unique identifiers of the contained point instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<OrderedItem> point;

    /**
     * The unique identifier of the referenced source.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID source;

    /**
     * The unique identifier of the referenced target.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID target;

    /**
     * Gets the route for the current {@link DiagramEdge}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link DiagramEdge}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getPoint());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.diagramdata.DiagramEdge} from a {@link DiagramEdge}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.diagramdata.DiagramEdge}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<Pair<UUID, UUID>, cdp4common.commondata.Thing> cache, URI uri)
    {
        return new cdp4common.diagramdata.DiagramEdge(this.getIid(), cache, uri);
    }
}
