/* --------------------------------------------------------------------------------------------------------------------
 * AbstractExternalIdentifierMap.java
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
 * representation of a mapping that relates E-TM-10-25 instance UUIDs to identifiers of corresponding items in an external tool / model
 * Note: The purpose of such a correspondence mapping is to provide the data to reduce as much as possible the loss of information when performing round trip import / export data transfer between an E-TM-10-25 compliant model and a model in the format of an external tool.
 */
@Container(clazz = Iteration.class, propertyName = "externalIdentifierMap")
public abstract class AbstractExternalIdentifierMap extends AbstractThing implements NamedThing, OwnedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_N_E;

    /**
     * Initializes a new instance of the <code>ExternalIdentifierMap<code/> class.
     *
     * @see ExternalIdentifierMap
     */
    public AbstractExternalIdentifierMap() {
        this.correspondence = new ContainerList<IdCorrespondence>(this);
    }

    /**
     * Initializes a new instance of the <code>ExternalIdentifierMap<code/> class.
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
     * @see ExternalIdentifierMap
     */
    public AbstractExternalIdentifierMap(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.correspondence = new ContainerList<IdCorrespondence>(this);
    }

    /**
     * List of contained IdCorrespondence.
     * set of internal Uuid to external identifier correspondence mappings
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<IdCorrespondence> correspondence;

    /**
     * Property externalFormat.
     * optional reference to a ReferenceSource that specifies the format of the external model
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ReferenceSource externalFormat;

    /**
     * Property externalModelName.
     * name of the external model
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String externalModelName;

    /**
     * Property externalToolName.
     * name of the external tool
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String externalToolName;

    /**
     * Property externalToolVersion.
     * optional representation of the version of the external tool
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String externalToolVersion;

    /**
     * Property name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String name;

    /**
     * Property owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DomainOfExpertise owner;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>ExternalIdentifierMap<code/>.
     *
     * @see Iterable
     * @see ExternalIdentifierMap
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of contained IdCorrespondence.
     * set of internal Uuid to external identifier correspondence mappings
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<IdCorrespondence> getCorrespondence(){
         return this.correspondence;
    }

    /**
     * Gets the externalFormat.
     * optional reference to a ReferenceSource that specifies the format of the external model
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ReferenceSource getExternalFormat(){
         return this.externalFormat;
    }

    /**
     * Gets the externalModelName.
     * name of the external model
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getExternalModelName(){
         return this.externalModelName;
    }

    /**
     * Gets the externalToolName.
     * name of the external tool
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getExternalToolName(){
         return this.externalToolName;
    }

    /**
     * Gets the externalToolVersion.
     * optional representation of the version of the external tool
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getExternalToolVersion(){
         return this.externalToolVersion;
    }

    /**
     * Gets the name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getName(){
         return this.name;
    }

    /**
     * Gets the owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public DomainOfExpertise getOwner(){
         return this.owner;
    }

    /**
     * Sets a list of contained IdCorrespondence.
     * set of internal Uuid to external identifier correspondence mappings
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setCorrespondence(ContainerList<IdCorrespondence> correspondence){
        this.correspondence = correspondence;
    }

    /**
     * Sets the externalFormat.
     * optional reference to a ReferenceSource that specifies the format of the external model
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setExternalFormat(ReferenceSource externalFormat){
        this.externalFormat = externalFormat;
    }

    /**
     * Sets the externalModelName.
     * name of the external model
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setExternalModelName(String externalModelName){
        this.externalModelName = externalModelName;
    }

    /**
     * Sets the externalToolName.
     * name of the external tool
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setExternalToolName(String externalToolName){
        this.externalToolName = externalToolName;
    }

    /**
     * Sets the externalToolVersion.
     * optional representation of the version of the external tool
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setExternalToolVersion(String externalToolVersion){
        this.externalToolVersion = externalToolVersion;
    }

    /**
     * Sets the name.
     * human readable character string in English by which something can be       referred       to
     * Note: The implied LanguageCode of <i>name</i> is "en-GB".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setName(String name){
        this.name = name;
    }

    /**
     * Sets the owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setOwner(DomainOfExpertise owner){
        this.owner = owner;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>ExternalIdentifierMap<code/>.
     *
     * @see Iterable
     * @see ExternalIdentifierMap
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.correspondence);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>ExternalIdentifierMap<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ExternalIdentifierMap<code/>.
     *
     * @see ExternalIdentifierMap
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ExternalIdentifierMap clone = (ExternalIdentifierMap)this.clone();
        clone.setCorrespondence(cloneContainedThings ? new ContainerList<IdCorrespondence>(clone) : new ContainerList<IdCorrespondence>(this.correspondence, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));

        if (cloneContainedThings) {
            clone.getCorrespondence().addAll(this.correspondence.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>ExternalIdentifierMap<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ExternalIdentifierMap<code/>.
     * 
     * @see ExternalIdentifierMap
     */
    @Override
    public ExternalIdentifierMap clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ExternalIdentifierMap)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ExternalIdentifierMap<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ExternalIdentifierMap
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.externalModelName.trim().isEmpty()) {
            errorList.add("The property externalModelName is null or empty.");
        }

        if (this.externalToolName.trim().isEmpty()) {
            errorList.add("The property externalToolName is null or empty.");
        }

        if (this.name.trim().isEmpty()) {
            errorList.add("The property name is null or empty.");
        }

        if (this.owner == null || this.owner.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property owner is null.");
            this.owner = SentinelThingProvider.getSentinel<DomainOfExpertise>();
            this.sentinelResetMap["owner"] = () -> this.owner = null;
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ExternalIdentifierMap<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ExternalIdentifierMap
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ExternalIdentifierMap dto = (cdp4common.dto.ExternalIdentifierMap)dtoThing;

        this.correspondence.resolveList(dto.getCorrespondence(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.externalFormat = (dto.getExternalFormat() != null) ? this.cache.get<ReferenceSource>(dto.getExternalFormat.getValue(), dto.getIterationContainerId()) : null;
        this.externalModelName = dto.getExternalModelName();
        this.externalToolName = dto.getExternalToolName();
        this.externalToolVersion = dto.getExternalToolVersion();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.owner = this.cache.get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>();
        this.revisionNumber = dto.getRevisionNumber();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ExternalIdentifierMap<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ExternalIdentifierMap
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ExternalIdentifierMap dto = new cdp4common.dto.ExternalIdentifierMap(this.iid, this.revisionNumber);

        dto.getCorrespondence().add(this.correspondence.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setExternalFormat(this.externalFormat != null ? (UUID)this.externalFormat.getIid() : null);
        dto.setExternalModelName(this.externalModelName);
        dto.setExternalToolName(this.externalToolName);
        dto.setExternalToolVersion(this.externalToolVersion);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.setOwner(this.owner != null ? this.owner.getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.revisionNumber);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
