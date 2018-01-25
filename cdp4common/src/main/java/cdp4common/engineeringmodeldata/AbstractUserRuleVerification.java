/* --------------------------------------------------------------------------------------------------------------------
 * AbstractUserRuleVerification.java
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
 * representation of the verification of a user-defined Rule in one of the required ReferenceDataLibraries
 */
@Container(clazz = RuleVerificationList.class, propertyName = "ruleVerification")
public abstract class AbstractUserRuleVerification extends AbstractRuleVerification  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>UserRuleVerification<code/> class.
     *
     * @see UserRuleVerification
     */
    public AbstractUserRuleVerification() {
    }

    /**
     * Initializes a new instance of the <code>UserRuleVerification<code/> class.
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
     * @see UserRuleVerification
     */
    public AbstractUserRuleVerification(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property name.
     * name derived from the <i>name</i> of the associated Rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String name;
 
    /**
     * Property rule.
     * reference to the Rule to be verified
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Rule rule;

    /**
     * Gets the name.
     * name derived from the <i>name</i> of the associated Rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public String getName(){
        return this.GetDerivedName();
    }

    /**
     * Gets the rule.
     * reference to the Rule to be verified
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Rule getRule(){
         return this.rule;
    }

    /**
     * Sets the name.
     * name derived from the <i>name</i> of the associated Rule
     *
     * @throws IllegalStateException The name property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Override
    public void setName(String name){
        throw new IllegalStateException("Forbidden Set value for the derived property UserRuleVerification.name");
    }

    /**
     * Sets the rule.
     * reference to the Rule to be verified
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setRule(Rule rule){
        this.rule = rule;
    }

    /**
     * Creates and returns a copy of this <code>UserRuleVerification<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>UserRuleVerification<code/>.
     *
     * @see UserRuleVerification
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        UserRuleVerification clone = (UserRuleVerification)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>UserRuleVerification<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>UserRuleVerification<code/>.
     * 
     * @see UserRuleVerification
     */
    @Override
    public UserRuleVerification clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (UserRuleVerification)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>UserRuleVerification<code/>.
     *
     * @return A list of potential errors.
     *
     * @see UserRuleVerification
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.rule == null || this.rule.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property rule is null.");
            this.rule = SentinelThingProvider.getSentinel<Rule>();
            this.sentinelResetMap["rule"] = () -> this.rule = null;
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>UserRuleVerification<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see UserRuleVerification
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.UserRuleVerification dto = (cdp4common.dto.UserRuleVerification)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.executedOn = dto.getExecutedOn();
        this.isActive = dto.getIsActive();
        this.modifiedOn = dto.getModifiedOn();
        this.revisionNumber = dto.getRevisionNumber();
        this.rule = this.cache.get<Rule>(dto.getRule(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Rule>();
        this.status = dto.getStatus();
        this.violation.resolveList(dto.getViolation(), dto.getIterationContainerId(), this.cache);

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>UserRuleVerification<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see UserRuleVerification
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.UserRuleVerification dto = new cdp4common.dto.UserRuleVerification(this.iid, this.revisionNumber);

        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setExecutedOn(this.executedOn);
        dto.setIsActive(this.isActive);
        dto.setModifiedOn(this.modifiedOn);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setRule(this.rule != null ? this.rule.getIid() : new UUID(0L, 0L));
        dto.setStatus(this.status);
        dto.getViolation().add(this.violation.stream().map(x -> x.Iid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
