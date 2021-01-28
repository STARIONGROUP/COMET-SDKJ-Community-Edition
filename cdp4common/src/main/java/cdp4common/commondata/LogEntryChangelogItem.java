/* --------------------------------------------------------------------------------------------------------------------
 * LogEntryChangelogItem.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
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

package cdp4common.commondata;

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
 * Contains particular information for a single changelog item that was part of the parent LogEntry.
 */
@CDPVersion(version = "1.2.0")
@Container(clazz = LogEntry.class, propertyName = "logEntryChangelogItem")
@ToString
public class LogEntryChangelogItem extends Thing implements Cloneable {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the {@link LogEntryChangelogItem} class.
     */
    public LogEntryChangelogItem() {
        this.affectedReferenceIid = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link LogEntryChangelogItem} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public LogEntryChangelogItem(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.affectedReferenceIid = new ArrayList<UUID>();
    }

    /**
     * Property affectedItemIid.
     * The unique identifier of the Thing that this changelog item concerns. Must correspond to one of the Uuids in the affectedItemIid list of the parent LogEntry.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private UUID affectedItemIid;

    /**
     * List of UUID.
     * The list of Thing Uuid's that are affected by association to the Thing represented by affectedThingIid. Used to filter relevance of this LogEntryChangelogItem to the user.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<UUID> affectedReferenceIid;

    /**
     * Property changeDescription.
     * The natural language description of the change expressed in this LogEntryChangelogItem.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String changeDescription;

    /**
     * Property changelogKind.
     * The type of action signified by this LogEntryChangelogItem.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private LogEntryChangelogItemKind changelogKind;

    /**
     * Creates and returns a copy of this {@link LogEntryChangelogItem} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link LogEntryChangelogItem}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        LogEntryChangelogItem clone;
        try {
            clone = (LogEntryChangelogItem)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow LogEntryChangelogItem cannot be cloned.");
        }

        clone.setAffectedReferenceIid(new ArrayList<UUID>(this.getAffectedReferenceIid()));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link LogEntryChangelogItem} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link LogEntryChangelogItem}.
     */
    @Override
    public LogEntryChangelogItem clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (LogEntryChangelogItem)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this LogEntryChangelogItem}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link LogEntryChangelogItem} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.LogEntryChangelogItem dto = (cdp4common.dto.LogEntryChangelogItem)dtoThing;

        this.setAffectedItemIid(dto.getAffectedItemIid());
        PojoThingFactory.clearAndAddRange(this.getAffectedReferenceIid(), dto.getAffectedReferenceIid());
        this.setChangeDescription(dto.getChangeDescription());
        this.setChangelogKind(dto.getChangelogKind());
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setThingPreference(dto.getThingPreference());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link LogEntryChangelogItem}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.LogEntryChangelogItem dto = new cdp4common.dto.LogEntryChangelogItem(this.getIid(), this.getRevisionNumber());

        dto.setAffectedItemIid(this.getAffectedItemIid());
        dto.getAffectedReferenceIid().addAll(this.getAffectedReferenceIid());
        dto.setChangeDescription(this.getChangeDescription());
        dto.setChangelogKind(this.getChangelogKind());
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setThingPreference(this.getThingPreference());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
