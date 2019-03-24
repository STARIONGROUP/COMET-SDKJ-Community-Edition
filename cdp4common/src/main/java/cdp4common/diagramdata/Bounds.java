/* --------------------------------------------------------------------------------------------------------------------
 * Bounds.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.diagramdata;

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
 * Specifies a rectangular area in a x-y coordinate system that is defined by a location (x and y) and a size (width and height)
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = DiagramElementContainer.class, propertyName = "bounds")
@ToString
@EqualsAndHashCode(callSuper = true)
public class Bounds extends DiagramThingBase implements Cloneable {
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
     * Initializes a new instance of the {@link Bounds} class.
     */
    public Bounds() {
    }

    /**
     * Initializes a new instance of the {@link Bounds} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public Bounds(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property height.
     * The height of the bounds on the y-axis
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private float height;

    /**
     * Property width.
     * The width of the bound on the x-axis
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private float width;

    /**
     * Property x.
     * Represents the x-coordinate of the bound. It represents the distance of the area's top-left corner from the origin on the x-axis
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private float x;

    /**
     * Property y.
     * Represents the y-coordinate of the bounds. It represents the distance of the area's top-left corner from the origin on the x-axis
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private float y;

    /**
     * Creates and returns a copy of this {@link Bounds} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Bounds}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        Bounds clone;
        try {
            clone = (Bounds)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow Bounds cannot be cloned.");
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
     * Creates and returns a copy of this {@link Bounds} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Bounds}.
     */
    @Override
    public Bounds clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Bounds)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this Bounds}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link Bounds} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Bounds dto = (cdp4common.dto.Bounds)dtoThing;

        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setHeight(dto.getHeight());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setWidth(dto.getWidth());
        this.setX(dto.getX());
        this.setY(dto.getY());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link Bounds}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Bounds dto = new cdp4common.dto.Bounds(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setHeight(this.getHeight());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setWidth(this.getWidth());
        dto.setX(this.getX());
        dto.setY(this.getY());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
