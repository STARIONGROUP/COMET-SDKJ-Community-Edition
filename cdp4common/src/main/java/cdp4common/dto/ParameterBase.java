/* --------------------------------------------------------------------------------------------------------------------
 * ParameterBase.java
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
 * A Data Transfer Object representation of the {@link "ParameterBase"} class.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class ParameterBase extends Thing implements Cloneable, OwnedThing {
    /**
     * Initializes a new instance of the {@link "ParameterBase"} class.
     */
    protected ParameterBase()
    {
    }

    /**
     * Initializes a new instance of the {@link "ParameterBase"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected ParameterBase(UUID iid, int rev) {
        super(iid, rev);
    }

    /**
     * The unique identifier of the referenced group.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID group;

    /**
     * Value indicating whether isOptionDependent.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private boolean isOptionDependent;

    /**
     * The unique identifier of the referenced owner.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID owner;

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
     * The unique identifier of the referenced stateDependence.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID stateDependence;

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
    * Gets the {@link UUID} of the value-sets of this {@link ParameterBase}
    * <p>
    * This is a convenience method to retrieve {@link Parameter#getValueSet()},
    * {@link ParameterOverride#getValueSet()} or {@link ParameterSubscription#getValueSet()}
    */
    public Collection<UUID> getValueSets() {
        if (this instanceof Parameter){
            return ((Parameter) this).getValueSet();
        }

        if (this instanceof ParameterOverride) {
            return ((ParameterOverride) this).getValueSet();
        }

        return ((ParameterSubscription) this).getValueSet();
    }
}
