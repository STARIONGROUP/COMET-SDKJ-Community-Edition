/* --------------------------------------------------------------------------------------------------------------------
 * AbstractQuantityKindFactor.java
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
 * representation of a QuantityKind and an exponent that together define one factor in a product of powers of QuantityKinds
 */
@Container(clazz = DerivedQuantityKind.class, propertyName = "quantityKindFactor")
@ToString
@EqualsAndHashCode
public  class QuantityKindFactor extends Thing implements Cloneable {
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
     * Initializes a new instance of the {@link QuantityKindFactor} class.
     */
    public QuantityKindFactor() {
    }

    /**
     * Initializes a new instance of the {@link QuantityKindFactor} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public QuantityKindFactor(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
    }

    /**
     * Property exponent.
     * definition of the relevant exponent
     * Note: The exponent does not need to be an integer number. There exist cases where fractional exponents are needed.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String exponent;

    /**
     * Property quantityKind.
     * reference to the relevant QuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private QuantityKind quantityKind;

    /**
     * Gets the exponent.
     * definition of the relevant exponent
     * Note: The exponent does not need to be an integer number. There exist cases where fractional exponents are needed.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getExponent(){
         return this.exponent;
    }

    /**
     * Gets the quantityKind.
     * reference to the relevant QuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public QuantityKind getQuantityKind(){
         return this.quantityKind;
    }

    /**
     * Sets the exponent.
     * definition of the relevant exponent
     * Note: The exponent does not need to be an integer number. There exist cases where fractional exponents are needed.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setExponent(String exponent){
        this.exponent = exponent;
    }

    /**
     * Sets the quantityKind.
     * reference to the relevant QuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setQuantityKind(QuantityKind quantityKind){
        this.quantityKind = quantityKind;
    }

    /**
     * Creates and returns a copy of this {@link QuantityKindFactor} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link QuantityKindFactor}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        QuantityKindFactor clone;
        try {
            clone = (QuantityKindFactor)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow QuantityKindFactor cannot be cloned.");
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
     * Creates and returns a copy of this {@link QuantityKindFactor} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link QuantityKindFactor}.
     */
    @Override
    public QuantityKindFactor clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (QuantityKindFactor)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>QuantityKindFactor}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getExponent().trim().isEmpty()) {
            errorList.add("The property exponent is null or empty.");
        }

        if (this.getQuantityKind() == null || this.getQuantityKind().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property quantityKind is null.");
            this.setQuantityKind(SentinelThingProvider.getSentinel<QuantityKind>());
            this.sentinelResetMap.put("quantityKind", new ActionImpl(() -> this.setQuantityKind(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link QuantityKindFactor} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.QuantityKindFactor dto = (cdp4common.dto.QuantityKindFactor)dtoThing;

        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setExponent(dto.getExponent());
        this.setModifiedOn(dto.getModifiedOn());
        this.setQuantityKind(this.getCache().get<QuantityKind>(dto.getQuantityKind(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<QuantityKind>());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link QuantityKindFactor}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.QuantityKindFactor dto = new cdp4common.dto.QuantityKindFactor(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setExponent(this.getExponent());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setQuantityKind(this.getQuantityKind() != null ? this.getQuantityKind().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
