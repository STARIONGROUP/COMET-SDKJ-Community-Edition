/* --------------------------------------------------------------------------------------------------------------------
 * AbstractElementUsage.java
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
 * named usage of an ElementDefinition in the context of a next higher level ElementDefinition that contains this ElementUsage
 * Note 1: An ElementUsage has one and only one ElementDefinition as its <i>containingElement</i>.
 * Note 2: When an ElementDefinition is made a member of a Category through its <i>category</i> property, then also any ElementUsage typed by such an ElementDefinition is implied to be a member of the same Category.
 * Note 3: A ParameterType "NumberOf" may be defined in an associated ReferenceDataLibrary. Subsequently a "NumberOf" Parameter or ParameterOverride may be added to an ElementUsage as a short-cut to define a number of containedElements that are not named individually. Setting "NumberOf" to a value greater than one is typically only done in early conceptual design. In a later detailed design phase each usage would normally be instantiated individually, so that where needed different usage level Parameters can have different values.
 * Note 4: Both the <i>owner</i> DomainOfExpertise of the <i>containingElement</i> and of the <i>elementDefinition</i> are owner(s) of this ElementUsage, i.e. the union of self.containingElement.owner and self.elementDefinition.owner.
 */
@Container(clazz = ElementDefinition.class, propertyName = "containedElement")
public abstract class AbstractElementUsage extends AbstractElementBase implements OptionDependentThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_N_E;

    /**
     * Initializes a new instance of the <code>ElementUsage<code/> class.
     *
     * @see ElementUsage
     */
    public AbstractElementUsage() {
        this.excludeOption = new List<Option>();
        this.parameterOverride = new ContainerList<ParameterOverride>(this);
    }

    /**
     * Initializes a new instance of the <code>ElementUsage<code/> class.
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
     * @see ElementUsage
     */
    public AbstractElementUsage(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.excludeOption = new List<Option>();
        this.parameterOverride = new ContainerList<ParameterOverride>(this);
    }

    /**
     * Property elementDefinition.
     * reference to the ElementDefinition that defines this ElementUsage
     * Note: The <i>elementDefinition</i> of an ElementUsage could also be regarded as the <i>type</i> of the ElementUsage.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ElementDefinition elementDefinition;

    /**
     * List of Option.
     * reference to zero or more Options from which this OptionDependentThing is excluded
     * Note: By default all OptionDependentThings are included in all Options in an EngineeringModel. Only the exclusions are recorded in the data model because this is the most efficient way of storing and handling the option dependency. In client applications it may be more intuitive to show the included Options, but that is a simple transformation.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<Option> excludeOption;

    /**
     * Property interfaceEnd.
     * indication whether this ElementUsage is a (potential) interface end
     * Note 1: An interface end is one side of an interface, where the complete
     * interface is defined as the connection plus two or more interface ends.
     * Note 2: Interface definition is currently not explicitly modelled in
     * this data model. However it is possible to define a Category e.g. named
     * "InterfaceDefinitions", and then instantiate ElementDefinitions and
     * ElementUsages that belong to this category for the interfaces to be
     * defined, using the referencedElement property of ElementUsage to connect
     * architectural elements that represent interface ends.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private InterfaceEndKind interfaceEnd;

    /**
     * List of contained ParameterOverride.
     * representation of zero or more ParameterOverrides to hold overridden values for a Parameter at this ElementUsage level
     * Note: The <i>parameter</i> of this ParameterOverride must be a Parameter of the <i>elementDefinition</i> of the containing ElementUsage.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ParameterOverride> parameterOverride;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>ElementUsage<code/>.
     *
     * @see Iterable
     * @see ElementUsage
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets the elementDefinition.
     * reference to the ElementDefinition that defines this ElementUsage
     * Note: The <i>elementDefinition</i> of an ElementUsage could also be regarded as the <i>type</i> of the ElementUsage.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ElementDefinition getElementDefinition(){
         return this.elementDefinition;
    }

    /**
     * Gets a list of Option.
     * reference to zero or more Options from which this OptionDependentThing is excluded
     * Note: By default all OptionDependentThings are included in all Options in an EngineeringModel. Only the exclusions are recorded in the data model because this is the most efficient way of storing and handling the option dependency. In client applications it may be more intuitive to show the included Options, but that is a simple transformation.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public List<Option> getExcludeOption(){
         return this.excludeOption;
    }

    /**
     * Gets the interfaceEnd.
     * indication whether this ElementUsage is a (potential) interface end
     * Note 1: An interface end is one side of an interface, where the complete
     * interface is defined as the connection plus two or more interface ends.
     * Note 2: Interface definition is currently not explicitly modelled in
     * this data model. However it is possible to define a Category e.g. named
     * "InterfaceDefinitions", and then instantiate ElementDefinitions and
     * ElementUsages that belong to this category for the interfaces to be
     * defined, using the referencedElement property of ElementUsage to connect
     * architectural elements that represent interface ends.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public InterfaceEndKind getInterfaceEnd(){
         return this.interfaceEnd;
    }

    /**
     * Gets a list of contained ParameterOverride.
     * representation of zero or more ParameterOverrides to hold overridden values for a Parameter at this ElementUsage level
     * Note: The <i>parameter</i> of this ParameterOverride must be a Parameter of the <i>elementDefinition</i> of the containing ElementUsage.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ParameterOverride> getParameterOverride(){
         return this.parameterOverride;
    }

    /**
     * Sets the elementDefinition.
     * reference to the ElementDefinition that defines this ElementUsage
     * Note: The <i>elementDefinition</i> of an ElementUsage could also be regarded as the <i>type</i> of the ElementUsage.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setElementDefinition(ElementDefinition elementDefinition){
        this.elementDefinition = elementDefinition;
    }

    /**
     * Sets a list of Option.
     * reference to zero or more Options from which this OptionDependentThing is excluded
     * Note: By default all OptionDependentThings are included in all Options in an EngineeringModel. Only the exclusions are recorded in the data model because this is the most efficient way of storing and handling the option dependency. In client applications it may be more intuitive to show the included Options, but that is a simple transformation.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setExcludeOption(List<Option> excludeOption){
        this.excludeOption = excludeOption;
    }

    /**
     * Sets the interfaceEnd.
     * indication whether this ElementUsage is a (potential) interface end
     * Note 1: An interface end is one side of an interface, where the complete
     * interface is defined as the connection plus two or more interface ends.
     * Note 2: Interface definition is currently not explicitly modelled in
     * this data model. However it is possible to define a Category e.g. named
     * "InterfaceDefinitions", and then instantiate ElementDefinitions and
     * ElementUsages that belong to this category for the interfaces to be
     * defined, using the referencedElement property of ElementUsage to connect
     * architectural elements that represent interface ends.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setInterfaceEnd(InterfaceEndKind interfaceEnd){
        this.interfaceEnd = interfaceEnd;
    }

    /**
     * Sets a list of contained ParameterOverride.
     * representation of zero or more ParameterOverrides to hold overridden values for a Parameter at this ElementUsage level
     * Note: The <i>parameter</i> of this ParameterOverride must be a Parameter of the <i>elementDefinition</i> of the containing ElementUsage.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setParameterOverride(ContainerList<ParameterOverride> parameterOverride){
        this.parameterOverride = parameterOverride;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>ElementUsage<code/>.
     *
     * @see Iterable
     * @see ElementUsage
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.parameterOverride);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>ElementUsage<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ElementUsage<code/>.
     *
     * @see ElementUsage
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ElementUsage clone = (ElementUsage)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setCategory(new List<Category>(this.category));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setExcludeOption(new List<Option>(this.excludeOption));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));
        clone.setParameterOverride(cloneContainedThings ? new ContainerList<ParameterOverride>(clone) : new ContainerList<ParameterOverride>(this.parameterOverride, clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getParameterOverride().addAll(this.parameterOverride.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>ElementUsage<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ElementUsage<code/>.
     * 
     * @see ElementUsage
     */
    @Override
    public ElementUsage clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ElementUsage)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ElementUsage<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ElementUsage
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.elementDefinition == null || this.elementDefinition.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property elementDefinition is null.");
            this.elementDefinition = SentinelThingProvider.getSentinel<ElementDefinition>();
            this.sentinelResetMap["elementDefinition"] = () -> this.elementDefinition = null;
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ElementUsage<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ElementUsage
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ElementUsage dto = (cdp4common.dto.ElementUsage)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.elementDefinition = this.cache.get<ElementDefinition>(dto.getElementDefinition(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<ElementDefinition>();
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.excludeOption.resolveList(dto.getExcludeOption(), dto.getIterationContainerId(), this.cache);
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.interfaceEnd = dto.getInterfaceEnd();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.owner = this.cache.get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>();
        this.parameterOverride.resolveList(dto.getParameterOverride(), dto.getIterationContainerId(), this.cache);
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ElementUsage<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ElementUsage
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ElementUsage dto = new cdp4common.dto.ElementUsage(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getCategory().add(this.category.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setElementDefinition(this.elementDefinition != null ? this.elementDefinition.getIid() : new UUID(0L, 0L));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludeOption().add(this.excludeOption.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setInterfaceEnd(this.interfaceEnd);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.setOwner(this.owner != null ? this.owner.getIid() : new UUID(0L, 0L));
        dto.getParameterOverride().add(this.parameterOverride.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
