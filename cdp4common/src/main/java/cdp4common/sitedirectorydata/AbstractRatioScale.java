/* --------------------------------------------------------------------------------------------------------------------
 * AbstractRatioScale.java
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
 * kind of MeasurementScale that has ordered values, a measurement unit and
 * a fixed definition of the zero value on all scales for the same kind of
 * quantity
 * Note 1: The measurement unit defines how to interpret an interval of one
 * on the scale.
 * Note 2: Any two ratio scales of measurement for the same kind of
 * quantity have coincident zero values, they only differ in their
 * measurement unit.
 * Note 3: On a ratio scale of measurement it is possible to take the
 * difference between two values, to compute the average (arithmetic
 * mean) of two or more values, as well as to add, multiply and divide
 * values.
 * Note 4: The numerical value of quantity expressed on one ratio scale can
 * be converted to the value of the same quantity expressed on a second
 * (different) ratio scale through simple multiplication by a conversion
 * factor, which is the ratio between the respective measurement units.
 * Example: The majority of the physical quantities are expressed on ratio
 * scales, e.g.: length (metre, millimetre, kilometre, inch, foot, mile,
 * lightyear); mass (kilogram, gram, nanogram, ton, pound); time (second,
 * hour).
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "scale")
public abstract class AbstractRatioScale extends AbstractMeasurementScale  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>RatioScale<code/> class.
     *
     * @see RatioScale
     */
    public AbstractRatioScale() {
    }

    /**
     * Initializes a new instance of the <code>RatioScale<code/> class.
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
     * @see RatioScale
     */
    public AbstractRatioScale(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Creates and returns a copy of this <code>RatioScale<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>RatioScale<code/>.
     *
     * @see RatioScale
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        RatioScale clone = (RatioScale)this.clone();
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
     * Creates and returns a copy of this <code>RatioScale<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>RatioScale<code/>.
     * 
     * @see RatioScale
     */
    @Override
    public RatioScale clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (RatioScale)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>RatioScale<code/>.
     *
     * @return A list of potential errors.
     *
     * @see RatioScale
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>RatioScale<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see RatioScale
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.RatioScale dto = (cdp4common.dto.RatioScale)dtoThing;

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
        this.valueDefinition.resolveList(dto.getValueDefinition(), dto.getIterationContainerId(), this.cache);

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>RatioScale<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see RatioScale
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.RatioScale dto = new cdp4common.dto.RatioScale(this.iid, this.revisionNumber);

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
        dto.getValueDefinition().add(this.valueDefinition.stream().map(x -> x.Iid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
