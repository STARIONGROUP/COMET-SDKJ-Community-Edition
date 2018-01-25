/* --------------------------------------------------------------------------------------------------------------------
 * AbstractSiteDirectoryDataDiscussionItem.java
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

/**
 * The concrete datatype for SiteDirectory data discussions
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = SiteDirectoryDataAnnotation.class, propertyName = "discussion")
public abstract class AbstractSiteDirectoryDataDiscussionItem extends AbstractDiscussionItem  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_N_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Initializes a new instance of the <code>SiteDirectoryDataDiscussionItem<code/> class.
     *
     * @see SiteDirectoryDataDiscussionItem
     */
    public AbstractSiteDirectoryDataDiscussionItem() {
    }

    /**
     * Initializes a new instance of the <code>SiteDirectoryDataDiscussionItem<code/> class.
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
     * @see SiteDirectoryDataDiscussionItem
     */
    public AbstractSiteDirectoryDataDiscussionItem(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property author.
     * The person who wrote this discussion item
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Person author;

    /**
     * Gets the author.
     * The person who wrote this discussion item
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Person getAuthor(){
         return this.author;
    }

    /**
     * Sets the author.
     * The person who wrote this discussion item
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setAuthor(Person author){
        this.author = author;
    }

    /**
     * Creates and returns a copy of this <code>SiteDirectoryDataDiscussionItem<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>SiteDirectoryDataDiscussionItem<code/>.
     *
     * @see SiteDirectoryDataDiscussionItem
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        SiteDirectoryDataDiscussionItem clone = (SiteDirectoryDataDiscussionItem)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>SiteDirectoryDataDiscussionItem<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>SiteDirectoryDataDiscussionItem<code/>.
     * 
     * @see SiteDirectoryDataDiscussionItem
     */
    @Override
    public SiteDirectoryDataDiscussionItem clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SiteDirectoryDataDiscussionItem)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>SiteDirectoryDataDiscussionItem<code/>.
     *
     * @return A list of potential errors.
     *
     * @see SiteDirectoryDataDiscussionItem
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.author == null || this.author.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property author is null.");
            this.author = SentinelThingProvider.getSentinel<Person>();
            this.sentinelResetMap["author"] = () -> this.author = null;
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>SiteDirectoryDataDiscussionItem<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see SiteDirectoryDataDiscussionItem
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.SiteDirectoryDataDiscussionItem dto = (cdp4common.dto.SiteDirectoryDataDiscussionItem)dtoThing;

        this.author = this.cache.get<Person>(dto.getAuthor(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Person>();
        this.content = dto.getContent();
        this.createdOn = dto.getCreatedOn();
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.languageCode = dto.getLanguageCode();
        this.modifiedOn = dto.getModifiedOn();
        this.replyTo = (dto.getReplyTo() != null) ? this.cache.get<DiscussionItem>(dto.getReplyTo.getValue(), dto.getIterationContainerId()) : null;
        this.revisionNumber = dto.getRevisionNumber();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>SiteDirectoryDataDiscussionItem<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see SiteDirectoryDataDiscussionItem
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.SiteDirectoryDataDiscussionItem dto = new cdp4common.dto.SiteDirectoryDataDiscussionItem(this.iid, this.revisionNumber);

        dto.setAuthor(this.author != null ? this.author.getIid() : new UUID(0L, 0L));
        dto.setContent(this.content);
        dto.setCreatedOn(this.createdOn);
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setLanguageCode(this.languageCode);
        dto.setModifiedOn(this.modifiedOn);
        dto.setReplyTo(this.replyTo != null ? (UUID)this.replyTo.getIid() : null);
        dto.setRevisionNumber(this.revisionNumber);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
