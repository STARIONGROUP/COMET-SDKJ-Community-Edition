/* --------------------------------------------------------------------------------------------------------------------
 * ActualFiniteStateList.java
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
 * A Data Transfer Object representation of the {@link "ActualFiniteStateList"} class.
 */
@Container(clazz = Iteration.class, propertyName = "actualFiniteStateList")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ActualFiniteStateList extends Thing implements Cloneable, NamedThing, OptionDependentThing, OwnedThing, ShortNamedThing {
    /**
     * Initializes a new instance of the {@link "ActualFiniteStateList"} class.
     */
    public ActualFiniteStateList()
    {
        this.actualState = new ArrayList<UUID>();
        this.excludeOption = new ArrayList<UUID>();
        this.possibleFiniteStateList = new ArrayList<OrderedItem>();
    }

    /**
     * Initializes a new instance of the {@link "ActualFiniteStateList"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public ActualFiniteStateList(UUID iid, int rev) {
        super(iid, rev);
        this.actualState = new ArrayList<UUID>();
        this.excludeOption = new ArrayList<UUID>();
        this.possibleFiniteStateList = new ArrayList<OrderedItem>();
    }

    /**
     * The unique identifiers of the contained actualState instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> actualState;

    /**
     * The list of unique identifiers of the referenced excludeOption instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> excludeOption;

    /**
     * The unique identifier of the referenced owner.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID owner;

    /**
     * The list of ordered unique identifiers of the referenced possibleFiniteStateList instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<OrderedItem> possibleFiniteStateList;

    /**
     * Gets the name.
     * @throws UnsupportedOperationException The name property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @XmlTransient
    public String getName() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ActualFiniteStateList.name");
    }

    /**
     * Gets the shortName.
     * @throws UnsupportedOperationException The shortName property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @XmlTransient
    public String getShortName() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ActualFiniteStateList.shortName");
    }

    /**
     * Sets the name.
     * @throws UnsupportedOperationException The name property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @XmlTransient
    public void setName(String name) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ActualFiniteStateList.name");
    }

    /**
     * Sets the shortName.
     * @throws UnsupportedOperationException The shortName property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @XmlTransient
    public void setShortName(String shortName) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ActualFiniteStateList.shortName");
    }

    /**
     * Gets the route for the current {@link ActualFiniteStateList}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link ActualFiniteStateList}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getActualState());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.ActualFiniteStateList} from a {@link ActualFiniteStateList}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.ActualFiniteStateList}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<Pair<UUID, UUID>, cdp4common.commondata.Thing> cache, URI uri)
    {
        return new cdp4common.engineeringmodeldata.ActualFiniteStateList(this.getIid(), cache, uri);
    }
}
