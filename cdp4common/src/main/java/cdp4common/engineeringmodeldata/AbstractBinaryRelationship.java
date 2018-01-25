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

/**
 * representation of a relationship between exactly two Things
 * Note: This allows very generic relationships to be defined between any two Things. In order to make its use controlled and meaningful the semantics of the relationship should be defined by making the BinaryRelationship a member of a Category and defining an applicable BinaryRelationshipRule.
 */
@Container(clazz = Iteration.class, propertyName = "relationship")
public abstract class AbstractBinaryRelationship extends AbstractRelationship  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>BinaryRelationship<code/> class.
     *
     * @see BinaryRelationship
     */
    public AbstractBinaryRelationship() {
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
    public AbstractBinaryRelationship(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
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
        clone.setCategory(new List<Category>(this.category));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setParameterValue(cloneContainedThings ? new ContainerList<RelationshipParameterValue>(clone) : new ContainerList<RelationshipParameterValue>(this.parameterValue, clone));

        if (cloneContainedThings) {
            clone.getParameterValue().addAll(this.parameterValue.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
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

        if (this.source == null || this.source.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property source is null.");
            this.source = SentinelThingProvider.getSentinel<Thing>();
            this.sentinelResetMap["source"] = () -> this.source = null;
        }

        if (this.target == null || this.target.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property target is null.");
            this.target = SentinelThingProvider.getSentinel<Thing>();
            this.sentinelResetMap["target"] = () -> this.target = null;
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

        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.modifiedOn = dto.getModifiedOn();
        this.owner = this.cache.get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>();
        this.parameterValue.resolveList(dto.getParameterValue(), dto.getIterationContainerId(), this.cache);
        this.revisionNumber = dto.getRevisionNumber();
        this.source = this.cache.get<Thing>(dto.getSource(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Thing>();
        this.target = this.cache.get<Thing>(dto.getTarget(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Thing>();

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
        cdp4common.dto.BinaryRelationship dto = new cdp4common.dto.BinaryRelationship(this.iid, this.revisionNumber);

        dto.getCategory().add(this.category.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setModifiedOn(this.modifiedOn);
        dto.setOwner(this.owner != null ? this.owner.getIid() : new UUID(0L, 0L));
        dto.getParameterValue().add(this.parameterValue.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.revisionNumber);
        dto.setSource(this.source != null ? this.source.getIid() : new UUID(0L, 0L));
        dto.setTarget(this.target != null ? this.target.getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
