/* --------------------------------------------------------------------------------------------------------------------
 * EngineeringModelSetup.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
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
 * This is an auto-generated DTO Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.dto;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A Data Transfer Object representation of the {@link "EngineeringModelSetup"} class.
 */
@Container(clazz = SiteDirectory.class, propertyName = "model")
@ToString
public class EngineeringModelSetup extends DefinedThing implements Cloneable, ParticipantAffectedAccessThing {
    /**
     * Initializes a new instance of the {@link "EngineeringModelSetup"} class.
     */
    public EngineeringModelSetup() {
        this.activeDomain = new ArrayList<UUID>();
        this.iterationSetup = new ArrayList<UUID>();
        this.participant = new ArrayList<UUID>();
        this.requiredRdl = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "EngineeringModelSetup"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public EngineeringModelSetup(UUID iid, int rev) {
        super(iid, rev);
        this.activeDomain = new ArrayList<UUID>();
        this.iterationSetup = new ArrayList<UUID>();
        this.participant = new ArrayList<UUID>();
        this.requiredRdl = new ArrayList<UUID>();
    }

    /**
     * The list of unique identifiers of the referenced activeDomain instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> activeDomain;

    /**
     * The unique identifier of the referenced engineeringModelIid.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID engineeringModelIid;

    /**
     * The unique identifiers of the contained iterationSetup instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> iterationSetup;

    /**
     * The kind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private EngineeringModelKind kind;

    /**
     * The unique identifiers of the contained participant instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> participant;

    /**
     * The unique identifiers of the contained requiredRdl instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> requiredRdl;

    /**
     * The unique identifier of the referenced sourceEngineeringModelSetupIid.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID sourceEngineeringModelSetupIid;

    /**
     * The studyPhase.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private StudyPhaseKind studyPhase;

    /**
     * Gets the route for the current {@link EngineeringModelSetup}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link EngineeringModelSetup}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getIterationSetup());
        containers.add(this.getParticipant());
        containers.add(this.getRequiredRdl());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.sitedirectorydata.EngineeringModelSetup} from a {@link EngineeringModelSetup}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.EngineeringModelSetup}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.sitedirectorydata.EngineeringModelSetup(this.getIid(), cache, uri);
    }
}
