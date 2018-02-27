/* --------------------------------------------------------------------------------------------------------------------
 * ParameterSubscriptionValueSet.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.exceptions.ContainmentException;
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
 * representation of the switch setting and all values of a ParameterSubscription
 */
@Container(clazz = ParameterSubscription.class, propertyName = "valueSet")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ParameterSubscriptionValueSet extends Thing implements Cloneable, OwnedThing {
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
        this.manual = new ValueArray<String>(this, false);
    }

    /**
     * Initializes a new instance of the {@link ParameterSubscriptionValueSet} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ParameterSubscriptionValueSet(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.manual = new ValueArray<String>(this, false);
    }

    /**
     * Property actualOption.
     * convenience property that derives the <i>actualOption</i> from the <i>subscribedValueSet</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Getter
    private Option actualOption;

    /**
     * Property actualState.
     * convenience property that derives the <i>actualState</i> from the <i>subscribedValueSet</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Getter
    private ActualFiniteState actualState;

    /**
     * List of ordered String.
     * derived actual value of this ParameterSubscriptionValueSet depending on the <i>valueSwitch</i> setting
     * Note: The <i>actualValue</i> is derived in the following (obvious) way:
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    @Getter
    private ValueArray<String> actualValue;

    /**
     * List of ordered String.
     * parameter value derived from the subscribed Parameter or ParameterOverride
     * Note: This value is derived from the <i>published</i> value of ParameterValueSet that is referenced through <i>subscribedValueSet</i>. In other words, it is the value as set by the owner (DomainOfExpertise) of the subscribed Parameter or  ParameterOverride.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    @Getter
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
    @Getter
    private DomainOfExpertise owner;

    /**
     * List of ordered String.
     * reference parameter value that is derived to be identical to the <i>reference</i> property of the <i>subscribedValueSet</i>
     * Note: The reference value is typically a value originating from outside the current EngineeringModel to be used as a reference to be compared with the (newly) computed value. However the reference values may be used for any purpose that a modelling activity deems useful.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    @Getter
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
     * Creates and returns a copy of this {@link ParameterSubscriptionValueSet} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterSubscriptionValueSet}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ParameterSubscriptionValueSet clone;
        try {
            clone = (ParameterSubscriptionValueSet)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ParameterSubscriptionValueSet cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setManual(new ValueArray<String>(this.getManual(), this));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ParameterSubscriptionValueSet} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterSubscriptionValueSet}.
     */
    @Override
    public ParameterSubscriptionValueSet clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterSubscriptionValueSet)this.genericClone(cloneContainedThings);
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

        cdp4common.dto.ParameterSubscriptionValueSet dto = (cdp4common.dto.ParameterSubscriptionValueSet)dtoThing;

        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setManual(new ValueArray<String>(dto.getManual(), this));
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setSubscribedValueSet(this.getCache().get<ParameterValueSetBase>(dto.getSubscribedValueSet(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel(ParameterValueSetBase.class));
        this.setValueSwitch(dto.getValueSwitch());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ParameterSubscriptionValueSet}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() throws ContainmentException {
        cdp4common.dto.ParameterSubscriptionValueSet dto = new cdp4common.dto.ParameterSubscriptionValueSet(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setManual(new ValueArray<String>(this.getManual(), this));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setSubscribedValueSet(this.getSubscribedValueSet() != null ? this.getSubscribedValueSet().getIid() : new UUID(0L, 0L));
        dto.setValueSwitch(this.getValueSwitch());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
