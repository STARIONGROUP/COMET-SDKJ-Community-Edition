/* --------------------------------------------------------------------------------------------------------------------
 * DiagramEdge.java
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
 * Represents a diagram element that renders as a polyline, connecting a source diagram element to a target diagram element,
 * and is positioned relative to the origin of the diagram.
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = DiagramElementContainer.class, propertyName = "diagramElement")
@ToString
@EqualsAndHashCode(callSuper = true)
public class DiagramEdge extends DiagramElementThing implements Cloneable {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the {@link DiagramEdge} class.
     */
    public DiagramEdge() {
        this.point = new OrderedItemList<Point>(this, true, Point.class);
    }

    /**
     * Initializes a new instance of the {@link DiagramEdge} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public DiagramEdge(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.point = new OrderedItemList<Point>(this, true, Point.class);
    }

    /**
     * List of ordered contained Point.
     * An optional list of points relative to the origin of the nesting diagram that specifies the connected line segments of the edge
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private OrderedItemList<Point> point;

    /**
     * Property source.
     * The edge's source diagram element, i.e., where this starts from
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private DiagramElementThing source;

    /**
     * Property target.
     * The edge's target, i.e., where the edge ends at
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private DiagramElementThing target;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link DiagramEdge}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link DiagramEdge}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.point);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link DiagramEdge} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DiagramEdge}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        DiagramEdge clone;
        try {
            clone = (DiagramEdge)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow DiagramEdge cannot be cloned.");
        }

        clone.setBounds(cloneContainedThings ? new ContainerList<Bounds>(clone) : new ContainerList<Bounds>(this.getBounds(), clone, false));
        clone.setDiagramElement(cloneContainedThings ? new ContainerList<DiagramElementThing>(clone) : new ContainerList<DiagramElementThing>(this.getDiagramElement(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setLocalStyle(cloneContainedThings ? new ContainerList<OwnedStyle>(clone) : new ContainerList<OwnedStyle>(this.getLocalStyle(), clone, false));
        clone.setPoint(cloneContainedThings ? new OrderedItemList<Point>(clone, true, Point.class) : new OrderedItemList<Point>(this.getPoint(), clone, Point.class));

        if (cloneContainedThings) {
            clone.getBounds().addAll(this.getBounds().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDiagramElement().addAll(this.getDiagramElement().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getLocalStyle().addAll(this.getLocalStyle().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getPoint().addAll(this.getPoint().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link DiagramEdge} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DiagramEdge}.
     */
    @Override
    public DiagramEdge clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DiagramEdge)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this DiagramEdge}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getSource() == null || this.getSource().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property source is null.");
            this.setSource(SentinelThingProvider.getSentinel(DiagramElementThing.class));
            this.sentinelResetMap.put("source", new ActionImpl(() -> this.setSource(null)));
        }

        if (this.getTarget() == null || this.getTarget().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property target is null.");
            this.setTarget(SentinelThingProvider.getSentinel(DiagramElementThing.class));
            this.sentinelResetMap.put("target", new ActionImpl(() -> this.setTarget(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link DiagramEdge} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.DiagramEdge dto = (cdp4common.dto.DiagramEdge)dtoThing;

        PojoThingFactory.resolveList(this.getBounds(), dto.getBounds(), dto.getIterationContainerId(), this.getCache(), Bounds.class);
        this.setDepictedThing((dto.getDepictedThing() != null) ? PojoThingFactory.get(this.getCache(), dto.getDepictedThing(), dto.getIterationContainerId(), Thing.class) : null);
        PojoThingFactory.resolveList(this.getDiagramElement(), dto.getDiagramElement(), dto.getIterationContainerId(), this.getCache(), DiagramElementThing.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getLocalStyle(), dto.getLocalStyle(), dto.getIterationContainerId(), this.getCache(), OwnedStyle.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        PojoThingFactory.resolveList(this.getPoint(), dto.getPoint(), dto.getIterationContainerId(), this.getCache(), Point.class);
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setSharedStyle((dto.getSharedStyle() != null) ? PojoThingFactory.get(this.getCache(), dto.getSharedStyle(), dto.getIterationContainerId(), SharedStyle.class) : null);
        this.setSource(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getSource(), dto.getIterationContainerId(), DiagramElementThing.class), SentinelThingProvider.getSentinel(DiagramElementThing.class)));
        this.setTarget(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getTarget(), dto.getIterationContainerId(), DiagramElementThing.class), SentinelThingProvider.getSentinel(DiagramElementThing.class)));

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link DiagramEdge}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.DiagramEdge dto = new cdp4common.dto.DiagramEdge(this.getIid(), this.getRevisionNumber());

        dto.getBounds().addAll(this.getBounds().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDepictedThing(this.getDepictedThing() != null ? (UUID)this.getDepictedThing().getIid() : null);
        dto.getDiagramElement().addAll(this.getDiagramElement().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getLocalStyle().addAll(this.getLocalStyle().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getPoint().addAll(this.getPoint().toDtoOrderedItemList());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setSharedStyle(this.getSharedStyle() != null ? (UUID)this.getSharedStyle().getIid() : null);
        dto.setSource(this.getSource() != null ? this.getSource().getIid() : new UUID(0L, 0L));
        dto.setTarget(this.getTarget() != null ? this.getTarget().getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
