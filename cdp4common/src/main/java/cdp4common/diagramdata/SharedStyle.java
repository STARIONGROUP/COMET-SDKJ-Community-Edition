/* --------------------------------------------------------------------------------------------------------------------
 * AbstractSharedStyle.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.diagramdata;

import java.util.*;
import java.util.concurrent.*;
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
import org.apache.commons.lang3.tuple.Pair;
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * A shared style that may be used in different diagrams
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = Iteration.class, propertyName = "sharedDiagramStyle")
@ToString
@EqualsAndHashCode
public  class SharedStyle extends DiagrammingStyle  {
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
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public SharedStyle(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
    }

    /**
     * Creates and returns a copy of this {@link SharedStyle} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SharedStyle}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        SharedStyle clone = (SharedStyle)this.clone();
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setUsedColor(cloneContainedThings ? new ContainerList<Color>(clone) : new ContainerList<Color>(this.getUsedColor(), clone));

        if (cloneContainedThings) {
            clone.getUsedColor().addAll(this.getUsedColor().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
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
    public SharedStyle clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SharedStyle)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>SharedStyle}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
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

        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setFillColor((dto.getFillColor() != null) ? this.getCache().get<Color>(dto.getFillColor.getValue(), dto.getIterationContainerId()) : null);
        this.setFillOpacity(dto.getFillOpacity());
        this.setFontBold(dto.getFontBold());
        this.setFontColor((dto.getFontColor() != null) ? this.getCache().get<Color>(dto.getFontColor.getValue(), dto.getIterationContainerId()) : null);
        this.setFontItalic(dto.getFontItalic());
        this.setFontName(dto.getFontName());
        this.setFontSize(dto.getFontSize());
        this.setFontStrokeThrough(dto.getFontStrokeThrough());
        this.setFontUnderline(dto.getFontUnderline());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setStrokeColor((dto.getStrokeColor() != null) ? this.getCache().get<Color>(dto.getStrokeColor.getValue(), dto.getIterationContainerId()) : null);
        this.setStrokeOpacity(dto.getStrokeOpacity());
        this.setStrokeWidth(dto.getStrokeWidth());
        this.getUsedColor().resolveList(dto.getUsedColor(), dto.getIterationContainerId(), this.getCache());

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

        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
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
        dto.getUsedColor().add(this.getUsedColor().stream().map(x -> x.getIid()).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
