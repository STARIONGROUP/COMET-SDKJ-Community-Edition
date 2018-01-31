/* --------------------------------------------------------------------------------------------------------------------
 * AbstractEngineeringModelSetup.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

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
 * representation of the set-up information of a concurrent engineering model
 * Note: The data that defines a complete engineering model is split over two containers: EngineeringModelSetup and EngineeringModel. The rationale behind this is as follows: the EngineeringModelSetup contains the minimum information needed to provide an overview of all models available on a site and the associated EngineeringModel contains the actual detailed content of the model. In E-TM-10-25 applications it is then possible that all EngineeringModelSetups reside inside the SiteDirectory database and each EngineeringModel resides in its own separate database.
 */
@Container(clazz = SiteDirectory.class, propertyName = "model")
@ToString
@EqualsAndHashCode
public  class EngineeringModelSetup extends DefinedThing implements ParticipantAffectedAccessThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NONE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the {@link EngineeringModelSetup} class.
     */
    public EngineeringModelSetup() {
        this.activeDomain = new ArrayList<DomainOfExpertise>();
        this.iterationSetup = new ContainerList<IterationSetup>(this);
        this.participant = new ContainerList<Participant>(this);
        this.requiredRdl = new ContainerList<ModelReferenceDataLibrary>(this);
    }

    /**
     * Initializes a new instance of the {@link EngineeringModelSetup} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public EngineeringModelSetup(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.activeDomain = new ArrayList<DomainOfExpertise>();
        this.iterationSetup = new ContainerList<IterationSetup>(this);
        this.participant = new ContainerList<Participant>(this);
        this.requiredRdl = new ContainerList<ModelReferenceDataLibrary>(this);
    }

    /**
     * List of DomainOfExpertise.
     * refererence to the active domains of expertise (DomainOfExpertise) for this EngineeringModelSetup and associated EngineeringModel
     * Note: The possible domains of expertise are defined in the SiteDirectory in which this EngineeringModelSetup is contained.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<DomainOfExpertise> activeDomain;

    /**
     * Property engineeringModelIid.
     * definition of the unique instance identifier (<i>iid</i>) of the associated EngineeringModel instance
     * Note: No direct reference is made to the EngineeringModel instance since it possibly resides in a different persistent data store partition than the EngineeringModelSetup, and it should be possible to load the EngineeringModelSetup without loading the associated EngineeringModel. The EngineeringModel instance is existence dependent on the EngineeringModelSetup instance.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private UUID engineeringModelIid;

    /**
     * List of contained IterationSetup.
     * representation of the collection of IterationSetups in this EngineeringModelSetup that records the history of iterations of the associated EngineeringModel
     * Note 1: An iteration is a version of the associated EngineeringModel that was considered as one complete step in the development of the EngineeringModel in a concurrent engineering activity.
     * Note 2: The content of each iteration is stored in an instance of EngineeringModel denoted by its <i>iterationNumber</i>. In order to support efficient database implementations a data partitioning technique may be used in the database architecture. The ECSS-E-TM-10-25 application will need to implement a mechanism to retrieve a complete set or a subset of iterations of an EngineeringModel, but this mechanism is not defined in this data model.
     * Note 3: The record of iterations is kept inside EngineeringModelSetup so that in an implementation only the EngineeringModelSetup needs to be accessed in order to get a list of iterations that are present in the associated EngineeringModel.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<IterationSetup> iterationSetup;

    /**
     * Property kind.
     * definition of the kind of the engineering model
     * Note: See EngineeringModelKind for definitions of the different kinds of engineering model.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private EngineeringModelKind kind;

    /**
     * List of contained Participant.
     * reference to the actual Participants of the team that is allowed to access this EngineeringModelSetup and associated EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Participant> participant;

    /**
     * List of contained ModelReferenceDataLibrary.
     * reference to the (first) ReferenceDataLibrary that contains reference data for the engineering model
     * Note 1: Reference data consists of predefined instances that can be used across one or more studies.
     * Note 2: A chain of more than one ReferenceDataLibrary can be specified by linking to a ReferenceDataLibrary through the <i>requiredRdl</i> property of the associated ReferenceDataLibrary.
     * Note 3:The ReferenceDataLibraries are loaded in the reverse order of the chain, at runtime when an EngineeringModelSetup is opened. If the same concept (predefined instance) appears in more than one ReferenceDataLibrary the definition from the last loaded instance overwrites the definition of any earlier loaded instance (TBC!).
     * Note 4: Typically an EngineeringModelSetup has 3 ReferenceDataLibraries, as follows:
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ModelReferenceDataLibrary> requiredRdl;

    /**
     * Property sourceEngineeringModelSetupIid.
     * optional unique identifier that references the source EngineeringModelSetup (and associated EngineeringModel) that was used as the basis to create this EngineeringModelSetup (and associated EngineeringModel)
     * Note: This reference should be specified when a new engineering model is created as a copy from an existing (source) engineering model, and in particular when the source engineering model is a template model (with <i>kind</i> is EngineeringModelKind.TEMPLATE_MODEL).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private UUID sourceEngineeringModelSetupIid;

    /**
     * Property studyPhase.
     * definition of the actual phase that the engineering model is in
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private StudyPhaseKind studyPhase;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link EngineeringModelSetup}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of DomainOfExpertise.
     * refererence to the active domains of expertise (DomainOfExpertise) for this EngineeringModelSetup and associated EngineeringModel
     * Note: The possible domains of expertise are defined in the SiteDirectory in which this EngineeringModelSetup is contained.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<DomainOfExpertise> getActiveDomain(){
         return this.activeDomain;
    }

    /**
     * Gets the engineeringModelIid.
     * definition of the unique instance identifier (<i>iid</i>) of the associated EngineeringModel instance
     * Note: No direct reference is made to the EngineeringModel instance since it possibly resides in a different persistent data store partition than the EngineeringModelSetup, and it should be possible to load the EngineeringModelSetup without loading the associated EngineeringModel. The EngineeringModel instance is existence dependent on the EngineeringModelSetup instance.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public UUID getEngineeringModelIid(){
         return this.engineeringModelIid;
    }

    /**
     * Gets a list of contained IterationSetup.
     * representation of the collection of IterationSetups in this EngineeringModelSetup that records the history of iterations of the associated EngineeringModel
     * Note 1: An iteration is a version of the associated EngineeringModel that was considered as one complete step in the development of the EngineeringModel in a concurrent engineering activity.
     * Note 2: The content of each iteration is stored in an instance of EngineeringModel denoted by its <i>iterationNumber</i>. In order to support efficient database implementations a data partitioning technique may be used in the database architecture. The ECSS-E-TM-10-25 application will need to implement a mechanism to retrieve a complete set or a subset of iterations of an EngineeringModel, but this mechanism is not defined in this data model.
     * Note 3: The record of iterations is kept inside EngineeringModelSetup so that in an implementation only the EngineeringModelSetup needs to be accessed in order to get a list of iterations that are present in the associated EngineeringModel.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<IterationSetup> getIterationSetup(){
         return this.iterationSetup;
    }

    /**
     * Gets the kind.
     * definition of the kind of the engineering model
     * Note: See EngineeringModelKind for definitions of the different kinds of engineering model.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public EngineeringModelKind getKind(){
         return this.kind;
    }

    /**
     * Gets a list of contained Participant.
     * reference to the actual Participants of the team that is allowed to access this EngineeringModelSetup and associated EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Participant> getParticipant(){
         return this.participant;
    }

    /**
     * Gets a list of contained ModelReferenceDataLibrary.
     * reference to the (first) ReferenceDataLibrary that contains reference data for the engineering model
     * Note 1: Reference data consists of predefined instances that can be used across one or more studies.
     * Note 2: A chain of more than one ReferenceDataLibrary can be specified by linking to a ReferenceDataLibrary through the <i>requiredRdl</i> property of the associated ReferenceDataLibrary.
     * Note 3:The ReferenceDataLibraries are loaded in the reverse order of the chain, at runtime when an EngineeringModelSetup is opened. If the same concept (predefined instance) appears in more than one ReferenceDataLibrary the definition from the last loaded instance overwrites the definition of any earlier loaded instance (TBC!).
     * Note 4: Typically an EngineeringModelSetup has 3 ReferenceDataLibraries, as follows:
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ModelReferenceDataLibrary> getRequiredRdl(){
         return this.requiredRdl;
    }

    /**
     * Gets the sourceEngineeringModelSetupIid.
     * optional unique identifier that references the source EngineeringModelSetup (and associated EngineeringModel) that was used as the basis to create this EngineeringModelSetup (and associated EngineeringModel)
     * Note: This reference should be specified when a new engineering model is created as a copy from an existing (source) engineering model, and in particular when the source engineering model is a template model (with <i>kind</i> is EngineeringModelKind.TEMPLATE_MODEL).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public UUID getSourceEngineeringModelSetupIid(){
         return this.sourceEngineeringModelSetupIid;
    }

    /**
     * Gets the studyPhase.
     * definition of the actual phase that the engineering model is in
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public StudyPhaseKind getStudyPhase(){
         return this.studyPhase;
    }

    /**
     * Sets a list of DomainOfExpertise.
     * refererence to the active domains of expertise (DomainOfExpertise) for this EngineeringModelSetup and associated EngineeringModel
     * Note: The possible domains of expertise are defined in the SiteDirectory in which this EngineeringModelSetup is contained.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setActiveDomain(ArrayList<DomainOfExpertise> activeDomain){
        this.activeDomain = activeDomain;
    }

    /**
     * Sets the engineeringModelIid.
     * definition of the unique instance identifier (<i>iid</i>) of the associated EngineeringModel instance
     * Note: No direct reference is made to the EngineeringModel instance since it possibly resides in a different persistent data store partition than the EngineeringModelSetup, and it should be possible to load the EngineeringModelSetup without loading the associated EngineeringModel. The EngineeringModel instance is existence dependent on the EngineeringModelSetup instance.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setEngineeringModelIid(UUID engineeringModelIid){
        this.engineeringModelIid = engineeringModelIid;
    }

    /**
     * Sets a list of contained IterationSetup.
     * representation of the collection of IterationSetups in this EngineeringModelSetup that records the history of iterations of the associated EngineeringModel
     * Note 1: An iteration is a version of the associated EngineeringModel that was considered as one complete step in the development of the EngineeringModel in a concurrent engineering activity.
     * Note 2: The content of each iteration is stored in an instance of EngineeringModel denoted by its <i>iterationNumber</i>. In order to support efficient database implementations a data partitioning technique may be used in the database architecture. The ECSS-E-TM-10-25 application will need to implement a mechanism to retrieve a complete set or a subset of iterations of an EngineeringModel, but this mechanism is not defined in this data model.
     * Note 3: The record of iterations is kept inside EngineeringModelSetup so that in an implementation only the EngineeringModelSetup needs to be accessed in order to get a list of iterations that are present in the associated EngineeringModel.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setIterationSetup(ContainerList<IterationSetup> iterationSetup){
        this.iterationSetup = iterationSetup;
    }

    /**
     * Sets the kind.
     * definition of the kind of the engineering model
     * Note: See EngineeringModelKind for definitions of the different kinds of engineering model.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setKind(EngineeringModelKind kind){
        this.kind = kind;
    }

    /**
     * Sets a list of contained Participant.
     * reference to the actual Participants of the team that is allowed to access this EngineeringModelSetup and associated EngineeringModel
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setParticipant(ContainerList<Participant> participant){
        this.participant = participant;
    }

    /**
     * Sets a list of contained ModelReferenceDataLibrary.
     * reference to the (first) ReferenceDataLibrary that contains reference data for the engineering model
     * Note 1: Reference data consists of predefined instances that can be used across one or more studies.
     * Note 2: A chain of more than one ReferenceDataLibrary can be specified by linking to a ReferenceDataLibrary through the <i>requiredRdl</i> property of the associated ReferenceDataLibrary.
     * Note 3:The ReferenceDataLibraries are loaded in the reverse order of the chain, at runtime when an EngineeringModelSetup is opened. If the same concept (predefined instance) appears in more than one ReferenceDataLibrary the definition from the last loaded instance overwrites the definition of any earlier loaded instance (TBC!).
     * Note 4: Typically an EngineeringModelSetup has 3 ReferenceDataLibraries, as follows:
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setRequiredRdl(ContainerList<ModelReferenceDataLibrary> requiredRdl){
        this.requiredRdl = requiredRdl;
    }

    /**
     * Sets the sourceEngineeringModelSetupIid.
     * optional unique identifier that references the source EngineeringModelSetup (and associated EngineeringModel) that was used as the basis to create this EngineeringModelSetup (and associated EngineeringModel)
     * Note: This reference should be specified when a new engineering model is created as a copy from an existing (source) engineering model, and in particular when the source engineering model is a template model (with <i>kind</i> is EngineeringModelKind.TEMPLATE_MODEL).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setSourceEngineeringModelSetupIid(UUID sourceEngineeringModelSetupIid){
        this.sourceEngineeringModelSetupIid = sourceEngineeringModelSetupIid;
    }

    /**
     * Sets the studyPhase.
     * definition of the actual phase that the engineering model is in
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setStudyPhase(StudyPhaseKind studyPhase){
        this.studyPhase = studyPhase;
    }

    /**
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link EngineeringModelSetup}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
        containers.add(this.iterationSetup);
        containers.add(this.participant);
        containers.add(this.requiredRdl);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link EngineeringModelSetup} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link EngineeringModelSetup}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        EngineeringModelSetup clone = (EngineeringModelSetup)this.clone();
        clone.setActiveDomain(new ArrayList<DomainOfExpertise>(this.getActiveDomain()));
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));
        clone.setIterationSetup(cloneContainedThings ? new ContainerList<IterationSetup>(clone) : new ContainerList<IterationSetup>(this.getIterationSetup(), clone));
        clone.setParticipant(cloneContainedThings ? new ContainerList<Participant>(clone) : new ContainerList<Participant>(this.getParticipant(), clone));
        clone.setRequiredRdl(cloneContainedThings ? new ContainerList<ModelReferenceDataLibrary>(clone) : new ContainerList<ModelReferenceDataLibrary>(this.getRequiredRdl(), clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getIterationSetup().addAll(this.getIterationSetup().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getParticipant().addAll(this.getParticipant().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getRequiredRdl().addAll(this.getRequiredRdl().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link EngineeringModelSetup} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link EngineeringModelSetup}.
     */
    @Override
    public EngineeringModelSetup clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (EngineeringModelSetup)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>EngineeringModelSetup}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int activeDomainCount = this.getActiveDomain().size();
        if (activeDomainCount < 1) {
            errorList.add("The number of elements in the property activeDomain is wrong. It should be at least 1.");
        }

        int iterationSetupCount = this.getIterationSetup().size();
        if (iterationSetupCount < 1) {
            errorList.add("The number of elements in the property iterationSetup is wrong. It should be at least 1.");
        }

        int participantCount = this.getParticipant().size();
        if (participantCount < 1) {
            errorList.add("The number of elements in the property participant is wrong. It should be at least 1.");
        }

        int requiredRdlCount = this.getRequiredRdl().size();
        if (requiredRdlCount < 1) {
            errorList.add("The number of elements in the property requiredRdl is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link EngineeringModelSetup} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.EngineeringModelSetup dto = (cdp4common.dto.EngineeringModelSetup)dtoThing;

        this.getActiveDomain().resolveList(dto.getActiveDomain(), dto.getIterationContainerId(), this.getCache());
        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.setEngineeringModelIid(dto.getEngineeringModelIid());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.getIterationSetup().resolveList(dto.getIterationSetup(), dto.getIterationContainerId(), this.getCache());
        this.setKind(dto.getKind());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.getParticipant().resolveList(dto.getParticipant(), dto.getIterationContainerId(), this.getCache());
        this.getRequiredRdl().resolveList(dto.getRequiredRdl(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.setSourceEngineeringModelSetupIid(dto.getSourceEngineeringModelSetupIid());
        this.setStudyPhase(dto.getStudyPhase());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link EngineeringModelSetup}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.EngineeringModelSetup dto = new cdp4common.dto.EngineeringModelSetup(this.getIid(), this.getRevisionNumber());

        dto.getActiveDomain().add(this.getActiveDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setEngineeringModelIid(this.getEngineeringModelIid());
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getIterationSetup().add(this.getIterationSetup().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setKind(this.getKind());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getParticipant().add(this.getParticipant().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getRequiredRdl().add(this.getRequiredRdl().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.setSourceEngineeringModelSetupIid(this.getSourceEngineeringModelSetupIid());
        dto.setStudyPhase(this.getStudyPhase());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
