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

/**
 * specialization of ConversionBasedUnit that defines a MeasurementUnit with a
 * multiple or submultiple UnitPrefix
 * Example: Measurement units like "kilogram", "millimetre", "nanovolt",
 * "gibibyte" etc.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
public abstract class AbstractPrefixedUnit extends AbstractConversionBasedUnit  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>PrefixedUnit<code/> class.
     *
     * @see PrefixedUnit
     */
    public AbstractPrefixedUnit() {
    }

    /**
     * Initializes a new instance of the <code>PrefixedUnit<code/> class.
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
     * @see PrefixedUnit
     */
    public AbstractPrefixedUnit(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
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
     * Creates and returns a copy of this <code>PrefixedUnit<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>PrefixedUnit<code/>.
     *
     * @see PrefixedUnit
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        PrefixedUnit clone = (PrefixedUnit)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>PrefixedUnit<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>PrefixedUnit<code/>.
     * 
     * @see PrefixedUnit
     */
    @Override
    public PrefixedUnit clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (PrefixedUnit)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>PrefixedUnit<code/>.
     *
     * @return A list of potential errors.
     *
     * @see PrefixedUnit
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.prefix == null || this.prefix.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property prefix is null.");
            this.prefix = SentinelThingProvider.getSentinel<UnitPrefix>();
            this.sentinelResetMap["prefix"] = () -> this.prefix = null;
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>PrefixedUnit<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see PrefixedUnit
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.PrefixedUnit dto = (cdp4common.dto.PrefixedUnit)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.isDeprecated = dto.getIsDeprecated();
        this.modifiedOn = dto.getModifiedOn();
        this.prefix = this.cache.get<UnitPrefix>(dto.getPrefix(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<UnitPrefix>();
        this.referenceUnit = this.cache.get<MeasurementUnit>(dto.getReferenceUnit(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<MeasurementUnit>();
        this.revisionNumber = dto.getRevisionNumber();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>PrefixedUnit<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see PrefixedUnit
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.PrefixedUnit dto = new cdp4common.dto.PrefixedUnit(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsDeprecated(this.isDeprecated);
        dto.setModifiedOn(this.modifiedOn);
        dto.setPrefix(this.prefix != null ? this.prefix.getIid() : new UUID(0L, 0L));
        dto.setReferenceUnit(this.referenceUnit != null ? this.referenceUnit.getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.revisionNumber);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
