/* --------------------------------------------------------------------------------------------------------------------
 * IntervalScale.java
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
 * kind of MeasurementScale that has ordered values, a measurement unit and
 * an arbitrary zero value
 * Note 1: The measurement unit defines how to interpret an interval of one
 * on the scale.
 * Note 2: Two interval scales of measurement for the same quantity kind do
 * not need to have coincident zero values. In other words, the zero value
 * can be chosen arbitrarily.
 * Note 3: On an interval scale of measurement it is possible to take the
 * difference between two values or to compute the average (arithmetic
 * mean) of two or more values. Addition or multiplication of values is not
 * defined. It is however possible to add a quantity value defined on a
 * compatible ratio scale to a quantity value defined on an interval scale:
 * e.g. add a temperature difference of 2 kelvin to a temperature of 100
 * degree Celsius.
 * Note 4: The numerical value of a quantity expressed on one interval
 * scale can be converted to the value of the same quantity expressed on a
 * second (different) interval scale if the ratio between the respective
 * measurement units is known (the "conversion factor") as well as the
 * value on the second scale that represents the same quantity as zero on
 * the first scale (the "conversion offset").
 * Example 1: The Celsius and Fahrenheit temperature scales are common
 * examples of interval scales.
 * Example 2: A "Performance" interval scale with values 0: "very low";
 * 5: "medium"; 10: "very high"; can be used to compute weighted average
 * performance for a simple system for which for each of its elements a
 * separate "Performance" measure is given.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "scale")
@ToString
public class IntervalScale extends MeasurementScale implements Cloneable {
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
     * Initializes a new instance of the {@link IntervalScale} class.
     */
    public IntervalScale() {
    }

    /**
     * Initializes a new instance of the {@link IntervalScale} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public IntervalScale(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Creates and returns a copy of this {@link IntervalScale} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link IntervalScale}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        IntervalScale clone;
        try {
            clone = (IntervalScale)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow IntervalScale cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));
        clone.setMappingToReferenceScale(cloneContainedThings ? new ContainerList<MappingToReferenceScale>(clone) : new ContainerList<MappingToReferenceScale>(this.getMappingToReferenceScale(), clone, false));
        clone.setValueDefinition(cloneContainedThings ? new ContainerList<ScaleValueDefinition>(clone) : new ContainerList<ScaleValueDefinition>(this.getValueDefinition(), clone, false));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getMappingToReferenceScale().addAll(this.getMappingToReferenceScale().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getValueDefinition().addAll(this.getValueDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link IntervalScale} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link IntervalScale}.
     */
    @Override
    public IntervalScale clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (IntervalScale)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this IntervalScale}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link IntervalScale} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.IntervalScale dto = (cdp4common.dto.IntervalScale)dtoThing;

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        PojoThingFactory.resolveList(this.getDefinition(), dto.getDefinition(), dto.getIterationContainerId(), this.getCache(), Definition.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getHyperLink(), dto.getHyperLink(), dto.getIterationContainerId(), this.getCache(), HyperLink.class);
        this.setDeprecated(dto.isDeprecated());
        this.setMaximumInclusive(dto.isMaximumInclusive());
        this.setMinimumInclusive(dto.isMinimumInclusive());
        PojoThingFactory.resolveList(this.getMappingToReferenceScale(), dto.getMappingToReferenceScale(), dto.getIterationContainerId(), this.getCache(), MappingToReferenceScale.class);
        this.setMaximumPermissibleValue(dto.getMaximumPermissibleValue());
        this.setMinimumPermissibleValue(dto.getMinimumPermissibleValue());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setNegativeValueConnotation(dto.getNegativeValueConnotation());
        this.setNumberSet(dto.getNumberSet());
        this.setPositiveValueConnotation(dto.getPositiveValueConnotation());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.setThingPreference(dto.getThingPreference());
        this.setUnit(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getUnit(), dto.getIterationContainerId(), MeasurementUnit.class), SentinelThingProvider.getSentinel(MeasurementUnit.class)));
        PojoThingFactory.resolveList(this.getValueDefinition(), dto.getValueDefinition(), dto.getIterationContainerId(), this.getCache(), ScaleValueDefinition.class);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link IntervalScale}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.IntervalScale dto = new cdp4common.dto.IntervalScale(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDeprecated(this.isDeprecated());
        dto.setMaximumInclusive(this.isMaximumInclusive());
        dto.setMinimumInclusive(this.isMinimumInclusive());
        dto.getMappingToReferenceScale().addAll(this.getMappingToReferenceScale().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setMaximumPermissibleValue(this.getMaximumPermissibleValue());
        dto.setMinimumPermissibleValue(this.getMinimumPermissibleValue());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setNegativeValueConnotation(this.getNegativeValueConnotation());
        dto.setNumberSet(this.getNumberSet());
        dto.setPositiveValueConnotation(this.getPositiveValueConnotation());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.setThingPreference(this.getThingPreference());
        dto.setUnit(this.getUnit() != null ? this.getUnit().getIid() : new UUID(0L, 0L));
        dto.getValueDefinition().addAll(this.getValueDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
