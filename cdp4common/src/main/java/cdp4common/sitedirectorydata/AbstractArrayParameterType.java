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

/**
 * specialization of CompoundParameterType that specifies a one-dimensional or multi-dimensional array parameter type with elements (components) that are typed by other ScalarParameterTypes
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
public abstract class AbstractArrayParameterType extends AbstractCompoundParameterType  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>ArrayParameterType<code/> class.
     *
     * @see ArrayParameterType
     */
    public AbstractArrayParameterType() {
        this.dimension = new OrderedItemList<int>(this);
    }

    /**
     * Initializes a new instance of the <code>ArrayParameterType<code/> class.
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
     * @see ArrayParameterType
     */
    public AbstractArrayParameterType(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
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
     * Creates and returns a copy of this <code>ArrayParameterType<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ArrayParameterType<code/>.
     *
     * @see ArrayParameterType
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ArrayParameterType clone = (ArrayParameterType)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setCategory(new List<Category>(this.category));
        clone.setComponent(cloneContainedThings ? new OrderedItemList<ParameterTypeComponent>(clone, true) : new OrderedItemList<ParameterTypeComponent>(this.component, clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setDimension(new OrderedItemList<int>(this.dimension, this));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getComponent().addAll(this.component.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>ArrayParameterType<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ArrayParameterType<code/>.
     * 
     * @see ArrayParameterType
     */
    @Override
    public ArrayParameterType clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ArrayParameterType)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ArrayParameterType<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ArrayParameterType
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ArrayParameterType<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ArrayParameterType
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ArrayParameterType dto = (cdp4common.dto.ArrayParameterType)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.cache);
        this.component.resolveList(dto.getComponent(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.dimension.clearAndAddRange(dto.getDimension());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.isDeprecated = dto.getIsDeprecated();
        this.isFinalized = dto.getIsFinalized();
        this.isTensor = dto.getIsTensor();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();
        this.symbol = dto.getSymbol();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ArrayParameterType<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ArrayParameterType
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ArrayParameterType dto = new cdp4common.dto.ArrayParameterType(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getCategory().add(this.category.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getComponent().add(this.component.toDtoOrderedItemList());
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDimension().add(this.dimension.toDtoOrderedItemList());
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsDeprecated(this.isDeprecated);
        dto.setIsFinalized(this.isFinalized);
        dto.setIsTensor(this.isTensor);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);
        dto.setSymbol(this.symbol);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
