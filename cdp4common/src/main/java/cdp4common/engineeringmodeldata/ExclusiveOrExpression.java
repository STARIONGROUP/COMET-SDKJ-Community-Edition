/* --------------------------------------------------------------------------------------------------------------------
 * ExclusiveOrExpression.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
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
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * representation of a boolean exclusive or expression
 * Note: The expression evaluates to true if one term is true and the other is false, otherwise it evaluates to false.
 */
@Container(clazz = ParametricConstraint.class, propertyName = "expression")
@ToString
@EqualsAndHashCode(callSuper = true)
public class ExclusiveOrExpression extends BooleanExpression implements Cloneable {
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
     * Initializes a new instance of the {@link ExclusiveOrExpression} class.
     */
    public ExclusiveOrExpression() {
        this.term = new ArrayList<BooleanExpression>();
    }

    /**
     * Initializes a new instance of the {@link ExclusiveOrExpression} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ExclusiveOrExpression(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.term = new ArrayList<BooleanExpression>();
    }

    /**
     * List of BooleanExpression.
     * references to the BooleanExpressions that are the terms for this boolean exclusive or expression
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<BooleanExpression> term;

    /**
     * Creates and returns a copy of this {@link ExclusiveOrExpression} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ExclusiveOrExpression}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ExclusiveOrExpression clone;
        try {
            clone = (ExclusiveOrExpression)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ExclusiveOrExpression cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setTerm(new ArrayList<BooleanExpression>(this.getTerm()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ExclusiveOrExpression} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ExclusiveOrExpression}.
     */
    @Override
    public ExclusiveOrExpression clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ExclusiveOrExpression)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ExclusiveOrExpression}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int termCount = this.getTerm().size();
        if (termCount < 2 && termCount > 2) {
            errorList.add("The number of elements in the property term is wrong. It should be between 2 and 2.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ExclusiveOrExpression} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ExclusiveOrExpression dto = (cdp4common.dto.ExclusiveOrExpression)dtoThing;

        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());
        PojoThingFactory.resolveList(this.getTerm(), dto.getTerm(), dto.getIterationContainerId(), this.getCache(), BooleanExpression.class);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ExclusiveOrExpression}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ExclusiveOrExpression dto = new cdp4common.dto.ExclusiveOrExpression(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.getTerm().addAll(this.getTerm().stream().map(Thing::getIid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Gets the representation of the {@link ExclusiveOrExpression} as a string
     */
    @Override
    public String getStringValue() {
        return "XOR";
    }
}
