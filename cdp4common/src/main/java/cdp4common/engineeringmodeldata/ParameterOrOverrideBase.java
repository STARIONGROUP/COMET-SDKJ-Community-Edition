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
import org.ehcache.Cache;
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
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the {@link ParameterOrOverrideBase} class.
     */
    protected ParameterOrOverrideBase() {
        this.parameterSubscription = new ContainerList<ParameterSubscription>(this);
    }

    /**
     * Initializes a new instance of the {@link ParameterOrOverrideBase} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected ParameterOrOverrideBase(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.parameterSubscription = new ContainerList<ParameterSubscription>(this);
    }

    /**
     * List of contained ParameterSubscription.
     * zero or more ParameterSubscriptions that other domains than the owner DomainOfExpertise of this Parameter or ParameterOverride have subscribed to
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ParameterSubscription> parameterSubscription;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link ParameterOrOverrideBase}.
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
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link ParameterOrOverrideBase}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
        containers.add(this.parameterSubscription);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link ParameterOrOverrideBase} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterOrOverrideBase}.
     */
    @Override
    public ParameterOrOverrideBase clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterOrOverrideBase)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ParameterOrOverrideBase}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }
}
