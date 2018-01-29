/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParameterOrOverrideBase.java
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
 * abstract superclass to provide a common reference to Parameter and ParameterOverride
 */
@ToString
@EqualsAndHashCode
public  abstract class ParameterOrOverrideBase extends ParameterBase  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the <code>ParameterOrOverrideBase<code/> class.
     *
     * @see ParameterOrOverrideBase
     */
    protected ParameterOrOverrideBase() {
        this.parameterSubscription = new ContainerList<ParameterSubscription>(this);
    }

    /**
     * Initializes a new instance of the <code>ParameterOrOverrideBase<code/> class.
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
     * @see ParameterOrOverrideBase
     */
    protected ParameterOrOverrideBase(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.parameterSubscription = new ContainerList<ParameterSubscription>(this);
    }

    /**
     * List of contained ParameterSubscription.
     * zero or more ParameterSubscriptions that other domains than the owner DomainOfExpertise of this Parameter or ParameterOverride have subscribed to
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ParameterSubscription> parameterSubscription;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>ParameterOrOverrideBase<code/>.
     *
     * @see Iterable
     * @see ParameterOrOverrideBase
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of contained ParameterSubscription.
     * zero or more ParameterSubscriptions that other domains than the owner DomainOfExpertise of this Parameter or ParameterOverride have subscribed to
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ParameterSubscription> getParameterSubscription(){
         return this.parameterSubscription;
    }

    /**
     * Sets a list of contained ParameterSubscription.
     * zero or more ParameterSubscriptions that other domains than the owner DomainOfExpertise of this Parameter or ParameterOverride have subscribed to
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setParameterSubscription(ContainerList<ParameterSubscription> parameterSubscription){
        this.parameterSubscription = parameterSubscription;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>ParameterOrOverrideBase<code/>.
     *
     * @see Iterable
     * @see ParameterOrOverrideBase
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.parameterSubscription);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>ParameterOrOverrideBase<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParameterOrOverrideBase<code/>.
     * 
     * @see ParameterOrOverrideBase
     */
    @Override
    public ParameterOrOverrideBase clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterOrOverrideBase)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ParameterOrOverrideBase<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ParameterOrOverrideBase
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }
}
