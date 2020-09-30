/* --------------------------------------------------------------------------------------------------------------------
 * ParameterSubscriptionValueSet.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

import cdp4common.AggregationKind;
import cdp4common.ChangeKind;
import cdp4common.Container;
import cdp4common.ModelCode;
import cdp4common.SentinelThingProvider;
import cdp4common.UmlInformation;
import cdp4common.commondata.ParticipantAccessRightKind;
import cdp4common.commondata.PersonAccessRightKind;
import cdp4common.commondata.Thing;
import cdp4common.exceptions.ContainmentException;
import cdp4common.helpers.ActionImpl;
import cdp4common.helpers.PojoThingFactory;
import cdp4common.helpers.ValueArrayUtils;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.ParameterType;
import cdp4common.sitedirectorydata.Person;
import cdp4common.types.CacheKey;
import cdp4common.types.ValueArray;
import com.google.common.cache.Cache;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.ObjectUtils;

/**
 * representation of the switch setting and all values of a ParameterSubscription
 */
@Container(clazz = ParameterSubscription.class, propertyName = "valueSet")
@ToString
public class ParameterSubscriptionValueSet extends Thing implements Cloneable, OwnedThing, ValueSet, ModelCode {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the {@link ParameterSubscriptionValueSet} class.
     */
    public ParameterSubscriptionValueSet() {
        this.manual = new ValueArray<String>(this, String.class);
    }

    /**
     * Initializes a new instance of the {@link ParameterSubscriptionValueSet} class.
     *
     * @param iid     The unique identifier.
     * @param cache   The {@link Cache} where the current thing is stored.
     *                The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     *                The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ParameterSubscriptionValueSet(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.manual = new ValueArray<String>(this, String.class);
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
    @Getter
    @Setter
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
    @Getter
    @Setter
    private ParameterValueSetBase subscribedValueSet;

    /**
     * Property valueSwitch.
     * switch that determines which value is actually used
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ParameterSwitchKind valueSwitch;

    /**
     * Gets the actualOption.
     * convenience property that derives the <i>actualOption</i> from the <i>subscribedValueSet</i>
     */
    public Option getActualOption() {
        return this.getDerivedActualOption();
    }

    /**
     * Gets the actualState.
     * convenience property that derives the <i>actualState</i> from the <i>subscribedValueSet</i>
     */
    public ActualFiniteState getActualState() {
        return this.getDerivedActualState();
    }

    /**
     * Gets a list of ordered String.
     * derived actual value of this ParameterSubscriptionValueSet depending on the <i>valueSwitch</i> setting
     * Note: The <i>actualValue</i> is derived in the following (obvious) way:
     */
    public ValueArray<String> getActualValue() {
        return this.getDerivedActualValue();
    }

    /**
     * Gets a list of ordered String.
     * parameter value derived from the subscribed Parameter or ParameterOverride
     * Note: This value is derived from the <i>published</i> value of ParameterValueSet that is referenced through <i>subscribedValueSet</i>. In other words, it is the value as set by the owner (DomainOfExpertise) of the subscribed Parameter or  ParameterOverride.
     */
    public ValueArray<String> getComputed() {
        return this.getDerivedComputed();
    }

    /**
     * Gets the owner.
     * owner (DomainOfExpertise) derived from the containing ParameterSubscription
     */
    public DomainOfExpertise getOwner() {
        return this.getDerivedOwner();
    }

    /**
     * Gets a list of ordered String.
     * reference parameter value that is derived to be identical to the <i>reference</i> property of the <i>subscribedValueSet</i>
     * Note: The reference value is typically a value originating from outside the current EngineeringModel to be used as a reference to be compared with the (newly) computed value. However the reference values may be used for any purpose that a modelling activity deems useful.
     */
    public ValueArray<String> getReference() {
        return this.getDerivedReference();
    }

    /**
     * Sets the actualOption.
     * convenience property that derives the <i>actualOption</i> from the <i>subscribedValueSet</i>
     *
     * @throws IllegalStateException The actualOption property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     * @see IllegalStateException
     */
    public void setActualOption(Option actualOption) {
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.actualOption");
    }

    /**
     * Sets the actualState.
     * convenience property that derives the <i>actualState</i> from the <i>subscribedValueSet</i>
     *
     * @throws IllegalStateException The actualState property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     * @see IllegalStateException
     */
    public void setActualState(ActualFiniteState actualState) {
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.actualState");
    }

