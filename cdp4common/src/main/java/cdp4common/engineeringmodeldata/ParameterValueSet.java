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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of the switch setting and all values for a Parameter
 */
@Container(clazz = Parameter.class, propertyName = "valueSet")
@ToString
@EqualsAndHashCode
public  class ParameterValueSet extends ParameterValueSetBase  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the <code>ParameterValueSet<code/> class.
     *
     * @see ParameterValueSet
     */
    public ParameterValueSet() {
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
    public ParameterValueSet(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
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
        clone.setComputed(new ValueArray<String>(this.getComputed(), this));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setFormula(new ValueArray<String>(this.getFormula(), this));
        clone.setManual(new ValueArray<String>(this.getManual(), this));
        clone.setPublished(new ValueArray<String>(this.getPublished(), this));
        clone.setReference(new ValueArray<String>(this.getReference(), this));

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

        this.setActualOption((dto.getActualOption() != null) ? this.getCache().get<Option>(dto.getActualOption.getValue(), dto.getIterationContainerId()) : null);
        this.setActualState((dto.getActualState() != null) ? this.getCache().get<ActualFiniteState>(dto.getActualState.getValue(), dto.getIterationContainerId()) : null);
        this.setComputed(new ValueArray<String>(dto.getComputed(), this));
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setFormula(new ValueArray<String>(dto.getFormula(), this));
        this.setManual(new ValueArray<String>(dto.getManual(), this));
        this.setModifiedOn(dto.getModifiedOn());
        this.setPublished(new ValueArray<String>(dto.getPublished(), this));
        this.setReference(new ValueArray<String>(dto.getReference(), this));
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setValueSwitch(dto.getValueSwitch());

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
        cdp4common.dto.ParameterValueSet dto = new cdp4common.dto.ParameterValueSet(this.getIid(), this.getRevisionNumber());

        dto.setActualOption(this.getActualOption() != null ? (UUID)this.getActualOption().getIid() : null);
        dto.setActualState(this.getActualState() != null ? (UUID)this.getActualState().getIid() : null);
        dto.setComputed(new ValueArray<String>(this.getComputed(), this));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setFormula(new ValueArray<String>(this.getFormula(), this));
        dto.setManual(new ValueArray<String>(this.getManual(), this));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setPublished(new ValueArray<String>(this.getPublished(), this));
        dto.setReference(new ValueArray<String>(this.getReference(), this));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setValueSwitch(this.getValueSwitch());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
