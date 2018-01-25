/* --------------------------------------------------------------------------------------------------------------------
 * AbstractDiagramObject.java
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
 * Diagram is an abstract container of a graph of diagram elements. Diagrams are diagram elements with an origin point in
 * the x-y coordinate system. Their elements are laid out relative to their origin point.
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = DiagramElementContainer.class, propertyName = "diagramElement")
public abstract class AbstractDiagramObject extends AbstractDiagramShape  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>DiagramObject<code/> class.
     *
     * @see DiagramObject
     */
    public AbstractDiagramObject() {
    }

    /**
     * Initializes a new instance of the <code>DiagramObject<code/> class.
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
     * @see DiagramObject
     */
    public AbstractDiagramObject(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property documentation.
     * The documentation of this DiagramObject
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String documentation;

    /**
     * Property resolution.
     * The resolution of the diagram expressed in user units per inch
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private float resolution;

    /**
     * Gets the documentation.
     * The documentation of this DiagramObject
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getDocumentation(){
         return this.documentation;
    }

    /**
     * Gets the resolution.
     * The resolution of the diagram expressed in user units per inch
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public float getResolution(){
         return this.resolution;
    }

    /**
     * Sets the documentation.
     * The documentation of this DiagramObject
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDocumentation(String documentation){
        this.documentation = documentation;
    }

    /**
     * Sets the resolution.
     * The resolution of the diagram expressed in user units per inch
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setResolution(float resolution){
        this.resolution = resolution;
    }

    /**
     * Creates and returns a copy of this <code>DiagramObject<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DiagramObject<code/>.
     *
     * @see DiagramObject
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        DiagramObject clone = (DiagramObject)this.clone();
        clone.setBounds(cloneContainedThings ? new ContainerList<Bounds>(clone) : new ContainerList<Bounds>(this.bounds, clone));
        clone.setDiagramElement(cloneContainedThings ? new ContainerList<DiagramElementThing>(clone) : new ContainerList<DiagramElementThing>(this.diagramElement, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setLocalStyle(cloneContainedThings ? new ContainerList<OwnedStyle>(clone) : new ContainerList<OwnedStyle>(this.localStyle, clone));

        if (cloneContainedThings) {
            clone.getBounds().addAll(this.bounds.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDiagramElement().addAll(this.diagramElement.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getLocalStyle().addAll(this.localStyle.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>DiagramObject<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>DiagramObject<code/>.
     * 
     * @see DiagramObject
     */
    @Override
    public DiagramObject clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DiagramObject)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>DiagramObject<code/>.
     *
     * @return A list of potential errors.
     *
     * @see DiagramObject
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.documentation.trim().isEmpty()) {
            errorList.add("The property documentation is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>DiagramObject<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see DiagramObject
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.DiagramObject dto = (cdp4common.dto.DiagramObject)dtoThing;

        this.bounds.resolveList(dto.getBounds(), dto.getIterationContainerId(), this.cache);
        this.depictedThing = (dto.getDepictedThing() != null) ? this.cache.get<Thing>(dto.getDepictedThing.getValue(), dto.getIterationContainerId()) : null;
        this.diagramElement.resolveList(dto.getDiagramElement(), dto.getIterationContainerId(), this.cache);
        this.documentation = dto.getDocumentation();
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.localStyle.resolveList(dto.getLocalStyle(), dto.getIterationContainerId(), this.cache);
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.resolution = dto.getResolution();
        this.revisionNumber = dto.getRevisionNumber();
        this.sharedStyle = (dto.getSharedStyle() != null) ? this.cache.get<SharedStyle>(dto.getSharedStyle.getValue(), dto.getIterationContainerId()) : null;

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>DiagramObject<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see DiagramObject
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.DiagramObject dto = new cdp4common.dto.DiagramObject(this.iid, this.revisionNumber);

        dto.getBounds().add(this.bounds.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setDepictedThing(this.depictedThing != null ? (UUID)this.depictedThing.getIid() : null);
        dto.getDiagramElement().add(this.diagramElement.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setDocumentation(this.documentation);
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getLocalStyle().add(this.localStyle.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.setResolution(this.resolution);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setSharedStyle(this.sharedStyle != null ? (UUID)this.sharedStyle.getIid() : null);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
