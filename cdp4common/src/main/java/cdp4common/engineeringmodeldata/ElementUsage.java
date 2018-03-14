/* --------------------------------------------------------------------------------------------------------------------
 * ElementUsage.java
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
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.tuple.Pair;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * named usage of an ElementDefinition in the context of a next higher level ElementDefinition that contains this ElementUsage
 * Note 1: An ElementUsage has one and only one ElementDefinition as its <i>containingElement</i>.
 * Note 2: When an ElementDefinition is made a member of a Category through its <i>category</i> property, then also any ElementUsage typed by such an ElementDefinition is implied to be a member of the same Category.
 * Note 3: A ParameterType "NumberOf" may be defined in an associated ReferenceDataLibrary. Subsequently a "NumberOf" Parameter or ParameterOverride may be added to an ElementUsage as a short-cut to define a number of containedElements that are not named individually. Setting "NumberOf" to a value greater than one is typically only done in early conceptual design. In a later detailed design phase each usage would normally be instantiated individually, so that where needed different usage level Parameters can have different values.
 * Note 4: Both the <i>owner</i> DomainOfExpertise of the <i>containingElement</i> and of the <i>elementDefinition</i> are owner(s) of this ElementUsage, i.e. the union of self.containingElement.owner and self.elementDefinition.owner.
 */
