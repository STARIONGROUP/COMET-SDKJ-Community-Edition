/* --------------------------------------------------------------------------------------------------------------------
 * BinaryRelationship.java
 * Copyright (c) 2019 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

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
 * representation of a relationship between exactly two Things
 * Note: This allows very generic relationships to be defined between any two Things. In order to make its use controlled and meaningful the semantics of the relationship should be defined by making the BinaryRelationship a member of a Category and defining an applicable BinaryRelationshipRule.
 */
@Container(clazz = Iteration.class, propertyName = "relationship")
@ToString
@EqualsAndHashCode(callSuper = true)
public class BinaryRelationship extends Relationship implements Cloneable {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the {@link BinaryRelationship} class.
     */
    public BinaryRelationship() {
    }

    /**
     * Initializes a new instance of the {@link BinaryRelationship} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public BinaryRelationship(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property source.
     * reference to the source Thing of this BinaryRelationship
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Thing source;

    /**
     * Property target.
     * reference to the target Thing of this BinaryRelationship
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Thing target;

    /**
     * Creates and returns a copy of this {@link BinaryRelationship} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link BinaryRelationship}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        BinaryRelationship clone;
        try {
            clone = (BinaryRelationship)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow BinaryRelationship cannot be cloned.");
        }

        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setParameterValue(cloneContainedThings ? new ContainerList<RelationshipParameterValue>(clone) : new ContainerList<RelationshipParameterValue>(this.getParameterValue(), clone, false));

        if (cloneContainedThings) {
            clone.getParameterValue().addAll(this.getParameterValue().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link BinaryRelationship} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link BinaryRelationship}.
     */
    @Override
    public BinaryRelationship clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (BinaryRelationship)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this BinaryRelationship}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getSource() == null || this.getSource().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property source is null.");
            this.setSource(SentinelThingProvider.getSentinel(Thing.class));
            this.sentinelResetMap.put("source", new ActionImpl(() -> this.setSource(null)));
        }

        if (this.getTarget() == null || this.getTarget().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property target is null.");
            this.setTarget(SentinelThingProvider.getSentinel(Thing.class));
            this.sentinelResetMap.put("target", new ActionImpl(() -> this.setTarget(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link BinaryRelationship} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.BinaryRelationship dto = (cdp4common.dto.BinaryRelationship)dtoThing;

        PojoThingFactory.resolveList(this.getCategory(), dto.getCategory(), dto.getIterationContainerId(), this.getCache(), Category.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setOwner(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getOwner(), dto.getIterationContainerId(), DomainOfExpertise.class), SentinelThingProvider.getSentinel(DomainOfExpertise.class)));
        PojoThingFactory.resolveList(this.getParameterValue(), dto.getParameterValue(), dto.getIterationContainerId(), this.getCache(), RelationshipParameterValue.class);
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setSource(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getSource(), dto.getIterationContainerId(), Thing.class), SentinelThingProvider.getSentinel(Thing.class)));
        this.setTarget(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getTarget(), dto.getIterationContainerId(), Thing.class), SentinelThingProvider.getSentinel(Thing.class)));

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link BinaryRelationship}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.BinaryRelationship dto = new cdp4common.dto.BinaryRelationship(this.getIid(), this.getRevisionNumber());

        dto.getCategory().addAll(this.getCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.getParameterValue().addAll(this.getParameterValue().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setSource(this.getSource() != null ? this.getSource().getIid() : new UUID(0L, 0L));
        dto.setTarget(this.getTarget() != null ? this.getTarget().getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Gets the user-friendly name
     */
    @Override
    public String getUserFriendlyName() {
        return String.format("%s -> %s", this.getSource().getUserFriendlyName(), this.getTarget().getUserFriendlyName());
    }

    /**
     * Gets the user-friendly short name
     */
    @Override
    public String getUserFriendlyShortName() {
        return String.format("%s.%s", this.getSource().getUserFriendlyShortName(), this.getTarget().getUserFriendlyShortName());
    }

    /**
     * Gets the list of {@link BinaryRelationshipRule} applied to this {@link BinaryRelationship}
     */
    public List<BinaryRelationshipRule> getAppliedBinaryRelationshipRules() {
        if (this.getCategory() == null) {
            return new ArrayList<>();
        }

        EngineeringModel model = this.getContainerOfType(EngineeringModel.class);
        if (model == null) {
            throw new ContainmentException("The Engineering Model container is null.");
        }

        ReferenceDataLibrary mrdl = Iterables.getOnlyElement(model.getEngineeringModelSetup().getRequiredRdl());

        List<BinaryRelationshipRule> appliedRules = mrdl.getRule().stream().filter(x -> x instanceof BinaryRelationshipRule).map(x -> (BinaryRelationshipRule)x).filter(c -> this.getCategory().contains(c.getRelationshipCategory())).collect(Collectors.toList());
        appliedRules.addAll(mrdl.getRequiredRdls()
                .stream()
                .flatMap(rdl -> rdl.getRule().stream())
                .filter(x -> x instanceof BinaryRelationshipRule)
                .map(x -> (BinaryRelationshipRule) x)
                .filter(c -> this.getCategory().contains(c.getRelationshipCategory()))
                .collect(Collectors.toList()));

        return appliedRules;
    }
}
