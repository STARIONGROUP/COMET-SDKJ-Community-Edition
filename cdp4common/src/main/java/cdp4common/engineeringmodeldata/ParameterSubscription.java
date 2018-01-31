/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParameterSubscription.java
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
 * representation of a subscription to a Parameter or ParameterOverride taken by a DomainOfExpertise that is not the owner of the Parameter or ParameterOverride
 * Note: ParameterSubscriptions represent parameters used as inputs in concurrent engineering workbooks.
 */
@Container(clazz = ParameterOrOverrideBase.class, propertyName = "parameterSubscription")
@ToString
@EqualsAndHashCode
public  class ParameterSubscription extends ParameterBase implements Cloneable {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NONE;

    /**
     * Initializes a new instance of the {@link ParameterSubscription} class.
     */
    public ParameterSubscription() {
        this.valueSet = new ContainerList<ParameterSubscriptionValueSet>(this);
    }

    /**
     * Initializes a new instance of the {@link ParameterSubscription} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ParameterSubscription(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.valueSet = new ContainerList<ParameterSubscriptionValueSet>(this);
    }

    /**
     * Property group.
     * group derived from associated Parameter or ParameterOverride for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private ParameterGroup group;
 
    /**
     * Value indicating whether isOptionDependent.
     * assertion, derived from the container Parameter or ParameterOverride, whether the values of this depend on the Options defined in the associated Iteration or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private boolean isOptionDependent;
 
    /**
     * Property parameterType.
     * parameterType derived from associated Parameter or ParameterOverride for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private ParameterType parameterType;
 
    /**
     * Property scale.
     * scale derived from associated Parameter or ParameterOverride for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private MeasurementScale scale;
 
    /**
     * Property stateDependence.
     * stateDependence derived from associated Parameter or ParameterOverride for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private ActualFiniteStateList stateDependence;
 
    /**
     * List of contained ParameterSubscriptionValueSet.
     * representation of the switch and values of this ParameterSubscription
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ParameterSubscriptionValueSet> valueSet;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link ParameterSubscription}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets the group.
     * group derived from associated Parameter or ParameterOverride for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public ParameterGroup getGroup(){
        return this.GetDerivedGroup();
    }

    /**
     * Gets a value indicating whether isOptionDependent.
     * assertion, derived from the container Parameter or ParameterOverride, whether the values of this depend on the Options defined in the associated Iteration or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public boolean getOptionDependent(){
        return this.GetDerivedIsOptionDependent();
    }

    /**
     * Gets the parameterType.
     * parameterType derived from associated Parameter or ParameterOverride for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public ParameterType getParameterType(){
        return this.GetDerivedParameterType();
    }

    /**
     * Gets the scale.
     * scale derived from associated Parameter or ParameterOverride for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public MeasurementScale getScale(){
        return this.GetDerivedScale();
    }

    /**
     * Gets the stateDependence.
     * stateDependence derived from associated Parameter or ParameterOverride for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public ActualFiniteStateList getStateDependence(){
        return this.GetDerivedStateDependence();
    }

    /**
     * Gets a list of contained ParameterSubscriptionValueSet.
     * representation of the switch and values of this ParameterSubscription
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ParameterSubscriptionValueSet> getValueSet(){
         return this.valueSet;
    }

    /**
     * Sets the group.
     * group derived from associated Parameter or ParameterOverride for convenience
     *
     * @throws IllegalStateException The group property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public void setGroup(ParameterGroup group){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscription.group");
    }

    /**
     *Sets a value indicating whether isOptionDependent.
     * assertion, derived from the container Parameter or ParameterOverride, whether the values of this depend on the Options defined in the associated Iteration or not
     *
     * @throws IllegalStateException The isOptionDependent property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public void setOptionDependent(boolean isOptionDependent){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscription.isOptionDependent");
    }

    /**
     * Sets the parameterType.
     * parameterType derived from associated Parameter or ParameterOverride for convenience
     *
     * @throws IllegalStateException The parameterType property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public void setParameterType(ParameterType parameterType){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscription.parameterType");
    }

    /**
     * Sets the scale.
     * scale derived from associated Parameter or ParameterOverride for convenience
     *
     * @throws IllegalStateException The scale property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public void setScale(MeasurementScale scale){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscription.scale");
    }

    /**
     * Sets the stateDependence.
     * stateDependence derived from associated Parameter or ParameterOverride for convenience
     *
     * @throws IllegalStateException The stateDependence property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public void setStateDependence(ActualFiniteStateList stateDependence){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterSubscription.stateDependence");
    }

    /**
     * Sets a list of contained ParameterSubscriptionValueSet.
     * representation of the switch and values of this ParameterSubscription
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setValueSet(ContainerList<ParameterSubscriptionValueSet> valueSet){
        this.valueSet = valueSet;
    }

    /**
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link ParameterSubscription}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
        containers.add(this.valueSet);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link ParameterSubscription} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterSubscription}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ParameterSubscription clone;
        try {
            clone = (ParameterSubscription)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ParameterSubscription cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setValueSet(cloneContainedThings ? new ContainerList<ParameterSubscriptionValueSet>(clone) : new ContainerList<ParameterSubscriptionValueSet>(this.getValueSet(), clone));

        if (cloneContainedThings) {
            clone.getValueSet().addAll(this.getValueSet().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ParameterSubscription} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterSubscription}.
     */
    @Override
    public ParameterSubscription clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterSubscription)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ParameterSubscription}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int valueSetCount = this.getValueSet().size();
        if (valueSetCount < 1) {
            errorList.add("The number of elements in the property valueSet is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ParameterSubscription} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParameterSubscription dto = (cdp4common.dto.ParameterSubscription)dtoThing;

        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setOwner(this.getCache().get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.getValueSet().resolveList(dto.getValueSet(), dto.getIterationContainerId(), this.getCache());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ParameterSubscription}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ParameterSubscription dto = new cdp4common.dto.ParameterSubscription(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.getValueSet().add(this.getValueSet().stream().map(x -> x.getIid()).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
