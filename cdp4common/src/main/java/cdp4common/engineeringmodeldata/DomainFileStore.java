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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * domain specific FileStore for use by single DomainOfExpertise
 */
@Container(clazz = Iteration.class, propertyName = "domainFileStore")
@ToString
@EqualsAndHashCode
public  class DomainFileStore extends FileStore  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NONE;

    /**
     * Initializes a new instance of the <code>DomainFileStore<code/> class.
     *
     * @see DomainFileStore
     */
    public DomainFileStore() {
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
    public DomainFileStore(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
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
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setFile(cloneContainedThings ? new ContainerList<File>(clone) : new ContainerList<File>(this.getFile(), clone));
        clone.setFolder(cloneContainedThings ? new ContainerList<Folder>(clone) : new ContainerList<Folder>(this.getFolder(), clone));

        if (cloneContainedThings) {
            clone.getFile().addAll(this.getFile().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getFolder().addAll(this.getFolder().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
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

        this.setCreatedOn(dto.getCreatedOn());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.file.resolveList(dto.getFile(), dto.getIterationContainerId(), this.getCache());
        this.folder.resolveList(dto.getFolder(), dto.getIterationContainerId(), this.getCache());
        this.setIsHidden(dto.getIsHidden());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setOwner(this.cache.get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>());
        this.setRevisionNumber(dto.getRevisionNumber());

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
        cdp4common.dto.DomainFileStore dto = new cdp4common.dto.DomainFileStore(this.getIid(), this.getRevisionNumber());

        dto.setCreatedOn(this.getCreatedOn());
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getFile().add(this.getFile().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getFolder().add(this.getFolder().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setIsHidden(this.getIsHidden());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
