/* --------------------------------------------------------------------------------------------------------------------
 * AbstractEngineeringModelDataDiscussionItem.java
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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * The DiscussionItem is the concept that carries an intervention made by a participant after a ModellingAnnotationItem has been created following a review.
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = EngineeringModelDataAnnotation.class, propertyName = "discussion")
@ToString
@EqualsAndHashCode
public  class EngineeringModelDataDiscussionItem extends DiscussionItem  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NONE;

    /**
     * Initializes a new instance of the <code>EngineeringModelDataDiscussionItem<code/> class.
     *
     * @see EngineeringModelDataDiscussionItem
     */
    public EngineeringModelDataDiscussionItem() {
    }

    /**
     * Initializes a new instance of the <code>EngineeringModelDataDiscussionItem<code/> class.
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
     * @see EngineeringModelDataDiscussionItem
     */
    public EngineeringModelDataDiscussionItem(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property author.
     * The participant that is the author of the DiscussionItem
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Participant author;

    /**
     * Gets the author.
     * The participant that is the author of the DiscussionItem
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Participant getAuthor(){
         return this.author;
    }

    /**
     * Sets the author.
     * The participant that is the author of the DiscussionItem
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setAuthor(Participant author){
        this.author = author;
    }

    /**
     * Creates and returns a copy of this <code>EngineeringModelDataDiscussionItem<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>EngineeringModelDataDiscussionItem<code/>.
     *
     * @see EngineeringModelDataDiscussionItem
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        EngineeringModelDataDiscussionItem clone = (EngineeringModelDataDiscussionItem)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>EngineeringModelDataDiscussionItem<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>EngineeringModelDataDiscussionItem<code/>.
     * 
     * @see EngineeringModelDataDiscussionItem
     */
    @Override
    public EngineeringModelDataDiscussionItem clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (EngineeringModelDataDiscussionItem)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>EngineeringModelDataDiscussionItem<code/>.
     *
     * @return A list of potential errors.
     *
     * @see EngineeringModelDataDiscussionItem
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getAuthor() == null || this.getAuthor().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property author is null.");
            this.setAuthor(SentinelThingProvider.getSentinel<Participant>());
            this.sentinelResetMap["author"] = () -> this.setAuthor(null);
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>EngineeringModelDataDiscussionItem<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see EngineeringModelDataDiscussionItem
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.EngineeringModelDataDiscussionItem dto = (cdp4common.dto.EngineeringModelDataDiscussionItem)dtoThing;

        this.setAuthor(this.cache.get<Participant>(dto.getAuthor(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Participant>());
        this.setContent(dto.getContent());
        this.setCreatedOn(dto.getCreatedOn());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setLanguageCode(dto.getLanguageCode());
        this.setModifiedOn(dto.getModifiedOn());
        this.setReplyTo((dto.getReplyTo() != null) ? this.getCache().get<DiscussionItem>(dto.getReplyTo.getValue(), dto.getIterationContainerId()) : null);
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>EngineeringModelDataDiscussionItem<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see EngineeringModelDataDiscussionItem
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.EngineeringModelDataDiscussionItem dto = new cdp4common.dto.EngineeringModelDataDiscussionItem(this.getIid(), this.getRevisionNumber());

        dto.setAuthor(this.getAuthor() != null ? this.getAuthor().getIid() : new UUID(0L, 0L));
        dto.setContent(this.getContent());
        dto.setCreatedOn(this.getCreatedOn());
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setLanguageCode(this.getLanguageCode());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setReplyTo(this.getReplyTo() != null ? (UUID)this.getReplyTo().getIid() : null);
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
