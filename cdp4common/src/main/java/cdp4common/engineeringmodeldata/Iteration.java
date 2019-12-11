/* --------------------------------------------------------------------------------------------------------------------
 * Iteration.java
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
 * representation of an Iteration of an EngineeringModel
 * Note 1: An iteration is a version of the EngineeringModel that was considered as one complete and coherent step in the development of the EngineeringModel in a concurrent engineering activity. The detailed definition and understanding of the meaning of a "complete and coherent" step depends on the organization and activity that develops the EngineeringModel.
 * Note 2: In a concurrent engineering activity the engineering model for the system-of-interest is developed in a number of iterations, where in each iteration the problem specification in the form of the RequirementsSpecification and a design solution in the form of the Options and ElementDefinitions are elaborated and refined. With an iteration the engineering team strives to set one more step in the direction of achieving a converged definition that fulfills the objectives of their activity.
 */
@Container(clazz = EngineeringModel.class, propertyName = "iteration")
@ToString
public class Iteration extends Thing implements Cloneable {
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
     * Initializes a new instance of the {@link Iteration} class.
     */
    public Iteration() {
        this.actualFiniteStateList = new ContainerList<ActualFiniteStateList>(this);
        this.diagramCanvas = new ContainerList<DiagramCanvas>(this);
        this.domainFileStore = new ContainerList<DomainFileStore>(this);
        this.element = new ContainerList<ElementDefinition>(this);
        this.externalIdentifierMap = new ContainerList<ExternalIdentifierMap>(this);
        this.goal = new ContainerList<Goal>(this);
        this.option = new OrderedItemList<Option>(this, true, Option.class);
        this.possibleFiniteStateList = new ContainerList<PossibleFiniteStateList>(this);
        this.publication = new ContainerList<Publication>(this);
        this.relationship = new ContainerList<Relationship>(this);
        this.requirementsSpecification = new ContainerList<RequirementsSpecification>(this);
        this.ruleVerificationList = new ContainerList<RuleVerificationList>(this);
        this.sharedDiagramStyle = new ContainerList<SharedStyle>(this);
        this.stakeholder = new ContainerList<Stakeholder>(this);
        this.stakeholderValue = new ContainerList<StakeholderValue>(this);
        this.stakeholderValueMap = new ContainerList<StakeHolderValueMap>(this);
        this.valueGroup = new ContainerList<ValueGroup>(this);
    }

