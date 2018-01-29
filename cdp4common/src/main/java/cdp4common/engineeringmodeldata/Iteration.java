/* --------------------------------------------------------------------------------------------------------------------
 * AbstractIteration.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
import org.apache.commons.lang3.tuple.Pair;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of an Iteration of an EngineeringModel
 * Note 1: An iteration is a version of the EngineeringModel that was considered as one complete and coherent step in the development of the EngineeringModel in a concurrent engineering activity. The detailed definition and understanding of the meaning of a "complete and coherent" step depends on the organization and activity that develops the EngineeringModel.
 * Note 2: In a concurrent engineering activity the engineering model for the system-of-interest is developed in a number of iterations, where in each iteration the problem specification in the form of the RequirementsSpecification and a design solution in the form of the Options and ElementDefinitions are elaborated and refined. With an iteration the engineering team strives to set one more step in the direction of achieving a converged definition that fulfills the objectives of their activity.
 */
@Container(clazz = EngineeringModel.class, propertyName = "iteration")
@ToString
@EqualsAndHashCode
public  class Iteration extends Thing  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NONE;

    /**
     * Initializes a new instance of the <code>Iteration<code/> class.
     *
     * @see Iteration
     */
    public Iteration() {
        this.actualFiniteStateList = new ContainerList<ActualFiniteStateList>(this);
        this.diagramCanvas = new ContainerList<DiagramCanvas>(this);
        this.domainFileStore = new ContainerList<DomainFileStore>(this);
        this.element = new ContainerList<ElementDefinition>(this);
        this.externalIdentifierMap = new ContainerList<ExternalIdentifierMap>(this);
        this.goal = new ContainerList<Goal>(this);
        this.option = new OrderedItemList<Option>(this, true);
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
     * Initializes a new instance of the <code>Iteration<code/> class.
     * @param iid The unique identifier.
     * @param cache The <code>ConcurrentHashMap<K,V></code> where the current thing is stored.
     * The <code>Pair<L,R><code/> of <code>UUID<code/> is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its <code>Iteration<code/> container if applicable or null.
     * @param iDalUri The <code>URI</code> of this thing
     *
     * @see ConcurrentHashMap
     * @see URI
     * @see UUID
     * @see Pair
     * @see Iteration
     * @see Iteration
     */
    public Iteration(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.actualFiniteStateList = new ContainerList<ActualFiniteStateList>(this);
        this.diagramCanvas = new ContainerList<DiagramCanvas>(this);
        this.domainFileStore = new ContainerList<DomainFileStore>(this);
        this.element = new ContainerList<ElementDefinition>(this);
        this.externalIdentifierMap = new ContainerList<ExternalIdentifierMap>(this);
        this.goal = new ContainerList<Goal>(this);
        this.option = new OrderedItemList<Option>(this, true);
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
    private ContainerList<ActualFiniteStateList> actualFiniteStateList;

    /**
     * Property defaultOption.
     * reference to the Option that is considered the default Option for this Iteration
     * Note: The referenced default Option must be one of the Options defined in the <i>option</i> property of the Iteration.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Option defaultOption;

    /**
     * List of contained DiagramCanvas.
     * The diagrams created in the scope of the current iteration
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<DiagramCanvas> diagramCanvas;

    /**
     * List of contained DomainFileStore.
     * collection of DomainFileStores in this Iteration
     * Note: Typically there will be one DomainFileStore for each DomainOfExpertise in a particular EngineeringModel, plus one additional CommonFileStore shared by all domains.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<DomainFileStore> domainFileStore;

    /**
     * List of contained ElementDefinition.
     * representation of all ElementDefinitions that represent the system-of-interest for this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ElementDefinition> element;

    /**
     * List of contained ExternalIdentifierMap.
     * collection of ExternalIdentifierMaps defined in this EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ExternalIdentifierMap> externalIdentifierMap;

    /**
     * List of contained Goal.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Goal> goal;

    /**
     * Property iterationSetup.
     * reference to the IterationSetup that contains descriptive information about this Iteration at SiteDirectory level
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private IterationSetup iterationSetup;

    /**
     * List of ordered contained Option.
     * collection of Options defined in this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<Option> option;

    /**
     * List of contained PossibleFiniteStateList.
     * collection of PossibleFiniteStateLists defined for this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<PossibleFiniteStateList> possibleFiniteStateList;

    /**
     * List of contained Publication.
     * collection of Publications that are part of this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Publication> publication;

    /**
     * List of contained Relationship.
     * collection of Relationships defined in this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Relationship> relationship;

    /**
     * List of contained RequirementsSpecification.
     * collection of RequirementsSpecifications defined in this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<RequirementsSpecification> requirementsSpecification;

    /**
     * List of contained RuleVerificationList.
     * collection of RuleVerificationLists defined for this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<RuleVerificationList> ruleVerificationList;

    /**
     * List of contained SharedStyle.
     * The shared styles to be applied on diagram elements
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<SharedStyle> sharedDiagramStyle;

    /**
     * Property sourceIterationIid.
     * definition of the unique instance identifier of Iteration that was used as the source to create this Iteration
     * Note: This property records the provenance of the Iteration. Except for the first Iteration of an EngineeeringModel any subsequent Iteration is created as a copy of a source Iteration. For the first Iteration the <i>sourceIterationIid</i> is set to <i>null</i>, which means there was no source.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private UUID sourceIterationIid;

    /**
     * List of contained Stakeholder.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Stakeholder> stakeholder;

    /**
     * List of contained StakeholderValue.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<StakeholderValue> stakeholderValue;

    /**
     * List of contained StakeHolderValueMap.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<StakeHolderValueMap> stakeholderValueMap;

    /**
     * Property topElement.
     * reference to the ElementDefinition that represents the top node of the decomposition of the system-of-interest for this Iteration of an EngineeringModel
     * Note: There is one single topElement for all Options.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ElementDefinition topElement;

    /**
     * List of contained ValueGroup.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ValueGroup> valueGroup;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>Iteration<code/>.
     *
     * @see Iterable
     * @see Iteration
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of contained ActualFiniteStateList.
     * collection of ActualFiniteStateLists defined for this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ActualFiniteStateList> getActualFiniteStateList(){
         return this.actualFiniteStateList;
    }

    /**
     * Gets the defaultOption.
     * reference to the Option that is considered the default Option for this Iteration
     * Note: The referenced default Option must be one of the Options defined in the <i>option</i> property of the Iteration.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Option getDefaultOption(){
         return this.defaultOption;
    }

    /**
     * Gets a list of contained DiagramCanvas.
     * The diagrams created in the scope of the current iteration
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<DiagramCanvas> getDiagramCanvas(){
         return this.diagramCanvas;
    }

    /**
     * Gets a list of contained DomainFileStore.
     * collection of DomainFileStores in this Iteration
     * Note: Typically there will be one DomainFileStore for each DomainOfExpertise in a particular EngineeringModel, plus one additional CommonFileStore shared by all domains.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<DomainFileStore> getDomainFileStore(){
         return this.domainFileStore;
    }

    /**
     * Gets a list of contained ElementDefinition.
     * representation of all ElementDefinitions that represent the system-of-interest for this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ElementDefinition> getElement(){
         return this.element;
    }

    /**
     * Gets a list of contained ExternalIdentifierMap.
     * collection of ExternalIdentifierMaps defined in this EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ExternalIdentifierMap> getExternalIdentifierMap(){
         return this.externalIdentifierMap;
    }

    /**
     * Gets a list of contained Goal.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Goal> getGoal(){
         return this.goal;
    }

    /**
     * Gets the iterationSetup.
     * reference to the IterationSetup that contains descriptive information about this Iteration at SiteDirectory level
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public IterationSetup getIterationSetup(){
         return this.iterationSetup;
    }

    /**
     * Gets a list of ordered contained Option.
     * collection of Options defined in this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<Option> getOption(){
         return this.option;
    }

    /**
     * Gets a list of contained PossibleFiniteStateList.
     * collection of PossibleFiniteStateLists defined for this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<PossibleFiniteStateList> getPossibleFiniteStateList(){
         return this.possibleFiniteStateList;
    }

    /**
     * Gets a list of contained Publication.
     * collection of Publications that are part of this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Publication> getPublication(){
         return this.publication;
    }

    /**
     * Gets a list of contained Relationship.
     * collection of Relationships defined in this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Relationship> getRelationship(){
         return this.relationship;
    }

    /**
     * Gets a list of contained RequirementsSpecification.
     * collection of RequirementsSpecifications defined in this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<RequirementsSpecification> getRequirementsSpecification(){
         return this.requirementsSpecification;
    }

    /**
     * Gets a list of contained RuleVerificationList.
     * collection of RuleVerificationLists defined for this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<RuleVerificationList> getRuleVerificationList(){
         return this.ruleVerificationList;
    }

    /**
     * Gets a list of contained SharedStyle.
     * The shared styles to be applied on diagram elements
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<SharedStyle> getSharedDiagramStyle(){
         return this.sharedDiagramStyle;
    }

    /**
     * Gets the sourceIterationIid.
     * definition of the unique instance identifier of Iteration that was used as the source to create this Iteration
     * Note: This property records the provenance of the Iteration. Except for the first Iteration of an EngineeeringModel any subsequent Iteration is created as a copy of a source Iteration. For the first Iteration the <i>sourceIterationIid</i> is set to <i>null</i>, which means there was no source.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public UUID getSourceIterationIid(){
         return this.sourceIterationIid;
    }

    /**
     * Gets a list of contained Stakeholder.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Stakeholder> getStakeholder(){
         return this.stakeholder;
    }

    /**
     * Gets a list of contained StakeholderValue.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<StakeholderValue> getStakeholderValue(){
         return this.stakeholderValue;
    }

    /**
     * Gets a list of contained StakeHolderValueMap.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<StakeHolderValueMap> getStakeholderValueMap(){
         return this.stakeholderValueMap;
    }

    /**
     * Gets the topElement.
     * reference to the ElementDefinition that represents the top node of the decomposition of the system-of-interest for this Iteration of an EngineeringModel
     * Note: There is one single topElement for all Options.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ElementDefinition getTopElement(){
         return this.topElement;
    }

    /**
     * Gets a list of contained ValueGroup.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ValueGroup> getValueGroup(){
         return this.valueGroup;
    }

    /**
     * Sets a list of contained ActualFiniteStateList.
     * collection of ActualFiniteStateLists defined for this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setActualFiniteStateList(ContainerList<ActualFiniteStateList> actualFiniteStateList){
        this.actualFiniteStateList = actualFiniteStateList;
    }

    /**
     * Sets the defaultOption.
     * reference to the Option that is considered the default Option for this Iteration
     * Note: The referenced default Option must be one of the Options defined in the <i>option</i> property of the Iteration.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDefaultOption(Option defaultOption){
        this.defaultOption = defaultOption;
    }

    /**
     * Sets a list of contained DiagramCanvas.
     * The diagrams created in the scope of the current iteration
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setDiagramCanvas(ContainerList<DiagramCanvas> diagramCanvas){
        this.diagramCanvas = diagramCanvas;
    }

    /**
     * Sets a list of contained DomainFileStore.
     * collection of DomainFileStores in this Iteration
     * Note: Typically there will be one DomainFileStore for each DomainOfExpertise in a particular EngineeringModel, plus one additional CommonFileStore shared by all domains.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setDomainFileStore(ContainerList<DomainFileStore> domainFileStore){
        this.domainFileStore = domainFileStore;
    }

    /**
     * Sets a list of contained ElementDefinition.
     * representation of all ElementDefinitions that represent the system-of-interest for this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setElement(ContainerList<ElementDefinition> element){
        this.element = element;
    }

    /**
     * Sets a list of contained ExternalIdentifierMap.
     * collection of ExternalIdentifierMaps defined in this EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setExternalIdentifierMap(ContainerList<ExternalIdentifierMap> externalIdentifierMap){
        this.externalIdentifierMap = externalIdentifierMap;
    }

    /**
     * Sets a list of contained Goal.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setGoal(ContainerList<Goal> goal){
        this.goal = goal;
    }

    /**
     * Sets the iterationSetup.
     * reference to the IterationSetup that contains descriptive information about this Iteration at SiteDirectory level
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setIterationSetup(IterationSetup iterationSetup){
        this.iterationSetup = iterationSetup;
    }

    /**
     * Sets a list of ordered contained Option.
     * collection of Options defined in this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     protected void setOption(OrderedItemList<Option> option){
        this.option = option;
    }

    /**
     * Sets a list of contained PossibleFiniteStateList.
     * collection of PossibleFiniteStateLists defined for this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setPossibleFiniteStateList(ContainerList<PossibleFiniteStateList> possibleFiniteStateList){
        this.possibleFiniteStateList = possibleFiniteStateList;
    }

    /**
     * Sets a list of contained Publication.
     * collection of Publications that are part of this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setPublication(ContainerList<Publication> publication){
        this.publication = publication;
    }

    /**
     * Sets a list of contained Relationship.
     * collection of Relationships defined in this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setRelationship(ContainerList<Relationship> relationship){
        this.relationship = relationship;
    }

    /**
     * Sets a list of contained RequirementsSpecification.
     * collection of RequirementsSpecifications defined in this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setRequirementsSpecification(ContainerList<RequirementsSpecification> requirementsSpecification){
        this.requirementsSpecification = requirementsSpecification;
    }

    /**
     * Sets a list of contained RuleVerificationList.
     * collection of RuleVerificationLists defined for this Iteration of an EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setRuleVerificationList(ContainerList<RuleVerificationList> ruleVerificationList){
        this.ruleVerificationList = ruleVerificationList;
    }

    /**
     * Sets a list of contained SharedStyle.
     * The shared styles to be applied on diagram elements
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setSharedDiagramStyle(ContainerList<SharedStyle> sharedDiagramStyle){
        this.sharedDiagramStyle = sharedDiagramStyle;
    }

    /**
     * Sets the sourceIterationIid.
     * definition of the unique instance identifier of Iteration that was used as the source to create this Iteration
     * Note: This property records the provenance of the Iteration. Except for the first Iteration of an EngineeeringModel any subsequent Iteration is created as a copy of a source Iteration. For the first Iteration the <i>sourceIterationIid</i> is set to <i>null</i>, which means there was no source.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setSourceIterationIid(UUID sourceIterationIid){
        this.sourceIterationIid = sourceIterationIid;
    }

    /**
     * Sets a list of contained Stakeholder.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setStakeholder(ContainerList<Stakeholder> stakeholder){
        this.stakeholder = stakeholder;
    }

    /**
     * Sets a list of contained StakeholderValue.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setStakeholderValue(ContainerList<StakeholderValue> stakeholderValue){
        this.stakeholderValue = stakeholderValue;
    }

    /**
     * Sets a list of contained StakeHolderValueMap.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setStakeholderValueMap(ContainerList<StakeHolderValueMap> stakeholderValueMap){
        this.stakeholderValueMap = stakeholderValueMap;
    }

    /**
     * Sets the topElement.
     * reference to the ElementDefinition that represents the top node of the decomposition of the system-of-interest for this Iteration of an EngineeringModel
     * Note: There is one single topElement for all Options.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setTopElement(ElementDefinition topElement){
        this.topElement = topElement;
    }

    /**
     * Sets a list of contained ValueGroup.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setValueGroup(ContainerList<ValueGroup> valueGroup){
        this.valueGroup = valueGroup;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>Iteration<code/>.
     *
     * @see Iterable
     * @see Iteration
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.actualFiniteStateList);
        containers.Add(this.diagramCanvas);
        containers.Add(this.domainFileStore);
        containers.Add(this.element);
        containers.Add(this.externalIdentifierMap);
        containers.Add(this.goal);
        containers.Add(this.option);
        containers.Add(this.possibleFiniteStateList);
        containers.Add(this.publication);
        containers.Add(this.relationship);
        containers.Add(this.requirementsSpecification);
        containers.Add(this.ruleVerificationList);
        containers.Add(this.sharedDiagramStyle);
        containers.Add(this.stakeholder);
        containers.Add(this.stakeholderValue);
        containers.Add(this.stakeholderValueMap);
        containers.Add(this.valueGroup);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>Iteration<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Iteration<code/>.
     *
     * @see Iteration
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        Iteration clone = (Iteration)this.clone();
        clone.setActualFiniteStateList(cloneContainedThings ? new ContainerList<ActualFiniteStateList>(clone) : new ContainerList<ActualFiniteStateList>(this.getActualFiniteStateList(), clone));
        clone.setDiagramCanvas(cloneContainedThings ? new ContainerList<DiagramCanvas>(clone) : new ContainerList<DiagramCanvas>(this.getDiagramCanvas(), clone));
        clone.setDomainFileStore(cloneContainedThings ? new ContainerList<DomainFileStore>(clone) : new ContainerList<DomainFileStore>(this.getDomainFileStore(), clone));
        clone.setElement(cloneContainedThings ? new ContainerList<ElementDefinition>(clone) : new ContainerList<ElementDefinition>(this.getElement(), clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setExternalIdentifierMap(cloneContainedThings ? new ContainerList<ExternalIdentifierMap>(clone) : new ContainerList<ExternalIdentifierMap>(this.getExternalIdentifierMap(), clone));
        clone.setGoal(cloneContainedThings ? new ContainerList<Goal>(clone) : new ContainerList<Goal>(this.getGoal(), clone));
        clone.setOption(cloneContainedThings ? new OrderedItemList<Option>(clone, true) : new OrderedItemList<Option>(this.getOption(), clone));
        clone.setPossibleFiniteStateList(cloneContainedThings ? new ContainerList<PossibleFiniteStateList>(clone) : new ContainerList<PossibleFiniteStateList>(this.getPossibleFiniteStateList(), clone));
        clone.setPublication(cloneContainedThings ? new ContainerList<Publication>(clone) : new ContainerList<Publication>(this.getPublication(), clone));
        clone.setRelationship(cloneContainedThings ? new ContainerList<Relationship>(clone) : new ContainerList<Relationship>(this.getRelationship(), clone));
        clone.setRequirementsSpecification(cloneContainedThings ? new ContainerList<RequirementsSpecification>(clone) : new ContainerList<RequirementsSpecification>(this.getRequirementsSpecification(), clone));
        clone.setRuleVerificationList(cloneContainedThings ? new ContainerList<RuleVerificationList>(clone) : new ContainerList<RuleVerificationList>(this.getRuleVerificationList(), clone));
        clone.setSharedDiagramStyle(cloneContainedThings ? new ContainerList<SharedStyle>(clone) : new ContainerList<SharedStyle>(this.getSharedDiagramStyle(), clone));
        clone.setStakeholder(cloneContainedThings ? new ContainerList<Stakeholder>(clone) : new ContainerList<Stakeholder>(this.getStakeholder(), clone));
        clone.setStakeholderValue(cloneContainedThings ? new ContainerList<StakeholderValue>(clone) : new ContainerList<StakeholderValue>(this.getStakeholderValue(), clone));
        clone.setStakeholderValueMap(cloneContainedThings ? new ContainerList<StakeHolderValueMap>(clone) : new ContainerList<StakeHolderValueMap>(this.getStakeholderValueMap(), clone));
        clone.setValueGroup(cloneContainedThings ? new ContainerList<ValueGroup>(clone) : new ContainerList<ValueGroup>(this.getValueGroup(), clone));

        if (cloneContainedThings) {
            clone.getActualFiniteStateList().addAll(this.getActualFiniteStateList().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDiagramCanvas().addAll(this.getDiagramCanvas().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDomainFileStore().addAll(this.getDomainFileStore().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getElement().addAll(this.getElement().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getExternalIdentifierMap().addAll(this.getExternalIdentifierMap().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getGoal().addAll(this.getGoal().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getOption().addAll(this.getOption().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getPossibleFiniteStateList().addAll(this.getPossibleFiniteStateList().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getPublication().addAll(this.getPublication().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getRelationship().addAll(this.getRelationship().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getRequirementsSpecification().addAll(this.getRequirementsSpecification().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getRuleVerificationList().addAll(this.getRuleVerificationList().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getSharedDiagramStyle().addAll(this.getSharedDiagramStyle().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getStakeholder().addAll(this.getStakeholder().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getStakeholderValue().addAll(this.getStakeholderValue().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getStakeholderValueMap().addAll(this.getStakeholderValueMap().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getValueGroup().addAll(this.getValueGroup().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>Iteration<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Iteration<code/>.
     * 
     * @see Iteration
     */
    @Override
    public Iteration clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Iteration)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>Iteration<code/>.
     *
     * @return A list of potential errors.
     *
     * @see Iteration
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getIterationSetup() == null || this.getIterationSetup().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property iterationSetup is null.");
            this.setIterationSetup(SentinelThingProvider.getSentinel<IterationSetup>());
            this.sentinelResetMap["iterationSetup"] = () -> this.setIterationSetup(null);
        }

        int optionCount = this.getOption().size();
        if (optionCount < 1) {
            errorList.add("The number of elements in the property option is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>Iteration<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see Iteration
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Iteration dto = (cdp4common.dto.Iteration)dtoThing;

        this.actualFiniteStateList.resolveList(dto.getActualFiniteStateList(), dto.getIid(), this.getCache());
        this.setDefaultOption((dto.getDefaultOption() != null) ? this.getCache().get<Option>(dto.getDefaultOption.getValue(), dto.getIid()) : null);
        this.diagramCanvas.resolveList(dto.getDiagramCanvas(), dto.getIid(), this.getCache());
        this.domainFileStore.resolveList(dto.getDomainFileStore(), dto.getIid(), this.getCache());
        this.element.resolveList(dto.getElement(), dto.getIid(), this.getCache());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIid(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIid(), this.getCache());
        this.externalIdentifierMap.resolveList(dto.getExternalIdentifierMap(), dto.getIid(), this.getCache());
        this.goal.resolveList(dto.getGoal(), dto.getIid(), this.getCache());
        this.setIterationSetup(this.cache.get<IterationSetup>(dto.getIterationSetup(), dto.getIid()) ?? SentinelThingProvider.getSentinel<IterationSetup>());
        this.setModifiedOn(dto.getModifiedOn());
        this.option.resolveList(dto.getOption(), dto.getIid(), this.getCache());
        this.possibleFiniteStateList.resolveList(dto.getPossibleFiniteStateList(), dto.getIid(), this.getCache());
        this.publication.resolveList(dto.getPublication(), dto.getIid(), this.getCache());
        this.relationship.resolveList(dto.getRelationship(), dto.getIid(), this.getCache());
        this.requirementsSpecification.resolveList(dto.getRequirementsSpecification(), dto.getIid(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.ruleVerificationList.resolveList(dto.getRuleVerificationList(), dto.getIid(), this.getCache());
        this.sharedDiagramStyle.resolveList(dto.getSharedDiagramStyle(), dto.getIid(), this.getCache());
        this.setSourceIterationIid(dto.getSourceIterationIid());
        this.stakeholder.resolveList(dto.getStakeholder(), dto.getIid(), this.getCache());
        this.stakeholderValue.resolveList(dto.getStakeholderValue(), dto.getIid(), this.getCache());
        this.stakeholderValueMap.resolveList(dto.getStakeholderValueMap(), dto.getIid(), this.getCache());
        this.setTopElement((dto.getTopElement() != null) ? this.getCache().get<ElementDefinition>(dto.getTopElement.getValue(), dto.getIid()) : null);
        this.valueGroup.resolveList(dto.getValueGroup(), dto.getIid(), this.getCache());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>Iteration<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see Iteration
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Iteration dto = new cdp4common.dto.Iteration(this.getIid(), this.getRevisionNumber());

        dto.getActualFiniteStateList().add(this.getActualFiniteStateList().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setDefaultOption(this.getDefaultOption() != null ? (UUID)this.getDefaultOption().getIid() : null);
        dto.getDiagramCanvas().add(this.getDiagramCanvas().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDomainFileStore().add(this.getDomainFileStore().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getElement().add(this.getElement().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExternalIdentifierMap().add(this.getExternalIdentifierMap().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getGoal().add(this.getGoal().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setIterationSetup(this.getIterationSetup() != null ? this.getIterationSetup().getIid() : new UUID(0L, 0L));
        dto.setModifiedOn(this.getModifiedOn());
        dto.getOption().add(this.getOption().toDtoOrderedItemList());
        dto.getPossibleFiniteStateList().add(this.getPossibleFiniteStateList().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getPublication().add(this.getPublication().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getRelationship().add(this.getRelationship().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getRequirementsSpecification().add(this.getRequirementsSpecification().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.getRuleVerificationList().add(this.getRuleVerificationList().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getSharedDiagramStyle().add(this.getSharedDiagramStyle().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setSourceIterationIid(this.getSourceIterationIid());
        dto.getStakeholder().add(this.getStakeholder().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getStakeholderValue().add(this.getStakeholderValue().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getStakeholderValueMap().add(this.getStakeholderValueMap().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setTopElement(this.getTopElement() != null ? (UUID)this.getTopElement().getIid() : null);
        dto.getValueGroup().add(this.getValueGroup().stream().map(x -> x.getIid()).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
