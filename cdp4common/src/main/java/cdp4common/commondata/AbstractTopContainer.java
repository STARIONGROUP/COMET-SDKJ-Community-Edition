/* --------------------------------------------------------------------------------------------------------------------
 * AbstractTopContainer.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.commondata;

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
 * representation of a top container
 * Note 1: A concrete subclass of TopContainer must be instantiated as a singleton in a dataset. This singleton instance is the top containing object of all objects in the composite tree of objects in the dataset, and therefore also the natural first entry point for navigating to all data contained in the dataset through composite structure.
 * Note 2: The <i>revisionNumber</i> of a TopContainer object is by definition equal to the highest <i>revisionNumber</i> in any of its directly or indirectly contained objects. See also Thing. This enables sending a request to a persistent data store to get all new and updated objects with a <i>revisionNumber</i> greater than a given <i>revisionNumber</i>. When a request with <i>revisionNumber</i> equal to zero is sent, all objects contained in a TopContainer will be returned.
 */
public abstract class AbstractTopContainer extends AbstractThing  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Initializes a new instance of the <code>TopContainer<code/> class.
     *
     * @see TopContainer
     */
    protected AbstractTopContainer() {
    }

    /**
     * Initializes a new instance of the <code>TopContainer<code/> class.
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
     * @see TopContainer
     */
    protected AbstractTopContainer(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property lastModifiedOn.
     * date and time of the last modification to this TopContainer expressed in UTC (<a href="http://en.wikipedia.org/wiki/Coordinated_Universal_Time">Coordinated Universal Time</a>) with millisecond accuracy
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private LocalDateTime lastModifiedOn;

    /**
     * Gets the lastModifiedOn.
     * date and time of the last modification to this TopContainer expressed in UTC (<a href="http://en.wikipedia.org/wiki/Coordinated_Universal_Time">Coordinated Universal Time</a>) with millisecond accuracy
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public LocalDateTime getLastModifiedOn(){
         return this.lastModifiedOn;
    }

    /**
     * Sets the lastModifiedOn.
     * date and time of the last modification to this TopContainer expressed in UTC (<a href="http://en.wikipedia.org/wiki/Coordinated_Universal_Time">Coordinated Universal Time</a>) with millisecond accuracy
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setLastModifiedOn(LocalDateTime lastModifiedOn){
        this.lastModifiedOn = lastModifiedOn;
    }

    /**
     * Creates and returns a copy of this <code>TopContainer<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>TopContainer<code/>.
     * 
     * @see TopContainer
     */
    @Override
    public TopContainer clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (TopContainer)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>TopContainer<code/>.
     *
     * @return A list of potential errors.
     *
     * @see TopContainer
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }
}
