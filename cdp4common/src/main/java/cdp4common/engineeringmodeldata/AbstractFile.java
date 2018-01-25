/* --------------------------------------------------------------------------------------------------------------------
 * AbstractFile.java
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
 * representation of a computer file
 * Note: A File instance only holds the identification of a File, its owner and an optional lockedBy property. All other properties are held inside a FileRevision.
 */
@Container(clazz = FileStore.class, propertyName = "file")
public abstract class AbstractFile extends AbstractThing implements CategorizableThing, OwnedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_N_E;

    /**
     * Initializes a new instance of the <code>File<code/> class.
     *
     * @see File
     */
    public AbstractFile() {
        this.category = new List<Category>();
        this.fileRevision = new ContainerList<FileRevision>(this);
    }

    /**
     * Initializes a new instance of the <code>File<code/> class.
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
     * @see File
     */
    public AbstractFile(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.category = new List<Category>();
        this.fileRevision = new ContainerList<FileRevision>(this);
    }

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<Category> category;

    /**
     * List of contained FileRevision.
     * collection of revisions for this File
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<FileRevision> fileRevision;

    /**
     * Property lockedBy.
     * reference to a Person that has locked this File for write / modify access
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Person lockedBy;

    /**
     * Property owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DomainOfExpertise owner;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>File<code/>.
     *
     * @see Iterable
     * @see File
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
     * Gets a list of contained FileRevision.
     * collection of revisions for this File
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<FileRevision> getFileRevision(){
         return this.fileRevision;
    }

    /**
     * Gets the lockedBy.
     * reference to a Person that has locked this File for write / modify access
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Person getLockedBy(){
         return this.lockedBy;
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
     * Sets a list of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setCategory(List<Category> category){
        this.category = category;
    }

    /**
     * Sets a list of contained FileRevision.
     * collection of revisions for this File
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setFileRevision(ContainerList<FileRevision> fileRevision){
        this.fileRevision = fileRevision;
    }

    /**
     * Sets the lockedBy.
     * reference to a Person that has locked this File for write / modify access
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setLockedBy(Person lockedBy){
        this.lockedBy = lockedBy;
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
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>File<code/>.
     *
     * @see Iterable
     * @see File
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.fileRevision);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>File<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>File<code/>.
     *
     * @see File
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        File clone = (File)this.clone();
        clone.setCategory(new List<Category>(this.category));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setFileRevision(cloneContainedThings ? new ContainerList<FileRevision>(clone) : new ContainerList<FileRevision>(this.fileRevision, clone));

        if (cloneContainedThings) {
            clone.getFileRevision().addAll(this.fileRevision.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>File<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>File<code/>.
     * 
     * @see File
     */
    @Override
    public File clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (File)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>File<code/>.
     *
     * @return A list of potential errors.
     *
     * @see File
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int fileRevisionCount = this.fileRevision.size();
        if (fileRevisionCount < 1) {
            errorList.add("The number of elements in the property fileRevision is wrong. It should be at least 1.");
        }

        if (this.owner == null || this.owner.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property owner is null.");
            this.owner = SentinelThingProvider.getSentinel<DomainOfExpertise>();
            this.sentinelResetMap["owner"] = () -> this.owner = null;
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>File<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see File
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.File dto = (cdp4common.dto.File)dtoThing;

        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.fileRevision.resolveList(dto.getFileRevision(), dto.getIterationContainerId(), this.cache);
        this.lockedBy = (dto.getLockedBy() != null) ? this.cache.get<Person>(dto.getLockedBy.getValue(), dto.getIterationContainerId()) : null;
        this.modifiedOn = dto.getModifiedOn();
        this.owner = this.cache.get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>();
        this.revisionNumber = dto.getRevisionNumber();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>File<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see File
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.File dto = new cdp4common.dto.File(this.iid, this.revisionNumber);

        dto.getCategory().add(this.category.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getFileRevision().add(this.fileRevision.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setLockedBy(this.lockedBy != null ? (UUID)this.lockedBy.getIid() : null);
        dto.setModifiedOn(this.modifiedOn);
        dto.setOwner(this.owner != null ? this.owner.getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.revisionNumber);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
