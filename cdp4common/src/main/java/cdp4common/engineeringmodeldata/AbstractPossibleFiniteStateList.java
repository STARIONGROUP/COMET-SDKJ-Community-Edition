/* --------------------------------------------------------------------------------------------------------------------
 * AbstractPossibleFiniteStateList.java
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
 * specialization of CategorizableThing that defines a finite ordered
 * collection of one or more named States
 * Note: A PossibleFiniteStateList may form the basis for later definition of a
 * finite state machine.
 * Example 1: A PossibleFiniteStateList may be used to define "MissionPhases" with
 * the sequence of states "PreLaunch", "Launch",  "Ascent",
 * "TransferOrbit", "OperationalOrbit".
 * Example 2: A PossibleFiniteStateList may be used to define "SpacecraftModes"
 * with states "SafeMode", "Hibernation", "Operation".
 */
@Container(clazz = Iteration.class, propertyName = "possibleFiniteStateList")
public abstract class AbstractPossibleFiniteStateList extends AbstractDefinedThing implements CategorizableThing, OwnedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_N_E;

    /**
     * Initializes a new instance of the <code>PossibleFiniteStateList<code/> class.
     *
     * @see PossibleFiniteStateList
     */
    public AbstractPossibleFiniteStateList() {
        this.category = new List<Category>();
        this.possibleState = new OrderedItemList<PossibleFiniteState>(this, true);
    }

    /**
     * Initializes a new instance of the <code>PossibleFiniteStateList<code/> class.
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
     * @see PossibleFiniteStateList
     */
    public AbstractPossibleFiniteStateList(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.category = new List<Category>();
        this.possibleState = new OrderedItemList<PossibleFiniteState>(this, true);
    }

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<Category> category;

    /**
     * Property defaultState.
     * reference to the PossibleFiniteState that is considered the default state for this PossibleFiniteStateList
     * Note: The referenced PossibleFiniteState must be one of the possibleState of this PossibleFiniteStateList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private PossibleFiniteState defaultState;

    /**
     * Property owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DomainOfExpertise owner;

    /**
     * List of ordered contained PossibleFiniteState.
     * ordered collection of finite states for this PossibleFiniteStateList
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<PossibleFiniteState> possibleState;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>PossibleFiniteStateList<code/>.
     *
     * @see Iterable
     * @see PossibleFiniteStateList
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public List<Category> getCategory(){
         return this.category;
    }

    /**
     * Gets the defaultState.
     * reference to the PossibleFiniteState that is considered the default state for this PossibleFiniteStateList
     * Note: The referenced PossibleFiniteState must be one of the possibleState of this PossibleFiniteStateList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public PossibleFiniteState getDefaultState(){
         return this.defaultState;
    }

    /**
     * Gets the owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public DomainOfExpertise getOwner(){
         return this.owner;
    }

    /**
     * Gets a list of ordered contained PossibleFiniteState.
     * ordered collection of finite states for this PossibleFiniteStateList
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<PossibleFiniteState> getPossibleState(){
         return this.possibleState;
    }

    /**
     * Sets a list of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setCategory(List<Category> category){
        this.category = category;
    }

    /**
     * Sets the defaultState.
     * reference to the PossibleFiniteState that is considered the default state for this PossibleFiniteStateList
     * Note: The referenced PossibleFiniteState must be one of the possibleState of this PossibleFiniteStateList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDefaultState(PossibleFiniteState defaultState){
        this.defaultState = defaultState;
    }

    /**
     * Sets the owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setOwner(DomainOfExpertise owner){
        this.owner = owner;
    }

    /**
     * Sets a list of ordered contained PossibleFiniteState.
     * ordered collection of finite states for this PossibleFiniteStateList
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     protected void setPossibleState(OrderedItemList<PossibleFiniteState> possibleState){
        this.possibleState = possibleState;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>PossibleFiniteStateList<code/>.
     *
     * @see Iterable
     * @see PossibleFiniteStateList
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.possibleState);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>PossibleFiniteStateList<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>PossibleFiniteStateList<code/>.
     *
     * @see PossibleFiniteStateList
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        PossibleFiniteStateList clone = (PossibleFiniteStateList)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setCategory(new List<Category>(this.category));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));
        clone.setPossibleState(cloneContainedThings ? new OrderedItemList<PossibleFiniteState>(clone, true) : new OrderedItemList<PossibleFiniteState>(this.possibleState, clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getPossibleState().addAll(this.possibleState.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>PossibleFiniteStateList<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>PossibleFiniteStateList<code/>.
     * 
     * @see PossibleFiniteStateList
     */
    @Override
    public PossibleFiniteStateList clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (PossibleFiniteStateList)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>PossibleFiniteStateList<code/>.
     *
     * @return A list of potential errors.
     *
     * @see PossibleFiniteStateList
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.owner == null || this.owner.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property owner is null.");
            this.owner = SentinelThingProvider.getSentinel<DomainOfExpertise>();
            this.sentinelResetMap["owner"] = () -> this.owner = null;
        }

        int possibleStateCount = this.possibleState.size();
        if (possibleStateCount < 1) {
            errorList.add("The number of elements in the property possibleState is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>PossibleFiniteStateList<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see PossibleFiniteStateList
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.PossibleFiniteStateList dto = (cdp4common.dto.PossibleFiniteStateList)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.cache);
        this.defaultState = (dto.getDefaultState() != null) ? this.cache.get<PossibleFiniteState>(dto.getDefaultState.getValue(), dto.getIterationContainerId()) : null;
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.owner = this.cache.get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>();
        this.possibleState.resolveList(dto.getPossibleState(), dto.getIterationContainerId(), this.cache);
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>PossibleFiniteStateList<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see PossibleFiniteStateList
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.PossibleFiniteStateList dto = new cdp4common.dto.PossibleFiniteStateList(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getCategory().add(this.category.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setDefaultState(this.defaultState != null ? (UUID)this.defaultState.getIid() : null);
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.setOwner(this.owner != null ? this.owner.getIid() : new UUID(0L, 0L));
        dto.getPossibleState().add(this.possibleState.toDtoOrderedItemList());
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
