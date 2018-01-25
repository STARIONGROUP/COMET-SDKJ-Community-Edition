/* --------------------------------------------------------------------------------------------------------------------
 * AbstractDiscussionItem.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.reportingdata;

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
 * Abstract super class representing a discussion
 */
@CDPVersion(version = "1.1.0")
public abstract class AbstractDiscussionItem extends AbstractGenericAnnotation  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Initializes a new instance of the <code>DiscussionItem<code/> class.
     *
     * @see DiscussionItem
     */
    protected AbstractDiscussionItem() {
    }

    /**
     * Initializes a new instance of the <code>DiscussionItem<code/> class.
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
     * @see DiscussionItem
     */
    protected AbstractDiscussionItem(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property replyTo.
     * The DiscussionItem that this DiscussionItem is a reply to
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DiscussionItem replyTo;

    /**
     * Gets the replyTo.
     * The DiscussionItem that this DiscussionItem is a reply to
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public DiscussionItem getReplyTo(){
         return this.replyTo;
    }

    /**
     * Sets the replyTo.
     * The DiscussionItem that this DiscussionItem is a reply to
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setReplyTo(DiscussionItem replyTo){
        this.replyTo = replyTo;
    }

    /**
     * Creates and returns a copy of this <code>DiscussionItem<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DiscussionItem<code/>.
     * 
     * @see DiscussionItem
     */
    @Override
    public DiscussionItem clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DiscussionItem)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>DiscussionItem<code/>.
     *
     * @return A list of potential errors.
     *
     * @see DiscussionItem
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }
}
