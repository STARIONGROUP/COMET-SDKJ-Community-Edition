/* --------------------------------------------------------------------------------------------------------------------
 * DerivedQuantityKind.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.exceptions.ContainmentException;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.tuple.Pair;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * specialization of QuantityKind that represents a kind of quantity that is defined as a product of powers of one or more other kinds of quantity
 * Note: A DerivedQuantityKind must define at least one <i>possibleScale</i>.
 * Examples 1: DerivedQuantityKind "velocity" can be specified as the product of SimpleQuantityKind "length" to the power one times SimpleQuantityKind "time" to the power minus one.
 * Example 2: DerivedQuantityKind "linear expansion coefficient" can be specified as the product of "length" to the power one times "length" to the power minus one. So, it is permissible to use the same QuantityKind more than once in the list of <i>quantityKindFactor</i>.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
@EqualsAndHashCode(callSuper = true)
public class DerivedQuantityKind extends QuantityKind implements Cloneable {
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
        this.quantityKindFactor = new OrderedItemList<QuantityKindFactor>(this, true, QuantityKindFactor.class);
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
        super(iid, cache, iDalUri);
        this.quantityKindFactor = new OrderedItemList<QuantityKindFactor>(this, true, QuantityKindFactor.class);
    }

    /**
     * List of ordered contained QuantityKindFactor.
     * reference to one or more QuantityKindFactors that define the product of powers of other kind(s) of quantity that define this DerivedQuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private OrderedItemList<QuantityKindFactor> quantityKindFactor;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link DerivedQuantityKind}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link DerivedQuantityKind}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
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
    protected Thing genericClone(boolean cloneContainedThings) {
        DerivedQuantityKind clone;
        try {
            clone = (DerivedQuantityKind)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow DerivedQuantityKind cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));
        clone.setPossibleScale(new ArrayList<MeasurementScale>(this.getPossibleScale()));
        clone.setQuantityKindFactor(cloneContainedThings ? new OrderedItemList<QuantityKindFactor>(clone, true, QuantityKindFactor.class) : new OrderedItemList<QuantityKindFactor>(this.getQuantityKindFactor(), clone, QuantityKindFactor.class));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getQuantityKindFactor().addAll(this.getQuantityKindFactor().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
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
    public DerivedQuantityKind clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DerivedQuantityKind)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this DerivedQuantityKind}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
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

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        PojoThingFactory.resolveList(this.getCategory(), dto.getCategory(), dto.getIterationContainerId(), this.getCache(), Category.class);
        this.setDefaultScale(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getDefaultScale(), dto.getIterationContainerId(), MeasurementScale.class), SentinelThingProvider.getSentinel(MeasurementScale.class)));
        PojoThingFactory.resolveList(this.getDefinition(), dto.getDefinition(), dto.getIterationContainerId(), this.getCache(), Definition.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getHyperLink(), dto.getHyperLink(), dto.getIterationContainerId(), this.getCache(), HyperLink.class);
        this.setDeprecated(dto.isDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        PojoThingFactory.resolveList(this.getPossibleScale(), dto.getPossibleScale(), dto.getIterationContainerId(), this.getCache(), MeasurementScale.class);
        this.setQuantityDimensionSymbol(dto.getQuantityDimensionSymbol());
        PojoThingFactory.resolveList(this.getQuantityKindFactor(), dto.getQuantityKindFactor(), dto.getIterationContainerId(), this.getCache(), QuantityKindFactor.class);
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

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getCategory().addAll(this.getCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDefaultScale(this.getDefaultScale() != null ? this.getDefaultScale().getIid() : new UUID(0L, 0L));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDeprecated(this.isDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getPossibleScale().addAll(this.getPossibleScale().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setQuantityDimensionSymbol(this.getQuantityDimensionSymbol());
        dto.getQuantityKindFactor().addAll(this.getQuantityKindFactor().toDtoOrderedItemList());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.setSymbol(this.getSymbol());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
