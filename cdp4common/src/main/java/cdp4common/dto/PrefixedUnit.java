/* --------------------------------------------------------------------------------------------------------------------
 * PrefixedUnit.java
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
 * A Data Transfer Object representation of the {@link "PrefixedUnit"} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
@ToString
@EqualsAndHashCode(callSuper = true)
public class PrefixedUnit extends ConversionBasedUnit implements Cloneable {
    /**
     * Initializes a new instance of the {@link "PrefixedUnit"} class.
     */
    public PrefixedUnit() {
    }

    /**
     * Initializes a new instance of the {@link "PrefixedUnit"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public PrefixedUnit(UUID iid, int rev) {
        super(iid, rev);
    }

    /**
     * The unique identifier of the referenced prefix.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID prefix;

    /**
     * Gets the conversionFactor.
     * @throws UnsupportedOperationException The conversionFactor property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public String getConversionFactor() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property PrefixedUnit.conversionFactor");
    }

    /**
     * Gets the name.
     * @throws UnsupportedOperationException The name property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public String getName() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property PrefixedUnit.name");
    }

    /**
     * Gets the shortName.
     * @throws UnsupportedOperationException The shortName property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public String getShortName() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property PrefixedUnit.shortName");
    }

    /**
     * Sets the conversionFactor.
     * @throws UnsupportedOperationException The conversionFactor property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setConversionFactor(String conversionFactor) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property PrefixedUnit.conversionFactor");
    }

    /**
     * Sets the name.
     * @throws UnsupportedOperationException The name property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setName(String name) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property PrefixedUnit.name");
    }

    /**
     * Sets the shortName.
     * @throws UnsupportedOperationException The shortName property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setShortName(String shortName) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property PrefixedUnit.shortName");
    }

    /**
     * Gets the route for the current {@link PrefixedUnit}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.sitedirectorydata.PrefixedUnit} from a {@link PrefixedUnit}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.sitedirectorydata.PrefixedUnit}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.sitedirectorydata.PrefixedUnit(this.getIid(), cache, uri);
    }
}
