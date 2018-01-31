/* --------------------------------------------------------------------------------------------------------------------
 * AbstractModellingAnnotationItem.java
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
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * abstract super class that represents a modelling annotation made on a modelling item
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = EngineeringModel.class, propertyName = "modellingAnnotation")
@ToString
@EqualsAndHashCode
public  abstract class ModellingAnnotationItem extends EngineeringModelDataAnnotation implements Cloneable, CategorizableThing, OwnedThing, ShortNamedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the {@link ModellingAnnotationItem} class.
     */
    protected ModellingAnnotationItem() {
        this.approvedBy = new ContainerList<Approval>(this);
        this.category = new ArrayList<Category>();
        this.sourceAnnotation = new ArrayList<ModellingAnnotationItem>();
    }

    /**
     * Initializes a new instance of the {@link ModellingAnnotationItem} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected ModellingAnnotationItem(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.approvedBy = new ContainerList<Approval>(this);
        this.category = new ArrayList<Category>();
        this.sourceAnnotation = new ArrayList<ModellingAnnotationItem>();
    }

    /**
     * List of contained Approval.
     * The different approval that were made on this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Approval> approvedBy;

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<Category> category;

    /**
     * Property classification.
     * The classification of the current annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private AnnotationClassificationKind classification;

    /**
     * Property owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DomainOfExpertise owner;

    /**
     * Property shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String shortName;

    /**
     * List of ModellingAnnotationItem.
     * The modelling annotations that are at the origin of the creation of this modelling annotation if any
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<ModellingAnnotationItem> sourceAnnotation;

    /**
     * Property status.
     * Represents the status of the current annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private AnnotationStatusKind status;

    /**
     * Property title.
     * Represents the title of the current annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String title;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link ModellingAnnotationItem}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of contained Approval.
     * The different approval that were made on this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Approval> getApprovedBy(){
         return this.approvedBy;
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
     * Gets the classification.
     * The classification of the current annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public AnnotationClassificationKind getClassification(){
         return this.classification;
    }

    /**
     * Gets the owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public DomainOfExpertise getOwner(){
         return this.owner;
    }

    /**
     * Gets the shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getShortName(){
         return this.shortName;
    }

    /**
     * Gets a list of ModellingAnnotationItem.
     * The modelling annotations that are at the origin of the creation of this modelling annotation if any
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<ModellingAnnotationItem> getSourceAnnotation(){
         return this.sourceAnnotation;
    }

    /**
     * Gets the status.
     * Represents the status of the current annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public AnnotationStatusKind getStatus(){
         return this.status;
    }

    /**
     * Gets the title.
     * Represents the title of the current annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getTitle(){
         return this.title;
    }

    /**
     * Sets a list of contained Approval.
     * The different approval that were made on this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setApprovedBy(ContainerList<Approval> approvedBy){
        this.approvedBy = approvedBy;
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
     * Sets the classification.
     * The classification of the current annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setClassification(AnnotationClassificationKind classification){
        this.classification = classification;
    }

    /**
     * Sets the owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setOwner(DomainOfExpertise owner){
        this.owner = owner;
    }

    /**
     * Sets the shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setShortName(String shortName){
        this.shortName = shortName;
    }

    /**
     * Sets a list of ModellingAnnotationItem.
     * The modelling annotations that are at the origin of the creation of this modelling annotation if any
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setSourceAnnotation(ArrayList<ModellingAnnotationItem> sourceAnnotation){
        this.sourceAnnotation = sourceAnnotation;
    }

    /**
     * Sets the status.
     * Represents the status of the current annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setStatus(AnnotationStatusKind status){
        this.status = status;
    }

    /**
     * Sets the title.
     * Represents the title of the current annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setTitle(String title){
        this.title = title;
    }

    /**
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link ModellingAnnotationItem}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
        containers.add(this.approvedBy);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link ModellingAnnotationItem} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ModellingAnnotationItem}.
     */
    @Override
    public ModellingAnnotationItem clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ModellingAnnotationItem)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ModellingAnnotationItem}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getOwner() == null || this.getOwner().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property owner is null.");
            this.setOwner(SentinelThingProvider.getSentinel<DomainOfExpertise>());
            this.sentinelResetMap.put("owner", new ActionImpl(() -> this.setOwner(null)));
        }

        if (this.getShortName().trim().isEmpty()) {
            errorList.add("The property shortName is null or empty.");
        }

        if (this.getTitle().trim().isEmpty()) {
            errorList.add("The property title is null or empty.");
        }

        return errorList;
    }
}
