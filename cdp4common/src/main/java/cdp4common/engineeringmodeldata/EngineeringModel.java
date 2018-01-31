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
import org.ehcache.Cache;
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
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NONE;

    /**
     * Initializes a new instance of the {@link EngineeringModel} class.
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
     * Initializes a new instance of the {@link EngineeringModel} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public EngineeringModel(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
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
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link EngineeringModel}.
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
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link EngineeringModel}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
        containers.add(this.book);
        containers.add(this.commonFileStore);
        containers.add(this.genericNote);
        containers.add(this.iteration);
        containers.add(this.logEntry);
        containers.add(this.modellingAnnotation);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link EngineeringModel} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link EngineeringModel}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        EngineeringModel clone = (EngineeringModel)this.clone();
        clone.setBook(cloneContainedThings ? new OrderedItemList<Book>(clone, true) : new OrderedItemList<Book>(this.getBook(), clone));
        clone.setCommonFileStore(cloneContainedThings ? new ContainerList<CommonFileStore>(clone) : new ContainerList<CommonFileStore>(this.getCommonFileStore(), clone));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
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
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link EngineeringModel} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link EngineeringModel}.
     */
    @Override
    public EngineeringModel clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (EngineeringModel)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>EngineeringModel}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getEngineeringModelSetup() == null || this.getEngineeringModelSetup().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property engineeringModelSetup is null.");
            this.setEngineeringModelSetup(SentinelThingProvider.getSentinel<EngineeringModelSetup>());
            this.sentinelResetMap.put("engineeringModelSetup", new ActionImpl(() -> this.setEngineeringModelSetup(null)));
        }

        int iterationCount = this.getIteration().size();
        if (iterationCount < 1) {
            errorList.add("The number of elements in the property iteration is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link EngineeringModel} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.EngineeringModel dto = (cdp4common.dto.EngineeringModel)dtoThing;

        this.getBook().resolveList(dto.getBook(), dto.getIterationContainerId(), this.getCache());
        this.getCommonFileStore().resolveList(dto.getCommonFileStore(), dto.getIterationContainerId(), this.getCache());
        this.setEngineeringModelSetup(this.getCache().get<EngineeringModelSetup>(dto.getEngineeringModelSetup(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<EngineeringModelSetup>());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getGenericNote().resolveList(dto.getGenericNote(), dto.getIterationContainerId(), this.getCache());
        this.getIteration().resolveList(dto.getIteration(), dto.getIterationContainerId(), this.getCache());
        this.setLastModifiedOn(dto.getLastModifiedOn());
        this.getLogEntry().resolveList(dto.getLogEntry(), dto.getIterationContainerId(), this.getCache());
        this.getModellingAnnotation().resolveList(dto.getModellingAnnotation(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link EngineeringModel}
     *
     * @return Generated {@link cdp4common.dto.Thing}
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

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
