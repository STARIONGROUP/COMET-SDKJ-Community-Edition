/* --------------------------------------------------------------------------------------------------------------------
 * AbstractThingReference.java
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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * Abstract-super-class of a Thing that references another Thing through its identifier and revision number
 */
@CDPVersion(version = "1.1.0")
@ToString
@EqualsAndHashCode
public  abstract class ThingReference extends Thing  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the <code>ThingReference<code/> class.
     *
     * @see ThingReference
     */
    protected ThingReference() {
    }

    /**
     * Initializes a new instance of the <code>ThingReference<code/> class.
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
     * @see ThingReference
     */
    protected ThingReference(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property referencedRevisionNumber.
     * The revision number of the referenced thing when the ThingReference was created
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private int referencedRevisionNumber;

    /**
     * Property referencedThing.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Thing referencedThing;

    /**
     * Gets the referencedRevisionNumber.
     * The revision number of the referenced thing when the ThingReference was created
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public int getReferencedRevisionNumber(){
         return this.referencedRevisionNumber;
    }

    /**
     * Gets the referencedThing.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Thing getReferencedThing(){
         return this.referencedThing;
    }

    /**
     * Sets the referencedRevisionNumber.
     * The revision number of the referenced thing when the ThingReference was created
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setReferencedRevisionNumber(int referencedRevisionNumber){
        this.referencedRevisionNumber = referencedRevisionNumber;
    }

    /**
     * Sets the referencedThing.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setReferencedThing(Thing referencedThing){
        this.referencedThing = referencedThing;
    }

    /**
     * Creates and returns a copy of this <code>ThingReference<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ThingReference<code/>.
     * 
     * @see ThingReference
     */
    @Override
    public ThingReference clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ThingReference)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ThingReference<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ThingReference
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getReferencedThing() == null || this.getReferencedThing().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property referencedThing is null.");
            this.setReferencedThing(SentinelThingProvider.getSentinel<Thing>());
            this.sentinelResetMap["referencedThing"] = () -> this.setReferencedThing(null);
        }

        return errorList;
    }
}
