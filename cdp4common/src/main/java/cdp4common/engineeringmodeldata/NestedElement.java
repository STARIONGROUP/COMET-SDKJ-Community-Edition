/* --------------------------------------------------------------------------------------------------------------------
 * AbstractNestedElement.java
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
 * representation of an explicit element of a system-of-interest in a fully expanded architectural decomposition tree for one Option
 * Note 1: The hierarchy of NestedElements can be automatically generated from the implicit composite structure defined by ElementDefinitions and contained ElementUsages, and configured for an Option.
 * Note 2: The unique path to a single, possibly deeply nested, NestedElement is defined by the <i>topElement</i> of the relevant Iteration (which is the same for all Options) and an ordered list of subtended ElementUsage references.
 * Note 3: The NestedElement is an explicit representation of the so-called "deeply nested connector" concept in OMG SysML (v1.3).
 * Example: Assume a spacecraft with a service module "sm" (an ElementUsage of ElementDefinition "SM") and two solar array wings with three panels each. The NestedElement representing panel 2 on wing 1 would be defined by the <i>topElement</i> ElementDefinition for the spacecraft (the "system-of-interest"), and a list of elementUsages referencing: the "sm" usage, the  "wing1" usage, the "panel2" usage, in that order.
 */
@Container(clazz = Option.class, propertyName = "nestedElement")
@ToString
@EqualsAndHashCode
public  class NestedElement extends Thing implements NamedThing, OwnedThing, ShortNamedThing, VolatileThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NONE;

    /**
     * Initializes a new instance of the <code>NestedElement<code/> class.
     *
     * @see NestedElement
     */
    public NestedElement() {
        this.elementUsage = new OrderedItemList<ElementUsage>(this);
        this.nestedParameter = new ContainerList<NestedParameter>(this);
    }

    /**
     * Initializes a new instance of the <code>NestedElement<code/> class.
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
     * @see NestedElement
     */
    public NestedElement(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.elementUsage = new OrderedItemList<ElementUsage>(this);
        this.nestedParameter = new ContainerList<NestedParameter>(this);
    }

    /**
     * List of ordered ElementUsage.
     * unique path to a single NestedElement defined by an ordered list of references to ElementUsages
     * Note: The first ElementUsage in the list must be a <i>containedElement</i> of the topElement of the relevant Iteration, the second ElementUsage must be a <i>containedElement</i> of the ElementDefinition pointed to by the <i>elementDefinition</i> of the first ElementUsage, and so on until the intended nested ElementUsage is reached.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<ElementUsage> elementUsage;

    /**
     * Value indicating whether isVolatile.
     * Note: When an instance is marked volatile it will not be persisted in the persistent data store. This meant to allow for runtime-only use of such instances in a client application.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isVolatile;

    /**
     * Property name.
     * name derived from chain of the names of the <i>rootElement</i> and <i>elementUsage</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String name;
 
    /**
     * List of contained NestedParameter.
     * ordered list of NestedParameters that defined the fully expanded parametric representation for this NestedElement for a combination of one Option and one DomainOfExpertise
     * Note: NestedParameters are meant to be present only on generated NestedElements.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<NestedParameter> nestedParameter;

    /**
     * Property owner.
     * reference to the owner DomainOfExpertise of this NestedElement
     * Note: The owner DomainOfExpertise of this NestedElement is the same as the owner of the last ElementUsage in the <i>elementUsage</i> path.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private DomainOfExpertise owner;
 
    /**
     * Property rootElement.
     * reference to the root ElementDefinition at which the path to this NestedElement starts
     * Note: For an EngineeringModel that is an EngineeringModelKind.STUDY_MODEL this is typically the <i>topElement</i> of the selected Iteration. However the rootElement may be any ElementDefinition which allows for the generation of subtrees subtended from anywhere in the composite structure of a model, which is for example useful in EngineeringModels that are of the EngineeringModelKind.CATALOGUE kind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ElementDefinition rootElement;

    /**
     * Property shortName.
     * short name derived from chain of the names of the <i>rootElement</i> and <i>elementUsage</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String shortName;
 

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>NestedElement<code/>.
     *
     * @see Iterable
     * @see NestedElement
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of ordered ElementUsage.
     * unique path to a single NestedElement defined by an ordered list of references to ElementUsages
     * Note: The first ElementUsage in the list must be a <i>containedElement</i> of the topElement of the relevant Iteration, the second ElementUsage must be a <i>containedElement</i> of the ElementDefinition pointed to by the <i>elementDefinition</i> of the first ElementUsage, and so on until the intended nested ElementUsage is reached.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<ElementUsage> getElementUsage(){
         return this.elementUsage;
    }

    /**
     * Gets a value indicating whether isVolatile.
     * Note: When an instance is marked volatile it will not be persisted in the persistent data store. This meant to allow for runtime-only use of such instances in a client application.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getVolatile(){
         return this.isVolatile;
    }

    /**
     * Gets the name.
     * name derived from chain of the names of the <i>rootElement</i> and <i>elementUsage</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public String getName(){
        return this.GetDerivedName();
    }

    /**
     * Gets a list of contained NestedParameter.
     * ordered list of NestedParameters that defined the fully expanded parametric representation for this NestedElement for a combination of one Option and one DomainOfExpertise
     * Note: NestedParameters are meant to be present only on generated NestedElements.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<NestedParameter> getNestedParameter(){
         return this.nestedParameter;
    }

    /**
     * Gets the owner.
     * reference to the owner DomainOfExpertise of this NestedElement
     * Note: The owner DomainOfExpertise of this NestedElement is the same as the owner of the last ElementUsage in the <i>elementUsage</i> path.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public DomainOfExpertise getOwner(){
        return this.GetDerivedOwner();
    }

    /**
     * Gets the rootElement.
     * reference to the root ElementDefinition at which the path to this NestedElement starts
     * Note: For an EngineeringModel that is an EngineeringModelKind.STUDY_MODEL this is typically the <i>topElement</i> of the selected Iteration. However the rootElement may be any ElementDefinition which allows for the generation of subtrees subtended from anywhere in the composite structure of a model, which is for example useful in EngineeringModels that are of the EngineeringModelKind.CATALOGUE kind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ElementDefinition getRootElement(){
         return this.rootElement;
    }

    /**
     * Gets the shortName.
     * short name derived from chain of the names of the <i>rootElement</i> and <i>elementUsage</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public String getShortName(){
        return this.GetDerivedShortName();
    }

    /**
     * Sets a list of ordered ElementUsage.
     * unique path to a single NestedElement defined by an ordered list of references to ElementUsages
     * Note: The first ElementUsage in the list must be a <i>containedElement</i> of the topElement of the relevant Iteration, the second ElementUsage must be a <i>containedElement</i> of the ElementDefinition pointed to by the <i>elementDefinition</i> of the first ElementUsage, and so on until the intended nested ElementUsage is reached.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     public void setElementUsage(OrderedItemList<ElementUsage> elementUsage){
        this.elementUsage = elementUsage;
    }

    /**
     *Sets a value indicating whether isVolatile.
     * Note: When an instance is marked volatile it will not be persisted in the persistent data store. This meant to allow for runtime-only use of such instances in a client application.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setVolatile(boolean isVolatile){
        this.isVolatile = isVolatile;
    }

    /**
     * Sets the name.
     * name derived from chain of the names of the <i>rootElement</i> and <i>elementUsage</i>
     *
     * @throws IllegalStateException The name property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setName(String name){
        throw new IllegalStateException("Forbidden Set value for the derived property NestedElement.name");
    }

    /**
     * Sets a list of contained NestedParameter.
     * ordered list of NestedParameters that defined the fully expanded parametric representation for this NestedElement for a combination of one Option and one DomainOfExpertise
     * Note: NestedParameters are meant to be present only on generated NestedElements.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setNestedParameter(ContainerList<NestedParameter> nestedParameter){
        this.nestedParameter = nestedParameter;
    }

    /**
     * Sets the owner.
     * reference to the owner DomainOfExpertise of this NestedElement
     * Note: The owner DomainOfExpertise of this NestedElement is the same as the owner of the last ElementUsage in the <i>elementUsage</i> path.
     *
     * @throws IllegalStateException The owner property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setOwner(DomainOfExpertise owner){
        throw new IllegalStateException("Forbidden Set value for the derived property NestedElement.owner");
    }

    /**
     * Sets the rootElement.
     * reference to the root ElementDefinition at which the path to this NestedElement starts
     * Note: For an EngineeringModel that is an EngineeringModelKind.STUDY_MODEL this is typically the <i>topElement</i> of the selected Iteration. However the rootElement may be any ElementDefinition which allows for the generation of subtrees subtended from anywhere in the composite structure of a model, which is for example useful in EngineeringModels that are of the EngineeringModelKind.CATALOGUE kind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setRootElement(ElementDefinition rootElement){
        this.rootElement = rootElement;
    }

    /**
     * Sets the shortName.
     * short name derived from chain of the names of the <i>rootElement</i> and <i>elementUsage</i>
     *
     * @throws IllegalStateException The shortName property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setShortName(String shortName){
        throw new IllegalStateException("Forbidden Set value for the derived property NestedElement.shortName");
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>NestedElement<code/>.
     *
     * @see Iterable
     * @see NestedElement
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.nestedParameter);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>NestedElement<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>NestedElement<code/>.
     *
     * @see NestedElement
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        NestedElement clone = (NestedElement)this.clone();
        clone.setElementUsage(new OrderedItemList<ElementUsage>(this.getElementUsage(), this));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setNestedParameter(cloneContainedThings ? new ContainerList<NestedParameter>(clone) : new ContainerList<NestedParameter>(this.getNestedParameter(), clone));

        if (cloneContainedThings) {
            clone.getNestedParameter().addAll(this.getNestedParameter().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>NestedElement<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>NestedElement<code/>.
     * 
     * @see NestedElement
     */
    @Override
    public NestedElement clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (NestedElement)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>NestedElement<code/>.
     *
     * @return A list of potential errors.
     *
     * @see NestedElement
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int elementUsageCount = this.getElementUsage().size();
        if (elementUsageCount < 1) {
            errorList.add("The number of elements in the property elementUsage is wrong. It should be at least 1.");
        }

        if (this.getRootElement() == null || this.getRootElement().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property rootElement is null.");
            this.setRootElement(SentinelThingProvider.getSentinel<ElementDefinition>());
            this.sentinelResetMap["rootElement"] = () -> this.setRootElement(null);
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>NestedElement<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see NestedElement
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.NestedElement dto = (cdp4common.dto.NestedElement)dtoThing;

        this.elementUsage.resolveList(dto.getElementUsage(), dto.getIterationContainerId(), this.getCache());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setIsVolatile(dto.getIsVolatile());
        this.setModifiedOn(dto.getModifiedOn());
        this.nestedParameter.resolveList(dto.getNestedParameter(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setRootElement(this.cache.get<ElementDefinition>(dto.getRootElement(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<ElementDefinition>());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>NestedElement<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see NestedElement
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.NestedElement dto = new cdp4common.dto.NestedElement(this.getIid(), this.getRevisionNumber());

        dto.getElementUsage().add(this.getElementUsage().toDtoOrderedItemList());
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setIsVolatile(this.getIsVolatile());
        dto.setModifiedOn(this.getModifiedOn());
        dto.getNestedParameter().add(this.getNestedParameter().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setRootElement(this.getRootElement() != null ? this.getRootElement().getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