    /**
     * Sets a list of ordered String.
     * derived actual value of this ParameterSubscriptionValueSet depending on the <i>valueSwitch</i> setting
     * Note: The <i>actualValue</i> is derived in the following (obvious) way:
     *
     * @throws IllegalStateException The actualValue property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     * @see IllegalStateException
     */
    public void setActualValue(ValueArray<String> actualValue) {
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.actualValue");
    }

    /**
     * Sets a list of ordered String.
     * parameter value derived from the subscribed Parameter or ParameterOverride
     * Note: This value is derived from the <i>published</i> value of ParameterValueSet that is referenced through <i>subscribedValueSet</i>. In other words, it is the value as set by the owner (DomainOfExpertise) of the subscribed Parameter or  ParameterOverride.
     *
     * @throws IllegalStateException The computed property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     * @see IllegalStateException
     */
    public void setComputed(ValueArray<String> computed) {
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.computed");
    }

    /**
     * Sets the owner.
     * owner (DomainOfExpertise) derived from the containing ParameterSubscription
     *
     * @throws IllegalStateException The owner property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     * @see IllegalStateException
     */
    public void setOwner(DomainOfExpertise owner) {
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.owner");
    }

    /**
     * Sets a list of ordered String.
     * reference parameter value that is derived to be identical to the <i>reference</i> property of the <i>subscribedValueSet</i>
     * Note: The reference value is typically a value originating from outside the current EngineeringModel to be used as a reference to be compared with the (newly) computed value. However the reference values may be used for any purpose that a modelling activity deems useful.
     *
     * @throws IllegalStateException The reference property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     * @see IllegalStateException
     */
    public void setReference(ValueArray<String> reference) {
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.reference");
    }

