/* --------------------------------------------------------------------------------------------------------------------
 * AbstractRequestForDeviation.java
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
 * The objective of the request for deviation is to be the vehicle for requiring and agreeing the departure from a customer’s requirement that is part of an
 * approved configuration baseline.
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = EngineeringModel.class, propertyName = "modellingAnnotation")
@ToString
@EqualsAndHashCode
public  class RequestForDeviation extends ContractDeviation  {
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
     * Initializes a new instance of the {@link RequestForDeviation} class.
     */
    public RequestForDeviation() {
    }

    /**
     * Initializes a new instance of the {@link RequestForDeviation} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public RequestForDeviation(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
    }

    /**
     * Creates and returns a copy of this {@link RequestForDeviation} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link RequestForDeviation}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        RequestForDeviation clone = (RequestForDeviation)this.clone();
        clone.setApprovedBy(cloneContainedThings ? new ContainerList<Approval>(clone) : new ContainerList<Approval>(this.getApprovedBy(), clone));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setDiscussion(cloneContainedThings ? new ContainerList<EngineeringModelDataDiscussionItem>(clone) : new ContainerList<EngineeringModelDataDiscussionItem>(this.getDiscussion(), clone));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setRelatedThing(cloneContainedThings ? new ContainerList<ModellingThingReference>(clone) : new ContainerList<ModellingThingReference>(this.getRelatedThing(), clone));
        clone.setSourceAnnotation(new ArrayList<ModellingAnnotationItem>(this.getSourceAnnotation()));

        if (cloneContainedThings) {
            clone.getApprovedBy().addAll(this.getApprovedBy().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDiscussion().addAll(this.getDiscussion().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getRelatedThing().addAll(this.getRelatedThing().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link RequestForDeviation} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link RequestForDeviation}.
     */
    @Override
    public RequestForDeviation clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (RequestForDeviation)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>RequestForDeviation}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link RequestForDeviation} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.RequestForDeviation dto = (cdp4common.dto.RequestForDeviation)dtoThing;

        this.getApprovedBy().resolveList(dto.getApprovedBy(), dto.getIterationContainerId(), this.getCache());
        this.setAuthor(this.getCache().get<Participant>(dto.getAuthor(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Participant>());
        this.getCategory().resolveList(dto.getCategory(), dto.getIterationContainerId(), this.getCache());
        this.setClassification(dto.getClassification());
        this.setContent(dto.getContent());
        this.setCreatedOn(dto.getCreatedOn());
        this.getDiscussion().resolveList(dto.getDiscussion(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setLanguageCode(dto.getLanguageCode());
        this.setModifiedOn(dto.getModifiedOn());
        this.setOwner(this.getCache().get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>());
        this.setPrimaryAnnotatedThing((dto.getPrimaryAnnotatedThing() != null) ? this.getCache().get<ModellingThingReference>(dto.getPrimaryAnnotatedThing.getValue(), dto.getIterationContainerId()) : null);
        this.getRelatedThing().resolveList(dto.getRelatedThing(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.getSourceAnnotation().resolveList(dto.getSourceAnnotation(), dto.getIterationContainerId(), this.getCache());
        this.setStatus(dto.getStatus());
        this.setTitle(dto.getTitle());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link RequestForDeviation}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.RequestForDeviation dto = new cdp4common.dto.RequestForDeviation(this.getIid(), this.getRevisionNumber());

        dto.getApprovedBy().add(this.getApprovedBy().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setAuthor(this.getAuthor() != null ? this.getAuthor().getIid() : new UUID(0L, 0L));
        dto.getCategory().add(this.getCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setClassification(this.getClassification());
        dto.setContent(this.getContent());
        dto.setCreatedOn(this.getCreatedOn());
        dto.getDiscussion().add(this.getDiscussion().stream().map(x -> x.getIid()).collect(Collectors.toList()));
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

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
