/* --------------------------------------------------------------------------------------------------------------------
 * AbstractDerivedUnit.java
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
 * specialization of MeasurementUnit that is defined as a product of powers of one or
 * more other measurement units
 * Examples 1: The measurement unit "metre per second" for "velocity"
 * is specified as the product of "metre" to the power one times "second"
 * to the power minus one.
 * Example 2: The measurement unit "micrometre per metre" for the
 * DerivedQuantityKind "linear expansion coefficient" is specified as the
 * product of (PrefixedUnit) "micrometre" to the power one times
 * (SimpleUnit) "metre" to the power minus one.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
public abstract class AbstractDerivedUnit extends AbstractMeasurementUnit  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>DerivedUnit<code/> class.
     *
     * @see DerivedUnit
     */
    public AbstractDerivedUnit() {
        this.unitFactor = new OrderedItemList<UnitFactor>(this, true);
    }

    /**
     * Initializes a new instance of the <code>DerivedUnit<code/> class.
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
     * @see DerivedUnit
     */
    public AbstractDerivedUnit(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.unitFactor = new OrderedItemList<UnitFactor>(this, true);
    }

    /**
     * List of ordered contained UnitFactor.
     * reference to one or more UnitFactors that define the product of powers of other MeasurementUnit(s) that defines this DerivedUnit
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<UnitFactor> unitFactor;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>DerivedUnit<code/>.
     *
     * @see Iterable
     * @see DerivedUnit
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of ordered contained UnitFactor.
     * reference to one or more UnitFactors that define the product of powers of other MeasurementUnit(s) that defines this DerivedUnit
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<UnitFactor> getUnitFactor(){
         return this.unitFactor;
    }

    /**
     * Sets a list of ordered contained UnitFactor.
     * reference to one or more UnitFactors that define the product of powers of other MeasurementUnit(s) that defines this DerivedUnit
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     protected void setUnitFactor(OrderedItemList<UnitFactor> unitFactor){
        this.unitFactor = unitFactor;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>DerivedUnit<code/>.
     *
     * @see Iterable
     * @see DerivedUnit
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.unitFactor);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>DerivedUnit<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DerivedUnit<code/>.
     *
     * @see DerivedUnit
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        DerivedUnit clone = (DerivedUnit)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));
        clone.setUnitFactor(cloneContainedThings ? new OrderedItemList<UnitFactor>(clone, true) : new OrderedItemList<UnitFactor>(this.unitFactor, clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getUnitFactor().addAll(this.unitFactor.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>DerivedUnit<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DerivedUnit<code/>.
     * 
     * @see DerivedUnit
     */
    @Override
    public DerivedUnit clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DerivedUnit)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>DerivedUnit<code/>.
     *
     * @return A list of potential errors.
     *
     * @see DerivedUnit
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int unitFactorCount = this.unitFactor.size();
        if (unitFactorCount < 1) {
            errorList.add("The number of elements in the property unitFactor is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>DerivedUnit<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see DerivedUnit
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.DerivedUnit dto = (cdp4common.dto.DerivedUnit)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.isDeprecated = dto.getIsDeprecated();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();
        this.unitFactor.resolveList(dto.getUnitFactor(), dto.getIterationContainerId(), this.cache);

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>DerivedUnit<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see DerivedUnit
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.DerivedUnit dto = new cdp4common.dto.DerivedUnit(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsDeprecated(this.isDeprecated);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);
        dto.getUnitFactor().add(this.unitFactor.toDtoOrderedItemList());

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
