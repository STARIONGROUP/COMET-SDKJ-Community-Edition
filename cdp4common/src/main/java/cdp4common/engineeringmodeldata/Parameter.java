/* --------------------------------------------------------------------------------------------------------------------
 * Parameter.java
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
 * representation of a parameter that defines a characteristic or property of an ElementDefinition
 * Note 1: The concurrent engineering process is centered around a multi-disciplinary parametric definition of the system of interest. Parameters (with values) assigned to ElementDefinitions, ElementUsages and possibly NestedElements are the essential mechanism by which each DomainOfExpertise characterises, quantifies, communicates and shares their part of a design solution with all other domains of expertise (DomainOfExpertise).
 * Note 2: The associated ParameterType (through the parameterType property) provides name, shortName, and optionally alias, definition and hyperLink for this Parameter.
 */
@Container(clazz = ElementDefinition.class, propertyName = "parameter")
@ToString
public class Parameter extends ParameterOrOverrideBase implements Cloneable, ModelCode {
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
     * Initializes a new instance of the {@link Parameter} class.
     */
    public Parameter() {
        this.valueSet = new ContainerList<ParameterValueSet>(this);
    }

    /**
     * Initializes a new instance of the {@link Parameter} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public Parameter(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.valueSet = new ContainerList<ParameterValueSet>(this);
    }

    /**
     * Value indicating whether allowDifferentOwnerOfOverride.
     * assertion whether a ParameterOverride associated with this Parameter may have a different owner DomainOfExpertise or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean allowDifferentOwnerOfOverride;

    /**
     * Value indicating whether expectsOverride.
     * assertion whether a ParameterOverride is expected for this Parameter in ElementUsages of the ElementDefinition that contains this Parameter
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean expectsOverride;

    /**
     * Property requestedBy.
     * optional reference to the DomainOfExpertise that has requested this Parameter
     * Note: This property is used to signify that a Parameter has not been created (i.e. added to an ElementDefinition) by the owner DomainOfExpertise by is requested by a different DomainOfExpertise. When the value is unset (i.e. set to null) it signifies that the Parameter has been accepted by the owner DomainOfExpertise.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private DomainOfExpertise requestedBy;

    /**
     * List of contained ParameterValueSet.
     * representation of the switch and values of this Parameter
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ParameterValueSet> valueSet;

    /**
     * {@link Iterable} that references the composite properties of the current {@link Parameter}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets a {@link Collection} that references the composite properties of the current {@link Parameter}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.valueSet);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link Parameter} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Parameter}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        Parameter clone;
        try {
            clone = (Parameter)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow Parameter cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setParameterSubscription(cloneContainedThings ? new ContainerList<ParameterSubscription>(clone) : new ContainerList<ParameterSubscription>(this.getParameterSubscription(), clone, false));
        clone.setValueSet(cloneContainedThings ? new ContainerList<ParameterValueSet>(clone) : new ContainerList<ParameterValueSet>(this.getValueSet(), clone, false));

        if (cloneContainedThings) {
            clone.getParameterSubscription().addAll(this.getParameterSubscription().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getValueSet().addAll(this.getValueSet().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link Parameter} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Parameter}.
     */
    @Override
    public Parameter clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Parameter)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this Parameter}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int valueSetCount = this.getValueSet().size();
        if (valueSetCount < 1) {
            errorList.add("The number of elements in the property valueSet is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link Parameter} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Parameter dto = (cdp4common.dto.Parameter)dtoThing;

        this.setAllowDifferentOwnerOfOverride(dto.isAllowDifferentOwnerOfOverride());
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setExpectsOverride(dto.isExpectsOverride());
        this.setGroup((dto.getGroup() != null) ? PojoThingFactory.get(this.getCache(), dto.getGroup(), dto.getIterationContainerId(), ParameterGroup.class) : null);
        this.setOptionDependent(dto.isOptionDependent());
        this.setModifiedOn(dto.getModifiedOn());
        this.setOwner(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getOwner(), dto.getIterationContainerId(), DomainOfExpertise.class), SentinelThingProvider.getSentinel(DomainOfExpertise.class)));
        PojoThingFactory.resolveList(this.getParameterSubscription(), dto.getParameterSubscription(), dto.getIterationContainerId(), this.getCache(), ParameterSubscription.class);
        this.setParameterType(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getParameterType(), dto.getIterationContainerId(), ParameterType.class), SentinelThingProvider.getSentinel(ParameterType.class)));
        this.setRequestedBy((dto.getRequestedBy() != null) ? PojoThingFactory.get(this.getCache(), dto.getRequestedBy(), dto.getIterationContainerId(), DomainOfExpertise.class) : null);
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setScale((dto.getScale() != null) ? PojoThingFactory.get(this.getCache(), dto.getScale(), dto.getIterationContainerId(), MeasurementScale.class) : null);
        this.setStateDependence((dto.getStateDependence() != null) ? PojoThingFactory.get(this.getCache(), dto.getStateDependence(), dto.getIterationContainerId(), ActualFiniteStateList.class) : null);
        this.setThingPreference(dto.getThingPreference());
        PojoThingFactory.resolveList(this.getValueSet(), dto.getValueSet(), dto.getIterationContainerId(), this.getCache(), ParameterValueSet.class);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link Parameter}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Parameter dto = new cdp4common.dto.Parameter(this.getIid(), this.getRevisionNumber());

        dto.setAllowDifferentOwnerOfOverride(this.isAllowDifferentOwnerOfOverride());
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setExpectsOverride(this.isExpectsOverride());
        dto.setGroup(this.getGroup() != null ? (UUID)this.getGroup().getIid() : null);
        dto.setOptionDependent(this.isOptionDependent());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.getParameterSubscription().addAll(this.getParameterSubscription().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setParameterType(this.getParameterType() != null ? this.getParameterType().getIid() : new UUID(0L, 0L));
        dto.setRequestedBy(this.getRequestedBy() != null ? (UUID)this.getRequestedBy().getIid() : null);
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setScale(this.getScale() != null ? (UUID)this.getScale().getIid() : null);
        dto.setStateDependence(this.getStateDependence() != null ? (UUID)this.getStateDependence().getIid() : null);
        dto.setThingPreference(this.getThingPreference());
        dto.getValueSet().addAll(this.getValueSet().stream().map(Thing::getIid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Computes the model code of the current {@link Parameter}
     * <p>
     * The model code is derived as follows:    
     * {@code #ElementDefinition.ShortName#.#ParameterType.ShortName#}
     * 
     * @param componentIndex This parameter is ignored when computing the model code of a {@link Parameter}
     * @return A string that represents the model code of the current {@link Parameter}
     */
    @Override
    public String modelCode(Integer componentIndex) {
        ElementDefinition elementDefinition = this.getContainer() instanceof ElementDefinition ? (ElementDefinition)this.getContainer() : null;

        if (elementDefinition == null) {
            throw new ContainmentException(String.format("The container ElementDefinition of Parameter with iid %s is null, the model code cannot be computed.", this.getIid()));
        }

        CompoundParameterType compoundParameterType = this.getParameterType() instanceof CompoundParameterType ? (CompoundParameterType)this.getParameterType() : null;
        if (compoundParameterType == null && componentIndex != null && componentIndex > 0) {
            throw new IllegalArgumentException("The value must be 0 if the ParameterType is not a CompoundParameterType (componentIndex)");
        }

        if (compoundParameterType != null && componentIndex != null) {
            String component = Utils.formatComponentShortName(compoundParameterType.getComponent().get(componentIndex).getShortName());
            return String.format("%s.%s.%s", elementDefinition.getShortName(), compoundParameterType.getShortName(), component);
        }

        return String.format("%s.%s", elementDefinition.getShortName(), this.getParameterType().getShortName());
    }

    /**
     * Gets a value indicating whether the {@link Parameter} can be published.
     */
    @Override
    public boolean canBePublished() {
        return this.getValueSet().stream().anyMatch(vs -> !Iterables.elementsEqual(vs.getActualValue(),vs.getPublished()));
    }

    /**
     * Validate this {@link Parameter} with custom rules
     *
     * @return A list of error messages
     */
    @Override
    protected List<String> validatePojoProperties() {
        List<String> errorList = new ArrayList<>(super.validatePojoProperties());

        if (this.isOptionDependent()) {
            Iteration iteration = this.getContainerOfType(Iteration.class);
            if (this.getStateDependence() != null) {
                for (Option option : iteration.getOption()) {
                    for (ActualFiniteState actualState : this.getStateDependence().getActualState().stream().filter(x -> x.getKind() == ActualFiniteStateKind.MANDATORY).collect(Collectors.toList())) {
                        List<ParameterValueSet> valueSets = this.getValueSet().stream().filter(x -> x.getActualOption().equals(option) && x.getActualState().equals(actualState)).collect(Collectors.toList());
                        errorList.addAll(this.validateValueSets(valueSets, option, actualState));
                    }
                }
            } else {
                for (Option option : iteration.getOption()) {
                    List<ParameterValueSet> valueSets = this.getValueSet().stream().filter(x -> x.getActualOption().equals(option)).collect(Collectors.toList());
                    errorList.addAll(this.validateValueSets(valueSets, option, null));
                }
            }
        } else {
            if (this.getStateDependence() != null) {
                for (ActualFiniteState actualState : this.getStateDependence().getActualState().stream().filter(x -> x.getKind() == ActualFiniteStateKind.MANDATORY).collect(Collectors.toList())) {
                    List<ParameterValueSet> valueSets = this.getValueSet().stream().filter(x -> x.getActualState().equals(actualState)).collect(Collectors.toList());
                    errorList.addAll(this.validateValueSets(valueSets, null, actualState));
                }
            } else {
                List<ParameterValueSet> valueSets = this.getValueSet();
                errorList.addAll(this.validateValueSets(valueSets, null, null));
            }
        }

        return errorList;
    }

    /**
     * Validate the value-sets of this {@link Parameter} for an option and state if applicable
     *
     * @param valueSets The {@link ParameterValueSet}s found for the corresponding option and state
     * @param option The {@link Option}
     * @param state The {@link ActualFiniteState}
     * @return a list of error messages
     */
    private List<String> validateValueSets(List<ParameterValueSet> valueSets, Option option, ActualFiniteState state) {
        List<String> errorList = new ArrayList<>();

        if (valueSets.size() == 0) {
            errorList.add(String.format("No value-set was found for the option %s and state %s", (option == null) ? "-" : option.getName(), (state == null) ? "-" : state.getName()));
        }
        else if (valueSets.size() > 1) {
            errorList.add(String.format("Duplicated value-sets were found for the option %s and state %s", (option == null) ? "-" : option.getName(), (state == null) ? "-" : state.getName()));
        } else {
            errorList.addAll(valueSets.get(0).getValidationErrors());
        }

        return errorList;
    }
}
