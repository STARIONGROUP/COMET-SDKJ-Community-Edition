/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParticipant.java
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
 * representation of a participant in the team working in a concurrent engineering activity on an EngineeringModel
 */
@Container(clazz = EngineeringModelSetup.class, propertyName = "participant")
@ToString
@EqualsAndHashCode
public  class Participant extends Thing implements ParticipantAffectedAccessThing {
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
     * Initializes a new instance of the {@link Participant} class.
     */
    public Participant() {
        this.domain = new ArrayList<DomainOfExpertise>();
    }

    /**
     * Initializes a new instance of the {@link Participant} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public Participant(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.domain = new ArrayList<DomainOfExpertise>();
    }

    /**
     * List of DomainOfExpertise.
     * references to the domains of expertise (set of DomainOfExpertise) that this Participant may represent
     * Note: At any moment in a session in an E-TM-10-25 compliant environment a Participant is actively representing one DomainOfExpertise only, see the <i>selectedDomain</i> property. If more than one DomainOfExpertise is specified, he or she may select any of those DomainOfExpertises to switch to, at any time during the session.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<DomainOfExpertise> domain;

    /**
     * Value indicating whether isActive.
     * assertion whether this Participant is active in the current
     * EngineeringModel
     * Note: This allows to set Participants that already started as member of a
     * concurrent engineering team in an inactive role. Once created a
     * Participant cannot be deleted without precautions because this may render
     * earlier created data incomplete.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isActive;

    /**
     * Property person.
     * reference to the Person that is this Participant
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Person person;

    /**
     * Property role.
     * reference to the ParticipantRole assigned to this Participant
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ParticipantRole role;

    /**
     * Property selectedDomain.
     * active DomainOfExpertise selected by this Participant
     * Note: The selectedDomain must be one from the set of DomainOfExpertise specified in the <i>domain</i> property of this Participant.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DomainOfExpertise selectedDomain;

    /**
     * Gets a list of DomainOfExpertise.
     * references to the domains of expertise (set of DomainOfExpertise) that this Participant may represent
     * Note: At any moment in a session in an E-TM-10-25 compliant environment a Participant is actively representing one DomainOfExpertise only, see the <i>selectedDomain</i> property. If more than one DomainOfExpertise is specified, he or she may select any of those DomainOfExpertises to switch to, at any time during the session.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<DomainOfExpertise> getDomain(){
         return this.domain;
    }

    /**
     * Gets a value indicating whether isActive.
     * assertion whether this Participant is active in the current
     * EngineeringModel
     * Note: This allows to set Participants that already started as member of a
     * concurrent engineering team in an inactive role. Once created a
     * Participant cannot be deleted without precautions because this may render
     * earlier created data incomplete.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getActive(){
         return this.isActive;
    }

    /**
     * Gets the person.
     * reference to the Person that is this Participant
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Person getPerson(){
         return this.person;
    }

    /**
     * Gets the role.
     * reference to the ParticipantRole assigned to this Participant
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ParticipantRole getRole(){
         return this.role;
    }

    /**
     * Gets the selectedDomain.
     * active DomainOfExpertise selected by this Participant
     * Note: The selectedDomain must be one from the set of DomainOfExpertise specified in the <i>domain</i> property of this Participant.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public DomainOfExpertise getSelectedDomain(){
         return this.selectedDomain;
    }

    /**
     * Sets a list of DomainOfExpertise.
     * references to the domains of expertise (set of DomainOfExpertise) that this Participant may represent
     * Note: At any moment in a session in an E-TM-10-25 compliant environment a Participant is actively representing one DomainOfExpertise only, see the <i>selectedDomain</i> property. If more than one DomainOfExpertise is specified, he or she may select any of those DomainOfExpertises to switch to, at any time during the session.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDomain(ArrayList<DomainOfExpertise> domain){
        this.domain = domain;
    }

    /**
     *Sets a value indicating whether isActive.
     * assertion whether this Participant is active in the current
     * EngineeringModel
     * Note: This allows to set Participants that already started as member of a
     * concurrent engineering team in an inactive role. Once created a
     * Participant cannot be deleted without precautions because this may render
     * earlier created data incomplete.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setActive(boolean isActive){
        this.isActive = isActive;
    }

    /**
     * Sets the person.
     * reference to the Person that is this Participant
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setPerson(Person person){
        this.person = person;
    }

    /**
     * Sets the role.
     * reference to the ParticipantRole assigned to this Participant
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setRole(ParticipantRole role){
        this.role = role;
    }

    /**
     * Sets the selectedDomain.
     * active DomainOfExpertise selected by this Participant
     * Note: The selectedDomain must be one from the set of DomainOfExpertise specified in the <i>domain</i> property of this Participant.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setSelectedDomain(DomainOfExpertise selectedDomain){
        this.selectedDomain = selectedDomain;
    }

    /**
     * Creates and returns a copy of this {@link Participant} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Participant}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        Participant clone = (Participant)this.clone();
        clone.setDomain(new ArrayList<DomainOfExpertise>(this.getDomain()));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link Participant} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Participant}.
     */
    @Override
    public Participant clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Participant)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>Participant}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int domainCount = this.getDomain().size();
        if (domainCount < 1) {
            errorList.add("The number of elements in the property domain is wrong. It should be at least 1.");
        }

        if (this.getPerson() == null || this.getPerson().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property person is null.");
            this.setPerson(SentinelThingProvider.getSentinel<Person>());
            this.sentinelResetMap.put("person", new ActionImpl(() -> this.setPerson(null)));
        }

        if (this.getRole() == null || this.getRole().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property role is null.");
            this.setRole(SentinelThingProvider.getSentinel<ParticipantRole>());
            this.sentinelResetMap.put("role", new ActionImpl(() -> this.setRole(null)));
        }

        if (this.getSelectedDomain() == null || this.getSelectedDomain().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property selectedDomain is null.");
            this.setSelectedDomain(SentinelThingProvider.getSentinel<DomainOfExpertise>());
            this.sentinelResetMap.put("selectedDomain", new ActionImpl(() -> this.setSelectedDomain(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link Participant} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Participant dto = (cdp4common.dto.Participant)dtoThing;

        this.getDomain().resolveList(dto.getDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setActive(dto.getActive());
        this.setModifiedOn(dto.getModifiedOn());
        this.setPerson(this.getCache().get<Person>(dto.getPerson(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Person>());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setRole(this.getCache().get<ParticipantRole>(dto.getRole(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<ParticipantRole>());
        this.setSelectedDomain(this.getCache().get<DomainOfExpertise>(dto.getSelectedDomain(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link Participant}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Participant dto = new cdp4common.dto.Participant(this.getIid(), this.getRevisionNumber());

        dto.getDomain().add(this.getDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setActive(this.getActive());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setPerson(this.getPerson() != null ? this.getPerson().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setRole(this.getRole() != null ? this.getRole().getIid() : new UUID(0L, 0L));
        dto.setSelectedDomain(this.getSelectedDomain() != null ? this.getSelectedDomain().getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
