/* --------------------------------------------------------------------------------------------------------------------
 * DiagramElementThing.java
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
 * A Data Transfer Object representation of the {@link "DiagramElementThing"} class.
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = DiagramElementContainer.class, propertyName = "diagramElement")
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class DiagramElementThing extends DiagramElementContainer implements Cloneable {
    /**
     * Initializes a new instance of the {@link "DiagramElementThing"} class.
     */
    protected DiagramElementThing()
    {
        this.localStyle = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "DiagramElementThing"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected DiagramElementThing(UUID iid, int rev) {
        super(iid, rev);
        this.localStyle = new ArrayList<UUID>();
    }

    /**
     * The unique identifier of the referenced depictedThing.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID depictedThing;

    /**
     * The unique identifiers of the contained localStyle instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> localStyle;

    /**
     * The unique identifier of the referenced sharedStyle.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID sharedStyle;

    /**
     * Gets the route for the current {@link DiagramElementThing}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link DiagramElementThing}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getLocalStyle());
        return containers;
    }
}
