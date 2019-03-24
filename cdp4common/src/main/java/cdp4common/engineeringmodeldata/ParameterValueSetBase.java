/* --------------------------------------------------------------------------------------------------------------------
 * ParameterValueSetBase.java
 * Copyright (c) 2019 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

import cdp4common.AggregationKind;
import cdp4common.ChangeKind;
import cdp4common.UmlInformation;
import cdp4common.commondata.ParticipantAccessRightKind;
import cdp4common.commondata.PersonAccessRightKind;
import cdp4common.commondata.Thing;
import cdp4common.exceptions.ContainmentException;
import cdp4common.helpers.ValueArrayUtils;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.ParameterType;
import cdp4common.types.CacheKey;
import cdp4common.types.ValueArray;
import com.google.common.cache.Cache;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * abstract superclass representing the switch setting and values of a Parameter or ParameterOverride and serves as a common reference type for ParameterValueSet and ParameterOverrideValueSet
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class ParameterValueSetBase extends Thing implements Cloneable, OwnedThing, ValueSet {
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
        this.computed = new ValueArray<String>(this, String.class);
        this.formula = new ValueArray<String>(this, String.class);
        this.manual = new ValueArray<String>(this, String.class);
        this.published = new ValueArray<String>(this, String.class);
        this.reference = new ValueArray<String>(this, String.class);
    }

    /**
     * Initializes a new instance of the {@link ParameterValueSetBase} class.
     *
     * @param iid     The unique identifier.
     * @param cache   The {@link Cache} where the current thing is stored.
     *                The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     *                The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected ParameterValueSetBase(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.computed = new ValueArray<String>(this, String.class);
        this.formula = new ValueArray<String>(this, String.class);
        this.manual = new ValueArray<String>(this, String.class);
        this.published = new ValueArray<String>(this, String.class);
        this.reference = new ValueArray<String>(this, String.class);
    }

    /**
     * Property actualOption.
     * reference to the actual Option to which this ParameterValueSetBase pertains
     * Note: This reference shall only be assigned for Parameters that have <i>isOptionDependent</i> set to true. Otherwise it shall be null.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Option actualOption;

    /**
     * Property actualState.
     * reference to the ActualFiniteState to which this ParameterValueSet pertains
     * Note: This reference shall only be assigned for Parameters and ParameterOverrides that have a <i>stateDependence</i> to an ActualFiniteStateList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
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
    @Getter
    @Setter
    private ValueArray<String> computed;

    /**
     * List of ordered String.
     * formula assigned by the owner (DomainOfExpertise) of the associated Parameter or ParameterOverride
     * Note: The formula is needed to define a link into an external application (typically MS Excel) to retrieve the computed parameter value.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ValueArray<String> formula;

    /**
     * List of ordered String.
     * manually assigned parameter value
     * Note: The <i>manual</i> value is typically used in the beginning of the modelling process, when computed and published values are not yet available, in order to enable starting computations with ParameterSubscriptions.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
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
    @Getter
    @Setter
    private ValueArray<String> published;

    /**
     * List of ordered String.
     * reference parameter value
     * Note: The reference value is typically a value originating from outside the current EngineeringModel to be used as a reference to be compared with the (newly) computed value. However the reference values may be used for any purpose that is deemed useful by the users of the EngineeringModel.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ValueArray<String> reference;

    /**
     * Property valueSwitch.
     * switch that determines which value is actually used
     * Note: See ParameterSwitchKind for the description of the different possibilities.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ParameterSwitchKind valueSwitch;

    /**
     * Gets a list of ordered String.
     * derived actual value depending on the <i>valueSwitch</i> setting
     * Note: The <i>actualValue</i> is derived in the following way:
     * if <i>valueSwitch</i> is COMPUTED then <i>actualValue</i> is <i>computed;</i>
     * if <i>valueSwitch</i> is MANUAL, then <i>actualValue</i> is <i>manual;</i>
     * if <i>valueSwitch</i> is REFERENCE, then <i>actualValue</i> is <i>reference</i>.
     */
    public ValueArray<String> getActualValue() {
        return this.getDerivedActualValue();
    }

    /**
     * Gets the owner.
     * owner (DomainOfExpertise) derived from associated Parameter or ParameterOverride for convenience
     */
    public DomainOfExpertise getOwner() {
        return this.getDerivedOwner();
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
     * @see IllegalStateException
     */
    public void setActualValue(ValueArray<String> actualValue) {
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterValueSetBase.actualValue");
    }

    /**
     * Sets the owner.
     * owner (DomainOfExpertise) derived from associated Parameter or ParameterOverride for convenience
     *
     * @throws IllegalStateException The owner property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     * @see IllegalStateException
     */
    public void setOwner(DomainOfExpertise owner) {
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterValueSetBase.owner");
    }

    /**
     * Creates and returns a copy of this {@link ParameterValueSetBase} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     * @return A cloned instance of {@link ParameterValueSetBase}.
     */
    @Override
    public ParameterValueSetBase clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterValueSetBase) this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ParameterValueSetBase}.
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

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Returns the derived {@link #actualValue} value
     *
     * @return The {@link #actualValue} value
     */
    private ValueArray<String> getDerivedActualValue() {
        switch (this.getValueSwitch()) {
            case COMPUTED:
                return this.getComputed();

            case MANUAL:
                return this.getManual();

            case REFERENCE:
                return this.getReference();

            default:
                throw new IllegalStateException(String.format("Unknown ParameterKindSwitch: %s", this.getValueSwitch()));
        }
    }

    /**
     * Returns the derived {@link #owner} value
     *
     * @return The {@link #owner} value
     */
    private DomainOfExpertise getDerivedOwner() {
        Parameter parameter = this.getContainer() instanceof Parameter ? (Parameter) this.getContainer() : null;
        if (parameter != null) {
            return parameter.getOwner();
        }

        ParameterOverride parameterOverride = this.getContainer() instanceof ParameterOverride ? (ParameterOverride) this.getContainer() : null;
        if (parameterOverride != null) {
            return parameterOverride.getOwner();
        }

        throw new ContainmentException("The Container of ParameterValueSetBase is not the right type or is null");
    }

    /**
     * Validate this {@link ParameterValueSetBase} with custom rules
     *
     * @return A list of error messages
     */
    @Override
    protected List<String> validatePojoProperties() {
        List<String> errorList = new ArrayList<>(super.validatePojoProperties());

        ParameterOrOverrideBase container = this.getContainer() instanceof Parameter ? (ParameterOrOverrideBase) this.getContainer() : null;
        if (container == null || container.getParameterType() == null) {
            return errorList;
        }

        int numberOfComponent = container.getParameterType().getNumberOfValues();
        if (this.getManual().size() != numberOfComponent) {
            errorList.add(String.format("Wrong number of values in the Manual set for the option: %s, state: %s", (this.getActualOption() == null) ? "-" : this.getActualOption().getName(), (this.getActualState() == null) ? "-" : this.getActualState().getName()));
        }

        if (this.getComputed().size() != numberOfComponent) {
            errorList.add(String.format("Wrong number of values in the Computed set for the option: %s, state: %s", (this.getActualOption() == null) ? "-" : this.getActualOption().getName(), (this.getActualState() == null) ? "-" : this.getActualState().getName()));
        }

        if (this.getReference().size() != numberOfComponent) {
            errorList.add(String.format("Wrong number of values in the Reference set for the option: %s, state: %s", (this.getActualOption() == null) ? "-" : this.getActualOption().getName(), (this.getActualState() == null) ? "-" : this.getActualState().getName()));
        }

        if (this.getPublished().size() != numberOfComponent) {
            errorList.add(String.format("Wrong number of values in the Published set for the option: %s, state: %s", (this.getActualOption() == null) ? "-" : this.getActualOption().getName(), (this.getActualState() == null) ? "-" : this.getActualState().getName()));
        }

        return errorList;
    }

    /**
     * The size of the {@link ValueArray} that is determined by the numberOfValues of the referenced {@link ParameterType}
     */
    private int valueArraySize = 0;

    /**
     * Queries the {@link ParameterType} of the container {@link Parameter} or {@link ParameterOverride}
     */
    public abstract ParameterType queryParameterType();

    /**
     * Resets the {@link ValueArray{T}} of the {@link #getManual()} to proper amount of slots and default value of "-"
     */
    public void resetManual() {
        if (this.valueArraySize == 0) {
            var parameterType = this.queryParameterType();
            this.valueArraySize = parameterType.getNumberOfValues();
        }

        this.setManual(ValueArrayUtils.createDefaultValueArray(this.valueArraySize));
    }

    /**
     * Resets the {@link ValueArray{T}} of the {@link #getComputed()} to proper amount of slots and default value of "-"
     */
    public void resetComputed() {
        if (this.valueArraySize == 0) {
            var parameterType = this.queryParameterType();
            this.valueArraySize = parameterType.getNumberOfValues();
        }

        this.setComputed(ValueArrayUtils.createDefaultValueArray(this.valueArraySize));
    }

    /**
     * Resets the {@link ValueArray{T}} of the {@link #getReference()} to proper amount of slots and default value of "-"
     */
    public void resetReference() {
        if (this.valueArraySize == 0) {
            var parameterType = this.queryParameterType();
            this.valueArraySize = parameterType.getNumberOfValues();
        }

        this.setReference(ValueArrayUtils.createDefaultValueArray(this.valueArraySize));
    }

    /**
     * Resets the {@link ValueArray{T}} of the {@link #getFormula()} to proper amount of slots and default value of "-"
     */
    public void resetFormula() {
        if (this.valueArraySize == 0) {
            var parameterType = this.queryParameterType();
            this.valueArraySize = parameterType.getNumberOfValues();
        }

        this.setFormula(ValueArrayUtils.createDefaultValueArray(this.valueArraySize));
    }

    /**
     * Queries the model code of the current {@link ParameterValueSetBase}
     * The model code is derived as follows:
     * #ElementDefinition.ShortName#.#ParameterType.ShortName#.#Component.ParameterType.ShortName#\#Option.ShortName#\#ActualState.ShortName#
     *
     * @param componentIndex The component Index.
     * @return A string that represents the model code of the current {@link ParameterValueSetBase}
     */
    public abstract String modelCode(Integer componentIndex);
}
