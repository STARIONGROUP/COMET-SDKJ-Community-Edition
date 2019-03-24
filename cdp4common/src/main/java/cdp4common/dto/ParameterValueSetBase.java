/* --------------------------------------------------------------------------------------------------------------------
 * ParameterValueSetBase.java
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
 * A Data Transfer Object representation of the {@link "ParameterValueSetBase"} class.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class ParameterValueSetBase extends Thing implements Cloneable, OwnedThing {
    /**
     * Initializes a new instance of the {@link "ParameterValueSetBase"} class.
     */
    protected ParameterValueSetBase() {
        this.computed = new ValueArray<String>(String.class);
        this.formula = new ValueArray<String>(String.class);
        this.manual = new ValueArray<String>(String.class);
        this.published = new ValueArray<String>(String.class);
        this.reference = new ValueArray<String>(String.class);
    }

    /**
     * Initializes a new instance of the {@link "ParameterValueSetBase"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected ParameterValueSetBase(UUID iid, int rev) {
        super(iid, rev);
        this.computed = new ValueArray<String>(String.class);
        this.formula = new ValueArray<String>(String.class);
        this.manual = new ValueArray<String>(String.class);
        this.published = new ValueArray<String>(String.class);
        this.reference = new ValueArray<String>(String.class);
    }

    /**
     * The unique identifier of the referenced actualOption.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID actualOption;

    /**
     * The unique identifier of the referenced actualState.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID actualState;

    /**
     * The list of ordered String.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ValueArray<String> computed;

    /**
     * The list of ordered String.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ValueArray<String> formula;

    /**
     * The list of ordered String.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ValueArray<String> manual;

    /**
     * The list of ordered String.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ValueArray<String> published;

    /**
     * The list of ordered String.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ValueArray<String> reference;

    /**
     * The valueSwitch.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ParameterSwitchKind valueSwitch;

    /**
     * Gets a list of ordered String.
     * @throws UnsupportedOperationException The actualValue property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public ValueArray<String> getActualValue() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterValueSetBase.actualValue");
    }

    /**
     * Gets the unique identifier of the referenced owner.
     * @throws UnsupportedOperationException The owner property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public UUID getOwner() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property ParameterValueSetBase.owner");
    }

    /**
     * Sets a list of ordered String.
     * @throws UnsupportedOperationException The actualValue property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setActualValue(ValueArray<String> actualValue) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterValueSetBase.actualValue");
    }

    /**
     * Sets the unique identifier of the referenced owner.
     * @throws UnsupportedOperationException The owner property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @XmlTransient
    public void setOwner(UUID owner) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property ParameterValueSetBase.owner");
    }
}
