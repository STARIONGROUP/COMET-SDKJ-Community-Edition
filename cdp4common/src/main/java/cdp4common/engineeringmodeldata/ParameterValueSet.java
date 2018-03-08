/* --------------------------------------------------------------------------------------------------------------------
 * ParameterValueSet.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

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
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.tuple.Pair;
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of the switch setting and all values for a Parameter
 */
@Container(clazz = Parameter.class, propertyName = "valueSet")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ParameterValueSet extends ParameterValueSetBase implements Cloneable {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the {@link ParameterValueSet} class.
     */
    public ParameterValueSet() {
    }

    /**
     * Initializes a new instance of the {@link ParameterValueSet} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ParameterValueSet(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Creates and returns a copy of this {@link ParameterValueSet} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterValueSet}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ParameterValueSet clone;
        try {
            clone = (ParameterValueSet)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ParameterValueSet cannot be cloned.");
        }

        clone.setComputed(new ValueArray<String>(this.getComputed(), this, String.class));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setFormula(new ValueArray<String>(this.getFormula(), this, String.class));
        clone.setManual(new ValueArray<String>(this.getManual(), this, String.class));
        clone.setPublished(new ValueArray<String>(this.getPublished(), this, String.class));
        clone.setReference(new ValueArray<String>(this.getReference(), this, String.class));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ParameterValueSet} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterValueSet}.
     */
    @Override
    public ParameterValueSet clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterValueSet)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ParameterValueSet}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ParameterValueSet} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParameterValueSet dto = (cdp4common.dto.ParameterValueSet)dtoThing;

        this.setActualOption((dto.getActualOption() != null) ? PojoThingFactory.get(this.getCache(), dto.getActualOption(), dto.getIterationContainerId(), Option.class) : null);
        this.setActualState((dto.getActualState() != null) ? PojoThingFactory.get(this.getCache(), dto.getActualState(), dto.getIterationContainerId(), ActualFiniteState.class) : null);
        this.setComputed(new ValueArray<String>(dto.getComputed(), this, String.class));
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setFormula(new ValueArray<String>(dto.getFormula(), this, String.class));
        this.setManual(new ValueArray<String>(dto.getManual(), this, String.class));
        this.setModifiedOn(dto.getModifiedOn());
        this.setPublished(new ValueArray<String>(dto.getPublished(), this, String.class));
        this.setReference(new ValueArray<String>(dto.getReference(), this, String.class));
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setValueSwitch(dto.getValueSwitch());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ParameterValueSet}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ParameterValueSet dto = new cdp4common.dto.ParameterValueSet(this.getIid(), this.getRevisionNumber());

        dto.setActualOption(this.getActualOption() != null ? (UUID)this.getActualOption().getIid() : null);
        dto.setActualState(this.getActualState() != null ? (UUID)this.getActualState().getIid() : null);
        dto.setComputed(new ValueArray<String>(this.getComputed(), this, String.class));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setFormula(new ValueArray<String>(this.getFormula(), this, String.class));
        dto.setManual(new ValueArray<String>(this.getManual(), this, String.class));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setPublished(new ValueArray<String>(this.getPublished(), this, String.class));
        dto.setReference(new ValueArray<String>(this.getReference(), this, String.class));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setValueSwitch(this.getValueSwitch());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
