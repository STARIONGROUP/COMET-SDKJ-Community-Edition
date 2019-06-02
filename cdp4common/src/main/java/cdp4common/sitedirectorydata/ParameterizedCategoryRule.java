/* --------------------------------------------------------------------------------------------------------------------
 * ParameterizedCategoryRule.java
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
 * Rule that asserts that one or more parameters of a given ParameterType should be defined for CategorizableThings that are a member of the associated Category
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "rule")
@ToString
public class ParameterizedCategoryRule extends Rule implements Cloneable {
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
     * Initializes a new instance of the {@link ParameterizedCategoryRule} class.
     */
    public ParameterizedCategoryRule() {
        this.parameterType = new ArrayList<ParameterType>();
    }

    /**
     * Initializes a new instance of the {@link ParameterizedCategoryRule} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ParameterizedCategoryRule(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.parameterType = new ArrayList<ParameterType>();
    }

    /**
     * Property category.
     * reference to the Category to which this ParameterizableCategoryRule applies
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Category category;

    /**
     * List of ParameterType.
     * collection of references to ParameterTypes this ParameterizableCategoryRule defines as mandatory
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<ParameterType> parameterType;

    /**
     * Creates and returns a copy of this {@link ParameterizedCategoryRule} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterizedCategoryRule}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ParameterizedCategoryRule clone;
        try {
            clone = (ParameterizedCategoryRule)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ParameterizedCategoryRule cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));
        clone.setParameterType(new ArrayList<ParameterType>(this.getParameterType()));

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
     * Creates and returns a copy of this {@link ParameterizedCategoryRule} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterizedCategoryRule}.
     */
    @Override
    public ParameterizedCategoryRule clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterizedCategoryRule)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ParameterizedCategoryRule}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getCategory() == null || this.getCategory().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property category is null.");
            this.setCategory(SentinelThingProvider.getSentinel(Category.class));
            this.sentinelResetMap.put("category", new ActionImpl(() -> this.setCategory(null)));
        }

        int parameterTypeCount = this.getParameterType().size();
        if (parameterTypeCount < 1) {
            errorList.add("The number of elements in the property parameterType is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ParameterizedCategoryRule} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParameterizedCategoryRule dto = (cdp4common.dto.ParameterizedCategoryRule)dtoThing;

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        this.setCategory(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getCategory(), dto.getIterationContainerId(), Category.class), SentinelThingProvider.getSentinel(Category.class)));
        PojoThingFactory.resolveList(this.getDefinition(), dto.getDefinition(), dto.getIterationContainerId(), this.getCache(), Definition.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getHyperLink(), dto.getHyperLink(), dto.getIterationContainerId(), this.getCache(), HyperLink.class);
        this.setDeprecated(dto.isDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        PojoThingFactory.resolveList(this.getParameterType(), dto.getParameterType(), dto.getIterationContainerId(), this.getCache(), ParameterType.class);
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ParameterizedCategoryRule}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ParameterizedCategoryRule dto = new cdp4common.dto.ParameterizedCategoryRule(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setCategory(this.getCategory() != null ? this.getCategory().getIid() : new UUID(0L, 0L));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDeprecated(this.isDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getParameterType().addAll(this.getParameterType().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Verify an {@link Iteration} with respect to the {@link ParameterizedCategoryRule} 
     *
     * @param iteration The {@link Iteration} that is to be verified.
     * @return an {@link List}, this may be empty of no {@link RuleViolation}s have been found.
     */
    public List<RuleViolation> verify(Iteration iteration) {
        if (iteration == null) {
            throw new NullPointerException("The iteration may not be null");
        }

        if (this.getCategory() == null) {
            throw new IllegalArgumentException("The Category of the Rule is null. The Rule cannot be verified.");
        }

        if (iteration.getElement().size() == 0) {
            return new ArrayList<>();
        }

        if (this.getParameterType().size() == 0) {
            return new ArrayList<>();
        }

        List<RuleViolation> violations = new ArrayList<>();

        this.verifyRelationship(iteration, violations);
        this.verifySpecification(iteration, violations);
        this.verifyElementDefinition(iteration, violations);

        return violations;
    }

    /**
     * Verify the {@link ElementDefinition} against this {@link ParameterizedCategoryRule}
     *
     * @param iteration The {@link Iteration} to check
     * @param violations The collection of {@link RuleViolation} to update
     */
    private void verifyElementDefinition(Iteration iteration, List<RuleViolation> violations) {
        for (ElementDefinition elementDefinition : iteration.getElement()) {
            if (CategorizableThingExtensions.isMemberOfCategory(elementDefinition, this.getCategory())) {
                List<ParameterType> missingParameterTypes = new ArrayList<>();
                for (ParameterType parameterType : this.getParameterType()) {
                    Parameter parameter = Iterables.getOnlyElement(elementDefinition.getParameter().stream().filter(p -> p.getParameterType().equals(parameterType)).collect(Collectors.toList()), null);
                    if (parameter == null) {
                        missingParameterTypes.add(parameterType);
                    }
                }

                if (missingParameterTypes.size() > 0) {
                    String iids = String.join(",", missingParameterTypes.stream().map(x -> x.getIid().toString()).collect(Collectors.toList()));
                    String shortnames = String.join(",", missingParameterTypes.stream().map(DefinedThing::getShortName).collect(Collectors.toList()));

                    RuleViolation violation = new RuleViolation(UUID.randomUUID(), this.getCache(), this.getIDalUri());
                    violation.getRuleViolatedClassKind().add(elementDefinition.getClassKind());
                    violation.getViolatingThing().add(elementDefinition.getIid());
                    violation.setDescription(String.format("The Element Definition %s does not contain parameters that reference the following parameter types %s with shortnames: %s", elementDefinition.getName(), iids, shortnames));

                    violations.add(violation);
                }
            }
        }
    }

    /**
     * Verify the {@link Relationship} against this {@link ParameterizedCategoryRule}
     *
     * @param iteration The {@link Iteration} to check
     * @param violations The collection of {@link RuleViolation} to update
     */
    private void verifyRelationship(Iteration iteration, List<RuleViolation> violations) {
        for (Relationship relationship : iteration.getRelationship()) {
            if (CategorizableThingExtensions.isMemberOfCategory(relationship, this.getCategory())) {
                List<ParameterType> missingParameterTypes = new ArrayList<>();
                for (ParameterType parameterType : this.getParameterType()) {
                    RelationshipParameterValue parameter = Iterables.getOnlyElement(relationship.getParameterValue().stream().filter(p -> p.getParameterType().equals(parameterType)).collect(Collectors.toList()), null);
                    if (parameter == null) {
                        missingParameterTypes.add(parameterType);
                    }
                }

                if (missingParameterTypes.size() > 0) {
                    String iids = String.join(",", missingParameterTypes.stream().map(x -> x.getIid().toString()).collect(Collectors.toList()));
                    String shortnames = String.join(",", missingParameterTypes.stream().map(DefinedThing::getShortName).collect(Collectors.toList()));

                    RuleViolation violation = new RuleViolation(UUID.randomUUID(), this.getCache(), this.getIDalUri());
                    violation.getRuleViolatedClassKind().add(relationship.getClassKind());
                    violation.getViolatingThing().add(relationship.getIid());
                    violation.setDescription(String.format("The Relationship %s does not contain parameters that reference the following parameter types %s with shortnames: %s", relationship.getIid(), iids, shortnames));

                    violations.add(violation);
                }
            }
        }
    }

    /**
     * Verify the {@link Relationship} against this {@link ParameterizedCategoryRule}
     *
     * @param iteration The {@link Iteration} to check
     * @param violations The collection of {@link RuleViolation} to update
     */
    private void verifySpecification(Iteration iteration, List<RuleViolation> violations) {
        for (RequirementsSpecification specification : iteration.getRequirementsSpecification()) {
            if (CategorizableThingExtensions.isMemberOfCategory(specification, this.getCategory())) {
                List<ParameterType> missingParameterTypes = new ArrayList<>();
                for (ParameterType parameterType : this.getParameterType()) {
                    RequirementsContainerParameterValue parameter = Iterables.getOnlyElement(specification.getParameterValue().stream().filter(p -> p.getParameterType().equals(parameterType)).collect(Collectors.toList()), null);
                    if (parameter == null) {
                        missingParameterTypes.add(parameterType);
                    }
                }

                if (missingParameterTypes.size() > 0) {
                    String iids = String.join(",", missingParameterTypes.stream().map(x -> x.getIid().toString()).collect(Collectors.toList()));
                    String shortnames = String.join(",", missingParameterTypes.stream().map(DefinedThing::getShortName).collect(Collectors.toList()));

                    RuleViolation violation = new RuleViolation(UUID.randomUUID(), this.getCache(), this.getIDalUri());
                    violation.getRuleViolatedClassKind().add(specification.getClassKind());
                    violation.getViolatingThing().add(specification.getIid());
                    violation.setDescription(String.format("The RequirementsSpecification %s does not contain parameters that reference the following parameter types %s with shortnames: %s", specification.getName(), iids, shortnames));

                    violations.add(violation);
                }
            }

            this.verifyGroup(specification, violations);
            this.verifyRequirement(specification, violations);
        }
    }

    /**
     * Verify the {@link RequirementsGroup} against this {@link ParameterizedCategoryRule}
     *
     * @param requirementsContainer The {@link RequirementsContainer} container to check
     * @param violations The collection of {@link RuleViolation} to update
     */
    private void verifyGroup(RequirementsContainer requirementsContainer, List<RuleViolation> violations) {
        for (RequirementsGroup group : requirementsContainer.getGroup()) {
            if (CategorizableThingExtensions.isMemberOfCategory(group, this.getCategory())) {
                List<ParameterType> missingParameterTypes = new ArrayList<>();
                for (ParameterType parameterType : this.getParameterType()) {
                    RequirementsContainerParameterValue parameter = Iterables.getOnlyElement(group.getParameterValue().stream().filter(p -> p.getParameterType().equals(parameterType)).collect(Collectors.toList()), null);
                    if (parameter == null) {
                        missingParameterTypes.add(parameterType);
                    }
                }

                if (missingParameterTypes.size() > 0) {
                    String iids = String.join(",", missingParameterTypes.stream().map(x -> x.getIid().toString()).collect(Collectors.toList()));
                    String shortnames = String.join(",", missingParameterTypes.stream().map(DefinedThing::getShortName).collect(Collectors.toList()));

                    RuleViolation violation = new RuleViolation(UUID.randomUUID(), this.getCache(), this.getIDalUri());
                    violation.getRuleViolatedClassKind().add(group.getClassKind());
                    violation.getViolatingThing().add(group.getIid());
                    violation.setDescription(String.format("The RequirementsGroup %s does not contain parameters that reference the following parameter types %s with shortnames: %s", group.getName(), iids, shortnames));

                    violations.add(violation);
                }
            }

            this.verifyGroup(group, violations);
        }
    }

    /**
     * Verify the {@link RequirementsGroup} against this {@link ParameterizedCategoryRule}
     *
     * @param specification The {@link RequirementsSpecification} container to check
     * @param violations The collection of {@link RuleViolation} to update
     */
    private void verifyRequirement(RequirementsSpecification specification, List<RuleViolation> violations) {
        for (Requirement requirement : specification.getRequirement()) {
            if (CategorizableThingExtensions.isMemberOfCategory(requirement, this.getCategory())) {
                List<ParameterType> missingParameterTypes = new ArrayList<>();
                for (ParameterType parameterType : this.getParameterType()) {
                    SimpleParameterValue parameter = Iterables.getOnlyElement(requirement.getParameterValue().stream().filter(p -> p.getParameterType().equals(parameterType)).collect(Collectors.toList()), null);
                    if (parameter == null) {
                        missingParameterTypes.add(parameterType);
                    }
                }

                if (missingParameterTypes.size() > 0)
                {
                    String iids = String.join(",", missingParameterTypes.stream().map(x -> x.getIid().toString()).collect(Collectors.toList()));
                    String shortnames = String.join(",", missingParameterTypes.stream().map(DefinedThing::getShortName).collect(Collectors.toList()));

                    RuleViolation violation = new RuleViolation(UUID.randomUUID(), this.getCache(), this.getIDalUri());
                    violation.getRuleViolatedClassKind().add(requirement.getClassKind());
                    violation.getViolatingThing().add(requirement.getIid());
                    violation.setDescription(String.format("The Requirement %s does not contain parameters that reference the following parameter types %s with shortnames: %s", requirement.getName(), iids, shortnames));

                    violations.add(violation);
                }
            }
        }
    }
}
