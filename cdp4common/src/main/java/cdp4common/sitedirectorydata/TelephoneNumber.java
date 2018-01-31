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
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of a telephone number
 */
@Container(clazz = Person.class, propertyName = "telephoneNumber")
@ToString
@EqualsAndHashCode
public  class TelephoneNumber extends Thing  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the {@link TelephoneNumber} class.
     */
    public TelephoneNumber() {
        this.vcardType = new ArrayList<VcardTelephoneNumberKind>();
    }

    /**
     * Initializes a new instance of the {@link TelephoneNumber} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public TelephoneNumber(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.vcardType = new ArrayList<VcardTelephoneNumberKind>();
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
    private ArrayList<VcardTelephoneNumberKind> vcardType;

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
    public ArrayList<VcardTelephoneNumberKind> getVcardType(){
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
     public void setVcardType(ArrayList<VcardTelephoneNumberKind> vcardType){
        this.vcardType = vcardType;
    }

    /**
     * Creates and returns a copy of this {@link TelephoneNumber} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link TelephoneNumber}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        TelephoneNumber clone = (TelephoneNumber)this.clone();
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setVcardType(new ArrayList<VcardTelephoneNumberKind>(this.getVcardType()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link TelephoneNumber} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link TelephoneNumber}.
     */
    @Override
    public TelephoneNumber clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (TelephoneNumber)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>TelephoneNumber}.
     *
     * @return A list of potential errors.
     */
    protected Iterable<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getValue().trim().isEmpty()) {
            errorList.add("The property value is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link TelephoneNumber} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.TelephoneNumber dto = (cdp4common.dto.TelephoneNumber)dtoThing;

        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setValue(dto.getValue());
        this.getVcardType().clearAndAddRange(dto.getVcardType());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link TelephoneNumber}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.TelephoneNumber dto = new cdp4common.dto.TelephoneNumber(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setValue(this.getValue());
        dto.getVcardType().add(this.getVcardType());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
