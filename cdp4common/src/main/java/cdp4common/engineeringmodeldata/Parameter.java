/* --------------------------------------------------------------------------------------------------------------------
 * Parameter.java
 * Copyright (c) 2018 RHEA System S.A.
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
import org.apache.commons.lang3.tuple.Pair;
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of a parameter that defines a characteristic or property of an ElementDefinition
 * Note 1: The concurrent engineering process is centered around a multi-disciplinary parametric definition of the system of interest. Parameters (with values) assigned to ElementDefinitions, ElementUsages and possibly NestedElements are the essential mechanism by which each DomainOfExpertise characterises, quantifies, communicates and shares their part of a design solution with all other domains of expertise (DomainOfExpertise).
 * Note 2: The associated ParameterType (through the parameterType property) provides name, shortName, and optionally alias, definition and hyperLink for this Parameter.
 */
@Container(clazz = ElementDefinition.class, propertyName = "parameter")
@ToString
@EqualsAndHashCode(callSuper = true)
public class Parameter extends ParameterOrOverrideBase implements Cloneable {
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
     * Initializes a new instance of the {@link Parameter} class.
     */
    public Parameter() {
        this.valueSet = new ContainerList<ParameterValueSet>(this);
    }

    /**
     * Initializes a new instance of the {@link Parameter} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public Parameter(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.valueSet = new ContainerList<ParameterValueSet>(this);
    }

    /**
     * Value indicating whether allowDifferentOwnerOfOverride.
     * assertion whether a ParameterOverride associated with this Parameter may have a different owner DomainOfExpertise or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean allowDifferentOwnerOfOverride;

    /**
     * Value indicating whether expectsOverride.
     * assertion whether a ParameterOverride is expected for this Parameter in ElementUsages of the ElementDefinition that contains this Parameter
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean expectsOverride;

    /**
     * Property requestedBy.
     * optional reference to the DomainOfExpertise that has requested this Parameter
     * Note: This property is used to signify that a Parameter has not been created (i.e. added to an ElementDefinition) by the owner DomainOfExpertise by is requested by a different DomainOfExpertise. When the value is unset (i.e. set to null) it signifies that the Parameter has been accepted by the owner DomainOfExpertise.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private DomainOfExpertise requestedBy;

    /**
     * List of contained ParameterValueSet.
     * representation of the switch and values of this Parameter
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ParameterValueSet> valueSet;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link Parameter}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets an {@link List<List>} that references the composite properties of the current {@link Parameter}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<List>(super.getContainerLists());
        containers.add(this.valueSet);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link Parameter} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Parameter}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        Parameter clone;
        try {
            clone = (Parameter)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow Parameter cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setParameterSubscription(cloneContainedThings ? new ContainerList<ParameterSubscription>(clone) : new ContainerList<ParameterSubscription>(this.getParameterSubscription(), clone, false));
        clone.setValueSet(cloneContainedThings ? new ContainerList<ParameterValueSet>(clone) : new ContainerList<ParameterValueSet>(this.getValueSet(), clone, false));

        if (cloneContainedThings) {
            clone.getParameterSubscription().addAll(this.getParameterSubscription().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getValueSet().addAll(this.getValueSet().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link Parameter} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Parameter}.
     */
    @Override
    public Parameter clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Parameter)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this Parameter}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int valueSetCount = this.getValueSet().size();
        if (valueSetCount < 1) {
            errorList.add("The number of elements in the property valueSet is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link Parameter} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Parameter dto = (cdp4common.dto.Parameter)dtoThing;

        this.setAllowDifferentOwnerOfOverride(dto.getAllowDifferentOwnerOfOverride());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setExpectsOverride(dto.getExpectsOverride());
        this.setGroup((dto.getGroup() != null) ? this.getCache().get<ParameterGroup>(dto.getGroup.getValue(), dto.getIterationContainerId()) : null);
        this.setOptionDependent(dto.isOptionDependent());
        this.setModifiedOn(dto.getModifiedOn());
        this.setOwner(this.getCache().get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel(DomainOfExpertise.class));
        this.getParameterSubscription().resolveList(dto.getParameterSubscription(), dto.getIterationContainerId(), this.getCache());
        this.setParameterType(this.getCache().get<ParameterType>(dto.getParameterType(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel(ParameterType.class));
        this.setRequestedBy((dto.getRequestedBy() != null) ? this.getCache().get<DomainOfExpertise>(dto.getRequestedBy.getValue(), dto.getIterationContainerId()) : null);
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setScale((dto.getScale() != null) ? this.getCache().get<MeasurementScale>(dto.getScale.getValue(), dto.getIterationContainerId()) : null);
        this.setStateDependence((dto.getStateDependence() != null) ? this.getCache().get<ActualFiniteStateList>(dto.getStateDependence.getValue(), dto.getIterationContainerId()) : null);
        this.getValueSet().resolveList(dto.getValueSet(), dto.getIterationContainerId(), this.getCache());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link Parameter}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() throws ContainmentException {
        cdp4common.dto.Parameter dto = new cdp4common.dto.Parameter(this.getIid(), this.getRevisionNumber());

        dto.setAllowDifferentOwnerOfOverride(this.getAllowDifferentOwnerOfOverride());
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setExpectsOverride(this.getExpectsOverride());
        dto.setGroup(this.getGroup() != null ? (UUID)this.getGroup().getIid() : null);
        dto.setOptionDependent(this.isOptionDependent());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.getParameterSubscription().addAll(this.getParameterSubscription().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setParameterType(this.getParameterType() != null ? this.getParameterType().getIid() : new UUID(0L, 0L));
        dto.setRequestedBy(this.getRequestedBy() != null ? (UUID)this.getRequestedBy().getIid() : null);
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setScale(this.getScale() != null ? (UUID)this.getScale().getIid() : null);
        dto.setStateDependence(this.getStateDependence() != null ? (UUID)this.getStateDependence().getIid() : null);
        dto.getValueSet().addAll(this.getValueSet().stream().map(Thing::getIid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
