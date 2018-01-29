/* --------------------------------------------------------------------------------------------------------------------
 * AbstractDiagramElementThing.java
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
 * The abstract class for all types that represent diagramming elements. This abstract corresponds to the "DiagramElement" class defined by the OMG Diagram Definition v1.1
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = DiagramElementContainer.class, propertyName = "diagramElement")
@ToString
@EqualsAndHashCode
public  abstract class DiagramElementThing extends DiagramElementContainer  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the <code>DiagramElementThing<code/> class.
     *
     * @see DiagramElementThing
     */
    protected DiagramElementThing() {
        this.localStyle = new ContainerList<OwnedStyle>(this);
    }

    /**
     * Initializes a new instance of the <code>DiagramElementThing<code/> class.
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
     * @see DiagramElementThing
     */
    protected DiagramElementThing(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.localStyle = new ContainerList<OwnedStyle>(this);
    }

    /**
     * Property depictedThing.
     * The Thing that is depicted by this DiagramElementThing.
     * NOTE: The depicted Thing cannot be a DiagramThingBase.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Thing depictedThing;

    /**
     * List of contained OwnedStyle.
     * The optional style applied locally on this DiagramElementThing
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<OwnedStyle> localStyle;

    /**
     * Property sharedStyle.
     * An optional shared style for this DiagramElementThing
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private SharedStyle sharedStyle;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>DiagramElementThing<code/>.
     *
     * @see Iterable
     * @see DiagramElementThing
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets the depictedThing.
     * The Thing that is depicted by this DiagramElementThing.
     * NOTE: The depicted Thing cannot be a DiagramThingBase.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Thing getDepictedThing(){
         return this.depictedThing;
    }

    /**
     * Gets a list of contained OwnedStyle.
     * The optional style applied locally on this DiagramElementThing
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<OwnedStyle> getLocalStyle(){
         return this.localStyle;
    }

    /**
     * Gets the sharedStyle.
     * An optional shared style for this DiagramElementThing
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public SharedStyle getSharedStyle(){
         return this.sharedStyle;
    }

    /**
     * Sets the depictedThing.
     * The Thing that is depicted by this DiagramElementThing.
     * NOTE: The depicted Thing cannot be a DiagramThingBase.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDepictedThing(Thing depictedThing){
        this.depictedThing = depictedThing;
    }

    /**
     * Sets a list of contained OwnedStyle.
     * The optional style applied locally on this DiagramElementThing
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setLocalStyle(ContainerList<OwnedStyle> localStyle){
        this.localStyle = localStyle;
    }

    /**
     * Sets the sharedStyle.
     * An optional shared style for this DiagramElementThing
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setSharedStyle(SharedStyle sharedStyle){
        this.sharedStyle = sharedStyle;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>DiagramElementThing<code/>.
     *
     * @see Iterable
     * @see DiagramElementThing
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.localStyle);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>DiagramElementThing<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DiagramElementThing<code/>.
     * 
     * @see DiagramElementThing
     */
    @Override
    public DiagramElementThing clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DiagramElementThing)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>DiagramElementThing<code/>.
     *
     * @return A list of potential errors.
     *
     * @see DiagramElementThing
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }
}
