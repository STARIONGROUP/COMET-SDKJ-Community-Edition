/* --------------------------------------------------------------------------------------------------------------------
 * AbstractConversionBasedUnit.java
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
 * abstract specialization of MeasurementUnit that represents a measurement unit that is defined with respect to another reference unit through an explicit conversion relation
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
@ToString
@EqualsAndHashCode
public  abstract class ConversionBasedUnit extends MeasurementUnit  {
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
     * Initializes a new instance of the {@link ConversionBasedUnit} class.
     */
    protected ConversionBasedUnit() {
    }

    /**
     * Initializes a new instance of the {@link ConversionBasedUnit} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected ConversionBasedUnit(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
    }

    /**
     * Property conversionFactor.
     * definition of the conversion factor in the unit conversion relation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String conversionFactor;

    /**
     * Property referenceUnit.
     * reference to the MeasurementUnit with respect to which this ConversionBasedUnit is defined
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private MeasurementUnit referenceUnit;

    /**
     * Gets the conversionFactor.
     * definition of the conversion factor in the unit conversion relation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getConversionFactor(){
         return this.conversionFactor;
    }

    /**
     * Gets the referenceUnit.
     * reference to the MeasurementUnit with respect to which this ConversionBasedUnit is defined
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public MeasurementUnit getReferenceUnit(){
         return this.referenceUnit;
    }

    /**
     * Sets the conversionFactor.
     * definition of the conversion factor in the unit conversion relation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setConversionFactor(String conversionFactor){
        this.conversionFactor = conversionFactor;
    }

    /**
     * Sets the referenceUnit.
     * reference to the MeasurementUnit with respect to which this ConversionBasedUnit is defined
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setReferenceUnit(MeasurementUnit referenceUnit){
        this.referenceUnit = referenceUnit;
    }

    /**
     * Creates and returns a copy of this {@link ConversionBasedUnit} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ConversionBasedUnit}.
     */
    @Override
    public ConversionBasedUnit clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ConversionBasedUnit)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ConversionBasedUnit}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getConversionFactor().trim().isEmpty()) {
            errorList.add("The property conversionFactor is null or empty.");
        }

        if (this.getReferenceUnit() == null || this.getReferenceUnit().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property referenceUnit is null.");
            this.setReferenceUnit(SentinelThingProvider.getSentinel<MeasurementUnit>());
            this.sentinelResetMap.put("referenceUnit", new ActionImpl(() -> this.setReferenceUnit(null)));
        }

        return errorList;
    }
}
