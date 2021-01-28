/* --------------------------------------------------------------------------------------------------------------------
 * ParameterTypeComponent.java
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
 * representation of a component of a CompoundParameterType
 * Example 1: ParameterTypeComponents with shortNames "x", "y" and "z" for the components of a
 * ArrayParameterType that represents a 3D Cartesian coordinate position.
 * Example 2: Components "nr" and  "connector_type" for a CompoundParameterType that defines the number of a certain type of connectors. The "nr" component would be a "count" QuantityKind and the "connector_type" would be a EnumerationParameterType with an enumeration of known connector types.
 */
@Container(clazz = CompoundParameterType.class, propertyName = "component")
@ToString
public class ParameterTypeComponent extends Thing implements Cloneable, ShortNamedThing {
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
     * Initializes a new instance of the {@link ParameterTypeComponent} class.
     */
    public ParameterTypeComponent() {
    }

    /**
     * Initializes a new instance of the {@link ParameterTypeComponent} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ParameterTypeComponent(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property parameterType.
     * specification of the ParameterType of this component
     * Note: If the ParameterTypeComponent is a <i>component</i> of an ArrayParameterType it must be a ScalarParameterType.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ParameterType parameterType;

    /**
     * Property scale.
     * specification of the MeasurementScale for this component of a       CompoundParameterType
     * Note: The scale shall only be specified for a ScalarParameterType       component       that       is       a       QuantityKind,       i.e.       a       numerical       parameter       type.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private MeasurementScale scale;

    /**
     * Property shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String shortName;

    /**
     * Creates and returns a copy of this {@link ParameterTypeComponent} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterTypeComponent}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ParameterTypeComponent clone;
        try {
            clone = (ParameterTypeComponent)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ParameterTypeComponent cannot be cloned.");
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
     * Creates and returns a copy of this {@link ParameterTypeComponent} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterTypeComponent}.
     */
    @Override
    public ParameterTypeComponent clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterTypeComponent)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ParameterTypeComponent}.
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

        if (Strings.isNullOrEmpty(this.getShortName())) {
            errorList.add("The property shortName is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ParameterTypeComponent} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParameterTypeComponent dto = (cdp4common.dto.ParameterTypeComponent)dtoThing;

        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setParameterType(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getParameterType(), dto.getIterationContainerId(), ParameterType.class), SentinelThingProvider.getSentinel(ParameterType.class)));
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setScale((dto.getScale() != null) ? PojoThingFactory.get(this.getCache(), dto.getScale(), dto.getIterationContainerId(), MeasurementScale.class) : null);
        this.setShortName(dto.getShortName());
        this.setThingPreference(dto.getThingPreference());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ParameterTypeComponent}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ParameterTypeComponent dto = new cdp4common.dto.ParameterTypeComponent(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setParameterType(this.getParameterType() != null ? this.getParameterType().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setScale(this.getScale() != null ? (UUID)this.getScale().getIid() : null);
        dto.setShortName(this.getShortName());
        dto.setThingPreference(this.getThingPreference());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Gets the 0-based index of the {@link ParameterTypeComponent} that it has in the Component {@link OrderedItemList}
     * @return -1 if the {@link ParameterTypeComponent} does not have a container set
     */
    public int getIndex()
    {
        CompoundParameterType compoundParameterType = this.getContainer() instanceof CompoundParameterType ? (CompoundParameterType)(this.getContainer()) : null;
        if (compoundParameterType != null)
        {
            return compoundParameterType.getComponent().indexOf(this);
        }

        return -1;
    }
}
