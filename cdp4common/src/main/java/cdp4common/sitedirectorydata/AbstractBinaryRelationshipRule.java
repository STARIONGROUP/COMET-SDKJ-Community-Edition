/* --------------------------------------------------------------------------------------------------------------------
 * AbstractBinaryRelationshipRule.java
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
 * representation of a validation rule for BinaryRelationships
 * Note: A BinaryRelationshipRule specifies for BinaryRelationships that are a member of the <i>relationshipCategory</i> what are the valid Categories for the related <i>source</i> and <i>target</i> Things
 * Example: A rule where the <i>relationshipCategory</i> is Category "RequirementSatisfactionTraces", the sourceCategory is "ArchitecturalElements" (with <i>permissibleClass</i> ElementDefinition, ElementUsage) and the <i>targetCategory</i> is Category "Requirements" (with <i>permissibleClass</i> Requirement).
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "rule")
public abstract class AbstractBinaryRelationshipRule extends AbstractRule  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>BinaryRelationshipRule<code/> class.
     *
     * @see BinaryRelationshipRule
     */
    public AbstractBinaryRelationshipRule() {
    }

    /**
     * Initializes a new instance of the <code>BinaryRelationshipRule<code/> class.
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
     * @see BinaryRelationshipRule
     */
    public AbstractBinaryRelationshipRule(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property forwardRelationshipName.
     * name of the relationship when read from the <i>source</i> to the <i>target</i> of a BinaryRelationship
     * Example: For a "RequirementsSatisfactionTraces" Category between "ArchitecturalElements" (source) and "Requirements" (target) the <i>forwardRelationshipName</i> would be "satisfies" and the <i>inverseRelationshipName</i> would be "is satisfied by".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String forwardRelationshipName;

    /**
     * Property inverseRelationshipName.
     * name of the inverse relationship, i.e. the name of the relationship when read from <i>target</i> to <i>source</i> of a BinaryRelationship
     * Example: If the <i>forwardRelationshipName</i> is "satisfies", then the <i>inverseRelationshipName</i> would be  "is satisfied by".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String inverseRelationshipName;

    /**
     * Property relationshipCategory.
     * reference to the Category whose member BinaryRelationships shall comply with this BinaryRelationshipRule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Category relationshipCategory;

    /**
     * Property sourceCategory.
     * reference to the Category to which the <i>source</i> of the BinaryRelationship must belong
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Category sourceCategory;

    /**
     * Property targetCategory.
     * reference to the Category to which the <i>target</i> of the BinaryRelationship must belong
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Category targetCategory;

    /**
     * Gets the forwardRelationshipName.
     * name of the relationship when read from the <i>source</i> to the <i>target</i> of a BinaryRelationship
     * Example: For a "RequirementsSatisfactionTraces" Category between "ArchitecturalElements" (source) and "Requirements" (target) the <i>forwardRelationshipName</i> would be "satisfies" and the <i>inverseRelationshipName</i> would be "is satisfied by".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getForwardRelationshipName(){
         return this.forwardRelationshipName;
    }

    /**
     * Gets the inverseRelationshipName.
     * name of the inverse relationship, i.e. the name of the relationship when read from <i>target</i> to <i>source</i> of a BinaryRelationship
     * Example: If the <i>forwardRelationshipName</i> is "satisfies", then the <i>inverseRelationshipName</i> would be  "is satisfied by".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getInverseRelationshipName(){
         return this.inverseRelationshipName;
    }

    /**
     * Gets the relationshipCategory.
     * reference to the Category whose member BinaryRelationships shall comply with this BinaryRelationshipRule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Category getRelationshipCategory(){
         return this.relationshipCategory;
    }

    /**
     * Gets the sourceCategory.
     * reference to the Category to which the <i>source</i> of the BinaryRelationship must belong
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Category getSourceCategory(){
         return this.sourceCategory;
    }

    /**
     * Gets the targetCategory.
     * reference to the Category to which the <i>target</i> of the BinaryRelationship must belong
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Category getTargetCategory(){
         return this.targetCategory;
    }

    /**
     * Sets the forwardRelationshipName.
     * name of the relationship when read from the <i>source</i> to the <i>target</i> of a BinaryRelationship
     * Example: For a "RequirementsSatisfactionTraces" Category between "ArchitecturalElements" (source) and "Requirements" (target) the <i>forwardRelationshipName</i> would be "satisfies" and the <i>inverseRelationshipName</i> would be "is satisfied by".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setForwardRelationshipName(String forwardRelationshipName){
        this.forwardRelationshipName = forwardRelationshipName;
    }

    /**
     * Sets the inverseRelationshipName.
     * name of the inverse relationship, i.e. the name of the relationship when read from <i>target</i> to <i>source</i> of a BinaryRelationship
     * Example: If the <i>forwardRelationshipName</i> is "satisfies", then the <i>inverseRelationshipName</i> would be  "is satisfied by".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setInverseRelationshipName(String inverseRelationshipName){
        this.inverseRelationshipName = inverseRelationshipName;
    }

    /**
     * Sets the relationshipCategory.
     * reference to the Category whose member BinaryRelationships shall comply with this BinaryRelationshipRule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setRelationshipCategory(Category relationshipCategory){
        this.relationshipCategory = relationshipCategory;
    }

    /**
     * Sets the sourceCategory.
     * reference to the Category to which the <i>source</i> of the BinaryRelationship must belong
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setSourceCategory(Category sourceCategory){
        this.sourceCategory = sourceCategory;
    }

    /**
     * Sets the targetCategory.
     * reference to the Category to which the <i>target</i> of the BinaryRelationship must belong
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setTargetCategory(Category targetCategory){
        this.targetCategory = targetCategory;
    }

    /**
     * Creates and returns a copy of this <code>BinaryRelationshipRule<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>BinaryRelationshipRule<code/>.
     *
     * @see BinaryRelationshipRule
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        BinaryRelationshipRule clone = (BinaryRelationshipRule)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
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
     * Creates and returns a copy of this <code>BinaryRelationshipRule<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>BinaryRelationshipRule<code/>.
     * 
     * @see BinaryRelationshipRule
     */
    @Override
    public BinaryRelationshipRule clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (BinaryRelationshipRule)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>BinaryRelationshipRule<code/>.
     *
     * @return A list of potential errors.
     *
     * @see BinaryRelationshipRule
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.forwardRelationshipName.trim().isEmpty()) {
            errorList.add("The property forwardRelationshipName is null or empty.");
        }

        if (this.inverseRelationshipName.trim().isEmpty()) {
            errorList.add("The property inverseRelationshipName is null or empty.");
        }

        if (this.relationshipCategory == null || this.relationshipCategory.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property relationshipCategory is null.");
            this.relationshipCategory = SentinelThingProvider.getSentinel<Category>();
            this.sentinelResetMap["relationshipCategory"] = () -> this.relationshipCategory = null;
        }

        if (this.sourceCategory == null || this.sourceCategory.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property sourceCategory is null.");
            this.sourceCategory = SentinelThingProvider.getSentinel<Category>();
            this.sentinelResetMap["sourceCategory"] = () -> this.sourceCategory = null;
        }

        if (this.targetCategory == null || this.targetCategory.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property targetCategory is null.");
            this.targetCategory = SentinelThingProvider.getSentinel<Category>();
            this.sentinelResetMap["targetCategory"] = () -> this.targetCategory = null;
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>BinaryRelationshipRule<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see BinaryRelationshipRule
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.BinaryRelationshipRule dto = (cdp4common.dto.BinaryRelationshipRule)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.forwardRelationshipName = dto.getForwardRelationshipName();
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.inverseRelationshipName = dto.getInverseRelationshipName();
        this.isDeprecated = dto.getIsDeprecated();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.relationshipCategory = this.cache.get<Category>(dto.getRelationshipCategory(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Category>();
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();
        this.sourceCategory = this.cache.get<Category>(dto.getSourceCategory(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Category>();
        this.targetCategory = this.cache.get<Category>(dto.getTargetCategory(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Category>();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>BinaryRelationshipRule<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see BinaryRelationshipRule
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.BinaryRelationshipRule dto = new cdp4common.dto.BinaryRelationshipRule(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setForwardRelationshipName(this.forwardRelationshipName);
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setInverseRelationshipName(this.inverseRelationshipName);
        dto.setIsDeprecated(this.isDeprecated);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.setRelationshipCategory(this.relationshipCategory != null ? this.relationshipCategory.getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);
        dto.setSourceCategory(this.sourceCategory != null ? this.sourceCategory.getIid() : new UUID(0L, 0L));
        dto.setTargetCategory(this.targetCategory != null ? this.targetCategory.getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
