/* --------------------------------------------------------------------------------------------------------------------
 * RuleViolation.java
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
 * representing of information concerning the violation of a built-in or user-defined rule
 */
@Container(clazz = RuleVerification.class, propertyName = "violation")
@ToString
@EqualsAndHashCode(callSuper = true)
public class RuleViolation extends Thing implements Cloneable {
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
     * Initializes a new instance of the {@link RuleViolation} class.
     */
    public RuleViolation() {
        this.violatingThing = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link RuleViolation} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public RuleViolation(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.violatingThing = new ArrayList<UUID>();
    }

    /**
     * Property description.
     * textual explanation of the violation of the rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String description;

    /**
     * List of UUID.
     * optional weak references to Things in the EngineeringModel that are associated with the violation of the rule verified in the containing RuleVerification
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<UUID> violatingThing;

    /**
     * Creates and returns a copy of this {@link RuleViolation} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link RuleViolation}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        RuleViolation clone;
        try {
            clone = (RuleViolation)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow RuleViolation cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setViolatingThing(new ArrayList<UUID>(this.getViolatingThing()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link RuleViolation} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link RuleViolation}.
     */
    @Override
    public RuleViolation clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (RuleViolation)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this RuleViolation}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getDescription().trim().isEmpty()) {
            errorList.add("The property description is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link RuleViolation} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.RuleViolation dto = (cdp4common.dto.RuleViolation)dtoThing;

        this.setDescription(dto.getDescription());
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());
        PojoThingFactory.clearAndAddRange(this.getViolatingThing(), dto.getViolatingThing());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link RuleViolation}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.RuleViolation dto = new cdp4common.dto.RuleViolation(this.getIid(), this.getRevisionNumber());

        dto.setDescription(this.getDescription());
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.getViolatingThing().addAll(this.getViolatingThing());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
