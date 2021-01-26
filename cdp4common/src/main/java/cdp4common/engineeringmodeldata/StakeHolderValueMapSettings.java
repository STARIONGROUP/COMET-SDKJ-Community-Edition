/* --------------------------------------------------------------------------------------------------------------------
 * StakeHolderValueMapSettings.java
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
import java.time.OffsetDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.exceptions.ContainmentException;
import cdp4common.extensions.*;
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
 * The settings of a StakeholderValueMap that capture the BinaryRelationshipRules that are used to create links between the Goals, ValueGroup, StakeholderValues and Requirements
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = StakeHolderValueMap.class, propertyName = "settings")
@ToString
public class StakeHolderValueMapSettings extends Thing implements Cloneable {
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
     * Initializes a new instance of the {@link StakeHolderValueMapSettings} class.
     */
    public StakeHolderValueMapSettings() {
    }

    /**
     * Initializes a new instance of the {@link StakeHolderValueMapSettings} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public StakeHolderValueMapSettings(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property goalToValueGroupRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private BinaryRelationshipRule goalToValueGroupRelationship;

    /**
     * Property stakeholderValueToRequirementRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private BinaryRelationshipRule stakeholderValueToRequirementRelationship;

    /**
     * Property valueGroupToStakeholderValueRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private BinaryRelationshipRule valueGroupToStakeholderValueRelationship;

    /**
     * Creates and returns a copy of this {@link StakeHolderValueMapSettings} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link StakeHolderValueMapSettings}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        StakeHolderValueMapSettings clone;
        try {
            clone = (StakeHolderValueMapSettings)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow StakeHolderValueMapSettings cannot be cloned.");
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
     * Creates and returns a copy of this {@link StakeHolderValueMapSettings} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link StakeHolderValueMapSettings}.
     */
    @Override
    public StakeHolderValueMapSettings clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (StakeHolderValueMapSettings)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this StakeHolderValueMapSettings}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link StakeHolderValueMapSettings} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.StakeHolderValueMapSettings dto = (cdp4common.dto.StakeHolderValueMapSettings)dtoThing;

        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setGoalToValueGroupRelationship((dto.getGoalToValueGroupRelationship() != null) ? PojoThingFactory.get(this.getCache(), dto.getGoalToValueGroupRelationship(), dto.getIterationContainerId(), BinaryRelationshipRule.class) : null);
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setStakeholderValueToRequirementRelationship((dto.getStakeholderValueToRequirementRelationship() != null) ? PojoThingFactory.get(this.getCache(), dto.getStakeholderValueToRequirementRelationship(), dto.getIterationContainerId(), BinaryRelationshipRule.class) : null);
        this.setThingPreference(dto.getThingPreference());
        this.setValueGroupToStakeholderValueRelationship((dto.getValueGroupToStakeholderValueRelationship() != null) ? PojoThingFactory.get(this.getCache(), dto.getValueGroupToStakeholderValueRelationship(), dto.getIterationContainerId(), BinaryRelationshipRule.class) : null);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link StakeHolderValueMapSettings}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.StakeHolderValueMapSettings dto = new cdp4common.dto.StakeHolderValueMapSettings(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setGoalToValueGroupRelationship(this.getGoalToValueGroupRelationship() != null ? (UUID)this.getGoalToValueGroupRelationship().getIid() : null);
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setStakeholderValueToRequirementRelationship(this.getStakeholderValueToRequirementRelationship() != null ? (UUID)this.getStakeholderValueToRequirementRelationship().getIid() : null);
        dto.setThingPreference(this.getThingPreference());
        dto.setValueGroupToStakeholderValueRelationship(this.getValueGroupToStakeholderValueRelationship() != null ? (UUID)this.getValueGroupToStakeholderValueRelationship().getIid() : null);

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
