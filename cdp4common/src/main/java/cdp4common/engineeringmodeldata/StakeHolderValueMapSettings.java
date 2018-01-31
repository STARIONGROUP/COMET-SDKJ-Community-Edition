/* --------------------------------------------------------------------------------------------------------------------
 * AbstractStakeHolderValueMapSettings.java
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
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * The settings of a StakeholderValueMap that capture the BinaryRelationshipRules that are used to create links between the Goals, ValueGroup, StakeholderValues and Requirements
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = StakeHolderValueMap.class, propertyName = "settings")
@ToString
@EqualsAndHashCode
public  class StakeHolderValueMapSettings extends Thing implements Cloneable {
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
     * Initializes a new instance of the {@link StakeHolderValueMapSettings} class.
     */
    public StakeHolderValueMapSettings() {
    }

    /**
     * Initializes a new instance of the {@link StakeHolderValueMapSettings} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public StakeHolderValueMapSettings(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
    }

    /**
     * Property goalToValueGroupRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private BinaryRelationshipRule goalToValueGroupRelationship;

    /**
     * Property stakeholderValueToRequirementRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private BinaryRelationshipRule stakeholderValueToRequirementRelationship;

    /**
     * Property valueGroupToStakeholderValueRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private BinaryRelationshipRule valueGroupToStakeholderValueRelationship;

    /**
     * Gets the goalToValueGroupRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public BinaryRelationshipRule getGoalToValueGroupRelationship(){
         return this.goalToValueGroupRelationship;
    }

    /**
     * Gets the stakeholderValueToRequirementRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public BinaryRelationshipRule getStakeholderValueToRequirementRelationship(){
         return this.stakeholderValueToRequirementRelationship;
    }

    /**
     * Gets the valueGroupToStakeholderValueRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public BinaryRelationshipRule getValueGroupToStakeholderValueRelationship(){
         return this.valueGroupToStakeholderValueRelationship;
    }

    /**
     * Sets the goalToValueGroupRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setGoalToValueGroupRelationship(BinaryRelationshipRule goalToValueGroupRelationship){
        this.goalToValueGroupRelationship = goalToValueGroupRelationship;
    }

    /**
     * Sets the stakeholderValueToRequirementRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setStakeholderValueToRequirementRelationship(BinaryRelationshipRule stakeholderValueToRequirementRelationship){
        this.stakeholderValueToRequirementRelationship = stakeholderValueToRequirementRelationship;
    }

    /**
     * Sets the valueGroupToStakeholderValueRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setValueGroupToStakeholderValueRelationship(BinaryRelationshipRule valueGroupToStakeholderValueRelationship){
        this.valueGroupToStakeholderValueRelationship = valueGroupToStakeholderValueRelationship;
    }

    /**
     * Creates and returns a copy of this {@link StakeHolderValueMapSettings} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link StakeHolderValueMapSettings}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        StakeHolderValueMapSettings clone;
        try {
            clone = (StakeHolderValueMapSettings)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow StakeHolderValueMapSettings cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link StakeHolderValueMapSettings} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link StakeHolderValueMapSettings}.
     */
    @Override
    public StakeHolderValueMapSettings clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (StakeHolderValueMapSettings)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>StakeHolderValueMapSettings}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link StakeHolderValueMapSettings} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.StakeHolderValueMapSettings dto = (cdp4common.dto.StakeHolderValueMapSettings)dtoThing;

        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setGoalToValueGroupRelationship((dto.getGoalToValueGroupRelationship() != null) ? this.getCache().get<BinaryRelationshipRule>(dto.getGoalToValueGroupRelationship.getValue(), dto.getIterationContainerId()) : null);
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setStakeholderValueToRequirementRelationship((dto.getStakeholderValueToRequirementRelationship() != null) ? this.getCache().get<BinaryRelationshipRule>(dto.getStakeholderValueToRequirementRelationship.getValue(), dto.getIterationContainerId()) : null);
        this.setValueGroupToStakeholderValueRelationship((dto.getValueGroupToStakeholderValueRelationship() != null) ? this.getCache().get<BinaryRelationshipRule>(dto.getValueGroupToStakeholderValueRelationship.getValue(), dto.getIterationContainerId()) : null);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link StakeHolderValueMapSettings}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.StakeHolderValueMapSettings dto = new cdp4common.dto.StakeHolderValueMapSettings(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setGoalToValueGroupRelationship(this.getGoalToValueGroupRelationship() != null ? (UUID)this.getGoalToValueGroupRelationship().getIid() : null);
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setStakeholderValueToRequirementRelationship(this.getStakeholderValueToRequirementRelationship() != null ? (UUID)this.getStakeholderValueToRequirementRelationship().getIid() : null);
        dto.setValueGroupToStakeholderValueRelationship(this.getValueGroupToStakeholderValueRelationship() != null ? (UUID)this.getValueGroupToStakeholderValueRelationship().getIid() : null);

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
