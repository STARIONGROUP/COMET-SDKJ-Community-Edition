/* --------------------------------------------------------------------------------------------------------------------
 * DecompositionRule.java
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
 * A Data Transfer Object representation of the {@link "DecompositionRule"} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "rule")
@ToString
@EqualsAndHashCode(callSuper = true)
public class DecompositionRule extends Rule implements Cloneable {
    /**
     * Initializes a new instance of the {@link "DecompositionRule"} class.
     */
    public DecompositionRule()
    {
        this.containedCategory = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "DecompositionRule"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public DecompositionRule(UUID iid, int rev) {
        super(iid, rev);
        this.containedCategory = new ArrayList<UUID>();
    }

    /**
     * The list of unique identifiers of the referenced containedCategory instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> containedCategory;

    /**
     * The unique identifier of the referenced containingCategory.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID containingCategory;

    /**
     * The maxContained.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private int maxContained;

    /**
     * The minContained.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private int minContained;

    /**
     * Gets the route for the current {@link DecompositionRule}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.sitedirectorydata.DecompositionRule} from a {@link DecompositionRule}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.DecompositionRule}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<Pair<UUID, UUID>, cdp4common.commondata.Thing> cache, URI uri)
    {
        return new cdp4common.sitedirectorydata.DecompositionRule(this.getIid(), cache, uri);
    }
}
