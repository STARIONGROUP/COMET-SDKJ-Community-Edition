/* --------------------------------------------------------------------------------------------------------------------
 * ModellingAnnotationItem.java
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

package cdp4common.reportingdata;

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
 * abstract super class that represents a modelling annotation made on a modelling item
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = EngineeringModel.class, propertyName = "modellingAnnotation")
@ToString
public abstract class ModellingAnnotationItem extends EngineeringModelDataAnnotation implements Cloneable, CategorizableThing, OwnedThing, ShortNamedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the {@link ModellingAnnotationItem} class.
     */
    protected ModellingAnnotationItem() {
        this.approvedBy = new ContainerList<Approval>(this);
        this.category = new ArrayList<Category>();
        this.sourceAnnotation = new ArrayList<ModellingAnnotationItem>();
    }

    /**
     * Initializes a new instance of the {@link ModellingAnnotationItem} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected ModellingAnnotationItem(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.approvedBy = new ContainerList<Approval>(this);
        this.category = new ArrayList<Category>();
        this.sourceAnnotation = new ArrayList<ModellingAnnotationItem>();
    }

    /**
     * List of contained Approval.
     * The different approval that were made on this annotation
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Approval> approvedBy;

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<Category> category;

    /**
     * Property classification.
     * The classification of the current annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private AnnotationClassificationKind classification;

    /**
     * Property owner.
     * reference to a DomainOfExpertise that is the owner of this OwnedThing
     * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of) a coherent set of concerns in a concurrent engineering activity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private DomainOfExpertise owner;

    /**
     * Property shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String shortName;

    /**
     * List of ModellingAnnotationItem.
     * The modelling annotations that are at the origin of the creation of this modelling annotation if any
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<ModellingAnnotationItem> sourceAnnotation;

    /**
     * Property status.
     * Represents the status of the current annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private AnnotationStatusKind status;

    /**
     * Property title.
     * Represents the title of the current annotation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String title;

    /**
     * {@link Iterable} that references the composite properties of the current {@link ModellingAnnotationItem}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets a {@link Collection} that references the composite properties of the current {@link ModellingAnnotationItem}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.approvedBy);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link ModellingAnnotationItem} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ModellingAnnotationItem}.
     */
    @Override
    public ModellingAnnotationItem clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ModellingAnnotationItem)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ModellingAnnotationItem}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getOwner() == null || this.getOwner().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property owner is null.");
            this.setOwner(SentinelThingProvider.getSentinel(DomainOfExpertise.class));
            this.sentinelResetMap.put("owner", new ActionImpl(() -> this.setOwner(null)));
        }

        if (Strings.isNullOrEmpty(this.getShortName())) {
            errorList.add("The property shortName is null or empty.");
        }

        if (Strings.isNullOrEmpty(this.getTitle())) {
            errorList.add("The property title is null or empty.");
        }

        return errorList;
    }
}
