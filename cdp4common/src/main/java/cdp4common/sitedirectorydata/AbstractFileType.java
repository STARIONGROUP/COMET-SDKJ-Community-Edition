/* --------------------------------------------------------------------------------------------------------------------
 * AbstractFileType.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

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
 * representation of the type of a File
 * Note 1: A File may have more than one FileType, see the note under <i>fileType</i> of File.
 * Note 2: Where available the <i>shortName</i> should be the assigned <a href="http://en.wikipedia.org/wiki/MIME_type">MIME</a> or <a href="http://en.wikipedia.org/wiki/S/MIME">S/MIME</a> media type name as defined by <a href="http://datatracker.ietf.org/doc/rfc2046/">IETF RFC2046</a>. The official list of media types is maintained by IANA at <a href="http://www.iana.org/assignments/media-types/index.html">http://www.iana.org/assignments/media-types/index.html</a>. The hyperLink should reference the relevant definition in this list.
 * Example: Example media types are "text/plain", "text/html",  "image/png", "application/vnd.ms-excel.sheet.macroEnabled.12".
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "fileType")
public abstract class AbstractFileType extends AbstractDefinedThing implements CategorizableThing, DeprecatableThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>FileType<code/> class.
     *
     * @see FileType
     */
    public AbstractFileType() {
        this.category = new List<Category>();
    }

    /**
     * Initializes a new instance of the <code>FileType<code/> class.
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
     * @see FileType
     */
    public AbstractFileType(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.category = new List<Category>();
    }

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<Category> category;

    /**
     * Property extension.
     * representation of the extension of this File
     * Note: This is the character string denoting the file extension on the Microsoft Windows operating system. It should be written entirely in lowercase. The dot that conventionally separates the file name from the file extension is not part of the extension character string.
     * Example: Example extension and media type combinations are " "txt" and "text/plain", "html" and "text/html",  "png" and "image/png", "xlsm" and "application/vnd.ms-excel.sheet.macroEnabled.12".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String extension;

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isDeprecated;

    /**
     * Gets a list of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public List<Category> getCategory(){
         return this.category;
    }

    /**
     * Gets the extension.
     * representation of the extension of this File
     * Note: This is the character string denoting the file extension on the Microsoft Windows operating system. It should be written entirely in lowercase. The dot that conventionally separates the file name from the file extension is not part of the extension character string.
     * Example: Example extension and media type combinations are " "txt" and "text/plain", "html" and "text/html",  "png" and "image/png", "xlsm" and "application/vnd.ms-excel.sheet.macroEnabled.12".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getExtension(){
         return this.extension;
    }

    /**
     * Gets a value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getDeprecated(){
         return this.isDeprecated;
    }

    /**
     * Sets a list of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setCategory(List<Category> category){
        this.category = category;
    }

    /**
     * Sets the extension.
     * representation of the extension of this File
     * Note: This is the character string denoting the file extension on the Microsoft Windows operating system. It should be written entirely in lowercase. The dot that conventionally separates the file name from the file extension is not part of the extension character string.
     * Example: Example extension and media type combinations are " "txt" and "text/plain", "html" and "text/html",  "png" and "image/png", "xlsm" and "application/vnd.ms-excel.sheet.macroEnabled.12".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setExtension(String extension){
        this.extension = extension;
    }

    /**
     *Sets a value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDeprecated(boolean isDeprecated){
        this.isDeprecated = isDeprecated;
    }

    /**
     * Creates and returns a copy of this <code>FileType<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>FileType<code/>.
     *
     * @see FileType
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        FileType clone = (FileType)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setCategory(new List<Category>(this.category));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>FileType<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>FileType<code/>.
     * 
     * @see FileType
     */
    @Override
    public FileType clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (FileType)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>FileType<code/>.
     *
     * @return A list of potential errors.
     *
     * @see FileType
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.extension.trim().isEmpty()) {
            errorList.add("The property extension is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>FileType<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see FileType
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.FileType dto = (cdp4common.dto.FileType)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.extension = dto.getExtension();
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.isDeprecated = dto.getIsDeprecated();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>FileType<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see FileType
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.FileType dto = new cdp4common.dto.FileType(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getCategory().add(this.category.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setExtension(this.extension);
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsDeprecated(this.isDeprecated);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
