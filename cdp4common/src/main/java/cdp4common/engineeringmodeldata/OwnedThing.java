/* --------------------------------------------------------------------------------------------------------------------
 * OwnedThing.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Interface. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

import java.time.LocalDateTime;
import java.util.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;

/**
 * representation of a Thing that has a single DomainOfExpertise as an owner
 */
public interface OwnedThing {
    /**
     * Gets the Owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    DomainOfExpertise getOwner();

    /**
     * Sets the Owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    void setOwner(DomainOfExpertise owner);
}