    /**
     * Creates and returns a copy of this {@link ParameterSubscriptionValueSet} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     * @return A cloned instance of {@link ParameterSubscriptionValueSet}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ParameterSubscriptionValueSet clone;
        try {
            clone = (ParameterSubscriptionValueSet) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ParameterSubscriptionValueSet cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setManual(new ValueArray<String>(this.getManual(), this, String.class));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ParameterSubscriptionValueSet} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     * @return A cloned instance of {@link ParameterSubscriptionValueSet}.
     */
    @Override
    public ParameterSubscriptionValueSet clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterSubscriptionValueSet) this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ParameterSubscriptionValueSet}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int manualCount = this.getManual().size();
        if (manualCount < 1) {
            errorList.add("The number of elements in the property manual is wrong. It should be at least 1.");
        }

        if (this.getSubscribedValueSet() == null || this.getSubscribedValueSet().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property subscribedValueSet is null.");
            this.setSubscribedValueSet(SentinelThingProvider.getSentinel(ParameterValueSetBase.class));
            this.sentinelResetMap.put("subscribedValueSet", new ActionImpl(() -> this.setSubscribedValueSet(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ParameterSubscriptionValueSet} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParameterSubscriptionValueSet dto = (cdp4common.dto.ParameterSubscriptionValueSet) dtoThing;

        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setManual(new ValueArray<String>(dto.getManual(), this, String.class));
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setSubscribedValueSet(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getSubscribedValueSet(), dto.getIterationContainerId(), ParameterValueSetBase.class), SentinelThingProvider.getSentinel(ParameterValueSetBase.class)));
        this.setValueSwitch(dto.getValueSwitch());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ParameterSubscriptionValueSet}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ParameterSubscriptionValueSet dto = new cdp4common.dto.ParameterSubscriptionValueSet(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setManual(new ValueArray<String>(this.getManual(), this, String.class));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setSubscribedValueSet(this.getSubscribedValueSet() != null ? this.getSubscribedValueSet().getIid() : new UUID(0L, 0L));
        dto.setValueSwitch(this.getValueSwitch());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Returns the derived {@link #computed} value
     *
     * @return The {@link #computed} value
     */
    private ValueArray<String> getDerivedComputed() {
        return this.getSubscribedValueSet().getPublished();
    }

    /**
     * Returns the derived {@link #reference} value
     *
     * @return The {@link #reference} value
     */
    private ValueArray<String> getDerivedReference() {
        return this.getSubscribedValueSet().getReference();
    }

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
                throw new IllegalStateException("Unknown ParameterKindSwitch");
        }
    }

    /**
     * Returns the derived {@link #actualState} value
     *
     * @return The {@link #actualState} value
     */
    private ActualFiniteState getDerivedActualState() {
        return this.getSubscribedValueSet().getActualState();
    }

    /**
     * Returns the derived {@link #actualOption} value
     *
     * @return The {@link #actualOption} value
     */
    private Option getDerivedActualOption() {
        return this.getSubscribedValueSet().getActualOption();
    }

    /**
     * Returns the derived {@link #owner} value
     *
     * @return The {@link #owner} value
     */
    private DomainOfExpertise getDerivedOwner() {
        ParameterSubscription container = this.getContainer() instanceof ParameterSubscription ? (ParameterSubscription) this.getContainer() : null;
        if (container == null) {
            throw new ContainmentException("The container of ParameterSubscriptionValueSet is null");
        }

        return container.getOwner();
    }

    /**
     * Computes the model code of the current {@link ParameterSubscriptionValueSet}
     * <p>
     * The model code is derived as follows:
     * {@code #ElementDefinition.ShortName#.#ParameterType.ShortName#.#Component.ParameterType.ShortName#\#Option.ShortName#\#ActualState.ShortName#}
     *
     * @param componentIndex The component Index.
     * @return A string that represents the model code of the current {@link Parameter}
     */
    public String modelCode(Integer componentIndex) {
        ParameterValueSet parameterValueSet = this.getSubscribedValueSet() instanceof ParameterValueSet ? (ParameterValueSet) this.getSubscribedValueSet() : null;

        if (parameterValueSet != null) {
            return parameterValueSet.modelCode(componentIndex);
        }

        ParameterOverrideValueSet parameterOverrideValueSet = this.getSubscribedValueSet() instanceof ParameterOverrideValueSet ? (ParameterOverrideValueSet) this.getSubscribedValueSet() : null;
        if (parameterOverrideValueSet != null) {
            return parameterOverrideValueSet.modelCode(componentIndex);
        }

        throw new NullPointerException("The SubscribedValueSet is null");
    }

    /**
     * Validate this {@link ParameterSubscriptionValueSet} with custom rules
     *
     * @return A list of error messages
     */
    @Override
    protected List<String> validatePojoProperties() {
        List<String> errorList = new ArrayList<>(super.validatePojoProperties());

        ParameterSubscription container = this.getContainer() instanceof ParameterSubscription ? (ParameterSubscription) this.getContainer() : null;
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

        return errorList;
    }

    /**
     * Gets the formula assigned by the owner {@link DomainOfExpertise} of the associated {@link Parameter} or {@link ParameterOverride}
     * <p>
     * Member of the {@link ValueSet} interface added for convenience which will always return a {@link ValueArray} where all the components are null
     */
    public ValueArray<String> getFormula() {
        ParameterSubscription parameterSubscription = (ParameterSubscription) this.getContainer();
        List<String> valueArray = new ArrayList<>(parameterSubscription.getParameterType().getNumberOfValues());
        return new ValueArray<>(valueArray, this, String.class);
    }

    /**
     * the size of the {@link ValueArray} that is determined by the numberOfValues of the referenced {@link ParameterType}
     */
    private int valueArraySize = 0;

    /**
     * Queries the {@link ParameterType} of the container {@link Parameter}
     */
    public ParameterType queryParameterType() {
        ParameterSubscription parameterSubscription = (ParameterSubscription) this.getContainer();

        if (parameterSubscription == null) {
            throw new ContainmentException(String.format("The container ParameterSubscription of ParameterSubscriptionValueSet with iid %s is null, the ParameterTye cannot be queried.", this.getIid()));
        }

        return parameterSubscription.getParameterType();
    }

    /**
     * Resets the {@link ValueArray} of the {@link #getManual()} to proper amount of slots and default value of "-"
     */
    @Override
    public void resetManual() {
        if (this.valueArraySize == 0) {
            ParameterType parameterType = this.queryParameterType();
            this.valueArraySize = parameterType.getNumberOfValues();
        }

        this.setManual(ValueArrayUtils.createDefaultValueArray(this.valueArraySize));
    }

    /**
     * Resets the {@link ValueArray} of the {@link #getComputed()} to proper amount of slots and default value of "-"
     */
    @Override
    public void resetComputed() {
        throw new UnsupportedOperationException("The ResetComputed operation may not be called on a ParameterSubscriptionValueSet");
    }

    /**
     * Resets the {@link ValueArray} of the {@link #getReference()} to proper amount of slots and default value of "-"
     */
    @Override
    public void resetReference() {
        throw new UnsupportedOperationException("The ResetReference operation may not be called on a ParameterSubscriptionValueSet");
    }

    /**
     * Resets the {@link ValueArray} of the {@link #getFormula()} to proper amount of slots and default value of "-"
     */
    @Override
    public void resetFormula() {
        throw new UnsupportedOperationException("The ResetFormula operation may not be called on a ParameterSubscriptionValueSet");
    }
}
