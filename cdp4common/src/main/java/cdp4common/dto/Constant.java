/* --------------------------------------------------------------------------------------------------------------------
 * Constant.java
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
 * A Data Transfer Object representation of the {@link "Constant"} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "constant")
@ToString
@EqualsAndHashCode(callSuper = true)
public class Constant extends DefinedThing implements Cloneable, CategorizableThing, DeprecatableThing {
    /**
     * Initializes a new instance of the {@link "Constant"} class.
     */
    public Constant() {
        this.category = new ArrayList<UUID>();
        this.value = new ValueArray<String>(String.class);
    }

    /**
     * Initializes a new instance of the {@link "Constant"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public Constant(UUID iid, int rev) {
        super(iid, rev);
        this.category = new ArrayList<UUID>();
        this.value = new ValueArray<String>(String.class);
    }

    /**
     * The list of unique identifiers of the referenced category instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> category;

    /**
     * Value indicating whether isDeprecated.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private boolean isDeprecated;

    /**
     * The unique identifier of the referenced parameterType.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID parameterType;

    /**
     * The unique identifier of the referenced scale.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID scale;

    /**
     * The list of ordered String.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ValueArray<String> value;

    /**
     * Gets the route for the current {@link Constant}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.sitedirectorydata.Constant} from a {@link Constant}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.Constant}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.sitedirectorydata.Constant(this.getIid(), cache, uri);
    }
}
