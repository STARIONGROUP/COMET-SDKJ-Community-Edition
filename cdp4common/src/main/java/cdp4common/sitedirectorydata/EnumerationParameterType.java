/* --------------------------------------------------------------------------------------------------------------------
 * EnumerationParameterType.java
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

package cdp4common.sitedirectorydata;

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
 * representation of an enumeration valued ScalarParameterType with a user-defined list of text values (enumeration literals) to select from
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
public class EnumerationParameterType extends ScalarParameterType implements Cloneable {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the {@link EnumerationParameterType} class.
     */
    public EnumerationParameterType() {
        this.valueDefinition = new OrderedItemList<EnumerationValueDefinition>(this, true, EnumerationValueDefinition.class);
    }

    /**
     * Initializes a new instance of the {@link EnumerationParameterType} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public EnumerationParameterType(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.valueDefinition = new OrderedItemList<EnumerationValueDefinition>(this, true, EnumerationValueDefinition.class);
    }

    /**
     * Value indicating whether allowMultiSelect.
     * assertion whether for values of this EnumerationParameterType selection of multiple enumeration literals is allowed or not
     * Note: For an EnumerationParameterType with allowMultiSelect false, only one enumeration literal may be selected and in a graphical user interface this would be represented with a set of radio buttons. For an EnumerationParameterType with allowMultiSelect set true, one or more enumeration literals may be selected and in a graphical user interface this would be represented with a set of check buttons. Example: For an enumeration type "TransportKind" the literals "ByAir", "ByTrain", "ByBus", "ByCar", "ByBicycle" and "OnFoot" are defined and allowMultiSelect is set true. Assume that a "Transport" item has parameter "means of transport" of type  "TransportKind". Now for a particular Transport instance "ByTrain" and "ByBicycle" may be both selected.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean allowMultiSelect;

    /**
     * List of ordered contained EnumerationValueDefinition.
     * definition of the literal enumeration values for this EnumerationParameterType
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private OrderedItemList<EnumerationValueDefinition> valueDefinition;

    /**
     * {@link Iterable} that references the composite properties of the current {@link EnumerationParameterType}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets a {@link Collection} that references the composite properties of the current {@link EnumerationParameterType}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.valueDefinition);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link EnumerationParameterType} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link EnumerationParameterType}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        EnumerationParameterType clone;
        try {
            clone = (EnumerationParameterType)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow EnumerationParameterType cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));
        clone.setValueDefinition(cloneContainedThings ? null : new OrderedItemList<EnumerationValueDefinition>(this.getValueDefinition(), clone, EnumerationValueDefinition.class));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.setValueDefinition(this.getValueDefinition().clone(clone));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link EnumerationParameterType} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link EnumerationParameterType}.
     */
    @Override
    public EnumerationParameterType clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (EnumerationParameterType)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this EnumerationParameterType}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int valueDefinitionCount = this.getValueDefinition().size();
        if (valueDefinitionCount < 1) {
            errorList.add("The number of elements in the property valueDefinition is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link EnumerationParameterType} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.EnumerationParameterType dto = (cdp4common.dto.EnumerationParameterType)dtoThing;

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        this.setAllowMultiSelect(dto.isAllowMultiSelect());
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
        this.setSymbol(dto.getSymbol());
        PojoThingFactory.resolveList(this.getValueDefinition(), dto.getValueDefinition(), dto.getIterationContainerId(), this.getCache(), EnumerationValueDefinition.class);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link EnumerationParameterType}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.EnumerationParameterType dto = new cdp4common.dto.EnumerationParameterType(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setAllowMultiSelect(this.isAllowMultiSelect());
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
        dto.setSymbol(this.getSymbol());
        dto.getValueDefinition().addAll(this.getValueDefinition().toDtoOrderedItemList());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
