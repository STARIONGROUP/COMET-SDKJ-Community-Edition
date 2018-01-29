/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParameterTypeComponent.java
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
 * representation of a component of a CompoundParameterType
 * Example 1: ParameterTypeComponents with shortNames "x", "y" and "z" for the components of a
 * ArrayParameterType that represents a 3D Cartesian coordinate position.
 * Example 2: Components "nr" and  "connector_type" for a CompoundParameterType that defines the number of a certain type of connectors. The "nr" component would be a "count" QuantityKind and the "connector_type" would be a EnumerationParameterType with an enumeration of known connector types.
 */
@Container(clazz = CompoundParameterType.class, propertyName = "component")
@ToString
@EqualsAndHashCode
public  class ParameterTypeComponent extends Thing implements ShortNamedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the <code>ParameterTypeComponent<code/> class.
     *
     * @see ParameterTypeComponent
     */
    public ParameterTypeComponent() {
    }

    /**
     * Initializes a new instance of the <code>ParameterTypeComponent<code/> class.
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
     * @see ParameterTypeComponent
     */
    public ParameterTypeComponent(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property parameterType.
     * specification of the ParameterType of this component
     * Note: If the ParameterTypeComponent is a <i>component</i> of an ArrayParameterType it must be a ScalarParameterType.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ParameterType parameterType;

    /**
     * Property scale.
     * specification of the MeasurementScale for this component of a       CompoundParameterType
     * Note: The scale shall only be specified for a ScalarParameterType       component       that       is       a       QuantityKind,       i.e.       a       numerical       parameter       type.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private MeasurementScale scale;

    /**
     * Property shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String shortName;

    /**
     * Gets the parameterType.
     * specification of the ParameterType of this component
     * Note: If the ParameterTypeComponent is a <i>component</i> of an ArrayParameterType it must be a ScalarParameterType.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ParameterType getParameterType(){
         return this.parameterType;
    }

    /**
     * Gets the scale.
     * specification of the MeasurementScale for this component of a       CompoundParameterType
     * Note: The scale shall only be specified for a ScalarParameterType       component       that       is       a       QuantityKind,       i.e.       a       numerical       parameter       type.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public MeasurementScale getScale(){
         return this.scale;
    }

    /**
     * Gets the shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getShortName(){
         return this.shortName;
    }

    /**
     * Sets the parameterType.
     * specification of the ParameterType of this component
     * Note: If the ParameterTypeComponent is a <i>component</i> of an ArrayParameterType it must be a ScalarParameterType.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setParameterType(ParameterType parameterType){
        this.parameterType = parameterType;
    }

    /**
     * Sets the scale.
     * specification of the MeasurementScale for this component of a       CompoundParameterType
     * Note: The scale shall only be specified for a ScalarParameterType       component       that       is       a       QuantityKind,       i.e.       a       numerical       parameter       type.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setScale(MeasurementScale scale){
        this.scale = scale;
    }

    /**
     * Sets the shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setShortName(String shortName){
        this.shortName = shortName;
    }

    /**
     * Creates and returns a copy of this <code>ParameterTypeComponent<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParameterTypeComponent<code/>.
     *
     * @see ParameterTypeComponent
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ParameterTypeComponent clone = (ParameterTypeComponent)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>ParameterTypeComponent<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParameterTypeComponent<code/>.
     * 
     * @see ParameterTypeComponent
     */
    @Override
    public ParameterTypeComponent clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterTypeComponent)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ParameterTypeComponent<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ParameterTypeComponent
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getParameterType() == null || this.getParameterType().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property parameterType is null.");
            this.setParameterType(SentinelThingProvider.getSentinel<ParameterType>());
            this.sentinelResetMap["parameterType"] = () -> this.setParameterType(null);
        }

        if (this.getShortName().trim().isEmpty()) {
            errorList.add("The property shortName is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ParameterTypeComponent<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ParameterTypeComponent
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParameterTypeComponent dto = (cdp4common.dto.ParameterTypeComponent)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setParameterType(this.cache.get<ParameterType>(dto.getParameterType(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<ParameterType>());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setScale((dto.getScale() != null) ? this.getCache().get<MeasurementScale>(dto.getScale.getValue(), dto.getIterationContainerId()) : null);
        this.setShortName(dto.getShortName());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ParameterTypeComponent<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ParameterTypeComponent
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ParameterTypeComponent dto = new cdp4common.dto.ParameterTypeComponent(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setParameterType(this.getParameterType() != null ? this.getParameterType().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setScale(this.getScale() != null ? (UUID)this.getScale().getIid() : null);
        dto.setShortName(this.getShortName());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
