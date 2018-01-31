/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParticipantRole.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

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
 * representation of the named role of a Participant that defines the Participant's permissions and access rights with respect to data in an EngineeringModel
 * Note: When creating a new ParticipantRole, the user shall define ParticipantPermissions for all ClassKinds that have a <i>defaultPersonAccess</i> equal to ParticipantAccessRightKind.NONE. For all ClassKinds that have a <i>defaultParticipantAccess</i> not equal to ParticipantAccessRightKind.NONE, a ParticipantPermission with <i>accessRight</i> equal to <i>defaultParticipantAccess</i> for that ClassKind shall be defined. See ParticipantAccessRightKind for details.
 */
@Container(clazz = SiteDirectory.class, propertyName = "participantRole")
@ToString
@EqualsAndHashCode
public  class ParticipantRole extends DefinedThing implements Cloneable, DeprecatableThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NONE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the {@link ParticipantRole} class.
     */
    public ParticipantRole() {
        this.participantPermission = new ContainerList<ParticipantPermission>(this);
        this.populateParticipantPermissions();
    }

    /**
     * Initializes a new instance of the {@link ParticipantRole} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ParticipantRole(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.participantPermission = new ContainerList<ParticipantPermission>(this);
        this.populateParticipantPermissions();
    }

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isDeprecated;

    /**
     * List of contained ParticipantPermission.
     * references to the ParticipantPermissions assigned to this ParticipantRole
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ParticipantPermission> participantPermission;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link ParticipantRole}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getDeprecated(){
         return this.isDeprecated;
    }

    /**
     * Gets a list of contained ParticipantPermission.
     * references to the ParticipantPermissions assigned to this ParticipantRole
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ParticipantPermission> getParticipantPermission(){
         return this.participantPermission;
    }

    /**
     *Sets a value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDeprecated(boolean isDeprecated){
        this.isDeprecated = isDeprecated;
    }

    /**
     * Sets a list of contained ParticipantPermission.
     * references to the ParticipantPermissions assigned to this ParticipantRole
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setParticipantPermission(ContainerList<ParticipantPermission> participantPermission){
        this.participantPermission = participantPermission;
    }

    /**
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link ParticipantRole}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
        containers.add(this.participantPermission);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link ParticipantRole} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParticipantRole}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ParticipantRole clone;
        try {
            clone = (ParticipantRole)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ParticipantRole cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));
        clone.setParticipantPermission(cloneContainedThings ? new ContainerList<ParticipantPermission>(clone) : new ContainerList<ParticipantPermission>(this.getParticipantPermission(), clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getParticipantPermission().addAll(this.getParticipantPermission().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ParticipantRole} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParticipantRole}.
     */
    @Override
    public ParticipantRole clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParticipantRole)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ParticipantRole}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ParticipantRole} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParticipantRole dto = (cdp4common.dto.ParticipantRole)dtoThing;

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setDeprecated(dto.getDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.getParticipantPermission().resolveList(dto.getParticipantPermission(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ParticipantRole}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ParticipantRole dto = new cdp4common.dto.ParticipantRole(this.getIid(), this.getRevisionNumber());

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setDeprecated(this.getDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getParticipantPermission().add(this.getParticipantPermission().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
