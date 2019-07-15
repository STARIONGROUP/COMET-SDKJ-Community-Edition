/* --------------------------------------------------------------------------------------------------------------------
 * UserRuleVerification.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
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
 * representation of the verification of a user-defined Rule in one of the required ReferenceDataLibraries
 */
@Container(clazz = RuleVerificationList.class, propertyName = "ruleVerification")
@ToString
public class UserRuleVerification extends RuleVerification implements Cloneable {
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
     * Initializes a new instance of the {@link UserRuleVerification} class.
     */
    public UserRuleVerification() {
    }

    /**
     * Initializes a new instance of the {@link UserRuleVerification} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public UserRuleVerification(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property name.
     * name derived from the <i>name</i> of the associated Rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String name;

    /**
     * Property rule.
     * reference to the Rule to be verified
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Rule rule;

    /**
     * Gets the name.
     * name derived from the <i>name</i> of the associated Rule
     */
    public String getName(){
        return this.getDerivedName();
    }

    /**
     * Sets the name.
     * name derived from the <i>name</i> of the associated Rule
     *
     * @throws IllegalStateException The name property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    public void setName(String name){
        throw new IllegalStateException("Forbidden Set value for the derived property UserRuleVerification.name");
    }

    /**
     * Creates and returns a copy of this {@link UserRuleVerification} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link UserRuleVerification}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        UserRuleVerification clone;
        try {
            clone = (UserRuleVerification)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow UserRuleVerification cannot be cloned.");
        }

        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link UserRuleVerification} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link UserRuleVerification}.
     */
    @Override
    public UserRuleVerification clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (UserRuleVerification)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this UserRuleVerification}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getRule() == null || this.getRule().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property rule is null.");
            this.setRule(SentinelThingProvider.getSentinel(Rule.class));
            this.sentinelResetMap.put("rule", new ActionImpl(() -> this.setRule(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link UserRuleVerification} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.UserRuleVerification dto = (cdp4common.dto.UserRuleVerification)dtoThing;

        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setExecutedOn(dto.getExecutedOn());
        this.setActive(dto.isActive());
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setRule(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getRule(), dto.getIterationContainerId(), Rule.class), SentinelThingProvider.getSentinel(Rule.class)));
        this.setStatus(dto.getStatus());
        PojoThingFactory.resolveList(this.getViolation(), dto.getViolation(), dto.getIterationContainerId(), this.getCache(), RuleViolation.class);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link UserRuleVerification}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.UserRuleVerification dto = new cdp4common.dto.UserRuleVerification(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setExecutedOn(this.getExecutedOn());
        dto.setActive(this.isActive());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setRule(this.getRule() != null ? this.getRule().getIid() : new UUID(0L, 0L));
        dto.setStatus(this.getStatus());
        dto.getViolation().addAll(this.getViolation().stream().map(Thing::getIid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Returns the {@link #name} value
     *
     * @return The {@link #name} value
     */
    private String getDerivedName() {
        return this.getRule().getName();
    }
}
