/* --------------------------------------------------------------------------------------------------------------------
 * ParameterBase.java
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

package cdp4common.engineeringmodeldata;

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
 * abstract superclass that enables a common referencing mechanism for Parameter, ParameterOverride and ParameterSubscription
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class ParameterBase extends Thing implements Cloneable, OwnedThing, ModelCode {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the {@link ParameterBase} class.
     */
    protected ParameterBase() {
    }

    /**
     * Initializes a new instance of the {@link ParameterBase} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected ParameterBase(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property group.
     * optional reference to the ParameterGroup to which this ParameterBase belongs
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ParameterGroup group;

    /**
     * Value indicating whether isOptionDependent.
     * assertion whether the values of this ParameterBase depend on the Options defined in the associated Iteration or not
     * Note 1: When <i>isOptionDependent</i> is true, a ParameterValueSet (or ParameterOverrideValueSet or ParameterSubscriptionValueSet respectively) for each Option in the associated Iteration will be created. Values can then be specified for each Option. When <i>isOptionDependent</i> is false, the value of this ParameterBase is the same for all Options.
     * Note 2: When a new Option is added to an Iteration, automatically new ParameterValueSets (and where applicable ParameterOverrideValueSets and ParameterSubscriptionValueSets) shall be created for that Option for all Parameters and ParameterOverrides that have <i>isOptionDependent</i> is true. When an Option is removed from an Iteration, automatically the option dependent ParameterValueSets (and where applicable ParameterOverrideValueSets and ParameterSubscriptionValueSets) shall be deleted.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean isOptionDependent;

    /**
     * Property owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private DomainOfExpertise owner;

    /**
     * Property parameterType.
     * reference to the ParameterType of this ParameterBase
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ParameterType parameterType;

    /**
     * Property scale.
     * reference to the MeasurementScale applicable to this ParameterBase
     * Note: The <i>scale</i> is mandatory for parameters of a numerical type, i.e. for which the <i>parameterType</i> is a QuantityKind, otherwise it is not assigned.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private MeasurementScale scale;

    /**
     * Property stateDependence.
     * optional reference to an ActualFiniteStateList that defines the ActualFiniteStates that this ParameterBase depends on
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ActualFiniteStateList stateDependence;

    /**
     * Creates and returns a copy of this {@link ParameterBase} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParameterBase}.
     */
    @Override
    public ParameterBase clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterBase)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ParameterBase}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getOwner() == null || this.getOwner().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property owner is null.");
            this.setOwner(SentinelThingProvider.getSentinel(DomainOfExpertise.class));
            this.sentinelResetMap.put("owner", new ActionImpl(() -> this.setOwner(null)));
        }

        if (this.getParameterType() == null || this.getParameterType().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property parameterType is null.");
            this.setParameterType(SentinelThingProvider.getSentinel(ParameterType.class));
            this.sentinelResetMap.put("parameterType", new ActionImpl(() -> this.setParameterType(null)));
        }

        return errorList;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Gets the user-friendly name
     */
    @Override
    public String getUserFriendlyName() {
        return this.modelCode(null);
    }

    /**
     * Gets the user-friendly shortName
     */
    @Override
    public String getUserFriendlyShortName() {
        return this.modelCode(null);
    }

    /**
     * Queries the grouping level of the current {@link ParameterBase}.
     * <p>
     * The level of a {@link ParameterBase} that has no {@link #group} is zero.
     *
     * @return The level of the {@link ParameterBase} in it's virtual {@link ParameterGroup} containment hierarchy.
     */
    public int getLevel() {
        if (this.getGroup() == null) {
            return 0;
        }

        return this.getGroup().getLevel() + 1;
    }

    /**
     * Gets an {@link List<ReferenceDataLibrary>} that contains the required {@link ReferenceDataLibrary}
     * for the current {@link Thing}
     */
    @Override
    public List<ReferenceDataLibrary> getRequiredRdls() {
        Set<ReferenceDataLibrary> requiredRdls = new HashSet<>(super.getRequiredRdls());
        requiredRdls.addAll(this.getParameterType().getRequiredRdls());

        return new ArrayList<>(requiredRdls);
    }

    /**
     * Gets the {@link ValueSet} for this {@link ParameterBase}
     * This is a convenience property that simply returns the actual value-sets of the concrete {@link ParameterBase}
     * ie, {@link Parameter#valueSet}, {@link ParameterOverride#valueSet} or {@link ParameterSubscription#valueSet}
     */
    public List<ValueSet> getValueSets() {
        Parameter parameter = this instanceof Parameter ? (Parameter)this : null;
        if (parameter != null) {
            return parameter.getValueSet().stream().map(x -> (ValueSet)x).collect(Collectors.toList());
        }

        ParameterOverride parameterOverride = this instanceof ParameterOverride ? (ParameterOverride)this : null;
        if (parameterOverride != null) {
            return parameterOverride.getValueSet().stream().map(x -> (ValueSet)x).collect(Collectors.toList());
        }

        ParameterSubscription subscription = (ParameterSubscription)this;
        return subscription.getValueSet().stream().map(x -> (ValueSet)x).collect(Collectors.toList());
    }
    
    /**
     * Computes the model code of the current object
     *
     * @param componentIndex The component Index.
     * @return The {@link String} that represents the model code, valid separators are {@code .} and {@code /}
     */
    public abstract String modelCode(Integer componentIndex);
}
