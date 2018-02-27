/* --------------------------------------------------------------------------------------------------------------------
 * StakeHolderValueMap.java
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
 * A Data Transfer Object representation of the {@link "StakeHolderValueMap"} class.
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = Iteration.class, propertyName = "stakeholderValueMap")
@ToString
@EqualsAndHashCode(callSuper = true)
public class StakeHolderValueMap extends DefinedThing implements Cloneable, CategorizableThing {
    /**
     * Initializes a new instance of the {@link "StakeHolderValueMap"} class.
     */
    public StakeHolderValueMap()
    {
        this.category = new ArrayList<UUID>();
        this.goal = new ArrayList<UUID>();
        this.requirement = new ArrayList<UUID>();
        this.settings = new ArrayList<UUID>();
        this.stakeholderValue = new ArrayList<UUID>();
        this.valueGroup = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "StakeHolderValueMap"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public StakeHolderValueMap(UUID iid, int rev) {
        super(iid, rev);
        this.category = new ArrayList<UUID>();
        this.goal = new ArrayList<UUID>();
        this.requirement = new ArrayList<UUID>();
        this.settings = new ArrayList<UUID>();
        this.stakeholderValue = new ArrayList<UUID>();
        this.valueGroup = new ArrayList<UUID>();
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
     * The list of unique identifiers of the referenced goal instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> goal;

    /**
     * The list of unique identifiers of the referenced requirement instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> requirement;

    /**
     * The unique identifiers of the contained settings instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> settings;

    /**
     * The list of unique identifiers of the referenced stakeholderValue instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> stakeholderValue;

    /**
     * The list of unique identifiers of the referenced valueGroup instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> valueGroup;

    /**
     * Gets the route for the current {@link StakeHolderValueMap}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link StakeHolderValueMap}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getSettings());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.StakeHolderValueMap} from a {@link StakeHolderValueMap}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.StakeHolderValueMap}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<Pair<UUID, UUID>, cdp4common.commondata.Thing> cache, URI uri)
    {
        return new cdp4common.engineeringmodeldata.StakeHolderValueMap(this.getIid(), cache, uri);
    }
}
