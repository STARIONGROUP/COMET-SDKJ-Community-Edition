/* --------------------------------------------------------------------------------------------------------------------
 * AbstractStakeHolderValueMap.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

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
 * A map that represents selected Goals, ValueGroups, StakeholderValue, Requirements and their relationships
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = Iteration.class, propertyName = "stakeholderValueMap")
public abstract class AbstractStakeHolderValueMap extends AbstractDefinedThing implements CategorizableThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_N_E;

    /**
     * Initializes a new instance of the <code>StakeHolderValueMap<code/> class.
     *
     * @see StakeHolderValueMap
     */
    public AbstractStakeHolderValueMap() {
        this.category = new List<Category>();
        this.goal = new List<Goal>();
        this.requirement = new List<Requirement>();
        this.settings = new ContainerList<StakeHolderValueMapSettings>(this);
        this.stakeholderValue = new List<StakeholderValue>();
        this.valueGroup = new List<ValueGroup>();
    }

    /**
     * Initializes a new instance of the <code>StakeHolderValueMap<code/> class.
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
     * @see StakeHolderValueMap
     */
    public AbstractStakeHolderValueMap(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.category = new List<Category>();
        this.goal = new List<Goal>();
        this.requirement = new List<Requirement>();
        this.settings = new ContainerList<StakeHolderValueMapSettings>(this);
        this.stakeholderValue = new List<StakeholderValue>();
        this.valueGroup = new List<ValueGroup>();
    }

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<Category> category;

    /**
     * List of Goal.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<Goal> goal;

    /**
     * List of Requirement.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<Requirement> requirement;

    /**
     * List of contained StakeHolderValueMapSettings.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<StakeHolderValueMapSettings> settings;

    /**
     * List of StakeholderValue.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<StakeholderValue> stakeholderValue;

    /**
     * List of ValueGroup.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<ValueGroup> valueGroup;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>StakeHolderValueMap<code/>.
     *
     * @see Iterable
     * @see StakeHolderValueMap
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public List<Category> getCategory(){
         return this.category;
    }

    /**
     * Gets a list of Goal.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public List<Goal> getGoal(){
         return this.goal;
    }

    /**
     * Gets a list of Requirement.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public List<Requirement> getRequirement(){
         return this.requirement;
    }

    /**
     * Gets a list of contained StakeHolderValueMapSettings.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<StakeHolderValueMapSettings> getSettings(){
         return this.settings;
    }

    /**
     * Gets a list of StakeholderValue.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public List<StakeholderValue> getStakeholderValue(){
         return this.stakeholderValue;
    }

    /**
     * Gets a list of ValueGroup.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public List<ValueGroup> getValueGroup(){
         return this.valueGroup;
    }

    /**
     * Sets a list of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setCategory(List<Category> category){
        this.category = category;
    }

    /**
     * Sets a list of Goal.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setGoal(List<Goal> goal){
        this.goal = goal;
    }

    /**
     * Sets a list of Requirement.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setRequirement(List<Requirement> requirement){
        this.requirement = requirement;
    }

    /**
     * Sets a list of contained StakeHolderValueMapSettings.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setSettings(ContainerList<StakeHolderValueMapSettings> settings){
        this.settings = settings;
    }

    /**
     * Sets a list of StakeholderValue.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setStakeholderValue(List<StakeholderValue> stakeholderValue){
        this.stakeholderValue = stakeholderValue;
    }

    /**
     * Sets a list of ValueGroup.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setValueGroup(List<ValueGroup> valueGroup){
        this.valueGroup = valueGroup;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>StakeHolderValueMap<code/>.
     *
     * @see Iterable
     * @see StakeHolderValueMap
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.settings);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>StakeHolderValueMap<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>StakeHolderValueMap<code/>.
     *
     * @see StakeHolderValueMap
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        StakeHolderValueMap clone = (StakeHolderValueMap)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setCategory(new List<Category>(this.category));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setGoal(new List<Goal>(this.goal));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));
        clone.setRequirement(new List<Requirement>(this.requirement));
        clone.setSettings(cloneContainedThings ? new ContainerList<StakeHolderValueMapSettings>(clone) : new ContainerList<StakeHolderValueMapSettings>(this.settings, clone));
        clone.setStakeholderValue(new List<StakeholderValue>(this.stakeholderValue));
        clone.setValueGroup(new List<ValueGroup>(this.valueGroup));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getSettings().addAll(this.settings.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>StakeHolderValueMap<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>StakeHolderValueMap<code/>.
     * 
     * @see StakeHolderValueMap
     */
    @Override
    public StakeHolderValueMap clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (StakeHolderValueMap)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>StakeHolderValueMap<code/>.
     *
     * @return A list of potential errors.
     *
     * @see StakeHolderValueMap
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int settingsCount = this.settings.size();
        if (settingsCount < 1) {
            errorList.add("The number of elements in the property settings is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>StakeHolderValueMap<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see StakeHolderValueMap
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.StakeHolderValueMap dto = (cdp4common.dto.StakeHolderValueMap)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.goal.resolveList(dto.getGoal(), dto.getIterationContainerId(), this.cache);
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.requirement.resolveList(dto.getRequirement(), dto.getIterationContainerId(), this.cache);
        this.revisionNumber = dto.getRevisionNumber();
        this.settings.resolveList(dto.getSettings(), dto.getIterationContainerId(), this.cache);
        this.shortName = dto.getShortName();
        this.stakeholderValue.resolveList(dto.getStakeholderValue(), dto.getIterationContainerId(), this.cache);
        this.valueGroup.resolveList(dto.getValueGroup(), dto.getIterationContainerId(), this.cache);

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>StakeHolderValueMap<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see StakeHolderValueMap
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.StakeHolderValueMap dto = new cdp4common.dto.StakeHolderValueMap(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getCategory().add(this.category.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getGoal().add(this.goal.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.getRequirement().add(this.requirement.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.revisionNumber);
        dto.getSettings().add(this.settings.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setShortName(this.shortName);
        dto.getStakeholderValue().add(this.stakeholderValue.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getValueGroup().add(this.valueGroup.stream().map(x -> x.Iid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
