/* --------------------------------------------------------------------------------------------------------------------
 * LogarithmicScale.java
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
 * representation of a logarithmic MeasurementScale
 * Note: The logarithmic ratio quantity value <i>v</i> is computed as follows: <i>v</i> = <i>f</i> · log<sub>base</sub>( (<i>x</i> / <i>x<sub>ref</sub></i> )<i><sup>a</sup></i> ), where <i>f</i> is a multiplication factor, <i>base</i> is the base of the log function, <i>x</i> is the actual quantity, <i>x<sub>ref</sub></i> is a reference quantity, and <i>a</i> is an exponent.
 * Example 1: The base 10 logarithmic measurement scale for "sound pressure level" in "decibel", with <i>factor</i> is "10", <i>exponent</i> is "2", <i>referenceQuantityKind</i> is "sound pressure" and <i>referenceQuantityValue</i>.value is "20" on the "µPa" RatioScale. Source: ISO 80000-08.
 * Example 2: The natural logarithmic measurement scale for "electric field strength" in "neper".
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "scale")
@ToString
@EqualsAndHashCode(callSuper = true)
public class LogarithmicScale extends MeasurementScale implements Cloneable {
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
     * Initializes a new instance of the {@link LogarithmicScale} class.
     */
    public LogarithmicScale() {
        this.referenceQuantityValue = new ContainerList<ScaleReferenceQuantityValue>(this);
    }

    /**
     * Initializes a new instance of the {@link LogarithmicScale} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public LogarithmicScale(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.referenceQuantityValue = new ContainerList<ScaleReferenceQuantityValue>(this);
    }

    /**
     * Property exponent.
     * exponent used in the definition formula for the quantity value for this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String exponent;

    /**
     * Property factor.
     * factor used in the definition formula for the quantity value for this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String factor;

    /**
     * Property logarithmBase.
     * base of the logarithmic function used on this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private LogarithmBaseKind logarithmBase;

    /**
     * Property referenceQuantityKind.
     * reference to the applicable QuantityKind for the quotient of quantities in the definition formula of this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private QuantityKind referenceQuantityKind;

    /**
     * List of contained ScaleReferenceQuantityValue.
     * optional value for the reference quantity in the definition formula for this LogarithmicScale
     * Note: A logarithmic scale may define a fixed reference quantity. See also <a href="http://www.nist.gov/pml/pubs/sp811/index.cfm">NIST SP811</a> for many more details.
     * Example: The base 10 logarithmic scale for "sound pressure level" in decibel is defined with respect to a reference sound pressure <i>p<sub>0</sub></i> = 20 µPa. The sound pressure level value on such a scale for a corresponding sound pressure <i>p</i> would then be 10·log<sub>10</sub>((<i>p</i>/<i>p<sub>0</sub></i>)<sup>2</sup>) dB.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ScaleReferenceQuantityValue> referenceQuantityValue;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link LogarithmicScale}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link LogarithmicScale}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.referenceQuantityValue);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link LogarithmicScale} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link LogarithmicScale}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        LogarithmicScale clone;
        try {
            clone = (LogarithmicScale)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow LogarithmicScale cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone, false));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone, false));
        clone.setMappingToReferenceScale(cloneContainedThings ? new ContainerList<MappingToReferenceScale>(clone) : new ContainerList<MappingToReferenceScale>(this.getMappingToReferenceScale(), clone, false));
        clone.setReferenceQuantityValue(cloneContainedThings ? new ContainerList<ScaleReferenceQuantityValue>(clone) : new ContainerList<ScaleReferenceQuantityValue>(this.getReferenceQuantityValue(), clone, false));
        clone.setValueDefinition(cloneContainedThings ? new ContainerList<ScaleValueDefinition>(clone) : new ContainerList<ScaleValueDefinition>(this.getValueDefinition(), clone, false));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getMappingToReferenceScale().addAll(this.getMappingToReferenceScale().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getReferenceQuantityValue().addAll(this.getReferenceQuantityValue().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getValueDefinition().addAll(this.getValueDefinition().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link LogarithmicScale} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link LogarithmicScale}.
     */
    @Override
    public LogarithmicScale clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (LogarithmicScale)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this LogarithmicScale}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (Strings.isNullOrEmpty(this.getExponent())) {
            errorList.add("The property exponent is null or empty.");
        }

        if (Strings.isNullOrEmpty(this.getFactor())) {
            errorList.add("The property factor is null or empty.");
        }

        if (this.getReferenceQuantityKind() == null || this.getReferenceQuantityKind().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property referenceQuantityKind is null.");
            this.setReferenceQuantityKind(SentinelThingProvider.getSentinel(QuantityKind.class));
            this.sentinelResetMap.put("referenceQuantityKind", new ActionImpl(() -> this.setReferenceQuantityKind(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link LogarithmicScale} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.LogarithmicScale dto = (cdp4common.dto.LogarithmicScale)dtoThing;

        PojoThingFactory.resolveList(this.getAlias(), dto.getAlias(), dto.getIterationContainerId(), this.getCache(), Alias.class);
        PojoThingFactory.resolveList(this.getDefinition(), dto.getDefinition(), dto.getIterationContainerId(), this.getCache(), Definition.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setExponent(dto.getExponent());
        this.setFactor(dto.getFactor());
        PojoThingFactory.resolveList(this.getHyperLink(), dto.getHyperLink(), dto.getIterationContainerId(), this.getCache(), HyperLink.class);
        this.setDeprecated(dto.isDeprecated());
        this.setMaximumInclusive(dto.isMaximumInclusive());
        this.setMinimumInclusive(dto.isMinimumInclusive());
        this.setLogarithmBase(dto.getLogarithmBase());
        PojoThingFactory.resolveList(this.getMappingToReferenceScale(), dto.getMappingToReferenceScale(), dto.getIterationContainerId(), this.getCache(), MappingToReferenceScale.class);
        this.setMaximumPermissibleValue(dto.getMaximumPermissibleValue());
        this.setMinimumPermissibleValue(dto.getMinimumPermissibleValue());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setNegativeValueConnotation(dto.getNegativeValueConnotation());
        this.setNumberSet(dto.getNumberSet());
        this.setPositiveValueConnotation(dto.getPositiveValueConnotation());
        this.setReferenceQuantityKind(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getReferenceQuantityKind(), dto.getIterationContainerId(), QuantityKind.class), SentinelThingProvider.getSentinel(QuantityKind.class)));
        PojoThingFactory.resolveList(this.getReferenceQuantityValue(), dto.getReferenceQuantityValue(), dto.getIterationContainerId(), this.getCache(), ScaleReferenceQuantityValue.class);
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.setUnit(ObjectUtils.firstNonNull(PojoThingFactory.get(this.getCache(), dto.getUnit(), dto.getIterationContainerId(), MeasurementUnit.class), SentinelThingProvider.getSentinel(MeasurementUnit.class)));
        PojoThingFactory.resolveList(this.getValueDefinition(), dto.getValueDefinition(), dto.getIterationContainerId(), this.getCache(), ScaleValueDefinition.class);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link LogarithmicScale}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.LogarithmicScale dto = new cdp4common.dto.LogarithmicScale(this.getIid(), this.getRevisionNumber());

        dto.getAlias().addAll(this.getAlias().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getDefinition().addAll(this.getDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setExponent(this.getExponent());
        dto.setFactor(this.getFactor());
        dto.getHyperLink().addAll(this.getHyperLink().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setDeprecated(this.isDeprecated());
        dto.setMaximumInclusive(this.isMaximumInclusive());
        dto.setMinimumInclusive(this.isMinimumInclusive());
        dto.setLogarithmBase(this.getLogarithmBase());
        dto.getMappingToReferenceScale().addAll(this.getMappingToReferenceScale().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setMaximumPermissibleValue(this.getMaximumPermissibleValue());
        dto.setMinimumPermissibleValue(this.getMinimumPermissibleValue());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setNegativeValueConnotation(this.getNegativeValueConnotation());
        dto.setNumberSet(this.getNumberSet());
        dto.setPositiveValueConnotation(this.getPositiveValueConnotation());
        dto.setReferenceQuantityKind(this.getReferenceQuantityKind() != null ? this.getReferenceQuantityKind().getIid() : new UUID(0L, 0L));
        dto.getReferenceQuantityValue().addAll(this.getReferenceQuantityValue().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.setUnit(this.getUnit() != null ? this.getUnit().getIid() : new UUID(0L, 0L));
        dto.getValueDefinition().addAll(this.getValueDefinition().stream().map(Thing::getIid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
