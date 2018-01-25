/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParameterValueSet.java
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
 * representation of the switch setting and all values for a Parameter
 */
@Container(clazz = Parameter.class, propertyName = "valueSet")
public abstract class AbstractParameterValueSet extends AbstractParameterValueSetBase  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>ParameterValueSet<code/> class.
     *
     * @see ParameterValueSet
     */
    public AbstractParameterValueSet() {
    }

    /**
     * Initializes a new instance of the <code>ParameterValueSet<code/> class.
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
     * @see ParameterValueSet
     */
    public AbstractParameterValueSet(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Creates and returns a copy of this <code>ParameterValueSet<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParameterValueSet<code/>.
     *
     * @see ParameterValueSet
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ParameterValueSet clone = (ParameterValueSet)this.clone();
        clone.setComputed(new ValueArray<String>(this.computed, this));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setFormula(new ValueArray<String>(this.formula, this));
        clone.setManual(new ValueArray<String>(this.manual, this));
        clone.setPublished(new ValueArray<String>(this.published, this));
        clone.setReference(new ValueArray<String>(this.reference, this));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>ParameterValueSet<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParameterValueSet<code/>.
     * 
     * @see ParameterValueSet
     */
    @Override
    public ParameterValueSet clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterValueSet)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ParameterValueSet<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ParameterValueSet
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ParameterValueSet<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ParameterValueSet
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParameterValueSet dto = (cdp4common.dto.ParameterValueSet)dtoThing;

        this.actualOption = (dto.getActualOption() != null) ? this.cache.get<Option>(dto.getActualOption.getValue(), dto.getIterationContainerId()) : null;
        this.actualState = (dto.getActualState() != null) ? this.cache.get<ActualFiniteState>(dto.getActualState.getValue(), dto.getIterationContainerId()) : null;
        this.computed = new ValueArray<String>(dto.getComputed(), this);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.formula = new ValueArray<String>(dto.getFormula(), this);
        this.manual = new ValueArray<String>(dto.getManual(), this);
        this.modifiedOn = dto.getModifiedOn();
        this.published = new ValueArray<String>(dto.getPublished(), this);
        this.reference = new ValueArray<String>(dto.getReference(), this);
        this.revisionNumber = dto.getRevisionNumber();
        this.valueSwitch = dto.getValueSwitch();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ParameterValueSet<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ParameterValueSet
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ParameterValueSet dto = new cdp4common.dto.ParameterValueSet(this.iid, this.revisionNumber);

        dto.setActualOption(this.actualOption != null ? (UUID)this.actualOption.getIid() : null);
        dto.setActualState(this.actualState != null ? (UUID)this.actualState.getIid() : null);
        dto.setComputed(new ValueArray<String>(this.computed, this));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setFormula(new ValueArray<String>(this.formula, this));
        dto.setManual(new ValueArray<String>(this.manual, this));
        dto.setModifiedOn(this.modifiedOn);
        dto.setPublished(new ValueArray<String>(this.published, this));
        dto.setReference(new ValueArray<String>(this.reference, this));
        dto.setRevisionNumber(this.revisionNumber);
        dto.setValueSwitch(this.valueSwitch);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
