/* --------------------------------------------------------------------------------------------------------------------
 * ParameterOverride.java
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
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.tuple.Pair;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * representation of a parameter at ElementUsage level that allows to override the values of a Parameter defined at ElementDefinition level
 * Note 1: The <i>parameter</i> that is overridden must be a Parameter of the ElementDefinition that is the <i>elementDefinition</i> of the containing ElementUsage.
 * Note 2: The owner DomainOfExpertise of this ParameterOverride is the same as the owner of the elementDefinition.
 */
@Container(clazz = ElementUsage.class, propertyName = "parameterOverride")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ParameterOverride extends ParameterOrOverrideBase implements Cloneable, ModelCode {
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
     * Initializes a new instance of the {@link ParameterOverride} class.
     */
    public ParameterOverride() {
        this.valueSet = new ContainerList<ParameterOverrideValueSet>(this);
    }

    /**
     * Initializes a new instance of the {@link ParameterOverride} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ParameterOverride(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.valueSet = new ContainerList<ParameterOverrideValueSet>(this);
    }

    /**
     * Property group.
     * group derived from associated Parameter for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private ParameterGroup group;

    /**
     * Value indicating whether isOptionDependent.
     * isOptionDependent derived from associated Parameter for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private boolean isOptionDependent;

    /**
     * Property parameter.
     * reference to the Parameter whose values this ParameterOverride (possibly) overrides
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Parameter parameter;

    /**
     * Property parameterType.
     * parameterType derived from associated Parameter for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private ParameterType parameterType;

    /**
     * Property scale.
     * scale derived from associated Parameter for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private MeasurementScale scale;

    /**
     * Property stateDependence.
     * stateDependence derived from associated Parameter for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private ActualFiniteStateList stateDependence;

    /**
     * List of contained ParameterOverrideValueSet.
     * representation of the switch and values of this ParameterOverride
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ParameterOverrideValueSet> valueSet;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link ParameterOverride}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets the group.
     * group derived from associated Parameter for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public ParameterGroup getGroup(){
        return this.getDerivedGroup();
    }

    /**
     *Gets a value indicating whether isOptionDependent.
     * isOptionDependent derived from associated Parameter for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public boolean isOptionDependent(){
        return this.getDerivedIsOptionDependent();
    }

    /**
     * Gets the parameterType.
     * parameterType derived from associated Parameter for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public ParameterType getParameterType(){
        return this.getDerivedParameterType();
    }

    /**
     * Gets the scale.
     * scale derived from associated Parameter for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public MeasurementScale getScale(){
        return this.getDerivedScale();
    }

    /**
     * Gets the stateDependence.
     * stateDependence derived from associated Parameter for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public ActualFiniteStateList getStateDependence(){
        return this.getDerivedStateDependence();
    }

    /**
     * Sets the group.
     * group derived from associated Parameter for convenience
     *
     * @throws IllegalStateException The group property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public void setGroup(ParameterGroup group){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterOverride.group");
    }

    /**
     *Sets a value indicating whether isOptionDependent.
     * isOptionDependent derived from associated Parameter for convenience
     *
     * @throws IllegalStateException The isOptionDependent property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public void setOptionDependent(boolean isOptionDependent){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterOverride.isOptionDependent");
    }

    /**
     * Sets the parameterType.
     * parameterType derived from associated Parameter for convenience
     *
     * @throws IllegalStateException The parameterType property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public void setParameterType(ParameterType parameterType){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterOverride.parameterType");
    }

    /**
     * Sets the scale.
     * scale derived from associated Parameter for convenience
     *
     * @throws IllegalStateException The scale property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public void setScale(MeasurementScale scale){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterOverride.scale");
    }

    /**
     * Sets the stateDependence.
     * stateDependence derived from associated Parameter for convenience
     *
     * @throws IllegalStateException The stateDependence property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public void setStateDependence(ActualFiniteStateList stateDependence){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterOverride.stateDependence");
    }

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link ParameterOverride}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.valueSet);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link ParameterOverride} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterOverride}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ParameterOverride clone;
        try {
            clone = (ParameterOverride)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ParameterOverride cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setParameterSubscription(cloneContainedThings ? new ContainerList<ParameterSubscription>(clone) : new ContainerList<ParameterSubscription>(this.getParameterSubscription(), clone, false));
        clone.setValueSet(cloneContainedThings ? new ContainerList<ParameterOverrideValueSet>(clone) : new ContainerList<ParameterOverrideValueSet>(this.getValueSet(), clone, false));

        if (cloneContainedThings) {
            clone.getParameterSubscription().addAll(this.getParameterSubscription().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getValueSet().addAll(this.getValueSet().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ParameterOverride} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterOverride}.
     */
    @Override
    public ParameterOverride clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterOverride)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ParameterOverride}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getParameter() == null || this.getParameter().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property parameter is null.");
            this.setParameter(SentinelThingProvider.getSentinel(Parameter.class));
            this.sentinelResetMap.put("parameter", new ActionImpl(() -> this.setParameter(null)));
        }

        int valueSetCount = this.getValueSet().size();
        if (valueSetCount < 1) {
            errorList.add("The number of elements in the property valueSet is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ParameterOverride} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParameterOverride dto = (cdp4common.dto.ParameterOverride)dtoThing;

        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setOwner(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getOwner(), dto.getIterationContainerId(), DomainOfExpertise.class), SentinelThingProvider.getSentinel(DomainOfExpertise.class)));
        this.setParameter(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getParameter(), dto.getIterationContainerId(), Parameter.class), SentinelThingProvider.getSentinel(Parameter.class)));
        PojoThingFactory.resolveList(this.getParameterSubscription(), dto.getParameterSubscription(), dto.getIterationContainerId(), this.getCache(), ParameterSubscription.class);
        this.setRevisionNumber(dto.getRevisionNumber());
        PojoThingFactory.resolveList(this.getValueSet(), dto.getValueSet(), dto.getIterationContainerId(), this.getCache(), ParameterOverrideValueSet.class);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ParameterOverride}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ParameterOverride dto = new cdp4common.dto.ParameterOverride(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.setParameter(this.getParameter() != null ? this.getParameter().getIid() : new UUID(0L, 0L));
        dto.getParameterSubscription().addAll(this.getParameterSubscription().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.getValueSet().addAll(this.getValueSet().stream().map(Thing::getIid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Returns the derived {@link ParameterType} value
     *
     * @return The {@link ParameterType} value
     */
    private ParameterType getDerivedParameterType() {
        return this.getParameter().getParameterType();
    }

    /**
     * Returns the derived {@link #isOptionDependent} value
     *
     * @return The {@link #isOptionDependent} value
     */
    private boolean getDerivedIsOptionDependent() {
        return this.getParameter() != null && this.getParameter().isOptionDependent();
    }

    /**
     * Returns the derived {@link #scale} value
     *
     * @return The {@link #scale} value
     */
    private MeasurementScale getDerivedScale() {
        return this.getParameter().getScale();
    }

    /**
     * Returns the derived {@link #stateDependence} value
     *
     * @return The {@link #stateDependence} value
     */
    private ActualFiniteStateList getDerivedStateDependence() {
        return this.getParameter().getStateDependence();
    }

    /**
     * Returns the derived {@link #group} value
     *
     * @return The {@link #group} value
     */
    private ParameterGroup getDerivedGroup() {
        return this.getParameter().getGroup();
    }

    /**
     * Computes the model code of the current {@link ParameterOverride}
     * <p>
     * The model code is derived as follows:
     * {@code #ElementDefinition.ShortName#.#ElementUsage.ShortName#.#Component.ParameterType.ShortName#}
     * @param componentIndex The component Index.
     * @return A string that represents the model code of the current {@link ParameterOverride}
     */
    @Override
    public String modelCode(Integer componentIndex) {
        ElementUsage elementUsage = this.getContainer() instanceof ElementUsage ? (ElementUsage)this.getContainer() : null;

        if (elementUsage == null) {
            throw new ContainmentException(String.format("The container ElementUsage of ParameterOverride with iid %s is null, the model code cannot be computed.", this.getIid()));
        }

        CompoundParameterType compoundParameterType = this.getDerivedParameterType() instanceof CompoundParameterType ? (CompoundParameterType)this.getDerivedParameterType() : null;
        if (compoundParameterType == null && componentIndex > 0) {
            throw new IllegalArgumentException("The value must be 0 if the ParameterType is not a CompoundParameterType (componentIndex)");
        }

        if (compoundParameterType != null && componentIndex != null) {
            String component = Utils.formatComponentShortName(compoundParameterType.getComponent().get(componentIndex).getShortName());
            return String.format("%s.%s.%s", elementUsage.modelCode(null), compoundParameterType.getShortName(), component);
        }

        return String.format("%s.%s", elementUsage.modelCode(null), this.getDerivedParameterType().getShortName());
    }

    /**
     * Gets a value indicating whether the {@link ParameterOverride} can be published.
     */
    @Override
    public boolean canBePublished() {
        return this.getValueSet().stream().anyMatch(vs -> !Iterables.elementsEqual(vs.getActualValue(), vs.getPublished()));
    }

    /**
     * Validate this {@link ParameterOverride} with custom rules
     *
     * @return A list of error messages
     */
    @Override
    protected List<String> validatePojoProperties() {
        List<String> errorList = new ArrayList<>(super.validatePojoProperties());

        if (this.isOptionDependent()) {
            Iteration iteration = this.getContainerOfType(Iteration.class);
            if (this.getStateDependence() != null) {
                for (Option option : iteration.getOption()) {
                    for (ActualFiniteState actualState : this.getStateDependence().getActualState().stream().filter(x -> x.getKind() == ActualFiniteStateKind.MANDATORY).collect(Collectors.toList())) {
                        List<ParameterOverrideValueSet> valueSets = this.getValueSet().stream().filter(x -> x.getActualOption().equals(option) && x.getActualState().equals(actualState)).collect(Collectors.toList());
                        errorList.addAll(this.validateValueSets(valueSets, option, actualState));
                    }
                }
            } else {
                for (Option option : iteration.getOption()) {
                    List<ParameterOverrideValueSet> valueSets = this.getValueSet().stream().filter(x -> x.getActualOption().equals(option)).collect(Collectors.toList());
                    errorList.addAll(this.validateValueSets(valueSets, option, null));
                }
            }
        } else {
            if (this.getStateDependence() != null) {
                for (ActualFiniteState actualState : this.getStateDependence().getActualState().stream().filter(x -> x.getKind() == ActualFiniteStateKind.MANDATORY).collect(Collectors.toList())) {
                    List<ParameterOverrideValueSet> valueSets = this.getValueSet().stream().filter(x -> x.getActualState().equals(actualState)).collect(Collectors.toList());
                    errorList.addAll(this.validateValueSets(valueSets, null, actualState));
                }
            } else {
                List<ParameterOverrideValueSet> valueSets = this.getValueSet();
                errorList.addAll(this.validateValueSets(valueSets, null, null));
            }
        }

        return errorList;
    }

    /**
     * Validate the value-sets of this {@link ParameterOverride} for an option and state if applicable
     *
     * @param valueSets The {@link ParameterOverrideValueSet}s found for the corresponding option and state
     * @param option The {@link Option}
     * @param state The {@link ActualFiniteState}
     * @return a list of error messages
     */
    private Collection<String> validateValueSets(List<ParameterOverrideValueSet> valueSets, Option option, ActualFiniteState state) {
        List<String> errorList = new ArrayList<>();

        if (valueSets.size() == 0) {
            errorList.add(String.format("No value-set was found for the option %s and state %s", (option == null) ? "-" : option.getName(), (state == null) ? "-" : state.getName()));
        }
        else if (valueSets.size() > 1) {
            errorList.add(String.format("Duplicated value-sets were found for the option %s and state %s", (option == null) ? "-" : option.getName(), (state == null) ? "-" : state.getName()));
        } else {
            errorList.addAll(valueSets.get(0).getValidationErrors());
        }

        return errorList;
    }
}
