/* --------------------------------------------------------------------------------------------------------------------
 * ParameterSubscriptionValueSet.java
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
 * A Data Transfer Object representation of the {@link "ParameterSubscriptionValueSet"} class.
 */
@Container(clazz = ParameterSubscription.class, propertyName = "valueSet")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ParameterSubscriptionValueSet extends Thing implements Cloneable, OwnedThing {
    /**
     * Initializes a new instance of the {@link "ParameterSubscriptionValueSet"} class.
     */
    public ParameterSubscriptionValueSet() {
        this.manual = new ValueArray<String>(String.class);
    }

    /**
     * Initializes a new instance of the {@link "ParameterSubscriptionValueSet"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public ParameterSubscriptionValueSet(UUID iid, int rev) {
        super(iid, rev);
        this.manual = new ValueArray<String>(String.class);
    }

    /**
     * The list of ordered String.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ValueArray<String> manual;

    /**
     * The unique identifier of the referenced subscribedValueSet.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID subscribedValueSet;

    /**
     * The valueSwitch.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ParameterSwitchKind valueSwitch;

    /**
     * Gets the unique identifier of the referenced actualOption.
     * @throws UnsupportedOperationException The actualOption property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public UUID getActualOption() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterSubscriptionValueSet.actualOption");
    }

    /**
     * Gets the unique identifier of the referenced actualState.
     * @throws UnsupportedOperationException The actualState property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public UUID getActualState() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterSubscriptionValueSet.actualState");
    }

    /**
     * Gets a list of ordered String.
     * @throws UnsupportedOperationException The actualValue property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public ValueArray<String> getActualValue() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterSubscriptionValueSet.actualValue");
    }

    /**
     * Gets a list of ordered String.
     * @throws UnsupportedOperationException The computed property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public ValueArray<String> getComputed() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterSubscriptionValueSet.computed");
    }

    /**
     * Gets the unique identifier of the referenced owner.
     * @throws UnsupportedOperationException The owner property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public UUID getOwner() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterSubscriptionValueSet.owner");
    }

    /**
     * Gets a list of ordered String.
     * @throws UnsupportedOperationException The reference property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public ValueArray<String> getReference() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterSubscriptionValueSet.reference");
    }

    /**
     * Sets the unique identifier of the referenced actualOption.
     * @throws UnsupportedOperationException The actualOption property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setActualOption(UUID actualOption) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.actualOption");
    }

    /**
     * Sets the unique identifier of the referenced actualState.
     * @throws UnsupportedOperationException The actualState property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setActualState(UUID actualState) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.actualState");
    }

    /**
     * Sets a list of ordered String.
     * @throws UnsupportedOperationException The actualValue property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setActualValue(ValueArray<String> actualValue) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.actualValue");
    }

    /**
     * Sets a list of ordered String.
     * @throws UnsupportedOperationException The computed property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setComputed(ValueArray<String> computed) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.computed");
    }

    /**
     * Sets the unique identifier of the referenced owner.
     * @throws UnsupportedOperationException The owner property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setOwner(UUID owner) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.owner");
    }

    /**
     * Sets a list of ordered String.
     * @throws UnsupportedOperationException The reference property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setReference(ValueArray<String> reference) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterSubscriptionValueSet.reference");
    }

    /**
     * Gets the route for the current {@link ParameterSubscriptionValueSet}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.ParameterSubscriptionValueSet} from a {@link ParameterSubscriptionValueSet}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.ParameterSubscriptionValueSet}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.ParameterSubscriptionValueSet(this.getIid(), cache, uri);
    }
}
