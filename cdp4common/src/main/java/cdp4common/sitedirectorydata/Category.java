/* --------------------------------------------------------------------------------------------------------------------
 * AbstractCategory.java
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
 * representation of a user-defined category for categorization of instances that have common characteristics
 * Note 1: The Category concept provides a user-defined, runtime classification mechanism in addition to the UML classification (classifier, class, generalization, specialization) applied in the data model itself.
 * Note 2: The Category concept provides additional flexibility to assist in the definition and usage of views and filters on the instances in a population of the data model.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "definedCategory")
@ToString
@EqualsAndHashCode
public  class Category extends DefinedThing implements DeprecatableThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the <code>Category<code/> class.
     *
     * @see Category
     */
    public Category() {
        this.permissibleClass = new ArrayList<ClassKind>();
        this.superCategory = new ArrayList<Category>();
    }

    /**
     * Initializes a new instance of the <code>Category<code/> class.
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
     * @see Category
     */
    public Category(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.permissibleClass = new ArrayList<ClassKind>();
        this.superCategory = new ArrayList<Category>();
    }

    /**
     * Value indicating whether isAbstract.
     * assertion that this Category is abstract, i.e. it may not have direct
     * members, but only not abstract sub categories of this Category may have
     * members
     * Note: The isAbstract property has similar semantics as the isAbstract property
     * of classifiers in the UML meta-model.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isAbstract;

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isDeprecated;

    /**
     * List of ClassKind.
     * one or more names of classes of which instances are permitted to be a
     * member of this Category
     * Note 1: This specifies a validation rule for a population of the data
     * model.
     * Note 2: By definition any class name specified in <i>permissibleClass</i>
     * shall be the name of a subclass of CategorizableThing.
     * Note 3: In order to execute the validation rule it is required that an
     * implementation can verify at runtime that an instance is of a given
     * class as specified by a character string name.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<ClassKind> permissibleClass;

    /**
     * List of Category.
     * reference to zero or more super categories of this Category
     * Note 1: In other words by adding a Category to <i>superCategory</i> this referring Category is defined as a <i>subCategory</i>. This implies that all CategorizableThings that are a member of the <i>subCategory</i> constitute a subset of all CategorizableThings that are a member of the superCategory.
     * Note 2: The super/sub-category hierarchy shall form an acyclic graph, i.e. no circular references are permitted.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<Category> superCategory;

    /**
     * Gets a value indicating whether isAbstract.
     * assertion that this Category is abstract, i.e. it may not have direct
     * members, but only not abstract sub categories of this Category may have
     * members
     * Note: The isAbstract property has similar semantics as the isAbstract property
     * of classifiers in the UML meta-model.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getAbstract(){
         return this.isAbstract;
    }

    /**
     * Gets a value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getDeprecated(){
         return this.isDeprecated;
    }

    /**
     * Gets a list of ClassKind.
     * one or more names of classes of which instances are permitted to be a
     * member of this Category
     * Note 1: This specifies a validation rule for a population of the data
     * model.
     * Note 2: By definition any class name specified in <i>permissibleClass</i>
     * shall be the name of a subclass of CategorizableThing.
     * Note 3: In order to execute the validation rule it is required that an
     * implementation can verify at runtime that an instance is of a given
     * class as specified by a character string name.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<ClassKind> getPermissibleClass(){
         return this.permissibleClass;
    }

    /**
     * Gets a list of Category.
     * reference to zero or more super categories of this Category
     * Note 1: In other words by adding a Category to <i>superCategory</i> this referring Category is defined as a <i>subCategory</i>. This implies that all CategorizableThings that are a member of the <i>subCategory</i> constitute a subset of all CategorizableThings that are a member of the superCategory.
     * Note 2: The super/sub-category hierarchy shall form an acyclic graph, i.e. no circular references are permitted.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<Category> getSuperCategory(){
         return this.superCategory;
    }

    /**
     *Sets a value indicating whether isAbstract.
     * assertion that this Category is abstract, i.e. it may not have direct
     * members, but only not abstract sub categories of this Category may have
     * members
     * Note: The isAbstract property has similar semantics as the isAbstract property
     * of classifiers in the UML meta-model.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setAbstract(boolean isAbstract){
        this.isAbstract = isAbstract;
    }

    /**
     *Sets a value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDeprecated(boolean isDeprecated){
        this.isDeprecated = isDeprecated;
    }

    /**
     * Sets a list of ClassKind.
     * one or more names of classes of which instances are permitted to be a
     * member of this Category
     * Note 1: This specifies a validation rule for a population of the data
     * model.
     * Note 2: By definition any class name specified in <i>permissibleClass</i>
     * shall be the name of a subclass of CategorizableThing.
     * Note 3: In order to execute the validation rule it is required that an
     * implementation can verify at runtime that an instance is of a given
     * class as specified by a character string name.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setPermissibleClass(ArrayList<ClassKind> permissibleClass){
        this.permissibleClass = permissibleClass;
    }

    /**
     * Sets a list of Category.
     * reference to zero or more super categories of this Category
     * Note 1: In other words by adding a Category to <i>superCategory</i> this referring Category is defined as a <i>subCategory</i>. This implies that all CategorizableThings that are a member of the <i>subCategory</i> constitute a subset of all CategorizableThings that are a member of the superCategory.
     * Note 2: The super/sub-category hierarchy shall form an acyclic graph, i.e. no circular references are permitted.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setSuperCategory(ArrayList<Category> superCategory){
        this.superCategory = superCategory;
    }

    /**
     * Creates and returns a copy of this <code>Category<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Category<code/>.
     *
     * @see Category
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        Category clone = (Category)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));
        clone.setPermissibleClass(new List<ClassKind>(this.getPermissibleClass()));
        clone.setSuperCategory(new List<Category>(this.getSuperCategory()));

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
     * Creates and returns a copy of this <code>Category<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Category<code/>.
     * 
     * @see Category
     */
    @Override
    public Category clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Category)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>Category<code/>.
     *
     * @return A list of potential errors.
     *
     * @see Category
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int permissibleClassCount = this.getPermissibleClass().size();
        if (permissibleClassCount < 1) {
            errorList.add("The number of elements in the property permissibleClass is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>Category<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see Category
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Category dto = (cdp4common.dto.Category)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setIsAbstract(dto.getIsAbstract());
        this.setIsDeprecated(dto.getIsDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.permissibleClass.clearAndAddRange(dto.getPermissibleClass());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.superCategory.resolveList(dto.getSuperCategory(), dto.getIterationContainerId(), this.getCache());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>Category<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see Category
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Category dto = new cdp4common.dto.Category(this.getIid(), this.getRevisionNumber());

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setIsAbstract(this.getIsAbstract());
        dto.setIsDeprecated(this.getIsDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getPermissibleClass().add(this.getPermissibleClass());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.getSuperCategory().add(this.getSuperCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
