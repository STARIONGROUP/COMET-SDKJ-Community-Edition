/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParameterValue.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

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
 * Representation of a single parameter with value.
 * This is a generalization of the simple parameter value concept.
 */
@CDPVersion(version = "1.1.0")
public abstract class AbstractParameterValue extends AbstractThing  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Initializes a new instance of the <code>ParameterValue<code/> class.
     *
     * @see ParameterValue
     */
    protected AbstractParameterValue() {
        this.value = new ValueArray<String>(this);
    }

    /**
     * Initializes a new instance of the <code>ParameterValue<code/> class.
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
     * @see ParameterValue
     */
    protected AbstractParameterValue(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.value = new ValueArray<String>(this);
    }

    /**
     * Property parameterType.
     * Reference to the applicable ParameterType
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ParameterType parameterType;

    /**
     * Property scale.
     * Reference to the applicable MeasurementScale if the ParameterType is a QuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private MeasurementScale scale;

    /**
     * List of ordered String.
     * The value
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private ValueArray<String> value;

    /**
     * Gets the parameterType.
     * Reference to the applicable ParameterType
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ParameterType getParameterType(){
         return this.parameterType;
    }

    /**
     * Gets the scale.
     * Reference to the applicable MeasurementScale if the ParameterType is a QuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public MeasurementScale getScale(){
         return this.scale;
    }

    /**
     * Gets a list of ordered String.
     * The value
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public ValueArray<String> getValue(){
         return this.value;
    }

    /**
     * Sets the parameterType.
     * Reference to the applicable ParameterType
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setParameterType(ParameterType parameterType){
        this.parameterType = parameterType;
    }

    /**
     * Sets the scale.
     * Reference to the applicable MeasurementScale if the ParameterType is a QuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setScale(MeasurementScale scale){
        this.scale = scale;
    }

    /**
     * Sets a list of ordered String.
     * The value
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     public void setValue(ValueArray<String> value){
        this.value = value;
    }

    /**
     * Creates and returns a copy of this <code>ParameterValue<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParameterValue<code/>.
     * 
     * @see ParameterValue
     */
    @Override
    public ParameterValue clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterValue)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ParameterValue<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ParameterValue
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.parameterType == null || this.parameterType.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property parameterType is null.");
            this.parameterType = SentinelThingProvider.getSentinel<ParameterType>();
            this.sentinelResetMap["parameterType"] = () -> this.parameterType = null;
        }

        int valueCount = this.value.size();
        if (valueCount < 1) {
            errorList.add("The number of elements in the property value is wrong. It should be at least 1.");
        }

        return errorList;
    }
}
