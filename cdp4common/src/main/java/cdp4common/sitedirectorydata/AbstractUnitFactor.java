/* --------------------------------------------------------------------------------------------------------------------
 * AbstractUnitFactor.java
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
 * representation of a factor in the product of powers that defines a
 * DerivedUnit
 */
@Container(clazz = DerivedUnit.class, propertyName = "unitFactor")
public abstract class AbstractUnitFactor extends AbstractThing  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>UnitFactor<code/> class.
     *
     * @see UnitFactor
     */
    public AbstractUnitFactor() {
    }

    /**
     * Initializes a new instance of the <code>UnitFactor<code/> class.
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
     * @see UnitFactor
     */
    public AbstractUnitFactor(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property exponent.
     * definition of the exponent value of this UnitFactor
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String exponent;

    /**
     * Property unit.
     * reference to the MeasurementUnit of this UnitFactor
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private MeasurementUnit unit;

    /**
     * Gets the exponent.
     * definition of the exponent value of this UnitFactor
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getExponent(){
         return this.exponent;
    }

    /**
     * Gets the unit.
     * reference to the MeasurementUnit of this UnitFactor
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public MeasurementUnit getUnit(){
         return this.unit;
    }

    /**
     * Sets the exponent.
     * definition of the exponent value of this UnitFactor
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setExponent(String exponent){
        this.exponent = exponent;
    }

    /**
     * Sets the unit.
     * reference to the MeasurementUnit of this UnitFactor
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setUnit(MeasurementUnit unit){
        this.unit = unit;
    }

    /**
     * Creates and returns a copy of this <code>UnitFactor<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>UnitFactor<code/>.
     *
     * @see UnitFactor
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        UnitFactor clone = (UnitFactor)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>UnitFactor<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>UnitFactor<code/>.
     * 
     * @see UnitFactor
     */
    @Override
    public UnitFactor clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (UnitFactor)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>UnitFactor<code/>.
     *
     * @return A list of potential errors.
     *
     * @see UnitFactor
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.exponent.trim().isEmpty()) {
            errorList.add("The property exponent is null or empty.");
        }

        if (this.unit == null || this.unit.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property unit is null.");
            this.unit = SentinelThingProvider.getSentinel<MeasurementUnit>();
            this.sentinelResetMap["unit"] = () -> this.unit = null;
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>UnitFactor<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see UnitFactor
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.UnitFactor dto = (cdp4common.dto.UnitFactor)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.exponent = dto.getExponent();
        this.modifiedOn = dto.getModifiedOn();
        this.revisionNumber = dto.getRevisionNumber();
        this.unit = this.cache.get<MeasurementUnit>(dto.getUnit(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<MeasurementUnit>();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>UnitFactor<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see UnitFactor
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.UnitFactor dto = new cdp4common.dto.UnitFactor(this.iid, this.revisionNumber);

        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setExponent(this.exponent);
        dto.setModifiedOn(this.modifiedOn);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setUnit(this.unit != null ? this.unit.getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
