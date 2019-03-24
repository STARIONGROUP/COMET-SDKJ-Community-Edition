/* --------------------------------------------------------------------------------------------------------------------
 * ParameterOverride.java
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
 * A Data Transfer Object representation of the {@link "ParameterOverride"} class.
 */
@Container(clazz = ElementUsage.class, propertyName = "parameterOverride")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ParameterOverride extends ParameterOrOverrideBase implements Cloneable {
    /**
     * Initializes a new instance of the {@link "ParameterOverride"} class.
     */
    public ParameterOverride() {
        this.valueSet = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "ParameterOverride"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public ParameterOverride(UUID iid, int rev) {
        super(iid, rev);
        this.valueSet = new ArrayList<UUID>();
    }

    /**
     * The unique identifier of the referenced parameter.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID parameter;

    /**
     * The unique identifiers of the contained valueSet instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> valueSet;

    /**
     * Gets the unique identifier of the referenced group.
     * @throws UnsupportedOperationException The group property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public UUID getGroup() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterOverride.group");
    }

    /**
     * Gets a value indicating whether isOptionDependent.
     * @throws UnsupportedOperationException The isOptionDependent property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public boolean isOptionDependent() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterOverride.isOptionDependent");
    }

    /**
     * Gets the unique identifier of the referenced parameterType.
     * @throws UnsupportedOperationException The parameterType property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public UUID getParameterType() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterOverride.parameterType");
    }

    /**
     * Gets the unique identifier of the referenced scale.
     * @throws UnsupportedOperationException The scale property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public UUID getScale() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterOverride.scale");
    }

    /**
     * Gets the unique identifier of the referenced stateDependence.
     * @throws UnsupportedOperationException The stateDependence property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public UUID getStateDependence() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterOverride.stateDependence");
    }

    /**
     * Sets the unique identifier of the referenced group.
     * @throws UnsupportedOperationException The group property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setGroup(UUID group) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterOverride.group");
    }

    /**
     * Sets a value indicating whether isOptionDependent.
     * @throws UnsupportedOperationException The isOptionDependent property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setOptionDependent(boolean isOptionDependent) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterOverride.isOptionDependent");
    }

    /**
     * Sets the unique identifier of the referenced parameterType.
     * @throws UnsupportedOperationException The parameterType property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setParameterType(UUID parameterType) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterOverride.parameterType");
    }

    /**
     * Sets the unique identifier of the referenced scale.
     * @throws UnsupportedOperationException The scale property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setScale(UUID scale) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterOverride.scale");
    }

    /**
     * Sets the unique identifier of the referenced stateDependence.
     * @throws UnsupportedOperationException The stateDependence property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setStateDependence(UUID stateDependence) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterOverride.stateDependence");
    }

    /**
     * Gets the route for the current {@link ParameterOverride}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link ParameterOverride}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getValueSet());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.ParameterOverride} from a {@link ParameterOverride}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.ParameterOverride}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.ParameterOverride(this.getIid(), cache, uri);
    }
}
