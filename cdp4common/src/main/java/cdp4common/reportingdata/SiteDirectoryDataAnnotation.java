/* --------------------------------------------------------------------------------------------------------------------
 * AbstractSiteDirectoryDataAnnotation.java
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
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = SiteDirectory.class, propertyName = "annotation")
@ToString
@EqualsAndHashCode
public  class SiteDirectoryDataAnnotation extends GenericAnnotation  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NONE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the <code>SiteDirectoryDataAnnotation<code/> class.
     *
     * @see SiteDirectoryDataAnnotation
     */
    public SiteDirectoryDataAnnotation() {
        this.discussion = new ContainerList<SiteDirectoryDataDiscussionItem>(this);
        this.relatedThing = new ContainerList<SiteDirectoryThingReference>(this);
    }

    /**
     * Initializes a new instance of the <code>SiteDirectoryDataAnnotation<code/> class.
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
     * @see SiteDirectoryDataAnnotation
     */
    public SiteDirectoryDataAnnotation(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.discussion = new ContainerList<SiteDirectoryDataDiscussionItem>(this);
        this.relatedThing = new ContainerList<SiteDirectoryThingReference>(this);
    }

    /**
     * Property author.
     * The author of the annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Person author;

    /**
     * List of contained SiteDirectoryDataDiscussionItem.
     * The discussion related to this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<SiteDirectoryDataDiscussionItem> discussion;

    /**
     * Property primaryAnnotatedThing.
     * The reference of the primary Thing that is being annotated
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private SiteDirectoryThingReference primaryAnnotatedThing;

    /**
     * List of contained SiteDirectoryThingReference.
     * The reference of the things that are related to this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<SiteDirectoryThingReference> relatedThing;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>SiteDirectoryDataAnnotation<code/>.
     *
     * @see Iterable
     * @see SiteDirectoryDataAnnotation
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets the author.
     * The author of the annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Person getAuthor(){
         return this.author;
    }

    /**
     * Gets a list of contained SiteDirectoryDataDiscussionItem.
     * The discussion related to this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<SiteDirectoryDataDiscussionItem> getDiscussion(){
         return this.discussion;
    }

    /**
     * Gets the primaryAnnotatedThing.
     * The reference of the primary Thing that is being annotated
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public SiteDirectoryThingReference getPrimaryAnnotatedThing(){
         return this.primaryAnnotatedThing;
    }

    /**
     * Gets a list of contained SiteDirectoryThingReference.
     * The reference of the things that are related to this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<SiteDirectoryThingReference> getRelatedThing(){
         return this.relatedThing;
    }

    /**
     * Sets the author.
     * The author of the annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setAuthor(Person author){
        this.author = author;
    }

    /**
     * Sets a list of contained SiteDirectoryDataDiscussionItem.
     * The discussion related to this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setDiscussion(ContainerList<SiteDirectoryDataDiscussionItem> discussion){
        this.discussion = discussion;
    }

    /**
     * Sets the primaryAnnotatedThing.
     * The reference of the primary Thing that is being annotated
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setPrimaryAnnotatedThing(SiteDirectoryThingReference primaryAnnotatedThing){
        this.primaryAnnotatedThing = primaryAnnotatedThing;
    }

    /**
     * Sets a list of contained SiteDirectoryThingReference.
     * The reference of the things that are related to this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setRelatedThing(ContainerList<SiteDirectoryThingReference> relatedThing){
        this.relatedThing = relatedThing;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>SiteDirectoryDataAnnotation<code/>.
     *
     * @see Iterable
     * @see SiteDirectoryDataAnnotation
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.discussion);
        containers.Add(this.relatedThing);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>SiteDirectoryDataAnnotation<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>SiteDirectoryDataAnnotation<code/>.
     *
     * @see SiteDirectoryDataAnnotation
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        SiteDirectoryDataAnnotation clone = (SiteDirectoryDataAnnotation)this.clone();
        clone.setDiscussion(cloneContainedThings ? new ContainerList<SiteDirectoryDataDiscussionItem>(clone) : new ContainerList<SiteDirectoryDataDiscussionItem>(this.getDiscussion(), clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setRelatedThing(cloneContainedThings ? new ContainerList<SiteDirectoryThingReference>(clone) : new ContainerList<SiteDirectoryThingReference>(this.getRelatedThing(), clone));

        if (cloneContainedThings) {
            clone.getDiscussion().addAll(this.getDiscussion().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getRelatedThing().addAll(this.getRelatedThing().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>SiteDirectoryDataAnnotation<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>SiteDirectoryDataAnnotation<code/>.
     * 
     * @see SiteDirectoryDataAnnotation
     */
    @Override
    public SiteDirectoryDataAnnotation clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SiteDirectoryDataAnnotation)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>SiteDirectoryDataAnnotation<code/>.
     *
     * @return A list of potential errors.
     *
     * @see SiteDirectoryDataAnnotation
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getAuthor() == null || this.getAuthor().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property author is null.");
            this.setAuthor(SentinelThingProvider.getSentinel<Person>());
            this.sentinelResetMap["author"] = () -> this.setAuthor(null);
        }

        if (this.getPrimaryAnnotatedThing() == null || this.getPrimaryAnnotatedThing().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property primaryAnnotatedThing is null.");
            this.setPrimaryAnnotatedThing(SentinelThingProvider.getSentinel<SiteDirectoryThingReference>());
            this.sentinelResetMap["primaryAnnotatedThing"] = () -> this.setPrimaryAnnotatedThing(null);
        }

        int relatedThingCount = this.getRelatedThing().size();
        if (relatedThingCount < 1) {
            errorList.add("The number of elements in the property relatedThing is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>SiteDirectoryDataAnnotation<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see SiteDirectoryDataAnnotation
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.SiteDirectoryDataAnnotation dto = (cdp4common.dto.SiteDirectoryDataAnnotation)dtoThing;

        this.setAuthor(this.cache.get<Person>(dto.getAuthor(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Person>());
        this.setContent(dto.getContent());
        this.setCreatedOn(dto.getCreatedOn());
        this.discussion.resolveList(dto.getDiscussion(), dto.getIterationContainerId(), this.getCache());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setLanguageCode(dto.getLanguageCode());
        this.setModifiedOn(dto.getModifiedOn());
        this.setPrimaryAnnotatedThing(this.cache.get<SiteDirectoryThingReference>(dto.getPrimaryAnnotatedThing(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<SiteDirectoryThingReference>());
        this.relatedThing.resolveList(dto.getRelatedThing(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>SiteDirectoryDataAnnotation<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see SiteDirectoryDataAnnotation
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.SiteDirectoryDataAnnotation dto = new cdp4common.dto.SiteDirectoryDataAnnotation(this.getIid(), this.getRevisionNumber());

        dto.setAuthor(this.getAuthor() != null ? this.getAuthor().getIid() : new UUID(0L, 0L));
        dto.setContent(this.getContent());
        dto.setCreatedOn(this.getCreatedOn());
        dto.getDiscussion().add(this.getDiscussion().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setLanguageCode(this.getLanguageCode());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setPrimaryAnnotatedThing(this.getPrimaryAnnotatedThing() != null ? this.getPrimaryAnnotatedThing().getIid() : new UUID(0L, 0L));
        dto.getRelatedThing().add(this.getRelatedThing().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
