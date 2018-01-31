/* --------------------------------------------------------------------------------------------------------------------
 * AbstractModelReferenceDataLibrary.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
import org.apache.commons.lang3.tuple.Pair;
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * ReferenceDataLibrary that is particular to a given EngineeringModel / EngineeringModelSetup
 */
@Container(clazz = EngineeringModelSetup.class, propertyName = "requiredRdl")
@ToString
@EqualsAndHashCode
public  class ModelReferenceDataLibrary extends ReferenceDataLibrary implements Cloneable {
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
     * Initializes a new instance of the {@link ModelReferenceDataLibrary} class.
     */
    public ModelReferenceDataLibrary() {
    }

    /**
     * Initializes a new instance of the {@link ModelReferenceDataLibrary} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ModelReferenceDataLibrary(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
    }

    /**
     * Creates and returns a copy of this {@link ModelReferenceDataLibrary} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ModelReferenceDataLibrary}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        ModelReferenceDataLibrary clone;
        try {
            clone = (ModelReferenceDataLibrary)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow ModelReferenceDataLibrary cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setBaseQuantityKind(new OrderedItemList<QuantityKind>(this.getBaseQuantityKind(), this));
        clone.setBaseUnit(new ArrayList<MeasurementUnit>(this.getBaseUnit()));
        clone.setConstant(cloneContainedThings ? new ContainerList<Constant>(clone) : new ContainerList<Constant>(this.getConstant(), clone));
        clone.setDefinedCategory(cloneContainedThings ? new ContainerList<Category>(clone) : new ContainerList<Category>(this.getDefinedCategory(), clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setFileType(cloneContainedThings ? new ContainerList<FileType>(clone) : new ContainerList<FileType>(this.getFileType(), clone));
        clone.setGlossary(cloneContainedThings ? new ContainerList<Glossary>(clone) : new ContainerList<Glossary>(this.getGlossary(), clone));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));
        clone.setParameterType(cloneContainedThings ? new ContainerList<ParameterType>(clone) : new ContainerList<ParameterType>(this.getParameterType(), clone));
        clone.setReferenceSource(cloneContainedThings ? new ContainerList<ReferenceSource>(clone) : new ContainerList<ReferenceSource>(this.getReferenceSource(), clone));
        clone.setRule(cloneContainedThings ? new ContainerList<Rule>(clone) : new ContainerList<Rule>(this.getRule(), clone));
        clone.setScale(cloneContainedThings ? new ContainerList<MeasurementScale>(clone) : new ContainerList<MeasurementScale>(this.getScale(), clone));
        clone.setUnit(cloneContainedThings ? new ContainerList<MeasurementUnit>(clone) : new ContainerList<MeasurementUnit>(this.getUnit(), clone));
        clone.setUnitPrefix(cloneContainedThings ? new ContainerList<UnitPrefix>(clone) : new ContainerList<UnitPrefix>(this.getUnitPrefix(), clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getConstant().addAll(this.getConstant().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinedCategory().addAll(this.getDefinedCategory().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getFileType().addAll(this.getFileType().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getGlossary().addAll(this.getGlossary().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getParameterType().addAll(this.getParameterType().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getReferenceSource().addAll(this.getReferenceSource().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getRule().addAll(this.getRule().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getScale().addAll(this.getScale().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getUnit().addAll(this.getUnit().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getUnitPrefix().addAll(this.getUnitPrefix().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ModelReferenceDataLibrary} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ModelReferenceDataLibrary}.
     */
    @Override
    public ModelReferenceDataLibrary clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ModelReferenceDataLibrary)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ModelReferenceDataLibrary}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ModelReferenceDataLibrary} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ModelReferenceDataLibrary dto = (cdp4common.dto.ModelReferenceDataLibrary)dtoThing;

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.getBaseQuantityKind().resolveList(dto.getBaseQuantityKind(), dto.getIterationContainerId(), this.getCache());
        this.getBaseUnit().resolveList(dto.getBaseUnit(), dto.getIterationContainerId(), this.getCache());
        this.getConstant().resolveList(dto.getConstant(), dto.getIterationContainerId(), this.getCache());
        this.getDefinedCategory().resolveList(dto.getDefinedCategory(), dto.getIterationContainerId(), this.getCache());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getFileType().resolveList(dto.getFileType(), dto.getIterationContainerId(), this.getCache());
        this.getGlossary().resolveList(dto.getGlossary(), dto.getIterationContainerId(), this.getCache());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.getParameterType().resolveList(dto.getParameterType(), dto.getIterationContainerId(), this.getCache());
        this.getReferenceSource().resolveList(dto.getReferenceSource(), dto.getIterationContainerId(), this.getCache());
        this.setRequiredRdl((dto.getRequiredRdl() != null) ? this.getCache().get<SiteReferenceDataLibrary>(dto.getRequiredRdl.getValue(), dto.getIterationContainerId()) : null);
        this.setRevisionNumber(dto.getRevisionNumber());
        this.getRule().resolveList(dto.getRule(), dto.getIterationContainerId(), this.getCache());
        this.getScale().resolveList(dto.getScale(), dto.getIterationContainerId(), this.getCache());
        this.setShortName(dto.getShortName());
        this.getUnit().resolveList(dto.getUnit(), dto.getIterationContainerId(), this.getCache());
        this.getUnitPrefix().resolveList(dto.getUnitPrefix(), dto.getIterationContainerId(), this.getCache());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ModelReferenceDataLibrary}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ModelReferenceDataLibrary dto = new cdp4common.dto.ModelReferenceDataLibrary(this.getIid(), this.getRevisionNumber());

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getBaseQuantityKind().add(this.getBaseQuantityKind().toDtoOrderedItemList());
        dto.getBaseUnit().add(this.getBaseUnit().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getConstant().add(this.getConstant().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDefinedCategory().add(this.getDefinedCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getFileType().add(this.getFileType().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getGlossary().add(this.getGlossary().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getParameterType().add(this.getParameterType().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getReferenceSource().add(this.getReferenceSource().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setRequiredRdl(this.getRequiredRdl() != null ? (UUID)this.getRequiredRdl().getIid() : null);
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.getRule().add(this.getRule().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getScale().add(this.getScale().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setShortName(this.getShortName());
        dto.getUnit().add(this.getUnit().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getUnitPrefix().add(this.getUnitPrefix().stream().map(x -> x.getIid()).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
