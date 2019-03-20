/* --------------------------------------------------------------------------------------------------------------------
 * DomainOfExpertiseGroup.java
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
 * A Data Transfer Object representation of the {@link "DomainOfExpertiseGroup"} class.
 */
@Container(clazz = SiteDirectory.class, propertyName = "domainGroup")
@ToString
@EqualsAndHashCode(callSuper = true)
public class DomainOfExpertiseGroup extends DefinedThing implements Cloneable, DeprecatableThing {
    /**
     * Initializes a new instance of the {@link "DomainOfExpertiseGroup"} class.
     */
    public DomainOfExpertiseGroup() {
        this.domain = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "DomainOfExpertiseGroup"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public DomainOfExpertiseGroup(UUID iid, int rev) {
        super(iid, rev);
        this.domain = new ArrayList<UUID>();
    }

    /**
     * The list of unique identifiers of the referenced domain instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> domain;

    /**
     * Value indicating whether isDeprecated.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private boolean isDeprecated;

    /**
     * Gets the route for the current {@link DomainOfExpertiseGroup}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.sitedirectorydata.DomainOfExpertiseGroup} from a {@link DomainOfExpertiseGroup}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.DomainOfExpertiseGroup}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.sitedirectorydata.DomainOfExpertiseGroup(this.getIid(), cache, uri);
    }
}
