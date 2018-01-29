/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParameterBase.java
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
 * abstract superclass that enables a common referencing mechanism for Parameter, ParameterOverride and ParameterSubscription
 */
@ToString
@EqualsAndHashCode
public  abstract class ParameterBase extends Thing implements OwnedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the <code>ParameterBase<code/> class.
     *
     * @see ParameterBase
     */
    protected ParameterBase() {
    }

    /**
     * Initializes a new instance of the <code>ParameterBase<code/> class.
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
     * @see ParameterBase
     */
    protected ParameterBase(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property group.
     * optional reference to the ParameterGroup to which this ParameterBase belongs
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ParameterGroup group;

    /**
     * Value indicating whether isOptionDependent.
     * assertion whether the values of this ParameterBase depend on the Options defined in the associated Iteration or not
     * Note 1: When <i>isOptionDependent</i> is true, a ParameterValueSet (or ParameterOverrideValueSet or ParameterSubscriptionValueSet respectively) for each Option in the associated Iteration will be created. Values can then be specified for each Option. When <i>isOptionDependent</i> is false, the value of this ParameterBase is the same for all Options.
     * Note 2: When a new Option is added to an Iteration, automatically new ParameterValueSets (and where applicable ParameterOverrideValueSets and ParameterSubscriptionValueSets) shall be created for that Option for all Parameters and ParameterOverrides that have <i>isOptionDependent</i> is true. When an Option is removed from an Iteration, automatically the option dependent ParameterValueSets (and where applicable ParameterOverrideValueSets and ParameterSubscriptionValueSets) shall be deleted.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isOptionDependent;

    /**
     * Property owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DomainOfExpertise owner;

    /**
     * Property parameterType.
     * reference to the ParameterType of this ParameterBase
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ParameterType parameterType;

    /**
     * Property scale.
     * reference to the MeasurementScale applicable to this ParameterBase
     * Note: The <i>scale</i> is mandatory for parameters of a numerical type, i.e. for which the <i>parameterType</i> is a QuantityKind, otherwise it is not assigned.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private MeasurementScale scale;

    /**
     * Property stateDependence.
     * optional reference to an ActualFiniteStateList that defines the ActualFiniteStates that this ParameterBase depends on
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ActualFiniteStateList stateDependence;

    /**
     * Gets the group.
     * optional reference to the ParameterGroup to which this ParameterBase belongs
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ParameterGroup getGroup(){
         return this.group;
    }

    /**
     * Gets a value indicating whether isOptionDependent.
     * assertion whether the values of this ParameterBase depend on the Options defined in the associated Iteration or not
     * Note 1: When <i>isOptionDependent</i> is true, a ParameterValueSet (or ParameterOverrideValueSet or ParameterSubscriptionValueSet respectively) for each Option in the associated Iteration will be created. Values can then be specified for each Option. When <i>isOptionDependent</i> is false, the value of this ParameterBase is the same for all Options.
     * Note 2: When a new Option is added to an Iteration, automatically new ParameterValueSets (and where applicable ParameterOverrideValueSets and ParameterSubscriptionValueSets) shall be created for that Option for all Parameters and ParameterOverrides that have <i>isOptionDependent</i> is true. When an Option is removed from an Iteration, automatically the option dependent ParameterValueSets (and where applicable ParameterOverrideValueSets and ParameterSubscriptionValueSets) shall be deleted.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getOptionDependent(){
         return this.isOptionDependent;
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
     * Gets the parameterType.
     * reference to the ParameterType of this ParameterBase
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ParameterType getParameterType(){
         return this.parameterType;
    }

    /**
     * Gets the scale.
     * reference to the MeasurementScale applicable to this ParameterBase
     * Note: The <i>scale</i> is mandatory for parameters of a numerical type, i.e. for which the <i>parameterType</i> is a QuantityKind, otherwise it is not assigned.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public MeasurementScale getScale(){
         return this.scale;
    }

    /**
     * Gets the stateDependence.
     * optional reference to an ActualFiniteStateList that defines the ActualFiniteStates that this ParameterBase depends on
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ActualFiniteStateList getStateDependence(){
         return this.stateDependence;
    }

    /**
     * Sets the group.
     * optional reference to the ParameterGroup to which this ParameterBase belongs
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setGroup(ParameterGroup group){
        this.group = group;
    }

    /**
     *Sets a value indicating whether isOptionDependent.
     * assertion whether the values of this ParameterBase depend on the Options defined in the associated Iteration or not
     * Note 1: When <i>isOptionDependent</i> is true, a ParameterValueSet (or ParameterOverrideValueSet or ParameterSubscriptionValueSet respectively) for each Option in the associated Iteration will be created. Values can then be specified for each Option. When <i>isOptionDependent</i> is false, the value of this ParameterBase is the same for all Options.
     * Note 2: When a new Option is added to an Iteration, automatically new ParameterValueSets (and where applicable ParameterOverrideValueSets and ParameterSubscriptionValueSets) shall be created for that Option for all Parameters and ParameterOverrides that have <i>isOptionDependent</i> is true. When an Option is removed from an Iteration, automatically the option dependent ParameterValueSets (and where applicable ParameterOverrideValueSets and ParameterSubscriptionValueSets) shall be deleted.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setOptionDependent(boolean isOptionDependent){
        this.isOptionDependent = isOptionDependent;
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
     * Sets the parameterType.
     * reference to the ParameterType of this ParameterBase
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setParameterType(ParameterType parameterType){
        this.parameterType = parameterType;
    }

    /**
     * Sets the scale.
     * reference to the MeasurementScale applicable to this ParameterBase
     * Note: The <i>scale</i> is mandatory for parameters of a numerical type, i.e. for which the <i>parameterType</i> is a QuantityKind, otherwise it is not assigned.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setScale(MeasurementScale scale){
        this.scale = scale;
    }

    /**
     * Sets the stateDependence.
     * optional reference to an ActualFiniteStateList that defines the ActualFiniteStates that this ParameterBase depends on
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setStateDependence(ActualFiniteStateList stateDependence){
        this.stateDependence = stateDependence;
    }

    /**
     * Creates and returns a copy of this <code>ParameterBase<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParameterBase<code/>.
     * 
     * @see ParameterBase
     */
    @Override
    public ParameterBase clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterBase)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ParameterBase<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ParameterBase
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getOwner() == null || this.getOwner().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property owner is null.");
            this.setOwner(SentinelThingProvider.getSentinel<DomainOfExpertise>());
            this.sentinelResetMap["owner"] = () -> this.setOwner(null);
        }

        if (this.getParameterType() == null || this.getParameterType().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property parameterType is null.");
            this.setParameterType(SentinelThingProvider.getSentinel<ParameterType>());
            this.sentinelResetMap["parameterType"] = () -> this.setParameterType(null);
        }

        return errorList;
    }
}
