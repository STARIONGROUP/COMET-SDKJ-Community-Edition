/* --------------------------------------------------------------------------------------------------------------------
 * Relationship.java
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
import cdp4common.helpers.ActionImpl;
import cdp4common.sitedirectorydata.CategorizableThing;
import cdp4common.sitedirectorydata.Category;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.types.CacheKey;
import cdp4common.types.ContainerList;
import com.google.common.cache.Cache;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/**
 * representation of a relationship between two or more Things
 * Note: This allows very generic relationships to be defined in an E-TM-10-25 compatible dataset. In order to make its use controlled and meaningful, the semantics of the relationship should be defined by making the Relationship a member of a Category and defining an applicable BinaryRelationshipRule or MultiRelationshipRule.
 */
@Container(clazz = Iteration.class, propertyName = "relationship")
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class Relationship extends Thing implements Cloneable, CategorizableThing, OwnedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NONE;

    /**
     * Initializes a new instance of the {@link Relationship} class.
     */
    protected Relationship() {
        this.category = new ArrayList<Category>();
        this.parameterValue = new ContainerList<RelationshipParameterValue>(this);
    }

    /**
     * Initializes a new instance of the {@link Relationship} class.
     *
     * @param iid     The unique identifier.
     * @param cache   The {@link Cache} where the current thing is stored.
     *                The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     *                The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected Relationship(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.category = new ArrayList<Category>();
        this.parameterValue = new ContainerList<RelationshipParameterValue>(this);
    }

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<Category> category;

    /**
     * Property owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private DomainOfExpertise owner;

    /**
     * List of contained RelationshipParameterValue.
     * The parameter values for this Relationship
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<RelationshipParameterValue> parameterValue;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link Relationship}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link Relationship}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.parameterValue);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link Relationship} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     * @return A cloned instance of {@link Relationship}.
     */
    @Override
    public Relationship clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Relationship) this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this Relationship}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getOwner() == null || this.getOwner().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property owner is null.");
            this.setOwner(SentinelThingProvider.getSentinel(DomainOfExpertise.class));
            this.sentinelResetMap.put("owner", new ActionImpl(() -> this.setOwner(null)));
        }

        return errorList;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Clean the referenced Thing list of {@link Relationship} of this {@link Relationship}
     */
    public abstract void cleanReferencedThingRelationship();
}
