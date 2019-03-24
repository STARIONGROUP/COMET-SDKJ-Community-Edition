/* --------------------------------------------------------------------------------------------------------------------
 * DomainOfExpertise.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

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
 * representation of a coherent set of experience, skills, methods, standards and tools in a specific field of knowledge relevant to an engineering process
 * Note 1: The definition of domain in the Concise English Oxford Dictionary is "sphere of activity or knowledge". This includes the notion of <i>discipline</i>. A DomainOfExpertise designates one of the fields of expertise that are needed in a particular modelling activity.
 * Note 2: In space system life cycle activities, typically for each required domain of expertise at least one person in the development or operation team is assigned responsibility for the domain related aspects. However, one person may be responsible for more than one domain / discipline.
 */
@Container(clazz = SiteDirectory.class, propertyName = "domain")
@ToString
@EqualsAndHashCode(callSuper = true)
public class DomainOfExpertise extends DefinedThing implements Cloneable, CategorizableThing, DeprecatableThing {
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
     * Initializes a new instance of the {@link DomainOfExpertise} class.
     */
    public DomainOfExpertise() {
        this.category = new ArrayList<Category>();
    }

    /**
     * Initializes a new instance of the {@link DomainOfExpertise} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public DomainOfExpertise(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.category = new ArrayList<Category>();
    }

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<Category> category;

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean isDeprecated;

    /**
     * Creates and returns a copy of this {@link DomainOfExpertise} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DomainOfExpertise}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        DomainOfExpertise clone;
        try {
            clone = (DomainOfExpertise)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow DomainOfExpertise cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link DomainOfExpertise} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link DomainOfExpertise}.
     */
    @Override
    public DomainOfExpertise clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (DomainOfExpertise)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this DomainOfExpertise}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link DomainOfExpertise} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.DomainOfExpertise dto = (cdp4common.dto.DomainOfExpertise)dtoThing;

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        PojoThingFactory.resolveList(this.getCategory(), dto.getCategory(), dto.getIterationContainerId(), this.getCache(), Category.class);
        PojoThingFactory.resolveList(this.getDefinition(), dto.getDefinition(), dto.getIterationContainerId(), this.getCache(), Definition.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getHyperLink(), dto.getHyperLink(), dto.getIterationContainerId(), this.getCache(), HyperLink.class);
        this.setDeprecated(dto.isDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link DomainOfExpertise}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.DomainOfExpertise dto = new cdp4common.dto.DomainOfExpertise(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getCategory().addAll(this.getCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDeprecated(this.isDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Gets or sets a value indicating whether this {@link DomainOfExpertise} can be published based on the
     * provided {@link Iteration}.
     *
     * @param iteration The iteration to perform the check on.
     * @return True if this {@link DomainOfExpertise} has {@link ParameterOrOverrideBase}s that can be published.
     */
    public boolean canBePublished(Iteration iteration) {
        return this.getOwnedParameters(iteration).stream().anyMatch(ParameterOrOverrideBase::canBePublished);
    }

    /**
     * Gets the list of {@link ParameterOrOverrideBase} owned by this {@link DomainOfExpertise} based on {@link Iteration}.
     *
     * @param iteration The {@link Iteration} to perform the check on.
     * @return All {@link Parameter}s and {@link ParameterOverride}s that this {@link DomainOfExpertise} owns.
     */
    public List<ParameterOrOverrideBase> getOwnedParameters(Iteration iteration) {
        List<Parameter> parameters = iteration.getElement().stream().flatMap(element -> element.getParameter().stream()).filter(parameter -> parameter.getOwner().equals(this)).collect(Collectors.toList());
        List<ParameterOverride> parameterOverrides = iteration.getElement().stream().flatMap(ele -> ele.getContainedElement().stream()).flatMap(usage -> usage.getParameterOverride().stream()).filter(parameterOverride -> parameterOverride.getOwner().equals(this)).collect(Collectors.toList());

        List<ParameterOrOverrideBase> ownedParameters = new ArrayList<>();
        ownedParameters.addAll(parameters);
        ownedParameters.addAll(parameterOverrides);
        return ownedParameters;
    }

    /**
     * Gets the list of {@link ParameterOrOverrideBase} owned by this {@link DomainOfExpertise} based on {@link Iteration} that can be published.
     *
     * @param iteration The {@link Iteration} to perform the check on.
     * @return All {@link Parameter}s and {@link ParameterOverride}s that this {@link DomainOfExpertise} owns that can be published.
     */
    public List<ParameterOrOverrideBase> getOwnedParametersThatCanBePublished(Iteration iteration) {
        return this.getOwnedParameters(iteration).stream().filter(ParameterOrOverrideBase::canBePublished).collect(Collectors.toList());
    }

    /**
     * Gets the list of {@link ParameterOrOverrideBase} owned by this {@link DomainOfExpertise} based on {@link Iteration} to be published.
     *
     * @param iteration The {@link Iteration} to perform the check on.
     * @return All {@link Parameter}s and {@link ParameterOverride}s that this {@link DomainOfExpertise} owns that can be published.
     */
    public List<ParameterOrOverrideBase> getOwnedParametersToBePublished(Iteration iteration) {
        return this.getOwnedParameters(iteration).stream().filter(p -> p.canBePublished() && p.getToBePublished()).collect(Collectors.toList());
    }
}
