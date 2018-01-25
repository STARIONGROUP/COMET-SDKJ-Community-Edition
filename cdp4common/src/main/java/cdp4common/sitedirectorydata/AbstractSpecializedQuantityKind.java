/* --------------------------------------------------------------------------------------------------------------------
 * AbstractSpecializedQuantityKind.java
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
 * specialization of QuantityKind that represents a kind of quantity that
 * is a specialization of another kind of quantity
 * Example: The kinds of quantity "distance", "width", "depth", "radius"
 * and "wavelength" can all be specified as specializations of the "length"
 * SimpleQuantityKind.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
public abstract class AbstractSpecializedQuantityKind extends AbstractQuantityKind  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>SpecializedQuantityKind<code/> class.
     *
     * @see SpecializedQuantityKind
     */
    public AbstractSpecializedQuantityKind() {
    }

    /**
     * Initializes a new instance of the <code>SpecializedQuantityKind<code/> class.
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
     * @see SpecializedQuantityKind
     */
    public AbstractSpecializedQuantityKind(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property general.
     * reference to the general QuantityKind that this SpecializedQuantityKind is a specialization of
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private QuantityKind general;

    /**
     * Gets the general.
     * reference to the general QuantityKind that this SpecializedQuantityKind is a specialization of
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public QuantityKind getGeneral(){
         return this.general;
    }

    /**
     * Sets the general.
     * reference to the general QuantityKind that this SpecializedQuantityKind is a specialization of
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setGeneral(QuantityKind general){
        this.general = general;
    }

    /**
     * Creates and returns a copy of this <code>SpecializedQuantityKind<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>SpecializedQuantityKind<code/>.
     *
     * @see SpecializedQuantityKind
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        SpecializedQuantityKind clone = (SpecializedQuantityKind)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setCategory(new List<Category>(this.category));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));
        clone.setPossibleScale(new List<MeasurementScale>(this.possibleScale));

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
     * Creates and returns a copy of this <code>SpecializedQuantityKind<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>SpecializedQuantityKind<code/>.
     * 
     * @see SpecializedQuantityKind
     */
    @Override
    public SpecializedQuantityKind clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SpecializedQuantityKind)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>SpecializedQuantityKind<code/>.
     *
     * @return A list of potential errors.
     *
     * @see SpecializedQuantityKind
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.general == null || this.general.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property general is null.");
            this.general = SentinelThingProvider.getSentinel<QuantityKind>();
            this.sentinelResetMap["general"] = () -> this.general = null;
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>SpecializedQuantityKind<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see SpecializedQuantityKind
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.SpecializedQuantityKind dto = (cdp4common.dto.SpecializedQuantityKind)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.cache);
        this.defaultScale = this.cache.get<MeasurementScale>(dto.getDefaultScale(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<MeasurementScale>();
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.general = this.cache.get<QuantityKind>(dto.getGeneral(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<QuantityKind>();
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.isDeprecated = dto.getIsDeprecated();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.possibleScale.resolveList(dto.getPossibleScale(), dto.getIterationContainerId(), this.cache);
        this.quantityDimensionSymbol = dto.getQuantityDimensionSymbol();
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();
        this.symbol = dto.getSymbol();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>SpecializedQuantityKind<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see SpecializedQuantityKind
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.SpecializedQuantityKind dto = new cdp4common.dto.SpecializedQuantityKind(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getCategory().add(this.category.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setDefaultScale(this.defaultScale != null ? this.defaultScale.getIid() : new UUID(0L, 0L));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setGeneral(this.general != null ? this.general.getIid() : new UUID(0L, 0L));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsDeprecated(this.isDeprecated);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.getPossibleScale().add(this.possibleScale.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setQuantityDimensionSymbol(this.quantityDimensionSymbol);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);
        dto.setSymbol(this.symbol);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
