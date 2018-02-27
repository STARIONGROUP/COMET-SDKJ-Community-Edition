/* --------------------------------------------------------------------------------------------------------------------
 * StakeHolderValueMap.java
 * Copyright (c) 2018 RHEA System S.A.
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
import org.apache.commons.lang3.tuple.Pair;
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * A map that represents selected Goals, ValueGroups, StakeholderValue, Requirements and their relationships
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = Iteration.class, propertyName = "stakeholderValueMap")
@ToString
@EqualsAndHashCode(callSuper = true)
public class StakeHolderValueMap extends DefinedThing implements Cloneable, CategorizableThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NONE;

    /**
     * Initializes a new instance of the {@link StakeHolderValueMap} class.
     */
    public StakeHolderValueMap() {
        this.category = new ArrayList<Category>();
        this.goal = new ArrayList<Goal>();
        this.requirement = new ArrayList<Requirement>();
        this.settings = new ContainerList<StakeHolderValueMapSettings>(this);
        this.stakeholderValue = new ArrayList<StakeholderValue>();
        this.valueGroup = new ArrayList<ValueGroup>();
    }

    /**
     * Initializes a new instance of the {@link StakeHolderValueMap} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public StakeHolderValueMap(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.category = new ArrayList<Category>();
        this.goal = new ArrayList<Goal>();
        this.requirement = new ArrayList<Requirement>();
        this.settings = new ContainerList<StakeHolderValueMapSettings>(this);
        this.stakeholderValue = new ArrayList<StakeholderValue>();
        this.valueGroup = new ArrayList<ValueGroup>();
    }

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<Category> category;

    /**
     * List of Goal.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<Goal> goal;

    /**
     * List of Requirement.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<Requirement> requirement;

    /**
     * List of contained StakeHolderValueMapSettings.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<StakeHolderValueMapSettings> settings;

    /**
     * List of StakeholderValue.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<StakeholderValue> stakeholderValue;

    /**
     * List of ValueGroup.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<ValueGroup> valueGroup;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link StakeHolderValueMap}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets an {@link List<List>} that references the composite properties of the current {@link StakeHolderValueMap}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<List>(super.getContainerLists());
        containers.add(this.settings);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link StakeHolderValueMap} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link StakeHolderValueMap}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        StakeHolderValueMap clone;
        try {
            clone = (StakeHolderValueMap)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow StakeHolderValueMap cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setGoal(new ArrayList<Goal>(this.getGoal()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));
        clone.setRequirement(new ArrayList<Requirement>(this.getRequirement()));
        clone.setSettings(cloneContainedThings ? new ContainerList<StakeHolderValueMapSettings>(clone) : new ContainerList<StakeHolderValueMapSettings>(this.getSettings(), clone, false));
        clone.setStakeholderValue(new ArrayList<StakeholderValue>(this.getStakeholderValue()));
        clone.setValueGroup(new ArrayList<ValueGroup>(this.getValueGroup()));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getSettings().addAll(this.getSettings().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link StakeHolderValueMap} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link StakeHolderValueMap}.
     */
    @Override
    public StakeHolderValueMap clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (StakeHolderValueMap)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this StakeHolderValueMap}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int settingsCount = this.getSettings().size();
        if (settingsCount < 1) {
            errorList.add("The number of elements in the property settings is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link StakeHolderValueMap} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.StakeHolderValueMap dto = (cdp4common.dto.StakeHolderValueMap)dtoThing;

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.getCategory().resolveList(dto.getCategory(), dto.getIterationContainerId(), this.getCache());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getGoal().resolveList(dto.getGoal(), dto.getIterationContainerId(), this.getCache());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.getRequirement().resolveList(dto.getRequirement(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.getSettings().resolveList(dto.getSettings(), dto.getIterationContainerId(), this.getCache());
        this.setShortName(dto.getShortName());
        this.getStakeholderValue().resolveList(dto.getStakeholderValue(), dto.getIterationContainerId(), this.getCache());
        this.getValueGroup().resolveList(dto.getValueGroup(), dto.getIterationContainerId(), this.getCache());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link StakeHolderValueMap}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() throws ContainmentException {
        cdp4common.dto.StakeHolderValueMap dto = new cdp4common.dto.StakeHolderValueMap(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getCategory().addAll(this.getCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getGoal().addAll(this.getGoal().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getRequirement().addAll(this.getRequirement().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.getSettings().addAll(this.getSettings().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setShortName(this.getShortName());
        dto.getStakeholderValue().addAll(this.getStakeholderValue().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getValueGroup().addAll(this.getValueGroup().stream().map(Thing::getIid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