@Container(clazz = ElementDefinition.class, propertyName = "containedElement")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ElementUsage extends ElementBase implements Cloneable, OptionDependentThing, ModelCode {
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
     * Initializes a new instance of the {@link ElementUsage} class.
     */
    public ElementUsage() {
        this.excludeOption = new ArrayList<Option>();
        this.parameterOverride = new ContainerList<ParameterOverride>(this);
    }

    /**
     * Initializes a new instance of the {@link ElementUsage} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ElementUsage(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.excludeOption = new ArrayList<Option>();
        this.parameterOverride = new ContainerList<ParameterOverride>(this);
    }

    /**
     * Property elementDefinition.
     * reference to the ElementDefinition that defines this ElementUsage
     * Note: The <i>elementDefinition</i> of an ElementUsage could also be regarded as the <i>type</i> of the ElementUsage.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ElementDefinition elementDefinition;

    /**
     * List of Option.
     * reference to zero or more Options from which this OptionDependentThing is excluded
     * Note: By default all OptionDependentThings are included in all Options in an EngineeringModel. Only the exclusions are recorded in the data model because this is the most efficient way of storing and handling the option dependency. In client applications it may be more intuitive to show the included Options, but that is a simple transformation.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<Option> excludeOption;

    /**
     * Property interfaceEnd.
     * indication whether this ElementUsage is a (potential) interface end
     * Note 1: An interface end is one side of an interface, where the complete
     * interface is defined as the connection plus two or more interface ends.
     * Note 2: Interface definition is currently not explicitly modelled in
     * this data model. However it is possible to define a Category e.g. named
     * "InterfaceDefinitions", and then instantiate ElementDefinitions and
     * ElementUsages that belong to this category for the interfaces to be
     * defined, using the referencedElement property of ElementUsage to connect
     * architectural elements that represent interface ends.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private InterfaceEndKind interfaceEnd;

    /**
     * List of contained ParameterOverride.
     * representation of zero or more ParameterOverrides to hold overridden values for a Parameter at this ElementUsage level
     * Note: The <i>parameter</i> of this ParameterOverride must be a Parameter of the <i>elementDefinition</i> of the containing ElementUsage.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ParameterOverride> parameterOverride;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link ElementUsage}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link ElementUsage}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.parameterOverride);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link ElementUsage} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ElementUsage}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ElementUsage clone;
        try {
            clone = (ElementUsage)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ElementUsage cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setExcludeOption(new ArrayList<Option>(this.getExcludeOption()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));
        clone.setParameterOverride(cloneContainedThings ? new ContainerList<ParameterOverride>(clone) : new ContainerList<ParameterOverride>(this.getParameterOverride(), clone, false));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getParameterOverride().addAll(this.getParameterOverride().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ElementUsage} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ElementUsage}.
     */
    @Override
    public ElementUsage clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ElementUsage)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ElementUsage}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getElementDefinition() == null || this.getElementDefinition().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property elementDefinition is null.");
            this.setElementDefinition(SentinelThingProvider.getSentinel(ElementDefinition.class));
            this.sentinelResetMap.put("elementDefinition", new ActionImpl(() -> this.setElementDefinition(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ElementUsage} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ElementUsage dto = (cdp4common.dto.ElementUsage)dtoThing;

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        PojoThingFactory.resolveList(this.getCategory(), dto.getCategory(), dto.getIterationContainerId(), this.getCache(), Category.class);
        PojoThingFactory.resolveList(this.getDefinition(), dto.getDefinition(), dto.getIterationContainerId(), this.getCache(), Definition.class);
        this.setElementDefinition(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getElementDefinition(), dto.getIterationContainerId(), ElementDefinition.class), SentinelThingProvider.getSentinel(ElementDefinition.class)));
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getExcludeOption(), dto.getExcludeOption(), dto.getIterationContainerId(), this.getCache(), Option.class);
        PojoThingFactory.resolveList(this.getHyperLink(), dto.getHyperLink(), dto.getIterationContainerId(), this.getCache(), HyperLink.class);
        this.setInterfaceEnd(dto.getInterfaceEnd());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setOwner(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getOwner(), dto.getIterationContainerId(), DomainOfExpertise.class), SentinelThingProvider.getSentinel(DomainOfExpertise.class)));
        PojoThingFactory.resolveList(this.getParameterOverride(), dto.getParameterOverride(), dto.getIterationContainerId(), this.getCache(), ParameterOverride.class);
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ElementUsage}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ElementUsage dto = new cdp4common.dto.ElementUsage(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getCategory().addAll(this.getCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setElementDefinition(this.getElementDefinition() != null ? this.getElementDefinition().getIid() : new UUID(0L, 0L));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludeOption().addAll(this.getExcludeOption().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setInterfaceEnd(this.getInterfaceEnd());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setOwner(this.getOwner() != null ? this.getOwner().getIid() : new UUID(0L, 0L));
        dto.getParameterOverride().addAll(this.getParameterOverride().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Computes the model code of the current {@link ElementUsage}
     * <p>
     * The model code is derived as follows:
     * {@code #ElementDefinition.ShortName#.#ElementUsage.ShortName#}
     * @param componentIndex This parameter is ignored when computing the model code of a {@link ElementDefinition}
     * @return A string that represents the model code of the current {@link ElementUsage}
     * @throws ContainmentException when the containment tree is incomplete
     * @throws IllegalArgumentException when the component index for an {@link ElementUsage} in not null.
     */
    public String modelCode(Integer componentIndex) {
        if (componentIndex != null) {
            throw new IllegalArgumentException("The component index must be null");
        }

        ElementDefinition elementDefinition = this.getContainer() instanceof ElementDefinition ? (ElementDefinition)this.getContainer() : null;
        if (elementDefinition == null) {
            throw new ContainmentException(String.format("The container ElementDefinition of ElementUsage with iid %s is null, the model code cannot be computed.", this.getIid()));
        }

        return String.format("%s.%s", elementDefinition.modelCode(null), this.getShortName());
    }

    /**
     * Gets a value indicating whether this {@link ElementUsage} can be published.
     */
    @Override
    public boolean canBePublished() {
        return this.getParameterOverride().stream().anyMatch(ParameterOverride::canBePublished);
    }

    /**
     * Gets a value indicating whether this {@link ElementUsage} will be published in the next {@link Publication}.
     */
    @Override
    public boolean getToBePublished() {
        return this.canBePublished() && this.getParameterOverride().stream().filter(ParameterOverride::canBePublished).allMatch(ParameterOrOverrideBase::getToBePublished);
    }

    /**
     * Sets a value indicating whether this {@link ElementUsage} will be published in the next {@link Publication}.
     *
     * @param toBePublished a value to set
     */
    @Override
    public void setToBePublished(boolean toBePublished) {
        for (ParameterOverride parameterOverride : this.getParameterOverride().stream().filter(ParameterOverride::canBePublished).collect(Collectors.toList())) {
            parameterOverride.setToBePublished(toBePublished);
        }
    }
}
