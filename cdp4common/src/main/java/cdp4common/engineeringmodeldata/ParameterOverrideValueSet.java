/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParameterOverrideValueSet.java
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
 * representation of the switch setting and all values for a ParameterOverride
 */
@Container(clazz = ParameterOverride.class, propertyName = "valueSet")
@ToString
@EqualsAndHashCode
public  class ParameterOverrideValueSet extends ParameterValueSetBase  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the <code>ParameterOverrideValueSet<code/> class.
     *
     * @see ParameterOverrideValueSet
     */
    public ParameterOverrideValueSet() {
    }

    /**
     * Initializes a new instance of the <code>ParameterOverrideValueSet<code/> class.
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
     * @see ParameterOverrideValueSet
     */
    public ParameterOverrideValueSet(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property actualOption.
     * reference to the actual Option to which this ParameterOverrideValueSet pertains, derived from the associated ParameterValueSet for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private Option actualOption;
 
    /**
     * Property actualState.
     * reference to the ActualFiniteState to which this ParameterOverrideValueSet pertains, derived from the associated ParameterValueSet for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private ActualFiniteState actualState;
 
    /**
     * Property parameterValueSet.
     * reference to the ParameterValueSet that this ParameterOverrideValueSet overrides
     * Note: The <i>parameter</i> must be the same as the <i>container</i> of the referenced ParameterValueSet.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ParameterValueSet parameterValueSet;

    /**
     * Gets the actualOption.
     * reference to the actual Option to which this ParameterOverrideValueSet pertains, derived from the associated ParameterValueSet for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public Option getActualOption(){
        return this.GetDerivedActualOption();
    }

    /**
     * Gets the actualState.
     * reference to the ActualFiniteState to which this ParameterOverrideValueSet pertains, derived from the associated ParameterValueSet for convenience
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public ActualFiniteState getActualState(){
        return this.GetDerivedActualState();
    }

    /**
     * Gets the parameterValueSet.
     * reference to the ParameterValueSet that this ParameterOverrideValueSet overrides
     * Note: The <i>parameter</i> must be the same as the <i>container</i> of the referenced ParameterValueSet.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ParameterValueSet getParameterValueSet(){
         return this.parameterValueSet;
    }

    /**
     * Sets the actualOption.
     * reference to the actual Option to which this ParameterOverrideValueSet pertains, derived from the associated ParameterValueSet for convenience
     *
     * @throws IllegalStateException The actualOption property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public void setActualOption(Option actualOption){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterOverrideValueSet.actualOption");
    }

    /**
     * Sets the actualState.
     * reference to the ActualFiniteState to which this ParameterOverrideValueSet pertains, derived from the associated ParameterValueSet for convenience
     *
     * @throws IllegalStateException The actualState property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public void setActualState(ActualFiniteState actualState){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterOverrideValueSet.actualState");
    }

    /**
     * Sets the parameterValueSet.
     * reference to the ParameterValueSet that this ParameterOverrideValueSet overrides
     * Note: The <i>parameter</i> must be the same as the <i>container</i> of the referenced ParameterValueSet.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setParameterValueSet(ParameterValueSet parameterValueSet){
        this.parameterValueSet = parameterValueSet;
    }

    /**
     * Creates and returns a copy of this <code>ParameterOverrideValueSet<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParameterOverrideValueSet<code/>.
     *
     * @see ParameterOverrideValueSet
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ParameterOverrideValueSet clone = (ParameterOverrideValueSet)this.clone();
        clone.setComputed(new ValueArray<String>(this.getComputed(), this));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setFormula(new ValueArray<String>(this.getFormula(), this));
        clone.setManual(new ValueArray<String>(this.getManual(), this));
        clone.setPublished(new ValueArray<String>(this.getPublished(), this));
        clone.setReference(new ValueArray<String>(this.getReference(), this));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>ParameterOverrideValueSet<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParameterOverrideValueSet<code/>.
     * 
     * @see ParameterOverrideValueSet
     */
    @Override
    public ParameterOverrideValueSet clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterOverrideValueSet)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ParameterOverrideValueSet<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ParameterOverrideValueSet
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getParameterValueSet() == null || this.getParameterValueSet().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property parameterValueSet is null.");
            this.setParameterValueSet(SentinelThingProvider.getSentinel<ParameterValueSet>());
            this.sentinelResetMap["parameterValueSet"] = () -> this.setParameterValueSet(null);
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ParameterOverrideValueSet<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ParameterOverrideValueSet
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParameterOverrideValueSet dto = (cdp4common.dto.ParameterOverrideValueSet)dtoThing;

        this.setComputed(new ValueArray<String>(dto.getComputed(), this));
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setFormula(new ValueArray<String>(dto.getFormula(), this));
        this.setManual(new ValueArray<String>(dto.getManual(), this));
        this.setModifiedOn(dto.getModifiedOn());
        this.setParameterValueSet(this.cache.get<ParameterValueSet>(dto.getParameterValueSet(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<ParameterValueSet>());
        this.setPublished(new ValueArray<String>(dto.getPublished(), this));
        this.setReference(new ValueArray<String>(dto.getReference(), this));
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setValueSwitch(dto.getValueSwitch());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ParameterOverrideValueSet<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ParameterOverrideValueSet
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ParameterOverrideValueSet dto = new cdp4common.dto.ParameterOverrideValueSet(this.getIid(), this.getRevisionNumber());

        dto.setComputed(new ValueArray<String>(this.getComputed(), this));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setFormula(new ValueArray<String>(this.getFormula(), this));
        dto.setManual(new ValueArray<String>(this.getManual(), this));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setParameterValueSet(this.getParameterValueSet() != null ? this.getParameterValueSet().getIid() : new UUID(0L, 0L));
        dto.setPublished(new ValueArray<String>(this.getPublished(), this));
        dto.setReference(new ValueArray<String>(this.getReference(), this));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setValueSwitch(this.getValueSwitch());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
