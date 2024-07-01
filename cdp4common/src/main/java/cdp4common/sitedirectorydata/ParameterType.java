/* --------------------------------------------------------------------------------------------------------------------
 * ParameterType.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
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
import cdp4common.extensions.*;
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
 * abstract superclass that represents the common characteristics of any parameter type
 * Note: There are two properties to hold a short identifier to designate a ParameterType: <i>shortName</i> and <i>symbol</i>. The <i>shortName</i> must be case-insensitive unique within its containing ReferenceDataLibrary. This is necessary in order to support case-insensitive unique names in derived parameter names for use in modeling environments that only have case-insensitive variable names such as MS Excel. The <i>symbol</i> must be case-sensitive unique within its containing ReferenceDataLibrary. The <i>symbol</i> is meant to hold the official symbolic name of a ParameterType as defined for example in an ISO standard.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
public abstract class ParameterType extends DefinedThing implements Cloneable, CategorizableThing, DeprecatableThing {
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
     * Initializes a new instance of the {@link ParameterType} class.
     */
    protected ParameterType() {
        this.category = new ArrayList<Category>();
    }

    /**
     * Initializes a new instance of the {@link ParameterType} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected ParameterType(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.category = new ArrayList<Category>();
    }

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<Category> category;

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean isDeprecated;

    /**
     * Property numberOfValues.
     * number of individual values in each of the parameter value properties of a ParameterValueSet, a ParameterSubscriptionValueSet or a SimpleParameterValue for this ParameterType
     * Note: For a ScalarParameterType this will be one, while for a CompoundParameterType this will amount to the (possibly recursive) summation of the <i>numberOfValues</i> in the ParameterTypes of all <i>component</i> ParameterTypeComponents.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private int numberOfValues;

    /**
     * Property symbol.
     * short symbolic name of this ParameterType
     * Note: Where applicable this property shall be used to hold the symbol that is defined through a standard (e.g. from ISO) or by convention.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String symbol;

    /**
     * Gets the numberOfValues.
     * number of individual values in each of the parameter value properties of a ParameterValueSet, a ParameterSubscriptionValueSet or a SimpleParameterValue for this ParameterType
     * Note: For a ScalarParameterType this will be one, while for a CompoundParameterType this will amount to the (possibly recursive) summation of the <i>numberOfValues</i> in the ParameterTypes of all <i>component</i> ParameterTypeComponents.
     */
    public int getNumberOfValues(){
        return this.getDerivedNumberOfValues();
    }

    /**
     * Sets the numberOfValues.
     * number of individual values in each of the parameter value properties of a ParameterValueSet, a ParameterSubscriptionValueSet or a SimpleParameterValue for this ParameterType
     * Note: For a ScalarParameterType this will be one, while for a CompoundParameterType this will amount to the (possibly recursive) summation of the <i>numberOfValues</i> in the ParameterTypes of all <i>component</i> ParameterTypeComponents.
     *
     * @throws IllegalStateException The numberOfValues property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    public void setNumberOfValues(int numberOfValues){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterType.numberOfValues");
    }

    /**
     * Creates and returns a copy of this {@link ParameterType} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterType}.
     */
    @Override
    public ParameterType clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterType)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ParameterType}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (Strings.isNullOrEmpty(this.getSymbol())) {
            errorList.add("The property symbol is null or empty.");
        }

        return errorList;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Returns the derived {@link #numberOfValues} value
     *
     * @return The {@link #numberOfValues} value
     */
    public int getDerivedNumberOfValues() {
        return 1;
    }

    /**
     * Gets an {@link Collection} that contains
     * the required {@link ReferenceDataLibrary} for the current {@link Thing}
     */
    @Override
    public Collection<ReferenceDataLibrary> getRequiredRdls() {
         return RequiredReferenceDataLibraryAbacus.computeRequiredRdls(this);
    }
}
