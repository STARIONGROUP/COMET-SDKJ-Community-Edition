/* --------------------------------------------------------------------------------------------------------------------
 * ElementDefinition.java
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
 * definition of an element in a design solution for a system-of-interest
 * Note 1: An element is defined once (as an ElementDefinition) and then can be used (as an ElementUsage) any number of times in a design solution for the system-of-interest.
 * Note 2: The ElementDefinition and ElementUsage structure together form the representation of the hierarchical design composition / decomposition of the system-of-interest. Through the combination of the <i>containedElement</i> property and the <i>referencedElement</i> property of ElementUsage a hybrid product tree can be represented in which both logical and concrete (aka physical) architecture are combined.
 * Note 3: Because of the containment relationship between ElementDefinition and ElementUsage, there is special behaviour with respect to Category membership. If an ElementDefinition is defined to be a member of a Category (through its category property), then also any ElementUsage that is typed by this ElementDefinition is a member of that Category.
 * Example: The design of gyroscope "GS-123" is defined in an ElementDefinition and then 4 gyroscopes of this type are used as part of the attitude and orbit control equipment through 4 ElementUsages with names "x-gyro", "y-gyro", "z-gyro" and "xyz-gyro". All 4 usages are said to be of <i>type</i> "GS-123".
 * Note 3: ElementDefinition is the equivalent of the concept of <i>Block</i> in OMG SysML. ElementUsage is the equivalent of the concept of <i>Part</i> in OMG SysML.
 */
@Container(clazz = Iteration.class, propertyName = "element")
@ToString
public class ElementDefinition extends ElementBase implements Cloneable, ModelCode {
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
     * Initializes a new instance of the {@link ElementDefinition} class.
     */
    public ElementDefinition() {
        this.containedElement = new ContainerList<ElementUsage>(this);
        this.organizationalParticipant = new ArrayList<OrganizationalParticipant>();
        this.parameter = new ContainerList<Parameter>(this);
        this.parameterGroup = new ContainerList<ParameterGroup>(this);
        this.referencedElement = new ArrayList<NestedElement>();
    }

    /**
     * Initializes a new instance of the {@link ElementDefinition} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ElementDefinition(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.containedElement = new ContainerList<ElementUsage>(this);
        this.organizationalParticipant = new ArrayList<OrganizationalParticipant>();
        this.parameter = new ContainerList<Parameter>(this);
        this.parameterGroup = new ContainerList<ParameterGroup>(this);
        this.referencedElement = new ArrayList<NestedElement>();
    }

    /**
     * List of contained ElementUsage.
     * list of zero or more usages of elements at the next lower level of hierarchical decomposition, where each element is defined (typed) by an(other) ElementDefinition
     * Note 1: This property captures the whole-part relationship between an ElementDefinition (the whole, the <i>containingElement</i>) and an ElementUsage (the part, the <i>containedElement</i>). This implies that the ElementUsage is existence dependent on the <i>containingElement</i> ElementDefinition. If the ElementDefinition is removed from the system-of-interest also its dependent ElementUsages are removed, as well as any subtree of ElementUsages subtended below the first lower level.
     * Note 2: The permitted <i>containedElement</i> and <i>referencedElement</i> collections can be defined through a combination of appropriate Categories, DecompositionRules and ReferencerRules.
     * Note 3: The <i>containedElement</i> property is the equivalent of a <i>part property</i> of a <i>Block</i> in OMG SysML.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ElementUsage> containedElement;

    /**
     * List of OrganizationalParticipant.
     * represents a list of OrganizationalParticipant that are privy to this ElementDefinition. Exclusion of your Organization from this list indicates no access to this ElementDefinition.
     * NOTE: defaultOrganizationalParticipant of the containing EngineeringModelSetup bypass this list and are able to see all ElementDefinitions and their contents.
     * NOTE 2: the constents of this list must be a subset of the organizationalParticipant list of the EnggineeringModelSetup.
     * NOTE 3: if the organizationalParticipant list of the EnggineeringModelSetup is pruned, this list must be cleaned up.
     */
    @CDPVersion(version = "1.2.0")
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<OrganizationalParticipant> organizationalParticipant;

