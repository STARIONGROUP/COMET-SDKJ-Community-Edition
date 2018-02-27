/* --------------------------------------------------------------------------------------------------------------------
 * EngineeringModelSetup.java
 * Copyright (c) 2018 RHEA System S.A.
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
import org.apache.commons.lang3.tuple.Pair;
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "EngineeringModelSetup"} class.
 */
@Container(clazz = SiteDirectory.class, propertyName = "model")
@ToString
@EqualsAndHashCode(callSuper = true)
public class EngineeringModelSetup extends DefinedThing implements Cloneable, ParticipantAffectedAccessThing {
    /**
     * Initializes a new instance of the {@link "EngineeringModelSetup"} class.
     */
    public EngineeringModelSetup()
    {
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
    public cdp4common.commondata.Thing instantiatePojo(Cache<Pair<UUID, UUID>, cdp4common.commondata.Thing> cache, URI uri)
    {
        return new cdp4common.sitedirectorydata.EngineeringModelSetup(this.getIid(), cache, uri);
    }
}
