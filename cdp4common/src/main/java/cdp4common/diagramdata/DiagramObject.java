/* --------------------------------------------------------------------------------------------------------------------
 * DiagramObject.java
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
 * Diagram is an abstract container of a graph of diagram elements. Diagrams are diagram elements with an origin point in
 * the x-y coordinate system. Their elements are laid out relative to their origin point.
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = DiagramElementContainer.class, propertyName = "diagramElement")
@ToString
@EqualsAndHashCode(callSuper = true)
public class DiagramObject extends DiagramShape implements Cloneable {
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
     * Initializes a new instance of the {@link DiagramObject} class.
     */
    public DiagramObject() {
    }

    /**
     * Initializes a new instance of the {@link DiagramObject} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public DiagramObject(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property documentation.
     * The documentation of this DiagramObject
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String documentation;

    /**
     * Property resolution.
     * The resolution of the diagram expressed in user units per inch
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private float resolution;

    /**
     * Creates and returns a copy of this {@link DiagramObject} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DiagramObject}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        DiagramObject clone;
        try {
            clone = (DiagramObject)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow DiagramObject cannot be cloned.");
        }

        clone.setBounds(cloneContainedThings ? new ContainerList<Bounds>(clone) : new ContainerList<Bounds>(this.getBounds(), clone, false));
        clone.setDiagramElement(cloneContainedThings ? new ContainerList<DiagramElementThing>(clone) : new ContainerList<DiagramElementThing>(this.getDiagramElement(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setLocalStyle(cloneContainedThings ? new ContainerList<OwnedStyle>(clone) : new ContainerList<OwnedStyle>(this.getLocalStyle(), clone, false));

        if (cloneContainedThings) {
            clone.getBounds().addAll(this.getBounds().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDiagramElement().addAll(this.getDiagramElement().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getLocalStyle().addAll(this.getLocalStyle().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link DiagramObject} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DiagramObject}.
     */
    @Override
    public DiagramObject clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DiagramObject)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this DiagramObject}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (Strings.isNullOrEmpty(this.getDocumentation())) {
            errorList.add("The property documentation is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link DiagramObject} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.DiagramObject dto = (cdp4common.dto.DiagramObject)dtoThing;

        PojoThingFactory.resolveList(this.getBounds(), dto.getBounds(), dto.getIterationContainerId(), this.getCache(), Bounds.class);
        this.setDepictedThing((dto.getDepictedThing() != null) ? PojoThingFactory.get(this.getCache(), dto.getDepictedThing(), dto.getIterationContainerId(), Thing.class) : null);
        PojoThingFactory.resolveList(this.getDiagramElement(), dto.getDiagramElement(), dto.getIterationContainerId(), this.getCache(), DiagramElementThing.class);
        this.setDocumentation(dto.getDocumentation());
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getLocalStyle(), dto.getLocalStyle(), dto.getIterationContainerId(), this.getCache(), OwnedStyle.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setResolution(dto.getResolution());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setSharedStyle((dto.getSharedStyle() != null) ? PojoThingFactory.get(this.getCache(), dto.getSharedStyle(), dto.getIterationContainerId(), SharedStyle.class) : null);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link DiagramObject}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.DiagramObject dto = new cdp4common.dto.DiagramObject(this.getIid(), this.getRevisionNumber());

        dto.getBounds().addAll(this.getBounds().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDepictedThing(this.getDepictedThing() != null ? (UUID)this.getDepictedThing().getIid() : null);
        dto.getDiagramElement().addAll(this.getDiagramElement().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDocumentation(this.getDocumentation());
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getLocalStyle().addAll(this.getLocalStyle().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setResolution(this.getResolution());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setSharedStyle(this.getSharedStyle() != null ? (UUID)this.getSharedStyle().getIid() : null);

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
