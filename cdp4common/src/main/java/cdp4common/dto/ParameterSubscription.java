/* --------------------------------------------------------------------------------------------------------------------
 * ParameterSubscription.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * This is an auto-generated DTO Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
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
 * A Data Transfer Object representation of the {@link "ParameterSubscription"} class.
 */
@Container(clazz = ParameterOrOverrideBase.class, propertyName = "parameterSubscription")
@ToString
public class ParameterSubscription extends ParameterBase implements Cloneable {
    /**
     * Initializes a new instance of the {@link "ParameterSubscription"} class.
     */
    public ParameterSubscription() {
        this.valueSet = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "ParameterSubscription"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public ParameterSubscription(UUID iid, int rev) {
        super(iid, rev);
        this.valueSet = new ArrayList<UUID>();
    }

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
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterSubscription.group");
    }

    /**
     * Gets a value indicating whether isOptionDependent.
     * @throws UnsupportedOperationException The isOptionDependent property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public boolean isOptionDependent() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterSubscription.isOptionDependent");
    }

    /**
     * Gets the unique identifier of the referenced parameterType.
     * @throws UnsupportedOperationException The parameterType property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public UUID getParameterType() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterSubscription.parameterType");
    }

    /**
     * Gets the unique identifier of the referenced scale.
     * @throws UnsupportedOperationException The scale property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public UUID getScale() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterSubscription.scale");
    }

    /**
     * Gets the unique identifier of the referenced stateDependence.
     * @throws UnsupportedOperationException The stateDependence property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public UUID getStateDependence() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterSubscription.stateDependence");
    }

    /**
     * Sets the unique identifier of the referenced group.
     * @throws UnsupportedOperationException The group property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setGroup(UUID group) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterSubscription.group");
    }

    /**
     * Sets a value indicating whether isOptionDependent.
     * @throws UnsupportedOperationException The isOptionDependent property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setOptionDependent(boolean isOptionDependent) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterSubscription.isOptionDependent");
    }

    /**
     * Sets the unique identifier of the referenced parameterType.
     * @throws UnsupportedOperationException The parameterType property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setParameterType(UUID parameterType) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterSubscription.parameterType");
    }

    /**
     * Sets the unique identifier of the referenced scale.
     * @throws UnsupportedOperationException The scale property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setScale(UUID scale) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterSubscription.scale");
    }

    /**
     * Sets the unique identifier of the referenced stateDependence.
     * @throws UnsupportedOperationException The stateDependence property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setStateDependence(UUID stateDependence) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterSubscription.stateDependence");
    }

    /**
     * Gets the route for the current {@link ParameterSubscription}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link ParameterSubscription}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getValueSet());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.ParameterSubscription} from a {@link ParameterSubscription}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.ParameterSubscription}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.ParameterSubscription(this.getIid(), cache, uri);
    }
}
