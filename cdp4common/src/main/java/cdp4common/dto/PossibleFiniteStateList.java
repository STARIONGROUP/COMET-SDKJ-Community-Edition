/* --------------------------------------------------------------------------------------------------------------------
 * PossibleFiniteStateList.java
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
 * A Data Transfer Object representation of the {@link "PossibleFiniteStateList"} class.
 */
@Container(clazz = Iteration.class, propertyName = "possibleFiniteStateList")
@ToString
@EqualsAndHashCode(callSuper = true)
public class PossibleFiniteStateList extends DefinedThing implements Cloneable, CategorizableThing, OwnedThing {
    /**
     * Initializes a new instance of the {@link "PossibleFiniteStateList"} class.
     */
    public PossibleFiniteStateList() {
        this.category = new ArrayList<UUID>();
        this.possibleState = new ArrayList<OrderedItem>();
    }

    /**
     * Initializes a new instance of the {@link "PossibleFiniteStateList"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public PossibleFiniteStateList(UUID iid, int rev) {
        super(iid, rev);
        this.category = new ArrayList<UUID>();
        this.possibleState = new ArrayList<OrderedItem>();
    }

    /**
     * The list of unique identifiers of the referenced category instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> category;

    /**
     * The unique identifier of the referenced defaultState.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID defaultState;

    /**
     * The unique identifier of the referenced owner.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID owner;

    /**
     * The unique identifiers of the contained possibleState instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<OrderedItem> possibleState;

    /**
     * Gets the route for the current {@link PossibleFiniteStateList}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link PossibleFiniteStateList}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getPossibleState());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.PossibleFiniteStateList} from a {@link PossibleFiniteStateList}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.PossibleFiniteStateList}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.PossibleFiniteStateList(this.getIid(), cache, uri);
    }
}
