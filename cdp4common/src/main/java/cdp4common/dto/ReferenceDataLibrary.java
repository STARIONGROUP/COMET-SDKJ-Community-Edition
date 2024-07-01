/* --------------------------------------------------------------------------------------------------------------------
 * ReferenceDataLibrary.java
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
 * A Data Transfer Object representation of the {@link ReferenceDataLibrary} class.
 */
@ToString
public abstract class ReferenceDataLibrary extends DefinedThing implements Cloneable, ParticipantAffectedAccessThing {
    /**
     * Initializes a new instance of the {@link ReferenceDataLibrary} class.
     */
    protected ReferenceDataLibrary() {
        this.baseQuantityKind = new ArrayList<OrderedItem>();
        this.baseUnit = new ArrayList<UUID>();
        this.constant = new ArrayList<UUID>();
        this.definedCategory = new ArrayList<UUID>();
        this.fileType = new ArrayList<UUID>();
        this.glossary = new ArrayList<UUID>();
        this.parameterType = new ArrayList<UUID>();
        this.referenceSource = new ArrayList<UUID>();
        this.rule = new ArrayList<UUID>();
        this.scale = new ArrayList<UUID>();
        this.unit = new ArrayList<UUID>();
        this.unitPrefix = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link ReferenceDataLibrary} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected ReferenceDataLibrary(UUID iid, int rev) {
        super(iid, rev);
        this.baseQuantityKind = new ArrayList<OrderedItem>();
        this.baseUnit = new ArrayList<UUID>();
        this.constant = new ArrayList<UUID>();
        this.definedCategory = new ArrayList<UUID>();
        this.fileType = new ArrayList<UUID>();
        this.glossary = new ArrayList<UUID>();
        this.parameterType = new ArrayList<UUID>();
        this.referenceSource = new ArrayList<UUID>();
        this.rule = new ArrayList<UUID>();
        this.scale = new ArrayList<UUID>();
        this.unit = new ArrayList<UUID>();
        this.unitPrefix = new ArrayList<UUID>();
    }

    /**
     * The list of ordered unique identifiers of the referenced baseQuantityKind instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<OrderedItem> baseQuantityKind;

    /**
     * The list of unique identifiers of the referenced baseUnit instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> baseUnit;

    /**
     * The unique identifiers of the contained constant instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> constant;

    /**
     * The unique identifiers of the contained definedCategory instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> definedCategory;

    /**
     * The unique identifiers of the contained fileType instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> fileType;

    /**
     * The unique identifiers of the contained glossary instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> glossary;

    /**
     * The unique identifiers of the contained parameterType instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> parameterType;

    /**
     * The unique identifiers of the contained referenceSource instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> referenceSource;

    /**
     * The unique identifier of the referenced requiredRdl.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID requiredRdl;

    /**
     * The unique identifiers of the contained rule instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> rule;

    /**
     * The unique identifiers of the contained scale instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> scale;

    /**
     * The unique identifiers of the contained unit instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> unit;

    /**
     * The unique identifiers of the contained unitPrefix instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> unitPrefix;

    /**
     * Gets an {@link Iterable} that references the composite properties of the current {@link ReferenceDataLibrary}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getConstant());
        containers.add(this.getDefinedCategory());
        containers.add(this.getFileType());
        containers.add(this.getGlossary());
        containers.add(this.getParameterType());
        containers.add(this.getReferenceSource());
        containers.add(this.getRule());
        containers.add(this.getScale());
        containers.add(this.getUnit());
        containers.add(this.getUnitPrefix());
        return containers;
    }
}
