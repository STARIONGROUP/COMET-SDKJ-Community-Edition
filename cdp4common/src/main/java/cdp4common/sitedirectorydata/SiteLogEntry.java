/* --------------------------------------------------------------------------------------------------------------------
 * SiteLogEntry.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

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
 * representation of a logbook entry for a SiteDirectory
 */
@Container(clazz = SiteDirectory.class, propertyName = "logEntry")
@ToString
@EqualsAndHashCode(callSuper = true)
public class SiteLogEntry extends Thing implements Cloneable, Annotation, CategorizableThing, LogEntry, TimeStampedThing {
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
     * Initializes a new instance of the {@link SiteLogEntry} class.
     */
    public SiteLogEntry() {
        this.affectedItemIid = new ArrayList<UUID>();
        this.category = new ArrayList<Category>();
    }

    /**
     * Initializes a new instance of the {@link SiteLogEntry} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public SiteLogEntry(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.affectedItemIid = new ArrayList<UUID>();
        this.category = new ArrayList<Category>();
    }

    /**
     * List of UUID.
     * weak reference to zero or more items that are relevant to or affected by what is described in the content of this LogEntry
     * Note: Each reference should be an <i>iid</i> of a Thing that exists when the log entry is created. The references are of type Uuid in order to support retaining log entries even when the referenced Thing is later deleted. An implementation of E-TM-10-25 shall support a mechanism to dereference items by Uuid and report when items can not (no longer) be dereferenced.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<UUID> affectedItemIid;

    /**
     * Property author.
     * reference to the Person who logged this LogEntry
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Person author;

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<Category> category;

    /**
     * Property content.
     * textual content of the annotation expressed in the natural language as
     * specified in <i>languageCode</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String content;

    /**
     * Property createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private LocalDateTime createdOn;

    /**
     * Property languageCode.
     * code that defines the natural language in which the annotation is written
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String languageCode;

    /**
     * Property level.
     * level of this LogEntry
     * Note: The <i>level</i> can be used to filter log entries. Also applications may provide a setting that switches on or off logging log entries of a certain level.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private LogLevelKind level;

    /**
     * Creates and returns a copy of this {@link SiteLogEntry} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SiteLogEntry}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        SiteLogEntry clone;
        try {
            clone = (SiteLogEntry)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow SiteLogEntry cannot be cloned.");
        }

        clone.setAffectedItemIid(new ArrayList<UUID>(this.getAffectedItemIid()));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link SiteLogEntry} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SiteLogEntry}.
     */
    @Override
    public SiteLogEntry clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SiteLogEntry)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this SiteLogEntry}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (Strings.isNullOrEmpty(this.getContent())) {
            errorList.add("The property content is null or empty.");
        }

        if (Strings.isNullOrEmpty(this.getLanguageCode())) {
            errorList.add("The property languageCode is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link SiteLogEntry} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.SiteLogEntry dto = (cdp4common.dto.SiteLogEntry)dtoThing;

        PojoThingFactory.clearAndAddRange(this.getAffectedItemIid(), dto.getAffectedItemIid());
        this.setAuthor((dto.getAuthor() != null) ? PojoThingFactory.get(this.getCache(), dto.getAuthor(), dto.getIterationContainerId(), Person.class) : null);
        PojoThingFactory.resolveList(this.getCategory(), dto.getCategory(), dto.getIterationContainerId(), this.getCache(), Category.class);
        this.setContent(dto.getContent());
        this.setCreatedOn(dto.getCreatedOn());
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setLanguageCode(dto.getLanguageCode());
        this.setLevel(dto.getLevel());
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link SiteLogEntry}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.SiteLogEntry dto = new cdp4common.dto.SiteLogEntry(this.getIid(), this.getRevisionNumber());

        dto.getAffectedItemIid().addAll(this.getAffectedItemIid());
        dto.setAuthor(this.getAuthor() != null ? (UUID)this.getAuthor().getIid() : null);
        dto.getCategory().addAll(this.getCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setContent(this.getContent());
        dto.setCreatedOn(this.getCreatedOn());
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setLanguageCode(this.getLanguageCode());
        dto.setLevel(this.getLevel());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
