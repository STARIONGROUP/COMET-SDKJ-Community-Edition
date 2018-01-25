/* --------------------------------------------------------------------------------------------------------------------
 * AbstractIdCorrespondence.java
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
 * representation of a correspondence mapping between a single Thing (identified through its <i>iid</i>) and an external identifier
 * Note: See also ExternalIdentifierMap.
 */
@Container(clazz = ExternalIdentifierMap.class, propertyName = "correspondence")
public abstract class AbstractIdCorrespondence extends AbstractThing implements OwnedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>IdCorrespondence<code/> class.
     *
     * @see IdCorrespondence
     */
    public AbstractIdCorrespondence() {
    }

    /**
     * Initializes a new instance of the <code>IdCorrespondence<code/> class.
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
     * @see IdCorrespondence
     */
    public AbstractIdCorrespondence(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property externalId.
     * identifier of an item in an external model that corresponds to <i>internalThing</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String externalId;

    /**
     * Property internalThing.
     * weak reference to a Thing inside the current dataset
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private UUID internalThing;

    /**
     * Property owner.
     * reference to a DomainOfExpertise that is the owner of this IdCorrespondence
     * Note: The owner is the same as the owner of the ExternalIdentifierMap that contains this IdCorrespondence.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private DomainOfExpertise owner;
 

    /**
     * Gets the externalId.
     * identifier of an item in an external model that corresponds to <i>internalThing</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getExternalId(){
         return this.externalId;
    }

    /**
     * Gets the internalThing.
     * weak reference to a Thing inside the current dataset
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public UUID getInternalThing(){
         return this.internalThing;
    }

    /**
     * Gets the owner.
     * reference to a DomainOfExpertise that is the owner of this IdCorrespondence
     * Note: The owner is the same as the owner of the ExternalIdentifierMap that contains this IdCorrespondence.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public DomainOfExpertise getOwner(){
        return this.GetDerivedOwner();
    }

    /**
     * Sets the externalId.
     * identifier of an item in an external model that corresponds to <i>internalThing</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setExternalId(String externalId){
        this.externalId = externalId;
    }

    /**
     * Sets the internalThing.
     * weak reference to a Thing inside the current dataset
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setInternalThing(UUID internalThing){
        this.internalThing = internalThing;
    }

    /**
     * Sets the owner.
     * reference to a DomainOfExpertise that is the owner of this IdCorrespondence
     * Note: The owner is the same as the owner of the ExternalIdentifierMap that contains this IdCorrespondence.
     *
     * @throws IllegalStateException The owner property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setOwner(DomainOfExpertise owner){
        throw new IllegalStateException("Forbidden Set value for the derived property IdCorrespondence.owner");
    }

    /**
     * Creates and returns a copy of this <code>IdCorrespondence<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>IdCorrespondence<code/>.
     *
     * @see IdCorrespondence
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        IdCorrespondence clone = (IdCorrespondence)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>IdCorrespondence<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>IdCorrespondence<code/>.
     * 
     * @see IdCorrespondence
     */
    @Override
    public IdCorrespondence clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (IdCorrespondence)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>IdCorrespondence<code/>.
     *
     * @return A list of potential errors.
     *
     * @see IdCorrespondence
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.externalId.trim().isEmpty()) {
            errorList.add("The property externalId is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>IdCorrespondence<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see IdCorrespondence
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.IdCorrespondence dto = (cdp4common.dto.IdCorrespondence)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.externalId = dto.getExternalId();
        this.internalThing = dto.getInternalThing();
        this.modifiedOn = dto.getModifiedOn();
        this.revisionNumber = dto.getRevisionNumber();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>IdCorrespondence<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see IdCorrespondence
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.IdCorrespondence dto = new cdp4common.dto.IdCorrespondence(this.iid, this.revisionNumber);

        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setExternalId(this.externalId);
        dto.setInternalThing(this.internalThing);
        dto.setModifiedOn(this.modifiedOn);
        dto.setRevisionNumber(this.revisionNumber);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
