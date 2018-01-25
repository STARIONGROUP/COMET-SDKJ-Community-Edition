/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParametricConstraint.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

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
 * representation of a single parametric constraint consisting of a ParameterType that acts as a variable, a relational operator and a value, in the form of a mathematical equality or inequality
 */
@Container(clazz = Requirement.class, propertyName = "parametricConstraint")
public abstract class AbstractParametricConstraint extends AbstractThing implements OwnedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>ParametricConstraint<code/> class.
     *
     * @see ParametricConstraint
     */
    public AbstractParametricConstraint() {
        this.expression = new ContainerList<BooleanExpression>(this);
    }

    /**
     * Initializes a new instance of the <code>ParametricConstraint<code/> class.
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
     * @see ParametricConstraint
     */
    public AbstractParametricConstraint(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.expression = new ContainerList<BooleanExpression>(this);
    }

    /**
     * List of contained BooleanExpression.
     * collection of all BooleanExpressions that define this ParametricConstraint
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<BooleanExpression> expression;

    /**
     * Property owner.
     * reference to the DomainOfExpertise that is the owner of this RequirementsGroup, which is derived to be the same as the owner of the next higher level RequirementsGroup or RequirementsSpecification
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private DomainOfExpertise owner;
 
    /**
     * Property topExpression.
     * reference to the top BooleanExpression (of a possibly nested set of BooleanExpression) that defines this ParametricConstraint
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private BooleanExpression topExpression;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>ParametricConstraint<code/>.
     *
     * @see Iterable
     * @see ParametricConstraint
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of contained BooleanExpression.
     * collection of all BooleanExpressions that define this ParametricConstraint
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<BooleanExpression> getExpression(){
         return this.expression;
    }

    /**
     * Gets the owner.
     * reference to the DomainOfExpertise that is the owner of this RequirementsGroup, which is derived to be the same as the owner of the next higher level RequirementsGroup or RequirementsSpecification
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public DomainOfExpertise getOwner(){
        return this.GetDerivedOwner();
    }

    /**
     * Gets the topExpression.
     * reference to the top BooleanExpression (of a possibly nested set of BooleanExpression) that defines this ParametricConstraint
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public BooleanExpression getTopExpression(){
         return this.topExpression;
    }

    /**
     * Sets a list of contained BooleanExpression.
     * collection of all BooleanExpressions that define this ParametricConstraint
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setExpression(ContainerList<BooleanExpression> expression){
        this.expression = expression;
    }

    /**
     * Sets the owner.
     * reference to the DomainOfExpertise that is the owner of this RequirementsGroup, which is derived to be the same as the owner of the next higher level RequirementsGroup or RequirementsSpecification
     *
     * @throws IllegalStateException The owner property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setOwner(DomainOfExpertise owner){
        throw new IllegalStateException("Forbidden Set value for the derived property ParametricConstraint.owner");
    }

    /**
     * Sets the topExpression.
     * reference to the top BooleanExpression (of a possibly nested set of BooleanExpression) that defines this ParametricConstraint
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setTopExpression(BooleanExpression topExpression){
        this.topExpression = topExpression;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>ParametricConstraint<code/>.
     *
     * @see Iterable
     * @see ParametricConstraint
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.expression);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>ParametricConstraint<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParametricConstraint<code/>.
     *
     * @see ParametricConstraint
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ParametricConstraint clone = (ParametricConstraint)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setExpression(cloneContainedThings ? new ContainerList<BooleanExpression>(clone) : new ContainerList<BooleanExpression>(this.expression, clone));

        if (cloneContainedThings) {
            clone.getExpression().addAll(this.expression.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>ParametricConstraint<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParametricConstraint<code/>.
     * 
     * @see ParametricConstraint
     */
    @Override
    public ParametricConstraint clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParametricConstraint)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ParametricConstraint<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ParametricConstraint
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int expressionCount = this.expression.size();
        if (expressionCount < 1) {
            errorList.add("The number of elements in the property expression is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ParametricConstraint<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ParametricConstraint
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParametricConstraint dto = (cdp4common.dto.ParametricConstraint)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.expression.resolveList(dto.getExpression(), dto.getIterationContainerId(), this.cache);
        this.modifiedOn = dto.getModifiedOn();
        this.revisionNumber = dto.getRevisionNumber();
        this.topExpression = (dto.getTopExpression() != null) ? this.cache.get<BooleanExpression>(dto.getTopExpression.getValue(), dto.getIterationContainerId()) : null;

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ParametricConstraint<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ParametricConstraint
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ParametricConstraint dto = new cdp4common.dto.ParametricConstraint(this.iid, this.revisionNumber);

        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExpression().add(this.expression.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setModifiedOn(this.modifiedOn);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setTopExpression(this.topExpression != null ? (UUID)this.topExpression.getIid() : null);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
