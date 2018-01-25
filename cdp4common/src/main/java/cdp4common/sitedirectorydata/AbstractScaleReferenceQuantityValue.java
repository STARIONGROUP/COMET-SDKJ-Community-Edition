/* --------------------------------------------------------------------------------------------------------------------
 * AbstractScaleReferenceQuantityValue.java
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
 * representation of a reference quantity with value for the definition of logarithmic MeasurementScales
 * Note: See property <i>referenceQuantity</i> of LogarithmicScale for details.
 */
@Container(clazz = LogarithmicScale.class, propertyName = "referenceQuantityValue")
public abstract class AbstractScaleReferenceQuantityValue extends AbstractThing  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>ScaleReferenceQuantityValue<code/> class.
     *
     * @see ScaleReferenceQuantityValue
     */
    public AbstractScaleReferenceQuantityValue() {
    }

    /**
     * Initializes a new instance of the <code>ScaleReferenceQuantityValue<code/> class.
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
     * @see ScaleReferenceQuantityValue
     */
    public AbstractScaleReferenceQuantityValue(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property scale.
     * reference to the MeasurementScale on which the <i>value</i> is expressed
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private MeasurementScale scale;

    /**
     * Property value.
     * definition of the value of this ScaleReferenceQuantityValue
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String value;

    /**
     * Gets the scale.
     * reference to the MeasurementScale on which the <i>value</i> is expressed
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public MeasurementScale getScale(){
         return this.scale;
    }

    /**
     * Gets the value.
     * definition of the value of this ScaleReferenceQuantityValue
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getValue(){
         return this.value;
    }

    /**
     * Sets the scale.
     * reference to the MeasurementScale on which the <i>value</i> is expressed
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setScale(MeasurementScale scale){
        this.scale = scale;
    }

    /**
     * Sets the value.
     * definition of the value of this ScaleReferenceQuantityValue
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setValue(String value){
        this.value = value;
    }

    /**
     * Creates and returns a copy of this <code>ScaleReferenceQuantityValue<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ScaleReferenceQuantityValue<code/>.
     *
     * @see ScaleReferenceQuantityValue
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ScaleReferenceQuantityValue clone = (ScaleReferenceQuantityValue)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>ScaleReferenceQuantityValue<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ScaleReferenceQuantityValue<code/>.
     * 
     * @see ScaleReferenceQuantityValue
     */
    @Override
    public ScaleReferenceQuantityValue clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ScaleReferenceQuantityValue)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ScaleReferenceQuantityValue<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ScaleReferenceQuantityValue
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.scale == null || this.scale.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property scale is null.");
            this.scale = SentinelThingProvider.getSentinel<MeasurementScale>();
            this.sentinelResetMap["scale"] = () -> this.scale = null;
        }

        if (this.value.trim().isEmpty()) {
            errorList.add("The property value is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ScaleReferenceQuantityValue<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ScaleReferenceQuantityValue
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ScaleReferenceQuantityValue dto = (cdp4common.dto.ScaleReferenceQuantityValue)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.modifiedOn = dto.getModifiedOn();
        this.revisionNumber = dto.getRevisionNumber();
        this.scale = this.cache.get<MeasurementScale>(dto.getScale(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<MeasurementScale>();
        this.value = dto.getValue();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ScaleReferenceQuantityValue<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ScaleReferenceQuantityValue
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ScaleReferenceQuantityValue dto = new cdp4common.dto.ScaleReferenceQuantityValue(this.iid, this.revisionNumber);

        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setModifiedOn(this.modifiedOn);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setScale(this.scale != null ? this.scale.getIid() : new UUID(0L, 0L));
        dto.setValue(this.value);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
