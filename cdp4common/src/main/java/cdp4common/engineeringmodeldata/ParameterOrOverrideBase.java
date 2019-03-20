/* --------------------------------------------------------------------------------------------------------------------
 * ParameterOrOverrideBase.java
 * Copyright (c) 2019 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.exceptions.ContainmentException;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import org.apache.commons.lang3.ObjectUtils;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * abstract superclass to provide a common reference to Parameter and ParameterOverride
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class ParameterOrOverrideBase extends ParameterBase implements Cloneable, Publishable {
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
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected ParameterOrOverrideBase(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.parameterSubscription = new ContainerList<ParameterSubscription>(this);
    }

    /**
     * List of contained ParameterSubscription.
     * zero or more ParameterSubscriptions that other domains than the owner DomainOfExpertise of this Parameter or ParameterOverride have subscribed to
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ParameterSubscription> parameterSubscription;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link ParameterOrOverrideBase}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link ParameterOrOverrideBase}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
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
    public ParameterOrOverrideBase clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterOrOverrideBase)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ParameterOrOverrideBase}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    private boolean toBePublished;

    /**
     * Gets a value indicating whether this {@link Publishable} is to be published in the next publication.
     */
    public boolean getToBePublished (){
        return this.canBePublished() && this.toBePublished;
    }

    /**
     * Sets a value indicating whether this {@link Publishable} is to be published in the next publication.
     */
    public void setToBePublished (boolean toBePublished){
        this.toBePublished = toBePublished;
    }

    /**
     * Gets a value indicating whether a {@link Publishable} can be published.
     */
    public abstract boolean canBePublished ();
}
