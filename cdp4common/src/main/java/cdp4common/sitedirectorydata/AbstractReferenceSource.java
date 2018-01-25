/* --------------------------------------------------------------------------------------------------------------------
 * AbstractReferenceSource.java
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
 * representation of an information source that can be referenced
 * Note 1: The <i>name</i> property should be used to provide a descriptive human readable name of this ReferenceSource, e.g. the title of a book, a standard or an article. The <i>shortName</i> property should be used to provide a concise human readable identifier of this ReferenceSource, e.g. a standard identification code, an abbreviated reference such as in a paper or report.
 * Note 2: A description of the information source may be given in the <i>content</i> property of an associated Definition. Alternative names may be given in associated Aliases. On-line references may be given in associated HyperLinks.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "referenceSource")
public abstract class AbstractReferenceSource extends AbstractDefinedThing implements CategorizableThing, DeprecatableThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>ReferenceSource<code/> class.
     *
     * @see ReferenceSource
     */
    public AbstractReferenceSource() {
        this.category = new List<Category>();
    }

    /**
     * Initializes a new instance of the <code>ReferenceSource<code/> class.
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
     * @see ReferenceSource
     */
    public AbstractReferenceSource(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.category = new List<Category>();
    }

    /**
     * Property author.
     * optional specification of the author or authors of this ReferenceSource
     * Note: If there are multiple authors, the author names should be separated by commas.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String author;

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<Category> category;

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isDeprecated;

    /**
     * Property language.
     * optional specification of the natural language code that this     ReferenceSource     is     written     in
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String language;

    /**
     * Property publicationYear.
     * optional year of publication of this ReferenceSource
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private Integer publicationYear;

    /**
     * Property publishedIn.
     * optional reference to another ReferenceSource than this ReferenceSource,     in     which     this     ReferenceSource     is     published
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ReferenceSource publishedIn;

    /**
     * Property publisher.
     * optional reference to the Organization that is the publisher of this     ReferenceSource
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Organization publisher;

    /**
     * Property versionDate.
     * optional date of release of this version of this ReferenceSource
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private LocalDateTime versionDate;

    /**
     * Property versionIdentifier.
     * optional identifier denoting the version of this ReferenceSource
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String versionIdentifier;

    /**
     * Gets the author.
     * optional specification of the author or authors of this ReferenceSource
     * Note: If there are multiple authors, the author names should be separated by commas.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getAuthor(){
         return this.author;
    }

    /**
     * Gets a list of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public List<Category> getCategory(){
         return this.category;
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
     * Gets the language.
     * optional specification of the natural language code that this     ReferenceSource     is     written     in
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getLanguage(){
         return this.language;
    }

    /**
     * Gets the publicationYear.
     * optional year of publication of this ReferenceSource
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public Integer getPublicationYear(){
         return this.publicationYear;
    }

    /**
     * Gets the publishedIn.
     * optional reference to another ReferenceSource than this ReferenceSource,     in     which     this     ReferenceSource     is     published
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ReferenceSource getPublishedIn(){
         return this.publishedIn;
    }

    /**
     * Gets the publisher.
     * optional reference to the Organization that is the publisher of this     ReferenceSource
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Organization getPublisher(){
         return this.publisher;
    }

    /**
     * Gets the versionDate.
     * optional date of release of this version of this ReferenceSource
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public LocalDateTime getVersionDate(){
         return this.versionDate;
    }

    /**
     * Gets the versionIdentifier.
     * optional identifier denoting the version of this ReferenceSource
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getVersionIdentifier(){
         return this.versionIdentifier;
    }

    /**
     * Sets the author.
     * optional specification of the author or authors of this ReferenceSource
     * Note: If there are multiple authors, the author names should be separated by commas.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setAuthor(String author){
        this.author = author;
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
     *Sets a value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDeprecated(boolean isDeprecated){
        this.isDeprecated = isDeprecated;
    }

    /**
     * Sets the language.
     * optional specification of the natural language code that this     ReferenceSource     is     written     in
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setLanguage(String language){
        this.language = language;
    }

    /**
     * Sets the publicationYear.
     * optional year of publication of this ReferenceSource
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setPublicationYear(Integer publicationYear){
        this.publicationYear = publicationYear;
    }

    /**
     * Sets the publishedIn.
     * optional reference to another ReferenceSource than this ReferenceSource,     in     which     this     ReferenceSource     is     published
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setPublishedIn(ReferenceSource publishedIn){
        this.publishedIn = publishedIn;
    }

    /**
     * Sets the publisher.
     * optional reference to the Organization that is the publisher of this     ReferenceSource
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setPublisher(Organization publisher){
        this.publisher = publisher;
    }

    /**
     * Sets the versionDate.
     * optional date of release of this version of this ReferenceSource
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setVersionDate(LocalDateTime versionDate){
        this.versionDate = versionDate;
    }

    /**
     * Sets the versionIdentifier.
     * optional identifier denoting the version of this ReferenceSource
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setVersionIdentifier(String versionIdentifier){
        this.versionIdentifier = versionIdentifier;
    }

    /**
     * Creates and returns a copy of this <code>ReferenceSource<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ReferenceSource<code/>.
     *
     * @see ReferenceSource
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ReferenceSource clone = (ReferenceSource)this.clone();
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
     * Creates and returns a copy of this <code>ReferenceSource<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ReferenceSource<code/>.
     * 
     * @see ReferenceSource
     */
    @Override
    public ReferenceSource clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ReferenceSource)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ReferenceSource<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ReferenceSource
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ReferenceSource<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ReferenceSource
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ReferenceSource dto = (cdp4common.dto.ReferenceSource)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.author = dto.getAuthor();
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.isDeprecated = dto.getIsDeprecated();
        this.language = dto.getLanguage();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.publicationYear = dto.getPublicationYear();
        this.publishedIn = (dto.getPublishedIn() != null) ? this.cache.get<ReferenceSource>(dto.getPublishedIn.getValue(), dto.getIterationContainerId()) : null;
        this.publisher = (dto.getPublisher() != null) ? this.cache.get<Organization>(dto.getPublisher.getValue(), dto.getIterationContainerId()) : null;
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();
        this.versionDate = dto.getVersionDate();
        this.versionIdentifier = dto.getVersionIdentifier();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ReferenceSource<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ReferenceSource
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ReferenceSource dto = new cdp4common.dto.ReferenceSource(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setAuthor(this.author);
        dto.getCategory().add(this.category.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsDeprecated(this.isDeprecated);
        dto.setLanguage(this.language);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.setPublicationYear(this.publicationYear);
        dto.setPublishedIn(this.publishedIn != null ? (UUID)this.publishedIn.getIid() : null);
        dto.setPublisher(this.publisher != null ? (UUID)this.publisher.getIid() : null);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);
        dto.setVersionDate(this.versionDate);
        dto.setVersionIdentifier(this.versionIdentifier);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
