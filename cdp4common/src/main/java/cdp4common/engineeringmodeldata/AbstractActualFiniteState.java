/* --------------------------------------------------------------------------------------------------------------------
 * AbstractActualFiniteState.java
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
 * representation of an actual finite state in an ActualFiniteStateList
 * Note: Such an actual finite state may is composed of as many possible finite states as there are PossibleFiniteStateLists associated to the containing ActualFiniteStateList of this ActualFiniteState. An ActualFiniteState can be associated with a ParameterValueSet for a Parameter (or ParameterOverride) that has a <i>stateDependence</i>, as well as for a ParameterSubscriptionValueSet for such a Parameter or ParameterOverride.
 */
@Container(clazz = ActualFiniteStateList.class, propertyName = "actualState")
public abstract class AbstractActualFiniteState extends AbstractThing implements NamedThing, OwnedThing, ShortNamedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>ActualFiniteState<code/> class.
     *
     * @see ActualFiniteState
     */
    public AbstractActualFiniteState() {
        this.possibleState = new List<PossibleFiniteState>();
    }

    /**
     * Initializes a new instance of the <code>ActualFiniteState<code/> class.
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
     * @see ActualFiniteState
     */
    public AbstractActualFiniteState(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.possibleState = new List<PossibleFiniteState>();
    }

    /**
     * Property kind.
     * assertion of the kind of ActualFiniteState
     * Note: See definitions for ActualFiniteStateKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ActualFiniteStateKind kind;

    /**
     * Property name.
     * name derived from the <i>possibleState</i> by concatenation of the names of each referenced PossibleFiniteState
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String name;
 
    /**
     * Property owner.
     * reference to the DomainOfExpertise that owns (i.e. is responsible for) this ActualFiniteState
     * Note: This is a derived property. It is always the same DomainOfExpertise as the <i>owner</i> of the containing ActualFiniteStateList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private DomainOfExpertise owner;
 
    /**
     * List of PossibleFiniteState.
     * Note: The set must include one PossibleFiniteState from each of the PossibleFiniteStateLists that is referenced by the containing ActualFiniteStateList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<PossibleFiniteState> possibleState;

    /**
     * Property shortName.
     * short name derived from the <i>possibleState</i> by concatenation of the <i>shortName</i> of each referenced PossibleFiniteState
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String shortName;
 

    /**
     * Gets the kind.
     * assertion of the kind of ActualFiniteState
     * Note: See definitions for ActualFiniteStateKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ActualFiniteStateKind getKind(){
         return this.kind;
    }

    /**
     * Gets the name.
     * name derived from the <i>possibleState</i> by concatenation of the names of each referenced PossibleFiniteState
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public String getName(){
        return this.GetDerivedName();
    }

    /**
     * Gets the owner.
     * reference to the DomainOfExpertise that owns (i.e. is responsible for) this ActualFiniteState
     * Note: This is a derived property. It is always the same DomainOfExpertise as the <i>owner</i> of the containing ActualFiniteStateList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public DomainOfExpertise getOwner(){
        return this.GetDerivedOwner();
    }

    /**
     * Gets a list of PossibleFiniteState.
     * Note: The set must include one PossibleFiniteState from each of the PossibleFiniteStateLists that is referenced by the containing ActualFiniteStateList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public List<PossibleFiniteState> getPossibleState(){
         return this.possibleState;
    }

    /**
     * Gets the shortName.
     * short name derived from the <i>possibleState</i> by concatenation of the <i>shortName</i> of each referenced PossibleFiniteState
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public String getShortName(){
        return this.GetDerivedShortName();
    }

    /**
     * Sets the kind.
     * assertion of the kind of ActualFiniteState
     * Note: See definitions for ActualFiniteStateKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setKind(ActualFiniteStateKind kind){
        this.kind = kind;
    }

    /**
     * Sets the name.
     * name derived from the <i>possibleState</i> by concatenation of the names of each referenced PossibleFiniteState
     *
     * @throws IllegalStateException The name property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setName(String name){
        throw new IllegalStateException("Forbidden Set value for the derived property ActualFiniteState.name");
    }

    /**
     * Sets the owner.
     * reference to the DomainOfExpertise that owns (i.e. is responsible for) this ActualFiniteState
     * Note: This is a derived property. It is always the same DomainOfExpertise as the <i>owner</i> of the containing ActualFiniteStateList.
     *
     * @throws IllegalStateException The owner property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setOwner(DomainOfExpertise owner){
        throw new IllegalStateException("Forbidden Set value for the derived property ActualFiniteState.owner");
    }

    /**
     * Sets a list of PossibleFiniteState.
     * Note: The set must include one PossibleFiniteState from each of the PossibleFiniteStateLists that is referenced by the containing ActualFiniteStateList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setPossibleState(List<PossibleFiniteState> possibleState){
        this.possibleState = possibleState;
    }

    /**
     * Sets the shortName.
     * short name derived from the <i>possibleState</i> by concatenation of the <i>shortName</i> of each referenced PossibleFiniteState
     *
     * @throws IllegalStateException The shortName property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setShortName(String shortName){
        throw new IllegalStateException("Forbidden Set value for the derived property ActualFiniteState.shortName");
    }

    /**
     * Creates and returns a copy of this <code>ActualFiniteState<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ActualFiniteState<code/>.
     *
     * @see ActualFiniteState
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ActualFiniteState clone = (ActualFiniteState)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setPossibleState(new List<PossibleFiniteState>(this.possibleState));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>ActualFiniteState<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ActualFiniteState<code/>.
     * 
     * @see ActualFiniteState
     */
    @Override
    public ActualFiniteState clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ActualFiniteState)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ActualFiniteState<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ActualFiniteState
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int possibleStateCount = this.possibleState.size();
        if (possibleStateCount < 1) {
            errorList.add("The number of elements in the property possibleState is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ActualFiniteState<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ActualFiniteState
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ActualFiniteState dto = (cdp4common.dto.ActualFiniteState)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.kind = dto.getKind();
        this.modifiedOn = dto.getModifiedOn();
        this.possibleState.resolveList(dto.getPossibleState(), dto.getIterationContainerId(), this.cache);
        this.revisionNumber = dto.getRevisionNumber();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ActualFiniteState<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ActualFiniteState
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ActualFiniteState dto = new cdp4common.dto.ActualFiniteState(this.iid, this.revisionNumber);

        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setKind(this.kind);
        dto.setModifiedOn(this.modifiedOn);
        dto.getPossibleState().add(this.possibleState.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.revisionNumber);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
