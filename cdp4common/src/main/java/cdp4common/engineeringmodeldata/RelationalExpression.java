/* --------------------------------------------------------------------------------------------------------------------
 * RelationalExpression.java
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

import cdp4common.AggregationKind;
import cdp4common.ChangeKind;
import cdp4common.Container;
import cdp4common.SentinelThingProvider;
import cdp4common.UmlInformation;
import cdp4common.commondata.ParticipantAccessRightKind;
import cdp4common.commondata.PersonAccessRightKind;
import cdp4common.commondata.Thing;
import cdp4common.extensions.RelationalOperatorKindExtensions;
import cdp4common.helpers.ActionImpl;
import cdp4common.helpers.PojoThingFactory;
import cdp4common.sitedirectorydata.DomainOfExpertise;
import cdp4common.sitedirectorydata.MeasurementScale;
import cdp4common.sitedirectorydata.ParameterType;
import cdp4common.sitedirectorydata.Person;
import cdp4common.types.CacheKey;
import cdp4common.types.ValueArray;
import com.google.common.cache.Cache;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.ObjectUtils;

/**
 * representation of a mathematical equality or inequality defined by a ParameterType that acts as a variable, a relational operator and a value
 */
@Container(clazz = ParametricConstraint.class, propertyName = "expression")
@ToString
public class RelationalExpression extends BooleanExpression implements Cloneable {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the {@link RelationalExpression} class.
     */
    public RelationalExpression() {
        this.value = new ValueArray<String>(this, String.class);
    }

    /**
     * Initializes a new instance of the {@link RelationalExpression} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public RelationalExpression(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.value = new ValueArray<String>(this, String.class);
    }

    /**
     * Property parameterType.
     * specification of the parameter type that defines the free variable in this
     * ParametricConstraint
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ParameterType parameterType;

    /**
     * Property relationalOperator.
     * specification of the relational operator
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private RelationalOperatorKind relationalOperator;

    /**
     * Property scale.
     * reference to the applicable MeasurementScale in case the parameterType is a QuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private MeasurementScale scale;

    /**
     * List of ordered String.
     * specification of the parameter value
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ValueArray<String> value;

    /**
     * Creates and returns a copy of this {@link RelationalExpression} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link RelationalExpression}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        RelationalExpression clone;
        try {
            clone = (RelationalExpression)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow RelationalExpression cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setValue(new ValueArray<String>(this.getValue(), this, String.class));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link RelationalExpression} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link RelationalExpression}.
     */
    @Override
    public RelationalExpression clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (RelationalExpression)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this RelationalExpression}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getParameterType() == null || this.getParameterType().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property parameterType is null.");
            this.setParameterType(SentinelThingProvider.getSentinel(ParameterType.class));
            this.sentinelResetMap.put("parameterType", new ActionImpl(() -> this.setParameterType(null)));
        }

        int valueCount = this.getValue().size();
        if (valueCount < 1) {
            errorList.add("The number of elements in the property value is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link RelationalExpression} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.RelationalExpression dto = (cdp4common.dto.RelationalExpression)dtoThing;

        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setParameterType(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getParameterType(), dto.getIterationContainerId(), ParameterType.class), SentinelThingProvider.getSentinel(ParameterType.class)));
        this.setRelationalOperator(dto.getRelationalOperator());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setScale((dto.getScale() != null) ? PojoThingFactory.get(this.getCache(), dto.getScale(), dto.getIterationContainerId(), MeasurementScale.class) : null);
        this.setValue(new ValueArray<String>(dto.getValue(), this, String.class));

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link RelationalExpression}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.RelationalExpression dto = new cdp4common.dto.RelationalExpression(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setParameterType(this.getParameterType() != null ? this.getParameterType().getIid() : new UUID(0L, 0L));
        dto.setRelationalOperator(this.getRelationalOperator());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setScale(this.getScale() != null ? (UUID)this.getScale().getIid() : null);
        dto.setValue(new ValueArray<String>(this.getValue(), this, String.class));

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Gets the representation of the {@link RelationalExpression} as a string
     */
    @Override
    public String getStringValue() {
        return String.format(
                "%s %s %s %s",
                this.getParameterType().getShortName(),
                RelationalOperatorKindExtensions.toScientificNotationString(getRelationalOperator()),
                String.join(", ", this.getValue()),
                (this.getScale() != null) ? this.getScale().getShortName() : "");
    }
}
