/* --------------------------------------------------------------------------------------------------------------------
 * AbstractDecompositionRule.java
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
 * representation of a validation rule for system-of-interest decomposition through <i>containingElement</i> ElementDefinitions and <i>containedElement</i> ElementUsages
 * Note: A DecompositionRule specifies for ElementDefinitions that are a member of the <i>containingCategory</i> what are the valid Categories (specified by <i>containedCategory</i>) for the <i>type</i> of contained ElementUsages. A <i>subCategory</i> of a valid Category is also valid.
 * Example: A rule where the <i>containingCategory</i> is Category "Equipment" and the <i>containedCategory</i> is Category "Subequipment".
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "rule")
@ToString
@EqualsAndHashCode
public  class DecompositionRule extends Rule  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the <code>DecompositionRule<code/> class.
     *
     * @see DecompositionRule
     */
    public DecompositionRule() {
        this.containedCategory = new ArrayList<Category>();
    }

    /**
     * Initializes a new instance of the <code>DecompositionRule<code/> class.
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
     * @see DecompositionRule
     */
    public DecompositionRule(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.containedCategory = new ArrayList<Category>();
    }

    /**
     * List of Category.
     * reference to one or more valid Categories for the <i>elementDefinition</i> of <i>containedElement</i> ElementUsages
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<Category> containedCategory;

    /**
     * Property containingCategory.
     * reference to the Category for <i>containingElement</i> ElementDefinitions to which this rule applies
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Category containingCategory;

    /**
     * Property maxContained.
     * optional definition of the valid maximum number of <i>containedElement</i> ElementUsages
     * Note 1: This can be used to specify a cardinality constraint.
     * Note 2: If not specified it signifies that an unlimited number of <i>containedElement</i> is valid.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private Integer maxContained;

    /**
     * Property minContained.
     * definition of the valid minimum number of <i>containedElement</i> ElementUsages
     * Note: This can be used to specify a cardinality constraint.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private int minContained;

    /**
     * Gets a list of Category.
     * reference to one or more valid Categories for the <i>elementDefinition</i> of <i>containedElement</i> ElementUsages
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<Category> getContainedCategory(){
         return this.containedCategory;
    }

    /**
     * Gets the containingCategory.
     * reference to the Category for <i>containingElement</i> ElementDefinitions to which this rule applies
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Category getContainingCategory(){
         return this.containingCategory;
    }

    /**
     * Gets the maxContained.
     * optional definition of the valid maximum number of <i>containedElement</i> ElementUsages
     * Note 1: This can be used to specify a cardinality constraint.
     * Note 2: If not specified it signifies that an unlimited number of <i>containedElement</i> is valid.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public Integer getMaxContained(){
         return this.maxContained;
    }

    /**
     * Gets the minContained.
     * definition of the valid minimum number of <i>containedElement</i> ElementUsages
     * Note: This can be used to specify a cardinality constraint.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public int getMinContained(){
         return this.minContained;
    }

    /**
     * Sets a list of Category.
     * reference to one or more valid Categories for the <i>elementDefinition</i> of <i>containedElement</i> ElementUsages
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setContainedCategory(ArrayList<Category> containedCategory){
        this.containedCategory = containedCategory;
    }

    /**
     * Sets the containingCategory.
     * reference to the Category for <i>containingElement</i> ElementDefinitions to which this rule applies
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setContainingCategory(Category containingCategory){
        this.containingCategory = containingCategory;
    }

    /**
     * Sets the maxContained.
     * optional definition of the valid maximum number of <i>containedElement</i> ElementUsages
     * Note 1: This can be used to specify a cardinality constraint.
     * Note 2: If not specified it signifies that an unlimited number of <i>containedElement</i> is valid.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setMaxContained(Integer maxContained){
        this.maxContained = maxContained;
    }

    /**
     * Sets the minContained.
     * definition of the valid minimum number of <i>containedElement</i> ElementUsages
     * Note: This can be used to specify a cardinality constraint.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setMinContained(int minContained){
        this.minContained = minContained;
    }

    /**
     * Creates and returns a copy of this <code>DecompositionRule<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DecompositionRule<code/>.
     *
     * @see DecompositionRule
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        DecompositionRule clone = (DecompositionRule)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setContainedCategory(new List<Category>(this.getContainedCategory()));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));

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
     * Creates and returns a copy of this <code>DecompositionRule<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DecompositionRule<code/>.
     * 
     * @see DecompositionRule
     */
    @Override
    public DecompositionRule clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DecompositionRule)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>DecompositionRule<code/>.
     *
     * @return A list of potential errors.
     *
     * @see DecompositionRule
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int containedCategoryCount = this.getContainedCategory().size();
        if (containedCategoryCount < 1) {
            errorList.add("The number of elements in the property containedCategory is wrong. It should be at least 1.");
        }

        if (this.getContainingCategory() == null || this.getContainingCategory().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property containingCategory is null.");
            this.setContainingCategory(SentinelThingProvider.getSentinel<Category>());
            this.sentinelResetMap["containingCategory"] = () -> this.setContainingCategory(null);
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>DecompositionRule<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see DecompositionRule
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.DecompositionRule dto = (cdp4common.dto.DecompositionRule)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.containedCategory.resolveList(dto.getContainedCategory(), dto.getIterationContainerId(), this.getCache());
        this.setContainingCategory(this.cache.get<Category>(dto.getContainingCategory(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Category>());
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setIsDeprecated(dto.getIsDeprecated());
        this.setMaxContained(dto.getMaxContained());
        this.setMinContained(dto.getMinContained());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>DecompositionRule<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see DecompositionRule
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.DecompositionRule dto = new cdp4common.dto.DecompositionRule(this.getIid(), this.getRevisionNumber());

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getContainedCategory().add(this.getContainedCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setContainingCategory(this.getContainingCategory() != null ? this.getContainingCategory().getIid() : new UUID(0L, 0L));
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setIsDeprecated(this.getIsDeprecated());
        dto.setMaxContained(this.getMaxContained());
        dto.setMinContained(this.getMinContained());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
