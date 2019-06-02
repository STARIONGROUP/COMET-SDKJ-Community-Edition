/* --------------------------------------------------------------------------------------------------------------------
 * Category.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.exceptions.ContainmentException;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import org.apache.commons.lang3.ObjectUtils;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * representation of a user-defined category for categorization of instances that have common characteristics
 * Note 1: The Category concept provides a user-defined, runtime classification mechanism in addition to the UML classification (classifier, class, generalization, specialization) applied in the data model itself.
 * Note 2: The Category concept provides additional flexibility to assist in the definition and usage of views and filters on the instances in a population of the data model.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "definedCategory")
@ToString
public class Category extends DefinedThing implements Cloneable, DeprecatableThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the {@link Category} class.
     */
    public Category() {
        this.permissibleClass = new ArrayList<ClassKind>();
        this.superCategory = new ArrayList<Category>();
    }

    /**
     * Initializes a new instance of the {@link Category} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public Category(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
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
    @Getter
    @Setter
    private boolean isAbstract;

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
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
    @Getter
    @Setter
    private ArrayList<ClassKind> permissibleClass;

    /**
     * List of Category.
     * reference to zero or more super categories of this Category
     * Note 1: In other words by adding a Category to <i>superCategory</i> this referring Category is defined as a <i>subCategory</i>. This implies that all CategorizableThings that are a member of the <i>subCategory</i> constitute a subset of all CategorizableThings that are a member of the superCategory.
     * Note 2: The super/sub-category hierarchy shall form an acyclic graph, i.e. no circular references are permitted.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<Category> superCategory;

    /**
     * Creates and returns a copy of this {@link Category} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Category}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        Category clone;
        try {
            clone = (Category)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow Category cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));
        clone.setPermissibleClass(new ArrayList<ClassKind>(this.getPermissibleClass()));
        clone.setSuperCategory(new ArrayList<Category>(this.getSuperCategory()));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link Category} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Category}.
     */
    @Override
    public Category clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Category)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this Category}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int permissibleClassCount = this.getPermissibleClass().size();
        if (permissibleClassCount < 1) {
            errorList.add("The number of elements in the property permissibleClass is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link Category} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Category dto = (cdp4common.dto.Category)dtoThing;

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        PojoThingFactory.resolveList(this.getDefinition(), dto.getDefinition(), dto.getIterationContainerId(), this.getCache(), Definition.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getHyperLink(), dto.getHyperLink(), dto.getIterationContainerId(), this.getCache(), HyperLink.class);
        this.setAbstract(dto.isAbstract());
        this.setDeprecated(dto.isDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        PojoThingFactory.clearAndAddRange(this.getPermissibleClass(), dto.getPermissibleClass());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        PojoThingFactory.resolveList(this.getSuperCategory(), dto.getSuperCategory(), dto.getIterationContainerId(), this.getCache(), Category.class);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link Category}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Category dto = new cdp4common.dto.Category(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setAbstract(this.isAbstract());
        dto.setDeprecated(this.isDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getPermissibleClass().addAll(this.getPermissibleClass());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.getSuperCategory().addAll(this.getSuperCategory().stream().map(Thing::getIid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
    * Queries the full hierarchy of super categories of the current {@link Category}
    * and returns those as an {@link Collection<Category>}
    *
    * @return an {@link Collection<Category>}
    */
    public Collection<Category> getAllSuperCategories() {
        List<Category> superCategories = new ArrayList<>();

        for (Category category : this.superCategory) {
            Collection<Category> all = category.getAllSuperCategories();

            superCategories.add(category);

            superCategories.addAll(all);
        }

        return superCategories;
    }

    /**
    * Queries the full hierarchy of categories that are derived categories of the current {@link Category}
    * and returns those as an {@link Collection<Category>}
    *
    * @return
    * an {@link Collection<Category>}
    */
    public Collection<Category> getAllDerivedCategories() {
        List<Category> categories = new ArrayList<>();

        for (CacheKey key : getCache().asMap().keySet()){
            if (getCache().getIfPresent(key).getClassKind().equals(ClassKind.CATEGORY)){
                categories.add((Category)(getCache().getIfPresent(key)));
            }
        }

        List<Category> derivedCategories = new ArrayList<>();

        for (Category category : categories) {
            if (category.getSuperCategory().contains(this)) {
                derivedCategories.add(category);
                derivedCategories.addAll(category.getAllDerivedCategories(categories));
            }
        }

        return derivedCategories;
    }

    /**
    * Queries the full hierarchy of categories that are derived categories of the current {@link Category}
    * and returns those as an {@link Collection<Category>}
    *
    * @param categories The {@link List{Category}} that may contain derived {@link Category} instances
    * @return an {@link Collection<Category>} that contains the {@link Category} instances that are derived from the current {@link Category}
    */
    private Collection<Category> getAllDerivedCategories(List<Category> categories)
    {
        List<Category> derivedCategories = new ArrayList<>();

        for (Category category : categories.stream().filter(category -> category.getSuperCategory().contains(this)).collect(Collectors.toList())) {
            derivedCategories.add(category);
            derivedCategories.addAll(category.getAllDerivedCategories(categories));
        }

        return derivedCategories;
    }

    /**
    * Gets an {@link Collection{ReferenceDataLibrary}} that contains
    * the required {@link ReferenceDataLibrary} for the current {@link Thing}
    */
    @Override
    public Collection<ReferenceDataLibrary> getRequiredRdls() {
            return RequiredReferenceDataLibraryAbacus.computeRequiredRdls(this);
    }

     /**
     * Queries all the {@link CategorizableThing}s that have been categorized with the current {@link Category}
     *
     *  * @return
     * an {@link Collection{ICategorizableThing}}
     */
    public Collection<CategorizableThing> getCategorizedThings() {
        List<CategorizableThing> categorizableThings = new ArrayList<>();

        for (CacheKey key : getCache().asMap().keySet()){
            if (getCache().getIfPresent(key) instanceof CategorizableThing){
                categorizableThings.add((CategorizableThing)(getCache().getIfPresent(key)));
            }
        }

        if (categorizableThings.size() == 0) {
            return categorizableThings;
        }

        Collection<Category> categories = getAllSuperCategories();
        categories.add(this);

        List<CategorizableThing> foundCategorizableThings = new ArrayList<>();

        for(CategorizableThing categorizableThing : categorizableThings) {
            for(Category category : categorizableThing.getCategory()) {
                if (categorizableThing.getCategory().contains(category)) {
                    foundCategorizableThings.add(categorizableThing);
                    break;
                }
            }
        }

        return foundCategorizableThings;
    }
}
