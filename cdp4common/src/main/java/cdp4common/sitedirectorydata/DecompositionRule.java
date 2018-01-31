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
import org.ehcache.Cache;
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
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the {@link DecompositionRule} class.
     */
    public DecompositionRule() {
        this.containedCategory = new ArrayList<Category>();
    }

    /**
     * Initializes a new instance of the {@link DecompositionRule} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public DecompositionRule(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
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
     * Creates and returns a copy of this {@link DecompositionRule} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DecompositionRule}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        DecompositionRule clone = (DecompositionRule)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setContainedCategory(new ArrayList<Category>(this.getContainedCategory()));
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
     * Creates and returns a copy of this {@link DecompositionRule} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DecompositionRule}.
     */
    @Override
    public DecompositionRule clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DecompositionRule)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>DecompositionRule}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int containedCategoryCount = this.getContainedCategory().size();
        if (containedCategoryCount < 1) {
            errorList.add("The number of elements in the property containedCategory is wrong. It should be at least 1.");
        }

        if (this.getContainingCategory() == null || this.getContainingCategory().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property containingCategory is null.");
            this.setContainingCategory(SentinelThingProvider.getSentinel<Category>());
            this.sentinelResetMap.put("containingCategory", new ActionImpl(() -> this.setContainingCategory(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link DecompositionRule} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.DecompositionRule dto = (cdp4common.dto.DecompositionRule)dtoThing;

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.getContainedCategory().resolveList(dto.getContainedCategory(), dto.getIterationContainerId(), this.getCache());
        this.setContainingCategory(this.getCache().get<Category>(dto.getContainingCategory(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Category>());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setDeprecated(dto.getDeprecated());
        this.setMaxContained(dto.getMaxContained());
        this.setMinContained(dto.getMinContained());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link DecompositionRule}
     *
     * @return Generated {@link cdp4common.dto.Thing}
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
        dto.setDeprecated(this.getDeprecated());
        dto.setMaxContained(this.getMaxContained());
        dto.setMinContained(this.getMinContained());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
