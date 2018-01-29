/* --------------------------------------------------------------------------------------------------------------------
 * AbstractMultiRelationshipRule.java
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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of a validation rule for MultiRelationships that relate (potentially) more than two CategorizableThings
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "rule")
@ToString
@EqualsAndHashCode
public  class MultiRelationshipRule extends Rule  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the <code>MultiRelationshipRule<code/> class.
     *
     * @see MultiRelationshipRule
     */
    public MultiRelationshipRule() {
        this.relatedCategory = new ArrayList<Category>();
    }

    /**
     * Initializes a new instance of the <code>MultiRelationshipRule<code/> class.
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
     * @see MultiRelationshipRule
     */
    public MultiRelationshipRule(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.relatedCategory = new ArrayList<Category>();
    }

    /**
     * Property maxRelated.
     * definition of the valid maximum number of <i>relatedThing</i> in a MultiRelationship that is a member of <i>relationshipCategory</i>
     * Note 1: This can be used to define a cardinality constraint.
     * Note 2: A value of -1 signifies that an unlimited number of <i>relatedThing</i> is valid.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private int maxRelated;

    /**
     * Property minRelated.
     * definition of the valid minimum number of <i>relatedThing</i> in a MultiRelationship that is a member of <i>relationshipCategory</i>
     * Note: This can be used to define a cardinality constraint.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private int minRelated;

    /**
     * List of Category.
     * reference to valid Categories for <i>relatedThing</i> of implied MultiRelationships
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<Category> relatedCategory;

    /**
     * Property relationshipCategory.
     * reference to the Category whose member MultiRelationships shall comply with this MultiRelationshipRule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Category relationshipCategory;

    /**
     * Gets the maxRelated.
     * definition of the valid maximum number of <i>relatedThing</i> in a MultiRelationship that is a member of <i>relationshipCategory</i>
     * Note 1: This can be used to define a cardinality constraint.
     * Note 2: A value of -1 signifies that an unlimited number of <i>relatedThing</i> is valid.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public int getMaxRelated(){
         return this.maxRelated;
    }

    /**
     * Gets the minRelated.
     * definition of the valid minimum number of <i>relatedThing</i> in a MultiRelationship that is a member of <i>relationshipCategory</i>
     * Note: This can be used to define a cardinality constraint.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public int getMinRelated(){
         return this.minRelated;
    }

    /**
     * Gets a list of Category.
     * reference to valid Categories for <i>relatedThing</i> of implied MultiRelationships
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<Category> getRelatedCategory(){
         return this.relatedCategory;
    }

    /**
     * Gets the relationshipCategory.
     * reference to the Category whose member MultiRelationships shall comply with this MultiRelationshipRule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Category getRelationshipCategory(){
         return this.relationshipCategory;
    }

    /**
     * Sets the maxRelated.
     * definition of the valid maximum number of <i>relatedThing</i> in a MultiRelationship that is a member of <i>relationshipCategory</i>
     * Note 1: This can be used to define a cardinality constraint.
     * Note 2: A value of -1 signifies that an unlimited number of <i>relatedThing</i> is valid.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setMaxRelated(int maxRelated){
        this.maxRelated = maxRelated;
    }

    /**
     * Sets the minRelated.
     * definition of the valid minimum number of <i>relatedThing</i> in a MultiRelationship that is a member of <i>relationshipCategory</i>
     * Note: This can be used to define a cardinality constraint.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setMinRelated(int minRelated){
        this.minRelated = minRelated;
    }

    /**
     * Sets a list of Category.
     * reference to valid Categories for <i>relatedThing</i> of implied MultiRelationships
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setRelatedCategory(ArrayList<Category> relatedCategory){
        this.relatedCategory = relatedCategory;
    }

    /**
     * Sets the relationshipCategory.
     * reference to the Category whose member MultiRelationships shall comply with this MultiRelationshipRule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setRelationshipCategory(Category relationshipCategory){
        this.relationshipCategory = relationshipCategory;
    }

    /**
     * Creates and returns a copy of this <code>MultiRelationshipRule<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>MultiRelationshipRule<code/>.
     *
     * @see MultiRelationshipRule
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        MultiRelationshipRule clone = (MultiRelationshipRule)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));
        clone.setRelatedCategory(new List<Category>(this.getRelatedCategory()));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>MultiRelationshipRule<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>MultiRelationshipRule<code/>.
     * 
     * @see MultiRelationshipRule
     */
    @Override
    public MultiRelationshipRule clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (MultiRelationshipRule)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>MultiRelationshipRule<code/>.
     *
     * @return A list of potential errors.
     *
     * @see MultiRelationshipRule
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int relatedCategoryCount = this.getRelatedCategory().size();
        if (relatedCategoryCount < 1) {
            errorList.add("The number of elements in the property relatedCategory is wrong. It should be at least 1.");
        }

        if (this.getRelationshipCategory() == null || this.getRelationshipCategory().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property relationshipCategory is null.");
            this.setRelationshipCategory(SentinelThingProvider.getSentinel<Category>());
            this.sentinelResetMap["relationshipCategory"] = () -> this.setRelationshipCategory(null);
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>MultiRelationshipRule<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see MultiRelationshipRule
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.MultiRelationshipRule dto = (cdp4common.dto.MultiRelationshipRule)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setIsDeprecated(dto.getIsDeprecated());
        this.setMaxRelated(dto.getMaxRelated());
        this.setMinRelated(dto.getMinRelated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.relatedCategory.resolveList(dto.getRelatedCategory(), dto.getIterationContainerId(), this.getCache());
        this.setRelationshipCategory(this.cache.get<Category>(dto.getRelationshipCategory(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Category>());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>MultiRelationshipRule<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see MultiRelationshipRule
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.MultiRelationshipRule dto = new cdp4common.dto.MultiRelationshipRule(this.getIid(), this.getRevisionNumber());

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setIsDeprecated(this.getIsDeprecated());
        dto.setMaxRelated(this.getMaxRelated());
        dto.setMinRelated(this.getMinRelated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getRelatedCategory().add(this.getRelatedCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setRelationshipCategory(this.getRelationshipCategory() != null ? this.getRelationshipCategory().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
