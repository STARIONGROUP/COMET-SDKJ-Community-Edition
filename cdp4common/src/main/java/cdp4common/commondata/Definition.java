/* --------------------------------------------------------------------------------------------------------------------
 * AbstractDefinition.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.commondata;

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
 * representation of a textual definition in a given natural language
 * Note: The <i>content</i> property holds the actual text of this Definition.
 */
@Container(clazz = DefinedThing.class, propertyName = "definition")
@ToString
@EqualsAndHashCode
public  class Definition extends Thing implements Annotation {
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
     * Initializes a new instance of the {@link Definition} class.
     */
    public Definition() {
        this.citation = new ContainerList<Citation>(this);
        this.example = new OrderedItemList<String>(this);
        this.note = new OrderedItemList<String>(this);
    }

    /**
     * Initializes a new instance of the {@link Definition} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public Definition(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.citation = new ContainerList<Citation>(this);
        this.example = new OrderedItemList<String>(this);
        this.note = new OrderedItemList<String>(this);
    }

    /**
     * List of contained Citation.
     * collection of citations that are relevant to this Definition
     * Example:  The citation "Table 2" of  "ISO 80000-1". Here "Table 2" is defined as the <i>location</i> property of a Citation, and "ISO 80000-1" is represented by a ReferenceSource, referenced by the <i>source</i> property of the same Citation.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Citation> citation;

    /**
     * Property content.
     * textual content of the annotation expressed in the natural language as
     * specified in <i>languageCode</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String content;

    /**
     * List of ordered String.
     * possible list of examples that illustrate the use of this Definition
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<String> example;

    /**
     * Property languageCode.
     * code that defines the natural language in which the annotation is written
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String languageCode;

    /**
     * List of ordered String.
     * possible list of notes providing clarifications or more information about     this     Definition
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<String> note;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link Definition}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of contained Citation.
     * collection of citations that are relevant to this Definition
     * Example:  The citation "Table 2" of  "ISO 80000-1". Here "Table 2" is defined as the <i>location</i> property of a Citation, and "ISO 80000-1" is represented by a ReferenceSource, referenced by the <i>source</i> property of the same Citation.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Citation> getCitation(){
         return this.citation;
    }

    /**
     * Gets the content.
     * textual content of the annotation expressed in the natural language as
     * specified in <i>languageCode</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getContent(){
         return this.content;
    }

    /**
     * Gets a list of ordered String.
     * possible list of examples that illustrate the use of this Definition
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<String> getExample(){
         return this.example;
    }

    /**
     * Gets the languageCode.
     * code that defines the natural language in which the annotation is written
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getLanguageCode(){
         return this.languageCode;
    }

    /**
     * Gets a list of ordered String.
     * possible list of notes providing clarifications or more information about     this     Definition
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<String> getNote(){
         return this.note;
    }

    /**
     * Sets a list of contained Citation.
     * collection of citations that are relevant to this Definition
     * Example:  The citation "Table 2" of  "ISO 80000-1". Here "Table 2" is defined as the <i>location</i> property of a Citation, and "ISO 80000-1" is represented by a ReferenceSource, referenced by the <i>source</i> property of the same Citation.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setCitation(ContainerList<Citation> citation){
        this.citation = citation;
    }

    /**
     * Sets the content.
     * textual content of the annotation expressed in the natural language as
     * specified in <i>languageCode</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setContent(String content){
        this.content = content;
    }

    /**
     * Sets a list of ordered String.
     * possible list of examples that illustrate the use of this Definition
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     public void setExample(OrderedItemList<String> example){
        this.example = example;
    }

    /**
     * Sets the languageCode.
     * code that defines the natural language in which the annotation is written
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setLanguageCode(String languageCode){
        this.languageCode = languageCode;
    }

    /**
     * Sets a list of ordered String.
     * possible list of notes providing clarifications or more information about     this     Definition
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     public void setNote(OrderedItemList<String> note){
        this.note = note;
    }

    /**
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link Definition}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
        containers.add(this.citation);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link Definition} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Definition}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        Definition clone = (Definition)this.clone();
        clone.setCitation(cloneContainedThings ? new ContainerList<Citation>(clone) : new ContainerList<Citation>(this.getCitation(), clone));
        clone.setExample(new OrderedItemList<String>(this.getExample(), this));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setNote(new OrderedItemList<String>(this.getNote(), this));

        if (cloneContainedThings) {
            clone.getCitation().addAll(this.getCitation().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link Definition} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Definition}.
     */
    @Override
    public Definition clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Definition)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>Definition}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getContent().trim().isEmpty()) {
            errorList.add("The property content is null or empty.");
        }

        if (this.getLanguageCode().trim().isEmpty()) {
            errorList.add("The property languageCode is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link Definition} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Definition dto = (cdp4common.dto.Definition)dtoThing;

        this.getCitation().resolveList(dto.getCitation(), dto.getIterationContainerId(), this.getCache());
        this.setContent(dto.getContent());
        this.getExample().clearAndAddRange(dto.getExample());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setLanguageCode(dto.getLanguageCode());
        this.setModifiedOn(dto.getModifiedOn());
        this.getNote().clearAndAddRange(dto.getNote());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link Definition}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Definition dto = new cdp4common.dto.Definition(this.getIid(), this.getRevisionNumber());

        dto.getCitation().add(this.getCitation().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setContent(this.getContent());
        dto.getExample().add(this.getExample().toDtoOrderedItemList());
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setLanguageCode(this.getLanguageCode());
        dto.setModifiedOn(this.getModifiedOn());
        dto.getNote().add(this.getNote().toDtoOrderedItemList());
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
