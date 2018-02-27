/* --------------------------------------------------------------------------------------------------------------------
 * ConversionBasedUnit.java
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
 * A Data Transfer Object representation of the {@link "ConversionBasedUnit"} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class ConversionBasedUnit extends MeasurementUnit implements Cloneable {
    /**
     * Initializes a new instance of the {@link "ConversionBasedUnit"} class.
     */
    protected ConversionBasedUnit()
    {
    }

    /**
     * Initializes a new instance of the {@link "ConversionBasedUnit"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected ConversionBasedUnit(UUID iid, int rev) {
        super(iid, rev);
    }

    /**
     * The conversionFactor.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String conversionFactor;

    /**
     * The unique identifier of the referenced referenceUnit.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID referenceUnit;

    /**
     * Gets the route for the current {@link ConversionBasedUnit}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }
}
