/* --------------------------------------------------------------------------------------------------------------------
 * PrefixedUnit.java
 *
 * Copyright (c) 2015-2024 Starion Group S.A.
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
 * specialization of ConversionBasedUnit that defines a MeasurementUnit with a
 * multiple or submultiple UnitPrefix
 * Example: Measurement units like "kilogram", "millimetre", "nanovolt",
 * "gibibyte" etc.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
@ToString
public class PrefixedUnit extends ConversionBasedUnit implements Cloneable {
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
     * Initializes a new instance of the {@link PrefixedUnit} class.
     */
    public PrefixedUnit() {
    }

    /**
     * Initializes a new instance of the {@link PrefixedUnit} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public PrefixedUnit(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Property conversionFactor.
     * applicable conversion factor derived from <i>prefix</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String conversionFactor;

    /**
     * Property name.
     * derived name of this PrefixUnit
     * Note: The name is derived as the concatenation of name of the <i>prefix</i> and the name of the <i>referenceUnit</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String name;

    /**
     * Property prefix.
     * reference to the applicable UnitPrefix
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private UnitPrefix prefix;

    /**
     * Property shortName.
     * derived symbol of this PrefixUnit
     * Note: The symbol is derived as the concatenation of <i>shortName</i> of the <i>prefix</i> and the <i>shortName</i> of the <i>referenceUnit</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String shortName;

    /**
     * Gets the conversionFactor.
     * applicable conversion factor derived from <i>prefix</i>
     */
    public String getConversionFactor(){
        return this.getDerivedConversionFactor();
    }

    /**
     * Gets the name.
     * derived name of this PrefixUnit
     * Note: The name is derived as the concatenation of name of the <i>prefix</i> and the name of the <i>referenceUnit</i>.
     */
    public String getName(){
        return this.getDerivedName();
    }

    /**
     * Gets the shortName.
     * derived symbol of this PrefixUnit
     * Note: The symbol is derived as the concatenation of <i>shortName</i> of the <i>prefix</i> and the <i>shortName</i> of the <i>referenceUnit</i>.
     */
    public String getShortName(){
        return this.getDerivedShortName();
    }

    /**
     * Sets the conversionFactor.
     * applicable conversion factor derived from <i>prefix</i>
     *
     * @throws IllegalStateException The conversionFactor property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    public void setConversionFactor(String conversionFactor){
        throw new IllegalStateException("Forbidden Set value for the derived property PrefixedUnit.conversionFactor");
    }

    /**
     * Sets the name.
     * derived name of this PrefixUnit
     * Note: The name is derived as the concatenation of name of the <i>prefix</i> and the name of the <i>referenceUnit</i>.
     *
     * @throws IllegalStateException The name property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    public void setName(String name){
        throw new IllegalStateException("Forbidden Set value for the derived property PrefixedUnit.name");
    }

    /**
     * Sets the shortName.
     * derived symbol of this PrefixUnit
     * Note: The symbol is derived as the concatenation of <i>shortName</i> of the <i>prefix</i> and the <i>shortName</i> of the <i>referenceUnit</i>.
     *
     * @throws IllegalStateException The shortName property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    public void setShortName(String shortName){
        throw new IllegalStateException("Forbidden Set value for the derived property PrefixedUnit.shortName");
    }

    /**
     * Creates and returns a copy of this {@link PrefixedUnit} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link PrefixedUnit}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        PrefixedUnit clone;
        try {
            clone = (PrefixedUnit)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow PrefixedUnit cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
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
     * Creates and returns a copy of this {@link PrefixedUnit} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link PrefixedUnit}.
     */
    @Override
    public PrefixedUnit clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (PrefixedUnit)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this PrefixedUnit}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getPrefix() == null || this.getPrefix().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property prefix is null.");
            this.setPrefix(SentinelThingProvider.getSentinel(UnitPrefix.class));
            this.sentinelResetMap.put("prefix", new ActionImpl(() -> this.setPrefix(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link PrefixedUnit} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.PrefixedUnit dto = (cdp4common.dto.PrefixedUnit)dtoThing;

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        PojoThingFactory.resolveList(this.getDefinition(), dto.getDefinition(), dto.getIterationContainerId(), this.getCache(), Definition.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getHyperLink(), dto.getHyperLink(), dto.getIterationContainerId(), this.getCache(), HyperLink.class);
        this.setDeprecated(dto.isDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setPrefix(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getPrefix(), dto.getIterationContainerId(), UnitPrefix.class), SentinelThingProvider.getSentinel(UnitPrefix.class)));
        this.setReferenceUnit(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getReferenceUnit(), dto.getIterationContainerId(), MeasurementUnit.class), SentinelThingProvider.getSentinel(MeasurementUnit.class)));
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setThingPreference(dto.getThingPreference());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link PrefixedUnit}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.PrefixedUnit dto = new cdp4common.dto.PrefixedUnit(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDeprecated(this.isDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setPrefix(this.getPrefix() != null ? this.getPrefix().getIid() : new UUID(0L, 0L));
        dto.setReferenceUnit(this.getReferenceUnit() != null ? this.getReferenceUnit().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setThingPreference(this.getThingPreference());

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Returns the derived {@link #conversionFactor} value
     *
     * @return The {@link #conversionFactor} value
     */
    private String getDerivedConversionFactor() {
        return this.getPrefix() == null ? "" : this.getPrefix().getConversionFactor();
    }

    /**
     * Returns the derived {@link #name} value
     *
     * @return The {@link #name} value
     */
    private String getDerivedName() {
        if (this.getPrefix() != null && this.getReferenceUnit() != null)
        {
            return this.getPrefix().getName() + this.getReferenceUnit().getName();
        }

        return "";
    }

    /**
     * Returns the derived {@link #shortName} value
     *
     * @return The {@link #shortName} value
     */
    private String getDerivedShortName() {
        if (this.getPrefix() != null && this.getReferenceUnit() != null)
        {
            return this.getPrefix().getShortName() + this.getReferenceUnit().getShortName();
        }

        return "";
    }
}
