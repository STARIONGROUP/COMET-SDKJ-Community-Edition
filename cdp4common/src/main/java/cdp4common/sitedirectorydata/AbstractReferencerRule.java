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

/**
 * representation of a validation rule for ElementDefinitions and the <i>referencedElement</i> NestedElements
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "rule")
public abstract class AbstractReferencerRule extends AbstractRule  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>ReferencerRule<code/> class.
     *
     * @see ReferencerRule
     */
    public AbstractReferencerRule() {
        this.referencedCategory = new List<Category>();
    }

    /**
     * Initializes a new instance of the <code>ReferencerRule<code/> class.
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
     * @see ReferencerRule
     */
    public AbstractReferencerRule(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.referencedCategory = new List<Category>();
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
    private List<Category> referencedCategory;

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
    public List<Category> getReferencedCategory(){
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
     public void setReferencedCategory(List<Category> referencedCategory){
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
     * Creates and returns a copy of this <code>ReferencerRule<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ReferencerRule<code/>.
     *
     * @see ReferencerRule
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ReferencerRule clone = (ReferencerRule)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));
        clone.setReferencedCategory(new List<Category>(this.referencedCategory));

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
     * Creates and returns a copy of this <code>ReferencerRule<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ReferencerRule<code/>.
     * 
     * @see ReferencerRule
     */
    @Override
    public ReferencerRule clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ReferencerRule)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ReferencerRule<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ReferencerRule
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int referencedCategoryCount = this.referencedCategory.size();
        if (referencedCategoryCount < 1) {
            errorList.add("The number of elements in the property referencedCategory is wrong. It should be at least 1.");
        }

        if (this.referencingCategory == null || this.referencingCategory.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property referencingCategory is null.");
            this.referencingCategory = SentinelThingProvider.getSentinel<Category>();
            this.sentinelResetMap["referencingCategory"] = () -> this.referencingCategory = null;
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ReferencerRule<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ReferencerRule
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ReferencerRule dto = (cdp4common.dto.ReferencerRule)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.isDeprecated = dto.getIsDeprecated();
        this.maxReferenced = dto.getMaxReferenced();
        this.minReferenced = dto.getMinReferenced();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.referencedCategory.resolveList(dto.getReferencedCategory(), dto.getIterationContainerId(), this.cache);
        this.referencingCategory = this.cache.get<Category>(dto.getReferencingCategory(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Category>();
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ReferencerRule<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ReferencerRule
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ReferencerRule dto = new cdp4common.dto.ReferencerRule(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsDeprecated(this.isDeprecated);
        dto.setMaxReferenced(this.maxReferenced);
        dto.setMinReferenced(this.minReferenced);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.getReferencedCategory().add(this.referencedCategory.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setReferencingCategory(this.referencingCategory != null ? this.referencingCategory.getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
