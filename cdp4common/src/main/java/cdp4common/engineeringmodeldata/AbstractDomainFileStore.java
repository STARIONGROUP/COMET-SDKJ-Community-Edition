/* --------------------------------------------------------------------------------------------------------------------
 * AbstractDomainFileStore.java
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
 * domain specific FileStore for use by single DomainOfExpertise
 */
@Container(clazz = Iteration.class, propertyName = "domainFileStore")
public abstract class AbstractDomainFileStore extends AbstractFileStore  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_N_E;

    /**
     * Initializes a new instance of the <code>DomainFileStore<code/> class.
     *
     * @see DomainFileStore
     */
    public AbstractDomainFileStore() {
    }

    /**
     * Initializes a new instance of the <code>DomainFileStore<code/> class.
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
     * @see DomainFileStore
     */
    public AbstractDomainFileStore(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Value indicating whether isHidden.
     * assertion whether the FileStore is hidden or not
     * Note: Hidden means that the FileStore is only visible to the DomainOfExpertise
     * that owns the FileStore and not to any other domain.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isHidden;

    /**
     * Gets a value indicating whether isHidden.
     * assertion whether the FileStore is hidden or not
     * Note: Hidden means that the FileStore is only visible to the DomainOfExpertise
     * that owns the FileStore and not to any other domain.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getHidden(){
         return this.isHidden;
    }

    /**
     *Sets a value indicating whether isHidden.
     * assertion whether the FileStore is hidden or not
     * Note: Hidden means that the FileStore is only visible to the DomainOfExpertise
     * that owns the FileStore and not to any other domain.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setHidden(boolean isHidden){
        this.isHidden = isHidden;
    }

    /**
     * Creates and returns a copy of this <code>DomainFileStore<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DomainFileStore<code/>.
     *
     * @see DomainFileStore
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        DomainFileStore clone = (DomainFileStore)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setFile(cloneContainedThings ? new ContainerList<File>(clone) : new ContainerList<File>(this.file, clone));
        clone.setFolder(cloneContainedThings ? new ContainerList<Folder>(clone) : new ContainerList<Folder>(this.folder, clone));

        if (cloneContainedThings) {
            clone.getFile().addAll(this.file.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getFolder().addAll(this.folder.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>DomainFileStore<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DomainFileStore<code/>.
     * 
     * @see DomainFileStore
     */
    @Override
    public DomainFileStore clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DomainFileStore)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>DomainFileStore<code/>.
     *
     * @return A list of potential errors.
     *
     * @see DomainFileStore
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>DomainFileStore<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see DomainFileStore
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.DomainFileStore dto = (cdp4common.dto.DomainFileStore)dtoThing;

        this.createdOn = dto.getCreatedOn();
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.file.resolveList(dto.getFile(), dto.getIterationContainerId(), this.cache);
        this.folder.resolveList(dto.getFolder(), dto.getIterationContainerId(), this.cache);
        this.isHidden = dto.getIsHidden();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.owner = this.cache.get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>();
        this.revisionNumber = dto.getRevisionNumber();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>DomainFileStore<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see DomainFileStore
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.DomainFileStore dto = new cdp4common.dto.DomainFileStore(this.iid, this.revisionNumber);

        dto.setCreatedOn(this.createdOn);
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getFile().add(this.file.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getFolder().add(this.folder.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsHidden(this.isHidden);
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
