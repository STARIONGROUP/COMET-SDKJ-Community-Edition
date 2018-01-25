/* --------------------------------------------------------------------------------------------------------------------
 * AbstractDerivedQuantityKind.java
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
 * specialization of QuantityKind that represents a kind of quantity that is defined as a product of powers of one or more other kinds of quantity
 * Note: A DerivedQuantityKind must define at least one <i>possibleScale</i>.
 * Examples 1: DerivedQuantityKind "velocity" can be specified as the product of SimpleQuantityKind "length" to the power one times SimpleQuantityKind "time" to the power minus one.
 * Example 2: DerivedQuantityKind "linear expansion coefficient" can be specified as the product of "length" to the power one times "length" to the power minus one. So, it is permissible to use the same QuantityKind more than once in the list of <i>quantityKindFactor</i>.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
public abstract class AbstractDerivedQuantityKind extends AbstractQuantityKind  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>DerivedQuantityKind<code/> class.
     *
     * @see DerivedQuantityKind
     */
    public AbstractDerivedQuantityKind() {
        this.quantityKindFactor = new OrderedItemList<QuantityKindFactor>(this, true);
    }

    /**
     * Initializes a new instance of the <code>DerivedQuantityKind<code/> class.
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
     * @see DerivedQuantityKind
     */
    public AbstractDerivedQuantityKind(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.quantityKindFactor = new OrderedItemList<QuantityKindFactor>(this, true);
    }

    /**
     * List of ordered contained QuantityKindFactor.
     * reference to one or more QuantityKindFactors that define the product of powers of other kind(s) of quantity that define this DerivedQuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<QuantityKindFactor> quantityKindFactor;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>DerivedQuantityKind<code/>.
     *
     * @see Iterable
     * @see DerivedQuantityKind
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of ordered contained QuantityKindFactor.
     * reference to one or more QuantityKindFactors that define the product of powers of other kind(s) of quantity that define this DerivedQuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<QuantityKindFactor> getQuantityKindFactor(){
         return this.quantityKindFactor;
    }

    /**
     * Sets a list of ordered contained QuantityKindFactor.
     * reference to one or more QuantityKindFactors that define the product of powers of other kind(s) of quantity that define this DerivedQuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     protected void setQuantityKindFactor(OrderedItemList<QuantityKindFactor> quantityKindFactor){
        this.quantityKindFactor = quantityKindFactor;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>DerivedQuantityKind<code/>.
     *
     * @see Iterable
     * @see DerivedQuantityKind
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.quantityKindFactor);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>DerivedQuantityKind<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DerivedQuantityKind<code/>.
     *
     * @see DerivedQuantityKind
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        DerivedQuantityKind clone = (DerivedQuantityKind)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setCategory(new List<Category>(this.category));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));
        clone.setPossibleScale(new List<MeasurementScale>(this.possibleScale));
        clone.setQuantityKindFactor(cloneContainedThings ? new OrderedItemList<QuantityKindFactor>(clone, true) : new OrderedItemList<QuantityKindFactor>(this.quantityKindFactor, clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getQuantityKindFactor().addAll(this.quantityKindFactor.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>DerivedQuantityKind<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DerivedQuantityKind<code/>.
     * 
     * @see DerivedQuantityKind
     */
    @Override
    public DerivedQuantityKind clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DerivedQuantityKind)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>DerivedQuantityKind<code/>.
     *
     * @return A list of potential errors.
     *
     * @see DerivedQuantityKind
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int quantityKindFactorCount = this.quantityKindFactor.size();
        if (quantityKindFactorCount < 1) {
            errorList.add("The number of elements in the property quantityKindFactor is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>DerivedQuantityKind<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see DerivedQuantityKind
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.DerivedQuantityKind dto = (cdp4common.dto.DerivedQuantityKind)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.cache);
        this.defaultScale = this.cache.get<MeasurementScale>(dto.getDefaultScale(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<MeasurementScale>();
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.isDeprecated = dto.getIsDeprecated();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.possibleScale.resolveList(dto.getPossibleScale(), dto.getIterationContainerId(), this.cache);
        this.quantityDimensionSymbol = dto.getQuantityDimensionSymbol();
        this.quantityKindFactor.resolveList(dto.getQuantityKindFactor(), dto.getIterationContainerId(), this.cache);
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();
        this.symbol = dto.getSymbol();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>DerivedQuantityKind<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see DerivedQuantityKind
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.DerivedQuantityKind dto = new cdp4common.dto.DerivedQuantityKind(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getCategory().add(this.category.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setDefaultScale(this.defaultScale != null ? this.defaultScale.getIid() : new UUID(0L, 0L));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsDeprecated(this.isDeprecated);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.getPossibleScale().add(this.possibleScale.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setQuantityDimensionSymbol(this.quantityDimensionSymbol);
        dto.getQuantityKindFactor().add(this.quantityKindFactor.toDtoOrderedItemList());
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);
        dto.setSymbol(this.symbol);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
