/* --------------------------------------------------------------------------------------------------------------------
 * NestedElement.java
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
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of an explicit element of a system-of-interest in a fully expanded architectural decomposition tree for one Option
 * Note 1: The hierarchy of NestedElements can be automatically generated from the implicit composite structure defined by ElementDefinitions and contained ElementUsages, and configured for an Option.
 * Note 2: The unique path to a single, possibly deeply nested, NestedElement is defined by the <i>topElement</i> of the relevant Iteration (which is the same for all Options) and an ordered list of subtended ElementUsage references.
 * Note 3: The NestedElement is an explicit representation of the so-called "deeply nested connector" concept in OMG SysML (v1.3).
 * Example: Assume a spacecraft with a service module "sm" (an ElementUsage of ElementDefinition "SM") and two solar array wings with three panels each. The NestedElement representing panel 2 on wing 1 would be defined by the <i>topElement</i> ElementDefinition for the spacecraft (the "system-of-interest"), and a list of elementUsages referencing: the "sm" usage, the  "wing1" usage, the "panel2" usage, in that order.
 */
@Container(clazz = Option.class, propertyName = "nestedElement")
@ToString
@EqualsAndHashCode(callSuper = true)
public class NestedElement extends Thing implements Cloneable, NamedThing, OwnedThing, ShortNamedThing, VolatileThing {
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
     * Initializes a new instance of the {@link NestedElement} class.
     */
    public NestedElement() {
        this.elementUsage = new OrderedItemList<ElementUsage>(this, ElementUsage.class);
        this.nestedParameter = new ContainerList<NestedParameter>(this);
    }

