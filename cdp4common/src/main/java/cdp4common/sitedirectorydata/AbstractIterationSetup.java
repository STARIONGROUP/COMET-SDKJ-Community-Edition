/* --------------------------------------------------------------------------------------------------------------------
 * AbstractIterationSetup.java
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

/**
 * representation of the set-up information of an Iteration in the EngineeringModel associated with the EngineeringModelSetup that contains this IterationInfo
 * Note 1: An iteration is a version of the associated EngineeringModel that was considered as one complete and coherent step in the development of the EngineeringModel in a concurrent engineering activity. The detailed definition and understanding of the meaning of a "complete and coherent" step depends on the organization and activity that develops the EngineeringModel.
 * Note 2: In a concurrent engineering activity the engineering model for the system-of-interest is developed in a number of iterations, where in each iteration the problem specification in the form of the RequirementsSpecification and a design solution in the form of the Options and ElementDefinitions are elaborated and refined. With an iteration the engineering team strives to set one more step in the direction of achieving a converged definition that fulfills the objectives of their activity.
 */
@Container(clazz = EngineeringModelSetup.class, propertyName = "iterationSetup")
public abstract class AbstractIterationSetup extends AbstractThing implements ParticipantAffectedAccessThing, TimeStampedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_N_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Initializes a new instance of the <code>IterationSetup<code/> class.
     *
     * @see IterationSetup
     */
    public AbstractIterationSetup() {
    }

    /**
     * Initializes a new instance of the <code>IterationSetup<code/> class.
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
     * @see IterationSetup
     */
    public AbstractIterationSetup(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private LocalDateTime createdOn;

    /**
     * Property description.
     * human readable description of the Iteration
     * Note: The description should contain information that permits users to quickly select an Iteration that they are searching for.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String description;

    /**
     * Property frozenOn.
     * optional definition of the date and time when this Iteration was frozen, i.e. saved with the intention not to be modified thereafter
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    private LocalDateTime frozenOn;

    /**
     * Value indicating whether isDeleted.
     * assertion whether the contents of this iteration have been deleted
     * Note: Deleting the contents of an iteration means removing the Iteration (with <i>iid</i> equal to <i>iterationIid</i>) and all the objects it contains from the persistent data store. This is useful in order to support clean up of obsolete iterations. Of course by deleting all content data that capture the state of the EngineeringModel at the end of the affected Iteration will be lost, only the descriptive data in IterationSetup remains.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isDeleted;

    /**
     * Property iterationIid.
     * definition of the unique instance identifier of the Iteration in an EngineeringModel to which this IterationSetup pertains
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private UUID iterationIid;

    /**
     * Property iterationNumber.
     * number of the Iteration
     * Note: In an implementation the number shall be assigned by the server. The first IterationSetup / Iteration that is created for an EngineeringModelSetup / EngineeringModel shall be 1. Any subsequent IterationSetup / Iteration shall be assigned the next number in the creation sequence.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private int iterationNumber;

    /**
     * Property sourceIterationSetup.
     * Note 1: For the initial InterationSetup and Interation of an EngineeringModel, i.e. the first Iteration version, <i>sourceIterationSetup</i> is set to <i>null</i>, which means there was no source.
     * Note 2: The <i>sourceIterationSetup</i> must be kept in sync with the <i>sourceIteration</i> property of EngineeringModel.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private IterationSetup sourceIterationSetup;

    /**
     * Gets the createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public LocalDateTime getCreatedOn(){
         return this.createdOn;
    }

    /**
     * Gets the description.
     * human readable description of the Iteration
     * Note: The description should contain information that permits users to quickly select an Iteration that they are searching for.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getDescription(){
         return this.description;
    }

    /**
     * Gets the frozenOn.
     * optional definition of the date and time when this Iteration was frozen, i.e. saved with the intention not to be modified thereafter
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    public LocalDateTime getFrozenOn(){
         return this.frozenOn;
    }

    /**
     * Gets a value indicating whether isDeleted.
     * assertion whether the contents of this iteration have been deleted
     * Note: Deleting the contents of an iteration means removing the Iteration (with <i>iid</i> equal to <i>iterationIid</i>) and all the objects it contains from the persistent data store. This is useful in order to support clean up of obsolete iterations. Of course by deleting all content data that capture the state of the EngineeringModel at the end of the affected Iteration will be lost, only the descriptive data in IterationSetup remains.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getDeleted(){
         return this.isDeleted;
    }

    /**
     * Gets the iterationIid.
     * definition of the unique instance identifier of the Iteration in an EngineeringModel to which this IterationSetup pertains
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public UUID getIterationIid(){
         return this.iterationIid;
    }

    /**
     * Gets the iterationNumber.
     * number of the Iteration
     * Note: In an implementation the number shall be assigned by the server. The first IterationSetup / Iteration that is created for an EngineeringModelSetup / EngineeringModel shall be 1. Any subsequent IterationSetup / Iteration shall be assigned the next number in the creation sequence.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public int getIterationNumber(){
         return this.iterationNumber;
    }

    /**
     * Gets the sourceIterationSetup.
     * Note 1: For the initial InterationSetup and Interation of an EngineeringModel, i.e. the first Iteration version, <i>sourceIterationSetup</i> is set to <i>null</i>, which means there was no source.
     * Note 2: The <i>sourceIterationSetup</i> must be kept in sync with the <i>sourceIteration</i> property of EngineeringModel.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public IterationSetup getSourceIterationSetup(){
         return this.sourceIterationSetup;
    }

    /**
     * Sets the createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setCreatedOn(LocalDateTime createdOn){
        this.createdOn = createdOn;
    }

    /**
     * Sets the description.
     * human readable description of the Iteration
     * Note: The description should contain information that permits users to quickly select an Iteration that they are searching for.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDescription(String description){
        this.description = description;
    }

    /**
     * Sets the frozenOn.
     * optional definition of the date and time when this Iteration was frozen, i.e. saved with the intention not to be modified thereafter
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
     public void setFrozenOn(LocalDateTime frozenOn){
        this.frozenOn = frozenOn;
    }

    /**
     *Sets a value indicating whether isDeleted.
     * assertion whether the contents of this iteration have been deleted
     * Note: Deleting the contents of an iteration means removing the Iteration (with <i>iid</i> equal to <i>iterationIid</i>) and all the objects it contains from the persistent data store. This is useful in order to support clean up of obsolete iterations. Of course by deleting all content data that capture the state of the EngineeringModel at the end of the affected Iteration will be lost, only the descriptive data in IterationSetup remains.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDeleted(boolean isDeleted){
        this.isDeleted = isDeleted;
    }

    /**
     * Sets the iterationIid.
     * definition of the unique instance identifier of the Iteration in an EngineeringModel to which this IterationSetup pertains
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setIterationIid(UUID iterationIid){
        this.iterationIid = iterationIid;
    }

    /**
     * Sets the iterationNumber.
     * number of the Iteration
     * Note: In an implementation the number shall be assigned by the server. The first IterationSetup / Iteration that is created for an EngineeringModelSetup / EngineeringModel shall be 1. Any subsequent IterationSetup / Iteration shall be assigned the next number in the creation sequence.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setIterationNumber(int iterationNumber){
        this.iterationNumber = iterationNumber;
    }

    /**
     * Sets the sourceIterationSetup.
     * Note 1: For the initial InterationSetup and Interation of an EngineeringModel, i.e. the first Iteration version, <i>sourceIterationSetup</i> is set to <i>null</i>, which means there was no source.
     * Note 2: The <i>sourceIterationSetup</i> must be kept in sync with the <i>sourceIteration</i> property of EngineeringModel.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setSourceIterationSetup(IterationSetup sourceIterationSetup){
        this.sourceIterationSetup = sourceIterationSetup;
    }

    /**
     * Creates and returns a copy of this <code>IterationSetup<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>IterationSetup<code/>.
     *
     * @see IterationSetup
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        IterationSetup clone = (IterationSetup)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>IterationSetup<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>IterationSetup<code/>.
     * 
     * @see IterationSetup
     */
    @Override
    public IterationSetup clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (IterationSetup)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>IterationSetup<code/>.
     *
     * @return A list of potential errors.
     *
     * @see IterationSetup
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.description.trim().isEmpty()) {
            errorList.add("The property description is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>IterationSetup<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see IterationSetup
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.IterationSetup dto = (cdp4common.dto.IterationSetup)dtoThing;

        this.createdOn = dto.getCreatedOn();
        this.description = dto.getDescription();
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.frozenOn = dto.getFrozenOn();
        this.isDeleted = dto.getIsDeleted();
        this.iterationIid = dto.getIterationIid();
        this.iterationNumber = dto.getIterationNumber();
        this.modifiedOn = dto.getModifiedOn();
        this.revisionNumber = dto.getRevisionNumber();
        this.sourceIterationSetup = (dto.getSourceIterationSetup() != null) ? this.cache.get<IterationSetup>(dto.getSourceIterationSetup.getValue(), dto.getIterationContainerId()) : null;

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>IterationSetup<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see IterationSetup
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.IterationSetup dto = new cdp4common.dto.IterationSetup(this.iid, this.revisionNumber);

        dto.setCreatedOn(this.createdOn);
        dto.setDescription(this.description);
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setFrozenOn(this.frozenOn);
        dto.setIsDeleted(this.isDeleted);
        dto.setIterationIid(this.iterationIid);
        dto.setIterationNumber(this.iterationNumber);
        dto.setModifiedOn(this.modifiedOn);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setSourceIterationSetup(this.sourceIterationSetup != null ? (UUID)this.sourceIterationSetup.getIid() : null);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
