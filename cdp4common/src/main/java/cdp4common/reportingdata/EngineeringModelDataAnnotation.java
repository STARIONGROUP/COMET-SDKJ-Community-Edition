/* --------------------------------------------------------------------------------------------------------------------
 * AbstractEngineeringModelDataAnnotation.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.reportingdata;

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
 * The abstract annotation class made on EngineeringModel Things
 */
@CDPVersion(version = "1.1.0")
@ToString
@EqualsAndHashCode
public  abstract class EngineeringModelDataAnnotation extends GenericAnnotation implements Cloneable {
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
     * Initializes a new instance of the {@link EngineeringModelDataAnnotation} class.
     */
    protected EngineeringModelDataAnnotation() {
        this.discussion = new ContainerList<EngineeringModelDataDiscussionItem>(this);
        this.relatedThing = new ContainerList<ModellingThingReference>(this);
    }

    /**
     * Initializes a new instance of the {@link EngineeringModelDataAnnotation} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected EngineeringModelDataAnnotation(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.discussion = new ContainerList<EngineeringModelDataDiscussionItem>(this);
        this.relatedThing = new ContainerList<ModellingThingReference>(this);
    }

    /**
     * Property author.
     * The participant who is the author of the annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Participant author;

    /**
     * List of contained EngineeringModelDataDiscussionItem.
     * The discussions that follows the creation of this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<EngineeringModelDataDiscussionItem> discussion;

    /**
     * Property primaryAnnotatedThing.
     * The reference of the primary Thing that is being annotated
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ModellingThingReference primaryAnnotatedThing;

    /**
     * List of contained ModellingThingReference.
     * The reference of the things that are related to this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ModellingThingReference> relatedThing;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link EngineeringModelDataAnnotation}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets the author.
     * The participant who is the author of the annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Participant getAuthor(){
         return this.author;
    }

    /**
     * Gets a list of contained EngineeringModelDataDiscussionItem.
     * The discussions that follows the creation of this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<EngineeringModelDataDiscussionItem> getDiscussion(){
         return this.discussion;
    }

    /**
     * Gets the primaryAnnotatedThing.
     * The reference of the primary Thing that is being annotated
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ModellingThingReference getPrimaryAnnotatedThing(){
         return this.primaryAnnotatedThing;
    }

    /**
     * Gets a list of contained ModellingThingReference.
     * The reference of the things that are related to this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ModellingThingReference> getRelatedThing(){
         return this.relatedThing;
    }

    /**
     * Sets the author.
     * The participant who is the author of the annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setAuthor(Participant author){
        this.author = author;
    }

    /**
     * Sets a list of contained EngineeringModelDataDiscussionItem.
     * The discussions that follows the creation of this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setDiscussion(ContainerList<EngineeringModelDataDiscussionItem> discussion){
        this.discussion = discussion;
    }

    /**
     * Sets the primaryAnnotatedThing.
     * The reference of the primary Thing that is being annotated
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setPrimaryAnnotatedThing(ModellingThingReference primaryAnnotatedThing){
        this.primaryAnnotatedThing = primaryAnnotatedThing;
    }

    /**
     * Sets a list of contained ModellingThingReference.
     * The reference of the things that are related to this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setRelatedThing(ContainerList<ModellingThingReference> relatedThing){
        this.relatedThing = relatedThing;
    }

    /**
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link EngineeringModelDataAnnotation}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
        containers.add(this.discussion);
        containers.add(this.relatedThing);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link EngineeringModelDataAnnotation} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link EngineeringModelDataAnnotation}.
     */
    @Override
    public EngineeringModelDataAnnotation clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (EngineeringModelDataAnnotation)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>EngineeringModelDataAnnotation}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getAuthor() == null || this.getAuthor().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property author is null.");
            this.setAuthor(SentinelThingProvider.getSentinel<Participant>());
            this.sentinelResetMap.put("author", new ActionImpl(() -> this.setAuthor(null)));
        }

        return errorList;
    }
}
