/* --------------------------------------------------------------------------------------------------------------------
 * LogEntry.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Interface. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.commondata;

import java.util.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;

/**
 * representation of an entry in a logbook
 * Note 1: A LogEntry is a human written message that records succinctly what change was applied at what point in time to the SiteDirectory or to an EngineeringModel and optionally records information on why the change was applied.
 * Note 2: A LogEntry could be categorized (see Category and CategorizableThing) e.g. to denote that a LogEntry contains a  "design rationale". This would later help with reporting or retrieving useful information from the logbook.
 */
public interface LogEntry {
    /**
     * Gets a list of UUID.
     * weak reference to zero or more items that are relevant to or affected by what is described in the content of this LogEntry
     * Note: Each reference should be an <i>iid</i> of a Thing that exists when the log entry is created. The references are of type Uuid in order to support retaining log entries even when the referenced Thing is later deleted. An implementation of E-TM-10-25 shall support a mechanism to dereference items by Uuid and report when items can not (no longer) be dereferenced.
     */
    List<UUID> getAffectedItemIid();

    /**
     * Gets the Author.
     * reference to the Person who logged this LogEntry
     */
    Person getAuthor();

    /**
     * Gets the Level.
     * level of this LogEntry
     * Note: The <i>level</i> can be used to filter log entries. Also applications may provide a setting that switches on or off logging log entries of a certain level.
     */
    LogLevelKind getLevel();

    /**
     * Sets a list of UUID.
     * weak reference to zero or more items that are relevant to or affected by what is described in the content of this LogEntry
     * Note: Each reference should be an <i>iid</i> of a Thing that exists when the log entry is created. The references are of type Uuid in order to support retaining log entries even when the referenced Thing is later deleted. An implementation of E-TM-10-25 shall support a mechanism to dereference items by Uuid and report when items can not (no longer) be dereferenced.
     */
    void setAffectedItemIid(List<UUID> affectedItemIid);

    /**
     * Sets the Author.
     * reference to the Person who logged this LogEntry
     */
    void setAuthor(Person author);

    /**
     * Sets the Level.
     * level of this LogEntry
     * Note: The <i>level</i> can be used to filter log entries. Also applications may provide a setting that switches on or off logging log entries of a certain level.
     */
    void setLevel(LogLevelKind level);
}
