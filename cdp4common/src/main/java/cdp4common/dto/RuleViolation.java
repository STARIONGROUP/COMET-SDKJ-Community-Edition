/* --------------------------------------------------------------------------------------------------------------------
 * RuleViolation.java
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
 * A Data Transfer Object representation of the {@link "RuleViolation"} class.
 */
@Container(clazz = RuleVerification.class, propertyName = "violation")
@ToString
@EqualsAndHashCode(callSuper = true)
public class RuleViolation extends Thing implements Cloneable {
    /**
     * Initializes a new instance of the {@link "RuleViolation"} class.
     */
    public RuleViolation() {
        this.violatingThing = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "RuleViolation"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public RuleViolation(UUID iid, int rev) {
        super(iid, rev);
        this.violatingThing = new ArrayList<UUID>();
    }

    /**
     * The description.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String description;

    /**
     * The list of unique identifiers of the referenced violatingThing instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> violatingThing;

    /**
     * Gets the route for the current {@link RuleViolation}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.RuleViolation} from a {@link RuleViolation}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.RuleViolation}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.RuleViolation(this.getIid(), cache, uri);
    }
}
