/* --------------------------------------------------------------------------------------------------------------------
 * ConversionBasedUnit.java
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
 * This is an auto-generated POJO Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

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
import cdp4common.exceptions.ContainmentException;
import cdp4common.extensions.*;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import org.apache.commons.lang3.ObjectUtils;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * abstract specialization of MeasurementUnit that represents a measurement unit that is defined with respect to another reference unit through an explicit conversion relation
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
@ToString
public abstract class ConversionBasedUnit extends MeasurementUnit implements Cloneable {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the {@link ConversionBasedUnit} class.
     */
    protected ConversionBasedUnit() {
    }

    /**
     * Initializes a new instance of the {@link ConversionBasedUnit} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected ConversionBasedUnit(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property conversionFactor.
     * definition of the conversion factor in the unit conversion relation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String conversionFactor;

    /**
     * Property referenceUnit.
     * reference to the MeasurementUnit with respect to which this ConversionBasedUnit is defined
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private MeasurementUnit referenceUnit;

    /**
     * Creates and returns a copy of this {@link ConversionBasedUnit} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ConversionBasedUnit}.
     */
    @Override
    public ConversionBasedUnit clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ConversionBasedUnit)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ConversionBasedUnit}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (Strings.isNullOrEmpty(this.getConversionFactor())) {
            errorList.add("The property conversionFactor is null or empty.");
        }

        if (this.getReferenceUnit() == null || this.getReferenceUnit().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property referenceUnit is null.");
            this.setReferenceUnit(SentinelThingProvider.getSentinel(MeasurementUnit.class));
            this.sentinelResetMap.put("referenceUnit", new ActionImpl(() -> this.setReferenceUnit(null)));
        }

        return errorList;
    }
}
