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

/**
 * representation of built-in data model rule or user-defined Rule to be verified and its current verification result
 */
@Container(clazz = RuleVerificationList.class, propertyName = "ruleVerification")
public abstract class AbstractRuleVerification extends AbstractThing implements NamedThing, OwnedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>RuleVerification<code/> class.
     *
     * @see RuleVerification
     */
    protected AbstractRuleVerification() {
        this.violation = new ContainerList<RuleViolation>(this);
    }

    /**
     * Initializes a new instance of the <code>RuleVerification<code/> class.
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
     * @see RuleVerification
     */
    protected AbstractRuleVerification(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
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
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>RuleVerification<code/>.
     *
     * @see Iterable
     * @see RuleVerification
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
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>RuleVerification<code/>.
     *
     * @see Iterable
     * @see RuleVerification
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.violation);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>RuleVerification<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>RuleVerification<code/>.
     * 
     * @see RuleVerification
     */
    @Override
    public RuleVerification clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (RuleVerification)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>RuleVerification<code/>.
     *
     * @return A list of potential errors.
     *
     * @see RuleVerification
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.name.trim().isEmpty()) {
            errorList.add("The property name is null or empty.");
        }

        return errorList;
    }
}
