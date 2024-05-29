/* --------------------------------------------------------------------------------------------------------------------
 * ChangeRequest.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.reportingdata;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.exceptions.ContainmentException;
import cdp4common.extensions.*;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import org.apache.commons.lang3.ObjectUtils;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * The objective of a change request is to collect the information that formally
 * defines a proposed programme or project change versus the existing
 * requirements.
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = EngineeringModel.class, propertyName = "modellingAnnotation")
@ToString
public class ChangeRequest extends ContractDeviation implements Cloneable {
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
     * Initializes a new instance of the {@link ChangeRequest} class.
     */
    public ChangeRequest() {
    }

    /**
     * Initializes a new instance of the {@link ChangeRequest} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ChangeRequest(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Creates and returns a copy of this {@link ChangeRequest} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ChangeRequest}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ChangeRequest clone;
        try {
            clone = (ChangeRequest)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ChangeRequest cannot be cloned.");
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
     * Creates and returns a copy of this {@link ChangeRequest} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ChangeRequest}.
     */
    @Override
    public ChangeRequest clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ChangeRequest)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ChangeRequest}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ChangeRequest} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ChangeRequest dto = (cdp4common.dto.ChangeRequest)dtoThing;

        PojoThingFactory.resolveList(this.getApprovedBy(), dto.getApprovedBy(), dto.getIterationContainerId(), this.getCache(), Approval.class);
        this.setAuthor(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getAuthor(), dto.getIterationContainerId(), Participant.class), SentinelThingProvider.getSentinel(Participant.class)));
        PojoThingFactory.resolveList(this.getCategory(), dto.getCategory(), dto.getIterationContainerId(), this.getCache(), Category.class);
        this.setClassification(dto.getClassification());
        this.setContent(dto.getContent());
        this.setCreatedOn(dto.getCreatedOn());
        PojoThingFactory.resolveList(this.getDiscussion(), dto.getDiscussion(), dto.getIterationContainerId(), this.getCache(), EngineeringModelDataDiscussionItem.class);
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
        this.setThingPreference(dto.getThingPreference());
        this.setTitle(dto.getTitle());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ChangeRequest}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ChangeRequest dto = new cdp4common.dto.ChangeRequest(this.getIid(), this.getRevisionNumber());

        dto.getApprovedBy().addAll(this.getApprovedBy().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setAuthor(this.getAuthor() != null ? this.getAuthor().getIid() : new UUID(0L, 0L));
        dto.getCategory().addAll(this.getCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setClassification(this.getClassification());
        dto.setContent(this.getContent());
        dto.setCreatedOn(this.getCreatedOn());
        dto.getDiscussion().addAll(this.getDiscussion().stream().map(Thing::getIid).collect(Collectors.toList()));
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
        dto.setThingPreference(this.getThingPreference());
        dto.setTitle(this.getTitle());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
