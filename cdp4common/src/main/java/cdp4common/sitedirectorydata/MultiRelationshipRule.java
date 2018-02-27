/* --------------------------------------------------------------------------------------------------------------------
 * MultiRelationshipRule.java
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
import org.apache.commons.lang3.tuple.Pair;
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of a validation rule for MultiRelationships that relate (potentially) more than two CategorizableThings
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "rule")
@ToString
@EqualsAndHashCode(callSuper = true)
public class MultiRelationshipRule extends Rule implements Cloneable {
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
     * Initializes a new instance of the {@link MultiRelationshipRule} class.
     */
    public MultiRelationshipRule() {
        this.relatedCategory = new ArrayList<Category>();
    }

    /**
     * Initializes a new instance of the {@link MultiRelationshipRule} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public MultiRelationshipRule(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.relatedCategory = new ArrayList<Category>();
    }

    /**
     * Property maxRelated.
     * definition of the valid maximum number of <i>relatedThing</i> in a MultiRelationship that is a member of <i>relationshipCategory</i>
     * Note 1: This can be used to define a cardinality constraint.
     * Note 2: A value of -1 signifies that an unlimited number of <i>relatedThing</i> is valid.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private int maxRelated;

    /**
     * Property minRelated.
     * definition of the valid minimum number of <i>relatedThing</i> in a MultiRelationship that is a member of <i>relationshipCategory</i>
     * Note: This can be used to define a cardinality constraint.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private int minRelated;

    /**
     * List of Category.
     * reference to valid Categories for <i>relatedThing</i> of implied MultiRelationships
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<Category> relatedCategory;

    /**
     * Property relationshipCategory.
     * reference to the Category whose member MultiRelationships shall comply with this MultiRelationshipRule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Category relationshipCategory;

    /**
     * Creates and returns a copy of this {@link MultiRelationshipRule} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link MultiRelationshipRule}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        MultiRelationshipRule clone;
        try {
            clone = (MultiRelationshipRule)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow MultiRelationshipRule cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));
        clone.setRelatedCategory(new ArrayList<Category>(this.getRelatedCategory()));

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
     * Creates and returns a copy of this {@link MultiRelationshipRule} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link MultiRelationshipRule}.
     */
    @Override
    public MultiRelationshipRule clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (MultiRelationshipRule)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this MultiRelationshipRule}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int relatedCategoryCount = this.getRelatedCategory().size();
        if (relatedCategoryCount < 1) {
            errorList.add("The number of elements in the property relatedCategory is wrong. It should be at least 1.");
        }

        if (this.getRelationshipCategory() == null || this.getRelationshipCategory().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property relationshipCategory is null.");
            this.setRelationshipCategory(SentinelThingProvider.getSentinel(Category.class));
            this.sentinelResetMap.put("relationshipCategory", new ActionImpl(() -> this.setRelationshipCategory(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link MultiRelationshipRule} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.MultiRelationshipRule dto = (cdp4common.dto.MultiRelationshipRule)dtoThing;

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setDeprecated(dto.isDeprecated());
        this.setMaxRelated(dto.getMaxRelated());
        this.setMinRelated(dto.getMinRelated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.getRelatedCategory().resolveList(dto.getRelatedCategory(), dto.getIterationContainerId(), this.getCache());
        this.setRelationshipCategory(this.getCache().get<Category>(dto.getRelationshipCategory(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel(Category.class));
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link MultiRelationshipRule}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() throws ContainmentException {
        cdp4common.dto.MultiRelationshipRule dto = new cdp4common.dto.MultiRelationshipRule(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDeprecated(this.isDeprecated());
        dto.setMaxRelated(this.getMaxRelated());
        dto.setMinRelated(this.getMinRelated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getRelatedCategory().addAll(this.getRelatedCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRelationshipCategory(this.getRelationshipCategory() != null ? this.getRelationshipCategory().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
