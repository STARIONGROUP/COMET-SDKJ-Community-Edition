/* --------------------------------------------------------------------------------------------------------------------
 * AbstractAlias.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.commondata;

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
 * representation of an alternative human-readable name for a concept
 * Note: An alias may be a translation of the <i>name</i> of the referring DefinedThing in a given natural language or a synonym in any natural language. The alias name is stored in the <i>content</i> property.
 */
@Container(clazz = DefinedThing.class, propertyName = "alias")
public abstract class AbstractAlias extends AbstractThing implements Annotation {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>Alias<code/> class.
     *
     * @see Alias
     */
    public AbstractAlias() {
    }

    /**
     * Initializes a new instance of the <code>Alias<code/> class.
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
     * @see Alias
     */
    public AbstractAlias(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property content.
     * textual content of the annotation expressed in the natural language as
     * specified in <i>languageCode</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String content;

    /**
     * Value indicating whether isSynonym.
     * assertion whether <i>content</i> of this Alias is a synonym for the
     * referring DefinedThing
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isSynonym;

    /**
     * Property languageCode.
     * code that defines the natural language in which the annotation is written
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String languageCode;

    /**
     * Gets the content.
     * textual content of the annotation expressed in the natural language as
     * specified in <i>languageCode</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getContent(){
         return this.content;
    }

    /**
     * Gets a value indicating whether isSynonym.
     * assertion whether <i>content</i> of this Alias is a synonym for the
     * referring DefinedThing
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getSynonym(){
         return this.isSynonym;
    }

    /**
     * Gets the languageCode.
     * code that defines the natural language in which the annotation is written
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getLanguageCode(){
         return this.languageCode;
    }

    /**
     * Sets the content.
     * textual content of the annotation expressed in the natural language as
     * specified in <i>languageCode</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setContent(String content){
        this.content = content;
    }

    /**
     *Sets a value indicating whether isSynonym.
     * assertion whether <i>content</i> of this Alias is a synonym for the
     * referring DefinedThing
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setSynonym(boolean isSynonym){
        this.isSynonym = isSynonym;
    }

    /**
     * Sets the languageCode.
     * code that defines the natural language in which the annotation is written
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setLanguageCode(String languageCode){
        this.languageCode = languageCode;
    }

    /**
     * Creates and returns a copy of this <code>Alias<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Alias<code/>.
     *
     * @see Alias
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        Alias clone = (Alias)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>Alias<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Alias<code/>.
     * 
     * @see Alias
     */
    @Override
    public Alias clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Alias)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>Alias<code/>.
     *
     * @return A list of potential errors.
     *
     * @see Alias
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.content.trim().isEmpty()) {
            errorList.add("The property content is null or empty.");
        }

        if (this.languageCode.trim().isEmpty()) {
            errorList.add("The property languageCode is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>Alias<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see Alias
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Alias dto = (cdp4common.dto.Alias)dtoThing;

        this.content = dto.getContent();
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.isSynonym = dto.getIsSynonym();
        this.languageCode = dto.getLanguageCode();
        this.modifiedOn = dto.getModifiedOn();
        this.revisionNumber = dto.getRevisionNumber();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>Alias<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see Alias
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Alias dto = new cdp4common.dto.Alias(this.iid, this.revisionNumber);

        dto.setContent(this.content);
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsSynonym(this.isSynonym);
        dto.setLanguageCode(this.languageCode);
        dto.setModifiedOn(this.modifiedOn);
        dto.setRevisionNumber(this.revisionNumber);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
