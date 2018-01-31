/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParameterValueSetBase.java
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
 * abstract superclass representing the switch setting and values of a Parameter or ParameterOverride and serves as a common reference type for ParameterValueSet and ParameterOverrideValueSet
 */
@ToString
@EqualsAndHashCode
public  abstract class ParameterValueSetBase extends Thing implements Cloneable, OwnedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the {@link ParameterValueSetBase} class.
     */
    protected ParameterValueSetBase() {
        this.computed = new ValueArray<String>(this);
        this.formula = new ValueArray<String>(this);
        this.manual = new ValueArray<String>(this);
        this.published = new ValueArray<String>(this);
        this.reference = new ValueArray<String>(this);
    }

    /**
     * Initializes a new instance of the {@link ParameterValueSetBase} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected ParameterValueSetBase(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.computed = new ValueArray<String>(this);
        this.formula = new ValueArray<String>(this);
        this.manual = new ValueArray<String>(this);
        this.published = new ValueArray<String>(this);
        this.reference = new ValueArray<String>(this);
    }

    /**
     * Property actualOption.
     * reference to the actual Option to which this ParameterValueSetBase pertains
     * Note: This reference shall only be assigned for Parameters that have <i>isOptionDependent</i> set to true. Otherwise it shall be null.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Option actualOption;

    /**
     * Property actualState.
     * reference to the ActualFiniteState to which this ParameterValueSet pertains
     * Note: This reference shall only be assigned for Parameters and ParameterOverrides that have a <i>stateDependence</i> to an ActualFiniteStateList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ActualFiniteState actualState;

    /**
     * List of ordered String.
     * derived actual value depending on the <i>valueSwitch</i> setting
     * Note: The <i>actualValue</i> is derived in the following way:
     * if <i>valueSwitch</i> is COMPUTED then <i>actualValue</i> is <i>computed;</i>
     * if <i>valueSwitch</i> is MANUAL, then <i>actualValue</i> is <i>manual;</i>
     * if <i>valueSwitch</i> is REFERENCE, then <i>actualValue</i> is <i>reference</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    private ValueArray<String> actualValue;
 
    /**
     * List of ordered String.
     * computed parameter value
     * Note: This is value of the associated Parameter as computed by the parameter's owner (DomainOfExpertise).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private ValueArray<String> computed;

    /**
     * List of ordered String.
     * formula assigned by the owner (DomainOfExpertise) of the associated Parameter or ParameterOverride
     * Note: The formula is needed to define a link into an external application (typically MS Excel) to retrieve the computed parameter value.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private ValueArray<String> formula;

    /**
     * List of ordered String.
     * manually assigned parameter value
     * Note: The <i>manual</i> value is typically used in the beginning of the modelling process, when computed and published values are not yet available, in order to enable starting computations with ParameterSubscriptions.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private ValueArray<String> manual;

    /**
     * Property owner.
     * owner (DomainOfExpertise) derived from associated Parameter or ParameterOverride for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private DomainOfExpertise owner;
 
    /**
     * List of ordered String.
     * last published parameter value
     * Note: At the time of Publication the <i>actualValue</i> (i.e. depending on the actual setting of the <i>valueSwitch</i> at Publication time) is copied to this <i>published</i> value. Subsequently the <i>published</i> value of this ParameterValueSet is the value that will appear in the derived <i>computed</i> value of ParameterSubscriptionValueSets that reference this ParameterValueSet.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private ValueArray<String> published;

    /**
     * List of ordered String.
     * reference parameter value
     * Note: The reference value is typically a value originating from outside the current EngineeringModel to be used as a reference to be compared with the (newly) computed value. However the reference values may be used for any purpose that is deemed useful by the users of the EngineeringModel.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private ValueArray<String> reference;

    /**
     * Property valueSwitch.
     * switch that determines which value is actually used
     * Note: See ParameterSwitchKind for the description of the different possibilities.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ParameterSwitchKind valueSwitch;

    /**
     * Gets the actualOption.
     * reference to the actual Option to which this ParameterValueSetBase pertains
     * Note: This reference shall only be assigned for Parameters that have <i>isOptionDependent</i> set to true. Otherwise it shall be null.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Option getActualOption(){
         return this.actualOption;
    }

    /**
     * Gets the actualState.
     * reference to the ActualFiniteState to which this ParameterValueSet pertains
     * Note: This reference shall only be assigned for Parameters and ParameterOverrides that have a <i>stateDependence</i> to an ActualFiniteStateList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ActualFiniteState getActualState(){
         return this.actualState;
    }

    /**
     * Gets a list of ordered String.
     * derived actual value depending on the <i>valueSwitch</i> setting
     * Note: The <i>actualValue</i> is derived in the following way:
     * if <i>valueSwitch</i> is COMPUTED then <i>actualValue</i> is <i>computed;</i>
     * if <i>valueSwitch</i> is MANUAL, then <i>actualValue</i> is <i>manual;</i>
     * if <i>valueSwitch</i> is REFERENCE, then <i>actualValue</i> is <i>reference</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    
    public ValueArray<String> getActualValue(){
        return this.GetDerivedActualValue();
    }

    /**
     * Gets a list of ordered String.
     * computed parameter value
     * Note: This is value of the associated Parameter as computed by the parameter's owner (DomainOfExpertise).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public ValueArray<String> getComputed(){
         return this.computed;
    }

    /**
     * Gets a list of ordered String.
     * formula assigned by the owner (DomainOfExpertise) of the associated Parameter or ParameterOverride
     * Note: The formula is needed to define a link into an external application (typically MS Excel) to retrieve the computed parameter value.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public ValueArray<String> getFormula(){
         return this.formula;
    }

    /**
     * Gets a list of ordered String.
     * manually assigned parameter value
     * Note: The <i>manual</i> value is typically used in the beginning of the modelling process, when computed and published values are not yet available, in order to enable starting computations with ParameterSubscriptions.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public ValueArray<String> getManual(){
         return this.manual;
    }

    /**
     * Gets the owner.
     * owner (DomainOfExpertise) derived from associated Parameter or ParameterOverride for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public DomainOfExpertise getOwner(){
        return this.GetDerivedOwner();
    }

    /**
     * Gets a list of ordered String.
     * last published parameter value
     * Note: At the time of Publication the <i>actualValue</i> (i.e. depending on the actual setting of the <i>valueSwitch</i> at Publication time) is copied to this <i>published</i> value. Subsequently the <i>published</i> value of this ParameterValueSet is the value that will appear in the derived <i>computed</i> value of ParameterSubscriptionValueSets that reference this ParameterValueSet.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public ValueArray<String> getPublished(){
         return this.published;
    }

    /**
     * Gets a list of ordered String.
     * reference parameter value
     * Note: The reference value is typically a value originating from outside the current EngineeringModel to be used as a reference to be compared with the (newly) computed value. However the reference values may be used for any purpose that is deemed useful by the users of the EngineeringModel.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public ValueArray<String> getReference(){
         return this.reference;
    }

    /**
     * Gets the valueSwitch.
     * switch that determines which value is actually used
     * Note: See ParameterSwitchKind for the description of the different possibilities.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ParameterSwitchKind getValueSwitch(){
         return this.valueSwitch;
    }

    /**
     * Sets the actualOption.
     * reference to the actual Option to which this ParameterValueSetBase pertains
     * Note: This reference shall only be assigned for Parameters that have <i>isOptionDependent</i> set to true. Otherwise it shall be null.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setActualOption(Option actualOption){
        this.actualOption = actualOption;
    }

    /**
     * Sets the actualState.
     * reference to the ActualFiniteState to which this ParameterValueSet pertains
     * Note: This reference shall only be assigned for Parameters and ParameterOverrides that have a <i>stateDependence</i> to an ActualFiniteStateList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setActualState(ActualFiniteState actualState){
        this.actualState = actualState;
    }

    /**
     * Sets a list of ordered String.
     * derived actual value depending on the <i>valueSwitch</i> setting
     * Note: The <i>actualValue</i> is derived in the following way:
     * if <i>valueSwitch</i> is COMPUTED then <i>actualValue</i> is <i>computed;</i>
     * if <i>valueSwitch</i> is MANUAL, then <i>actualValue</i> is <i>manual;</i>
     * if <i>valueSwitch</i> is REFERENCE, then <i>actualValue</i> is <i>reference</i>.
     *
     * @throws IllegalStateException The actualValue property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    
    public void setActualValue(ValueArray<String> actualValue){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterValueSetBase.actualValue");
    }

    /**
     * Sets a list of ordered String.
     * computed parameter value
     * Note: This is value of the associated Parameter as computed by the parameter's owner (DomainOfExpertise).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     public void setComputed(ValueArray<String> computed){
        this.computed = computed;
    }

    /**
     * Sets a list of ordered String.
     * formula assigned by the owner (DomainOfExpertise) of the associated Parameter or ParameterOverride
     * Note: The formula is needed to define a link into an external application (typically MS Excel) to retrieve the computed parameter value.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     public void setFormula(ValueArray<String> formula){
        this.formula = formula;
    }

    /**
     * Sets a list of ordered String.
     * manually assigned parameter value
     * Note: The <i>manual</i> value is typically used in the beginning of the modelling process, when computed and published values are not yet available, in order to enable starting computations with ParameterSubscriptions.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     public void setManual(ValueArray<String> manual){
        this.manual = manual;
    }

    /**
     * Sets the owner.
     * owner (DomainOfExpertise) derived from associated Parameter or ParameterOverride for convenience
     *
     * @throws IllegalStateException The owner property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setOwner(DomainOfExpertise owner){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterValueSetBase.owner");
    }

    /**
     * Sets a list of ordered String.
     * last published parameter value
     * Note: At the time of Publication the <i>actualValue</i> (i.e. depending on the actual setting of the <i>valueSwitch</i> at Publication time) is copied to this <i>published</i> value. Subsequently the <i>published</i> value of this ParameterValueSet is the value that will appear in the derived <i>computed</i> value of ParameterSubscriptionValueSets that reference this ParameterValueSet.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     public void setPublished(ValueArray<String> published){
        this.published = published;
    }

    /**
     * Sets a list of ordered String.
     * reference parameter value
     * Note: The reference value is typically a value originating from outside the current EngineeringModel to be used as a reference to be compared with the (newly) computed value. However the reference values may be used for any purpose that is deemed useful by the users of the EngineeringModel.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     public void setReference(ValueArray<String> reference){
        this.reference = reference;
    }

    /**
     * Sets the valueSwitch.
     * switch that determines which value is actually used
     * Note: See ParameterSwitchKind for the description of the different possibilities.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setValueSwitch(ParameterSwitchKind valueSwitch){
        this.valueSwitch = valueSwitch;
    }

    /**
     * Creates and returns a copy of this {@link ParameterValueSetBase} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterValueSetBase}.
     */
    @Override
    public ParameterValueSetBase clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterValueSetBase)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ParameterValueSetBase}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int computedCount = this.getComputed().size();
        if (computedCount < 1) {
            errorList.add("The number of elements in the property computed is wrong. It should be at least 1.");
        }

        int formulaCount = this.getFormula().size();
        if (formulaCount < 1) {
            errorList.add("The number of elements in the property formula is wrong. It should be at least 1.");
        }

        int manualCount = this.getManual().size();
        if (manualCount < 1) {
            errorList.add("The number of elements in the property manual is wrong. It should be at least 1.");
        }

        int publishedCount = this.getPublished().size();
        if (publishedCount < 1) {
            errorList.add("The number of elements in the property published is wrong. It should be at least 1.");
        }

        int referenceCount = this.getReference().size();
        if (referenceCount < 1) {
            errorList.add("The number of elements in the property reference is wrong. It should be at least 1.");
        }

        return errorList;
    }
}
