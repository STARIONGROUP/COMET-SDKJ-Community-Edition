/* --------------------------------------------------------------------------------------------------------------------
 * AbstractReferencerRule.java
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
 * representation of a validation rule for ElementDefinitions and the <i>referencedElement</i> NestedElements
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "rule")
@ToString
@EqualsAndHashCode
public  class ReferencerRule extends Rule implements Cloneable {
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
     * Initializes a new instance of the {@link ReferencerRule} class.
     */
    public ReferencerRule() {
        this.referencedCategory = new ArrayList<Category>();
    }

    /**
     * Initializes a new instance of the {@link ReferencerRule} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ReferencerRule(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.referencedCategory = new ArrayList<Category>();
    }

    /**
     * Property maxReferenced.
     * definition of the valid maximum number of <i>referencedElement</i> in an ElementDefinition that is a member of <i>referencingCategory</i>
     * Note 1: This can be used to specify a cardinality constraint.
     * Note 2: A value of -1 signifies that an unlimited number of <i>referencedElement</i> is valid.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private int maxReferenced;

    /**
     * Property minReferenced.
     * definition of the valid minimum number of <i>referencedElement</i> in a ElementDefinition that is a member of <i>referencerCategory</i>
     * Note: This can be used to specify a cardinality constraint.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private int minReferenced;

    /**
     * List of Category.
     * collection of references to the Categories that <i>referencedElement</i> NestedElements must belong to under this rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<Category> referencedCategory;

    /**
     * Property referencingCategory.
     * reference to the Category for the <i>referencingElement</i> ElementDefinition instances to which this rule applies
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Category referencingCategory;

    /**
     * Gets the maxReferenced.
     * definition of the valid maximum number of <i>referencedElement</i> in an ElementDefinition that is a member of <i>referencingCategory</i>
     * Note 1: This can be used to specify a cardinality constraint.
     * Note 2: A value of -1 signifies that an unlimited number of <i>referencedElement</i> is valid.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public int getMaxReferenced(){
         return this.maxReferenced;
    }

    /**
     * Gets the minReferenced.
     * definition of the valid minimum number of <i>referencedElement</i> in a ElementDefinition that is a member of <i>referencerCategory</i>
     * Note: This can be used to specify a cardinality constraint.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public int getMinReferenced(){
         return this.minReferenced;
    }

    /**
     * Gets a list of Category.
     * collection of references to the Categories that <i>referencedElement</i> NestedElements must belong to under this rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<Category> getReferencedCategory(){
         return this.referencedCategory;
    }

    /**
     * Gets the referencingCategory.
     * reference to the Category for the <i>referencingElement</i> ElementDefinition instances to which this rule applies
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Category getReferencingCategory(){
         return this.referencingCategory;
    }

    /**
     * Sets the maxReferenced.
     * definition of the valid maximum number of <i>referencedElement</i> in an ElementDefinition that is a member of <i>referencingCategory</i>
     * Note 1: This can be used to specify a cardinality constraint.
     * Note 2: A value of -1 signifies that an unlimited number of <i>referencedElement</i> is valid.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setMaxReferenced(int maxReferenced){
        this.maxReferenced = maxReferenced;
    }

    /**
     * Sets the minReferenced.
     * definition of the valid minimum number of <i>referencedElement</i> in a ElementDefinition that is a member of <i>referencerCategory</i>
     * Note: This can be used to specify a cardinality constraint.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setMinReferenced(int minReferenced){
        this.minReferenced = minReferenced;
    }

    /**
     * Sets a list of Category.
     * collection of references to the Categories that <i>referencedElement</i> NestedElements must belong to under this rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setReferencedCategory(ArrayList<Category> referencedCategory){
        this.referencedCategory = referencedCategory;
    }

    /**
     * Sets the referencingCategory.
     * reference to the Category for the <i>referencingElement</i> ElementDefinition instances to which this rule applies
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setReferencingCategory(Category referencingCategory){
        this.referencingCategory = referencingCategory;
    }

    /**
     * Creates and returns a copy of this {@link ReferencerRule} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ReferencerRule}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ReferencerRule clone;
        try {
            clone = (ReferencerRule)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ReferencerRule cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));
        clone.setReferencedCategory(new ArrayList<Category>(this.getReferencedCategory()));

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
     * Creates and returns a copy of this {@link ReferencerRule} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ReferencerRule}.
     */
    @Override
    public ReferencerRule clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ReferencerRule)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ReferencerRule}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int referencedCategoryCount = this.getReferencedCategory().size();
        if (referencedCategoryCount < 1) {
            errorList.add("The number of elements in the property referencedCategory is wrong. It should be at least 1.");
        }

        if (this.getReferencingCategory() == null || this.getReferencingCategory().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property referencingCategory is null.");
            this.setReferencingCategory(SentinelThingProvider.getSentinel<Category>());
            this.sentinelResetMap.put("referencingCategory", new ActionImpl(() -> this.setReferencingCategory(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ReferencerRule} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ReferencerRule dto = (cdp4common.dto.ReferencerRule)dtoThing;

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setDeprecated(dto.getDeprecated());
        this.setMaxReferenced(dto.getMaxReferenced());
        this.setMinReferenced(dto.getMinReferenced());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.getReferencedCategory().resolveList(dto.getReferencedCategory(), dto.getIterationContainerId(), this.getCache());
        this.setReferencingCategory(this.getCache().get<Category>(dto.getReferencingCategory(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Category>());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ReferencerRule}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ReferencerRule dto = new cdp4common.dto.ReferencerRule(this.getIid(), this.getRevisionNumber());

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setDeprecated(this.getDeprecated());
        dto.setMaxReferenced(this.getMaxReferenced());
        dto.setMinReferenced(this.getMinReferenced());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getReferencedCategory().add(this.getReferencedCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setReferencingCategory(this.getReferencingCategory() != null ? this.getReferencingCategory().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
