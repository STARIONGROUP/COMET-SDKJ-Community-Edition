/* --------------------------------------------------------------------------------------------------------------------
 * FileRevision.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

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
 * representation of a persisted revision of a File
 * Note 1: The <i>name</i> property is used to denote the name of the FileRevision and therefore of the File, without any file type extension. So for a Microsoft Windows file the name contains the characters up to (but not including) the dot that separates the file name from the extension. The file type extension is stored in the associated FileType. Case is preserved in the file name.
 * Note 2: The representation of the actual file content of a FileRevision depends on the implementation technology and is not modeled as an explicit property. It may differ between server and client applications. A server application (e.g. a combination of a web services processor and a persistent data store) may store the content partitioned into chunks for reasons of efficiency. A client application may implement an API that provides access to an instance of a retrieved file in a locally accessible file system. There is a FileContentType data type that can be used in code generation or implementation.
 */
@Container(clazz = File.class, propertyName = "fileRevision")
@ToString
@EqualsAndHashCode(callSuper = true)
public class FileRevision extends Thing implements Cloneable, NamedThing, TimeStampedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the {@link FileRevision} class.
     */
    public FileRevision() {
        this.fileType = new OrderedItemList<FileType>(this, FileType.class);
    }

    /**
     * Initializes a new instance of the {@link FileRevision} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public FileRevision(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.fileType = new OrderedItemList<FileType>(this, FileType.class);
    }

    /**
     * Property containingFolder.
     * optional reference to the containing Folder
     * Note: If the reference is undefined (or null) the File and FileRevision are considered to be contained by the containing FileStore at the top level.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Folder containingFolder;

    /**
     * Property contentHash.
     * SHA-1 hash code of the content (byte stream) of this FileRevision
     * Note: The SHA-1 cryptographic hash is described in <a href="http://en.wikipedia.org/wiki/SHA-1">http://en.wikipedia.org/wiki/SHA-1</a>. It provides a unique hash to the file content of the FileRevision and was selected for future compatibility with a GIT (<a href="http://git-scm.com/">http://git-scm.com/</a>) version controlled file store. Implementations of E-TM-10-25 need to provide a way to associate a SHA-1 hash to the content of a file. Whether or not the content of two FileRevisions differs can then be determined by just comparing the SHA-1 hashes without the need for having access to the actual file content itself.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String contentHash;

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
     * Property creator.
     * reference to the Participant who created this FileRevision
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Participant creator;

    /**
     * List of ordered FileType.
     * reference to one or more FileTypes that define the type and format of this FileRevision
     * Note: A file can have more than one FileType in order to support possible encryption and compression formats. The order in which the FileTypes are defined is the same as the order the formats were applied from the "inside out", i.e. the first FileType is the normal format of the content, e.g. text or Microsoft Excel, and the subsequent formats are the encryption and/or compression formats, e.g. public-key cryptography standard <a href="http://en.wikipedia.org/wiki/PKCS">PKCS#7</a> and zip.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private OrderedItemList<FileType> fileType;

    /**
     * Property name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String name;

    /**
     * Property path.
     * full path name including folder path and type extension(s)
     * Note: The path is derived to be the concatenation of the path of the containingFolder (if any) followed by a forward slash and the name of this FileRevision and then a dot separated concatenation of the extensions of the associated FileTypes. This yields a path that is similar to that of a "file://" URL starting from the containing FileStore.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String path;

    /**
     * Gets the path.
     * full path name including folder path and type extension(s)
     * Note: The path is derived to be the concatenation of the path of the containingFolder (if any) followed by a forward slash and the name of this FileRevision and then a dot separated concatenation of the extensions of the associated FileTypes. This yields a path that is similar to that of a "file://" URL starting from the containing FileStore.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public String getPath(){
        return this.getDerivedPath();
    }

    /**
     * Sets the path.
     * full path name including folder path and type extension(s)
     * Note: The path is derived to be the concatenation of the path of the containingFolder (if any) followed by a forward slash and the name of this FileRevision and then a dot separated concatenation of the extensions of the associated FileTypes. This yields a path that is similar to that of a "file://" URL starting from the containing FileStore.
     *
     * @throws IllegalStateException The path property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public void setPath(String path){
        throw new IllegalStateException("Forbidden Set value for the derived property FileRevision.path");
    }

    /**
     * Creates and returns a copy of this {@link FileRevision} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link FileRevision}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        FileRevision clone;
        try {
            clone = (FileRevision)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow FileRevision cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setFileType(new OrderedItemList<FileType>(this.getFileType(), this, FileType.class));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link FileRevision} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link FileRevision}.
     */
    @Override
    public FileRevision clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (FileRevision)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this FileRevision}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (Strings.isNullOrEmpty(this.getContentHash())) {
            errorList.add("The property contentHash is null or empty.");
        }

        if (this.getCreator() == null || this.getCreator().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property creator is null.");
            this.setCreator(SentinelThingProvider.getSentinel(Participant.class));
            this.sentinelResetMap.put("creator", new ActionImpl(() -> this.setCreator(null)));
        }

        int fileTypeCount = this.getFileType().size();
        if (fileTypeCount < 1) {
            errorList.add("The number of elements in the property fileType is wrong. It should be at least 1.");
        }

        if (Strings.isNullOrEmpty(this.getName())) {
            errorList.add("The property name is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link FileRevision} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.FileRevision dto = (cdp4common.dto.FileRevision)dtoThing;

        this.setContainingFolder((dto.getContainingFolder() != null) ? PojoThingFactory.get(this.getCache(), dto.getContainingFolder(), dto.getIterationContainerId(), Folder.class) : null);
        this.setContentHash(dto.getContentHash());
        this.setCreatedOn(dto.getCreatedOn());
        this.setCreator(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getCreator(), dto.getIterationContainerId(), Participant.class), SentinelThingProvider.getSentinel(Participant.class)));
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getFileType(), dto.getFileType(), dto.getIterationContainerId(), this.getCache(), FileType.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link FileRevision}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.FileRevision dto = new cdp4common.dto.FileRevision(this.getIid(), this.getRevisionNumber());

        dto.setContainingFolder(this.getContainingFolder() != null ? (UUID)this.getContainingFolder().getIid() : null);
        dto.setContentHash(this.getContentHash());
        dto.setCreatedOn(this.getCreatedOn());
        dto.setCreator(this.getCreator() != null ? this.getCreator().getIid() : new UUID(0L, 0L));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getFileType().addAll(this.getFileType().toDtoOrderedItemList());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Returns the derived {@link #path} value
     *
     * @return The {@link #path} value
     */
    private String getDerivedPath() {
        StringBuilder path = new StringBuilder();
        Folder containingFolder = this.getContainingFolder();
        if (containingFolder != null) {
            path.append(containingFolder.getPath());
            path.append("/");
        }

        path.append(this.getContainingFolder().getName());
        path.append("/");
        path.append(this.getName());

        for (FileType fileType : this.getFileType()) {
            path.append(".");
            path.append(fileType.getExtension());
        }

        return path.toString();
    }
}
