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

/**
 * abstract specialization of MeasurementUnit that represents a measurement unit that is defined with respect to another reference unit through an explicit conversion relation
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
public abstract class AbstractConversionBasedUnit extends AbstractMeasurementUnit  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>ConversionBasedUnit<code/> class.
     *
     * @see ConversionBasedUnit
     */
    protected AbstractConversionBasedUnit() {
    }

    /**
     * Initializes a new instance of the <code>ConversionBasedUnit<code/> class.
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
     * @see ConversionBasedUnit
     */
    protected AbstractConversionBasedUnit(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
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
     * Creates and returns a copy of this <code>ConversionBasedUnit<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ConversionBasedUnit<code/>.
     * 
     * @see ConversionBasedUnit
     */
    @Override
    public ConversionBasedUnit clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ConversionBasedUnit)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ConversionBasedUnit<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ConversionBasedUnit
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.conversionFactor.trim().isEmpty()) {
            errorList.add("The property conversionFactor is null or empty.");
        }

        if (this.referenceUnit == null || this.referenceUnit.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property referenceUnit is null.");
            this.referenceUnit = SentinelThingProvider.getSentinel<MeasurementUnit>();
            this.sentinelResetMap["referenceUnit"] = () -> this.referenceUnit = null;
        }

        return errorList;
    }
}
