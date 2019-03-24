/* --------------------------------------------------------------------------------------------------------------------
 * MultiRelationship.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

import cdp4common.*;
import cdp4common.commondata.ParticipantAccessRightKind;
import cdp4common.commondata.PersonAccessRightKind;
import cdp4common.commondata.Thing;
import cdp4common.helpers.PojoThingFactory;
import cdp4common.sitedirectorydata.Category;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.Person;
import cdp4common.types.CacheKey;
import cdp4common.types.ContainerList;
import com.google.common.cache.Cache;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.ObjectUtils;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * representation of a relationship between multiple Things
 * Note: This allows very generic relationships to be defined between any set of Things. In order to make its use controlled and meaningful the semantics of the relationship should be defined by making the MultiRelationship a member of a Category and defining an applicable MultiRelationshipRule.
 * Note 2: MultiRelationship is a similar concept as what is, in computer science or data modelling, often called an "n-ary" relationship, relation or association.
 */
@Container(clazz = Iteration.class, propertyName = "relationship")
@ToString
@EqualsAndHashCode(callSuper = true)
public class MultiRelationship extends Relationship implements Cloneable {
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
     *
     * @param iid     The unique identifier.
     * @param cache   The {@link Cache} where the current thing is stored.
     *                The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     *                The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public MultiRelationship(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.relatedThing = new ArrayList<Thing>();
    }

    /**
     * List of Thing.
     * set of Things that are related by this MultiRelationship
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<Thing> relatedThing;

    /**
     * Creates and returns a copy of this {@link MultiRelationship} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     * @return A cloned instance of {@link MultiRelationship}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        MultiRelationship clone;
        try {
            clone = (MultiRelationship) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow MultiRelationship cannot be cloned.");
        }

        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setParameterValue(cloneContainedThings ? new ContainerList<RelationshipParameterValue>(clone) : new ContainerList<RelationshipParameterValue>(this.getParameterValue(), clone, false));
        clone.setRelatedThing(new ArrayList<Thing>(this.getRelatedThing()));

        if (cloneContainedThings) {
            clone.getParameterValue().addAll(this.getParameterValue().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link MultiRelationship} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     * @return A cloned instance of {@link MultiRelationship}.
     */
    @Override
    public MultiRelationship clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (MultiRelationship) this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this MultiRelationship}.
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

        cdp4common.dto.MultiRelationship dto = (cdp4common.dto.MultiRelationship) dtoThing;

        PojoThingFactory.resolveList(this.getCategory(), dto.getCategory(), dto.getIterationContainerId(), this.getCache(), Category.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setOwner(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getOwner(), dto.getIterationContainerId(), DomainOfExpertise.class), SentinelThingProvider.getSentinel(DomainOfExpertise.class)));
        PojoThingFactory.resolveList(this.getParameterValue(), dto.getParameterValue(), dto.getIterationContainerId(), this.getCache(), RelationshipParameterValue.class);
        PojoThingFactory.resolveList(this.getRelatedThing(), dto.getRelatedThing(), dto.getIterationContainerId(), this.getCache(), Thing.class);
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

        dto.getCategory().addAll(this.getCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.getParameterValue().addAll(this.getParameterValue().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getRelatedThing().addAll(this.getRelatedThing().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Perform extra operations on a {@link MultiRelationship}
     */
    protected void resolveExtraProperties() {
        for (var thing : this.getRelatedThing()) {
            if (thing.getRelationships() != null) {
                thing.getRelationships().add(this);
            }
        }
    }

    /**
     * Clean the referenced Thing list of {@link Relationship} of this {@link Relationship}
     */
    public void cleanReferencedThingRelationship() {
        for (var thing : this.getRelatedThing()) {
            if (thing.getRelationships() != null) {
                thing.getRelationships().remove(this);
            }
        }
    }
}
