/* --------------------------------------------------------------------------------------------------------------------
 * AbstractRequirementsContainerParameterValue.java
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
 * Representation of the simple parameter value concept for RequirementsContainer
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = RequirementsContainer.class, propertyName = "parameterValue")
public abstract class AbstractRequirementsContainerParameterValue extends AbstractParameterValue  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>RequirementsContainerParameterValue<code/> class.
     *
     * @see RequirementsContainerParameterValue
     */
    public AbstractRequirementsContainerParameterValue() {
    }

    /**
     * Initializes a new instance of the <code>RequirementsContainerParameterValue<code/> class.
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
     * @see RequirementsContainerParameterValue
     */
    public AbstractRequirementsContainerParameterValue(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Creates and returns a copy of this <code>RequirementsContainerParameterValue<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>RequirementsContainerParameterValue<code/>.
     *
     * @see RequirementsContainerParameterValue
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        RequirementsContainerParameterValue clone = (RequirementsContainerParameterValue)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setValue(new ValueArray<String>(this.value, this));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>RequirementsContainerParameterValue<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>RequirementsContainerParameterValue<code/>.
     * 
     * @see RequirementsContainerParameterValue
     */
    @Override
    public RequirementsContainerParameterValue clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (RequirementsContainerParameterValue)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>RequirementsContainerParameterValue<code/>.
     *
     * @return A list of potential errors.
     *
     * @see RequirementsContainerParameterValue
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>RequirementsContainerParameterValue<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see RequirementsContainerParameterValue
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.RequirementsContainerParameterValue dto = (cdp4common.dto.RequirementsContainerParameterValue)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.modifiedOn = dto.getModifiedOn();
        this.parameterType = this.cache.get<ParameterType>(dto.getParameterType(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<ParameterType>();
        this.revisionNumber = dto.getRevisionNumber();
        this.scale = (dto.getScale() != null) ? this.cache.get<MeasurementScale>(dto.getScale.getValue(), dto.getIterationContainerId()) : null;
        this.value = new ValueArray<String>(dto.getValue(), this);

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>RequirementsContainerParameterValue<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see RequirementsContainerParameterValue
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.RequirementsContainerParameterValue dto = new cdp4common.dto.RequirementsContainerParameterValue(this.iid, this.revisionNumber);

        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setModifiedOn(this.modifiedOn);
        dto.setParameterType(this.parameterType != null ? this.parameterType.getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.revisionNumber);
        dto.setScale(this.scale != null ? (UUID)this.scale.getIid() : null);
        dto.setValue(new ValueArray<String>(this.value, this));

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
