/* --------------------------------------------------------------------------------------------------------------------
 * AbstractTelephoneNumber.java
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
 * representation of a telephone number
 */
@Container(clazz = Person.class, propertyName = "telephoneNumber")
public abstract class AbstractTelephoneNumber extends AbstractThing  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Initializes a new instance of the <code>TelephoneNumber<code/> class.
     *
     * @see TelephoneNumber
     */
    public AbstractTelephoneNumber() {
        this.vcardType = new List<VcardTelephoneNumberKind>();
    }

    /**
     * Initializes a new instance of the <code>TelephoneNumber<code/> class.
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
     * @see TelephoneNumber
     */
    public AbstractTelephoneNumber(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.vcardType = new List<VcardTelephoneNumberKind>();
    }

    /**
     * Property value.
     * representation of the actual telephone number of this TelephoneNumber
     * Note: The value should follow the URI specification for international telephone numbers as defined in <a href="http://datatracker.ietf.org/doc/rfc3966/?include_text=1">IETF RFC 3966</a>. Hyphens may be used to improve human readability.
     * Example: <i>vcardType</i> = VcardTelephoneNumberKind.WORK, <i>value</i> = "+31-71-5656565".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String value;

    /**
     * List of VcardTelephoneNumberKind.
     * representation of the applicable vCard TYPE values
     * Note: Zero or more vCard TYPE values can be associated to a single telephone number. See VcardTelephoneNumberKind for details.
     * Example: VcardTelephoneNumberKind.WORK, VcardTelephoneNumberKind.VOICE, VcardTelephoneNumberKind.TEXT, VcardTelephoneNumberKind.CELL .
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<VcardTelephoneNumberKind> vcardType;

    /**
     * Gets the value.
     * representation of the actual telephone number of this TelephoneNumber
     * Note: The value should follow the URI specification for international telephone numbers as defined in <a href="http://datatracker.ietf.org/doc/rfc3966/?include_text=1">IETF RFC 3966</a>. Hyphens may be used to improve human readability.
     * Example: <i>vcardType</i> = VcardTelephoneNumberKind.WORK, <i>value</i> = "+31-71-5656565".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getValue(){
         return this.value;
    }

    /**
     * Gets a list of VcardTelephoneNumberKind.
     * representation of the applicable vCard TYPE values
     * Note: Zero or more vCard TYPE values can be associated to a single telephone number. See VcardTelephoneNumberKind for details.
     * Example: VcardTelephoneNumberKind.WORK, VcardTelephoneNumberKind.VOICE, VcardTelephoneNumberKind.TEXT, VcardTelephoneNumberKind.CELL .
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public List<VcardTelephoneNumberKind> getVcardType(){
         return this.vcardType;
    }

    /**
     * Sets the value.
     * representation of the actual telephone number of this TelephoneNumber
     * Note: The value should follow the URI specification for international telephone numbers as defined in <a href="http://datatracker.ietf.org/doc/rfc3966/?include_text=1">IETF RFC 3966</a>. Hyphens may be used to improve human readability.
     * Example: <i>vcardType</i> = VcardTelephoneNumberKind.WORK, <i>value</i> = "+31-71-5656565".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setValue(String value){
        this.value = value;
    }

    /**
     * Sets a list of VcardTelephoneNumberKind.
     * representation of the applicable vCard TYPE values
     * Note: Zero or more vCard TYPE values can be associated to a single telephone number. See VcardTelephoneNumberKind for details.
     * Example: VcardTelephoneNumberKind.WORK, VcardTelephoneNumberKind.VOICE, VcardTelephoneNumberKind.TEXT, VcardTelephoneNumberKind.CELL .
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setVcardType(List<VcardTelephoneNumberKind> vcardType){
        this.vcardType = vcardType;
    }

    /**
     * Creates and returns a copy of this <code>TelephoneNumber<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>TelephoneNumber<code/>.
     *
     * @see TelephoneNumber
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        TelephoneNumber clone = (TelephoneNumber)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setVcardType(new List<VcardTelephoneNumberKind>(this.vcardType));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>TelephoneNumber<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>TelephoneNumber<code/>.
     * 
     * @see TelephoneNumber
     */
    @Override
    public TelephoneNumber clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (TelephoneNumber)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>TelephoneNumber<code/>.
     *
     * @return A list of potential errors.
     *
     * @see TelephoneNumber
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.value.trim().isEmpty()) {
            errorList.add("The property value is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>TelephoneNumber<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see TelephoneNumber
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.TelephoneNumber dto = (cdp4common.dto.TelephoneNumber)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.modifiedOn = dto.getModifiedOn();
        this.revisionNumber = dto.getRevisionNumber();
        this.value = dto.getValue();
        this.vcardType.clearAndAddRange(dto.getVcardType());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>TelephoneNumber<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see TelephoneNumber
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.TelephoneNumber dto = new cdp4common.dto.TelephoneNumber(this.iid, this.revisionNumber);

        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setModifiedOn(this.modifiedOn);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setValue(this.value);
        dto.getVcardType().add(this.vcardType);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
