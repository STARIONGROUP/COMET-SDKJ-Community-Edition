/* --------------------------------------------------------------------------------------------------------------------
 * ScaleReferenceQuantityValue.java
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
import org.apache.commons.lang3.tuple.Pair;
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of a reference quantity with value for the definition of logarithmic MeasurementScales
 * Note: See property <i>referenceQuantity</i> of LogarithmicScale for details.
 */
@Container(clazz = LogarithmicScale.class, propertyName = "referenceQuantityValue")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ScaleReferenceQuantityValue extends Thing implements Cloneable {
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
     * Initializes a new instance of the {@link ScaleReferenceQuantityValue} class.
     */
    public ScaleReferenceQuantityValue() {
    }

    /**
     * Initializes a new instance of the {@link ScaleReferenceQuantityValue} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ScaleReferenceQuantityValue(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property scale.
     * reference to the MeasurementScale on which the <i>value</i> is expressed
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private MeasurementScale scale;

    /**
     * Property value.
     * definition of the value of this ScaleReferenceQuantityValue
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String value;

    /**
     * Creates and returns a copy of this {@link ScaleReferenceQuantityValue} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ScaleReferenceQuantityValue}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ScaleReferenceQuantityValue clone;
        try {
            clone = (ScaleReferenceQuantityValue)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ScaleReferenceQuantityValue cannot be cloned.");
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
     * Creates and returns a copy of this {@link ScaleReferenceQuantityValue} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ScaleReferenceQuantityValue}.
     */
    @Override
    public ScaleReferenceQuantityValue clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ScaleReferenceQuantityValue)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ScaleReferenceQuantityValue}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getScale() == null || this.getScale().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property scale is null.");
            this.setScale(SentinelThingProvider.getSentinel(MeasurementScale.class));
            this.sentinelResetMap.put("scale", new ActionImpl(() -> this.setScale(null)));
        }

        if (this.getValue().trim().isEmpty()) {
            errorList.add("The property value is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ScaleReferenceQuantityValue} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ScaleReferenceQuantityValue dto = (cdp4common.dto.ScaleReferenceQuantityValue)dtoThing;

        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setScale(this.getCache().get<MeasurementScale>(dto.getScale(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel(MeasurementScale.class));
        this.setValue(dto.getValue());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ScaleReferenceQuantityValue}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() throws ContainmentException {
        cdp4common.dto.ScaleReferenceQuantityValue dto = new cdp4common.dto.ScaleReferenceQuantityValue(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setScale(this.getScale() != null ? this.getScale().getIid() : new UUID(0L, 0L));
        dto.setValue(this.getValue());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
