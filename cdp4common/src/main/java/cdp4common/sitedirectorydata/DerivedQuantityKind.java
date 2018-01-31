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
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * specialization of QuantityKind that represents a kind of quantity that is defined as a product of powers of one or more other kinds of quantity
 * Note: A DerivedQuantityKind must define at least one <i>possibleScale</i>.
 * Examples 1: DerivedQuantityKind "velocity" can be specified as the product of SimpleQuantityKind "length" to the power one times SimpleQuantityKind "time" to the power minus one.
 * Example 2: DerivedQuantityKind "linear expansion coefficient" can be specified as the product of "length" to the power one times "length" to the power minus one. So, it is permissible to use the same QuantityKind more than once in the list of <i>quantityKindFactor</i>.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
@EqualsAndHashCode
public  class DerivedQuantityKind extends QuantityKind  {
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
     * Initializes a new instance of the {@link DerivedQuantityKind} class.
     */
    public DerivedQuantityKind() {
        this.quantityKindFactor = new OrderedItemList<QuantityKindFactor>(this, true);
    }

    /**
     * Initializes a new instance of the {@link DerivedQuantityKind} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public DerivedQuantityKind(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.quantityKindFactor = new OrderedItemList<QuantityKindFactor>(this, true);
    }

    /**
     * List of ordered contained QuantityKindFactor.
     * reference to one or more QuantityKindFactors that define the product of powers of other kind(s) of quantity that define this DerivedQuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<QuantityKindFactor> quantityKindFactor;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link DerivedQuantityKind}.
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
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link DerivedQuantityKind}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
        containers.add(this.quantityKindFactor);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link DerivedQuantityKind} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DerivedQuantityKind}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        DerivedQuantityKind clone = (DerivedQuantityKind)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));
        clone.setPossibleScale(new ArrayList<MeasurementScale>(this.getPossibleScale()));
        clone.setQuantityKindFactor(cloneContainedThings ? new OrderedItemList<QuantityKindFactor>(clone, true) : new OrderedItemList<QuantityKindFactor>(this.getQuantityKindFactor(), clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getQuantityKindFactor().addAll(this.getQuantityKindFactor().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link DerivedQuantityKind} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DerivedQuantityKind}.
     */
    @Override
    public DerivedQuantityKind clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DerivedQuantityKind)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>DerivedQuantityKind}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int quantityKindFactorCount = this.getQuantityKindFactor().size();
        if (quantityKindFactorCount < 1) {
            errorList.add("The number of elements in the property quantityKindFactor is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link DerivedQuantityKind} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.DerivedQuantityKind dto = (cdp4common.dto.DerivedQuantityKind)dtoThing;

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.getCategory().resolveList(dto.getCategory(), dto.getIterationContainerId(), this.getCache());
        this.setDefaultScale(this.getCache().get<MeasurementScale>(dto.getDefaultScale(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<MeasurementScale>());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setDeprecated(dto.getDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.getPossibleScale().resolveList(dto.getPossibleScale(), dto.getIterationContainerId(), this.getCache());
        this.setQuantityDimensionSymbol(dto.getQuantityDimensionSymbol());
        this.getQuantityKindFactor().resolveList(dto.getQuantityKindFactor(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.setSymbol(dto.getSymbol());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link DerivedQuantityKind}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.DerivedQuantityKind dto = new cdp4common.dto.DerivedQuantityKind(this.getIid(), this.getRevisionNumber());

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getCategory().add(this.getCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setDefaultScale(this.getDefaultScale() != null ? this.getDefaultScale().getIid() : new UUID(0L, 0L));
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setDeprecated(this.getDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getPossibleScale().add(this.getPossibleScale().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setQuantityDimensionSymbol(this.getQuantityDimensionSymbol());
        dto.getQuantityKindFactor().add(this.getQuantityKindFactor().toDtoOrderedItemList());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.setSymbol(this.getSymbol());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
