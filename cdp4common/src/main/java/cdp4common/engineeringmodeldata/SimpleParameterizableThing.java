/* --------------------------------------------------------------------------------------------------------------------
 * AbstractSimpleParameterizableThing.java
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
 * representation of a Thing that can be characterized by one or more parameters with values
 * Note: In this data model a distinction is made between ElementDefinitions, ElementUsages and NestedElements that are characterized by Parameters with ParameterValueSets using an elaborate structure to support a multi-disciplinary concurrent engineering process, and other concepts that may be characterized by a ParameterType and a SimpleParameterValue. The latter are ParameterizableThings.
 * Example: An example of a SimpleParameterizableThing is a Requirement.
 */
@ToString
@EqualsAndHashCode
public  abstract class SimpleParameterizableThing extends DefinedThing implements OwnedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the <code>SimpleParameterizableThing<code/> class.
     *
     * @see SimpleParameterizableThing
     */
    protected SimpleParameterizableThing() {
        this.parameterValue = new ContainerList<SimpleParameterValue>(this);
    }

    /**
     * Initializes a new instance of the <code>SimpleParameterizableThing<code/> class.
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
     * @see SimpleParameterizableThing
     */
    protected SimpleParameterizableThing(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.parameterValue = new ContainerList<SimpleParameterValue>(this);
    }

    /**
     * Property owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DomainOfExpertise owner;

    /**
     * List of contained SimpleParameterValue.
     * collection of parameters with values for this SimpleParameterizableThing
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<SimpleParameterValue> parameterValue;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>SimpleParameterizableThing<code/>.
     *
     * @see Iterable
     * @see SimpleParameterizableThing
     */
    public Iterable<Iterable> containerLists;

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
     * Gets a list of contained SimpleParameterValue.
     * collection of parameters with values for this SimpleParameterizableThing
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<SimpleParameterValue> getParameterValue(){
         return this.parameterValue;
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
     * Sets a list of contained SimpleParameterValue.
     * collection of parameters with values for this SimpleParameterizableThing
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setParameterValue(ContainerList<SimpleParameterValue> parameterValue){
        this.parameterValue = parameterValue;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>SimpleParameterizableThing<code/>.
     *
     * @see Iterable
     * @see SimpleParameterizableThing
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.parameterValue);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>SimpleParameterizableThing<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>SimpleParameterizableThing<code/>.
     * 
     * @see SimpleParameterizableThing
     */
    @Override
    public SimpleParameterizableThing clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SimpleParameterizableThing)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>SimpleParameterizableThing<code/>.
     *
     * @return A list of potential errors.
     *
     * @see SimpleParameterizableThing
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getOwner() == null || this.getOwner().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property owner is null.");
            this.setOwner(SentinelThingProvider.getSentinel<DomainOfExpertise>());
            this.sentinelResetMap["owner"] = () -> this.setOwner(null);
        }

        return errorList;
    }
}
