/* --------------------------------------------------------------------------------------------------------------------
 * SharedStyle.java
 * Copyright (c) 2019 RHEA System S.A.
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
 * A shared style that may be used in different diagrams
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = Iteration.class, propertyName = "sharedDiagramStyle")
@ToString
@EqualsAndHashCode(callSuper = true)
public class SharedStyle extends DiagrammingStyle implements Cloneable {
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
     * Initializes a new instance of the {@link SharedStyle} class.
     */
    public SharedStyle() {
    }

    /**
     * Initializes a new instance of the {@link SharedStyle} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public SharedStyle(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Creates and returns a copy of this {@link SharedStyle} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SharedStyle}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        SharedStyle clone;
        try {
            clone = (SharedStyle)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow SharedStyle cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setUsedColor(cloneContainedThings ? new ContainerList<Color>(clone) : new ContainerList<Color>(this.getUsedColor(), clone, false));

        if (cloneContainedThings) {
            clone.getUsedColor().addAll(this.getUsedColor().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link SharedStyle} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SharedStyle}.
     */
    @Override
    public SharedStyle clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SharedStyle)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this SharedStyle}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link SharedStyle} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.SharedStyle dto = (cdp4common.dto.SharedStyle)dtoThing;

        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setFillColor((dto.getFillColor() != null) ? PojoThingFactory.get(this.getCache(), dto.getFillColor(), dto.getIterationContainerId(), Color.class) : null);
        this.setFillOpacity(dto.getFillOpacity());
        this.setFontBold(dto.isFontBold());
        this.setFontColor((dto.getFontColor() != null) ? PojoThingFactory.get(this.getCache(), dto.getFontColor(), dto.getIterationContainerId(), Color.class) : null);
        this.setFontItalic(dto.isFontItalic());
        this.setFontName(dto.getFontName());
        this.setFontSize(dto.getFontSize());
        this.setFontStrokeThrough(dto.isFontStrokeThrough());
        this.setFontUnderline(dto.isFontUnderline());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setStrokeColor((dto.getStrokeColor() != null) ? PojoThingFactory.get(this.getCache(), dto.getStrokeColor(), dto.getIterationContainerId(), Color.class) : null);
        this.setStrokeOpacity(dto.getStrokeOpacity());
        this.setStrokeWidth(dto.getStrokeWidth());
        PojoThingFactory.resolveList(this.getUsedColor(), dto.getUsedColor(), dto.getIterationContainerId(), this.getCache(), Color.class);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link SharedStyle}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.SharedStyle dto = new cdp4common.dto.SharedStyle(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setFillColor(this.getFillColor() != null ? (UUID)this.getFillColor().getIid() : null);
        dto.setFillOpacity(this.getFillOpacity());
        dto.setFontBold(this.getFontBold());
        dto.setFontColor(this.getFontColor() != null ? (UUID)this.getFontColor().getIid() : null);
        dto.setFontItalic(this.getFontItalic());
        dto.setFontName(this.getFontName());
        dto.setFontSize(this.getFontSize());
        dto.setFontStrokeThrough(this.getFontStrokeThrough());
        dto.setFontUnderline(this.getFontUnderline());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setStrokeColor(this.getStrokeColor() != null ? (UUID)this.getStrokeColor().getIid() : null);
        dto.setStrokeOpacity(this.getStrokeOpacity());
        dto.setStrokeWidth(this.getStrokeWidth());
        dto.getUsedColor().addAll(this.getUsedColor().stream().map(Thing::getIid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
