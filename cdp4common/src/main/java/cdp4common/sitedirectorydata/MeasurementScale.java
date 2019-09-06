/* --------------------------------------------------------------------------------------------------------------------
 * MeasurementScale.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.exceptions.ContainmentException;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import org.apache.commons.lang3.ObjectUtils;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * representation of a measurement scale to express quantity values for a numerical Parameter, i.e. a Parameter that is typed by a QuantityKind
 * Note 1: MeasurementScale represents the VIM concept of "quantity-value scale" that is defined as "ordered set of quantity values of quantities of a given kind of quantity used in ranking, according to magnitude, quantities of that kind".
 * Note 2: A MeasurementScale defines how to interpret the numerical value of a quantity or parameter. In this data model a distinction is made between a measurement scale and a measurement unit. A measurement unit is a reference quantity that defines how to interpret an interval of one on a measurement scale. A measurement scale defines in addition the kind of scale, and where necessary more characteristics to provide all information needed for mapping quantity values between different scales, as specified in the specializations of this class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "scale")
@ToString
public abstract class MeasurementScale extends DefinedThing implements Cloneable, DeprecatableThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the {@link MeasurementScale} class.
     */
    protected MeasurementScale() {
        this.mappingToReferenceScale = new ContainerList<MappingToReferenceScale>(this);
        this.valueDefinition = new ContainerList<ScaleValueDefinition>(this);
    }

    /**
     * Initializes a new instance of the {@link MeasurementScale} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected MeasurementScale(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.mappingToReferenceScale = new ContainerList<MappingToReferenceScale>(this);
        this.valueDefinition = new ContainerList<ScaleValueDefinition>(this);
    }

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean isDeprecated;

    /**
     * Value indicating whether isMaximumInclusive.
     * Note: In other words this enables to define a closed or open upper end of the permissible value interval.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean isMaximumInclusive;

    /**
     * Value indicating whether isMinimumInclusive.
     * assertion whether the minimum permissible value is included or not
     * Note: In other words this enables to define a closed or open lower end of the permissible value interval.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean isMinimumInclusive;

    /**
     * List of contained MappingToReferenceScale.
     * reference to coincident quantity values on different but compatible MeasurementScales
     * Note: This property would be defined for a dependent MeasurementScale with respect to a reference MeasurementScale in order to enable parameter value conversion from one scale to another. The MappingToReferenceScale defines the offset by which measurement values need to be shifted when converting values between OrdinalScales or IntervalScales.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<MappingToReferenceScale> mappingToReferenceScale;

    /**
     * Property maximumPermissibleValue.
     * optional definition of the maximum permissible value for quantities expressed on this MeasurementScale
     * Note 1: If <i>isMaximumInclusive</i> is true, this implies that values expressed on this MeasurementScale must be less than or equal to <i>maximumPermissibleValue,</i> else if <i>isMaximumInclusive</i> is false, values must be less than <i>maximumPermissibleValue.</i>
     * Note 2: The properties <i>maximumPermissibleValue </i>and <i>isMaximumInclusive</i> can be mapped onto the pair of XML Schema facets <a href="http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive">maxInclusive</a> and <a href="http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive">maxExclusive</a>.
     * Note 3: If no <i>maximumPermissibleValue</i> is given, the maximum permissible quantity value is positive infinity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String maximumPermissibleValue;

    /**
     * Property minimumPermissibleValue.
     * optional definition of the minimum permissible quantity value expressed on this MeasurementScale
     * Note 1: If <i>isMinimumInclusive</i> is true, this implies that values expressed on this MeasurementScale must be greater than or equal to <i>minimumPermissibleValue,</i> else if <i>isMinimumInclusive</i> is false, values must be greater than <i>minimumPermissibleValue.</i>
     * Note 2: The properties <i>minimumPermissibleValue </i>and <i>isMinimumInclusive</i> can be mapped onto the pair of XML Schema facets <a href="http://www.w3.org/TR/xmlschema-2/#rf-minInclusive">minInclusive</a> and <a href="http://www.w3.org/TR/xmlschema-2/#rf-minExclusive">minExclusive</a>.
     * Note 3: If no <i>minimumPermissibleValue</i> is given, the minimum permissible quantity value is negative infinity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String minimumPermissibleValue;

    /**
     * Property negativeValueConnotation.
     * optional connotation, i.e. special significance, of negative values for this MeasurementScale
     * Example: See <i>positiveValueConnotation</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String negativeValueConnotation;

    /**
     * Property numberSet.
     * assertion that specifies the mathematical number set for values of this
     * QuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private NumberSetKind numberSet;

    /**
     * Property positiveValueConnotation.
     * optional connotation, i.e. special significance, of positive values for this MeasurementScale
     * Example: Suppose "latitude" (of a planet) is expressed on a RatioScale with the "degree" measurement unit. Then positive values by definition indicate a latitude on the northern hemisphere, and negative values indicate a latitude on the southern hemisphere. Therefore the positiveValueConnotation would be "North" and the negativeValueConnotation would be "South".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String positiveValueConnotation;

    /**
     * Property unit.
     * reference to the measurement unit applicable to this MeasurementScale
     * Note: The measurement unit defines the meaning of an interval of one on this MeasurementScale.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private MeasurementUnit unit;

    /**
     * List of contained ScaleValueDefinition.
     * collection of particular values that are part of the definition of this MeasurementScale
     * Example 1: On the thermodynamic temperature scale in kelvin, 0 kelvin is defined as the absolute zero temperature point and 273.15 kelvin is defined as the thermodynamic temperature of water at its triple point.
     * Example 2: On the Beaufort wind force scale each of the numbers 1 to 12 has an associated specific textual definition, see OrdinalScale for the example.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ScaleValueDefinition> valueDefinition;

    /**
     * {@link Iterable} that references the composite properties of the current {@link MeasurementScale}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets a {@link Collection} that references the composite properties of the current {@link MeasurementScale}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.mappingToReferenceScale);
        containers.add(this.valueDefinition);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link MeasurementScale} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link MeasurementScale}.
     */
    @Override
    public MeasurementScale clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (MeasurementScale)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this MeasurementScale}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getUnit() == null || this.getUnit().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property unit is null.");
            this.setUnit(SentinelThingProvider.getSentinel(MeasurementUnit.class));
            this.sentinelResetMap.put("unit", new ActionImpl(() -> this.setUnit(null)));
        }

        return errorList;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Gets an {@link Collection} that contains
     * the required {@link ReferenceDataLibrary} for the current {@link Thing}
     */
    @Override
    public Collection<ReferenceDataLibrary> getRequiredRdls() {
        return RequiredReferenceDataLibraryAbacus.computeRequiredRdls(this);
    }
}
