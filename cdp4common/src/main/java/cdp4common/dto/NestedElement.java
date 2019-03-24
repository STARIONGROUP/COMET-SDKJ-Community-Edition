/* --------------------------------------------------------------------------------------------------------------------
 * NestedElement.java
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
 * A Data Transfer Object representation of the {@link "NestedElement"} class.
 */
@Container(clazz = Option.class, propertyName = "nestedElement")
@ToString
@EqualsAndHashCode(callSuper = true)
public class NestedElement extends Thing implements Cloneable, NamedThing, OwnedThing, ShortNamedThing, VolatileThing {
    /**
     * Initializes a new instance of the {@link "NestedElement"} class.
     */
    public NestedElement() {
        this.elementUsage = new ArrayList<OrderedItem>();
        this.nestedParameter = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "NestedElement"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public NestedElement(UUID iid, int rev) {
        super(iid, rev);
        this.elementUsage = new ArrayList<OrderedItem>();
        this.nestedParameter = new ArrayList<UUID>();
    }

    /**
     * The list of ordered unique identifiers of the referenced elementUsage instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<OrderedItem> elementUsage;

    /**
     * Value indicating whether isVolatile.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private boolean isVolatile;

    /**
     * The unique identifiers of the contained nestedParameter instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> nestedParameter;

    /**
     * The unique identifier of the referenced rootElement.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID rootElement;

    /**
     * Gets the name.
     * @throws UnsupportedOperationException The name property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public String getName() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property NestedElement.name");
    }

    /**
     * Gets the unique identifier of the referenced owner.
     * @throws UnsupportedOperationException The owner property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public UUID getOwner() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property NestedElement.owner");
    }

    /**
     * Gets the shortName.
     * @throws UnsupportedOperationException The shortName property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public String getShortName() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property NestedElement.shortName");
    }

    /**
     * Sets the name.
     * @throws UnsupportedOperationException The name property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setName(String name) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property NestedElement.name");
    }

    /**
     * Sets the unique identifier of the referenced owner.
     * @throws UnsupportedOperationException The owner property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setOwner(UUID owner) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property NestedElement.owner");
    }

    /**
     * Sets the shortName.
     * @throws UnsupportedOperationException The shortName property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setShortName(String shortName) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property NestedElement.shortName");
    }

    /**
     * Gets the route for the current {@link NestedElement}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link NestedElement}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getNestedParameter());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.NestedElement} from a {@link NestedElement}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.NestedElement}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.NestedElement(this.getIid(), cache, uri);
    }
}
