/* --------------------------------------------------------------------------------------------------------------------
 * AbstractEngineeringModel.java
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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of a parametric concurrent engineering model that specifies the problem to be solved and defines one or more (possible) design solutions
 * Note 1: An EngineeringModel also references a chain of one or more ReferenceDataLibraries (through the <i>requiredRdl</i> property of the associated EngineeringModelSetup) that define the reference data that is or can be used in the model.
 * Note 2: When an EngineeringModel is created for first time, it shall contain one Iteration and one Option (with <i>name</i> and <i>shortName</i> set to "Default"), which shall also be referenced as the <i>defaultOption</i>.
 */
@ToString
@EqualsAndHashCode
public  class EngineeringModel extends TopContainer  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NONE;

    /**
     * Initializes a new instance of the <code>EngineeringModel<code/> class.
     *
     * @see EngineeringModel
     */
    public EngineeringModel() {
        this.book = new OrderedItemList<Book>(this, true);
        this.commonFileStore = new ContainerList<CommonFileStore>(this);
        this.genericNote = new ContainerList<EngineeringModelDataNote>(this);
        this.iteration = new ContainerList<Iteration>(this);
        this.logEntry = new ContainerList<ModelLogEntry>(this);
        this.modellingAnnotation = new ContainerList<ModellingAnnotationItem>(this);
    }

    /**
     * Initializes a new instance of the <code>EngineeringModel<code/> class.
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
     * @see EngineeringModel
     */
    public EngineeringModel(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.book = new OrderedItemList<Book>(this, true);
        this.commonFileStore = new ContainerList<CommonFileStore>(this);
        this.genericNote = new ContainerList<EngineeringModelDataNote>(this);
        this.iteration = new ContainerList<Iteration>(this);
        this.logEntry = new ContainerList<ModelLogEntry>(this);
        this.modellingAnnotation = new ContainerList<ModellingAnnotationItem>(this);
    }

    /**
     * List of ordered contained Book.
     * collection of Books in this EngineeringModel
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<Book> book;

    /**
     * List of contained CommonFileStore.
     * representation of the CommonFileStore in this EngineeringModel
     * Note: Typically there will be one CommonFileStore shared by all domains in a particular EngineeringModel, plus one DomainFileStore for each DomainOfExpertise.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<CommonFileStore> commonFileStore;

    /**
     * Property engineeringModelSetup.
     * reference to the set-up information for this EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private EngineeringModelSetup engineeringModelSetup;

    /**
     * List of contained EngineeringModelDataNote.
     * The generic annotations made on Things contained by this EngineeringModel
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<EngineeringModelDataNote> genericNote;

    /**
     * List of contained Iteration.
     * collection of Iterations in this EngineeringModel
     * Note 1: An iteration is a version of the EngineeringModel that is considered as one complete and coherent step in the development of the EngineeringModel in a concurrent engineering activity. The detailed definition and understanding of the meaning of a "complete and coherent" step depends on the organization that develops the EngineeringModel.
     * Note 2: In a concurrent engineering activity the engineering model for the system-of-interest is developed in a number of iterations, where in each iteration the problem specification in the form of the RequirementsSpecification and a design solution in the form of the Options and ElementDefinitions are elaborated and refined. With an iteration the engineering team strives to set one more step in the direction of achieving a converged definition that fulfills the objectives of their activity.
     * Note 3: In an implementation of E-TM-10-25 the actual Iteration objects may be stored in different partitions in a persistent data store.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Iteration> iteration;

    /**
     * List of contained ModelLogEntry.
     * collection of logbook entries for this EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ModelLogEntry> logEntry;

    /**
     * List of contained ModellingAnnotationItem.
     * The modelling annotation made on the Things contained by this EngineeringModel
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ModellingAnnotationItem> modellingAnnotation;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>EngineeringModel<code/>.
     *
     * @see Iterable
     * @see EngineeringModel
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of ordered contained Book.
     * collection of Books in this EngineeringModel
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<Book> getBook(){
         return this.book;
    }

    /**
     * Gets a list of contained CommonFileStore.
     * representation of the CommonFileStore in this EngineeringModel
     * Note: Typically there will be one CommonFileStore shared by all domains in a particular EngineeringModel, plus one DomainFileStore for each DomainOfExpertise.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<CommonFileStore> getCommonFileStore(){
         return this.commonFileStore;
    }

    /**
     * Gets the engineeringModelSetup.
     * reference to the set-up information for this EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public EngineeringModelSetup getEngineeringModelSetup(){
         return this.engineeringModelSetup;
    }

    /**
     * Gets a list of contained EngineeringModelDataNote.
     * The generic annotations made on Things contained by this EngineeringModel
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<EngineeringModelDataNote> getGenericNote(){
         return this.genericNote;
    }

    /**
     * Gets a list of contained Iteration.
     * collection of Iterations in this EngineeringModel
     * Note 1: An iteration is a version of the EngineeringModel that is considered as one complete and coherent step in the development of the EngineeringModel in a concurrent engineering activity. The detailed definition and understanding of the meaning of a "complete and coherent" step depends on the organization that develops the EngineeringModel.
     * Note 2: In a concurrent engineering activity the engineering model for the system-of-interest is developed in a number of iterations, where in each iteration the problem specification in the form of the RequirementsSpecification and a design solution in the form of the Options and ElementDefinitions are elaborated and refined. With an iteration the engineering team strives to set one more step in the direction of achieving a converged definition that fulfills the objectives of their activity.
     * Note 3: In an implementation of E-TM-10-25 the actual Iteration objects may be stored in different partitions in a persistent data store.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Iteration> getIteration(){
         return this.iteration;
    }

    /**
     * Gets a list of contained ModelLogEntry.
     * collection of logbook entries for this EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ModelLogEntry> getLogEntry(){
         return this.logEntry;
    }

    /**
     * Gets a list of contained ModellingAnnotationItem.
     * The modelling annotation made on the Things contained by this EngineeringModel
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ModellingAnnotationItem> getModellingAnnotation(){
         return this.modellingAnnotation;
    }

    /**
     * Sets a list of ordered contained Book.
     * collection of Books in this EngineeringModel
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     protected void setBook(OrderedItemList<Book> book){
        this.book = book;
    }

    /**
     * Sets a list of contained CommonFileStore.
     * representation of the CommonFileStore in this EngineeringModel
     * Note: Typically there will be one CommonFileStore shared by all domains in a particular EngineeringModel, plus one DomainFileStore for each DomainOfExpertise.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setCommonFileStore(ContainerList<CommonFileStore> commonFileStore){
        this.commonFileStore = commonFileStore;
    }

    /**
     * Sets the engineeringModelSetup.
     * reference to the set-up information for this EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setEngineeringModelSetup(EngineeringModelSetup engineeringModelSetup){
        this.engineeringModelSetup = engineeringModelSetup;
    }

    /**
     * Sets a list of contained EngineeringModelDataNote.
     * The generic annotations made on Things contained by this EngineeringModel
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setGenericNote(ContainerList<EngineeringModelDataNote> genericNote){
        this.genericNote = genericNote;
    }

    /**
     * Sets a list of contained Iteration.
     * collection of Iterations in this EngineeringModel
     * Note 1: An iteration is a version of the EngineeringModel that is considered as one complete and coherent step in the development of the EngineeringModel in a concurrent engineering activity. The detailed definition and understanding of the meaning of a "complete and coherent" step depends on the organization that develops the EngineeringModel.
     * Note 2: In a concurrent engineering activity the engineering model for the system-of-interest is developed in a number of iterations, where in each iteration the problem specification in the form of the RequirementsSpecification and a design solution in the form of the Options and ElementDefinitions are elaborated and refined. With an iteration the engineering team strives to set one more step in the direction of achieving a converged definition that fulfills the objectives of their activity.
     * Note 3: In an implementation of E-TM-10-25 the actual Iteration objects may be stored in different partitions in a persistent data store.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setIteration(ContainerList<Iteration> iteration){
        this.iteration = iteration;
    }

    /**
     * Sets a list of contained ModelLogEntry.
     * collection of logbook entries for this EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setLogEntry(ContainerList<ModelLogEntry> logEntry){
        this.logEntry = logEntry;
    }

    /**
     * Sets a list of contained ModellingAnnotationItem.
     * The modelling annotation made on the Things contained by this EngineeringModel
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setModellingAnnotation(ContainerList<ModellingAnnotationItem> modellingAnnotation){
        this.modellingAnnotation = modellingAnnotation;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>EngineeringModel<code/>.
     *
     * @see Iterable
     * @see EngineeringModel
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.book);
        containers.Add(this.commonFileStore);
        containers.Add(this.genericNote);
        containers.Add(this.iteration);
        containers.Add(this.logEntry);
        containers.Add(this.modellingAnnotation);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>EngineeringModel<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>EngineeringModel<code/>.
     *
     * @see EngineeringModel
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        EngineeringModel clone = (EngineeringModel)this.clone();
        clone.setBook(cloneContainedThings ? new OrderedItemList<Book>(clone, true) : new OrderedItemList<Book>(this.getBook(), clone));
        clone.setCommonFileStore(cloneContainedThings ? new ContainerList<CommonFileStore>(clone) : new ContainerList<CommonFileStore>(this.getCommonFileStore(), clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setGenericNote(cloneContainedThings ? new ContainerList<EngineeringModelDataNote>(clone) : new ContainerList<EngineeringModelDataNote>(this.getGenericNote(), clone));
        clone.setIteration(cloneContainedThings ? new ContainerList<Iteration>(clone) : new ContainerList<Iteration>(this.getIteration(), clone));
        clone.setLogEntry(cloneContainedThings ? new ContainerList<ModelLogEntry>(clone) : new ContainerList<ModelLogEntry>(this.getLogEntry(), clone));
        clone.setModellingAnnotation(cloneContainedThings ? new ContainerList<ModellingAnnotationItem>(clone) : new ContainerList<ModellingAnnotationItem>(this.getModellingAnnotation(), clone));

        if (cloneContainedThings) {
            clone.getBook().addAll(this.getBook().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getCommonFileStore().addAll(this.getCommonFileStore().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getGenericNote().addAll(this.getGenericNote().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getIteration().addAll(this.getIteration().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getLogEntry().addAll(this.getLogEntry().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getModellingAnnotation().addAll(this.getModellingAnnotation().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>EngineeringModel<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>EngineeringModel<code/>.
     * 
     * @see EngineeringModel
     */
    @Override
    public EngineeringModel clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (EngineeringModel)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>EngineeringModel<code/>.
     *
     * @return A list of potential errors.
     *
     * @see EngineeringModel
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getEngineeringModelSetup() == null || this.getEngineeringModelSetup().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property engineeringModelSetup is null.");
            this.setEngineeringModelSetup(SentinelThingProvider.getSentinel<EngineeringModelSetup>());
            this.sentinelResetMap["engineeringModelSetup"] = () -> this.setEngineeringModelSetup(null);
        }

        int iterationCount = this.getIteration().size();
        if (iterationCount < 1) {
            errorList.add("The number of elements in the property iteration is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>EngineeringModel<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see EngineeringModel
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.EngineeringModel dto = (cdp4common.dto.EngineeringModel)dtoThing;

        this.book.resolveList(dto.getBook(), dto.getIterationContainerId(), this.getCache());
        this.commonFileStore.resolveList(dto.getCommonFileStore(), dto.getIterationContainerId(), this.getCache());
        this.setEngineeringModelSetup(this.cache.get<EngineeringModelSetup>(dto.getEngineeringModelSetup(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<EngineeringModelSetup>());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.genericNote.resolveList(dto.getGenericNote(), dto.getIterationContainerId(), this.getCache());
        this.iteration.resolveList(dto.getIteration(), dto.getIterationContainerId(), this.getCache());
        this.setLastModifiedOn(dto.getLastModifiedOn());
        this.logEntry.resolveList(dto.getLogEntry(), dto.getIterationContainerId(), this.getCache());
        this.modellingAnnotation.resolveList(dto.getModellingAnnotation(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>EngineeringModel<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see EngineeringModel
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.EngineeringModel dto = new cdp4common.dto.EngineeringModel(this.getIid(), this.getRevisionNumber());

        dto.getBook().add(this.getBook().toDtoOrderedItemList());
        dto.getCommonFileStore().add(this.getCommonFileStore().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setEngineeringModelSetup(this.getEngineeringModelSetup() != null ? this.getEngineeringModelSetup().getIid() : new UUID(0L, 0L));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getGenericNote().add(this.getGenericNote().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getIteration().add(this.getIteration().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setLastModifiedOn(this.getLastModifiedOn());
        dto.getLogEntry().add(this.getLogEntry().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getModellingAnnotation().add(this.getModellingAnnotation().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
