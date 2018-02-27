/* --------------------------------------------------------------------------------------------------------------------
 * ParametricConstraint.java
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
 * representation of a single parametric constraint consisting of a ParameterType that acts as a variable, a relational operator and a value, in the form of a mathematical equality or inequality
 */
@Container(clazz = Requirement.class, propertyName = "parametricConstraint")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ParametricConstraint extends Thing implements Cloneable, OwnedThing {
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
     * Initializes a new instance of the {@link ParametricConstraint} class.
     */
    public ParametricConstraint() {
        this.expression = new ContainerList<BooleanExpression>(this);
    }

    /**
     * Initializes a new instance of the {@link ParametricConstraint} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ParametricConstraint(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.expression = new ContainerList<BooleanExpression>(this);
    }

    /**
     * List of contained BooleanExpression.
     * collection of all BooleanExpressions that define this ParametricConstraint
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<BooleanExpression> expression;

    /**
     * Property owner.
     * reference to the DomainOfExpertise that is the owner of this RequirementsGroup, which is derived to be the same as the owner of the next higher level RequirementsGroup or RequirementsSpecification
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    @Getter
    private DomainOfExpertise owner;

    /**
     * Property topExpression.
     * reference to the top BooleanExpression (of a possibly nested set of BooleanExpression) that defines this ParametricConstraint
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private BooleanExpression topExpression;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link ParametricConstraint}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Sets the owner.
     * reference to the DomainOfExpertise that is the owner of this RequirementsGroup, which is derived to be the same as the owner of the next higher level RequirementsGroup or RequirementsSpecification
     *
     * @throws IllegalStateException The owner property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    public void setOwner(DomainOfExpertise owner){
        throw new IllegalStateException("Forbidden Set value for the derived property ParametricConstraint.owner");
    }

    /**
     * Gets an {@link List<List>} that references the composite properties of the current {@link ParametricConstraint}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<List>(super.getContainerLists());
        containers.add(this.expression);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link ParametricConstraint} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParametricConstraint}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ParametricConstraint clone;
        try {
            clone = (ParametricConstraint)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ParametricConstraint cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setExpression(cloneContainedThings ? new ContainerList<BooleanExpression>(clone) : new ContainerList<BooleanExpression>(this.getExpression(), clone, false));

        if (cloneContainedThings) {
            clone.getExpression().addAll(this.getExpression().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ParametricConstraint} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ParametricConstraint}.
     */
    @Override
    public ParametricConstraint clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParametricConstraint)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ParametricConstraint}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int expressionCount = this.getExpression().size();
        if (expressionCount < 1) {
            errorList.add("The number of elements in the property expression is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ParametricConstraint} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParametricConstraint dto = (cdp4common.dto.ParametricConstraint)dtoThing;

        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getExpression().resolveList(dto.getExpression(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setTopExpression((dto.getTopExpression() != null) ? this.getCache().get<BooleanExpression>(dto.getTopExpression.getValue(), dto.getIterationContainerId()) : null);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ParametricConstraint}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() throws ContainmentException {
        cdp4common.dto.ParametricConstraint dto = new cdp4common.dto.ParametricConstraint(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExpression().addAll(this.getExpression().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setTopExpression(this.getTopExpression() != null ? (UUID)this.getTopExpression().getIid() : null);

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
