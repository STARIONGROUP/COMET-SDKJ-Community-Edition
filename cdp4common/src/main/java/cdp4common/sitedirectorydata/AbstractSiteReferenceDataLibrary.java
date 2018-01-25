/* --------------------------------------------------------------------------------------------------------------------
 * AbstractSiteReferenceDataLibrary.java
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

/**
 * ReferenceDataLibrary that can be (re-)used by multiple EngineeringModels / EngineeringModelSetups
 * Note 1: A SiteReferenceDataLibrary typically contains more generic concepts that can be used across different concurrent engineering studies and families of studies.
 * Note 2: As a rule there shall be only one "top" SiteReferenceDataLibrary, i.e. only one that has <i>requiredRdl</i> unspecified.
 */
@Container(clazz = SiteDirectory.class, propertyName = "siteReferenceDataLibrary")
public abstract class AbstractSiteReferenceDataLibrary extends AbstractReferenceDataLibrary implements DeprecatableThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_N_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Initializes a new instance of the <code>SiteReferenceDataLibrary<code/> class.
     *
     * @see SiteReferenceDataLibrary
     */
    public AbstractSiteReferenceDataLibrary() {
    }

    /**
     * Initializes a new instance of the <code>SiteReferenceDataLibrary<code/> class.
     * @param iid The unique identifier.
     * @param cache The <code>ConcurrentHashMap<K,V></code> where the current thing is stored.
     * The <code>Pair<L,R><code/> of <code>UUID<code/> is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its <code>Iteration<code/> container if applicable or null.
     * @param iDalUri The <code>URI</code> of this thing
     *
     * @see ConcurrentHashMap
     * @see URI
     * @see UUID
     * @see Pair
     * @see Iteration
     * @see SiteReferenceDataLibrary
     */
    public AbstractSiteReferenceDataLibrary(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isDeprecated;

    /**
     * Gets a value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getDeprecated(){
         return this.isDeprecated;
    }

    /**
     *Sets a value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDeprecated(boolean isDeprecated){
        this.isDeprecated = isDeprecated;
    }

    /**
     * Creates and returns a copy of this <code>SiteReferenceDataLibrary<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>SiteReferenceDataLibrary<code/>.
     *
     * @see SiteReferenceDataLibrary
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        SiteReferenceDataLibrary clone = (SiteReferenceDataLibrary)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setBaseQuantityKind(new OrderedItemList<QuantityKind>(this.baseQuantityKind, this));
        clone.setBaseUnit(new List<MeasurementUnit>(this.baseUnit));
        clone.setConstant(cloneContainedThings ? new ContainerList<Constant>(clone) : new ContainerList<Constant>(this.constant, clone));
        clone.setDefinedCategory(cloneContainedThings ? new ContainerList<Category>(clone) : new ContainerList<Category>(this.definedCategory, clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setFileType(cloneContainedThings ? new ContainerList<FileType>(clone) : new ContainerList<FileType>(this.fileType, clone));
        clone.setGlossary(cloneContainedThings ? new ContainerList<Glossary>(clone) : new ContainerList<Glossary>(this.glossary, clone));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));
        clone.setParameterType(cloneContainedThings ? new ContainerList<ParameterType>(clone) : new ContainerList<ParameterType>(this.parameterType, clone));
        clone.setReferenceSource(cloneContainedThings ? new ContainerList<ReferenceSource>(clone) : new ContainerList<ReferenceSource>(this.referenceSource, clone));
        clone.setRule(cloneContainedThings ? new ContainerList<Rule>(clone) : new ContainerList<Rule>(this.rule, clone));
        clone.setScale(cloneContainedThings ? new ContainerList<MeasurementScale>(clone) : new ContainerList<MeasurementScale>(this.scale, clone));
        clone.setUnit(cloneContainedThings ? new ContainerList<MeasurementUnit>(clone) : new ContainerList<MeasurementUnit>(this.unit, clone));
        clone.setUnitPrefix(cloneContainedThings ? new ContainerList<UnitPrefix>(clone) : new ContainerList<UnitPrefix>(this.unitPrefix, clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getConstant().addAll(this.constant.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinedCategory().addAll(this.definedCategory.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getFileType().addAll(this.fileType.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getGlossary().addAll(this.glossary.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getParameterType().addAll(this.parameterType.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getReferenceSource().addAll(this.referenceSource.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getRule().addAll(this.rule.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getScale().addAll(this.scale.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getUnit().addAll(this.unit.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getUnitPrefix().addAll(this.unitPrefix.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>SiteReferenceDataLibrary<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>SiteReferenceDataLibrary<code/>.
     * 
     * @see SiteReferenceDataLibrary
     */
    @Override
    public SiteReferenceDataLibrary clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SiteReferenceDataLibrary)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>SiteReferenceDataLibrary<code/>.
     *
     * @return A list of potential errors.
     *
     * @see SiteReferenceDataLibrary
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>SiteReferenceDataLibrary<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see SiteReferenceDataLibrary
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.SiteReferenceDataLibrary dto = (cdp4common.dto.SiteReferenceDataLibrary)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.baseQuantityKind.resolveList(dto.getBaseQuantityKind(), dto.getIterationContainerId(), this.cache);
        this.baseUnit.resolveList(dto.getBaseUnit(), dto.getIterationContainerId(), this.cache);
        this.constant.resolveList(dto.getConstant(), dto.getIterationContainerId(), this.cache);
        this.definedCategory.resolveList(dto.getDefinedCategory(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.fileType.resolveList(dto.getFileType(), dto.getIterationContainerId(), this.cache);
        this.glossary.resolveList(dto.getGlossary(), dto.getIterationContainerId(), this.cache);
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.isDeprecated = dto.getIsDeprecated();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.parameterType.resolveList(dto.getParameterType(), dto.getIterationContainerId(), this.cache);
        this.referenceSource.resolveList(dto.getReferenceSource(), dto.getIterationContainerId(), this.cache);
        this.requiredRdl = (dto.getRequiredRdl() != null) ? this.cache.get<SiteReferenceDataLibrary>(dto.getRequiredRdl.getValue(), dto.getIterationContainerId()) : null;
        this.revisionNumber = dto.getRevisionNumber();
        this.rule.resolveList(dto.getRule(), dto.getIterationContainerId(), this.cache);
        this.scale.resolveList(dto.getScale(), dto.getIterationContainerId(), this.cache);
        this.shortName = dto.getShortName();
        this.unit.resolveList(dto.getUnit(), dto.getIterationContainerId(), this.cache);
        this.unitPrefix.resolveList(dto.getUnitPrefix(), dto.getIterationContainerId(), this.cache);

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>SiteReferenceDataLibrary<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see SiteReferenceDataLibrary
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.SiteReferenceDataLibrary dto = new cdp4common.dto.SiteReferenceDataLibrary(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getBaseQuantityKind().add(this.baseQuantityKind.toDtoOrderedItemList());
        dto.getBaseUnit().add(this.baseUnit.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getConstant().add(this.constant.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinedCategory().add(this.definedCategory.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getFileType().add(this.fileType.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getGlossary().add(this.glossary.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsDeprecated(this.isDeprecated);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.getParameterType().add(this.parameterType.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getReferenceSource().add(this.referenceSource.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setRequiredRdl(this.requiredRdl != null ? (UUID)this.requiredRdl.getIid() : null);
        dto.setRevisionNumber(this.revisionNumber);
        dto.getRule().add(this.rule.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getScale().add(this.scale.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setShortName(this.shortName);
        dto.getUnit().add(this.unit.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getUnitPrefix().add(this.unitPrefix.stream().map(x -> x.Iid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
