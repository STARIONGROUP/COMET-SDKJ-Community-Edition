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

/**
 * representation of an enumeration valued ScalarParameterType with a user-defined list of text values (enumeration literals) to select from
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
public abstract class AbstractEnumerationParameterType extends AbstractScalarParameterType  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>EnumerationParameterType<code/> class.
     *
     * @see EnumerationParameterType
     */
    public AbstractEnumerationParameterType() {
        this.valueDefinition = new OrderedItemList<EnumerationValueDefinition>(this, true);
    }

    /**
     * Initializes a new instance of the <code>EnumerationParameterType<code/> class.
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
     * @see EnumerationParameterType
     */
    public AbstractEnumerationParameterType(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
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
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>EnumerationParameterType<code/>.
     *
     * @see Iterable
     * @see EnumerationParameterType
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
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>EnumerationParameterType<code/>.
     *
     * @see Iterable
     * @see EnumerationParameterType
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.valueDefinition);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>EnumerationParameterType<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>EnumerationParameterType<code/>.
     *
     * @see EnumerationParameterType
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        EnumerationParameterType clone = (EnumerationParameterType)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setCategory(new List<Category>(this.category));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));
        clone.setValueDefinition(cloneContainedThings ? new OrderedItemList<EnumerationValueDefinition>(clone, true) : new OrderedItemList<EnumerationValueDefinition>(this.valueDefinition, clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getValueDefinition().addAll(this.valueDefinition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>EnumerationParameterType<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>EnumerationParameterType<code/>.
     * 
     * @see EnumerationParameterType
     */
    @Override
    public EnumerationParameterType clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (EnumerationParameterType)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>EnumerationParameterType<code/>.
     *
     * @return A list of potential errors.
     *
     * @see EnumerationParameterType
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int valueDefinitionCount = this.valueDefinition.size();
        if (valueDefinitionCount < 1) {
            errorList.add("The number of elements in the property valueDefinition is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>EnumerationParameterType<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see EnumerationParameterType
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.EnumerationParameterType dto = (cdp4common.dto.EnumerationParameterType)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.allowMultiSelect = dto.getAllowMultiSelect();
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.isDeprecated = dto.getIsDeprecated();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();
        this.symbol = dto.getSymbol();
        this.valueDefinition.resolveList(dto.getValueDefinition(), dto.getIterationContainerId(), this.cache);

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>EnumerationParameterType<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see EnumerationParameterType
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.EnumerationParameterType dto = new cdp4common.dto.EnumerationParameterType(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setAllowMultiSelect(this.allowMultiSelect);
        dto.getCategory().add(this.category.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsDeprecated(this.isDeprecated);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);
        dto.setSymbol(this.symbol);
        dto.getValueDefinition().add(this.valueDefinition.toDtoOrderedItemList());

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
