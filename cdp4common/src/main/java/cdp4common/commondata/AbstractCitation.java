/* --------------------------------------------------------------------------------------------------------------------
 * AbstractCitation.java
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
 * reference with cited location to a ReferenceSource
 * Note: The shortName property is used to represent a short human readable identifier for this Citation. This identifier must be unique for the Citations contained in a Definition.
 */
@Container(clazz = Definition.class, propertyName = "citation")
public abstract class AbstractCitation extends AbstractThing implements ShortNamedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>Citation<code/> class.
     *
     * @see Citation
     */
    public AbstractCitation() {
    }

    /**
     * Initializes a new instance of the <code>Citation<code/> class.
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
     * @see Citation
     */
    public AbstractCitation(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Value indicating whether isAdaptation.
     * assertion whether the Definition that contains the Citation is an       adaptation       of       the       definition       in       the       cited       ReferenceSource
     * Note: If isAdaptation is false, this Definition is assumed to be a       verbatim       copy       of       the       referenced       definition.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isAdaptation;

    /**
     * Property location.
     * definition of the location in the associated ReferenceSource that is made reference to
     * Example: Typical citation locations are:  "page 34",  "Table 2",  "pages 93-122",  "Appendix B",  "Chapter 3",  "Annex 5".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String location;

    /**
     * Property remark.
     * optional remark to further describe this Citation and where applicable     explain     an     adaptation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String remark;

    /**
     * Property shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String shortName;

    /**
     * Property source.
     * cited ReferenceSource
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ReferenceSource source;

    /**
     * Gets a value indicating whether isAdaptation.
     * assertion whether the Definition that contains the Citation is an       adaptation       of       the       definition       in       the       cited       ReferenceSource
     * Note: If isAdaptation is false, this Definition is assumed to be a       verbatim       copy       of       the       referenced       definition.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getAdaptation(){
         return this.isAdaptation;
    }

    /**
     * Gets the location.
     * definition of the location in the associated ReferenceSource that is made reference to
     * Example: Typical citation locations are:  "page 34",  "Table 2",  "pages 93-122",  "Appendix B",  "Chapter 3",  "Annex 5".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getLocation(){
         return this.location;
    }

    /**
     * Gets the remark.
     * optional remark to further describe this Citation and where applicable     explain     an     adaptation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getRemark(){
         return this.remark;
    }

    /**
     * Gets the shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getShortName(){
         return this.shortName;
    }

    /**
     * Gets the source.
     * cited ReferenceSource
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ReferenceSource getSource(){
         return this.source;
    }

    /**
     *Sets a value indicating whether isAdaptation.
     * assertion whether the Definition that contains the Citation is an       adaptation       of       the       definition       in       the       cited       ReferenceSource
     * Note: If isAdaptation is false, this Definition is assumed to be a       verbatim       copy       of       the       referenced       definition.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setAdaptation(boolean isAdaptation){
        this.isAdaptation = isAdaptation;
    }

    /**
     * Sets the location.
     * definition of the location in the associated ReferenceSource that is made reference to
     * Example: Typical citation locations are:  "page 34",  "Table 2",  "pages 93-122",  "Appendix B",  "Chapter 3",  "Annex 5".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setLocation(String location){
        this.location = location;
    }

    /**
     * Sets the remark.
     * optional remark to further describe this Citation and where applicable     explain     an     adaptation
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setRemark(String remark){
        this.remark = remark;
    }

    /**
     * Sets the shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setShortName(String shortName){
        this.shortName = shortName;
    }

    /**
     * Sets the source.
     * cited ReferenceSource
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setSource(ReferenceSource source){
        this.source = source;
    }

    /**
     * Creates and returns a copy of this <code>Citation<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Citation<code/>.
     *
     * @see Citation
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        Citation clone = (Citation)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>Citation<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Citation<code/>.
     * 
     * @see Citation
     */
    @Override
    public Citation clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Citation)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>Citation<code/>.
     *
     * @return A list of potential errors.
     *
     * @see Citation
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.shortName.trim().isEmpty()) {
            errorList.add("The property shortName is null or empty.");
        }

        if (this.source == null || this.source.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property source is null.");
            this.source = SentinelThingProvider.getSentinel<ReferenceSource>();
            this.sentinelResetMap["source"] = () -> this.source = null;
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>Citation<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see Citation
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Citation dto = (cdp4common.dto.Citation)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.isAdaptation = dto.getIsAdaptation();
        this.location = dto.getLocation();
        this.modifiedOn = dto.getModifiedOn();
        this.remark = dto.getRemark();
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();
        this.source = this.cache.get<ReferenceSource>(dto.getSource(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<ReferenceSource>();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>Citation<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see Citation
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Citation dto = new cdp4common.dto.Citation(this.iid, this.revisionNumber);

        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsAdaptation(this.isAdaptation);
        dto.setLocation(this.location);
        dto.setModifiedOn(this.modifiedOn);
        dto.setRemark(this.remark);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);
        dto.setSource(this.source != null ? this.source.getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
