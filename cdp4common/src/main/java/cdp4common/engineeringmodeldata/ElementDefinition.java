/* --------------------------------------------------------------------------------------------------------------------
 * AbstractElementDefinition.java
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
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

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
@EqualsAndHashCode
public  class ElementDefinition extends ElementBase implements Cloneable {
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
        this.parameter = new ContainerList<Parameter>(this);
        this.parameterGroup = new ContainerList<ParameterGroup>(this);
        this.referencedElement = new ArrayList<NestedElement>();
    }

    /**
     * Initializes a new instance of the {@link ElementDefinition} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ElementDefinition(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.containedElement = new ContainerList<ElementUsage>(this);
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
    private ContainerList<ElementUsage> containedElement;

    /**
     * List of contained Parameter.
     * collection of Parameters that define characteristics of this ElementDefinition
     * Note: Parameters and ParameterValueSets together form the parametric definition of this ElementDefinition as well as of ElementUsages that are typed by this ElementDefinition.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Parameter> parameter;

    /**
     * List of contained ParameterGroup.
     * collection of ParameterGroups that define a grouping hierarchy to hold the Parameters of this ElementDefinition
     * Note: This grouping does not carry specific meaning, but is a convenience mechanism to assist in the management and presentation of large sets of parameters.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ParameterGroup> parameterGroup;

    /**
     * List of NestedElement.
     * zero or more references to ElementUsages at lower level(s) in the hierarchical decomposition of the system-of-interest
     * Note 1: Referencing elements through NestedElements is a flexible and unconstrained mechanism to support network-type architectures and ad-hoc structures. The semantics of these references need to be defined through appropriate Categories that are associated with the participating ElementDefinitions, ElementUsages and NestedElements. Since the Categories are defined in ReferenceDataLibraries the interpretation of such references is therefore reference data dependent.
     * Note 2: In order to adhere to the principle of strict modularity, the only permissible referencedElement(s) are ElementUsage(s) contained in the subtree of this ElementDefinition.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<NestedElement> referencedElement;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link ElementDefinition}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of contained ElementUsage.
     * list of zero or more usages of elements at the next lower level of hierarchical decomposition, where each element is defined (typed) by an(other) ElementDefinition
     * Note 1: This property captures the whole-part relationship between an ElementDefinition (the whole, the <i>containingElement</i>) and an ElementUsage (the part, the <i>containedElement</i>). This implies that the ElementUsage is existence dependent on the <i>containingElement</i> ElementDefinition. If the ElementDefinition is removed from the system-of-interest also its dependent ElementUsages are removed, as well as any subtree of ElementUsages subtended below the first lower level.
     * Note 2: The permitted <i>containedElement</i> and <i>referencedElement</i> collections can be defined through a combination of appropriate Categories, DecompositionRules and ReferencerRules.
     * Note 3: The <i>containedElement</i> property is the equivalent of a <i>part property</i> of a <i>Block</i> in OMG SysML.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ElementUsage> getContainedElement(){
         return this.containedElement;
    }

    /**
     * Gets a list of contained Parameter.
     * collection of Parameters that define characteristics of this ElementDefinition
     * Note: Parameters and ParameterValueSets together form the parametric definition of this ElementDefinition as well as of ElementUsages that are typed by this ElementDefinition.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Parameter> getParameter(){
         return this.parameter;
    }

    /**
     * Gets a list of contained ParameterGroup.
     * collection of ParameterGroups that define a grouping hierarchy to hold the Parameters of this ElementDefinition
     * Note: This grouping does not carry specific meaning, but is a convenience mechanism to assist in the management and presentation of large sets of parameters.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ParameterGroup> getParameterGroup(){
         return this.parameterGroup;
    }

    /**
     * Gets a list of NestedElement.
     * zero or more references to ElementUsages at lower level(s) in the hierarchical decomposition of the system-of-interest
     * Note 1: Referencing elements through NestedElements is a flexible and unconstrained mechanism to support network-type architectures and ad-hoc structures. The semantics of these references need to be defined through appropriate Categories that are associated with the participating ElementDefinitions, ElementUsages and NestedElements. Since the Categories are defined in ReferenceDataLibraries the interpretation of such references is therefore reference data dependent.
     * Note 2: In order to adhere to the principle of strict modularity, the only permissible referencedElement(s) are ElementUsage(s) contained in the subtree of this ElementDefinition.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<NestedElement> getReferencedElement(){
         return this.referencedElement;
    }

    /**
     * Sets a list of contained ElementUsage.
     * list of zero or more usages of elements at the next lower level of hierarchical decomposition, where each element is defined (typed) by an(other) ElementDefinition
     * Note 1: This property captures the whole-part relationship between an ElementDefinition (the whole, the <i>containingElement</i>) and an ElementUsage (the part, the <i>containedElement</i>). This implies that the ElementUsage is existence dependent on the <i>containingElement</i> ElementDefinition. If the ElementDefinition is removed from the system-of-interest also its dependent ElementUsages are removed, as well as any subtree of ElementUsages subtended below the first lower level.
     * Note 2: The permitted <i>containedElement</i> and <i>referencedElement</i> collections can be defined through a combination of appropriate Categories, DecompositionRules and ReferencerRules.
     * Note 3: The <i>containedElement</i> property is the equivalent of a <i>part property</i> of a <i>Block</i> in OMG SysML.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setContainedElement(ContainerList<ElementUsage> containedElement){
        this.containedElement = containedElement;
    }

    /**
     * Sets a list of contained Parameter.
     * collection of Parameters that define characteristics of this ElementDefinition
     * Note: Parameters and ParameterValueSets together form the parametric definition of this ElementDefinition as well as of ElementUsages that are typed by this ElementDefinition.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setParameter(ContainerList<Parameter> parameter){
        this.parameter = parameter;
    }

    /**
     * Sets a list of contained ParameterGroup.
     * collection of ParameterGroups that define a grouping hierarchy to hold the Parameters of this ElementDefinition
     * Note: This grouping does not carry specific meaning, but is a convenience mechanism to assist in the management and presentation of large sets of parameters.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setParameterGroup(ContainerList<ParameterGroup> parameterGroup){
        this.parameterGroup = parameterGroup;
    }

    /**
     * Sets a list of NestedElement.
     * zero or more references to ElementUsages at lower level(s) in the hierarchical decomposition of the system-of-interest
     * Note 1: Referencing elements through NestedElements is a flexible and unconstrained mechanism to support network-type architectures and ad-hoc structures. The semantics of these references need to be defined through appropriate Categories that are associated with the participating ElementDefinitions, ElementUsages and NestedElements. Since the Categories are defined in ReferenceDataLibraries the interpretation of such references is therefore reference data dependent.
     * Note 2: In order to adhere to the principle of strict modularity, the only permissible referencedElement(s) are ElementUsage(s) contained in the subtree of this ElementDefinition.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setReferencedElement(ArrayList<NestedElement> referencedElement){
        this.referencedElement = referencedElement;
    }

    /**
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link ElementDefinition}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
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

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setContainedElement(cloneContainedThings ? new ContainerList<ElementUsage>(clone) : new ContainerList<ElementUsage>(this.getContainedElement(), clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));
        clone.setParameter(cloneContainedThings ? new ContainerList<Parameter>(clone) : new ContainerList<Parameter>(this.getParameter(), clone));
        clone.setParameterGroup(cloneContainedThings ? new ContainerList<ParameterGroup>(clone) : new ContainerList<ParameterGroup>(this.getParameterGroup(), clone));
        clone.setReferencedElement(new ArrayList<NestedElement>(this.getReferencedElement()));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getContainedElement().addAll(this.getContainedElement().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getParameter().addAll(this.getParameter().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getParameterGroup().addAll(this.getParameterGroup().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
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
     * Validates the cardinalities of the properties of this <clone>ElementDefinition}.
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

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.getCategory().resolveList(dto.getCategory(), dto.getIterationContainerId(), this.getCache());
        this.getContainedElement().resolveList(dto.getContainedElement(), dto.getIterationContainerId(), this.getCache());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setOwner(this.getCache().get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>());
        this.getParameter().resolveList(dto.getParameter(), dto.getIterationContainerId(), this.getCache());
        this.getParameterGroup().resolveList(dto.getParameterGroup(), dto.getIterationContainerId(), this.getCache());
        this.getReferencedElement().resolveList(dto.getReferencedElement(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());

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

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getCategory().add(this.getCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getContainedElement().add(this.getContainedElement().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.getParameter().add(this.getParameter().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getParameterGroup().add(this.getParameterGroup().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getReferencedElement().add(this.getReferencedElement().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
