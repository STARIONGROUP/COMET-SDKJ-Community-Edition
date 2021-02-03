/* --------------------------------------------------------------------------------------------------------------------
 * SampledFunctionParameterType.java
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
 * ParameterType for parameters whose value is a discretely sampled function where each sample consists of a given unique tuple of independent parameter values mapped to a tuple of dependent parameter values
 * <br>Note 1: See also a http://mathworld.wolfram.com/Map.html for a formal mathematical definition.
 * <br>Note 2: A ParameterValueSet associated with a SampledFunctionParameterType holds a flattened list of values, where each discrete sample is represented by the concatenation of a tuple of values for the independentParameterType(s) followed by a tuple of values for the dependentParameterType(s).
 * <br>Note 3: The total number of values in an associated ParameterValueSet is therefore not fixed but rather a multiple of the sum of independent and dependent scalar parameter types.
 * <br>Example: The SampledFunctionParameterType can be used to define among others the following: (1) a time series of analysis predictions or measurements, (2) a temperature dependent set of material properties, (3) a frequency spectrum displacement response of a structural item, (4) a mapping of key-value pairs, i.e. the same data structure as a dictionary or hash map in a programming language.
 * <br>
 */
@CDPVersion(version = "1.2.0")
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
public class SampledFunctionParameterType extends ParameterType implements Cloneable {
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
     * Initializes a new instance of the {@link SampledFunctionParameterType} class.
     */
    public SampledFunctionParameterType() {
        this.dependentParameterType = new OrderedItemList<DependentParameterTypeAssignment>(this, true, DependentParameterTypeAssignment.class);
        this.independentParameterType = new OrderedItemList<IndependentParameterTypeAssignment>(this, true, IndependentParameterTypeAssignment.class);
        this.interpolationPeriod = new ValueArray<String>(this, String.class);
    }

    /**
     * Initializes a new instance of the {@link SampledFunctionParameterType} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public SampledFunctionParameterType(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.dependentParameterType = new OrderedItemList<DependentParameterTypeAssignment>(this, true, DependentParameterTypeAssignment.class);
        this.independentParameterType = new OrderedItemList<IndependentParameterTypeAssignment>(this, true, IndependentParameterTypeAssignment.class);
        this.interpolationPeriod = new ValueArray<String>(this, String.class);
    }

    /**
     * Property degreeOfInterpolation.
     * optional definition of a degree of interpolation to be used when computing a function value for a domain value that lies in between stored discretely sampled values
     * <br>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @Getter
    @Setter
    private Integer degreeOfInterpolation;

    /**
     * List of ordered contained DependentParameterTypeAssignment.
     * ordered set of ScalarParameterTypes for the dependent values of the sampled function, i.e. representing its range
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private OrderedItemList<DependentParameterTypeAssignment> dependentParameterType;

    /**
     * List of ordered contained IndependentParameterTypeAssignment.
     * ordered set of ScalarParameterTypes for the independent values of the sampled function, i.e. representing its domain
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private OrderedItemList<IndependentParameterTypeAssignment> independentParameterType;

    /**
     * List of ordered String.
     * optional representation of a period in case of a cyclic function to be taken into account for interpolation
     * Note: The number of values shall be equal to the number of parameter types in the <i>independentParameterType</i> property. An empty value means no cyclic interpolation for the corresponding <i>independentParameterType</i>.
     * Example: The function could represent the incident albedo flux as a function of mission elapsed time for a spacecraft in a circular orbit.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ValueArray<String> interpolationPeriod;

    /**
     * {@link Iterable} that references the composite properties of the current {@link SampledFunctionParameterType}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets a {@link Collection} that references the composite properties of the current {@link SampledFunctionParameterType}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.dependentParameterType);
        containers.add(this.independentParameterType);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link SampledFunctionParameterType} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SampledFunctionParameterType}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        SampledFunctionParameterType clone;
        try {
            clone = (SampledFunctionParameterType)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow SampledFunctionParameterType cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setDependentParameterType(cloneContainedThings ? null : new OrderedItemList<DependentParameterTypeAssignment>(this.getDependentParameterType(), clone, DependentParameterTypeAssignment.class));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));
        clone.setIndependentParameterType(cloneContainedThings ? null : new OrderedItemList<IndependentParameterTypeAssignment>(this.getIndependentParameterType(), clone, IndependentParameterTypeAssignment.class));
        clone.setInterpolationPeriod(new ValueArray<String>(this.getInterpolationPeriod(), this, String.class));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.setDependentParameterType(this.getDependentParameterType().clone(clone));
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.setIndependentParameterType(this.getIndependentParameterType().clone(clone));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link SampledFunctionParameterType} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SampledFunctionParameterType}.
     */
    @Override
    public SampledFunctionParameterType clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SampledFunctionParameterType)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this SampledFunctionParameterType}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int dependentParameterTypeCount = this.getDependentParameterType().size();
        if (dependentParameterTypeCount < 1) {
            errorList.add("The number of elements in the property dependentParameterType is wrong. It should be at least 1.");
        }

        int independentParameterTypeCount = this.getIndependentParameterType().size();
        if (independentParameterTypeCount < 1) {
            errorList.add("The number of elements in the property independentParameterType is wrong. It should be at least 1.");
        }

        int interpolationPeriodCount = this.getInterpolationPeriod().size();
        if (interpolationPeriodCount < 1) {
            errorList.add("The number of elements in the property interpolationPeriod is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link SampledFunctionParameterType} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.SampledFunctionParameterType dto = (cdp4common.dto.SampledFunctionParameterType)dtoThing;

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        PojoThingFactory.resolveList(this.getCategory(), dto.getCategory(), dto.getIterationContainerId(), this.getCache(), Category.class);
        PojoThingFactory.resolveList(this.getDefinition(), dto.getDefinition(), dto.getIterationContainerId(), this.getCache(), Definition.class);
        this.setDegreeOfInterpolation(dto.getDegreeOfInterpolation());
        PojoThingFactory.resolveList(this.getDependentParameterType(), dto.getDependentParameterType(), dto.getIterationContainerId(), this.getCache(), DependentParameterTypeAssignment.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getHyperLink(), dto.getHyperLink(), dto.getIterationContainerId(), this.getCache(), HyperLink.class);
        PojoThingFactory.resolveList(this.getIndependentParameterType(), dto.getIndependentParameterType(), dto.getIterationContainerId(), this.getCache(), IndependentParameterTypeAssignment.class);
        this.setInterpolationPeriod(new ValueArray<String>(dto.getInterpolationPeriod(), this, String.class));
        this.setDeprecated(dto.isDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.setSymbol(dto.getSymbol());
        this.setThingPreference(dto.getThingPreference());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link SampledFunctionParameterType}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.SampledFunctionParameterType dto = new cdp4common.dto.SampledFunctionParameterType(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getCategory().addAll(this.getCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDegreeOfInterpolation(this.getDegreeOfInterpolation());
        dto.getDependentParameterType().addAll(this.getDependentParameterType().toDtoOrderedItemList());
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getIndependentParameterType().addAll(this.getIndependentParameterType().toDtoOrderedItemList());
        dto.setInterpolationPeriod(new ValueArray<String>(this.getInterpolationPeriod(), this, String.class));
        dto.setDeprecated(this.isDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.setSymbol(this.getSymbol());
        dto.setThingPreference(this.getThingPreference());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
