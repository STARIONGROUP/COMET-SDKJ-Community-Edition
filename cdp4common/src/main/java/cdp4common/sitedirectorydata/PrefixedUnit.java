/* --------------------------------------------------------------------------------------------------------------------
 * AbstractPrefixedUnit.java
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
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * specialization of ConversionBasedUnit that defines a MeasurementUnit with a
 * multiple or submultiple UnitPrefix
 * Example: Measurement units like "kilogram", "millimetre", "nanovolt",
 * "gibibyte" etc.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
@ToString
@EqualsAndHashCode
public  class PrefixedUnit extends ConversionBasedUnit  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the {@link PrefixedUnit} class.
     */
    public PrefixedUnit() {
    }

    /**
     * Initializes a new instance of the {@link PrefixedUnit} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public PrefixedUnit(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
    }

    /**
     * Property conversionFactor.
     * applicable conversion factor derived from <i>prefix</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String conversionFactor;
 
    /**
     * Property name.
     * derived name of this PrefixUnit
     * Note: The name is derived as the concatenation of name of the <i>prefix</i> and the name of the <i>referenceUnit</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String name;
 
    /**
     * Property prefix.
     * reference to the applicable UnitPrefix
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private UnitPrefix prefix;

    /**
     * Property shortName.
     * derived symbol of this PrefixUnit
     * Note: The symbol is derived as the concatenation of <i>shortName</i> of the <i>prefix</i> and the <i>shortName</i> of the <i>referenceUnit</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String shortName;
 

    /**
     * Gets the conversionFactor.
     * applicable conversion factor derived from <i>prefix</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public String getConversionFactor(){
        return this.GetDerivedConversionFactor();
    }

    /**
     * Gets the name.
     * derived name of this PrefixUnit
     * Note: The name is derived as the concatenation of name of the <i>prefix</i> and the name of the <i>referenceUnit</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public String getName(){
        return this.GetDerivedName();
    }

    /**
     * Gets the prefix.
     * reference to the applicable UnitPrefix
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public UnitPrefix getPrefix(){
         return this.prefix;
    }

    /**
     * Gets the shortName.
     * derived symbol of this PrefixUnit
     * Note: The symbol is derived as the concatenation of <i>shortName</i> of the <i>prefix</i> and the <i>shortName</i> of the <i>referenceUnit</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public String getShortName(){
        return this.GetDerivedShortName();
    }

    /**
     * Sets the conversionFactor.
     * applicable conversion factor derived from <i>prefix</i>
     *
     * @throws IllegalStateException The conversionFactor property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public void setConversionFactor(String conversionFactor){
        throw new IllegalStateException("Forbidden Set value for the derived property PrefixedUnit.conversionFactor");
    }

    /**
     * Sets the name.
     * derived name of this PrefixUnit
     * Note: The name is derived as the concatenation of name of the <i>prefix</i> and the name of the <i>referenceUnit</i>.
     *
     * @throws IllegalStateException The name property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public void setName(String name){
        throw new IllegalStateException("Forbidden Set value for the derived property PrefixedUnit.name");
    }

    /**
     * Sets the prefix.
     * reference to the applicable UnitPrefix
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setPrefix(UnitPrefix prefix){
        this.prefix = prefix;
    }

    /**
     * Sets the shortName.
     * derived symbol of this PrefixUnit
     * Note: The symbol is derived as the concatenation of <i>shortName</i> of the <i>prefix</i> and the <i>shortName</i> of the <i>referenceUnit</i>.
     *
     * @throws IllegalStateException The shortName property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public void setShortName(String shortName){
        throw new IllegalStateException("Forbidden Set value for the derived property PrefixedUnit.shortName");
    }

    /**
     * Creates and returns a copy of this {@link PrefixedUnit} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link PrefixedUnit}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        PrefixedUnit clone = (PrefixedUnit)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link PrefixedUnit} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link PrefixedUnit}.
     */
    @Override
    public PrefixedUnit clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (PrefixedUnit)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>PrefixedUnit}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getPrefix() == null || this.getPrefix().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property prefix is null.");
            this.setPrefix(SentinelThingProvider.getSentinel<UnitPrefix>());
            this.sentinelResetMap.put("prefix", new ActionImpl(() -> this.setPrefix(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link PrefixedUnit} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.PrefixedUnit dto = (cdp4common.dto.PrefixedUnit)dtoThing;

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setDeprecated(dto.getDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setPrefix(this.getCache().get<UnitPrefix>(dto.getPrefix(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<UnitPrefix>());
        this.setReferenceUnit(this.getCache().get<MeasurementUnit>(dto.getReferenceUnit(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<MeasurementUnit>());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link PrefixedUnit}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.PrefixedUnit dto = new cdp4common.dto.PrefixedUnit(this.getIid(), this.getRevisionNumber());

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setDeprecated(this.getDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setPrefix(this.getPrefix() != null ? this.getPrefix().getIid() : new UUID(0L, 0L));
        dto.setReferenceUnit(this.getReferenceUnit() != null ? this.getReferenceUnit().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
