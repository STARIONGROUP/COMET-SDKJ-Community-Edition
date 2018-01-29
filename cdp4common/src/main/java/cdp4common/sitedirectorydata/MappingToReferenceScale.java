/* --------------------------------------------------------------------------------------------------------------------
 * AbstractMappingToReferenceScale.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

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
 * representation of a mapping of a value on a dependent MeasurementScale to a value on a reference MeasurementScale that represents the same quantity
 * Note 1: One or more of these mappings would be defined for a dependent MeasurementScale (the scale being mapped) with respect to a reference MeasurementScale (the scale being mapped to) in order to enable quantity value conversion.
 * Note 2: For conversion between measurement scales other than OrdinalScales, i.e. scales with a meaningful MeasurementUnit that defines intervals of one on that scale, a single MappingToReferenceScale implicitly defines the offset by which measurement values need to be transformed when converting from the dependent to the reference scale or vice versa.
 * Note 3: For conversion to or from an OrdinalScale, a complete set of MappingToReferenceScale instances would need to be defined, one for each value on the OrdinalScale, since for an OrdinalScale the intervals between the scale values do not have particular significance, and therefore the mapping cannot be represented by a simple (linear or logarithmic) transformation function.
 * Example: The mapping between the thermodynamic temperature RatioScale in kelvin (the reference scale) and the Celsius temperature IntervalScale in degree Celsius (the dependent scale) is defined by a MappingToReferenceScale with <i>referenceScaleValue.value</i> = 0.0 [K] and <i>dependentScaleValue.value</i> = -273.15 [°C].
 */
@Container(clazz = MeasurementScale.class, propertyName = "mappingToReferenceScale")
@ToString
@EqualsAndHashCode
public  class MappingToReferenceScale extends Thing  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the <code>MappingToReferenceScale<code/> class.
     *
     * @see MappingToReferenceScale
     */
    public MappingToReferenceScale() {
    }

    /**
     * Initializes a new instance of the <code>MappingToReferenceScale<code/> class.
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
     * @see MappingToReferenceScale
     */
    public MappingToReferenceScale(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property dependentScaleValue.
     * reference to the ScaleValueDefinition of the dependent MeasurementScale, i.e. the value on the dependent scale that represents the same quantity as the one defined by the given <i>referenceScaleValue</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ScaleValueDefinition dependentScaleValue;

    /**
     * Property referenceScaleValue.
     * reference to the ScaleValueDefinition of the reference MeasurementScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ScaleValueDefinition referenceScaleValue;

    /**
     * Gets the dependentScaleValue.
     * reference to the ScaleValueDefinition of the dependent MeasurementScale, i.e. the value on the dependent scale that represents the same quantity as the one defined by the given <i>referenceScaleValue</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ScaleValueDefinition getDependentScaleValue(){
         return this.dependentScaleValue;
    }

    /**
     * Gets the referenceScaleValue.
     * reference to the ScaleValueDefinition of the reference MeasurementScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ScaleValueDefinition getReferenceScaleValue(){
         return this.referenceScaleValue;
    }

    /**
     * Sets the dependentScaleValue.
     * reference to the ScaleValueDefinition of the dependent MeasurementScale, i.e. the value on the dependent scale that represents the same quantity as the one defined by the given <i>referenceScaleValue</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDependentScaleValue(ScaleValueDefinition dependentScaleValue){
        this.dependentScaleValue = dependentScaleValue;
    }

    /**
     * Sets the referenceScaleValue.
     * reference to the ScaleValueDefinition of the reference MeasurementScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setReferenceScaleValue(ScaleValueDefinition referenceScaleValue){
        this.referenceScaleValue = referenceScaleValue;
    }

    /**
     * Creates and returns a copy of this <code>MappingToReferenceScale<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>MappingToReferenceScale<code/>.
     *
     * @see MappingToReferenceScale
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        MappingToReferenceScale clone = (MappingToReferenceScale)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>MappingToReferenceScale<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>MappingToReferenceScale<code/>.
     * 
     * @see MappingToReferenceScale
     */
    @Override
    public MappingToReferenceScale clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (MappingToReferenceScale)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>MappingToReferenceScale<code/>.
     *
     * @return A list of potential errors.
     *
     * @see MappingToReferenceScale
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getDependentScaleValue() == null || this.getDependentScaleValue().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property dependentScaleValue is null.");
            this.setDependentScaleValue(SentinelThingProvider.getSentinel<ScaleValueDefinition>());
            this.sentinelResetMap["dependentScaleValue"] = () -> this.setDependentScaleValue(null);
        }

        if (this.getReferenceScaleValue() == null || this.getReferenceScaleValue().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property referenceScaleValue is null.");
            this.setReferenceScaleValue(SentinelThingProvider.getSentinel<ScaleValueDefinition>());
            this.sentinelResetMap["referenceScaleValue"] = () -> this.setReferenceScaleValue(null);
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>MappingToReferenceScale<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see MappingToReferenceScale
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.MappingToReferenceScale dto = (cdp4common.dto.MappingToReferenceScale)dtoThing;

        this.setDependentScaleValue(this.cache.get<ScaleValueDefinition>(dto.getDependentScaleValue(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<ScaleValueDefinition>());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setReferenceScaleValue(this.cache.get<ScaleValueDefinition>(dto.getReferenceScaleValue(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<ScaleValueDefinition>());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>MappingToReferenceScale<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see MappingToReferenceScale
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.MappingToReferenceScale dto = new cdp4common.dto.MappingToReferenceScale(this.getIid(), this.getRevisionNumber());

        dto.setDependentScaleValue(this.getDependentScaleValue() != null ? this.getDependentScaleValue().getIid() : new UUID(0L, 0L));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setReferenceScaleValue(this.getReferenceScaleValue() != null ? this.getReferenceScaleValue().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
