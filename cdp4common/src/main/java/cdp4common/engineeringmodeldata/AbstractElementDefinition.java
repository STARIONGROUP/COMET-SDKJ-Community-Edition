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

/**
 * definition of an element in a design solution for a system-of-interest
 * Note 1: An element is defined once (as an ElementDefinition) and then can be used (as an ElementUsage) any number of times in a design solution for the system-of-interest.
 * Note 2: The ElementDefinition and ElementUsage structure together form the representation of the hierarchical design composition / decomposition of the system-of-interest. Through the combination of the <i>containedElement</i> property and the <i>referencedElement</i> property of ElementUsage a hybrid product tree can be represented in which both logical and concrete (aka physical) architecture are combined.
 * Note 3: Because of the containment relationship between ElementDefinition and ElementUsage, there is special behaviour with respect to Category membership. If an ElementDefinition is defined to be a member of a Category (through its category property), then also any ElementUsage that is typed by this ElementDefinition is a member of that Category.
 * Example: The design of gyroscope "GS-123" is defined in an ElementDefinition and then 4 gyroscopes of this type are used as part of the attitude and orbit control equipment through 4 ElementUsages with names "x-gyro", "y-gyro", "z-gyro" and "xyz-gyro". All 4 usages are said to be of <i>type</i> "GS-123".
 * Note 3: ElementDefinition is the equivalent of the concept of <i>Block</i> in OMG SysML. ElementUsage is the equivalent of the concept of <i>Part</i> in OMG SysML.
 */
@Container(clazz = Iteration.class, propertyName = "element")
public abstract class AbstractElementDefinition extends AbstractElementBase  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_N_E;

    /**
     * Initializes a new instance of the <code>ElementDefinition<code/> class.
     *
     * @see ElementDefinition
     */
    public AbstractElementDefinition() {
        this.containedElement = new ContainerList<ElementUsage>(this);
        this.parameter = new ContainerList<Parameter>(this);
        this.parameterGroup = new ContainerList<ParameterGroup>(this);
        this.referencedElement = new List<NestedElement>();
    }

    /**
     * Initializes a new instance of the <code>ElementDefinition<code/> class.
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
     * @see ElementDefinition
     */
    public AbstractElementDefinition(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.containedElement = new ContainerList<ElementUsage>(this);
        this.parameter = new ContainerList<Parameter>(this);
        this.parameterGroup = new ContainerList<ParameterGroup>(this);
        this.referencedElement = new List<NestedElement>();
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
    private List<NestedElement> referencedElement;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>ElementDefinition<code/>.
     *
     * @see Iterable
     * @see ElementDefinition
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
    public List<NestedElement> getReferencedElement(){
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
     public void setReferencedElement(List<NestedElement> referencedElement){
        this.referencedElement = referencedElement;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>ElementDefinition<code/>.
     *
     * @see Iterable
     * @see ElementDefinition
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.containedElement);
        containers.Add(this.parameter);
        containers.Add(this.parameterGroup);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>ElementDefinition<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ElementDefinition<code/>.
     *
     * @see ElementDefinition
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ElementDefinition clone = (ElementDefinition)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setCategory(new List<Category>(this.category));
        clone.setContainedElement(cloneContainedThings ? new ContainerList<ElementUsage>(clone) : new ContainerList<ElementUsage>(this.containedElement, clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));
        clone.setParameter(cloneContainedThings ? new ContainerList<Parameter>(clone) : new ContainerList<Parameter>(this.parameter, clone));
        clone.setParameterGroup(cloneContainedThings ? new ContainerList<ParameterGroup>(clone) : new ContainerList<ParameterGroup>(this.parameterGroup, clone));
        clone.setReferencedElement(new List<NestedElement>(this.referencedElement));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getContainedElement().addAll(this.containedElement.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getParameter().addAll(this.parameter.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getParameterGroup().addAll(this.parameterGroup.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>ElementDefinition<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ElementDefinition<code/>.
     * 
     * @see ElementDefinition
     */
    @Override
    public ElementDefinition clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ElementDefinition)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ElementDefinition<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ElementDefinition
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ElementDefinition<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ElementDefinition
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ElementDefinition dto = (cdp4common.dto.ElementDefinition)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.cache);
        this.containedElement.resolveList(dto.getContainedElement(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.owner = this.cache.get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>();
        this.parameter.resolveList(dto.getParameter(), dto.getIterationContainerId(), this.cache);
        this.parameterGroup.resolveList(dto.getParameterGroup(), dto.getIterationContainerId(), this.cache);
        this.referencedElement.resolveList(dto.getReferencedElement(), dto.getIterationContainerId(), this.cache);
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ElementDefinition<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ElementDefinition
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ElementDefinition dto = new cdp4common.dto.ElementDefinition(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getCategory().add(this.category.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getContainedElement().add(this.containedElement.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.setOwner(this.owner != null ? this.owner.getIid() : new UUID(0L, 0L));
        dto.getParameter().add(this.parameter.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getParameterGroup().add(this.parameterGroup.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getReferencedElement().add(this.referencedElement.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
