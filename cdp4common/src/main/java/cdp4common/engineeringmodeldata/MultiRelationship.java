/* --------------------------------------------------------------------------------------------------------------------
 * AbstractMultiRelationship.java
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
 * representation of a relationship between multiple Things
 * Note: This allows very generic relationships to be defined between any set of Things. In order to make its use controlled and meaningful the semantics of the relationship should be defined by making the MultiRelationship a member of a Category and defining an applicable MultiRelationshipRule.
 * Note 2: MultiRelationship is a similar concept as what is, in computer science or data modelling, often called an "n-ary" relationship, relation or association.
 */
@Container(clazz = Iteration.class, propertyName = "relationship")
@ToString
@EqualsAndHashCode
public  class MultiRelationship extends Relationship implements Cloneable {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the {@link MultiRelationship} class.
     */
    public MultiRelationship() {
        this.relatedThing = new ArrayList<Thing>();
    }

    /**
     * Initializes a new instance of the {@link MultiRelationship} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public MultiRelationship(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.relatedThing = new ArrayList<Thing>();
    }

    /**
     * List of Thing.
     * set of Things that are related by this MultiRelationship
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<Thing> relatedThing;

    /**
     * Gets a list of Thing.
     * set of Things that are related by this MultiRelationship
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<Thing> getRelatedThing(){
         return this.relatedThing;
    }

    /**
     * Sets a list of Thing.
     * set of Things that are related by this MultiRelationship
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setRelatedThing(ArrayList<Thing> relatedThing){
        this.relatedThing = relatedThing;
    }

    /**
     * Creates and returns a copy of this {@link MultiRelationship} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link MultiRelationship}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        MultiRelationship clone;
        try {
            clone = (MultiRelationship)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow MultiRelationship cannot be cloned.");
        }

        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setParameterValue(cloneContainedThings ? new ContainerList<RelationshipParameterValue>(clone) : new ContainerList<RelationshipParameterValue>(this.getParameterValue(), clone));
        clone.setRelatedThing(new ArrayList<Thing>(this.getRelatedThing()));

        if (cloneContainedThings) {
            clone.getParameterValue().addAll(this.getParameterValue().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link MultiRelationship} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link MultiRelationship}.
     */
    @Override
    public MultiRelationship clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (MultiRelationship)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>MultiRelationship}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link MultiRelationship} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.MultiRelationship dto = (cdp4common.dto.MultiRelationship)dtoThing;

        this.getCategory().resolveList(dto.getCategory(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setOwner(this.getCache().get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>());
        this.getParameterValue().resolveList(dto.getParameterValue(), dto.getIterationContainerId(), this.getCache());
        this.getRelatedThing().resolveList(dto.getRelatedThing(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link MultiRelationship}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.MultiRelationship dto = new cdp4common.dto.MultiRelationship(this.getIid(), this.getRevisionNumber());

        dto.getCategory().add(this.getCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.getParameterValue().add(this.getParameterValue().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getRelatedThing().add(this.getRelatedThing().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
