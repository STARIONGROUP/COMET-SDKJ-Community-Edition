/* --------------------------------------------------------------------------------------------------------------------
 * AbstractRuleVerification.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

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
 * representation of built-in data model rule or user-defined Rule to be verified and its current verification result
 */
@Container(clazz = RuleVerificationList.class, propertyName = "ruleVerification")
@ToString
@EqualsAndHashCode
public  abstract class RuleVerification extends Thing implements Cloneable, NamedThing, OwnedThing {
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
     * Initializes a new instance of the {@link RuleVerification} class.
     */
    protected RuleVerification() {
        this.violation = new ContainerList<RuleViolation>(this);
    }

    /**
     * Initializes a new instance of the {@link RuleVerification} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected RuleVerification(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.violation = new ContainerList<RuleViolation>(this);
    }

    /**
     * Property executedOn.
     * date and time of the last executed verification of the associated rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private LocalDateTime executedOn;

    /**
     * Value indicating whether isActive.
     * assertion whether the associated built-in data model rule or user-defined Rule is active, i.e. shall be verified in the next verification execution
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isActive;

    /**
     * Property name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String name;

    /**
     * Property owner.
     * reference to the owner DomainOfExpertise of this RuleVerification
     * Note: The owner is the same as the <i>owner</i> of the containing RuleVerificationList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private DomainOfExpertise owner;
 
    /**
     * Property status.
     * status of the last executed verification of the associated rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private RuleVerificationStatusKind status;

    /**
     * List of contained RuleViolation.
     * set of violations, if any, of rules having been verified
     * Note: A RuleViolation provides explanatory information to help the user correct the EngineeringModel so that the associated rule will be satisfied.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = false)
    private ContainerList<RuleViolation> violation;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link RuleVerification}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets the executedOn.
     * date and time of the last executed verification of the associated rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public LocalDateTime getExecutedOn(){
         return this.executedOn;
    }

    /**
     * Gets a value indicating whether isActive.
     * assertion whether the associated built-in data model rule or user-defined Rule is active, i.e. shall be verified in the next verification execution
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getActive(){
         return this.isActive;
    }

    /**
     * Gets the name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getName(){
         return this.name;
    }

    /**
     * Gets the owner.
     * reference to the owner DomainOfExpertise of this RuleVerification
     * Note: The owner is the same as the <i>owner</i> of the containing RuleVerificationList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public DomainOfExpertise getOwner(){
        return this.GetDerivedOwner();
    }

    /**
     * Gets the status.
     * status of the last executed verification of the associated rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public RuleVerificationStatusKind getStatus(){
         return this.status;
    }

    /**
     * Gets a list of contained RuleViolation.
     * set of violations, if any, of rules having been verified
     * Note: A RuleViolation provides explanatory information to help the user correct the EngineeringModel so that the associated rule will be satisfied.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = false)
    public ContainerList<RuleViolation> getViolation(){
         return this.violation;
    }

    /**
     * Sets the executedOn.
     * date and time of the last executed verification of the associated rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setExecutedOn(LocalDateTime executedOn){
        this.executedOn = executedOn;
    }

    /**
     *Sets a value indicating whether isActive.
     * assertion whether the associated built-in data model rule or user-defined Rule is active, i.e. shall be verified in the next verification execution
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setActive(boolean isActive){
        this.isActive = isActive;
    }

    /**
     * Sets the name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the owner.
     * reference to the owner DomainOfExpertise of this RuleVerification
     * Note: The owner is the same as the <i>owner</i> of the containing RuleVerificationList.
     *
     * @throws IllegalStateException The owner property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setOwner(DomainOfExpertise owner){
        throw new IllegalStateException("Forbidden Set value for the derived property RuleVerification.owner");
    }

    /**
     * Sets the status.
     * status of the last executed verification of the associated rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setStatus(RuleVerificationStatusKind status){
        this.status = status;
    }

    /**
     * Sets a list of contained RuleViolation.
     * set of violations, if any, of rules having been verified
     * Note: A RuleViolation provides explanatory information to help the user correct the EngineeringModel so that the associated rule will be satisfied.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = false)
     protected void setViolation(ContainerList<RuleViolation> violation){
        this.violation = violation;
    }

    /**
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link RuleVerification}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
        containers.add(this.violation);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link RuleVerification} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link RuleVerification}.
     */
    @Override
    public RuleVerification clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (RuleVerification)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>RuleVerification}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getName().trim().isEmpty()) {
            errorList.add("The property name is null or empty.");
        }

        return errorList;
    }
}
