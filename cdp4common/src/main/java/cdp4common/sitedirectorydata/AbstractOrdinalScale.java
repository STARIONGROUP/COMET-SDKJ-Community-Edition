/* --------------------------------------------------------------------------------------------------------------------
 * AbstractOrdinalScale.java
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

/**
 * kind of MeasurementScale in which the possible valid values are ordered
 * but where the intervals between the values do not have particular
 * significance
 * Note 1: It is therefore is not meaningful to add or subtract values on
 * such a scale. It is possible to compare values numerically.
 * Note 2:The MeasurementUnit associated with such scales should be the number one.
 * Example 1: The NASA/ESA Technology Readiness Level (TRL) scale with
 * ScaleValueDefinitions: 1 : "Basic principles observed and reported"; 2 :
 * "Technology concept and/or application formulated"; 3 : "Analytical and
 * experimental critical function and/or characteristic proof-of- concept";
 * 4 : "Component and/or breadboard validation in laboratory environment";
 * 5 : "Component and/or breadboard validation in relevant environment"; 6
 * : "System/subsystem model or prototype demonstration in a relevant
 * environment (ground or space)"; 7 : "System prototype demonstration in a
 * space environment"; 8 : "Actual system completed and 'flight qualified'
 * through test and demonstration (ground or space)"; 9 : "Actual system
 * 'flight proven' through successful mission operations".
 * Example 2: The Beaufort wind force scale with ScaleValueDefinitions (as
 * defined by the <i>World Meteorological Organization</i>): 0 : "Calm"; 1
 * : "Light air"; 2: "Light breeze"; 3: "Gentle breeze"; 4: "Moderate
 * breeze"; 5: "Fresh breeze"; 6: "Strong breeze"; 7: "Near gale"; 8:
 * "Gale"; 9: "Strong gale"; 10: "Storm"; 11: "Violent storm"; 12:
 * "Hurricane".
 * Example 3: A simple "Priority" scale with ScaleValueDefinitions
 * 1: "low"; 2: "medium"; 3: "high"; that is used to distinguish between
 * different priorities and be able to tell whether a given priority is
 * higher or lower than another.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "scale")
public abstract class AbstractOrdinalScale extends AbstractMeasurementScale  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>OrdinalScale<code/> class.
     *
     * @see OrdinalScale
     */
    public AbstractOrdinalScale() {
    }

    /**
     * Initializes a new instance of the <code>OrdinalScale<code/> class.
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
     * @see OrdinalScale
     */
    public AbstractOrdinalScale(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Value indicating whether useShortNameValues.
     * assertion whether shortNames of the associated ScaleValueDefinitions are used as values or numeric values
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean useShortNameValues;

    /**
     * Gets a value indicating whether useShortNameValues.
     * assertion whether shortNames of the associated ScaleValueDefinitions are used as values or numeric values
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getUseShortNameValues(){
         return this.useShortNameValues;
    }

    /**
     *Sets a value indicating whether useShortNameValues.
     * assertion whether shortNames of the associated ScaleValueDefinitions are used as values or numeric values
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setUseShortNameValues(boolean useShortNameValues){
        this.useShortNameValues = useShortNameValues;
    }

    /**
     * Creates and returns a copy of this <code>OrdinalScale<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>OrdinalScale<code/>.
     *
     * @see OrdinalScale
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        OrdinalScale clone = (OrdinalScale)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));
        clone.setMappingToReferenceScale(cloneContainedThings ? new ContainerList<MappingToReferenceScale>(clone) : new ContainerList<MappingToReferenceScale>(this.mappingToReferenceScale, clone));
        clone.setValueDefinition(cloneContainedThings ? new ContainerList<ScaleValueDefinition>(clone) : new ContainerList<ScaleValueDefinition>(this.valueDefinition, clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getMappingToReferenceScale().addAll(this.mappingToReferenceScale.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getValueDefinition().addAll(this.valueDefinition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>OrdinalScale<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>OrdinalScale<code/>.
     * 
     * @see OrdinalScale
     */
    @Override
    public OrdinalScale clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (OrdinalScale)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>OrdinalScale<code/>.
     *
     * @return A list of potential errors.
     *
     * @see OrdinalScale
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>OrdinalScale<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see OrdinalScale
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.OrdinalScale dto = (cdp4common.dto.OrdinalScale)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.isDeprecated = dto.getIsDeprecated();
        this.isMaximumInclusive = dto.getIsMaximumInclusive();
        this.isMinimumInclusive = dto.getIsMinimumInclusive();
        this.mappingToReferenceScale.resolveList(dto.getMappingToReferenceScale(), dto.getIterationContainerId(), this.cache);
        this.maximumPermissibleValue = dto.getMaximumPermissibleValue();
        this.minimumPermissibleValue = dto.getMinimumPermissibleValue();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.negativeValueConnotation = dto.getNegativeValueConnotation();
        this.numberSet = dto.getNumberSet();
        this.positiveValueConnotation = dto.getPositiveValueConnotation();
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();
        this.unit = this.cache.get<MeasurementUnit>(dto.getUnit(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<MeasurementUnit>();
        this.useShortNameValues = dto.getUseShortNameValues();
        this.valueDefinition.resolveList(dto.getValueDefinition(), dto.getIterationContainerId(), this.cache);

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>OrdinalScale<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see OrdinalScale
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.OrdinalScale dto = new cdp4common.dto.OrdinalScale(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsDeprecated(this.isDeprecated);
        dto.setIsMaximumInclusive(this.isMaximumInclusive);
        dto.setIsMinimumInclusive(this.isMinimumInclusive);
        dto.getMappingToReferenceScale().add(this.mappingToReferenceScale.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setMaximumPermissibleValue(this.maximumPermissibleValue);
        dto.setMinimumPermissibleValue(this.minimumPermissibleValue);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.setNegativeValueConnotation(this.negativeValueConnotation);
        dto.setNumberSet(this.numberSet);
        dto.setPositiveValueConnotation(this.positiveValueConnotation);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);
        dto.setUnit(this.unit != null ? this.unit.getIid() : new UUID(0L, 0L));
        dto.setUseShortNameValues(this.useShortNameValues);
        dto.getValueDefinition().add(this.valueDefinition.stream().map(x -> x.Iid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
