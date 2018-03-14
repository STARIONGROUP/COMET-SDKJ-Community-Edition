/* --------------------------------------------------------------------------------------------------------------------
 * SiteReferenceDataLibrary.java
 * Copyright (c) 2018 RHEA System S.A.
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
import org.apache.commons.lang3.tuple.Pair;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * ReferenceDataLibrary that can be (re-)used by multiple EngineeringModels / EngineeringModelSetups
 * Note 1: A SiteReferenceDataLibrary typically contains more generic concepts that can be used across different concurrent engineering studies and families of studies.
 * Note 2: As a rule there shall be only one "top" SiteReferenceDataLibrary, i.e. only one that has <i>requiredRdl</i> unspecified.
 */
@Container(clazz = SiteDirectory.class, propertyName = "siteReferenceDataLibrary")
@ToString
@EqualsAndHashCode(callSuper = true)
public class SiteReferenceDataLibrary extends ReferenceDataLibrary implements Cloneable, DeprecatableThing {
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
     * Initializes a new instance of the {@link SiteReferenceDataLibrary} class.
     */
    public SiteReferenceDataLibrary() {
    }

    /**
     * Initializes a new instance of the {@link SiteReferenceDataLibrary} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public SiteReferenceDataLibrary(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean isDeprecated;

    /**
     * Creates and returns a copy of this {@link SiteReferenceDataLibrary} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SiteReferenceDataLibrary}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        SiteReferenceDataLibrary clone;
        try {
            clone = (SiteReferenceDataLibrary)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow SiteReferenceDataLibrary cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setBaseQuantityKind(new OrderedItemList<QuantityKind>(this.getBaseQuantityKind(), this, QuantityKind.class));
        clone.setBaseUnit(new ArrayList<MeasurementUnit>(this.getBaseUnit()));
        clone.setConstant(cloneContainedThings ? new ContainerList<Constant>(clone) : new ContainerList<Constant>(this.getConstant(), clone, false));
        clone.setDefinedCategory(cloneContainedThings ? new ContainerList<Category>(clone) : new ContainerList<Category>(this.getDefinedCategory(), clone, false));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setFileType(cloneContainedThings ? new ContainerList<FileType>(clone) : new ContainerList<FileType>(this.getFileType(), clone, false));
        clone.setGlossary(cloneContainedThings ? new ContainerList<Glossary>(clone) : new ContainerList<Glossary>(this.getGlossary(), clone, false));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));
        clone.setParameterType(cloneContainedThings ? new ContainerList<ParameterType>(clone) : new ContainerList<ParameterType>(this.getParameterType(), clone, false));
        clone.setReferenceSource(cloneContainedThings ? new ContainerList<ReferenceSource>(clone) : new ContainerList<ReferenceSource>(this.getReferenceSource(), clone, false));
        clone.setRule(cloneContainedThings ? new ContainerList<Rule>(clone) : new ContainerList<Rule>(this.getRule(), clone, false));
        clone.setScale(cloneContainedThings ? new ContainerList<MeasurementScale>(clone) : new ContainerList<MeasurementScale>(this.getScale(), clone, false));
        clone.setUnit(cloneContainedThings ? new ContainerList<MeasurementUnit>(clone) : new ContainerList<MeasurementUnit>(this.getUnit(), clone, false));
        clone.setUnitPrefix(cloneContainedThings ? new ContainerList<UnitPrefix>(clone) : new ContainerList<UnitPrefix>(this.getUnitPrefix(), clone, false));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getConstant().addAll(this.getConstant().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDefinedCategory().addAll(this.getDefinedCategory().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getFileType().addAll(this.getFileType().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getGlossary().addAll(this.getGlossary().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getParameterType().addAll(this.getParameterType().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getReferenceSource().addAll(this.getReferenceSource().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getRule().addAll(this.getRule().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getScale().addAll(this.getScale().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getUnit().addAll(this.getUnit().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getUnitPrefix().addAll(this.getUnitPrefix().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link SiteReferenceDataLibrary} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SiteReferenceDataLibrary}.
     */
    @Override
    public SiteReferenceDataLibrary clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SiteReferenceDataLibrary)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this SiteReferenceDataLibrary}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link SiteReferenceDataLibrary} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.SiteReferenceDataLibrary dto = (cdp4common.dto.SiteReferenceDataLibrary)dtoThing;

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        PojoThingFactory.resolveList(this.getBaseQuantityKind(), dto.getBaseQuantityKind(), dto.getIterationContainerId(), this.getCache(), QuantityKind.class);
        PojoThingFactory.resolveList(this.getBaseUnit(), dto.getBaseUnit(), dto.getIterationContainerId(), this.getCache(), MeasurementUnit.class);
        PojoThingFactory.resolveList(this.getConstant(), dto.getConstant(), dto.getIterationContainerId(), this.getCache(), Constant.class);
        PojoThingFactory.resolveList(this.getDefinedCategory(), dto.getDefinedCategory(), dto.getIterationContainerId(), this.getCache(), Category.class);
        PojoThingFactory.resolveList(this.getDefinition(), dto.getDefinition(), dto.getIterationContainerId(), this.getCache(), Definition.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        PojoThingFactory.resolveList(this.getFileType(), dto.getFileType(), dto.getIterationContainerId(), this.getCache(), FileType.class);
        PojoThingFactory.resolveList(this.getGlossary(), dto.getGlossary(), dto.getIterationContainerId(), this.getCache(), Glossary.class);
        PojoThingFactory.resolveList(this.getHyperLink(), dto.getHyperLink(), dto.getIterationContainerId(), this.getCache(), HyperLink.class);
        this.setDeprecated(dto.isDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        PojoThingFactory.resolveList(this.getParameterType(), dto.getParameterType(), dto.getIterationContainerId(), this.getCache(), ParameterType.class);
        PojoThingFactory.resolveList(this.getReferenceSource(), dto.getReferenceSource(), dto.getIterationContainerId(), this.getCache(), ReferenceSource.class);
        this.setRequiredRdl((dto.getRequiredRdl() != null) ? PojoThingFactory.get(this.getCache(), dto.getRequiredRdl(), dto.getIterationContainerId(), SiteReferenceDataLibrary.class) : null);
        this.setRevisionNumber(dto.getRevisionNumber());
        PojoThingFactory.resolveList(this.getRule(), dto.getRule(), dto.getIterationContainerId(), this.getCache(), Rule.class);
        PojoThingFactory.resolveList(this.getScale(), dto.getScale(), dto.getIterationContainerId(), this.getCache(), MeasurementScale.class);
        this.setShortName(dto.getShortName());
        PojoThingFactory.resolveList(this.getUnit(), dto.getUnit(), dto.getIterationContainerId(), this.getCache(), MeasurementUnit.class);
        PojoThingFactory.resolveList(this.getUnitPrefix(), dto.getUnitPrefix(), dto.getIterationContainerId(), this.getCache(), UnitPrefix.class);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link SiteReferenceDataLibrary}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.SiteReferenceDataLibrary dto = new cdp4common.dto.SiteReferenceDataLibrary(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getBaseQuantityKind().addAll(this.getBaseQuantityKind().toDtoOrderedItemList());
        dto.getBaseUnit().addAll(this.getBaseUnit().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getConstant().addAll(this.getConstant().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDefinedCategory().addAll(this.getDefinedCategory().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getFileType().addAll(this.getFileType().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getGlossary().addAll(this.getGlossary().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDeprecated(this.isDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getParameterType().addAll(this.getParameterType().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getReferenceSource().addAll(this.getReferenceSource().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRequiredRdl(this.getRequiredRdl() != null ? (UUID)this.getRequiredRdl().getIid() : null);
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.getRule().addAll(this.getRule().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getScale().addAll(this.getScale().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setShortName(this.getShortName());
        dto.getUnit().addAll(this.getUnit().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getUnitPrefix().addAll(this.getUnitPrefix().stream().map(Thing::getIid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