    /**
     * List of contained Parameter.
     * collection of Parameters that define characteristics of this ElementDefinition
     * Note: Parameters and ParameterValueSets together form the parametric definition of this ElementDefinition as well as of ElementUsages that are typed by this ElementDefinition.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Parameter> parameter;

    /**
     * List of contained ParameterGroup.
     * collection of ParameterGroups that define a grouping hierarchy to hold the Parameters of this ElementDefinition
     * Note: This grouping does not carry specific meaning, but is a convenience mechanism to assist in the management and presentation of large sets of parameters.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ParameterGroup> parameterGroup;

    /**
     * List of NestedElement.
     * zero or more references to ElementUsages at lower level(s) in the hierarchical decomposition of the system-of-interest
     * Note 1: Referencing elements through NestedElements is a flexible and unconstrained mechanism to support network-type architectures and ad-hoc structures. The semantics of these references need to be defined through appropriate Categories that are associated with the participating ElementDefinitions, ElementUsages and NestedElements. Since the Categories are defined in ReferenceDataLibraries the interpretation of such references is therefore reference data dependent.
     * Note 2: In order to adhere to the principle of strict modularity, the only permissible referencedElement(s) are ElementUsage(s) contained in the subtree of this ElementDefinition.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<NestedElement> referencedElement;

    /**
     * {@link Iterable} that references the composite properties of the current {@link ElementDefinition}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets a {@link Collection} that references the composite properties of the current {@link ElementDefinition}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.containedElement);
        containers.add(this.parameter);
        containers.add(this.parameterGroup);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link ElementDefinition} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ElementDefinition}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ElementDefinition clone;
        try {
            clone = (ElementDefinition)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ElementDefinition cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setContainedElement(cloneContainedThings ? new ContainerList<ElementUsage>(clone) : new ContainerList<ElementUsage>(this.getContainedElement(), clone, false));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));
        clone.setOrganizationalParticipant(new ArrayList<OrganizationalParticipant>(this.getOrganizationalParticipant()));
        clone.setParameter(cloneContainedThings ? new ContainerList<Parameter>(clone) : new ContainerList<Parameter>(this.getParameter(), clone, false));
        clone.setParameterGroup(cloneContainedThings ? new ContainerList<ParameterGroup>(clone) : new ContainerList<ParameterGroup>(this.getParameterGroup(), clone, false));
        clone.setReferencedElement(new ArrayList<NestedElement>(this.getReferencedElement()));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getContainedElement().addAll(this.getContainedElement().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getParameter().addAll(this.getParameter().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getParameterGroup().addAll(this.getParameterGroup().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ElementDefinition} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ElementDefinition}.
     */
    @Override
    public ElementDefinition clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ElementDefinition)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ElementDefinition}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ElementDefinition} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ElementDefinition dto = (cdp4common.dto.ElementDefinition)dtoThing;

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        PojoThingFactory.resolveList(this.getCategory(), dto.getCategory(), dto.getIterationContainerId(), this.getCache(), Category.class);
        PojoThingFactory.resolveList(this.getContainedElement(), dto.getContainedElement(), dto.getIterationContainerId(), this.getCache(), ElementUsage.class);
        PojoThingFactory.resolveList(this.getDefinition(), dto.getDefinition(), dto.getIterationContainerId(), this.getCache(), Definition.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getHyperLink(), dto.getHyperLink(), dto.getIterationContainerId(), this.getCache(), HyperLink.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        PojoThingFactory.resolveList(this.getOrganizationalParticipant(), dto.getOrganizationalParticipant(), dto.getIterationContainerId(), this.getCache(), OrganizationalParticipant.class);
        this.setOwner(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getOwner(), dto.getIterationContainerId(), DomainOfExpertise.class), SentinelThingProvider.getSentinel(DomainOfExpertise.class)));
        PojoThingFactory.resolveList(this.getParameter(), dto.getParameter(), dto.getIterationContainerId(), this.getCache(), Parameter.class);
        PojoThingFactory.resolveList(this.getParameterGroup(), dto.getParameterGroup(), dto.getIterationContainerId(), this.getCache(), ParameterGroup.class);
        PojoThingFactory.resolveList(this.getReferencedElement(), dto.getReferencedElement(), dto.getIterationContainerId(), this.getCache(), NestedElement.class);
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.setThingPreference(dto.getThingPreference());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ElementDefinition}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ElementDefinition dto = new cdp4common.dto.ElementDefinition(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getCategory().addAll(this.getCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getContainedElement().addAll(this.getContainedElement().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getOrganizationalParticipant().addAll(this.getOrganizationalParticipant().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.getParameter().addAll(this.getParameter().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getParameterGroup().addAll(this.getParameterGroup().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getReferencedElement().addAll(this.getReferencedElement().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
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
     * Queries the {@link ParameterGroup}s that are "contained" directly by the current {@link ElementDefinition}.
     *
     * @return A {@link List} that is "contained" by the current {@link ElementDefinition}
     */
    public List<ParameterGroup> getContainedGroup() {
        return this.getContainedGroup(this.getParameterGroup());
    }

    /**
     * Queries the {@link ParameterGroup}s that are "contained" directly by the current {@link ElementDefinition}.
     *
     * @param parameterGroups A {@link List} that may contain {@link ParameterGroup}s that are
     * contained by the current {@link ElementDefinition}
     * @return A {@link List} that is "contained" by the current {@link ElementDefinition}
     */
    private List<ParameterGroup> getContainedGroup(List<ParameterGroup> parameterGroups) {
        List<ParameterGroup> containedGroup = new ArrayList<>();

        for (ParameterGroup parameterGroup : parameterGroups) {
            if (parameterGroup.getContainingGroup() == null) {
                containedGroup.add(parameterGroup);
            }
        }

        return containedGroup;
    }

    /**
     * Queries the {@link Parameter}s that are "contained" by the current {@link ElementDefinition}
     *
     * @return 
     * A {@link List} that is "contained" directly by the current {@link ElementDefinition}
     */
    public List<Parameter> getContainedParameter()
    {
        return this.getContainedParameter(this.getParameter());
    }

    /**
     * Queries the {@link Parameter}s that are "contained" by the current {@link ElementDefinition}
     *
     * @param parameters A {@link List} that may contain {@link Parameter}s that are
     * contained by the current {@link ElementDefinition}
     * @return A {@link List} that is "contained" by the current {@link ElementDefinition}
     */
    public List<Parameter> getContainedParameter(List<Parameter> parameters) {
        List<Parameter> containedParameter = new ArrayList<>();

        if (parameters != null) {
            for (Parameter parameter : parameters) {
                if (parameter.getGroup() == null) {
                    containedParameter.add(parameter);
                }
            }
        }

        return containedParameter;
    }

    /**
     * Assert whether this {@link ElementDefinition} contains in its usage tree a usage of the given {@link ElementDefinition}
     *
     * @param elementDefinition The given {@link ElementDefinition}
     * @return True if it does or if the given {@link ElementDefinition} is the current one. False otherwise
     */
    public boolean hasUsageOf(ElementDefinition elementDefinition) {
        if (elementDefinition == null) {
            throw new IllegalArgumentException("elementDefinition");
        }

        if (this == elementDefinition) {
            return true;
        }

        for (ElementUsage elementUsage : this.getContainedElement()) {
            boolean result = (elementUsage.getElementDefinition().equals(elementDefinition))
                    || elementUsage.getElementDefinition().hasUsageOf(elementDefinition);
            if (result) {
                return true;
            }
        }

        return false;
    }

    /**
     * Queries the {@link ElementUsage}s that reference the current {@link ElementDefinition}
     *
     * @return A {@link List} that reference the current {@link ElementDefinition}
     */
    public List<ElementUsage> referencingElementUsages() {
        Iteration iteration = this.getContainer() instanceof Iteration ? (Iteration)this.getContainer() : null;

        if (iteration == null) {
            throw new ContainmentException("The Container of ElementUsage is not the right type or is null");
        }

        return iteration.getElement().stream().flatMap(x -> x.getContainedElement().stream()).filter(x -> x.getElementDefinition().equals(this)).collect(Collectors.toList());
    }

    /**
     * Computes the model code of the current {@link ElementDefinition}
     * <p>
     * The model code is derived as follows:
     * {@code #ElementDefinition.ShortName#}
     *
     * @param componentIndex This parameter is ignored when computing the model code of a {@link ElementDefinition}
     * @return A string that represents the model code of the current {@link ElementDefinition}
     * @throws IllegalArgumentException The component index for an {@link ElementDefinition} must be 0.
     */
    public String modelCode(Integer componentIndex) {
        if (componentIndex != null) {
            throw new IllegalArgumentException("The component index must be null (componentIndex)");
        }

        return this.getShortName();
    }

    /**
     * Gets a value indicating whether this {@link ElementDefinition} can be published.
     */
    @Override
    public boolean canBePublished() {
        return this.getContainedElement().stream().anyMatch(ElementUsage::canBePublished) || this.getParameter().stream().anyMatch(ParameterOrOverrideBase::canBePublished);
    }

    /**
     * Gets a value indicating whether this {@link ElementUsage} will be published in the next {@link Publication}.
     */
    @Override
    public boolean getToBePublished() {
        if (!this.canBePublished()) {
            return false;
        }

        boolean containsObjectsAllToBePublished =
                this.getParameter().stream().filter(ParameterOrOverrideBase::canBePublished).allMatch(ParameterOrOverrideBase::getToBePublished)
                    && this.getParameterGroup().stream().filter(parameterGroup -> parameterGroup.canBePublished()).allMatch(parameterGroup -> parameterGroup.getToBePublished())
                    && this.getContainedElement().stream().filter(ElementUsage::canBePublished).allMatch(ElementUsage::getToBePublished);

        return containsObjectsAllToBePublished;
    }

    /**
     * Sets a value indicating whether this {@link ElementUsage} will be published in the next {@link Publication}.
     *
     * @param toBePublished a value to set
     */
    @Override
    public void setToBePublished(boolean toBePublished) {
        for (ElementUsage elementUsage : this.getContainedElement().stream().filter(ElementUsage::canBePublished).collect(Collectors.toList())) {
            elementUsage.setToBePublished(toBePublished);
        }

        for (Parameter parameter : this.getParameter().stream().filter(ParameterOrOverrideBase::canBePublished).collect(Collectors.toList())) {
            parameter.setToBePublished(toBePublished);
        }
    }
}
