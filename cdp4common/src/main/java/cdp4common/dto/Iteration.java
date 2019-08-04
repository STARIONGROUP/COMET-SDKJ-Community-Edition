/* --------------------------------------------------------------------------------------------------------------------
 * Iteration.java
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
 * This is an auto-generated DTO Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.dto;

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
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MoreCollectors;
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A Data Transfer Object representation of the {@link "Iteration"} class.
 */
@Container(clazz = EngineeringModel.class, propertyName = "iteration")
@ToString
public class Iteration extends Thing implements Cloneable {
    /**
     * Initializes a new instance of the {@link "Iteration"} class.
     */
    public Iteration() {
        this.actualFiniteStateList = new ArrayList<UUID>();
        this.diagramCanvas = new ArrayList<UUID>();
        this.domainFileStore = new ArrayList<UUID>();
        this.element = new ArrayList<UUID>();
        this.externalIdentifierMap = new ArrayList<UUID>();
        this.goal = new ArrayList<UUID>();
        this.option = new ArrayList<OrderedItem>();
        this.possibleFiniteStateList = new ArrayList<UUID>();
        this.publication = new ArrayList<UUID>();
        this.relationship = new ArrayList<UUID>();
        this.requirementsSpecification = new ArrayList<UUID>();
        this.ruleVerificationList = new ArrayList<UUID>();
        this.sharedDiagramStyle = new ArrayList<UUID>();
        this.stakeholder = new ArrayList<UUID>();
        this.stakeholderValue = new ArrayList<UUID>();
        this.stakeholderValueMap = new ArrayList<UUID>();
        this.valueGroup = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link "Iteration"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public Iteration(UUID iid, int rev) {
        super(iid, rev);
        this.actualFiniteStateList = new ArrayList<UUID>();
        this.diagramCanvas = new ArrayList<UUID>();
        this.domainFileStore = new ArrayList<UUID>();
        this.element = new ArrayList<UUID>();
        this.externalIdentifierMap = new ArrayList<UUID>();
        this.goal = new ArrayList<UUID>();
        this.option = new ArrayList<OrderedItem>();
        this.possibleFiniteStateList = new ArrayList<UUID>();
        this.publication = new ArrayList<UUID>();
        this.relationship = new ArrayList<UUID>();
        this.requirementsSpecification = new ArrayList<UUID>();
        this.ruleVerificationList = new ArrayList<UUID>();
        this.sharedDiagramStyle = new ArrayList<UUID>();
        this.stakeholder = new ArrayList<UUID>();
        this.stakeholderValue = new ArrayList<UUID>();
        this.stakeholderValueMap = new ArrayList<UUID>();
        this.valueGroup = new ArrayList<UUID>();
    }

    /**
     * The unique identifiers of the contained actualFiniteStateList instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> actualFiniteStateList;

    /**
     * The unique identifier of the referenced defaultOption.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID defaultOption;

    /**
     * The unique identifiers of the contained diagramCanvas instances.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> diagramCanvas;

    /**
     * The unique identifiers of the contained domainFileStore instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> domainFileStore;

    /**
     * The unique identifiers of the contained element instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> element;

    /**
     * The unique identifiers of the contained externalIdentifierMap instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> externalIdentifierMap;

    /**
     * The unique identifiers of the contained goal instances.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> goal;

    /**
     * The unique identifier of the referenced iterationSetup.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID iterationSetup;

    /**
     * The unique identifiers of the contained option instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<OrderedItem> option;

    /**
     * The unique identifiers of the contained possibleFiniteStateList instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> possibleFiniteStateList;

    /**
     * The unique identifiers of the contained publication instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> publication;

    /**
     * The unique identifiers of the contained relationship instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> relationship;

    /**
     * The unique identifiers of the contained requirementsSpecification instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> requirementsSpecification;

    /**
     * The unique identifiers of the contained ruleVerificationList instances.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> ruleVerificationList;

    /**
     * The unique identifiers of the contained sharedDiagramStyle instances.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> sharedDiagramStyle;

    /**
     * The unique identifier of the referenced sourceIterationIid.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID sourceIterationIid;

    /**
     * The unique identifiers of the contained stakeholder instances.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> stakeholder;

    /**
     * The unique identifiers of the contained stakeholderValue instances.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> stakeholderValue;

    /**
     * The unique identifiers of the contained stakeholderValueMap instances.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> stakeholderValueMap;

    /**
     * The unique identifier of the referenced topElement.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID topElement;

    /**
     * The unique identifiers of the contained valueGroup instances.
     */
    @CDPVersion(version = "1.1.0")
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> valueGroup;

    /**
     * Gets the route for the current {@link Iteration}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Gets an {@link Iterable<Iterable>} that references the composite properties of the current {@link Iteration}.
     */
    @Override
    public List<List> getContainerLists() {
        List<List> containers = new ArrayList<>(super.getContainerLists());
        containers.add(this.getActualFiniteStateList());
        containers.add(this.getDiagramCanvas());
        containers.add(this.getDomainFileStore());
        containers.add(this.getElement());
        containers.add(this.getExternalIdentifierMap());
        containers.add(this.getGoal());
        containers.add(this.getOption());
        containers.add(this.getPossibleFiniteStateList());
        containers.add(this.getPublication());
        containers.add(this.getRelationship());
        containers.add(this.getRequirementsSpecification());
        containers.add(this.getRuleVerificationList());
        containers.add(this.getSharedDiagramStyle());
        containers.add(this.getStakeholder());
        containers.add(this.getStakeholderValue());
        containers.add(this.getStakeholderValueMap());
        containers.add(this.getValueGroup());
        return containers;
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.Iteration} from a {@link Iteration}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.Iteration}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.Iteration(this.getIid(), cache, uri);
    }
}
