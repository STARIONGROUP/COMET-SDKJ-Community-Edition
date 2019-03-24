/* --------------------------------------------------------------------------------------------------------------------
 * ParameterOrOverrideBase.java
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
 * A Data Transfer Object representation of the {@link "ParameterOrOverrideBase"} class.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class ParameterOrOverrideBase extends ParameterBase implements Cloneable {
    /**
     * Initializes a new instance of the {@link "ParameterOrOverrideBase"} class.
     */
    protected ParameterOrOverrideBase() {
        this.parameterSubscription = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "ParameterOrOverrideBase"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected ParameterOrOverrideBase(UUID iid, int rev) {
        super(iid, rev);
        this.parameterSubscription = new ArrayList<UUID>();
    }

    /**
     * The unique identifiers of the contained parameterSubscription instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> parameterSubscription;

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link ParameterOrOverrideBase}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getParameterSubscription());
        return containers;
    }
}
