/* --------------------------------------------------------------------------------------------------------------------
 * AbstractRequirement.java
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
 * representation of a requirement in a RequirementsSpecification
 * Note 1: The identifier of the requirement is specified in the <i>shortName</i>. The title or summary description of the requirement is specified in the <i>name</i>.
 * Note 2: The textual body of the requirement is specified in the <i>content</i> of the associated Definition.
 */
@Container(clazz = RequirementsSpecification.class, propertyName = "requirement")
public abstract class AbstractRequirement extends AbstractSimpleParameterizableThing implements CategorizableThing, DeprecatableThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_N_E;

    /**
     * Initializes a new instance of the <code>Requirement<code/> class.
     *
     * @see Requirement
     */
    public AbstractRequirement() {
        this.category = new List<Category>();
        this.parametricConstraint = new OrderedItemList<ParametricConstraint>(this, true);
    }

    /**
     * Initializes a new instance of the <code>Requirement<code/> class.
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
     * @see Requirement
     */
    public AbstractRequirement(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.category = new List<Category>();
        this.parametricConstraint = new OrderedItemList<ParametricConstraint>(this, true);
    }

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<Category> category;

    /**
     * Property group.
     * optional reference to a RequirementsGroup of which this Requirement is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private RequirementsGroup group;

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isDeprecated;

    /**
     * List of ordered contained ParametricConstraint.
     * optional parametric constraint that provides a specification of a quantifiable requirement in the form of a boolean expression
     * Note: In addition to a textual specification of a requirement, such a constraint enables a precise mathematical formulation of the requirement in the form of a boolean expression that can in principle be evaluated by machine. It may form the basis for an automated comparison with Parameters of the same ParameterType(s) as used in the ParametricConstraint of ElementDefinitions that characterise the achieved or realizable capabilities and performances of a designed solution.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<ParametricConstraint> parametricConstraint;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>Requirement<code/>.
     *
     * @see Iterable
     * @see Requirement
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
     * Gets the group.
     * optional reference to a RequirementsGroup of which this Requirement is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public RequirementsGroup getGroup(){
         return this.group;
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
     * Gets a list of ordered contained ParametricConstraint.
     * optional parametric constraint that provides a specification of a quantifiable requirement in the form of a boolean expression
     * Note: In addition to a textual specification of a requirement, such a constraint enables a precise mathematical formulation of the requirement in the form of a boolean expression that can in principle be evaluated by machine. It may form the basis for an automated comparison with Parameters of the same ParameterType(s) as used in the ParametricConstraint of ElementDefinitions that characterise the achieved or realizable capabilities and performances of a designed solution.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<ParametricConstraint> getParametricConstraint(){
         return this.parametricConstraint;
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
     * Sets the group.
     * optional reference to a RequirementsGroup of which this Requirement is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setGroup(RequirementsGroup group){
        this.group = group;
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
     * Sets a list of ordered contained ParametricConstraint.
     * optional parametric constraint that provides a specification of a quantifiable requirement in the form of a boolean expression
     * Note: In addition to a textual specification of a requirement, such a constraint enables a precise mathematical formulation of the requirement in the form of a boolean expression that can in principle be evaluated by machine. It may form the basis for an automated comparison with Parameters of the same ParameterType(s) as used in the ParametricConstraint of ElementDefinitions that characterise the achieved or realizable capabilities and performances of a designed solution.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     protected void setParametricConstraint(OrderedItemList<ParametricConstraint> parametricConstraint){
        this.parametricConstraint = parametricConstraint;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>Requirement<code/>.
     *
     * @see Iterable
     * @see Requirement
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.parametricConstraint);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>Requirement<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Requirement<code/>.
     *
     * @see Requirement
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        Requirement clone = (Requirement)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setCategory(new List<Category>(this.category));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));
        clone.setParameterValue(cloneContainedThings ? new ContainerList<SimpleParameterValue>(clone) : new ContainerList<SimpleParameterValue>(this.parameterValue, clone));
        clone.setParametricConstraint(cloneContainedThings ? new OrderedItemList<ParametricConstraint>(clone, true) : new OrderedItemList<ParametricConstraint>(this.parametricConstraint, clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getParameterValue().addAll(this.parameterValue.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getParametricConstraint().addAll(this.parametricConstraint.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>Requirement<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Requirement<code/>.
     * 
     * @see Requirement
     */
    @Override
    public Requirement clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Requirement)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>Requirement<code/>.
     *
     * @return A list of potential errors.
     *
     * @see Requirement
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>Requirement<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see Requirement
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Requirement dto = (cdp4common.dto.Requirement)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.group = (dto.getGroup() != null) ? this.cache.get<RequirementsGroup>(dto.getGroup.getValue(), dto.getIterationContainerId()) : null;
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.isDeprecated = dto.getIsDeprecated();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.owner = this.cache.get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>();
        this.parameterValue.resolveList(dto.getParameterValue(), dto.getIterationContainerId(), this.cache);
        this.parametricConstraint.resolveList(dto.getParametricConstraint(), dto.getIterationContainerId(), this.cache);
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>Requirement<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see Requirement
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Requirement dto = new cdp4common.dto.Requirement(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getCategory().add(this.category.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setGroup(this.group != null ? (UUID)this.group.getIid() : null);
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsDeprecated(this.isDeprecated);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.setOwner(this.owner != null ? this.owner.getIid() : new UUID(0L, 0L));
        dto.getParameterValue().add(this.parameterValue.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getParametricConstraint().add(this.parametricConstraint.toDtoOrderedItemList());
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
