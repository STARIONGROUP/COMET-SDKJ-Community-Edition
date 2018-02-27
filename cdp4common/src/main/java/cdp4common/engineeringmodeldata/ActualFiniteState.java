/* --------------------------------------------------------------------------------------------------------------------
 * ActualFiniteState.java
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
 * representation of an actual finite state in an ActualFiniteStateList
 * Note: Such an actual finite state may is composed of as many possible finite states as there are PossibleFiniteStateLists associated to the containing ActualFiniteStateList of this ActualFiniteState. An ActualFiniteState can be associated with a ParameterValueSet for a Parameter (or ParameterOverride) that has a <i>stateDependence</i>, as well as for a ParameterSubscriptionValueSet for such a Parameter or ParameterOverride.
 */
@Container(clazz = ActualFiniteStateList.class, propertyName = "actualState")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ActualFiniteState extends Thing implements Cloneable, NamedThing, OwnedThing, ShortNamedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the {@link ActualFiniteState} class.
     */
    public ActualFiniteState() {
        this.possibleState = new ArrayList<PossibleFiniteState>();
    }

    /**
     * Initializes a new instance of the {@link ActualFiniteState} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ActualFiniteState(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.possibleState = new ArrayList<PossibleFiniteState>();
    }

    /**
     * Property kind.
     * assertion of the kind of ActualFiniteState
     * Note: See definitions for ActualFiniteStateKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ActualFiniteStateKind kind;

    /**
     * Property name.
     * name derived from the <i>possibleState</i> by concatenation of the names of each referenced PossibleFiniteState
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Getter
    private String name;

    /**
     * Property owner.
     * reference to the DomainOfExpertise that owns (i.e. is responsible for) this ActualFiniteState
     * Note: This is a derived property. It is always the same DomainOfExpertise as the <i>owner</i> of the containing ActualFiniteStateList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Getter
    private DomainOfExpertise owner;

    /**
     * List of PossibleFiniteState.
     * Note: The set must include one PossibleFiniteState from each of the PossibleFiniteStateLists that is referenced by the containing ActualFiniteStateList.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<PossibleFiniteState> possibleState;

    /**
     * Property shortName.
     * short name derived from the <i>possibleState</i> by concatenation of the <i>shortName</i> of each referenced PossibleFiniteState
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Getter
    private String shortName;

    /**
     * Sets the name.
     * name derived from the <i>possibleState</i> by concatenation of the names of each referenced PossibleFiniteState
     *
     * @throws IllegalStateException The name property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public void setName(String name){
        throw new IllegalStateException("Forbidden Set value for the derived property ActualFiniteState.name");
    }

    /**
     * Sets the owner.
     * reference to the DomainOfExpertise that owns (i.e. is responsible for) this ActualFiniteState
     * Note: This is a derived property. It is always the same DomainOfExpertise as the <i>owner</i> of the containing ActualFiniteStateList.
     *
     * @throws IllegalStateException The owner property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public void setOwner(DomainOfExpertise owner){
        throw new IllegalStateException("Forbidden Set value for the derived property ActualFiniteState.owner");
    }

    /**
     * Sets the shortName.
     * short name derived from the <i>possibleState</i> by concatenation of the <i>shortName</i> of each referenced PossibleFiniteState
     *
     * @throws IllegalStateException The shortName property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public void setShortName(String shortName){
        throw new IllegalStateException("Forbidden Set value for the derived property ActualFiniteState.shortName");
    }

    /**
     * Creates and returns a copy of this {@link ActualFiniteState} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ActualFiniteState}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ActualFiniteState clone;
        try {
            clone = (ActualFiniteState)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ActualFiniteState cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setPossibleState(new ArrayList<PossibleFiniteState>(this.getPossibleState()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ActualFiniteState} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ActualFiniteState}.
     */
    @Override
    public ActualFiniteState clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ActualFiniteState)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ActualFiniteState}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int possibleStateCount = this.getPossibleState().size();
        if (possibleStateCount < 1) {
            errorList.add("The number of elements in the property possibleState is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ActualFiniteState} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ActualFiniteState dto = (cdp4common.dto.ActualFiniteState)dtoThing;

        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setKind(dto.getKind());
        this.setModifiedOn(dto.getModifiedOn());
        this.getPossibleState().resolveList(dto.getPossibleState(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ActualFiniteState}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() throws ContainmentException {
        cdp4common.dto.ActualFiniteState dto = new cdp4common.dto.ActualFiniteState(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setKind(this.getKind());
        dto.setModifiedOn(this.getModifiedOn());
        dto.getPossibleState().addAll(this.getPossibleState().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
