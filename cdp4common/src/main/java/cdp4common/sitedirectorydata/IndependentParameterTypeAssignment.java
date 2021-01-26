/* --------------------------------------------------------------------------------------------------------------------
 * IndependentParameterTypeAssignment.java
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
 * a pairing of an assigned ParameterType and a MeasurementScale, specific to independent parameter types of a SampledFunctionParameterType, in case a QuantityKind is selected. The MeasurementScale must be in the array of possible MeasurementScales of the the ParameterType.
 */
@CDPVersion(version = "1.2.0")
@Container(clazz = SampledFunctionParameterType.class, propertyName = "independentParameterType")
@ToString
public class IndependentParameterTypeAssignment extends Thing implements Cloneable, ParameterTypeAssignment {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the {@link IndependentParameterTypeAssignment} class.
     */
    public IndependentParameterTypeAssignment() {
    }

    /**
     * Initializes a new instance of the {@link IndependentParameterTypeAssignment} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public IndependentParameterTypeAssignment(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property measurementScale.
     * the MeasurementScale applicable to the ParameterType of the selection. Null if the ParameterType is not a QuantityKind. Must be in the array of possible MeasurementScales of the selected ParameterType.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private MeasurementScale measurementScale;

    /**
     * Property parameterType.
     * the selected ParameterType assignment.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ParameterType parameterType;

    /**
     * Creates and returns a copy of this {@link IndependentParameterTypeAssignment} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link IndependentParameterTypeAssignment}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        IndependentParameterTypeAssignment clone;
        try {
            clone = (IndependentParameterTypeAssignment)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow IndependentParameterTypeAssignment cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link IndependentParameterTypeAssignment} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link IndependentParameterTypeAssignment}.
     */
    @Override
    public IndependentParameterTypeAssignment clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (IndependentParameterTypeAssignment)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this IndependentParameterTypeAssignment}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getParameterType() == null || this.getParameterType().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property parameterType is null.");
            this.setParameterType(SentinelThingProvider.getSentinel(ParameterType.class));
            this.sentinelResetMap.put("parameterType", new ActionImpl(() -> this.setParameterType(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link IndependentParameterTypeAssignment} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.IndependentParameterTypeAssignment dto = (cdp4common.dto.IndependentParameterTypeAssignment)dtoThing;

        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setMeasurementScale((dto.getMeasurementScale() != null) ? PojoThingFactory.get(this.getCache(), dto.getMeasurementScale(), dto.getIterationContainerId(), MeasurementScale.class) : null);
        this.setModifiedOn(dto.getModifiedOn());
        this.setParameterType(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getParameterType(), dto.getIterationContainerId(), ParameterType.class), SentinelThingProvider.getSentinel(ParameterType.class)));
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setThingPreference(dto.getThingPreference());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link IndependentParameterTypeAssignment}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.IndependentParameterTypeAssignment dto = new cdp4common.dto.IndependentParameterTypeAssignment(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setMeasurementScale(this.getMeasurementScale() != null ? (UUID)this.getMeasurementScale().getIid() : null);
        dto.setModifiedOn(this.getModifiedOn());
        dto.setParameterType(this.getParameterType() != null ? this.getParameterType().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setThingPreference(this.getThingPreference());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