    /**
     * Initializes a new instance of the {@link NestedElement} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public NestedElement(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.elementUsage = new OrderedItemList<ElementUsage>(this, ElementUsage.class);
        this.nestedParameter = new ContainerList<NestedParameter>(this);
    }

    /**
     * List of ordered ElementUsage.
     * unique path to a single NestedElement defined by an ordered list of references to ElementUsages
     * Note: The first ElementUsage in the list must be a <i>containedElement</i> of the topElement of the relevant Iteration, the second ElementUsage must be a <i>containedElement</i> of the ElementDefinition pointed to by the <i>elementDefinition</i> of the first ElementUsage, and so on until the intended nested ElementUsage is reached.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private OrderedItemList<ElementUsage> elementUsage;

    /**
     * Value indicating whether isVolatile.
     * Note: When an instance is marked volatile it will not be persisted in the persistent data store. This meant to allow for runtime-only use of such instances in a client application.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean isVolatile;

    /**
     * Property name.
     * name derived from chain of the names of the <i>rootElement</i> and <i>elementUsage</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String name;

    /**
     * List of contained NestedParameter.
     * ordered list of NestedParameters that defined the fully expanded parametric representation for this NestedElement for a combination of one Option and one DomainOfExpertise
     * Note: NestedParameters are meant to be present only on generated NestedElements.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<NestedParameter> nestedParameter;

    /**
     * Property owner.
     * reference to the owner DomainOfExpertise of this NestedElement
     * Note: The owner DomainOfExpertise of this NestedElement is the same as the owner of the last ElementUsage in the <i>elementUsage</i> path.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private DomainOfExpertise owner;

    /**
     * Property rootElement.
     * reference to the root ElementDefinition at which the path to this NestedElement starts
     * Note: For an EngineeringModel that is an EngineeringModelKind.STUDY_MODEL this is typically the <i>topElement</i> of the selected Iteration. However the rootElement may be any ElementDefinition which allows for the generation of subtrees subtended from anywhere in the composite structure of a model, which is for example useful in EngineeringModels that are of the EngineeringModelKind.CATALOGUE kind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ElementDefinition rootElement;

    /**
     * Property shortName.
     * short name derived from chain of the names of the <i>rootElement</i> and <i>elementUsage</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String shortName;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link NestedElement}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets the name.
     * name derived from chain of the names of the <i>rootElement</i> and <i>elementUsage</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public String getName(){
        return this.getDerivedName();
    }

    /**
     * Gets the owner.
     * reference to the owner DomainOfExpertise of this NestedElement
     * Note: The owner DomainOfExpertise of this NestedElement is the same as the owner of the last ElementUsage in the <i>elementUsage</i> path.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public DomainOfExpertise getOwner(){
        return this.getDerivedOwner();
    }

    /**
     * Gets the shortName.
     * short name derived from chain of the names of the <i>rootElement</i> and <i>elementUsage</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public String getShortName(){
        return this.getDerivedShortName();
    }

    /**
     * Sets the name.
     * name derived from chain of the names of the <i>rootElement</i> and <i>elementUsage</i>
     *
     * @throws IllegalStateException The name property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public void setName(String name){
        throw new IllegalStateException("Forbidden Set value for the derived property NestedElement.name");
    }

    /**
     * Sets the owner.
     * reference to the owner DomainOfExpertise of this NestedElement
     * Note: The owner DomainOfExpertise of this NestedElement is the same as the owner of the last ElementUsage in the <i>elementUsage</i> path.
     *
     * @throws IllegalStateException The owner property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public void setOwner(DomainOfExpertise owner){
        throw new IllegalStateException("Forbidden Set value for the derived property NestedElement.owner");
    }

    /**
     * Sets the shortName.
     * short name derived from chain of the names of the <i>rootElement</i> and <i>elementUsage</i>
     *
     * @throws IllegalStateException The shortName property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public void setShortName(String shortName){
        throw new IllegalStateException("Forbidden Set value for the derived property NestedElement.shortName");
    }

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link NestedElement}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.nestedParameter);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link NestedElement} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link NestedElement}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        NestedElement clone;
        try {
            clone = (NestedElement)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow NestedElement cannot be cloned.");
        }

        clone.setElementUsage(new OrderedItemList<ElementUsage>(this.getElementUsage(), this, ElementUsage.class));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setNestedParameter(cloneContainedThings ? new ContainerList<NestedParameter>(clone) : new ContainerList<NestedParameter>(this.getNestedParameter(), clone, false));

        if (cloneContainedThings) {
            clone.getNestedParameter().addAll(this.getNestedParameter().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link NestedElement} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link NestedElement}.
     */
    @Override
    public NestedElement clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (NestedElement)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this NestedElement}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int elementUsageCount = this.getElementUsage().size();
        if (elementUsageCount < 1) {
            errorList.add("The number of elements in the property elementUsage is wrong. It should be at least 1.");
        }

        if (this.getRootElement() == null || this.getRootElement().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property rootElement is null.");
            this.setRootElement(SentinelThingProvider.getSentinel(ElementDefinition.class));
            this.sentinelResetMap.put("rootElement", new ActionImpl(() -> this.setRootElement(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link NestedElement} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.NestedElement dto = (cdp4common.dto.NestedElement)dtoThing;

        PojoThingFactory.resolveList(this.getElementUsage(), dto.getElementUsage(), dto.getIterationContainerId(), this.getCache(), ElementUsage.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setVolatile(dto.isVolatile());
        this.setModifiedOn(dto.getModifiedOn());
        PojoThingFactory.resolveList(this.getNestedParameter(), dto.getNestedParameter(), dto.getIterationContainerId(), this.getCache(), NestedParameter.class);
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setRootElement(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getRootElement(), dto.getIterationContainerId(), ElementDefinition.class), SentinelThingProvider.getSentinel(ElementDefinition.class)));

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link NestedElement}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.NestedElement dto = new cdp4common.dto.NestedElement(this.getIid(), this.getRevisionNumber());

        dto.getElementUsage().addAll(this.getElementUsage().toDtoOrderedItemList());
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setVolatile(this.isVolatile());
        dto.setModifiedOn(this.getModifiedOn());
        dto.getNestedParameter().addAll(this.getNestedParameter().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setRootElement(this.getRootElement() != null ? this.getRootElement().getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
