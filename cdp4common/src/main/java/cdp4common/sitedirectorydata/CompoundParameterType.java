/* --------------------------------------------------------------------------------------------------------------------
 * CompoundParameterType.java
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
 * representation of a non-scalar compound parameter type that is composed of one or more other (component) ParameterTypes
 * Note 1: The purpose of this parameter type is to allow manipulation of a set of related (usually scalar) parameters as one compound parameter for those cases where all component parameter values need to be considered together. The CompoundParameterType allows modelling parameter types similar to structured datatypes in programming languages and to vectors, matrices and tensors in mathematics and physics.
 * Note 2: The default owner DomainOfExpertises of any associated ParameterTypeComponents are ignored, only the defaultOwner of this CompoundParameterType is taken into account.
 * Example 1: An "event_occurrence" parameter type can be defined by a CompoundParameterType with a "type" and a "timestamp" component. The "type" component would be an EnumerationParameterType that enumerates a number of known event names and the "timestamp" component would be a DateTimeParameterType.
 * Example 2: A 3D Cartesian coordinate position can be defined by a CompoundParameterType (or actually an ArrayParameterType) with "x", "y" and "z" components that would each be QuantityKinds with a quantityKind "position" and a scale "mm" (for "millimetre").
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
public class CompoundParameterType extends ParameterType implements Cloneable {
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
     * Initializes a new instance of the {@link CompoundParameterType} class.
     */
    public CompoundParameterType() {
        this.component = new OrderedItemList<ParameterTypeComponent>(this, true, ParameterTypeComponent.class);
    }

    /**
     * Initializes a new instance of the {@link CompoundParameterType} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public CompoundParameterType(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.component = new OrderedItemList<ParameterTypeComponent>(this, true, ParameterTypeComponent.class);
    }

    /**
     * List of ordered contained ParameterTypeComponent.
     * representation of an individual component of this CompoundParameterType
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private OrderedItemList<ParameterTypeComponent> component;

    /**
     * Value indicating whether isFinalized.
     * assertion whether this CompoundParameterType is finalized
     * Note: Finalized means that the definition of the <i>component</i> collection of this CompoundParameterType is final and therefore may not be changed anymore. Finalization is necessary because the number of values in properties of any associated ParameterValueSets, ParameterOverrideValueSets and ParameterSubscriptionValueSets depend on the number and type of components.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean isFinalized;

    /**
     * {@link Iterable} that references the composite properties of the current {@link CompoundParameterType}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets a {@link Collection} that references the composite properties of the current {@link CompoundParameterType}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.component);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link CompoundParameterType} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link CompoundParameterType}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        CompoundParameterType clone;
        try {
            clone = (CompoundParameterType)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow CompoundParameterType cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setComponent(cloneContainedThings ? null : new OrderedItemList<ParameterTypeComponent>(this.getComponent(), clone, ParameterTypeComponent.class));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.setComponent(this.getComponent().clone(clone));
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link CompoundParameterType} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link CompoundParameterType}.
     */
    @Override
    public CompoundParameterType clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (CompoundParameterType)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this CompoundParameterType}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int componentCount = this.getComponent().size();
        if (componentCount < 1) {
            errorList.add("The number of elements in the property component is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link CompoundParameterType} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.CompoundParameterType dto = (cdp4common.dto.CompoundParameterType)dtoThing;

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        PojoThingFactory.resolveList(this.getCategory(), dto.getCategory(), dto.getIterationContainerId(), this.getCache(), Category.class);
        PojoThingFactory.resolveList(this.getComponent(), dto.getComponent(), dto.getIterationContainerId(), this.getCache(), ParameterTypeComponent.class);
        PojoThingFactory.resolveList(this.getDefinition(), dto.getDefinition(), dto.getIterationContainerId(), this.getCache(), Definition.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getHyperLink(), dto.getHyperLink(), dto.getIterationContainerId(), this.getCache(), HyperLink.class);
        this.setDeprecated(dto.isDeprecated());
        this.setFinalized(dto.isFinalized());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.setSymbol(dto.getSymbol());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link CompoundParameterType}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.CompoundParameterType dto = new cdp4common.dto.CompoundParameterType(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getCategory().addAll(this.getCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getComponent().addAll(this.getComponent().toDtoOrderedItemList());
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDeprecated(this.isDeprecated());
        dto.setFinalized(this.isFinalized());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.setSymbol(this.getSymbol());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Gets the number of values for this {@link CompoundParameterType}
     * 
     * @return The Number of Values of this {@link CompoundParameterType}
     */
    @Override
    public int getDerivedNumberOfValues() {
        return this.getComponent().stream().mapToInt(x -> x.getParameterType().getNumberOfValues()).sum();
    }
}
