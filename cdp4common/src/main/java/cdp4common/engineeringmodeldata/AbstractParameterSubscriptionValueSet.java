/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParameterSubscriptionValueSet.java
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
 * representation of the switch setting and all values of a ParameterSubscription
 */
@Container(clazz = ParameterSubscription.class, propertyName = "valueSet")
public abstract class AbstractParameterSubscriptionValueSet extends AbstractThing implements OwnedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>ParameterSubscriptionValueSet<code/> class.
     *
     * @see ParameterSubscriptionValueSet
     */
    public AbstractParameterSubscriptionValueSet() {
        this.manual = new ValueArray<String>(this);
    }

    /**
     * Initializes a new instance of the <code>ParameterSubscriptionValueSet<code/> class.
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
     * @see ParameterSubscriptionValueSet
     */
    public AbstractParameterSubscriptionValueSet(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.manual = new ValueArray<String>(this);
    }

    /**
     * Property actualOption.
     * convenience property that derives the <i>actualOption</i> from the <i>subscribedValueSet</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private Option actualOption;
 
    /**
     * Property actualState.
     * convenience property that derives the <i>actualState</i> from the <i>subscribedValueSet</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private ActualFiniteState actualState;
 
    /**
     * List of ordered String.
     * derived actual value of this ParameterSubscriptionValueSet depending on the <i>valueSwitch</i> setting
     * Note: The <i>actualValue</i> is derived in the following (obvious) way:
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    private ValueArray<String> actualValue;
 
    /**
     * List of ordered String.
     * parameter value derived from the subscribed Parameter or ParameterOverride
     * Note: This value is derived from the <i>published</i> value of ParameterValueSet that is referenced through <i>subscribedValueSet</i>. In other words, it is the value as set by the owner (DomainOfExpertise) of the subscribed Parameter or  ParameterOverride.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    private ValueArray<String> computed;
 
    /**
     * List of ordered String.
     * manually assigned parameter subscription value
     * Note: The <i>manual</i> value is typically used in the beginning of the modelling process, when meaningful computed values are not yet available from the associated Parameters or ParameterOverrides. By assigning a manual value and setting the <i>valueSwitch</i> to MANUAL, computations can be started with the actual value of ParameterSubscriptions.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private ValueArray<String> manual;

    /**
     * Property owner.
     * owner (DomainOfExpertise) derived from the containing ParameterSubscription
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private DomainOfExpertise owner;
 
    /**
     * List of ordered String.
     * reference parameter value that is derived to be identical to the <i>reference</i> property of the <i>subscribedValueSet</i>
     * Note: The reference value is typically a value originating from outside the current EngineeringModel to be used as a reference to be compared with the (newly) computed value. However the reference values may be used for any purpose that a modelling activity deems useful.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    private ValueArray<String> reference;
 
    /**
     * Property subscribedValueSet.
     * reference to the ParameterValue or ParameterOverrideValue that this ParameterSubscriptionValue is subscribing to
     * Note: The Parameter associated with the referenced ParameterValue must be the same as the Parameter containing the ParameterSubscription that contains this ParameterSubscriptionValue. Alternatively, the ParameterOverride associated with the referenced ParameterOverrideValue must be the same as the ParameterOverride containing the ParameterSubscription that contains this ParameterSubscriptionValue.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ParameterValueSetBase subscribedValueSet;

    /**
     * Property valueSwitch.
     * switch that determines which value is actually used
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ParameterSwitchKind valueSwitch;

    /**
     * Gets the actualOption.
     * convenience property that derives the <i>actualOption</i> from the <i>subscribedValueSet</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public Option getActualOption(){
        return this.GetDerivedActualOption();
    }

    /**
     * Gets the actualState.
     * convenience property that derives the <i>actualState</i> from the <i>subscribedValueSet</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public ActualFiniteState getActualState(){
        return this.GetDerivedActualState();
    }

    /**
     * Gets a list of ordered String.
     * derived actual value of this ParameterSubscriptionValueSet depending on the <i>valueSwitch</i> setting
     * Note: The <i>actualValue</i> is derived in the following (obvious) way:
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    
    public ValueArray<String> getActualValue(){
        return this.GetDerivedActualValue();
    }

    /**
     * Gets a list of ordered String.
     * parameter value derived from the subscribed Parameter or ParameterOverride
     * Note: This value is derived from the <i>published</i> value of ParameterValueSet that is referenced through <i>subscribedValueSet</i>. In other words, it is the value as set by the owner (DomainOfExpertise) of the subscribed Parameter or  ParameterOverride.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    
    public ValueArray<String> getComputed(){
        return this.GetDerivedComputed();
    }

    /**
     * Gets a list of ordered String.
     * manually assigned parameter subscription value
     * Note: The <i>manual</i> value is typically used in the beginning of the modelling process, when meaningful computed values are not yet available from the associated Parameters or ParameterOverrides. By assigning a manual value and setting the <i>valueSwitch</i> to MANUAL, computations can be started with the actual value of ParameterSubscriptions.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public ValueArray<String> getManual(){
         return this.manual;
    }

    /**
     * Gets the owner.
     * owner (DomainOfExpertise) derived from the containing ParameterSubscription
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public DomainOfExpertise getOwner(){
        return this.GetDerivedOwner();
    }

    /**
     * Gets a list of ordered String.
     * reference parameter value that is derived to be identical to the <i>reference</i> property of the <i>subscribedValueSet</i>
     * Note: The reference value is typically a value originating from outside the current EngineeringModel to be used as a reference to be compared with the (newly) computed value. However the reference values may be used for any purpose that a modelling activity deems useful.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    
    public ValueArray<String> getReference(){
        return this.GetDerivedReference();
    }

    /**
     * Gets the subscribedValueSet.
     * reference to the ParameterValue or ParameterOverrideValue that this ParameterSubscriptionValue is subscribing to
     * Note: The Parameter associated with the referenced ParameterValue must be the same as the Parameter containing the ParameterSubscription that contains this ParameterSubscriptionValue. Alternatively, the ParameterOverride associated with the referenced ParameterOverrideValue must be the same as the ParameterOverride containing the ParameterSubscription that contains this ParameterSubscriptionValue.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ParameterValueSetBase getSubscribedValueSet(){
         return this.subscribedValueSet;
    }

    /**
     * Gets the valueSwitch.
     * switch that determines which value is actually used
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ParameterSwitchKind getValueSwitch(){
         return this.valueSwitch;
    }

    /**
     * Sets the actualOption.
     * convenience property that derives the <i>actualOption</i> from the <i>subscribedValueSet</i>
     *
     * @throws IllegalStateException The actualOption property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setActualOption(Option actualOption){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.actualOption");
    }

    /**
     * Sets the actualState.
     * convenience property that derives the <i>actualState</i> from the <i>subscribedValueSet</i>
     *
     * @throws IllegalStateException The actualState property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setActualState(ActualFiniteState actualState){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.actualState");
    }

    /**
     * Sets a list of ordered String.
     * derived actual value of this ParameterSubscriptionValueSet depending on the <i>valueSwitch</i> setting
     * Note: The <i>actualValue</i> is derived in the following (obvious) way:
     *
     * @throws IllegalStateException The actualValue property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    
    public void setActualValue(ValueArray<String> actualValue){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.actualValue");
    }

    /**
     * Sets a list of ordered String.
     * parameter value derived from the subscribed Parameter or ParameterOverride
     * Note: This value is derived from the <i>published</i> value of ParameterValueSet that is referenced through <i>subscribedValueSet</i>. In other words, it is the value as set by the owner (DomainOfExpertise) of the subscribed Parameter or  ParameterOverride.
     *
     * @throws IllegalStateException The computed property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    
    public void setComputed(ValueArray<String> computed){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.computed");
    }

    /**
     * Sets a list of ordered String.
     * manually assigned parameter subscription value
     * Note: The <i>manual</i> value is typically used in the beginning of the modelling process, when meaningful computed values are not yet available from the associated Parameters or ParameterOverrides. By assigning a manual value and setting the <i>valueSwitch</i> to MANUAL, computations can be started with the actual value of ParameterSubscriptions.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     public void setManual(ValueArray<String> manual){
        this.manual = manual;
    }

    /**
     * Sets the owner.
     * owner (DomainOfExpertise) derived from the containing ParameterSubscription
     *
     * @throws IllegalStateException The owner property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setOwner(DomainOfExpertise owner){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.owner");
    }

    /**
     * Sets a list of ordered String.
     * reference parameter value that is derived to be identical to the <i>reference</i> property of the <i>subscribedValueSet</i>
     * Note: The reference value is typically a value originating from outside the current EngineeringModel to be used as a reference to be compared with the (newly) computed value. However the reference values may be used for any purpose that a modelling activity deems useful.
     *
     * @throws IllegalStateException The reference property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    
    public void setReference(ValueArray<String> reference){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.reference");
    }

    /**
     * Sets the subscribedValueSet.
     * reference to the ParameterValue or ParameterOverrideValue that this ParameterSubscriptionValue is subscribing to
     * Note: The Parameter associated with the referenced ParameterValue must be the same as the Parameter containing the ParameterSubscription that contains this ParameterSubscriptionValue. Alternatively, the ParameterOverride associated with the referenced ParameterOverrideValue must be the same as the ParameterOverride containing the ParameterSubscription that contains this ParameterSubscriptionValue.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setSubscribedValueSet(ParameterValueSetBase subscribedValueSet){
        this.subscribedValueSet = subscribedValueSet;
    }

    /**
     * Sets the valueSwitch.
     * switch that determines which value is actually used
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setValueSwitch(ParameterSwitchKind valueSwitch){
        this.valueSwitch = valueSwitch;
    }

    /**
     * Creates and returns a copy of this <code>ParameterSubscriptionValueSet<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParameterSubscriptionValueSet<code/>.
     *
     * @see ParameterSubscriptionValueSet
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ParameterSubscriptionValueSet clone = (ParameterSubscriptionValueSet)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setManual(new ValueArray<String>(this.manual, this));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>ParameterSubscriptionValueSet<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParameterSubscriptionValueSet<code/>.
     * 
     * @see ParameterSubscriptionValueSet
     */
    @Override
    public ParameterSubscriptionValueSet clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterSubscriptionValueSet)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ParameterSubscriptionValueSet<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ParameterSubscriptionValueSet
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int manualCount = this.manual.size();
        if (manualCount < 1) {
            errorList.add("The number of elements in the property manual is wrong. It should be at least 1.");
        }

        if (this.subscribedValueSet == null || this.subscribedValueSet.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property subscribedValueSet is null.");
            this.subscribedValueSet = SentinelThingProvider.getSentinel<ParameterValueSetBase>();
            this.sentinelResetMap["subscribedValueSet"] = () -> this.subscribedValueSet = null;
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ParameterSubscriptionValueSet<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ParameterSubscriptionValueSet
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParameterSubscriptionValueSet dto = (cdp4common.dto.ParameterSubscriptionValueSet)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.manual = new ValueArray<String>(dto.getManual(), this);
        this.modifiedOn = dto.getModifiedOn();
        this.revisionNumber = dto.getRevisionNumber();
        this.subscribedValueSet = this.cache.get<ParameterValueSetBase>(dto.getSubscribedValueSet(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<ParameterValueSetBase>();
        this.valueSwitch = dto.getValueSwitch();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ParameterSubscriptionValueSet<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ParameterSubscriptionValueSet
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ParameterSubscriptionValueSet dto = new cdp4common.dto.ParameterSubscriptionValueSet(this.iid, this.revisionNumber);

        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setManual(new ValueArray<String>(this.manual, this));
        dto.setModifiedOn(this.modifiedOn);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setSubscribedValueSet(this.subscribedValueSet != null ? this.subscribedValueSet.getIid() : new UUID(0L, 0L));
        dto.setValueSwitch(this.valueSwitch);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
