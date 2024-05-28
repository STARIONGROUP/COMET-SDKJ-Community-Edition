/* --------------------------------------------------------------------------------------------------------------------
 * NestedParameter.java
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

package cdp4common.engineeringmodeldata;

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
 * representation of a parameter with a value of a NestedElement
 * Note: The NestedParameter effectively represents the data on a parameter row of a fully expanded workbook / explicit architectural decomposition for the combination of one DomainOfExpertise and one Option.
 */
@Container(clazz = NestedElement.class, propertyName = "nestedParameter")
@ToString
public class NestedParameter extends Thing implements Cloneable, OwnedThing, VolatileThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NONE;

    /**
     * Initializes a new instance of the {@link NestedParameter} class.
     */
    public NestedParameter() {
    }

    /**
     * Initializes a new instance of the {@link NestedParameter} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public NestedParameter(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property actualState.
     * reference to the applicable ActualFiniteState for this NestedParameter if it references a state-dependent <i>associatedParameter</i>, otherwise null
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ActualFiniteState actualState;

    /**
     * Property actualValue.
     * <i>actualValue</i> of the applicable ParameterValueSet, ParameterOverrideValueSet or ParameterSubscriptionValueSet
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String actualValue;

    /**
     * Property associatedParameter.
     * reference to the Parameter, ParameterOverride or ParameterSubscription with which this NestedParameter is associated
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ParameterBase associatedParameter;

    /**
     * Property formula.
     * <i>formula</i> for the actualValue of this NestedParameter
     * Note: Property is TBC. Allowing formulas here is opening up a second level of inserting parameter values in a workbook. Perhaps just having read-only NestedParameters is good enough.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String formula;

    /**
     * Value indicating whether isVolatile.
     * Note: When an instance is marked volatile it will not be persisted in the persistent data store. This meant to allow for runtime-only use of such instances in a client application.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean isVolatile;

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
     * Property path.
     * derived unique short name path to this NestedParameter
     * Note: The path string consists of the following backslash separated parts: (1) path to the <i>nestedElement</i>, (2) path to the <i>associatedParameter</i>, (3) path for the <i>actualState</i> or empty string if that is null, (4) <i>shortName</i> of the <i>container</i> Option. Any nested parts of the path name are dot separated.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String path;

    /**
     * Gets the path.
     * derived unique short name path to this NestedParameter
     * Note: The path string consists of the following backslash separated parts: (1) path to the <i>nestedElement</i>, (2) path to the <i>associatedParameter</i>, (3) path for the <i>actualState</i> or empty string if that is null, (4) <i>shortName</i> of the <i>container</i> Option. Any nested parts of the path name are dot separated.
     */
    public String getPath(){
        return this.getDerivedPath();
    }

    /**
     * Sets the path.
     * derived unique short name path to this NestedParameter
     * Note: The path string consists of the following backslash separated parts: (1) path to the <i>nestedElement</i>, (2) path to the <i>associatedParameter</i>, (3) path for the <i>actualState</i> or empty string if that is null, (4) <i>shortName</i> of the <i>container</i> Option. Any nested parts of the path name are dot separated.
     *
     * @throws IllegalStateException The path property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    public void setPath(String path){
        throw new IllegalStateException("Forbidden Set value for the derived property NestedParameter.path");
    }

    /**
     * Creates and returns a copy of this {@link NestedParameter} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link NestedParameter}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        NestedParameter clone;
        try {
            clone = (NestedParameter)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow NestedParameter cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link NestedParameter} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link NestedParameter}.
     */
    @Override
    public NestedParameter clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (NestedParameter)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this NestedParameter}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (Strings.isNullOrEmpty(this.getActualValue())) {
            errorList.add("The property actualValue is null or empty.");
        }

        if (this.getAssociatedParameter() == null || this.getAssociatedParameter().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property associatedParameter is null.");
            this.setAssociatedParameter(SentinelThingProvider.getSentinel(ParameterBase.class));
            this.sentinelResetMap.put("associatedParameter", new ActionImpl(() -> this.setAssociatedParameter(null)));
        }

        if (Strings.isNullOrEmpty(this.getFormula())) {
            errorList.add("The property formula is null or empty.");
        }

        if (this.getOwner() == null || this.getOwner().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property owner is null.");
            this.setOwner(SentinelThingProvider.getSentinel(DomainOfExpertise.class));
            this.sentinelResetMap.put("owner", new ActionImpl(() -> this.setOwner(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link NestedParameter} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.NestedParameter dto = (cdp4common.dto.NestedParameter)dtoThing;

        this.setActualState((dto.getActualState() != null) ? PojoThingFactory.get(this.getCache(), dto.getActualState(), dto.getIterationContainerId(), ActualFiniteState.class) : null);
        this.setActualValue(dto.getActualValue());
        this.setAssociatedParameter(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getAssociatedParameter(), dto.getIterationContainerId(), ParameterBase.class), SentinelThingProvider.getSentinel(ParameterBase.class)));
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setFormula(dto.getFormula());
        this.setVolatile(dto.isVolatile());
        this.setModifiedOn(dto.getModifiedOn());
        this.setOwner(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getOwner(), dto.getIterationContainerId(), DomainOfExpertise.class), SentinelThingProvider.getSentinel(DomainOfExpertise.class)));
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setThingPreference(dto.getThingPreference());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link NestedParameter}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.NestedParameter dto = new cdp4common.dto.NestedParameter(this.getIid(), this.getRevisionNumber());

        dto.setActualState(this.getActualState() != null ? (UUID)this.getActualState().getIid() : null);
        dto.setActualValue(this.getActualValue());
        dto.setAssociatedParameter(this.getAssociatedParameter() != null ? this.getAssociatedParameter().getIid() : new UUID(0L, 0L));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setFormula(this.getFormula());
        dto.setVolatile(this.isVolatile());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setThingPreference(this.getThingPreference());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Returns the derived {@link #path} value
     *
     * The path is defined as the concatenation of:
     * (1) path to the nestedElement,
     * (2) short name of {@link ParameterType}, and {@link ParameterTypeComponent} if applicable, of the associated {@link Parameter},
     * (3) short name of the associated {@link ActualFiniteState} or empty string if it is null
     * (4) short name of the associated {@link Option}.
     *
     * @return The {@link #path} value
     */
    private String getDerivedPath() {
        NestedElement nestedElement = (NestedElement)this.getContainer();
        Option option = (Option)nestedElement.getContainer();

        String nestedElementPath = nestedElement.getShortName();
        String parameterShortName = this.queryParameterShortName();
        String actualFiniteStateShortName = this.getActualState() == null ? "" : this.getActualState().getShortName();

        String result = String.format("%s\\%s\\%s\\%s", nestedElementPath, parameterShortName, option.getShortName(), actualFiniteStateShortName);

        return result;
    }

    /**
     * Gets or sets the {@link ParameterTypeComponent} of the associated {@link ParameterType} that the current {@link NestedParameter}
     * represents.
     *
     * In case the {@link ParameterType} is a {@link ScalarParameterType} then this property is null.
     */
    @Getter
    @Setter
    private ParameterTypeComponent component;

    /**
     * Gets or sets the {@link Option} the {@link NestedParameter} is valid for
     */
    @Getter
    @Setter
    public Option option;

    /**
     * Gets or sets the associated {@link ValueSet}
     */
    @Getter
    @Setter
    public ValueSet valueSet;

    /**
     * Queries the short-name of the {@link ParameterType} of the associated {@link Parameter}
     *
     * a string that represents the parameter short-name.
     */
    private String queryParameterShortName() {
        String parameterShortName;
        if (this.getAssociatedParameter().getParameterType() instanceof ScalarParameterType) {
            parameterShortName = this.getAssociatedParameter().getParameterType().getShortName();
        } else {
            parameterShortName = String.format("%s.%s", this.getAssociatedParameter().getParameterType().getShortName(), this.getComponent().getShortName());
        }

        return parameterShortName;
    }

    /**
     * Gets the user-friendly name
     *
     * this returns the same value as the {@link #getUserFriendlyShortName}
     */
    @Override
    public String getUserFriendlyName() {
        return this.queryParameterShortName();
    }

    /**
     * Gets the user-friendly short name
     */
    @Override
    public String getUserFriendlyShortName() {
        return this.queryParameterShortName();
    }
}
