/* --------------------------------------------------------------------------------------------------------------------
 * AbstractEnumerationParameterType.java
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
 * representation of an enumeration valued ScalarParameterType with a user-defined list of text values (enumeration literals) to select from
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
@EqualsAndHashCode
public  class EnumerationParameterType extends ScalarParameterType  {
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
        this.valueDefinition = new OrderedItemList<EnumerationValueDefinition>(this, true);
    }

    /**
     * Initializes a new instance of the {@link EnumerationParameterType} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public EnumerationParameterType(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.valueDefinition = new OrderedItemList<EnumerationValueDefinition>(this, true);
    }

    /**
     * Value indicating whether allowMultiSelect.
     * assertion whether for values of this EnumerationParameterType selection of multiple enumeration literals is allowed or not
     * Note: For an EnumerationParameterType with allowMultiSelect false, only one enumeration literal may be selected and in a graphical user interface this would be represented with a set of radio buttons. For an EnumerationParameterType with allowMultiSelect set true, one or more enumeration literals may be selected and in a graphical user interface this would be represented with a set of check buttons. Example: For an enumeration type "TransportKind" the literals "ByAir", "ByTrain", "ByBus", "ByCar", "ByBicycle" and "OnFoot" are defined and allowMultiSelect is set true. Assume that a "Transport" item has parameter "means of transport" of type  "TransportKind". Now for a particular Transport instance "ByTrain" and "ByBicycle" may be both selected.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean allowMultiSelect;

    /**
     * List of ordered contained EnumerationValueDefinition.
     * definition of the literal enumeration values for this EnumerationParameterType
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<EnumerationValueDefinition> valueDefinition;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link EnumerationParameterType}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a value indicating whether allowMultiSelect.
     * assertion whether for values of this EnumerationParameterType selection of multiple enumeration literals is allowed or not
     * Note: For an EnumerationParameterType with allowMultiSelect false, only one enumeration literal may be selected and in a graphical user interface this would be represented with a set of radio buttons. For an EnumerationParameterType with allowMultiSelect set true, one or more enumeration literals may be selected and in a graphical user interface this would be represented with a set of check buttons. Example: For an enumeration type "TransportKind" the literals "ByAir", "ByTrain", "ByBus", "ByCar", "ByBicycle" and "OnFoot" are defined and allowMultiSelect is set true. Assume that a "Transport" item has parameter "means of transport" of type  "TransportKind". Now for a particular Transport instance "ByTrain" and "ByBicycle" may be both selected.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getAllowMultiSelect(){
         return this.allowMultiSelect;
    }

    /**
     * Gets a list of ordered contained EnumerationValueDefinition.
     * definition of the literal enumeration values for this EnumerationParameterType
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<EnumerationValueDefinition> getValueDefinition(){
         return this.valueDefinition;
    }

    /**
     *Sets a value indicating whether allowMultiSelect.
     * assertion whether for values of this EnumerationParameterType selection of multiple enumeration literals is allowed or not
     * Note: For an EnumerationParameterType with allowMultiSelect false, only one enumeration literal may be selected and in a graphical user interface this would be represented with a set of radio buttons. For an EnumerationParameterType with allowMultiSelect set true, one or more enumeration literals may be selected and in a graphical user interface this would be represented with a set of check buttons. Example: For an enumeration type "TransportKind" the literals "ByAir", "ByTrain", "ByBus", "ByCar", "ByBicycle" and "OnFoot" are defined and allowMultiSelect is set true. Assume that a "Transport" item has parameter "means of transport" of type  "TransportKind". Now for a particular Transport instance "ByTrain" and "ByBicycle" may be both selected.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setAllowMultiSelect(boolean allowMultiSelect){
        this.allowMultiSelect = allowMultiSelect;
    }

    /**
     * Sets a list of ordered contained EnumerationValueDefinition.
     * definition of the literal enumeration values for this EnumerationParameterType
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     protected void setValueDefinition(OrderedItemList<EnumerationValueDefinition> valueDefinition){
        this.valueDefinition = valueDefinition;
    }

    /**
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link EnumerationParameterType}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
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
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        EnumerationParameterType clone = (EnumerationParameterType)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));
        clone.setValueDefinition(cloneContainedThings ? new OrderedItemList<EnumerationValueDefinition>(clone, true) : new OrderedItemList<EnumerationValueDefinition>(this.getValueDefinition(), clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getValueDefinition().addAll(this.getValueDefinition().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
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
    public EnumerationParameterType clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (EnumerationParameterType)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>EnumerationParameterType}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
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

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.setAllowMultiSelect(dto.getAllowMultiSelect());
        this.getCategory().resolveList(dto.getCategory(), dto.getIterationContainerId(), this.getCache());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setDeprecated(dto.getDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.setSymbol(dto.getSymbol());
        this.getValueDefinition().resolveList(dto.getValueDefinition(), dto.getIterationContainerId(), this.getCache());

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

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setAllowMultiSelect(this.getAllowMultiSelect());
        dto.getCategory().add(this.getCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setDeprecated(this.getDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.setSymbol(this.getSymbol());
        dto.getValueDefinition().add(this.getValueDefinition().toDtoOrderedItemList());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
