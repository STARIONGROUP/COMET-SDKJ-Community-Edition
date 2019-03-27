/* --------------------------------------------------------------------------------------------------------------------
 * Person.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.exceptions.ContainmentException;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import org.apache.commons.lang3.ObjectUtils;
import com.google.common.base.Strings;
import com.google.common.cache.Cache;
import com.google.common.collect.Iterables;
import lombok.*;

/**
 * representation of a physical person that is a potential Participant in a       concurrent       engineering       activity
 * Note 1: Person maps to 'person' as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF       RFC       4519</a>).
 * Note 2: Property <i>shortName</i> is used as a user account name       for       E-TM-10-25       implementations.       It       maps       to       LDAP attribute       'uid',       as       defined       in       LDAP       (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF       RFC       4519</a>).
 */
@Container(clazz = SiteDirectory.class, propertyName = "person")
@ToString
@EqualsAndHashCode(callSuper = true)
public class Person extends Thing implements Cloneable, DeprecatableThing, NamedThing, ShortNamedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NONE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the {@link Person} class.
     */
    public Person() {
        this.emailAddress = new ContainerList<EmailAddress>(this);
        this.telephoneNumber = new ContainerList<TelephoneNumber>(this);
        this.userPreference = new ContainerList<UserPreference>(this);
    }

    /**
     * Initializes a new instance of the {@link Person} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link CacheKey} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public Person(UUID iid, Cache<CacheKey, Thing> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
        this.emailAddress = new ContainerList<EmailAddress>(this);
        this.telephoneNumber = new ContainerList<TelephoneNumber>(this);
        this.userPreference = new ContainerList<UserPreference>(this);
    }

    /**
     * Property defaultDomain.
     * optional reference to the DomainOfExpertise that this Person represents by default
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private DomainOfExpertise defaultDomain;

    /**
     * Property defaultEmailAddress.
     * optional reference to the default e-mail address of this Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private EmailAddress defaultEmailAddress;

    /**
     * Property defaultTelephoneNumber.
     * optional reference to the default telephone number of this Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private TelephoneNumber defaultTelephoneNumber;

    /**
     * List of contained EmailAddress.
     * e-mail address(es) of this Person
     * Note: Each e-mail address shall comply with the SMTP protocol as specified in <a href="http://datatracker.ietf.org/doc/rfc5321/">IETF RFC 5321</a>, i.e. "user-name@domain" or "Full Name <user-name@domain>".
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<EmailAddress> emailAddress;

    /**
     * Property givenName.
     * given name of this Person
     * Note: Property <i>givenName</i> maps to 'givenName', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String givenName;

    /**
     * Value indicating whether isActive.
     * assertion whether this Person is still an active member in at least one       concurrent       engineering       team
     * Note: Set to <i>false</i> implies that this Person does no longer       have       access       to       the       E-TM-10-25       environment       and       data       that       is       controlled       via       the       SiteDirectory       containing       the       Person.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean isActive;

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private boolean isDeprecated;

    /**
     * Property name.
     * derived full name of this Person
     * Note: This property maps to 'cn' or 'commonName', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF       RFC       4519</a>),       and       consists       of       the       concatenation       of       <i>givenName</i>,       a       space       and       <i>surname</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String name;

    /**
     * Property organization.
     * optional reference to the Organization that this Person works for
     * Note: Property <i>organization</i> maps to 'o' or 'organization', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private Organization organization;

    /**
     * Property organizationalUnit.
     * optional organizational unit that this Person belongs to
     * Note: Property <i>organizationalUnit</i> maps to 'ou' or 'organizationalUnit', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String organizationalUnit;

    /**
     * Property password.
     * optional definition of the password for this Person for use with user authentication handling by an implementation of this data model
     * Note: A server implementation may provide several modes of authentication: e.g. based on local / self-contained or LDAP or other network accessible authentication services. The local / self-contained mode would use this password property. The mode using LDAP or other network accessible services would neglect this password property and use the passwords from the network service.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String password;

    /**
     * Property role.
     * reference to the PersonRole assigned to this Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private PersonRole role;

    /**
     * Property shortName.
     * Note 1: The implied LanguageCode of <i>shortName</i> is "en-GB".
     * Note 2: The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
     * Note 3: A <i>shortName</i> may be an acronym or an abbreviated term.
     * Note 4: A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String shortName;

    /**
     * Property surname.
     * surname of this Person
     * Note: Property <i>surname</i> maps to 'sn' or 'surname', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private String surname;

    /**
     * List of contained TelephoneNumber.
     * telephone number(s) of this Person
     * Note 1: The telephone numbers shall be written in the following form:  "+cc-ac-localnumber", where cc is the country code and ac is the area code.
     * Note 2: Property <i>telephoneNumber</i> maps to 'telephoneNumber', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<TelephoneNumber> telephoneNumber;

    /**
     * List of contained UserPreference.
     * set of user-defined preferences of this Person
     * Note: UserPreferences provide a flexible and extensible way to define preferences in the form of key-value pairs that a Person can store on an E-TM-10-25 compatible server in order to configure one or more client applications for his or her use.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @Getter
    @Setter
    private ContainerList<UserPreference> userPreference;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link Person}.
     */
    private Iterable<Iterable> containerLists;

    /**
     * Gets the name.
     * derived full name of this Person
     * Note: This property maps to 'cn' or 'commonName', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF       RFC       4519</a>),       and       consists       of       the       concatenation       of       <i>givenName</i>,       a       space       and       <i>surname</i>.
     */
    public String getName(){
        return this.getDerivedName();
    }

    /**
     * Sets the name.
     * derived full name of this Person
     * Note: This property maps to 'cn' or 'commonName', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF       RFC       4519</a>),       and       consists       of       the       concatenation       of       <i>givenName</i>,       a       space       and       <i>surname</i>.
     *
     * @throws IllegalStateException The name property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    public void setName(String name){
        throw new IllegalStateException("Forbidden Set value for the derived property Person.name");
    }

    /**
     * Gets an {@link Collection<Collection>} that references the composite properties of the current {@link Person}.
     */
    @Override
    public Collection<Collection> getContainerLists() {
        Collection<Collection> containers = new ArrayList<Collection>(super.getContainerLists());
        containers.add(this.emailAddress);
        containers.add(this.telephoneNumber);
        containers.add(this.userPreference);
        return containers;
    }

    /**
     * Creates and returns a copy of this {@link Person} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Person}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        Person clone;
        try {
            clone = (Person)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow Person cannot be cloned.");
        }

        clone.setEmailAddress(cloneContainedThings ? new ContainerList<EmailAddress>(clone) : new ContainerList<EmailAddress>(this.getEmailAddress(), clone, false));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setTelephoneNumber(cloneContainedThings ? new ContainerList<TelephoneNumber>(clone) : new ContainerList<TelephoneNumber>(this.getTelephoneNumber(), clone, false));
        clone.setUserPreference(cloneContainedThings ? new ContainerList<UserPreference>(clone) : new ContainerList<UserPreference>(this.getUserPreference(), clone, false));

        if (cloneContainedThings) {
            clone.getEmailAddress().addAll(this.getEmailAddress().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getTelephoneNumber().addAll(this.getTelephoneNumber().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
            clone.getUserPreference().addAll(this.getUserPreference().stream().map(x -> x.clone(true)).collect(Collectors.toList()));
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link Person} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link Person}.
     */
    @Override
    public Person clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Person)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this Person}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (Strings.isNullOrEmpty(this.getGivenName())) {
            errorList.add("The property givenName is null or empty.");
        }

        if (Strings.isNullOrEmpty(this.getShortName())) {
            errorList.add("The property shortName is null or empty.");
        }

        if (Strings.isNullOrEmpty(this.getSurname())) {
            errorList.add("The property surname is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link Person} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Person dto = (cdp4common.dto.Person)dtoThing;

        this.setDefaultDomain((dto.getDefaultDomain() != null) ? PojoThingFactory.get(this.getCache(), dto.getDefaultDomain(), dto.getIterationContainerId(), DomainOfExpertise.class) : null);
        this.setDefaultEmailAddress((dto.getDefaultEmailAddress() != null) ? PojoThingFactory.get(this.getCache(), dto.getDefaultEmailAddress(), dto.getIterationContainerId(), EmailAddress.class) : null);
        this.setDefaultTelephoneNumber((dto.getDefaultTelephoneNumber() != null) ? PojoThingFactory.get(this.getCache(), dto.getDefaultTelephoneNumber(), dto.getIterationContainerId(), TelephoneNumber.class) : null);
        PojoThingFactory.resolveList(this.getEmailAddress(), dto.getEmailAddress(), dto.getIterationContainerId(), this.getCache(), EmailAddress.class);
        PojoThingFactory.resolveList(this.getExcludedDomain(), dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache(), DomainOfExpertise.class);
        PojoThingFactory.resolveList(this.getExcludedPerson(), dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache(), Person.class);
        this.setGivenName(dto.getGivenName());
        this.setActive(dto.isActive());
        this.setDeprecated(dto.isDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setOrganization((dto.getOrganization() != null) ? PojoThingFactory.get(this.getCache(), dto.getOrganization(), dto.getIterationContainerId(), Organization.class) : null);
        this.setOrganizationalUnit(dto.getOrganizationalUnit());
        this.setPassword(dto.getPassword());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setRole((dto.getRole() != null) ? PojoThingFactory.get(this.getCache(), dto.getRole(), dto.getIterationContainerId(), PersonRole.class) : null);
        this.setShortName(dto.getShortName());
        this.setSurname(dto.getSurname());
        PojoThingFactory.resolveList(this.getTelephoneNumber(), dto.getTelephoneNumber(), dto.getIterationContainerId(), this.getCache(), TelephoneNumber.class);
        PojoThingFactory.resolveList(this.getUserPreference(), dto.getUserPreference(), dto.getIterationContainerId(), this.getCache(), UserPreference.class);

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link Person}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Person dto = new cdp4common.dto.Person(this.getIid(), this.getRevisionNumber());

        dto.setDefaultDomain(this.getDefaultDomain() != null ? (UUID)this.getDefaultDomain().getIid() : null);
        dto.setDefaultEmailAddress(this.getDefaultEmailAddress() != null ? (UUID)this.getDefaultEmailAddress().getIid() : null);
        dto.setDefaultTelephoneNumber(this.getDefaultTelephoneNumber() != null ? (UUID)this.getDefaultTelephoneNumber().getIid() : null);
        dto.getEmailAddress().addAll(this.getEmailAddress().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedDomain().addAll(this.getExcludedDomain().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getExcludedPerson().addAll(this.getExcludedPerson().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.setGivenName(this.getGivenName());
        dto.setActive(this.isActive());
        dto.setDeprecated(this.isDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setOrganization(this.getOrganization() != null ? (UUID)this.getOrganization().getIid() : null);
        dto.setOrganizationalUnit(this.getOrganizationalUnit());
        dto.setPassword(this.getPassword());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setRole(this.getRole() != null ? (UUID)this.getRole().getIid() : null);
        dto.setShortName(this.getShortName());
        dto.setSurname(this.getSurname());
        dto.getTelephoneNumber().addAll(this.getTelephoneNumber().stream().map(Thing::getIid).collect(Collectors.toList()));
        dto.getUserPreference().addAll(this.getUserPreference().stream().map(Thing::getIid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheKey().getIteration());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }

    // HAND-WRITTEN CODE GOES BELOW.
    // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.

    /**
     * Returns the {@link #name} value
     *
     * @return he {@link #name} value
     */
    private String getDerivedName() {
        return String.format("%s %s", this.getGivenName(), this.getSurname());
    }
}
