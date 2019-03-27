/* --------------------------------------------------------------------------------------------------------------------
 * DecompositionRule.java
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
 * representation of a validation rule for system-of-interest decomposition through <i>containingElement</i> ElementDefinitions and <i>containedElement</i> ElementUsages
 * Note: A DecompositionRule specifies for ElementDefinitions that are a member of the <i>containingCategory</i> what are the valid Categories (specified by <i>containedCategory</i>) for the <i>type</i> of contained ElementUsages. A <i>subCategory</i> of a valid Category is also valid.
 * Example: A rule where the <i>containingCategory</i> is Category "Equipment" and the <i>containedCategory</i> is Category "Subequipment".
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "rule")
@ToString
@EqualsAndHashCode(callSuper = true)
public class DecompositionRule extends Rule implements Cloneable {
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
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public DecompositionRule(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.containedCategory = new ArrayList<Category>();
    }

    /**
     * List of Category.
     * reference to one or more valid Categories for the <i>elementDefinition</i> of <i>containedElement</i> ElementUsages
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<Category> containedCategory;

    /**
     * Property containingCategory.
     * reference to the Category for <i>containingElement</i> ElementDefinitions to which this rule applies
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Category containingCategory;

    /**
     * Property maxContained.
     * optional definition of the valid maximum number of <i>containedElement</i> ElementUsages
     * Note 1: This can be used to specify a cardinality constraint.
     * Note 2: If not specified it signifies that an unlimited number of <i>containedElement</i> is valid.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @Getter
    @Setter
    private Integer maxContained;

    /**
     * Property minContained.
     * definition of the valid minimum number of <i>containedElement</i> ElementUsages
     * Note: This can be used to specify a cardinality constraint.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private int minContained;

    /**
     * Creates and returns a copy of this {@link DecompositionRule} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DecompositionRule}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        DecompositionRule clone;
        try {
            clone = (DecompositionRule)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow DecompositionRule cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setContainedCategory(new ArrayList<Category>(this.getContainedCategory()));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));

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
     * Creates and returns a copy of this {@link DecompositionRule} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DecompositionRule}.
     */
    @Override
    public DecompositionRule clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DecompositionRule)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this DecompositionRule}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int containedCategoryCount = this.getContainedCategory().size();
        if (containedCategoryCount < 1) {
            errorList.add("The number of elements in the property containedCategory is wrong. It should be at least 1.");
        }

        if (this.getContainingCategory() == null || this.getContainingCategory().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property containingCategory is null.");
            this.setContainingCategory(SentinelThingProvider.getSentinel(Category.class));
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

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        PojoThingFactory.resolveList(this.getContainedCategory(), dto.getContainedCategory(), dto.getIterationContainerId(), this.getCache(), Category.class);
        this.setContainingCategory(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getContainingCategory(), dto.getIterationContainerId(), Category.class), SentinelThingProvider.getSentinel(Category.class)));
        PojoThingFactory.resolveList(this.getDefinition(), dto.getDefinition(), dto.getIterationContainerId(), this.getCache(), Definition.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getHyperLink(), dto.getHyperLink(), dto.getIterationContainerId(), this.getCache(), HyperLink.class);
        this.setDeprecated(dto.isDeprecated());
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

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getContainedCategory().addAll(this.getContainedCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setContainingCategory(this.getContainingCategory() != null ? this.getContainingCategory().getIid() : new UUID(0L, 0L));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDeprecated(this.isDeprecated());
        dto.setMaxContained(this.getMaxContained());
        dto.setMinContained(this.getMinContained());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
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
     * Verify an {@link Iteration} with respect to the {@link DecompositionRule} 
     *
     * @param iteration The {@link Iteration} that is to be verified.
     * @return an {@link List}, this may be empty of no {@link RuleViolation}s have been found.
     */
    public List<RuleViolation> verify(Iteration iteration) {
        if (iteration == null) {
            throw new NullPointerException("The iteration may not be null");
        }

        ContainerList<ElementDefinition> elementDefinitions = iteration.getElement();
        if (elementDefinitions.size() == 0) {
            return new ArrayList<>();
        }

        List<RuleViolation> violations = new ArrayList<>();

        for (ElementDefinition elementDefinition : elementDefinitions) {
            if (CategorizableThingExtensions.isMemberOfCategory(elementDefinition, this.getContainingCategory()) && elementDefinition.getContainedElement().size() != 0) {
                List<ElementUsage> validUsages = new ArrayList<>();

                violations.addAll(this.verifyValidUsages(elementDefinition, validUsages));

                if (validUsages.size() < this.getMinContained()) {
                    RuleViolation violation = new RuleViolation(UUID.randomUUID(), this.getCache(), this.getIDalUri());
                    violation.getViolatingThing().add(elementDefinition.getIid());
                    violation.setDescription(String.format("The Element Definition %s does not contain the minimum of %s Element Usages specified", elementDefinition.getIid(), this.getMinContained()));

                    violations.add(violation);
                }

                if (this.getMaxContained() != null && validUsages.size() > this.getMaxContained())
                {
                    RuleViolation violation = new RuleViolation(UUID.randomUUID(), this.getCache(), this.getIDalUri());
                    violation.getViolatingThing().add(elementDefinition.getIid());
                    violation.setDescription(String.format("The Element Definition %s contains more Element Usages than the maximum of %s specified", elementDefinition.getIid(), this.getMaxContained()));

                    violations.add(violation);
                }
            }
        }

        return violations;
    }

    /**
     * Verifies that the contained {@link ElementUsage}s of the  {@code elementDefinition} are a member of the allowed categories
     *
     * @param elementDefinition The {@link ElementDefinition} that is to be verified.
     * @param validElementUsages The valid {@link ElementUsage} that are contained by the {@code elementDefinition}.
     * @return An {@link List} that may contains {@link RuleViolation} if any of the contained {@link ElementUsage}s
     * is not of the correct type.
     */
    private List<RuleViolation> verifyValidUsages(ElementDefinition elementDefinition, List<ElementUsage> validElementUsages) {
        List<RuleViolation> violations = new ArrayList<>();

        for (ElementUsage elementUsage : elementDefinition.getContainedElement()) {
            boolean isValidUsage = false;

            for (Category category : this.getContainedCategory()) {
                boolean isElementUsageAMember = CategorizableThingExtensions.isMemberOfCategory(elementUsage, category);
                if (isElementUsageAMember) {
                    isValidUsage = true;
                    continue;
                }

                boolean isElementDefinitionAMember = CategorizableThingExtensions.isMemberOfCategory(elementUsage.getElementDefinition(), category);
                if (isElementDefinitionAMember) {
                    isValidUsage = true;
                    continue;
                }
            }

            if (!isValidUsage) {
                RuleViolation violation = new RuleViolation(UUID.randomUUID(), this.getCache(), this.getIDalUri());
                violation.getViolatingThing().add(elementDefinition.getIid());
                violation.getViolatingThing().add(elementUsage.getIid());
                violation.setDescription(String.format("The Element Definition %s contains an Element Usage %s of an incorrect type", elementDefinition.getIid(), elementUsage.getIid()));

                violations.add(violation);
            } else {
                validElementUsages.add(elementUsage);
            }
        }

        return violations;
    }
}
