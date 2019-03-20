/* --------------------------------------------------------------------------------------------------------------------
 * ParticipantRole.java
 * Copyright (c) 2019 RHEA System S.A.
 *
 * This is an auto-generated DTO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.dto;

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
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MoreCollectors;
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "ParticipantRole"} class.
 */
@Container(clazz = SiteDirectory.class, propertyName = "participantRole")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ParticipantRole extends DefinedThing implements Cloneable, DeprecatableThing {
    /**
     * Initializes a new instance of the {@link "ParticipantRole"} class.
     */
    public ParticipantRole() {
        this.participantPermission = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "ParticipantRole"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public ParticipantRole(UUID iid, int rev) {
        super(iid, rev);
        this.participantPermission = new ArrayList<UUID>();
    }

    /**
     * Value indicating whether isDeprecated.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private boolean isDeprecated;

    /**
     * The unique identifiers of the contained participantPermission instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> participantPermission;

    /**
     * Gets the route for the current {@link ParticipantRole}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link ParticipantRole}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getParticipantPermission());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.sitedirectorydata.ParticipantRole} from a {@link ParticipantRole}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.ParticipantRole}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.sitedirectorydata.ParticipantRole(this.getIid(), cache, uri);
    }
}
