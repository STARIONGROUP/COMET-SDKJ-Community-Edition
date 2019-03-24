/* --------------------------------------------------------------------------------------------------------------------
 * UnitFactor.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
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
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * representation of a factor in the product of powers that defines a
 * DerivedUnit
 */
@Container(clazz = DerivedUnit.class, propertyName = "unitFactor")
@ToString
@EqualsAndHashCode(callSuper = true)
public class UnitFactor extends Thing implements Cloneable {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the {@link UnitFactor} class.
     */
    public UnitFactor() {
    }

    /**
     * Initializes a new instance of the {@link UnitFactor} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public UnitFactor(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property exponent.
     * definition of the exponent value of this UnitFactor
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String exponent;

    /**
     * Property unit.
     * reference to the MeasurementUnit of this UnitFactor
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private MeasurementUnit unit;

    /**
     * Creates and returns a copy of this {@link UnitFactor} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link UnitFactor}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        UnitFactor clone;
        try {
            clone = (UnitFactor)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow UnitFactor cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link UnitFactor} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link UnitFactor}.
     */
    @Override
    public UnitFactor clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (UnitFactor)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this UnitFactor}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (Strings.isNullOrEmpty(this.getExponent())) {
            errorList.add("The property exponent is null or empty.");
        }

        if (this.getUnit() == null || this.getUnit().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property unit is null.");
            this.setUnit(SentinelThingProvider.getSentinel(MeasurementUnit.class));
            this.sentinelResetMap.put("unit", new ActionImpl(() -> this.setUnit(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link UnitFactor} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.UnitFactor dto = (cdp4common.dto.UnitFactor)dtoThing;

        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setExponent(dto.getExponent());
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setUnit(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getUnit(), dto.getIterationContainerId(), MeasurementUnit.class), SentinelThingProvider.getSentinel(MeasurementUnit.class)));

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link UnitFactor}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.UnitFactor dto = new cdp4common.dto.UnitFactor(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setExponent(this.getExponent());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setUnit(this.getUnit() != null ? this.getUnit().getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
