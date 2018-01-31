/* --------------------------------------------------------------------------------------------------------------------
 * AbstractArrayParameterType.java
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
 * specialization of CompoundParameterType that specifies a one-dimensional or multi-dimensional array parameter type with elements (components) that are typed by other ScalarParameterTypes
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
@EqualsAndHashCode
public  class ArrayParameterType extends CompoundParameterType  {
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
     * Initializes a new instance of the {@link ArrayParameterType} class.
     */
    public ArrayParameterType() {
        this.dimension = new OrderedItemList<int>(this);
    }

    /**
     * Initializes a new instance of the {@link ArrayParameterType} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public ArrayParameterType(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.dimension = new OrderedItemList<int>(this);
    }

    /**
     * List of ordered Int.
     * definition of the number of array elements in each dimension
     * Note: Implicitly this also defines the number of dimensions of the array
     * which determines its <i>rank</i>
     * Example: To define an ArrayParameterType for a 3 by 3 matrix, <i>dimension</i>
     * would be set to {3,3}.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<int> dimension;

    /**
     * Value indicating whether hasSingleComponentType.
     * derived assertion that all components of an ArrayParameterType are of the same ParameterType, and, if the ParameterType is a QuantityKind, of the same MeasurementScale
     * Note: In an implementation when creating an ArrayParameterType it is useful to provide the option to specify that all <i>component</i> ParameterTypeComponents will have the same ParameterType and where applicable the same MeasurementScale.
     * Example: An example of an ArrayParameterType for which <i>hasSingleComponentType</i> is true, is a 3D Cartesian vector (with one <i>dimension </i>with value 3) where the <i>parameterType</i> of each <i>component</i> is the "length" SimpleQuantityKind and the <i>scale</i> is the "millimetre" RatioScale.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private boolean hasSingleComponentType;
 
    /**
     * Value indicating whether isTensor.
     * assertion whether this parameter type is a tensor
     * Note: An nth-rank tensor in m-dimensional space is a mathematical object that has n indices and m<sup>n</sup> components and obeys certain transformation rules. For details see e.g. <a href="http://mathworld.wolfram.com/Tensor.html">http://mathworld.wolfram.com/Tensor.html</a>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isTensor;

    /**
     * Property rank.
     * specifies the rank
     * Note: The rank of an array datatype is equal to the number of dimensions
     * it has.
     * Example: A vector has rank = 1, a matrix has rank = 2, a higher order
     * tensor has rank > 2. Vector and matrix are special cases of the general
     * concept of tensor.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private int rank;
 

    /**
     * Gets a list of ordered Int.
     * definition of the number of array elements in each dimension
     * Note: Implicitly this also defines the number of dimensions of the array
     * which determines its <i>rank</i>
     * Example: To define an ArrayParameterType for a 3 by 3 matrix, <i>dimension</i>
     * would be set to {3,3}.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<int> getDimension(){
         return this.dimension;
    }

    /**
     * Gets a value indicating whether hasSingleComponentType.
     * derived assertion that all components of an ArrayParameterType are of the same ParameterType, and, if the ParameterType is a QuantityKind, of the same MeasurementScale
     * Note: In an implementation when creating an ArrayParameterType it is useful to provide the option to specify that all <i>component</i> ParameterTypeComponents will have the same ParameterType and where applicable the same MeasurementScale.
     * Example: An example of an ArrayParameterType for which <i>hasSingleComponentType</i> is true, is a 3D Cartesian vector (with one <i>dimension </i>with value 3) where the <i>parameterType</i> of each <i>component</i> is the "length" SimpleQuantityKind and the <i>scale</i> is the "millimetre" RatioScale.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public boolean getHasSingleComponentType(){
        return this.GetDerivedHasSingleComponentType();
    }

    /**
     * Gets a value indicating whether isTensor.
     * assertion whether this parameter type is a tensor
     * Note: An nth-rank tensor in m-dimensional space is a mathematical object that has n indices and m<sup>n</sup> components and obeys certain transformation rules. For details see e.g. <a href="http://mathworld.wolfram.com/Tensor.html">http://mathworld.wolfram.com/Tensor.html</a>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getTensor(){
         return this.isTensor;
    }

    /**
     * Gets the rank.
     * specifies the rank
     * Note: The rank of an array datatype is equal to the number of dimensions
     * it has.
     * Example: A vector has rank = 1, a matrix has rank = 2, a higher order
     * tensor has rank > 2. Vector and matrix are special cases of the general
     * concept of tensor.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public int getRank(){
        return this.GetDerivedRank();
    }

    /**
     * Sets a list of ordered Int.
     * definition of the number of array elements in each dimension
     * Note: Implicitly this also defines the number of dimensions of the array
     * which determines its <i>rank</i>
     * Example: To define an ArrayParameterType for a 3 by 3 matrix, <i>dimension</i>
     * would be set to {3,3}.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     public void setDimension(OrderedItemList<int> dimension){
        this.dimension = dimension;
    }

    /**
     *Sets a value indicating whether hasSingleComponentType.
     * derived assertion that all components of an ArrayParameterType are of the same ParameterType, and, if the ParameterType is a QuantityKind, of the same MeasurementScale
     * Note: In an implementation when creating an ArrayParameterType it is useful to provide the option to specify that all <i>component</i> ParameterTypeComponents will have the same ParameterType and where applicable the same MeasurementScale.
     * Example: An example of an ArrayParameterType for which <i>hasSingleComponentType</i> is true, is a 3D Cartesian vector (with one <i>dimension </i>with value 3) where the <i>parameterType</i> of each <i>component</i> is the "length" SimpleQuantityKind and the <i>scale</i> is the "millimetre" RatioScale.
     *
     * @throws IllegalStateException The hasSingleComponentType property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setHasSingleComponentType(boolean hasSingleComponentType){
        throw new IllegalStateException("Forbidden Set value for the derived property ArrayParameterType.hasSingleComponentType");
    }

    /**
     *Sets a value indicating whether isTensor.
     * assertion whether this parameter type is a tensor
     * Note: An nth-rank tensor in m-dimensional space is a mathematical object that has n indices and m<sup>n</sup> components and obeys certain transformation rules. For details see e.g. <a href="http://mathworld.wolfram.com/Tensor.html">http://mathworld.wolfram.com/Tensor.html</a>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setTensor(boolean isTensor){
        this.isTensor = isTensor;
    }

    /**
     * Sets the rank.
     * specifies the rank
     * Note: The rank of an array datatype is equal to the number of dimensions
     * it has.
     * Example: A vector has rank = 1, a matrix has rank = 2, a higher order
     * tensor has rank > 2. Vector and matrix are special cases of the general
     * concept of tensor.
     *
     * @throws IllegalStateException The rank property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setRank(int rank){
        throw new IllegalStateException("Forbidden Set value for the derived property ArrayParameterType.rank");
    }

    /**
     * Creates and returns a copy of this {@link ArrayParameterType} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ArrayParameterType}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ArrayParameterType clone = (ArrayParameterType)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setComponent(cloneContainedThings ? new OrderedItemList<ParameterTypeComponent>(clone, true) : new OrderedItemList<ParameterTypeComponent>(this.getComponent(), clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setDimension(new OrderedItemList<int>(this.getDimension(), this));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getComponent().addAll(this.getComponent().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link ArrayParameterType} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link ArrayParameterType}.
     */
    @Override
    public ArrayParameterType clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ArrayParameterType)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ArrayParameterType}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link ArrayParameterType} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ArrayParameterType dto = (cdp4common.dto.ArrayParameterType)dtoThing;

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.getCategory().resolveList(dto.getCategory(), dto.getIterationContainerId(), this.getCache());
        this.getComponent().resolveList(dto.getComponent(), dto.getIterationContainerId(), this.getCache());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getDimension().clearAndAddRange(dto.getDimension());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setDeprecated(dto.getDeprecated());
        this.setFinalized(dto.getFinalized());
        this.setTensor(dto.getTensor());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.setSymbol(dto.getSymbol());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link ArrayParameterType}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ArrayParameterType dto = new cdp4common.dto.ArrayParameterType(this.getIid(), this.getRevisionNumber());

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getCategory().add(this.getCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getComponent().add(this.getComponent().toDtoOrderedItemList());
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getDimension().add(this.getDimension().toDtoOrderedItemList());
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setDeprecated(this.getDeprecated());
        dto.setFinalized(this.getFinalized());
        dto.setTensor(this.getTensor());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.setSymbol(this.getSymbol());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
