/* --------------------------------------------------------------------------------------------------------------------
 * ActionItem.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.reportingdata;

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
 * Represents an action that shall be performed following a ReviewItemDiscrepancy
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = EngineeringModel.class, propertyName = "modellingAnnotation")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ActionItem extends ModellingAnnotationItem implements Cloneable {
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
     * Initializes a new instance of the {@link ActionItem} class.
     */
    public ActionItem() {
    }

    /**
     * Initializes a new instance of the {@link ActionItem} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ActionItem(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property actionee.
     * The participant that shall perform the action
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Participant actionee;

    /**
     * Property closeOutDate.
     * The date that the current action was closed at
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @Getter
    @Setter
    private LocalDateTime closeOutDate;

    /**
     * Property closeOutStatement.
     * The close-out statement
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String closeOutStatement;

    /**
     * Property dueDate.
     * The date that the current action is due
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private LocalDateTime dueDate;

    /**
     * Creates and returns a copy of this {@link ActionItem} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ActionItem}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ActionItem clone;
        try {
            clone = (ActionItem)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ActionItem cannot be cloned.");
        }

        clone.setApprovedBy(cloneContainedThings ? new ContainerList<Approval>(clone) : new ContainerList<Approval>(this.getApprovedBy(), clone, false));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setDiscussion(cloneContainedThings ? new ContainerList<EngineeringModelDataDiscussionItem>(clone) : new ContainerList<EngineeringModelDataDiscussionItem>(this.getDiscussion(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setRelatedThing(cloneContainedThings ? new ContainerList<ModellingThingReference>(clone) : new ContainerList<ModellingThingReference>(this.getRelatedThing(), clone, false));
        clone.setSourceAnnotation(new ArrayList<ModellingAnnotationItem>(this.getSourceAnnotation()));

        if (cloneContainedThings) {
            clone.getApprovedBy().addAll(this.getApprovedBy().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDiscussion().addAll(this.getDiscussion().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getRelatedThing().addAll(this.getRelatedThing().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ActionItem} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ActionItem}.
     */
    @Override
    public ActionItem clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ActionItem)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ActionItem}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getActionee() == null || this.getActionee().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property actionee is null.");
            this.setActionee(SentinelThingProvider.getSentinel(Participant.class));
            this.sentinelResetMap.put("actionee", new ActionImpl(() -> this.setActionee(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ActionItem} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ActionItem dto = (cdp4common.dto.ActionItem)dtoThing;

        this.setActionee(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getActionee(), dto.getIterationContainerId(), Participant.class), SentinelThingProvider.getSentinel(Participant.class)));
        PojoThingFactory.resolveList(this.getApprovedBy(), dto.getApprovedBy(), dto.getIterationContainerId(), this.getCache(), Approval.class);
        this.setAuthor(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getAuthor(), dto.getIterationContainerId(), Participant.class), SentinelThingProvider.getSentinel(Participant.class)));
        PojoThingFactory.resolveList(this.getCategory(), dto.getCategory(), dto.getIterationContainerId(), this.getCache(), Category.class);
        this.setClassification(dto.getClassification());
        this.setCloseOutDate(dto.getCloseOutDate());
        this.setCloseOutStatement(dto.getCloseOutStatement());
        this.setContent(dto.getContent());
        this.setCreatedOn(dto.getCreatedOn());
        PojoThingFactory.resolveList(this.getDiscussion(), dto.getDiscussion(), dto.getIterationContainerId(), this.getCache(), EngineeringModelDataDiscussionItem.class);
        this.setDueDate(dto.getDueDate());
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setLanguageCode(dto.getLanguageCode());
        this.setModifiedOn(dto.getModifiedOn());
        this.setOwner(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getOwner(), dto.getIterationContainerId(), DomainOfExpertise.class), SentinelThingProvider.getSentinel(DomainOfExpertise.class)));
        this.setPrimaryAnnotatedThing((dto.getPrimaryAnnotatedThing() != null) ? PojoThingFactory.get(this.getCache(), dto.getPrimaryAnnotatedThing(), dto.getIterationContainerId(), ModellingThingReference.class) : null);
        PojoThingFactory.resolveList(this.getRelatedThing(), dto.getRelatedThing(), dto.getIterationContainerId(), this.getCache(), ModellingThingReference.class);
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        PojoThingFactory.resolveList(this.getSourceAnnotation(), dto.getSourceAnnotation(), dto.getIterationContainerId(), this.getCache(), ModellingAnnotationItem.class);
        this.setStatus(dto.getStatus());
        this.setTitle(dto.getTitle());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ActionItem}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ActionItem dto = new cdp4common.dto.ActionItem(this.getIid(), this.getRevisionNumber());

        dto.setActionee(this.getActionee() != null ? this.getActionee().getIid() : new UUID(0L, 0L));
        dto.getApprovedBy().addAll(this.getApprovedBy().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setAuthor(this.getAuthor() != null ? this.getAuthor().getIid() : new UUID(0L, 0L));
        dto.getCategory().addAll(this.getCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setClassification(this.getClassification());
        dto.setCloseOutDate(this.getCloseOutDate());
        dto.setCloseOutStatement(this.getCloseOutStatement());
        dto.setContent(this.getContent());
        dto.setCreatedOn(this.getCreatedOn());
        dto.getDiscussion().addAll(this.getDiscussion().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDueDate(this.getDueDate());
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setLanguageCode(this.getLanguageCode());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.setPrimaryAnnotatedThing(this.getPrimaryAnnotatedThing() != null ? (UUID)this.getPrimaryAnnotatedThing().getIid() : null);
        dto.getRelatedThing().addAll(this.getRelatedThing().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.getSourceAnnotation().addAll(this.getSourceAnnotation().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setStatus(this.getStatus());
        dto.setTitle(this.getTitle());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
