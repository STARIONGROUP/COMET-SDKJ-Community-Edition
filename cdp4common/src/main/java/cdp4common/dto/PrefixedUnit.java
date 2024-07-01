/* --------------------------------------------------------------------------------------------------------------------
 * PrefixedUnit.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
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
import java.time.OffsetDateTime;
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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A Data Transfer Object representation of the {@link PrefixedUnit} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
@ToString
public class PrefixedUnit extends ConversionBasedUnit implements Cloneable {
    /**
     * Initializes a new instance of the {@link PrefixedUnit} class.
     */
    public PrefixedUnit() {
    }

    /**
     * Initializes a new instance of the {@link PrefixedUnit} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public PrefixedUnit(UUID iid, int rev) {
        super(iid, rev);
    }

    /**
     * The unique identifier of the referenced prefix.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID prefix;

    /**
     * Gets the conversionFactor.
     * @throws UnsupportedOperationException The conversionFactor property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @JsonIgnore
    public String getConversionFactor() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property PrefixedUnit.conversionFactor");
    }

    /**
     * Gets the name.
     * @throws UnsupportedOperationException The name property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @JsonIgnore
    public String getName() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property PrefixedUnit.name");
    }

    /**
     * Gets the shortName.
     * @throws UnsupportedOperationException The shortName property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @JsonIgnore
    public String getShortName() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property PrefixedUnit.shortName");
    }

    /**
     * Sets the conversionFactor.
     * @throws UnsupportedOperationException The conversionFactor property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @JsonIgnore
    public void setConversionFactor(String conversionFactor) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property PrefixedUnit.conversionFactor");
    }

    /**
     * Sets the name.
     * @throws UnsupportedOperationException The name property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @JsonIgnore
    public void setName(String name) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property PrefixedUnit.name");
    }

    /**
     * Sets the shortName.
     * @throws UnsupportedOperationException The shortName property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @JsonIgnore
    public void setShortName(String shortName) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property PrefixedUnit.shortName");
    }

    /**
     * Gets the route for the current {@link PrefixedUnit}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.sitedirectorydata.PrefixedUnit} from a {@link PrefixedUnit}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.PrefixedUnit}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.sitedirectorydata.PrefixedUnit(this.getIid(), cache, uri);
    }
}
