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
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of an information source that can be referenced
 * Note 1: The <i>name</i> property should be used to provide a descriptive human readable name of this ReferenceSource, e.g. the title of a book, a standard or an article. The <i>shortName</i> property should be used to provide a concise human readable identifier of this ReferenceSource, e.g. a standard identification code, an abbreviated reference such as in a paper or report.
 * Note 2: A description of the information source may be given in the <i>content</i> property of an associated Definition. Alternative names may be given in associated Aliases. On-line references may be given in associated HyperLinks.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "referenceSource")
@ToString
@EqualsAndHashCode
public  class ReferenceSource extends DefinedThing implements CategorizableThing, DeprecatableThing {
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
     * Initializes a new instance of the {@link ReferenceSource} class.
     */
    public ReferenceSource() {
        this.category = new ArrayList<Category>();
    }

    /**
     * Initializes a new instance of the {@link ReferenceSource} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ReferenceSource(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.category = new ArrayList<Category>();
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
    private ArrayList<Category> category;

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
    public ArrayList<Category> getCategory(){
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
     public void setCategory(ArrayList<Category> category){
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
     * Creates and returns a copy of this {@link ReferenceSource} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ReferenceSource}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ReferenceSource clone = (ReferenceSource)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ReferenceSource} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ReferenceSource}.
     */
    @Override
    public ReferenceSource clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ReferenceSource)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ReferenceSource}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ReferenceSource} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ReferenceSource dto = (cdp4common.dto.ReferenceSource)dtoThing;

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.setAuthor(dto.getAuthor());
        this.getCategory().resolveList(dto.getCategory(), dto.getIterationContainerId(), this.getCache());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setDeprecated(dto.getDeprecated());
        this.setLanguage(dto.getLanguage());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setPublicationYear(dto.getPublicationYear());
        this.setPublishedIn((dto.getPublishedIn() != null) ? this.getCache().get<ReferenceSource>(dto.getPublishedIn.getValue(), dto.getIterationContainerId()) : null);
        this.setPublisher((dto.getPublisher() != null) ? this.getCache().get<Organization>(dto.getPublisher.getValue(), dto.getIterationContainerId()) : null);
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.setVersionDate(dto.getVersionDate());
        this.setVersionIdentifier(dto.getVersionIdentifier());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ReferenceSource}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ReferenceSource dto = new cdp4common.dto.ReferenceSource(this.getIid(), this.getRevisionNumber());

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setAuthor(this.getAuthor());
        dto.getCategory().add(this.getCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setDeprecated(this.getDeprecated());
        dto.setLanguage(this.getLanguage());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setPublicationYear(this.getPublicationYear());
        dto.setPublishedIn(this.getPublishedIn() != null ? (UUID)this.getPublishedIn().getIid() : null);
        dto.setPublisher(this.getPublisher() != null ? (UUID)this.getPublisher().getIid() : null);
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.setVersionDate(this.getVersionDate());
        dto.setVersionIdentifier(this.getVersionIdentifier());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
