/* --------------------------------------------------------------------------------------------------------------------
 * AbstractDiagramEdge.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.diagramdata;

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
 * Represents a diagram element that renders as a polyline, connecting a source diagram element to a target diagram element,
 * and is positioned relative to the origin of the diagram.
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = DiagramElementContainer.class, propertyName = "diagramElement")
public abstract class AbstractDiagramEdge extends AbstractDiagramElementThing  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>DiagramEdge<code/> class.
     *
     * @see DiagramEdge
     */
    public AbstractDiagramEdge() {
        this.point = new OrderedItemList<Point>(this, true);
    }

    /**
     * Initializes a new instance of the <code>DiagramEdge<code/> class.
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
     * @see DiagramEdge
     */
    public AbstractDiagramEdge(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.point = new OrderedItemList<Point>(this, true);
    }

    /**
     * List of ordered contained Point.
     * An optional list of points relative to the origin of the nesting diagram that specifies the connected line segments of the edge
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<Point> point;

    /**
     * Property source.
     * The edge's source diagram element, i.e., where this starts from
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DiagramElementThing source;

    /**
     * Property target.
     * The edge's target, i.e., where the edge ends at
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DiagramElementThing target;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>DiagramEdge<code/>.
     *
     * @see Iterable
     * @see DiagramEdge
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of ordered contained Point.
     * An optional list of points relative to the origin of the nesting diagram that specifies the connected line segments of the edge
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<Point> getPoint(){
         return this.point;
    }

    /**
     * Gets the source.
     * The edge's source diagram element, i.e., where this starts from
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public DiagramElementThing getSource(){
         return this.source;
    }

    /**
     * Gets the target.
     * The edge's target, i.e., where the edge ends at
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public DiagramElementThing getTarget(){
         return this.target;
    }

    /**
     * Sets a list of ordered contained Point.
     * An optional list of points relative to the origin of the nesting diagram that specifies the connected line segments of the edge
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     protected void setPoint(OrderedItemList<Point> point){
        this.point = point;
    }

    /**
     * Sets the source.
     * The edge's source diagram element, i.e., where this starts from
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setSource(DiagramElementThing source){
        this.source = source;
    }

    /**
     * Sets the target.
     * The edge's target, i.e., where the edge ends at
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setTarget(DiagramElementThing target){
        this.target = target;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>DiagramEdge<code/>.
     *
     * @see Iterable
     * @see DiagramEdge
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.point);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>DiagramEdge<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DiagramEdge<code/>.
     *
     * @see DiagramEdge
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        DiagramEdge clone = (DiagramEdge)this.clone();
        clone.setBounds(cloneContainedThings ? new ContainerList<Bounds>(clone) : new ContainerList<Bounds>(this.bounds, clone));
        clone.setDiagramElement(cloneContainedThings ? new ContainerList<DiagramElementThing>(clone) : new ContainerList<DiagramElementThing>(this.diagramElement, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setLocalStyle(cloneContainedThings ? new ContainerList<OwnedStyle>(clone) : new ContainerList<OwnedStyle>(this.localStyle, clone));
        clone.setPoint(cloneContainedThings ? new OrderedItemList<Point>(clone, true) : new OrderedItemList<Point>(this.point, clone));

        if (cloneContainedThings) {
            clone.getBounds().addAll(this.bounds.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDiagramElement().addAll(this.diagramElement.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getLocalStyle().addAll(this.localStyle.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getPoint().addAll(this.point.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>DiagramEdge<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DiagramEdge<code/>.
     * 
     * @see DiagramEdge
     */
    @Override
    public DiagramEdge clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DiagramEdge)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>DiagramEdge<code/>.
     *
     * @return A list of potential errors.
     *
     * @see DiagramEdge
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.source == null || this.source.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property source is null.");
            this.source = SentinelThingProvider.getSentinel<DiagramElementThing>();
            this.sentinelResetMap["source"] = () -> this.source = null;
        }

        if (this.target == null || this.target.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property target is null.");
            this.target = SentinelThingProvider.getSentinel<DiagramElementThing>();
            this.sentinelResetMap["target"] = () -> this.target = null;
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>DiagramEdge<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see DiagramEdge
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.DiagramEdge dto = (cdp4common.dto.DiagramEdge)dtoThing;

        this.bounds.resolveList(dto.getBounds(), dto.getIterationContainerId(), this.cache);
        this.depictedThing = (dto.getDepictedThing() != null) ? this.cache.get<Thing>(dto.getDepictedThing.getValue(), dto.getIterationContainerId()) : null;
        this.diagramElement.resolveList(dto.getDiagramElement(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.localStyle.resolveList(dto.getLocalStyle(), dto.getIterationContainerId(), this.cache);
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.point.resolveList(dto.getPoint(), dto.getIterationContainerId(), this.cache);
        this.revisionNumber = dto.getRevisionNumber();
        this.sharedStyle = (dto.getSharedStyle() != null) ? this.cache.get<SharedStyle>(dto.getSharedStyle.getValue(), dto.getIterationContainerId()) : null;
        this.source = this.cache.get<DiagramElementThing>(dto.getSource(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DiagramElementThing>();
        this.target = this.cache.get<DiagramElementThing>(dto.getTarget(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DiagramElementThing>();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>DiagramEdge<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see DiagramEdge
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.DiagramEdge dto = new cdp4common.dto.DiagramEdge(this.iid, this.revisionNumber);

        dto.getBounds().add(this.bounds.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setDepictedThing(this.depictedThing != null ? (UUID)this.depictedThing.getIid() : null);
        dto.getDiagramElement().add(this.diagramElement.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getLocalStyle().add(this.localStyle.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.getPoint().add(this.point.toDtoOrderedItemList());
        dto.setRevisionNumber(this.revisionNumber);
        dto.setSharedStyle(this.sharedStyle != null ? (UUID)this.sharedStyle.getIid() : null);
        dto.setSource(this.source != null ? this.source.getIid() : new UUID(0L, 0L));
        dto.setTarget(this.target != null ? this.target.getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
