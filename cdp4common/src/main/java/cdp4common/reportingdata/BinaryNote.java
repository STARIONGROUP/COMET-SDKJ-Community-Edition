/* --------------------------------------------------------------------------------------------------------------------
 * AbstractBinaryNote.java
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
 * Represents a record of points or ideas in the form of a binary flie such as an image, table as an aid to memory
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = Page.class, propertyName = "note")
@ToString
@EqualsAndHashCode
public  class BinaryNote extends Note  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the <code>BinaryNote<code/> class.
     *
     * @see BinaryNote
     */
    public BinaryNote() {
    }

    /**
     * Initializes a new instance of the <code>BinaryNote<code/> class.
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
     * @see BinaryNote
     */
    public BinaryNote(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property caption.
     * A human readable title or brief explanation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String caption;

    /**
     * Property fileType.
     * reference to one FileType that defines the type and format of this BinaryNote
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private FileType fileType;

    /**
     * Gets the caption.
     * A human readable title or brief explanation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getCaption(){
         return this.caption;
    }

    /**
     * Gets the fileType.
     * reference to one FileType that defines the type and format of this BinaryNote
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public FileType getFileType(){
         return this.fileType;
    }

    /**
     * Sets the caption.
     * A human readable title or brief explanation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setCaption(String caption){
        this.caption = caption;
    }

    /**
     * Sets the fileType.
     * reference to one FileType that defines the type and format of this BinaryNote
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setFileType(FileType fileType){
        this.fileType = fileType;
    }

    /**
     * Creates and returns a copy of this <code>BinaryNote<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>BinaryNote<code/>.
     *
     * @see BinaryNote
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        BinaryNote clone = (BinaryNote)this.clone();
        clone.setCategory(new List<Category>(this.getCategory()));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>BinaryNote<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>BinaryNote<code/>.
     * 
     * @see BinaryNote
     */
    @Override
    public BinaryNote clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (BinaryNote)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>BinaryNote<code/>.
     *
     * @return A list of potential errors.
     *
     * @see BinaryNote
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getCaption().trim().isEmpty()) {
            errorList.add("The property caption is null or empty.");
        }

        if (this.getFileType() == null || this.getFileType().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property fileType is null.");
            this.setFileType(SentinelThingProvider.getSentinel<FileType>());
            this.sentinelResetMap["fileType"] = () -> this.setFileType(null);
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>BinaryNote<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see BinaryNote
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.BinaryNote dto = (cdp4common.dto.BinaryNote)dtoThing;

        this.setCaption(dto.getCaption());
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.getCache());
        this.setCreatedOn(dto.getCreatedOn());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setFileType(this.cache.get<FileType>(dto.getFileType(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<FileType>());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setOwner(this.cache.get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>BinaryNote<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see BinaryNote
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.BinaryNote dto = new cdp4common.dto.BinaryNote(this.getIid(), this.getRevisionNumber());

        dto.setCaption(this.getCaption());
        dto.getCategory().add(this.getCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setCreatedOn(this.getCreatedOn());
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setFileType(this.getFileType() != null ? this.getFileType().getIid() : new UUID(0L, 0L));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
