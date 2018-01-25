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

/**
 * A shared style that may be used in different diagrams
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = Iteration.class, propertyName = "sharedDiagramStyle")
public abstract class AbstractSharedStyle extends AbstractDiagrammingStyle  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_N_E;

    /**
     * Initializes a new instance of the <code>SharedStyle<code/> class.
     *
     * @see SharedStyle
     */
    public AbstractSharedStyle() {
    }

    /**
     * Initializes a new instance of the <code>SharedStyle<code/> class.
     * @param iid The unique identifier.
     * @param cache The <code>ConcurrentHashMap<K,V></code> where the current thing is stored.
     * The <code>Pair<L,R><code/> of <code>UUID<code/> is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its <code>Iteration<code/> container if applicable or null.
     * @param iDalUri The <code>URI</code> of this thing
     *
     * @see ConcurrentHashMap
     * @see URI
     * @see UUID
     * @see Pair
     * @see Iteration
     * @see SharedStyle
     */
    public AbstractSharedStyle(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Creates and returns a copy of this <code>SharedStyle<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>SharedStyle<code/>.
     *
     * @see SharedStyle
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        SharedStyle clone = (SharedStyle)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setUsedColor(cloneContainedThings ? new ContainerList<Color>(clone) : new ContainerList<Color>(this.usedColor, clone));

        if (cloneContainedThings) {
            clone.getUsedColor().addAll(this.usedColor.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>SharedStyle<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>SharedStyle<code/>.
     * 
     * @see SharedStyle
     */
    @Override
    public SharedStyle clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SharedStyle)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>SharedStyle<code/>.
     *
     * @return A list of potential errors.
     *
     * @see SharedStyle
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>SharedStyle<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see SharedStyle
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.SharedStyle dto = (cdp4common.dto.SharedStyle)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.fillColor = (dto.getFillColor() != null) ? this.cache.get<Color>(dto.getFillColor.getValue(), dto.getIterationContainerId()) : null;
        this.fillOpacity = dto.getFillOpacity();
        this.fontBold = dto.getFontBold();
        this.fontColor = (dto.getFontColor() != null) ? this.cache.get<Color>(dto.getFontColor.getValue(), dto.getIterationContainerId()) : null;
        this.fontItalic = dto.getFontItalic();
        this.fontName = dto.getFontName();
        this.fontSize = dto.getFontSize();
        this.fontStrokeThrough = dto.getFontStrokeThrough();
        this.fontUnderline = dto.getFontUnderline();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.revisionNumber = dto.getRevisionNumber();
        this.strokeColor = (dto.getStrokeColor() != null) ? this.cache.get<Color>(dto.getStrokeColor.getValue(), dto.getIterationContainerId()) : null;
        this.strokeOpacity = dto.getStrokeOpacity();
        this.strokeWidth = dto.getStrokeWidth();
        this.usedColor.resolveList(dto.getUsedColor(), dto.getIterationContainerId(), this.cache);

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>SharedStyle<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see SharedStyle
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.SharedStyle dto = new cdp4common.dto.SharedStyle(this.iid, this.revisionNumber);

        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setFillColor(this.fillColor != null ? (UUID)this.fillColor.getIid() : null);
        dto.setFillOpacity(this.fillOpacity);
        dto.setFontBold(this.fontBold);
        dto.setFontColor(this.fontColor != null ? (UUID)this.fontColor.getIid() : null);
        dto.setFontItalic(this.fontItalic);
        dto.setFontName(this.fontName);
        dto.setFontSize(this.fontSize);
        dto.setFontStrokeThrough(this.fontStrokeThrough);
        dto.setFontUnderline(this.fontUnderline);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setStrokeColor(this.strokeColor != null ? (UUID)this.strokeColor.getIid() : null);
        dto.setStrokeOpacity(this.strokeOpacity);
        dto.setStrokeWidth(this.strokeWidth);
        dto.getUsedColor().add(this.usedColor.stream().map(x -> x.Iid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
