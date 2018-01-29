/* --------------------------------------------------------------------------------------------------------------------
 * AbstractActionItem.java
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
 * Represents an action that shall be performed following a ReviewItemDiscrepancy
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = EngineeringModel.class, propertyName = "modellingAnnotation")
@ToString
@EqualsAndHashCode
public  class ActionItem extends ModellingAnnotationItem  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NONE;

    /**
     * Initializes a new instance of the <code>ActionItem<code/> class.
     *
     * @see ActionItem
     */
    public ActionItem() {
    }

    /**
     * Initializes a new instance of the <code>ActionItem<code/> class.
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
     * @see ActionItem
     */
    public ActionItem(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property actionee.
     * The participant that shall perform the action
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Participant actionee;

    /**
     * Property closeOutDate.
     * The date that the current action was closed at
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private LocalDateTime closeOutDate;

    /**
     * Property closeOutStatement.
     * The close-out statement
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String closeOutStatement;

    /**
     * Property dueDate.
     * The date that the current action is due
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private LocalDateTime dueDate;

    /**
     * Gets the actionee.
     * The participant that shall perform the action
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Participant getActionee(){
         return this.actionee;
    }

    /**
     * Gets the closeOutDate.
     * The date that the current action was closed at
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public LocalDateTime getCloseOutDate(){
         return this.closeOutDate;
    }

    /**
     * Gets the closeOutStatement.
     * The close-out statement
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getCloseOutStatement(){
         return this.closeOutStatement;
    }

    /**
     * Gets the dueDate.
     * The date that the current action is due
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public LocalDateTime getDueDate(){
         return this.dueDate;
    }

    /**
     * Sets the actionee.
     * The participant that shall perform the action
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setActionee(Participant actionee){
        this.actionee = actionee;
    }

    /**
     * Sets the closeOutDate.
     * The date that the current action was closed at
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setCloseOutDate(LocalDateTime closeOutDate){
        this.closeOutDate = closeOutDate;
    }

    /**
     * Sets the closeOutStatement.
     * The close-out statement
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setCloseOutStatement(String closeOutStatement){
        this.closeOutStatement = closeOutStatement;
    }

    /**
     * Sets the dueDate.
     * The date that the current action is due
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDueDate(LocalDateTime dueDate){
        this.dueDate = dueDate;
    }

    /**
     * Creates and returns a copy of this <code>ActionItem<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ActionItem<code/>.
     *
     * @see ActionItem
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ActionItem clone = (ActionItem)this.clone();
        clone.setApprovedBy(cloneContainedThings ? new ContainerList<Approval>(clone) : new ContainerList<Approval>(this.getApprovedBy(), clone));
        clone.setCategory(new List<Category>(this.getCategory()));
        clone.setDiscussion(cloneContainedThings ? new ContainerList<EngineeringModelDataDiscussionItem>(clone) : new ContainerList<EngineeringModelDataDiscussionItem>(this.getDiscussion(), clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setRelatedThing(cloneContainedThings ? new ContainerList<ModellingThingReference>(clone) : new ContainerList<ModellingThingReference>(this.getRelatedThing(), clone));
        clone.setSourceAnnotation(new List<ModellingAnnotationItem>(this.getSourceAnnotation()));

        if (cloneContainedThings) {
            clone.getApprovedBy().addAll(this.getApprovedBy().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDiscussion().addAll(this.getDiscussion().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getRelatedThing().addAll(this.getRelatedThing().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>ActionItem<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ActionItem<code/>.
     * 
     * @see ActionItem
     */
    @Override
    public ActionItem clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ActionItem)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ActionItem<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ActionItem
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getActionee() == null || this.getActionee().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property actionee is null.");
            this.setActionee(SentinelThingProvider.getSentinel<Participant>());
            this.sentinelResetMap["actionee"] = () -> this.setActionee(null);
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ActionItem<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ActionItem
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ActionItem dto = (cdp4common.dto.ActionItem)dtoThing;

        this.setActionee(this.cache.get<Participant>(dto.getActionee(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Participant>());
        this.approvedBy.resolveList(dto.getApprovedBy(), dto.getIterationContainerId(), this.getCache());
        this.setAuthor(this.cache.get<Participant>(dto.getAuthor(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Participant>());
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.getCache());
        this.setClassification(dto.getClassification());
        this.setCloseOutDate(dto.getCloseOutDate());
        this.setCloseOutStatement(dto.getCloseOutStatement());
        this.setContent(dto.getContent());
        this.setCreatedOn(dto.getCreatedOn());
        this.discussion.resolveList(dto.getDiscussion(), dto.getIterationContainerId(), this.getCache());
        this.setDueDate(dto.getDueDate());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setLanguageCode(dto.getLanguageCode());
        this.setModifiedOn(dto.getModifiedOn());
        this.setOwner(this.cache.get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>());
        this.setPrimaryAnnotatedThing((dto.getPrimaryAnnotatedThing() != null) ? this.getCache().get<ModellingThingReference>(dto.getPrimaryAnnotatedThing.getValue(), dto.getIterationContainerId()) : null);
        this.relatedThing.resolveList(dto.getRelatedThing(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.sourceAnnotation.resolveList(dto.getSourceAnnotation(), dto.getIterationContainerId(), this.getCache());
        this.setStatus(dto.getStatus());
        this.setTitle(dto.getTitle());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ActionItem<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ActionItem
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ActionItem dto = new cdp4common.dto.ActionItem(this.getIid(), this.getRevisionNumber());

        dto.setActionee(this.getActionee() != null ? this.getActionee().getIid() : new UUID(0L, 0L));
        dto.getApprovedBy().add(this.getApprovedBy().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setAuthor(this.getAuthor() != null ? this.getAuthor().getIid() : new UUID(0L, 0L));
        dto.getCategory().add(this.getCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setClassification(this.getClassification());
        dto.setCloseOutDate(this.getCloseOutDate());
        dto.setCloseOutStatement(this.getCloseOutStatement());
        dto.setContent(this.getContent());
        dto.setCreatedOn(this.getCreatedOn());
        dto.getDiscussion().add(this.getDiscussion().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setDueDate(this.getDueDate());
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setLanguageCode(this.getLanguageCode());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.setPrimaryAnnotatedThing(this.getPrimaryAnnotatedThing() != null ? (UUID)this.getPrimaryAnnotatedThing().getIid() : null);
        dto.getRelatedThing().add(this.getRelatedThing().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.getSourceAnnotation().add(this.getSourceAnnotation().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setStatus(this.getStatus());
        dto.setTitle(this.getTitle());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
