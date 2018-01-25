/* --------------------------------------------------------------------------------------------------------------------
 * AbstractOption.java
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
 * representation of an option that is a potential design solution for the system-of-interest being developed in an Iteration of an EngineeringModel
 * Note: An Option in this context constitutes a design alternative that can be compared with one or more other design alternatives defined in other Options, for example to perform a trade analysis.
 */
@Container(clazz = Iteration.class, propertyName = "option")
public abstract class AbstractOption extends AbstractDefinedThing implements CategorizableThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>Option<code/> class.
     *
     * @see Option
     */
    public AbstractOption() {
        this.category = new List<Category>();
        this.nestedElement = new ContainerList<NestedElement>(this);
    }

    /**
     * Initializes a new instance of the <code>Option<code/> class.
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
     * @see Option
     */
    public AbstractOption(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.category = new List<Category>();
        this.nestedElement = new ContainerList<NestedElement>(this);
    }

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<Category> category;

    /**
     * List of contained NestedElement.
     * Note 1: NestedElements may be volatile or not, to allow for NestedElements that are only present at runtime or persisted in a data store.
     * Note 2: Typically a collection of NestedElements is automatically generated at runtime from the implicit composite structure defined by the ElementDefinitions and ElementUsages in this Option.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<NestedElement> nestedElement;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>Option<code/>.
     *
     * @see Iterable
     * @see Option
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
     * Gets a list of contained NestedElement.
     * Note 1: NestedElements may be volatile or not, to allow for NestedElements that are only present at runtime or persisted in a data store.
     * Note 2: Typically a collection of NestedElements is automatically generated at runtime from the implicit composite structure defined by the ElementDefinitions and ElementUsages in this Option.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<NestedElement> getNestedElement(){
         return this.nestedElement;
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
     * Sets a list of contained NestedElement.
     * Note 1: NestedElements may be volatile or not, to allow for NestedElements that are only present at runtime or persisted in a data store.
     * Note 2: Typically a collection of NestedElements is automatically generated at runtime from the implicit composite structure defined by the ElementDefinitions and ElementUsages in this Option.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setNestedElement(ContainerList<NestedElement> nestedElement){
        this.nestedElement = nestedElement;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>Option<code/>.
     *
     * @see Iterable
     * @see Option
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.nestedElement);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>Option<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Option<code/>.
     *
     * @see Option
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        Option clone = (Option)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setCategory(new List<Category>(this.category));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));
        clone.setNestedElement(cloneContainedThings ? new ContainerList<NestedElement>(clone) : new ContainerList<NestedElement>(this.nestedElement, clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getNestedElement().addAll(this.nestedElement.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>Option<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Option<code/>.
     * 
     * @see Option
     */
    @Override
    public Option clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Option)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>Option<code/>.
     *
     * @return A list of potential errors.
     *
     * @see Option
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>Option<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see Option
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Option dto = (cdp4common.dto.Option)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.nestedElement.resolveList(dto.getNestedElement(), dto.getIterationContainerId(), this.cache);
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>Option<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see Option
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Option dto = new cdp4common.dto.Option(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getCategory().add(this.category.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.getNestedElement().add(this.nestedElement.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
