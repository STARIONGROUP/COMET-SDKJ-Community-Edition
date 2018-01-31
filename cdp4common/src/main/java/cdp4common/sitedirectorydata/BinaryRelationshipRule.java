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
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of a validation rule for BinaryRelationships
 * Note: A BinaryRelationshipRule specifies for BinaryRelationships that are a member of the <i>relationshipCategory</i> what are the valid Categories for the related <i>source</i> and <i>target</i> Things
 * Example: A rule where the <i>relationshipCategory</i> is Category "RequirementSatisfactionTraces", the sourceCategory is "ArchitecturalElements" (with <i>permissibleClass</i> ElementDefinition, ElementUsage) and the <i>targetCategory</i> is Category "Requirements" (with <i>permissibleClass</i> Requirement).
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "rule")
@ToString
@EqualsAndHashCode
public  class BinaryRelationshipRule extends Rule  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the {@link BinaryRelationshipRule} class.
     */
    public BinaryRelationshipRule() {
    }

    /**
     * Initializes a new instance of the {@link BinaryRelationshipRule} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public BinaryRelationshipRule(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
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
     * Creates and returns a copy of this {@link BinaryRelationshipRule} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link BinaryRelationshipRule}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        BinaryRelationshipRule clone = (BinaryRelationshipRule)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
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
     * Creates and returns a copy of this {@link BinaryRelationshipRule} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link BinaryRelationshipRule}.
     */
    @Override
    public BinaryRelationshipRule clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (BinaryRelationshipRule)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>BinaryRelationshipRule}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getForwardRelationshipName().trim().isEmpty()) {
            errorList.add("The property forwardRelationshipName is null or empty.");
        }

        if (this.getInverseRelationshipName().trim().isEmpty()) {
            errorList.add("The property inverseRelationshipName is null or empty.");
        }

        if (this.getRelationshipCategory() == null || this.getRelationshipCategory().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property relationshipCategory is null.");
            this.setRelationshipCategory(SentinelThingProvider.getSentinel<Category>());
            this.sentinelResetMap.put("relationshipCategory", new ActionImpl(() -> this.setRelationshipCategory(null)));
        }

        if (this.getSourceCategory() == null || this.getSourceCategory().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property sourceCategory is null.");
            this.setSourceCategory(SentinelThingProvider.getSentinel<Category>());
            this.sentinelResetMap.put("sourceCategory", new ActionImpl(() -> this.setSourceCategory(null)));
        }

        if (this.getTargetCategory() == null || this.getTargetCategory().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property targetCategory is null.");
            this.setTargetCategory(SentinelThingProvider.getSentinel<Category>());
            this.sentinelResetMap.put("targetCategory", new ActionImpl(() -> this.setTargetCategory(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link BinaryRelationshipRule} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.BinaryRelationshipRule dto = (cdp4common.dto.BinaryRelationshipRule)dtoThing;

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setForwardRelationshipName(dto.getForwardRelationshipName());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setInverseRelationshipName(dto.getInverseRelationshipName());
        this.setDeprecated(dto.getDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRelationshipCategory(this.getCache().get<Category>(dto.getRelationshipCategory(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Category>());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.setSourceCategory(this.getCache().get<Category>(dto.getSourceCategory(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Category>());
        this.setTargetCategory(this.getCache().get<Category>(dto.getTargetCategory(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Category>());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link BinaryRelationshipRule}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.BinaryRelationshipRule dto = new cdp4common.dto.BinaryRelationshipRule(this.getIid(), this.getRevisionNumber());

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setForwardRelationshipName(this.getForwardRelationshipName());
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setInverseRelationshipName(this.getInverseRelationshipName());
        dto.setDeprecated(this.getDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setRelationshipCategory(this.getRelationshipCategory() != null ? this.getRelationshipCategory().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.setSourceCategory(this.getSourceCategory() != null ? this.getSourceCategory().getIid() : new UUID(0L, 0L));
        dto.setTargetCategory(this.getTargetCategory() != null ? this.getTargetCategory().getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
