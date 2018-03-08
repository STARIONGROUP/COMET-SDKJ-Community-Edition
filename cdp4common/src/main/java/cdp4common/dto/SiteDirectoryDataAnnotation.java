/* --------------------------------------------------------------------------------------------------------------------
 * SiteDirectoryDataAnnotation.java
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
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "SiteDirectoryDataAnnotation"} class.
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = SiteDirectory.class, propertyName = "annotation")
@ToString
@EqualsAndHashCode(callSuper = true)
public class SiteDirectoryDataAnnotation extends GenericAnnotation implements Cloneable {
    /**
     * Initializes a new instance of the {@link "SiteDirectoryDataAnnotation"} class.
     */
    public SiteDirectoryDataAnnotation()
    {
        this.discussion = new ArrayList<UUID>();
        this.relatedThing = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "SiteDirectoryDataAnnotation"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public SiteDirectoryDataAnnotation(UUID iid, int rev) {
        super(iid, rev);
        this.discussion = new ArrayList<UUID>();
        this.relatedThing = new ArrayList<UUID>();
    }

    /**
     * The unique identifier of the referenced author.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID author;

    /**
     * The unique identifiers of the contained discussion instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> discussion;

    /**
     * The unique identifier of the referenced primaryAnnotatedThing.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID primaryAnnotatedThing;

    /**
     * The unique identifiers of the contained relatedThing instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> relatedThing;

    /**
     * Gets the route for the current {@link SiteDirectoryDataAnnotation}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link SiteDirectoryDataAnnotation}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getDiscussion());
        containers.add(this.getRelatedThing());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.reportingdata.SiteDirectoryDataAnnotation} from a {@link SiteDirectoryDataAnnotation}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.reportingdata.SiteDirectoryDataAnnotation}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<Pair<UUID, UUID>, cdp4common.commondata.Thing> cache, URI uri)
    {
        return new cdp4common.reportingdata.SiteDirectoryDataAnnotation(this.getIid(), cache, uri);
    }
}
