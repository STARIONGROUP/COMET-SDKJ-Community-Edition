/* --------------------------------------------------------------------------------------------------------------------
 * RuleVerification.java
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
 * A Data Transfer Object representation of the {@link "RuleVerification"} class.
 */
@Container(clazz = RuleVerificationList.class, propertyName = "ruleVerification")
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class RuleVerification extends Thing implements Cloneable, NamedThing, OwnedThing {
    /**
     * Initializes a new instance of the {@link "RuleVerification"} class.
     */
    protected RuleVerification()
    {
        this.violation = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "RuleVerification"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected RuleVerification(UUID iid, int rev) {
        super(iid, rev);
        this.violation = new ArrayList<UUID>();
    }

    /**
     * The executedOn.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private LocalDateTime executedOn;

    /**
     * Value indicating whether isActive.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private boolean isActive;

    /**
     * The name.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String name;

    /**
     * The status.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private RuleVerificationStatusKind status;

    /**
     * The unique identifiers of the contained violation instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = false)
    @Getter
    @Setter
    private ArrayList<UUID> violation;

    /**
     * Gets the unique identifier of the referenced owner.
     * @throws UnsupportedOperationException The owner property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @XmlTransient
    public UUID getOwner() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property RuleVerification.owner");
    }

    /**
     * Sets the unique identifier of the referenced owner.
     * @throws UnsupportedOperationException The owner property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @XmlTransient
    public void setOwner(UUID owner) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property RuleVerification.owner");
    }

    /**
     * Gets the route for the current {@link RuleVerification}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link RuleVerification}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getViolation());
        return containers;
    }
}
