/* --------------------------------------------------------------------------------------------------------------------
 * AbstractDiagramElementContainer.java
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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * A Thing that may contain DiagramElementThing
 */
@CDPVersion(version = "1.1.0")
@ToString
@EqualsAndHashCode
public  abstract class DiagramElementContainer extends DiagramThingBase  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the <code>DiagramElementContainer<code/> class.
     *
     * @see DiagramElementContainer
     */
    protected DiagramElementContainer() {
        this.bounds = new ContainerList<Bounds>(this);
        this.diagramElement = new ContainerList<DiagramElementThing>(this);
    }

    /**
     * Initializes a new instance of the <code>DiagramElementContainer<code/> class.
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
     * @see DiagramElementContainer
     */
    protected DiagramElementContainer(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.bounds = new ContainerList<Bounds>(this);
        this.diagramElement = new ContainerList<DiagramElementThing>(this);
    }

    /**
     * List of contained Bounds.
     * the optional bounds of the shape relative to the origin of its nesting plane
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Bounds> bounds;

    /**
     * List of contained DiagramElementThing.
     * The diagram elements that are part of this DiagramElementContainer
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<DiagramElementThing> diagramElement;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>DiagramElementContainer<code/>.
     *
     * @see Iterable
     * @see DiagramElementContainer
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of contained Bounds.
     * the optional bounds of the shape relative to the origin of its nesting plane
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Bounds> getBounds(){
         return this.bounds;
    }

    /**
     * Gets a list of contained DiagramElementThing.
     * The diagram elements that are part of this DiagramElementContainer
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<DiagramElementThing> getDiagramElement(){
         return this.diagramElement;
    }

    /**
     * Sets a list of contained Bounds.
     * the optional bounds of the shape relative to the origin of its nesting plane
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setBounds(ContainerList<Bounds> bounds){
        this.bounds = bounds;
    }

    /**
     * Sets a list of contained DiagramElementThing.
     * The diagram elements that are part of this DiagramElementContainer
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setDiagramElement(ContainerList<DiagramElementThing> diagramElement){
        this.diagramElement = diagramElement;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>DiagramElementContainer<code/>.
     *
     * @see Iterable
     * @see DiagramElementContainer
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.bounds);
        containers.Add(this.diagramElement);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>DiagramElementContainer<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DiagramElementContainer<code/>.
     * 
     * @see DiagramElementContainer
     */
    @Override
    public DiagramElementContainer clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DiagramElementContainer)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>DiagramElementContainer<code/>.
     *
     * @return A list of potential errors.
     *
     * @see DiagramElementContainer
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }
}
