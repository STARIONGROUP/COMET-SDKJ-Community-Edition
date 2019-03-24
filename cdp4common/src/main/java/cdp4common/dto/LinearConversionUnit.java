/* --------------------------------------------------------------------------------------------------------------------
 * LinearConversionUnit.java
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
 * A Data Transfer Object representation of the {@link "LinearConversionUnit"} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
@ToString
@EqualsAndHashCode(callSuper = true)
public class LinearConversionUnit extends ConversionBasedUnit implements Cloneable {
    /**
     * Initializes a new instance of the {@link "LinearConversionUnit"} class.
     */
    public LinearConversionUnit() {
    }

    /**
     * Initializes a new instance of the {@link "LinearConversionUnit"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public LinearConversionUnit(UUID iid, int rev) {
        super(iid, rev);
    }

    /**
     * Gets the route for the current {@link LinearConversionUnit}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.sitedirectorydata.LinearConversionUnit} from a {@link LinearConversionUnit}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.LinearConversionUnit}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.sitedirectorydata.LinearConversionUnit(this.getIid(), cache, uri);
    }
}
