/* --------------------------------------------------------------------------------------------------------------------
 * DerivedUnit.java
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
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

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
@ToString
@EqualsAndHashCode(callSuper = true)
public class DerivedUnit extends MeasurementUnit implements Cloneable {
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
     * Initializes a new instance of the {@link DerivedUnit} class.
     */
    public DerivedUnit() {
        this.unitFactor = new OrderedItemList<UnitFactor>(this, true, UnitFactor.class);
    }

    /**
     * Initializes a new instance of the {@link DerivedUnit} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public DerivedUnit(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.unitFactor = new OrderedItemList<UnitFactor>(this, true, UnitFactor.class);
    }

    /**
     * List of ordered contained UnitFactor.
     * reference to one or more UnitFactors that define the product of powers of other MeasurementUnit(s) that defines this DerivedUnit
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private OrderedItemList<UnitFactor> unitFactor;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link DerivedUnit}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link DerivedUnit}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.unitFactor);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link DerivedUnit} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DerivedUnit}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        DerivedUnit clone;
        try {
            clone = (DerivedUnit)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow DerivedUnit cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));
        clone.setUnitFactor(cloneContainedThings ? new OrderedItemList<UnitFactor>(clone, true, UnitFactor.class) : new OrderedItemList<UnitFactor>(this.getUnitFactor(), clone, UnitFactor.class));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getUnitFactor().addAll(this.getUnitFactor().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link DerivedUnit} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DerivedUnit}.
     */
    @Override
    public DerivedUnit clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DerivedUnit)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this DerivedUnit}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int unitFactorCount = this.getUnitFactor().size();
        if (unitFactorCount < 1) {
            errorList.add("The number of elements in the property unitFactor is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link DerivedUnit} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.DerivedUnit dto = (cdp4common.dto.DerivedUnit)dtoThing;

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        PojoThingFactory.resolveList(this.getDefinition(), dto.getDefinition(), dto.getIterationContainerId(), this.getCache(), Definition.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getHyperLink(), dto.getHyperLink(), dto.getIterationContainerId(), this.getCache(), HyperLink.class);
        this.setDeprecated(dto.isDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        PojoThingFactory.resolveList(this.getUnitFactor(), dto.getUnitFactor(), dto.getIterationContainerId(), this.getCache(), UnitFactor.class);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link DerivedUnit}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.DerivedUnit dto = new cdp4common.dto.DerivedUnit(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDeprecated(this.isDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.getUnitFactor().addAll(this.getUnitFactor().toDtoOrderedItemList());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
