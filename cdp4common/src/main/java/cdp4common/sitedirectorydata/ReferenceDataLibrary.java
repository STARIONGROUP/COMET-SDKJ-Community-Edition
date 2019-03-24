/* --------------------------------------------------------------------------------------------------------------------
 * ReferenceDataLibrary.java
 * Copyright (c) 2015 - 2019 RHEA System S.A.
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
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * named library that holds a set of (predefined) reference data that can be loaded at runtime and used in an EngineeringModel
 * Note 1: An EngineeringModel may use one or more reference data libraries. Typically there would be 3 levels as follows:
 * Note 2: One or more ReferenceDataLibraries hold the <i>system of quantities</i> that is defined in <a href="http://www.bipm.org/en/publications/guides/vim.html">VIM</a> as a "set of quantities together with a set of non-contradictory equations relating those quantities" and the system of units defined in <a href="http://www.bipm.org/en/publications/guides/vim.html">VIM</a> as "set of base units and derived units, together with their multiples and submultiples, defined in accordance with given rules, for a given system of quantities". E-TM-10-25 uses as a basis the International System of Quantities (ISQ) and the International System of Units as defined in ISO/IEC 80000. In addition measurement scales are explicitly defined, so that a fully self-described system is captured. Where needed this is extended with non-SI quantities, scales and units with explicit conversion relationships.
 * Note 3: Instances contained by a ReferenceDataLibrary
 * may not be deleted because that would potentially invalidate such libraries for earlier EngineeringModels or other ReferenceDataLibraries that reference them. Such instances may only be deprecated, see DeprecatableThing.
 */
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class ReferenceDataLibrary extends DefinedThing implements Cloneable, ParticipantAffectedAccessThing {
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
     * Initializes a new instance of the {@link ReferenceDataLibrary} class.
     */
    protected ReferenceDataLibrary() {
        this.baseQuantityKind = new OrderedItemList<QuantityKind>(this, QuantityKind.class);
        this.baseUnit = new ArrayList<MeasurementUnit>();
        this.constant = new ContainerList<Constant>(this);
        this.definedCategory = new ContainerList<Category>(this);
        this.fileType = new ContainerList<FileType>(this);
        this.glossary = new ContainerList<Glossary>(this);
        this.parameterType = new ContainerList<ParameterType>(this);
        this.referenceSource = new ContainerList<ReferenceSource>(this);
        this.rule = new ContainerList<Rule>(this);
        this.scale = new ContainerList<MeasurementScale>(this);
        this.unit = new ContainerList<MeasurementUnit>(this);
        this.unitPrefix = new ContainerList<UnitPrefix>(this);
    }

    /**
     * Initializes a new instance of the {@link ReferenceDataLibrary} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    protected ReferenceDataLibrary(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.baseQuantityKind = new OrderedItemList<QuantityKind>(this, QuantityKind.class);
        this.baseUnit = new ArrayList<MeasurementUnit>();
        this.constant = new ContainerList<Constant>(this);
        this.definedCategory = new ContainerList<Category>(this);
        this.fileType = new ContainerList<FileType>(this);
        this.glossary = new ContainerList<Glossary>(this);
        this.parameterType = new ContainerList<ParameterType>(this);
        this.referenceSource = new ContainerList<ReferenceSource>(this);
        this.rule = new ContainerList<Rule>(this);
        this.scale = new ContainerList<MeasurementScale>(this);
        this.unit = new ContainerList<MeasurementUnit>(this);
        this.unitPrefix = new ContainerList<UnitPrefix>(this);
    }

    /**
     * List of ordered QuantityKind.
     * collection of references to the QuantityKinds that are selected as a basis of the system of quantities defined in this ReferenceDataLibrary
     * Note 1: This is a subset of the complete set of QuantityKinds. The base quantities define the basis for the quantity dimension of a kind of quantity.
     * Note 2: If a QuantityKind is in this collection and thus a base QuantityKind, then this base QuantityKind is considered to be primary kind of quantity for the MeasurementUnit of the <i>defaultScale</i> MeasurementScale.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private OrderedItemList<QuantityKind> baseQuantityKind;

    /**
     * List of MeasurementUnit.
     * specification of the base MeasurementUnits for the system of units
     * defined in this ReferenceDataLibrary
     * Note: A "base unit" is defined in [VIM] as a "measurement unit that is
     * adopted by convention for a base quantity", i.e. it is the (preferred)
     * unit in which base quantities of the associated system of quantities are
     * expressed.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ArrayList<MeasurementUnit> baseUnit;

    /**
     * List of contained Constant.
     * contained collection of Constants
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Constant> constant;

    /**
     * List of contained Category.
     * collection of defined, i.e. known, Categories
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Category> definedCategory;

    /**
     * List of contained FileType.
     * collection of defined, i.e. known, FileTypes
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<FileType> fileType;

    /**
     * List of contained Glossary.
     * contained collection of Glossaries
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Glossary> glossary;

    /**
     * List of contained ParameterType.
     * contained collection of ParameterTypes
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ParameterType> parameterType;

    /**
     * List of contained ReferenceSource.
     * contained collection of ReferenceSources
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<ReferenceSource> referenceSource;

    /**
     * Property requiredRdl.
     * optional reference to the required next higher level ReferenceDataLibrary
     * Note: This property allows chaining an ordered list of ReferenceDataLibraries for use within an EngineeringModel. Its implementation shall have a similar effect as an "import" or "include" statement in a programming language. There shall not be any circular references in the list. This property is empty for the top level ReferenceDataLibrary.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private SiteReferenceDataLibrary requiredRdl;

    /**
     * List of contained Rule.
     * collection of defined, i.e. known, Rules
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<Rule> rule;

    /**
     * List of contained MeasurementScale.
     * contained collection of MeasurementScales
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<MeasurementScale> scale;

    /**
     * List of contained MeasurementUnit.
     * contained collection of MeasurementUnits
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<MeasurementUnit> unit;

    /**
     * List of contained UnitPrefix.
     * collection of zero or more UnitPrefix instances that define the prefixes for multiples and submultiples of (metric) MeasurementUnits
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<UnitPrefix> unitPrefix;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link ReferenceDataLibrary}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link ReferenceDataLibrary}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.constant);
        containers.add(this.definedCategory);
        containers.add(this.fileType);
        containers.add(this.glossary);
        containers.add(this.parameterType);
        containers.add(this.referenceSource);
        containers.add(this.rule);
        containers.add(this.scale);
        containers.add(this.unit);
        containers.add(this.unitPrefix);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link ReferenceDataLibrary} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ReferenceDataLibrary}.
     */
    @Override
    public ReferenceDataLibrary clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ReferenceDataLibrary)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this ReferenceDataLibrary}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Gets the chain of required Rdl for this {@link ReferenceDataLibrary}
     *
     * @return A {@link Collection} of the chain of required Rdl
     */
    public Collection<ReferenceDataLibrary> getRequiredRdlsChain() {
        ReferenceDataLibrary requiredRdl = this.getRequiredRdl();
        Collection<ReferenceDataLibrary> requiredRdlsChain = new ArrayList<>();

        while (requiredRdl != null) {
            requiredRdlsChain.add(requiredRdl);
            requiredRdl = requiredRdl.getRequiredRdl();
        }

        return requiredRdlsChain;
    }

    /**
     * Gets an {@link Collection<ReferenceDataLibrary>} that contains
     * the required {@link ReferenceDataLibrary} for the current {@link Thing}
     */
    @Override
    public Collection<ReferenceDataLibrary> getRequiredRdls() {
        Set<ReferenceDataLibrary> requiredRdls = new HashSet<>(super.getRequiredRdls());
        requiredRdls.addAll(this.getRequiredRdlsChain());
        return requiredRdls;
    }

    /**
     * Gets the aggregation of all required {@link ReferenceDataLibrary} besides the current one
     */
    public Collection<ReferenceDataLibrary> getAggregatedReferenceDataLibrary() {
        Collection<ReferenceDataLibrary> aggregatedReferenceDataLibrary = new ArrayList<>();
        aggregatedReferenceDataLibrary.add(this);

        aggregatedReferenceDataLibrary.addAll(this.getRequiredRdlsChain());

        return aggregatedReferenceDataLibrary;
    }
}
