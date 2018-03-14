/* --------------------------------------------------------------------------------------------------------------------
 * SiteDirectoryDataAnnotation.java
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
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = SiteDirectory.class, propertyName = "annotation")
@ToString
@EqualsAndHashCode(callSuper = true)
public class SiteDirectoryDataAnnotation extends GenericAnnotation implements Cloneable {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NONE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the {@link SiteDirectoryDataAnnotation} class.
     */
    public SiteDirectoryDataAnnotation() {
        this.discussion = new ContainerList<SiteDirectoryDataDiscussionItem>(this);
        this.relatedThing = new ContainerList<SiteDirectoryThingReference>(this);
    }

    /**
     * Initializes a new instance of the {@link SiteDirectoryDataAnnotation} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public SiteDirectoryDataAnnotation(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.discussion = new ContainerList<SiteDirectoryDataDiscussionItem>(this);
        this.relatedThing = new ContainerList<SiteDirectoryThingReference>(this);
    }

    /**
     * Property author.
     * The author of the annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Person author;

    /**
     * List of contained SiteDirectoryDataDiscussionItem.
     * The discussion related to this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<SiteDirectoryDataDiscussionItem> discussion;

    /**
     * Property primaryAnnotatedThing.
     * The reference of the primary Thing that is being annotated
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private SiteDirectoryThingReference primaryAnnotatedThing;

    /**
     * List of contained SiteDirectoryThingReference.
     * The reference of the things that are related to this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<SiteDirectoryThingReference> relatedThing;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link SiteDirectoryDataAnnotation}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link SiteDirectoryDataAnnotation}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.discussion);
        containers.add(this.relatedThing);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link SiteDirectoryDataAnnotation} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SiteDirectoryDataAnnotation}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        SiteDirectoryDataAnnotation clone;
        try {
            clone = (SiteDirectoryDataAnnotation)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow SiteDirectoryDataAnnotation cannot be cloned.");
        }

        clone.setDiscussion(cloneContainedThings ? new ContainerList<SiteDirectoryDataDiscussionItem>(clone) : new ContainerList<SiteDirectoryDataDiscussionItem>(this.getDiscussion(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setRelatedThing(cloneContainedThings ? new ContainerList<SiteDirectoryThingReference>(clone) : new ContainerList<SiteDirectoryThingReference>(this.getRelatedThing(), clone, false));

        if (cloneContainedThings) {
            clone.getDiscussion().addAll(this.getDiscussion().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getRelatedThing().addAll(this.getRelatedThing().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link SiteDirectoryDataAnnotation} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SiteDirectoryDataAnnotation}.
     */
    @Override
    public SiteDirectoryDataAnnotation clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SiteDirectoryDataAnnotation)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this SiteDirectoryDataAnnotation}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getAuthor() == null || this.getAuthor().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property author is null.");
            this.setAuthor(SentinelThingProvider.getSentinel(Person.class));
            this.sentinelResetMap.put("author", new ActionImpl(() -> this.setAuthor(null)));
        }

        if (this.getPrimaryAnnotatedThing() == null || this.getPrimaryAnnotatedThing().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property primaryAnnotatedThing is null.");
            this.setPrimaryAnnotatedThing(SentinelThingProvider.getSentinel(SiteDirectoryThingReference.class));
            this.sentinelResetMap.put("primaryAnnotatedThing", new ActionImpl(() -> this.setPrimaryAnnotatedThing(null)));
        }

        int relatedThingCount = this.getRelatedThing().size();
        if (relatedThingCount < 1) {
            errorList.add("The number of elements in the property relatedThing is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link SiteDirectoryDataAnnotation} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.SiteDirectoryDataAnnotation dto = (cdp4common.dto.SiteDirectoryDataAnnotation)dtoThing;

        this.setAuthor(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getAuthor(), dto.getIterationContainerId(), Person.class), SentinelThingProvider.getSentinel(Person.class)));
        this.setContent(dto.getContent());
        this.setCreatedOn(dto.getCreatedOn());
        PojoThingFactory.resolveList(this.getDiscussion(), dto.getDiscussion(), dto.getIterationContainerId(), this.getCache(), SiteDirectoryDataDiscussionItem.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setLanguageCode(dto.getLanguageCode());
        this.setModifiedOn(dto.getModifiedOn());
        this.setPrimaryAnnotatedThing(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getPrimaryAnnotatedThing(), dto.getIterationContainerId(), SiteDirectoryThingReference.class), SentinelThingProvider.getSentinel(SiteDirectoryThingReference.class)));
        PojoThingFactory.resolveList(this.getRelatedThing(), dto.getRelatedThing(), dto.getIterationContainerId(), this.getCache(), SiteDirectoryThingReference.class);
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link SiteDirectoryDataAnnotation}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.SiteDirectoryDataAnnotation dto = new cdp4common.dto.SiteDirectoryDataAnnotation(this.getIid(), this.getRevisionNumber());

        dto.setAuthor(this.getAuthor() != null ? this.getAuthor().getIid() : new UUID(0L, 0L));
        dto.setContent(this.getContent());
        dto.setCreatedOn(this.getCreatedOn());
        dto.getDiscussion().addAll(this.getDiscussion().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setLanguageCode(this.getLanguageCode());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setPrimaryAnnotatedThing(this.getPrimaryAnnotatedThing() != null ? this.getPrimaryAnnotatedThing().getIid() : new UUID(0L, 0L));
        dto.getRelatedThing().addAll(this.getRelatedThing().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
