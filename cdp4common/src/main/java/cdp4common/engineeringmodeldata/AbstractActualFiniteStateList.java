/* --------------------------------------------------------------------------------------------------------------------
 * AbstractActualFiniteStateList.java
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
 * representation of a set of actual finite states that can be used to define a finite state dependence for a Parameter
 */
@Container(clazz = Iteration.class, propertyName = "actualFiniteStateList")
public abstract class AbstractActualFiniteStateList extends AbstractThing implements NamedThing, OptionDependentThing, OwnedThing, ShortNamedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_N_E;

    /**
     * Initializes a new instance of the <code>ActualFiniteStateList<code/> class.
     *
     * @see ActualFiniteStateList
     */
    public AbstractActualFiniteStateList() {
        this.actualState = new ContainerList<ActualFiniteState>(this);
        this.excludeOption = new List<Option>();
        this.possibleFiniteStateList = new OrderedItemList<PossibleFiniteStateList>(this);
    }

    /**
     * Initializes a new instance of the <code>ActualFiniteStateList<code/> class.
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
     * @see ActualFiniteStateList
     */
    public AbstractActualFiniteStateList(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.actualState = new ContainerList<ActualFiniteState>(this);
        this.excludeOption = new List<Option>();
        this.possibleFiniteStateList = new OrderedItemList<PossibleFiniteStateList>(this);
    }

    /**
     * List of contained ActualFiniteState.
     * representation of the actual finite states defined for this ActualFiniteStateList
     * Note 1: The kind property on ActualFiniteState determines whether an actual finite state is mandatory, optional or forbidden for the <i>valueSet</i> of a Parameter or ParameterOverride.
     * Note 2: It is not required to define an ActualFiniteState for all possible combinations of PossibleFiniteState permitted by the associated PossibleFiniteStateLists. However at least one MANDATORY ActualFiniteState should be defined (through the <i>kind</i> property). Any combinations that are not explicitly defined are by default regarded as OPTIONAL. Implementations may add such combinations on the fly when a user desires to use them.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ActualFiniteState> actualState;

    /**
     * List of Option.
     * reference to zero or more Options from which this OptionDependentThing is excluded
     * Note: By default all OptionDependentThings are included in all Options in an EngineeringModel. Only the exclusions are recorded in the data model because this is the most efficient way of storing and handling the option dependency. In client applications it may be more intuitive to show the included Options, but that is a simple transformation.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<Option> excludeOption;

    /**
     * Property name.
     * name derived from the <i>possibleFiniteStateList</i> by concatenation of the names of each referenced PossibleFiniteStateList
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String name;
 
    /**
     * Property owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DomainOfExpertise owner;

    /**
     * List of ordered PossibleFiniteStateList.
     * definition of an ordered set of PossibleFiniteStateLists that define the basis for this ActualFiniteStateList
     * Example: Assume that PossibleFiniteStateLists have been defined for "MissionPhase" and "PowerMode". Now an ActualFiniteStateList could be created that defines "MissionPhase" / "PowerMode" combinations as ActualFiniteStates. A Parameter may then reference such an ActualFiniteStateList through its <i>stateDependence</i> property, and subsequently ParameterValueSets (and where applicable ParameterSubscriptionValueSets) for each of the relevant ActualFiniteStates can be created.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<PossibleFiniteStateList> possibleFiniteStateList;

    /**
     * Property shortName.
     * short name derived from the <i>possibleFiniteStateList</i> by concatenation of the short names of each referenced PossibleFiniteStateList
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String shortName;
 

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>ActualFiniteStateList<code/>.
     *
     * @see Iterable
     * @see ActualFiniteStateList
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of contained ActualFiniteState.
     * representation of the actual finite states defined for this ActualFiniteStateList
     * Note 1: The kind property on ActualFiniteState determines whether an actual finite state is mandatory, optional or forbidden for the <i>valueSet</i> of a Parameter or ParameterOverride.
     * Note 2: It is not required to define an ActualFiniteState for all possible combinations of PossibleFiniteState permitted by the associated PossibleFiniteStateLists. However at least one MANDATORY ActualFiniteState should be defined (through the <i>kind</i> property). Any combinations that are not explicitly defined are by default regarded as OPTIONAL. Implementations may add such combinations on the fly when a user desires to use them.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ActualFiniteState> getActualState(){
         return this.actualState;
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
     * Gets the name.
     * name derived from the <i>possibleFiniteStateList</i> by concatenation of the names of each referenced PossibleFiniteStateList
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public String getName(){
        return this.GetDerivedName();
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
     * Gets a list of ordered PossibleFiniteStateList.
     * definition of an ordered set of PossibleFiniteStateLists that define the basis for this ActualFiniteStateList
     * Example: Assume that PossibleFiniteStateLists have been defined for "MissionPhase" and "PowerMode". Now an ActualFiniteStateList could be created that defines "MissionPhase" / "PowerMode" combinations as ActualFiniteStates. A Parameter may then reference such an ActualFiniteStateList through its <i>stateDependence</i> property, and subsequently ParameterValueSets (and where applicable ParameterSubscriptionValueSets) for each of the relevant ActualFiniteStates can be created.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<PossibleFiniteStateList> getPossibleFiniteStateList(){
         return this.possibleFiniteStateList;
    }

    /**
     * Gets the shortName.
     * short name derived from the <i>possibleFiniteStateList</i> by concatenation of the short names of each referenced PossibleFiniteStateList
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public String getShortName(){
        return this.GetDerivedShortName();
    }

    /**
     * Sets a list of contained ActualFiniteState.
     * representation of the actual finite states defined for this ActualFiniteStateList
     * Note 1: The kind property on ActualFiniteState determines whether an actual finite state is mandatory, optional or forbidden for the <i>valueSet</i> of a Parameter or ParameterOverride.
     * Note 2: It is not required to define an ActualFiniteState for all possible combinations of PossibleFiniteState permitted by the associated PossibleFiniteStateLists. However at least one MANDATORY ActualFiniteState should be defined (through the <i>kind</i> property). Any combinations that are not explicitly defined are by default regarded as OPTIONAL. Implementations may add such combinations on the fly when a user desires to use them.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setActualState(ContainerList<ActualFiniteState> actualState){
        this.actualState = actualState;
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
     * Sets the name.
     * name derived from the <i>possibleFiniteStateList</i> by concatenation of the names of each referenced PossibleFiniteStateList
     *
     * @throws IllegalStateException The name property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setName(String name){
        throw new IllegalStateException("Forbidden Set value for the derived property ActualFiniteStateList.name");
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
     * Sets a list of ordered PossibleFiniteStateList.
     * definition of an ordered set of PossibleFiniteStateLists that define the basis for this ActualFiniteStateList
     * Example: Assume that PossibleFiniteStateLists have been defined for "MissionPhase" and "PowerMode". Now an ActualFiniteStateList could be created that defines "MissionPhase" / "PowerMode" combinations as ActualFiniteStates. A Parameter may then reference such an ActualFiniteStateList through its <i>stateDependence</i> property, and subsequently ParameterValueSets (and where applicable ParameterSubscriptionValueSets) for each of the relevant ActualFiniteStates can be created.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     public void setPossibleFiniteStateList(OrderedItemList<PossibleFiniteStateList> possibleFiniteStateList){
        this.possibleFiniteStateList = possibleFiniteStateList;
    }

    /**
     * Sets the shortName.
     * short name derived from the <i>possibleFiniteStateList</i> by concatenation of the short names of each referenced PossibleFiniteStateList
     *
     * @throws IllegalStateException The shortName property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setShortName(String shortName){
        throw new IllegalStateException("Forbidden Set value for the derived property ActualFiniteStateList.shortName");
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>ActualFiniteStateList<code/>.
     *
     * @see Iterable
     * @see ActualFiniteStateList
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.actualState);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>ActualFiniteStateList<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ActualFiniteStateList<code/>.
     *
     * @see ActualFiniteStateList
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ActualFiniteStateList clone = (ActualFiniteStateList)this.clone();
        clone.setActualState(cloneContainedThings ? new ContainerList<ActualFiniteState>(clone) : new ContainerList<ActualFiniteState>(this.actualState, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setExcludeOption(new List<Option>(this.excludeOption));
        clone.setPossibleFiniteStateList(new OrderedItemList<PossibleFiniteStateList>(this.possibleFiniteStateList, this));

        if (cloneContainedThings) {
            clone.getActualState().addAll(this.actualState.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>ActualFiniteStateList<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ActualFiniteStateList<code/>.
     * 
     * @see ActualFiniteStateList
     */
    @Override
    public ActualFiniteStateList clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ActualFiniteStateList)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ActualFiniteStateList<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ActualFiniteStateList
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.owner == null || this.owner.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property owner is null.");
            this.owner = SentinelThingProvider.getSentinel<DomainOfExpertise>();
            this.sentinelResetMap["owner"] = () -> this.owner = null;
        }

        int possibleFiniteStateListCount = this.possibleFiniteStateList.size();
        if (possibleFiniteStateListCount < 1) {
            errorList.add("The number of elements in the property possibleFiniteStateList is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ActualFiniteStateList<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ActualFiniteStateList
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ActualFiniteStateList dto = (cdp4common.dto.ActualFiniteStateList)dtoThing;

        this.actualState.resolveList(dto.getActualState(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.excludeOption.resolveList(dto.getExcludeOption(), dto.getIterationContainerId(), this.cache);
        this.modifiedOn = dto.getModifiedOn();
        this.owner = this.cache.get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>();
        this.possibleFiniteStateList.resolveList(dto.getPossibleFiniteStateList(), dto.getIterationContainerId(), this.cache);
        this.revisionNumber = dto.getRevisionNumber();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ActualFiniteStateList<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ActualFiniteStateList
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ActualFiniteStateList dto = new cdp4common.dto.ActualFiniteStateList(this.iid, this.revisionNumber);

        dto.getActualState().add(this.actualState.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludeOption().add(this.excludeOption.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setModifiedOn(this.modifiedOn);
        dto.setOwner(this.owner != null ? this.owner.getIid() : new UUID(0L, 0L));
        dto.getPossibleFiniteStateList().add(this.possibleFiniteStateList.toDtoOrderedItemList());
        dto.setRevisionNumber(this.revisionNumber);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
