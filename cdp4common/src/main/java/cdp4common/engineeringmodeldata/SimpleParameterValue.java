/* --------------------------------------------------------------------------------------------------------------------
 * SimpleParameterValue.java
 * Copyright (c) 2019 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
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
 * representation of a single parameter with value for a SimpleParameterizableThing
 * Note: This allows attaching "user-defined attributes" to SimpleParameterizableThings by using ParameterTypes defined in a ReferenceDataLibrary, i.e. reusing the concepts already defined for Parameters of ElementDefinitions.
 */
@Container(clazz = SimpleParameterizableThing.class, propertyName = "parameterValue")
@ToString
@EqualsAndHashCode(callSuper = true)
public class SimpleParameterValue extends Thing implements Cloneable, OwnedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the {@link SimpleParameterValue} class.
     */
    public SimpleParameterValue() {
        this.value = new ValueArray<String>(this, String.class);
    }

    /**
     * Initializes a new instance of the {@link SimpleParameterValue} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public SimpleParameterValue(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.value = new ValueArray<String>(this, String.class);
    }

    /**
     * Property owner.
     * reference to a DomainOfExpertise that is the owner of this SimpleParameterValue
     * Note: The <i>owner</i> is the same as the <i>owner</i> of the SimpleParameterizableThing that contains this SimpleParameterValue.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private DomainOfExpertise owner;

    /**
     * Property parameterType.
     * reference to the applicable ParameterType for this SimpleParameterValue
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ParameterType parameterType;

    /**
     * Property scale.
     * reference to the applicable MeasurementScale if the <i>parameterType</i> is a QuantityKind
     * Note: The MeasurementScale must be one of the <i>possibleScale</i> defined for the QuantityKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private MeasurementScale scale;

    /**
     * List of ordered String.
     * value of this SimpleParameterValue
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ValueArray<String> value;

    /**
     * Gets the owner.
     * reference to a DomainOfExpertise that is the owner of this SimpleParameterValue
     * Note: The <i>owner</i> is the same as the <i>owner</i> of the SimpleParameterizableThing that contains this SimpleParameterValue.
     */
    public DomainOfExpertise getOwner(){
        return this.getDerivedOwner();
    }

    /**
     * Sets the owner.
     * reference to a DomainOfExpertise that is the owner of this SimpleParameterValue
     * Note: The <i>owner</i> is the same as the <i>owner</i> of the SimpleParameterizableThing that contains this SimpleParameterValue.
     *
     * @throws IllegalStateException The owner property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    public void setOwner(DomainOfExpertise owner){
        throw new IllegalStateException("Forbidden Set value for the derived property SimpleParameterValue.owner");
    }

    /**
     * Creates and returns a copy of this {@link SimpleParameterValue} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SimpleParameterValue}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        SimpleParameterValue clone;
        try {
            clone = (SimpleParameterValue)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow SimpleParameterValue cannot be cloned.");
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
     * Creates and returns a copy of this {@link SimpleParameterValue} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SimpleParameterValue}.
     */
    @Override
    public SimpleParameterValue clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SimpleParameterValue)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this SimpleParameterValue}.
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
     * Resolve the properties of the current {@link SimpleParameterValue} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.SimpleParameterValue dto = (cdp4common.dto.SimpleParameterValue)dtoThing;

        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setParameterType(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getParameterType(), dto.getIterationContainerId(), ParameterType.class), SentinelThingProvider.getSentinel(ParameterType.class)));
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setScale((dto.getScale() != null) ? PojoThingFactory.get(this.getCache(), dto.getScale(), dto.getIterationContainerId(), MeasurementScale.class) : null);
        this.setValue(new ValueArray<String>(dto.getValue(), this, String.class));

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link SimpleParameterValue}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.SimpleParameterValue dto = new cdp4common.dto.SimpleParameterValue(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setParameterType(this.getParameterType() != null ? this.getParameterType().getIid() : new UUID(0L, 0L));
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
     * Returns the {@link #owner} value
     *
     * @return The {@link #owner} value
     */
    private DomainOfExpertise getDerivedOwner() {
        SimpleParameterizableThing container = this.getContainer() instanceof SimpleParameterizableThing ? (SimpleParameterizableThing)this.getContainer() : null;

        if (container == null) {
            throw new ContainmentException("Container of SimpleParameterValue is null");
        }

        return container.getOwner();
    }
}
