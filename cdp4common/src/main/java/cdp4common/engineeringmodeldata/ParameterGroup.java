/* --------------------------------------------------------------------------------------------------------------------
 * ParameterGroup.java
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

package cdp4common.engineeringmodeldata;

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
 * representation of a group of Parameters within an ElementDefinition
 * Note: Grouping of parameters is useful in order to manage and facilitate usage of large sets of parameters. Groups may be nested into a hierarchical structure through the <i>containingGroup</i> property.
 */
@Container(clazz = ElementDefinition.class, propertyName = "parameterGroup")
@ToString
public class ParameterGroup extends Thing implements Cloneable, NamedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NONE;

    /**
     * Initializes a new instance of the {@link ParameterGroup} class.
     */
    public ParameterGroup() {
    }

    /**
     * Initializes a new instance of the {@link ParameterGroup} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ParameterGroup(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property containingGroup.
     * reference to a containing ParameterGroup for this ParameterGroup
     * Note 1: This property allows creating an arbitrarily deeply nested grouping hierarchy for Parameters. The grouping must be acyclic.
     * Note 2: Leaving this property empty implies that the ParameterGroup is directly attached to the containing ElementDefinition.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ParameterGroup containingGroup;

    /**
     * Property name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String name;

    /**
     * Creates and returns a copy of this {@link ParameterGroup} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterGroup}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ParameterGroup clone;
        try {
            clone = (ParameterGroup)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ParameterGroup cannot be cloned.");
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
     * Creates and returns a copy of this {@link ParameterGroup} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterGroup}.
     */
    @Override
    public ParameterGroup clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterGroup)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ParameterGroup}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (Strings.isNullOrEmpty(this.getName())) {
            errorList.add("The property name is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ParameterGroup} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParameterGroup dto = (cdp4common.dto.ParameterGroup)dtoThing;

        this.setContainingGroup((dto.getContainingGroup() != null) ? PojoThingFactory.get(this.getCache(), dto.getContainingGroup(), dto.getIterationContainerId(), ParameterGroup.class) : null);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setThingPreference(dto.getThingPreference());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ParameterGroup}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ParameterGroup dto = new cdp4common.dto.ParameterGroup(this.getIid(), this.getRevisionNumber());

        dto.setContainingGroup(this.getContainingGroup() != null ? (UUID)this.getContainingGroup().getIid() : null);
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setThingPreference(this.getThingPreference());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Queries the container {@link ElementDefinition} of the current {@link ParameterGroup}
     * for those {@link ParameterGroup}s that are "contained" by the current {@link ParameterGroup}.
     *
     * @param extendDeep If {@code extendDeep} is true, get all {@link ParameterGroup}s contained
     * directly and indirectly by the current one
     * 
     * @return An {@link List} that is "contained" by the current {@link ParameterGroup}
     */
    public List<ParameterGroup> getContainedGroup(boolean extendDeep) {
        if (this.getContainer() == null) {
            return new ArrayList<>();
        }

        ElementDefinition elementDefinition = (ElementDefinition)this.getContainer();
        return this.getContainedGroup(elementDefinition.getParameterGroup(), extendDeep);
    }

    /**
     * Queries the {@link ParameterGroup}s that are "contained" by the current {@link ParameterGroup}
     * from the provided {@link List}.
     *
     * @param parameterGroups
     * An {@link List} that may contain {@link ParameterGroup}s that are
     * contained by the current {@link ParameterGroup}
     * 
     * @param extendDeep If {@code extendDeep} is true, get all {@link ParameterGroup}s contained
     * directly and indirectly by the current one
     * 
     * @return 
     * An {@link List} that is "contained" by the current {@link ParameterGroup}
     */
    public List<ParameterGroup> getContainedGroup(List<ParameterGroup> parameterGroups, boolean extendDeep) {
        List<ParameterGroup> containedGroup = new ArrayList<>();

        for (ParameterGroup parameterGroup : parameterGroups) {
            if (!extendDeep && parameterGroup.getContainingGroup() != null && parameterGroup.getContainingGroup().getIid().equals(this.getIid())) {
                containedGroup.add(parameterGroup);
            } else if (extendDeep && this.contains(parameterGroup)) {
                containedGroup.add(parameterGroup);
            }
        }

        return containedGroup;
    }

    /**
     * Queries the {@link Parameter}s that are "contained" by the current {@link ParameterGroup}
     *
     * @return An {@link List} that is "contained" by the current {@link ParameterGroup}
     */
    public List<Parameter> getContainedParameter() {
        if (this.getContainer() == null) {
            return new ArrayList<>();
        }

        ElementDefinition elementDefinition = (ElementDefinition)this.getContainer();
        return this.getContainedParameter(elementDefinition.getParameter());
    }

    /**
     * Queries the {@link Parameter}s that are "contained" by the current {@link ParameterGroup}
     *
     * @param parameters A {@link List} that may contain {@link Parameter}s that are
     * contained by the current {@link ParameterGroup}
     * 
     * @return A {@link List} that is "contained" by the current {@link ParameterGroup}
     */
    public List<Parameter> getContainedParameter(List<Parameter> parameters) {
        List<Parameter> containedParameter = new ArrayList<>();

        for (Parameter parameter : parameters) {
            if (parameter.getGroup() != null && parameter.getGroup().equals(this)) {
                containedParameter.add(parameter);
            }
        }

        return containedParameter;
    }

    /**
     * Queries the grouping level of the current {@link ParameterGroup}.
     *
     * @return 
     * the level of the {@link ParameterGroup} in it's virtual group containment hierarchy.
     * The level of a {@link ParameterGroup} that has no {@code containingGroup} is zero.
     * If the containing {@link ElementDefinition} of the group is null, the result is -1.
     */
    public int getLevel() {
        if (this.getContainer() == null) {
            return -1;
        }

        if (this.getContainingGroup() == null) {
            return 0;
        }

        return this.getContainingGroup().getLevel() + 1;
    }

    /**
     * Gets a value indicating whether this {@link ParameterGroup} can be published.
     */
    public boolean canBePublished() {
        return this.getContainedParameter().stream().anyMatch(parameter -> parameter.canBePublished()) || this.getContainedGroup(false).stream().anyMatch(parameterGroup -> parameterGroup.canBePublished());

    }

    /**
     * Gets a value indicating whether this {@link Publishable} is to be published in the next publication.
     */
    public boolean getToBePublished (){
        if (!this.canBePublished()) {
            return false;
        }

        boolean canAndToBePublished = this.getContainedParameter().stream().filter(ParameterOrOverrideBase::canBePublished).allMatch(ParameterOrOverrideBase::getToBePublished)
                                          && this.getContainedGroup(false).stream().filter(ParameterGroup::canBePublished).allMatch(ParameterGroup::getToBePublished);
        return canAndToBePublished;
    }

    /**
     * Sets a value indicating whether this {@link Publishable} is to be published in the next publication.
     *
     * @param toBePublished a value to set
     */
    public void setToBePublished (boolean toBePublished){
        for (Parameter parameterBase : this.getContainedParameter().stream().filter(ParameterOrOverrideBase::canBePublished).collect(Collectors.toList())) {
            parameterBase.setToBePublished(toBePublished);
        }

        for (ParameterGroup parameterGroup : this.getContainedGroup(false).stream().filter(ParameterGroup::canBePublished).collect(Collectors.toList())) {
            parameterGroup.setToBePublished(toBePublished);
        }
    }

    /**
     * Check whether the {@code group} is "contained" by the current {@link ParameterGroup} directly or indirectly
     *
     * @param group The {@link Parameter} to check
     * @return True if the {@code group} is contained by the current {@link ParameterGroup}
     */
    private boolean contains(ParameterGroup group) {
        if (group.getIid().equals(this.getIid())) {
            return false;
        }

        if (group.getContainingGroup() == null) {
            return false;
        }

        return group.getContainingGroup().getIid().equals(this.getIid()) || this.contains(group.getContainingGroup());
    }
}
