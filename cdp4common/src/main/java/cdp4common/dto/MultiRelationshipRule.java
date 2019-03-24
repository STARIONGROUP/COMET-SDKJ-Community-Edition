/* --------------------------------------------------------------------------------------------------------------------
 * MultiRelationshipRule.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
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
 * A Data Transfer Object representation of the {@link "MultiRelationshipRule"} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "rule")
@ToString
@EqualsAndHashCode(callSuper = true)
public class MultiRelationshipRule extends Rule implements Cloneable {
    /**
     * Initializes a new instance of the {@link "MultiRelationshipRule"} class.
     */
    public MultiRelationshipRule() {
        this.relatedCategory = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "MultiRelationshipRule"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public MultiRelationshipRule(UUID iid, int rev) {
        super(iid, rev);
        this.relatedCategory = new ArrayList<UUID>();
    }

    /**
     * The maxRelated.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private int maxRelated;

    /**
     * The minRelated.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private int minRelated;

    /**
     * The list of unique identifiers of the referenced relatedCategory instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> relatedCategory;

    /**
     * The unique identifier of the referenced relationshipCategory.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID relationshipCategory;

    /**
     * Gets the route for the current {@link MultiRelationshipRule}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.sitedirectorydata.MultiRelationshipRule} from a {@link MultiRelationshipRule}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.MultiRelationshipRule}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.sitedirectorydata.MultiRelationshipRule(this.getIid(), cache, uri);
    }
}
