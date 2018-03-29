/* --------------------------------------------------------------------------------------------------------------------
 * BinaryRelationshipRule.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
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
import org.apache.commons.lang3.tuple.Pair;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * representation of a validation rule for BinaryRelationships
 * Note: A BinaryRelationshipRule specifies for BinaryRelationships that are a member of the <i>relationshipCategory</i> what are the valid Categories for the related <i>source</i> and <i>target</i> Things
 * Example: A rule where the <i>relationshipCategory</i> is Category "RequirementSatisfactionTraces", the sourceCategory is "ArchitecturalElements" (with <i>permissibleClass</i> ElementDefinition, ElementUsage) and the <i>targetCategory</i> is Category "Requirements" (with <i>permissibleClass</i> Requirement).
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "rule")
@ToString
@EqualsAndHashCode(callSuper = true)
public class BinaryRelationshipRule extends Rule implements Cloneable {
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
        super(iid, cache, iDalUri);
    }

    /**
     * Property forwardRelationshipName.
     * name of the relationship when read from the <i>source</i> to the <i>target</i> of a BinaryRelationship
     * Example: For a "RequirementsSatisfactionTraces" Category between "ArchitecturalElements" (source) and "Requirements" (target) the <i>forwardRelationshipName</i> would be "satisfies" and the <i>inverseRelationshipName</i> would be "is satisfied by".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String forwardRelationshipName;

    /**
     * Property inverseRelationshipName.
     * name of the inverse relationship, i.e. the name of the relationship when read from <i>target</i> to <i>source</i> of a BinaryRelationship
     * Example: If the <i>forwardRelationshipName</i> is "satisfies", then the <i>inverseRelationshipName</i> would be  "is satisfied by".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String inverseRelationshipName;

    /**
     * Property relationshipCategory.
     * reference to the Category whose member BinaryRelationships shall comply with this BinaryRelationshipRule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Category relationshipCategory;

    /**
     * Property sourceCategory.
     * reference to the Category to which the <i>source</i> of the BinaryRelationship must belong
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Category sourceCategory;

    /**
     * Property targetCategory.
     * reference to the Category to which the <i>target</i> of the BinaryRelationship must belong
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Category targetCategory;

    /**
     * Creates and returns a copy of this {@link BinaryRelationshipRule} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link BinaryRelationshipRule}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        BinaryRelationshipRule clone;
        try {
            clone = (BinaryRelationshipRule)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow BinaryRelationshipRule cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
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
     * Creates and returns a copy of this {@link BinaryRelationshipRule} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link BinaryRelationshipRule}.
     */
    @Override
    public BinaryRelationshipRule clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (BinaryRelationshipRule)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this BinaryRelationshipRule}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (Strings.isNullOrEmpty(this.getForwardRelationshipName())) {
            errorList.add("The property forwardRelationshipName is null or empty.");
        }

        if (Strings.isNullOrEmpty(this.getInverseRelationshipName())) {
            errorList.add("The property inverseRelationshipName is null or empty.");
        }

        if (this.getRelationshipCategory() == null || this.getRelationshipCategory().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property relationshipCategory is null.");
            this.setRelationshipCategory(SentinelThingProvider.getSentinel(Category.class));
            this.sentinelResetMap.put("relationshipCategory", new ActionImpl(() -> this.setRelationshipCategory(null)));
        }

        if (this.getSourceCategory() == null || this.getSourceCategory().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property sourceCategory is null.");
            this.setSourceCategory(SentinelThingProvider.getSentinel(Category.class));
            this.sentinelResetMap.put("sourceCategory", new ActionImpl(() -> this.setSourceCategory(null)));
        }

        if (this.getTargetCategory() == null || this.getTargetCategory().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property targetCategory is null.");
            this.setTargetCategory(SentinelThingProvider.getSentinel(Category.class));
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

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        PojoThingFactory.resolveList(this.getDefinition(), dto.getDefinition(), dto.getIterationContainerId(), this.getCache(), Definition.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setForwardRelationshipName(dto.getForwardRelationshipName());
        PojoThingFactory.resolveList(this.getHyperLink(), dto.getHyperLink(), dto.getIterationContainerId(), this.getCache(), HyperLink.class);
        this.setInverseRelationshipName(dto.getInverseRelationshipName());
        this.setDeprecated(dto.isDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRelationshipCategory(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getRelationshipCategory(), dto.getIterationContainerId(), Category.class), SentinelThingProvider.getSentinel(Category.class)));
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.setSourceCategory(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getSourceCategory(), dto.getIterationContainerId(), Category.class), SentinelThingProvider.getSentinel(Category.class)));
        this.setTargetCategory(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getTargetCategory(), dto.getIterationContainerId(), Category.class), SentinelThingProvider.getSentinel(Category.class)));

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

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setForwardRelationshipName(this.getForwardRelationshipName());
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setInverseRelationshipName(this.getInverseRelationshipName());
        dto.setDeprecated(this.isDeprecated());
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

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Verify an {@link Iteration} with respect to the {@link BinaryRelationshipRule} 
     *
     * @param iteration The {@link Iteration} that is to be verified.
     * @return an {@link List}, this may be empty of no {@link RuleViolation}s have been found.
     */
    public List<RuleViolation> verify(Iteration iteration) {
        if (iteration == null) {
            throw new NullPointerException("The iteration may not be null");
        }

        List<BinaryRelationship> binaryRelationShips = iteration.getRelationship().stream().filter(x -> x instanceof BinaryRelationship).map(x -> (BinaryRelationship)x).collect(Collectors.toList());
        if (binaryRelationShips.size() == 0) {
            return new ArrayList<>();
        }

        if (this.getRelationshipCategory() == null) {
            return new ArrayList<>();
        }

        Collection<Category> applicableRelationshipCategories = this.getRelationshipCategory().getAllDerivedCategories();
        applicableRelationshipCategories.add(this.getRelationshipCategory());

        List<RuleViolation> violations = new ArrayList<>();

        for(BinaryRelationship binaryRelationship : binaryRelationShips) {
            Iterable<Category> allCategories = CategorizableThingExtensions.getAllCategories(binaryRelationship);

            boolean relationshipIsCategorizedWithRuleRelationshipCategory = false;
            for (Category category : allCategories) {
                if (applicableRelationshipCategories.contains(category)) {
                    relationshipIsCategorizedWithRuleRelationshipCategory = true;
                }
            }

            if (!relationshipIsCategorizedWithRuleRelationshipCategory) {
                continue;
            }

            RuleViolation sourceViolation = this.verifySource(binaryRelationship);
            if (sourceViolation != null) {
                violations.add(sourceViolation);
            }

            RuleViolation targetViolation = this.verifyTarget(binaryRelationship);
            if (targetViolation != null) {
                violations.add(targetViolation);
            }
        }

        return violations;
    }

    /**
     * Verifies that the source of the {@link BinaryRelationship} violates the {@link BinaryRelationshipRule}
     *
     * @param binaryRelationship The {@link BinaryRelationship} to verify
     * @return An instance of {@link RuleViolation} if the {@link BinaryRelationshipRule} has been violated, null otherwise
     */
    private RuleViolation verifySource(BinaryRelationship binaryRelationship)
    {
        CategorizableThing sourceCategorizableThing = binaryRelationship.getSource() instanceof CategorizableThing ? (CategorizableThing)binaryRelationship.getSource() : null;
        if (sourceCategorizableThing == null) {
            RuleViolation violation = new RuleViolation(UUID.randomUUID(), this.getCache(), this.getIDalUri());
            violation.getViolatingThing().add(binaryRelationship.getIid());
            violation.getViolatingThing().add(binaryRelationship.getSource().getIid());
            violation.setDescription(String.format("The Source [%s:%s] of the BinaryRelationShip is not a CategorizableThing", binaryRelationship.getSource().getClassKind(), binaryRelationship.getSource().getIid()));

            return violation;
        }

        boolean isMemberOfCategory = CategorizableThingExtensions.isMemberOfCategory(sourceCategorizableThing, this.getSourceCategory());
        if (!isMemberOfCategory) {
            RuleViolation violation = new RuleViolation(UUID.randomUUID(), this.getCache(), this.getIDalUri());
            violation.getViolatingThing().add(binaryRelationship.getIid());
            violation.getViolatingThing().add(binaryRelationship.getSource().getIid());
            violation.setDescription(String.format("The Source [%s:%s] of the BinaryRelationShip %s is not a member of Category %s with shortname %s or any of it's super categories", binaryRelationship.getSource().getClassKind(), binaryRelationship.getSource().getIid(), binaryRelationship.getIid(), this.getSourceCategory().getIid(), this.getSourceCategory().getShortName()));

            return violation;
        }

        return null;
    }

    /**
     * Verifies that the target of the {@link BinaryRelationship} violates the {@link BinaryRelationshipRule}
     *
     * @param binaryRelationship The {@link BinaryRelationship} to verify
     * @return An instance of {@link RuleViolation} if the {@link BinaryRelationshipRule} has been violated, null otherwise
     */
    private RuleViolation verifyTarget(BinaryRelationship binaryRelationship) {
        CategorizableThing targetCategorizableThing = binaryRelationship.getTarget() instanceof CategorizableThing ? (CategorizableThing)binaryRelationship.getTarget() : null;
        if (targetCategorizableThing == null) {
            RuleViolation violation = new RuleViolation(UUID.randomUUID(), this.getCache(), this.getIDalUri());
            violation.getViolatingThing().add(binaryRelationship.getIid());
            violation.getViolatingThing().add(binaryRelationship.getTarget().getIid());
            violation.setDescription(String.format("The Target [%s:%s] of the BinaryRelationShip is not a CategorizableThing", binaryRelationship.getTarget().getClassKind(), binaryRelationship.getTarget().getIid()));

            return violation;
        }

        boolean isMemberOfCategory = CategorizableThingExtensions.isMemberOfCategory(targetCategorizableThing, this.getTargetCategory());
        if (!isMemberOfCategory) {
            RuleViolation violation = new RuleViolation(UUID.randomUUID(), this.getCache(), this.getIDalUri());
            violation.getViolatingThing().add(binaryRelationship.getIid());
            violation.getViolatingThing().add(binaryRelationship.getTarget().getIid());
            violation.setDescription(String.format("The Target [%s:%s] of the BinaryRelationShip %s is not a member of Category %s with shortname %s or any of it's super categories", binaryRelationship.getTarget().getClassKind(), binaryRelationship.getTarget().getIid(), binaryRelationship.getIid(), this.getTargetCategory().getIid(), this.getTargetCategory().getShortName()));

            return violation;
        }

        return null;
    }
}
