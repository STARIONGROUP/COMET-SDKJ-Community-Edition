/* --------------------------------------------------------------------------------------------------------------------
 * AbstractHyperLink.java
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
 * representation of a hyperlink consisting of a URI and a descriptive text
 */
@Container(clazz = DefinedThing.class, propertyName = "hyperLink")
public abstract class AbstractHyperLink extends AbstractThing implements Annotation {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>HyperLink<code/> class.
     *
     * @see HyperLink
     */
    public AbstractHyperLink() {
    }

    /**
     * Initializes a new instance of the <code>HyperLink<code/> class.
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
     * @see HyperLink
     */
    public AbstractHyperLink(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property content.
     * textual content of the annotation expressed in the natural language as
     * specified in <i>languageCode</i>
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String content;

    /**
     * Property languageCode.
     * code that defines the natural language in which the annotation is written
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String languageCode;

    /**
     * Property uri.
     * value of the actual Universal Resource Identifier (URI)
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String uri;

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
     * Gets the languageCode.
     * code that defines the natural language in which the annotation is written
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getLanguageCode(){
         return this.languageCode;
    }

    /**
     * Gets the uri.
     * value of the actual Universal Resource Identifier (URI)
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getUri(){
         return this.uri;
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
     * Sets the languageCode.
     * code that defines the natural language in which the annotation is written
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setLanguageCode(String languageCode){
        this.languageCode = languageCode;
    }

    /**
     * Sets the uri.
     * value of the actual Universal Resource Identifier (URI)
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setUri(String uri){
        this.uri = uri;
    }

    /**
     * Creates and returns a copy of this <code>HyperLink<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>HyperLink<code/>.
     *
     * @see HyperLink
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        HyperLink clone = (HyperLink)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>HyperLink<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>HyperLink<code/>.
     * 
     * @see HyperLink
     */
    @Override
    public HyperLink clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (HyperLink)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>HyperLink<code/>.
     *
     * @return A list of potential errors.
     *
     * @see HyperLink
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.content.trim().isEmpty()) {
            errorList.add("The property content is null or empty.");
        }

        if (this.languageCode.trim().isEmpty()) {
            errorList.add("The property languageCode is null or empty.");
        }

        if (this.uri.trim().isEmpty()) {
            errorList.add("The property uri is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>HyperLink<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see HyperLink
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.HyperLink dto = (cdp4common.dto.HyperLink)dtoThing;

        this.content = dto.getContent();
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.languageCode = dto.getLanguageCode();
        this.modifiedOn = dto.getModifiedOn();
        this.revisionNumber = dto.getRevisionNumber();
        this.uri = dto.getUri();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>HyperLink<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see HyperLink
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.HyperLink dto = new cdp4common.dto.HyperLink(this.iid, this.revisionNumber);

        dto.setContent(this.content);
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setLanguageCode(this.languageCode);
        dto.setModifiedOn(this.modifiedOn);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setUri(this.uri);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
