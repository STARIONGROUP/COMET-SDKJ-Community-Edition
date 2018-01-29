/* --------------------------------------------------------------------------------------------------------------------
 * AbstractBinaryRelationship.java
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
 * representation of a relationship between exactly two Things
 * Note: This allows very generic relationships to be defined between any two Things. In order to make its use controlled and meaningful the semantics of the relationship should be defined by making the BinaryRelationship a member of a Category and defining an applicable BinaryRelationshipRule.
 */
@Container(clazz = Iteration.class, propertyName = "relationship")
@ToString
@EqualsAndHashCode
public  class BinaryRelationship extends Relationship  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the <code>BinaryRelationship<code/> class.
     *
     * @see BinaryRelationship
     */
    public BinaryRelationship() {
    }

    /**
     * Initializes a new instance of the <code>BinaryRelationship<code/> class.
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
     * @see BinaryRelationship
     */
    public BinaryRelationship(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property source.
     * reference to the source Thing of this BinaryRelationship
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Thing source;

    /**
     * Property target.
     * reference to the target Thing of this BinaryRelationship
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Thing target;

    /**
     * Gets the source.
     * reference to the source Thing of this BinaryRelationship
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Thing getSource(){
         return this.source;
    }

    /**
     * Gets the target.
     * reference to the target Thing of this BinaryRelationship
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Thing getTarget(){
         return this.target;
    }

    /**
     * Sets the source.
     * reference to the source Thing of this BinaryRelationship
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setSource(Thing source){
        this.source = source;
    }

    /**
     * Sets the target.
     * reference to the target Thing of this BinaryRelationship
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setTarget(Thing target){
        this.target = target;
    }

    /**
     * Creates and returns a copy of this <code>BinaryRelationship<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>BinaryRelationship<code/>.
     *
     * @see BinaryRelationship
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        BinaryRelationship clone = (BinaryRelationship)this.clone();
        clone.setCategory(new List<Category>(this.getCategory()));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setParameterValue(cloneContainedThings ? new ContainerList<RelationshipParameterValue>(clone) : new ContainerList<RelationshipParameterValue>(this.getParameterValue(), clone));

        if (cloneContainedThings) {
            clone.getParameterValue().addAll(this.getParameterValue().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>BinaryRelationship<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>BinaryRelationship<code/>.
     * 
     * @see BinaryRelationship
     */
    @Override
    public BinaryRelationship clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (BinaryRelationship)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>BinaryRelationship<code/>.
     *
     * @return A list of potential errors.
     *
     * @see BinaryRelationship
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getSource() == null || this.getSource().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property source is null.");
            this.setSource(SentinelThingProvider.getSentinel<Thing>());
            this.sentinelResetMap["source"] = () -> this.setSource(null);
        }

        if (this.getTarget() == null || this.getTarget().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property target is null.");
            this.setTarget(SentinelThingProvider.getSentinel<Thing>());
            this.sentinelResetMap["target"] = () -> this.setTarget(null);
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>BinaryRelationship<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see BinaryRelationship
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.BinaryRelationship dto = (cdp4common.dto.BinaryRelationship)dtoThing;

        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.getCache());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setOwner(this.cache.get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>());
        this.parameterValue.resolveList(dto.getParameterValue(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setSource(this.cache.get<Thing>(dto.getSource(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Thing>());
        this.setTarget(this.cache.get<Thing>(dto.getTarget(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Thing>());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>BinaryRelationship<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see BinaryRelationship
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.BinaryRelationship dto = new cdp4common.dto.BinaryRelationship(this.getIid(), this.getRevisionNumber());

        dto.getCategory().add(this.getCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.getParameterValue().add(this.getParameterValue().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setSource(this.getSource() != null ? this.getSource().getIid() : new UUID(0L, 0L));
        dto.setTarget(this.getTarget() != null ? this.getTarget().getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
