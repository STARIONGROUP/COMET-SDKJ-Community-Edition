/* --------------------------------------------------------------------------------------------------------------------
 * ParameterOverrideValueSet.java
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
 * A Data Transfer Object representation of the {@link "ParameterOverrideValueSet"} class.
 */
@Container(clazz = ParameterOverride.class, propertyName = "valueSet")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ParameterOverrideValueSet extends ParameterValueSetBase implements Cloneable {
    /**
     * Initializes a new instance of the {@link "ParameterOverrideValueSet"} class.
     */
    public ParameterOverrideValueSet() {
    }

    /**
     * Initializes a new instance of the {@link "ParameterOverrideValueSet"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public ParameterOverrideValueSet(UUID iid, int rev) {
        super(iid, rev);
    }

    /**
     * The unique identifier of the referenced parameterValueSet.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID parameterValueSet;

    /**
     * Gets the unique identifier of the referenced actualOption.
     * @throws UnsupportedOperationException The actualOption property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public UUID getActualOption() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterOverrideValueSet.actualOption");
    }

    /**
     * Gets the unique identifier of the referenced actualState.
     * @throws UnsupportedOperationException The actualState property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public UUID getActualState() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterOverrideValueSet.actualState");
    }

    /**
     * Sets the unique identifier of the referenced actualOption.
     * @throws UnsupportedOperationException The actualOption property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setActualOption(UUID actualOption) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterOverrideValueSet.actualOption");
    }

    /**
     * Sets the unique identifier of the referenced actualState.
     * @throws UnsupportedOperationException The actualState property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setActualState(UUID actualState) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterOverrideValueSet.actualState");
    }

    /**
     * Gets the route for the current {@link ParameterOverrideValueSet}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.ParameterOverrideValueSet} from a {@link ParameterOverrideValueSet}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.ParameterOverrideValueSet}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.ParameterOverrideValueSet(this.getIid(), cache, uri);
    }
}
