/* --------------------------------------------------------------------------------------------------------------------
 * LogarithmicScale.java
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
 * A Data Transfer Object representation of the {@link "LogarithmicScale"} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "scale")
@ToString
@EqualsAndHashCode(callSuper = true)
public class LogarithmicScale extends MeasurementScale implements Cloneable {
    /**
     * Initializes a new instance of the {@link "LogarithmicScale"} class.
     */
    public LogarithmicScale()
    {
        this.referenceQuantityValue = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "LogarithmicScale"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public LogarithmicScale(UUID iid, int rev) {
        super(iid, rev);
        this.referenceQuantityValue = new ArrayList<UUID>();
    }

    /**
     * The exponent.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String exponent;

    /**
     * The factor.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String factor;

    /**
     * The logarithmBase.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private LogarithmBaseKind logarithmBase;

    /**
     * The unique identifier of the referenced referenceQuantityKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID referenceQuantityKind;

    /**
     * The unique identifiers of the contained referenceQuantityValue instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> referenceQuantityValue;

    /**
     * Gets the route for the current {@link LogarithmicScale}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link LogarithmicScale}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getReferenceQuantityValue());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.sitedirectorydata.LogarithmicScale} from a {@link LogarithmicScale}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.LogarithmicScale}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<Pair<UUID, UUID>, cdp4common.commondata.Thing> cache, URI uri)
    {
        return new cdp4common.sitedirectorydata.LogarithmicScale(this.getIid(), cache, uri);
    }
}