    /**
     * Initializes a new instance of the {@link Iteration} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public Iteration(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.actualFiniteStateList = new ContainerList<ActualFiniteStateList>(this);
        this.diagramCanvas = new ContainerList<DiagramCanvas>(this);
        this.domainFileStore = new ContainerList<DomainFileStore>(this);
        this.element = new ContainerList<ElementDefinition>(this);
        this.externalIdentifierMap = new ContainerList<ExternalIdentifierMap>(this);
        this.goal = new ContainerList<Goal>(this);
        this.option = new OrderedItemList<Option>(this, true, Option.class);
        this.possibleFiniteStateList = new ContainerList<PossibleFiniteStateList>(this);
        this.publication = new ContainerList<Publication>(this);
        this.relationship = new ContainerList<Relationship>(this);
        this.requirementsSpecification = new ContainerList<RequirementsSpecification>(this);
        this.ruleVerificationList = new ContainerList<RuleVerificationList>(this);
        this.sharedDiagramStyle = new ContainerList<SharedStyle>(this);
        this.stakeholder = new ContainerList<Stakeholder>(this);
        this.stakeholderValue = new ContainerList<StakeholderValue>(this);
        this.stakeholderValueMap = new ContainerList<StakeHolderValueMap>(this);
        this.valueGroup = new ContainerList<ValueGroup>(this);
    }

    /**
     * List of contained ActualFiniteStateList.
     * collection of ActualFiniteStateLists defined for this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ActualFiniteStateList> actualFiniteStateList;

    /**
     * Property defaultOption.
     * reference to the Option that is considered the default Option for this Iteration
     * Note: The referenced default Option must be one of the Options defined in the <i>option</i> property of the Iteration.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Option defaultOption;

    /**
     * List of contained DiagramCanvas.
     * The diagrams created in the scope of the current iteration
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<DiagramCanvas> diagramCanvas;

    /**
     * List of contained DomainFileStore.
     * collection of DomainFileStores in this Iteration
     * Note: Typically there will be one DomainFileStore for each DomainOfExpertise in a particular EngineeringModel, plus one additional CommonFileStore shared by all domains.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<DomainFileStore> domainFileStore;

    /**
     * List of contained ElementDefinition.
     * representation of all ElementDefinitions that represent the system-of-interest for this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ElementDefinition> element;

    /**
     * List of contained ExternalIdentifierMap.
     * collection of ExternalIdentifierMaps defined in this EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ExternalIdentifierMap> externalIdentifierMap;

    /**
     * List of contained Goal.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Goal> goal;

    /**
     * Property iterationSetup.
     * reference to the IterationSetup that contains descriptive information about this Iteration at SiteDirectory level
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private IterationSetup iterationSetup;

    /**
     * List of ordered contained Option.
     * collection of Options defined in this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private OrderedItemList<Option> option;

    /**
     * List of contained PossibleFiniteStateList.
     * collection of PossibleFiniteStateLists defined for this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<PossibleFiniteStateList> possibleFiniteStateList;

    /**
     * List of contained Publication.
     * collection of Publications that are part of this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Publication> publication;

    /**
     * List of contained Relationship.
     * collection of Relationships defined in this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Relationship> relationship;

    /**
     * List of contained RequirementsSpecification.
     * collection of RequirementsSpecifications defined in this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<RequirementsSpecification> requirementsSpecification;

    /**
     * List of contained RuleVerificationList.
     * collection of RuleVerificationLists defined for this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<RuleVerificationList> ruleVerificationList;

    /**
     * List of contained SharedStyle.
     * The shared styles to be applied on diagram elements
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<SharedStyle> sharedDiagramStyle;

    /**
     * Property sourceIterationIid.
     * definition of the unique instance identifier of Iteration that was used as the source to create this Iteration
     * Note: This property records the provenance of the Iteration. Except for the first Iteration of an EngineeeringModel any subsequent Iteration is created as a copy of a source Iteration. For the first Iteration the <i>sourceIterationIid</i> is set to <i>null</i>, which means there was no source.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @Getter
    @Setter
    private UUID sourceIterationIid;

    /**
     * List of contained Stakeholder.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Stakeholder> stakeholder;

    /**
     * List of contained StakeholderValue.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<StakeholderValue> stakeholderValue;

    /**
     * List of contained StakeHolderValueMap.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<StakeHolderValueMap> stakeholderValueMap;

    /**
     * Property topElement.
     * reference to the ElementDefinition that represents the top node of the decomposition of the system-of-interest for this Iteration of an EngineeringModel
     * Note: There is one single topElement for all Options.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ElementDefinition topElement;

    /**
     * List of contained ValueGroup.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ValueGroup> valueGroup;

    /**
     * {@link Iterable} that references the composite properties of the current {@link Iteration}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets a {@link Collection} that references the composite properties of the current {@link Iteration}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.actualFiniteStateList);
        containers.add(this.diagramCanvas);
        containers.add(this.domainFileStore);
        containers.add(this.element);
        containers.add(this.externalIdentifierMap);
        containers.add(this.goal);
        containers.add(this.option);
        containers.add(this.possibleFiniteStateList);
        containers.add(this.publication);
        containers.add(this.relationship);
        containers.add(this.requirementsSpecification);
        containers.add(this.ruleVerificationList);
        containers.add(this.sharedDiagramStyle);
        containers.add(this.stakeholder);
        containers.add(this.stakeholderValue);
        containers.add(this.stakeholderValueMap);
        containers.add(this.valueGroup);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link Iteration} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Iteration}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        Iteration clone;
        try {
            clone = (Iteration)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow Iteration cannot be cloned.");
        }

        clone.setActualFiniteStateList(cloneContainedThings ? new ContainerList<ActualFiniteStateList>(clone) : new ContainerList<ActualFiniteStateList>(this.getActualFiniteStateList(), clone, false));
        clone.setDiagramCanvas(cloneContainedThings ? new ContainerList<DiagramCanvas>(clone) : new ContainerList<DiagramCanvas>(this.getDiagramCanvas(), clone, false));
        clone.setDomainFileStore(cloneContainedThings ? new ContainerList<DomainFileStore>(clone) : new ContainerList<DomainFileStore>(this.getDomainFileStore(), clone, false));
        clone.setElement(cloneContainedThings ? new ContainerList<ElementDefinition>(clone) : new ContainerList<ElementDefinition>(this.getElement(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setExternalIdentifierMap(cloneContainedThings ? new ContainerList<ExternalIdentifierMap>(clone) : new ContainerList<ExternalIdentifierMap>(this.getExternalIdentifierMap(), clone, false));
        clone.setGoal(cloneContainedThings ? new ContainerList<Goal>(clone) : new ContainerList<Goal>(this.getGoal(), clone, false));
        clone.setOption(cloneContainedThings ? null : new OrderedItemList<Option>(this.getOption(), clone, Option.class));
        clone.setPossibleFiniteStateList(cloneContainedThings ? new ContainerList<PossibleFiniteStateList>(clone) : new ContainerList<PossibleFiniteStateList>(this.getPossibleFiniteStateList(), clone, false));
        clone.setPublication(cloneContainedThings ? new ContainerList<Publication>(clone) : new ContainerList<Publication>(this.getPublication(), clone, false));
        clone.setRelationship(cloneContainedThings ? new ContainerList<Relationship>(clone) : new ContainerList<Relationship>(this.getRelationship(), clone, false));
        clone.setRequirementsSpecification(cloneContainedThings ? new ContainerList<RequirementsSpecification>(clone) : new ContainerList<RequirementsSpecification>(this.getRequirementsSpecification(), clone, false));
        clone.setRuleVerificationList(cloneContainedThings ? new ContainerList<RuleVerificationList>(clone) : new ContainerList<RuleVerificationList>(this.getRuleVerificationList(), clone, false));
        clone.setSharedDiagramStyle(cloneContainedThings ? new ContainerList<SharedStyle>(clone) : new ContainerList<SharedStyle>(this.getSharedDiagramStyle(), clone, false));
        clone.setStakeholder(cloneContainedThings ? new ContainerList<Stakeholder>(clone) : new ContainerList<Stakeholder>(this.getStakeholder(), clone, false));
        clone.setStakeholderValue(cloneContainedThings ? new ContainerList<StakeholderValue>(clone) : new ContainerList<StakeholderValue>(this.getStakeholderValue(), clone, false));
        clone.setStakeholderValueMap(cloneContainedThings ? new ContainerList<StakeHolderValueMap>(clone) : new ContainerList<StakeHolderValueMap>(this.getStakeholderValueMap(), clone, false));
        clone.setValueGroup(cloneContainedThings ? new ContainerList<ValueGroup>(clone) : new ContainerList<ValueGroup>(this.getValueGroup(), clone, false));

        if (cloneContainedThings) {
            clone.getActualFiniteStateList().addAll(this.getActualFiniteStateList().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDiagramCanvas().addAll(this.getDiagramCanvas().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDomainFileStore().addAll(this.getDomainFileStore().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getElement().addAll(this.getElement().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getExternalIdentifierMap().addAll(this.getExternalIdentifierMap().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getGoal().addAll(this.getGoal().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.setOption(this.getOption().clone(clone));
            clone.getPossibleFiniteStateList().addAll(this.getPossibleFiniteStateList().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getPublication().addAll(this.getPublication().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getRelationship().addAll(this.getRelationship().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getRequirementsSpecification().addAll(this.getRequirementsSpecification().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getRuleVerificationList().addAll(this.getRuleVerificationList().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getSharedDiagramStyle().addAll(this.getSharedDiagramStyle().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getStakeholder().addAll(this.getStakeholder().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getStakeholderValue().addAll(this.getStakeholderValue().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getStakeholderValueMap().addAll(this.getStakeholderValueMap().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getValueGroup().addAll(this.getValueGroup().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link Iteration} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Iteration}.
     */
    @Override
    public Iteration clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Iteration)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this Iteration}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getIterationSetup() == null || this.getIterationSetup().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property iterationSetup is null.");
            this.setIterationSetup(SentinelThingProvider.getSentinel(IterationSetup.class));
            this.sentinelResetMap.put("iterationSetup", new ActionImpl(() -> this.setIterationSetup(null)));
        }

        int optionCount = this.getOption().size();
        if (optionCount < 1) {
            errorList.add("The number of elements in the property option is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link Iteration} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Iteration dto = (cdp4common.dto.Iteration)dtoThing;

        PojoThingFactory.resolveList(this.getActualFiniteStateList(), dto.getActualFiniteStateList(), dto.getIid(), this.getCache(), ActualFiniteStateList.class);
        this.setDefaultOption((dto.getDefaultOption() != null) ? PojoThingFactory.get(this.getCache(), dto.getDefaultOption(), dto.getIid(), Option.class) : null);
        PojoThingFactory.resolveList(this.getDiagramCanvas(), dto.getDiagramCanvas(), dto.getIid(), this.getCache(), DiagramCanvas.class);
        PojoThingFactory.resolveList(this.getDomainFileStore(), dto.getDomainFileStore(), dto.getIid(), this.getCache(), DomainFileStore.class);
        PojoThingFactory.resolveList(this.getElement(), dto.getElement(), dto.getIid(), this.getCache(), ElementDefinition.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIid(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIid(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getExternalIdentifierMap(), dto.getExternalIdentifierMap(), dto.getIid(), this.getCache(), ExternalIdentifierMap.class);
        PojoThingFactory.resolveList(this.getGoal(), dto.getGoal(), dto.getIid(), this.getCache(), Goal.class);
        this.setIterationSetup(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getIterationSetup(), dto.getIid(), IterationSetup.class), SentinelThingProvider.getSentinel(IterationSetup.class)));
        this.setModifiedOn(dto.getModifiedOn());
        PojoThingFactory.resolveList(this.getOption(), dto.getOption(), dto.getIid(), this.getCache(), Option.class);
        PojoThingFactory.resolveList(this.getPossibleFiniteStateList(), dto.getPossibleFiniteStateList(), dto.getIid(), this.getCache(), PossibleFiniteStateList.class);
        PojoThingFactory.resolveList(this.getPublication(), dto.getPublication(), dto.getIid(), this.getCache(), Publication.class);
        PojoThingFactory.resolveList(this.getRelationship(), dto.getRelationship(), dto.getIid(), this.getCache(), Relationship.class);
        PojoThingFactory.resolveList(this.getRequirementsSpecification(), dto.getRequirementsSpecification(), dto.getIid(), this.getCache(), RequirementsSpecification.class);
        this.setRevisionNumber(dto.getRevisionNumber());
        PojoThingFactory.resolveList(this.getRuleVerificationList(), dto.getRuleVerificationList(), dto.getIid(), this.getCache(), RuleVerificationList.class);
        PojoThingFactory.resolveList(this.getSharedDiagramStyle(), dto.getSharedDiagramStyle(), dto.getIid(), this.getCache(), SharedStyle.class);
        this.setSourceIterationIid(dto.getSourceIterationIid());
        PojoThingFactory.resolveList(this.getStakeholder(), dto.getStakeholder(), dto.getIid(), this.getCache(), Stakeholder.class);
        PojoThingFactory.resolveList(this.getStakeholderValue(), dto.getStakeholderValue(), dto.getIid(), this.getCache(), StakeholderValue.class);
        PojoThingFactory.resolveList(this.getStakeholderValueMap(), dto.getStakeholderValueMap(), dto.getIid(), this.getCache(), StakeHolderValueMap.class);
        this.setTopElement((dto.getTopElement() != null) ? PojoThingFactory.get(this.getCache(), dto.getTopElement(), dto.getIid(), ElementDefinition.class) : null);
        PojoThingFactory.resolveList(this.getValueGroup(), dto.getValueGroup(), dto.getIid(), this.getCache(), ValueGroup.class);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link Iteration}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Iteration dto = new cdp4common.dto.Iteration(this.getIid(), this.getRevisionNumber());

        dto.getActualFiniteStateList().addAll(this.getActualFiniteStateList().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDefaultOption(this.getDefaultOption() != null ? (UUID)this.getDefaultOption().getIid() : null);
        dto.getDiagramCanvas().addAll(this.getDiagramCanvas().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDomainFileStore().addAll(this.getDomainFileStore().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getElement().addAll(this.getElement().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExternalIdentifierMap().addAll(this.getExternalIdentifierMap().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getGoal().addAll(this.getGoal().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setIterationSetup(this.getIterationSetup() != null ? this.getIterationSetup().getIid() : new UUID(0L, 0L));
        dto.setModifiedOn(this.getModifiedOn());
        dto.getOption().addAll(this.getOption().toDtoOrderedItemList());
        dto.getPossibleFiniteStateList().addAll(this.getPossibleFiniteStateList().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getPublication().addAll(this.getPublication().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getRelationship().addAll(this.getRelationship().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getRequirementsSpecification().addAll(this.getRequirementsSpecification().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.getRuleVerificationList().addAll(this.getRuleVerificationList().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getSharedDiagramStyle().addAll(this.getSharedDiagramStyle().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setSourceIterationIid(this.getSourceIterationIid());
        dto.getStakeholder().addAll(this.getStakeholder().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getStakeholderValue().addAll(this.getStakeholderValue().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getStakeholderValueMap().addAll(this.getStakeholderValueMap().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setTopElement(this.getTopElement() != null ? (UUID)this.getTopElement().getIid() : null);
        dto.getValueGroup().addAll(this.getValueGroup().stream().map(Thing::getIid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Gets an {@link Collection} that contains
     * the required {@link ReferenceDataLibrary} for the current {@link Thing}
     */
    @Override
    public Collection<ReferenceDataLibrary> getRequiredRdls() {
        EngineeringModelSetup engineeringModelSetup = (EngineeringModelSetup)this.getIterationSetup().getContainer();
        ReferenceDataLibrary requiredModelReferenceDataLibrary = Iterables.getOnlyElement(engineeringModelSetup.getRequiredRdl());
        Set<ReferenceDataLibrary> requiredRdls = new HashSet<>(super.getRequiredRdls());
        requiredRdls.add(requiredModelReferenceDataLibrary);
        requiredRdls.addAll(requiredModelReferenceDataLibrary.getRequiredRdls());
        return requiredRdls;
    }
}
