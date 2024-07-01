/* --------------------------------------------------------------------------------------------------------------------
 * LogEntry.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * This is an auto-generated DTO Interface. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.dto;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.UUID;
import cdp4common.commondata.*;
import cdp4common.CDPVersion;

/**
 * representation of an entry in a logbook
 * Note 1: A LogEntry is a human written message that records succinctly what change was applied at what point in time to the SiteDirectory or to an EngineeringModel and optionally records information on why the change was applied.
 * Note 2: A LogEntry could be categorized (see Category and CategorizableThing) e.g. to denote that a LogEntry contains a  "design rationale". This would later help with reporting or retrieving useful information from the logbook.
 */
public interface LogEntry
{
    /**
     * Gets the unique identifiers of the referenced affectedDomainIid instances.
     * The list of affected Domains of Expertise that this LogEntry.
     */
    ArrayList<UUID> getAffectedDomainIid();

    /**
     * Sets the unique identifiers of the referenced affectedDomainIid instances.
     * The list of affected Domains of Expertise that this LogEntry.
     */
    void setAffectedDomainIid(ArrayList<UUID> affectedDomainIid);
    /**
     * Gets the unique identifiers of the referenced affectedItemIid instances.
     * weak reference to zero or more items that are relevant to or affected by what is described in the content of this LogEntry
     * Note: Each reference should be an <i>iid</i> of a Thing that exists when the log entry is created. The references are of type Uuid in order to support retaining log entries even when the referenced Thing is later deleted. An implementation of E-TM-10-25 shall support a mechanism to dereference items by Uuid and report when items can not (no longer) be dereferenced.
     */
    ArrayList<UUID> getAffectedItemIid();

    /**
     * Sets the unique identifiers of the referenced affectedItemIid instances.
     * weak reference to zero or more items that are relevant to or affected by what is described in the content of this LogEntry
     * Note: Each reference should be an <i>iid</i> of a Thing that exists when the log entry is created. The references are of type Uuid in order to support retaining log entries even when the referenced Thing is later deleted. An implementation of E-TM-10-25 shall support a mechanism to dereference items by Uuid and report when items can not (no longer) be dereferenced.
     */
    void setAffectedItemIid(ArrayList<UUID> affectedItemIid);
    /**
     * Gets the author.
     * reference to the Person who logged this LogEntry
     */
    UUID getAuthor();

    /**
     * Sets the author.
     * reference to the Person who logged this LogEntry
     */
    void setAuthor(UUID author);
    /**
     * Gets the level.
     * level of this LogEntry
     * Note: The <i>level</i> can be used to filter log entries. Also applications may provide a setting that switches on or off logging log entries of a certain level.
     */
    LogLevelKind getLevel();

    /**
     * Sets the level.
     * level of this LogEntry
     * Note: The <i>level</i> can be used to filter log entries. Also applications may provide a setting that switches on or off logging log entries of a certain level.
     */
    void setLevel(LogLevelKind level);
    /**
     * Gets the logEntryChangelogItem.
     */
    @CDPVersion(version = "1.2.0")
    ArrayList<UUID> getLogEntryChangelogItem();

    /**
     * Sets the logEntryChangelogItem.
     */
    @CDPVersion(version = "1.2.0")
    void setLogEntryChangelogItem(ArrayList<UUID> logEntryChangelogItem);
}
