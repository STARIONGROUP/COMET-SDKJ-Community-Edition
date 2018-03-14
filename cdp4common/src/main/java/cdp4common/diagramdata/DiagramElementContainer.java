/* --------------------------------------------------------------------------------------------------------------------
 * DiagramElementContainer.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.diagramdata;

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
import org.apache.commons.lang3.tuple.Pair;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * A Thing that may contain DiagramElementThing
 */
@CDPVersion(version = "1.1.0")
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class DiagramElementContainer extends DiagramThingBase implements Cloneable {
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
     * Initializes a new instance of the {@link DiagramElementContainer} class.
     */
    protected DiagramElementContainer() {
        this.bounds = new ContainerList<Bounds>(this);
        this.diagramElement = new ContainerList<DiagramElementThing>(this);
    }

    /**
     * Initializes a new instance of the {@link DiagramElementContainer} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected DiagramElementContainer(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.bounds = new ContainerList<Bounds>(this);
        this.diagramElement = new ContainerList<DiagramElementThing>(this);
    }

    /**
     * List of contained Bounds.
     * the optional bounds of the shape relative to the origin of its nesting plane
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Bounds> bounds;

    /**
     * List of contained DiagramElementThing.
     * The diagram elements that are part of this DiagramElementContainer
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<DiagramElementThing> diagramElement;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link DiagramElementContainer}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link DiagramElementContainer}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.bounds);
        containers.add(this.diagramElement);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link DiagramElementContainer} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DiagramElementContainer}.
     */
    @Override
    public DiagramElementContainer clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DiagramElementContainer)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this DiagramElementContainer}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }
}
