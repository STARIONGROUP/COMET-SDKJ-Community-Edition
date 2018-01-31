/* --------------------------------------------------------------------------------------------------------------------
 * AbstractPerson.java
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
 * representation of a physical person that is a potential Participant in a       concurrent       engineering       activity
 * Note 1: Person maps to 'person' as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF       RFC       4519</a>).
 * Note 2: Property <i>shortName</i> is used as a user account name       for       E-TM-10-25       implementations.       It       maps       to       LDAP attribute       'uid',       as       defined       in       LDAP       (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF       RFC       4519</a>).
 */
@Container(clazz = SiteDirectory.class, propertyName = "person")
@ToString
@EqualsAndHashCode
public  class Person extends Thing implements Cloneable, DeprecatableThing, NamedThing, ShortNamedThing {
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
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public Person(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
        this.emailAddress = new ContainerList<EmailAddress>(this);
        this.telephoneNumber = new ContainerList<TelephoneNumber>(this);
        this.userPreference = new ContainerList<UserPreference>(this);
    }

    /**
     * Property defaultDomain.
     * optional reference to the DomainOfExpertise that this Person represents by default
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DomainOfExpertise defaultDomain;

    /**
     * Property defaultEmailAddress.
     * optional reference to the default e-mail address of this Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private EmailAddress defaultEmailAddress;

    /**
     * Property defaultTelephoneNumber.
     * optional reference to the default telephone number of this Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private TelephoneNumber defaultTelephoneNumber;

    /**
     * List of contained EmailAddress.
     * e-mail address(es) of this Person
     * Note: Each e-mail address shall comply with the SMTP protocol as specified in <a href="http://datatracker.ietf.org/doc/rfc5321/">IETF RFC 5321</a>, i.e. "user-name@domain" or "Full Name <user-name@domain>".
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<EmailAddress> emailAddress;

    /**
     * Property givenName.
     * given name of this Person
     * Note: Property <i>givenName</i> maps to 'givenName', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String givenName;

    /**
     * Value indicating whether isActive.
     * assertion whether this Person is still an active member in at least one       concurrent       engineering       team
     * Note: Set to <i>false</i> implies that this Person does no longer       have       access       to       the       E-TM-10-25       environment       and       data       that       is       controlled       via       the       SiteDirectory       containing       the       Person.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isActive;

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
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
    private Organization organization;

    /**
     * Property organizationalUnit.
     * optional organizational unit that this Person belongs to
     * Note: Property <i>organizationalUnit</i> maps to 'ou' or 'organizationalUnit', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String organizationalUnit;

    /**
     * Property password.
     * optional definition of the password for this Person for use with user authentication handling by an implementation of this data model
     * Note: A server implementation may provide several modes of authentication: e.g. based on local / self-contained or LDAP or other network accessible authentication services. The local / self-contained mode would use this password property. The mode using LDAP or other network accessible services would neglect this password property and use the passwords from the network service.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String password;

    /**
     * Property role.
     * reference to the PersonRole assigned to this Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private PersonRole role;

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
     * Property surname.
     * surname of this Person
     * Note: Property <i>surname</i> maps to 'sn' or 'surname', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String surname;

    /**
     * List of contained TelephoneNumber.
     * telephone number(s) of this Person
     * Note 1: The telephone numbers shall be written in the following form:  "+cc-ac-localnumber", where cc is the country code and ac is the area code.
     * Note 2: Property <i>telephoneNumber</i> maps to 'telephoneNumber', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<TelephoneNumber> telephoneNumber;

    /**
     * List of contained UserPreference.
     * set of user-defined preferences of this Person
     * Note: UserPreferences provide a flexible and extensible way to define preferences in the form of key-value pairs that a Person can store on an E-TM-10-25 compatible server in order to configure one or more client applications for his or her use.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<UserPreference> userPreference;

    /**
     * {@link Iterable<Iterable>} that references the composite properties of the current {@link Person}.
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets the defaultDomain.
     * optional reference to the DomainOfExpertise that this Person represents by default
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public DomainOfExpertise getDefaultDomain(){
         return this.defaultDomain;
    }

    /**
     * Gets the defaultEmailAddress.
     * optional reference to the default e-mail address of this Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public EmailAddress getDefaultEmailAddress(){
         return this.defaultEmailAddress;
    }

    /**
     * Gets the defaultTelephoneNumber.
     * optional reference to the default telephone number of this Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public TelephoneNumber getDefaultTelephoneNumber(){
         return this.defaultTelephoneNumber;
    }

    /**
     * Gets a list of contained EmailAddress.
     * e-mail address(es) of this Person
     * Note: Each e-mail address shall comply with the SMTP protocol as specified in <a href="http://datatracker.ietf.org/doc/rfc5321/">IETF RFC 5321</a>, i.e. "user-name@domain" or "Full Name <user-name@domain>".
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<EmailAddress> getEmailAddress(){
         return this.emailAddress;
    }

    /**
     * Gets the givenName.
     * given name of this Person
     * Note: Property <i>givenName</i> maps to 'givenName', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getGivenName(){
         return this.givenName;
    }

    /**
     * Gets a value indicating whether isActive.
     * assertion whether this Person is still an active member in at least one       concurrent       engineering       team
     * Note: Set to <i>false</i> implies that this Person does no longer       have       access       to       the       E-TM-10-25       environment       and       data       that       is       controlled       via       the       SiteDirectory       containing       the       Person.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getActive(){
         return this.isActive;
    }

    /**
     * Gets a value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getDeprecated(){
         return this.isDeprecated;
    }

    /**
     * Gets the name.
     * derived full name of this Person
     * Note: This property maps to 'cn' or 'commonName', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF       RFC       4519</a>),       and       consists       of       the       concatenation       of       <i>givenName</i>,       a       space       and       <i>surname</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public String getName(){
        return this.GetDerivedName();
    }

    /**
     * Gets the organization.
     * optional reference to the Organization that this Person works for
     * Note: Property <i>organization</i> maps to 'o' or 'organization', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Organization getOrganization(){
         return this.organization;
    }

    /**
     * Gets the organizationalUnit.
     * optional organizational unit that this Person belongs to
     * Note: Property <i>organizationalUnit</i> maps to 'ou' or 'organizationalUnit', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getOrganizationalUnit(){
         return this.organizationalUnit;
    }

    /**
     * Gets the password.
     * optional definition of the password for this Person for use with user authentication handling by an implementation of this data model
     * Note: A server implementation may provide several modes of authentication: e.g. based on local / self-contained or LDAP or other network accessible authentication services. The local / self-contained mode would use this password property. The mode using LDAP or other network accessible services would neglect this password property and use the passwords from the network service.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getPassword(){
         return this.password;
    }

    /**
     * Gets the role.
     * reference to the PersonRole assigned to this Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public PersonRole getRole(){
         return this.role;
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
     * Gets the surname.
     * surname of this Person
     * Note: Property <i>surname</i> maps to 'sn' or 'surname', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getSurname(){
         return this.surname;
    }

    /**
     * Gets a list of contained TelephoneNumber.
     * telephone number(s) of this Person
     * Note 1: The telephone numbers shall be written in the following form:  "+cc-ac-localnumber", where cc is the country code and ac is the area code.
     * Note 2: Property <i>telephoneNumber</i> maps to 'telephoneNumber', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<TelephoneNumber> getTelephoneNumber(){
         return this.telephoneNumber;
    }

    /**
     * Gets a list of contained UserPreference.
     * set of user-defined preferences of this Person
     * Note: UserPreferences provide a flexible and extensible way to define preferences in the form of key-value pairs that a Person can store on an E-TM-10-25 compatible server in order to configure one or more client applications for his or her use.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<UserPreference> getUserPreference(){
         return this.userPreference;
    }

    /**
     * Sets the defaultDomain.
     * optional reference to the DomainOfExpertise that this Person represents by default
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDefaultDomain(DomainOfExpertise defaultDomain){
        this.defaultDomain = defaultDomain;
    }

    /**
     * Sets the defaultEmailAddress.
     * optional reference to the default e-mail address of this Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDefaultEmailAddress(EmailAddress defaultEmailAddress){
        this.defaultEmailAddress = defaultEmailAddress;
    }

    /**
     * Sets the defaultTelephoneNumber.
     * optional reference to the default telephone number of this Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDefaultTelephoneNumber(TelephoneNumber defaultTelephoneNumber){
        this.defaultTelephoneNumber = defaultTelephoneNumber;
    }

    /**
     * Sets a list of contained EmailAddress.
     * e-mail address(es) of this Person
     * Note: Each e-mail address shall comply with the SMTP protocol as specified in <a href="http://datatracker.ietf.org/doc/rfc5321/">IETF RFC 5321</a>, i.e. "user-name@domain" or "Full Name <user-name@domain>".
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setEmailAddress(ContainerList<EmailAddress> emailAddress){
        this.emailAddress = emailAddress;
    }

    /**
     * Sets the givenName.
     * given name of this Person
     * Note: Property <i>givenName</i> maps to 'givenName', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setGivenName(String givenName){
        this.givenName = givenName;
    }

    /**
     *Sets a value indicating whether isActive.
     * assertion whether this Person is still an active member in at least one       concurrent       engineering       team
     * Note: Set to <i>false</i> implies that this Person does no longer       have       access       to       the       E-TM-10-25       environment       and       data       that       is       controlled       via       the       SiteDirectory       containing       the       Person.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setActive(boolean isActive){
        this.isActive = isActive;
    }

    /**
     *Sets a value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDeprecated(boolean isDeprecated){
        this.isDeprecated = isDeprecated;
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
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setName(String name){
        throw new IllegalStateException("Forbidden Set value for the derived property Person.name");
    }

    /**
     * Sets the organization.
     * optional reference to the Organization that this Person works for
     * Note: Property <i>organization</i> maps to 'o' or 'organization', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setOrganization(Organization organization){
        this.organization = organization;
    }

    /**
     * Sets the organizationalUnit.
     * optional organizational unit that this Person belongs to
     * Note: Property <i>organizationalUnit</i> maps to 'ou' or 'organizationalUnit', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setOrganizationalUnit(String organizationalUnit){
        this.organizationalUnit = organizationalUnit;
    }

    /**
     * Sets the password.
     * optional definition of the password for this Person for use with user authentication handling by an implementation of this data model
     * Note: A server implementation may provide several modes of authentication: e.g. based on local / self-contained or LDAP or other network accessible authentication services. The local / self-contained mode would use this password property. The mode using LDAP or other network accessible services would neglect this password property and use the passwords from the network service.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setPassword(String password){
        this.password = password;
    }

    /**
     * Sets the role.
     * reference to the PersonRole assigned to this Person
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setRole(PersonRole role){
        this.role = role;
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
     * Sets the surname.
     * surname of this Person
     * Note: Property <i>surname</i> maps to 'sn' or 'surname', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setSurname(String surname){
        this.surname = surname;
    }

    /**
     * Sets a list of contained TelephoneNumber.
     * telephone number(s) of this Person
     * Note 1: The telephone numbers shall be written in the following form:  "+cc-ac-localnumber", where cc is the country code and ac is the area code.
     * Note 2: Property <i>telephoneNumber</i> maps to 'telephoneNumber', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setTelephoneNumber(ContainerList<TelephoneNumber> telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }

    /**
     * Sets a list of contained UserPreference.
     * set of user-defined preferences of this Person
     * Note: UserPreferences provide a flexible and extensible way to define preferences in the form of key-value pairs that a Person can store on an E-TM-10-25 compatible server in order to configure one or more client applications for his or her use.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setUserPreference(ContainerList<UserPreference> userPreference){
        this.userPreference = userPreference;
    }

    /**
     * Gets an {@link List<List<Thing>>} that references the composite properties of the current {@link Person}.
     */
    @Override
    public List<List<Thing>> getContainerLists() {
        List<List<Thing>> containers = new ArrayList<List<Thing>>(super.getContainerLists());
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

        clone.setEmailAddress(cloneContainedThings ? new ContainerList<EmailAddress>(clone) : new ContainerList<EmailAddress>(this.getEmailAddress(), clone));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setTelephoneNumber(cloneContainedThings ? new ContainerList<TelephoneNumber>(clone) : new ContainerList<TelephoneNumber>(this.getTelephoneNumber(), clone));
        clone.setUserPreference(cloneContainedThings ? new ContainerList<UserPreference>(clone) : new ContainerList<UserPreference>(this.getUserPreference(), clone));

        if (cloneContainedThings) {
            clone.getEmailAddress().addAll(this.getEmailAddress().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getTelephoneNumber().addAll(this.getTelephoneNumber().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getUserPreference().addAll(this.getUserPreference().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
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
     * Validates the cardinalities of the properties of this <clone>Person}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getGivenName().trim().isEmpty()) {
            errorList.add("The property givenName is null or empty.");
        }

        if (this.getShortName().trim().isEmpty()) {
            errorList.add("The property shortName is null or empty.");
        }

        if (this.getSurname().trim().isEmpty()) {
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

        this.setDefaultDomain((dto.getDefaultDomain() != null) ? this.getCache().get<DomainOfExpertise>(dto.getDefaultDomain.getValue(), dto.getIterationContainerId()) : null);
        this.setDefaultEmailAddress((dto.getDefaultEmailAddress() != null) ? this.getCache().get<EmailAddress>(dto.getDefaultEmailAddress.getValue(), dto.getIterationContainerId()) : null);
        this.setDefaultTelephoneNumber((dto.getDefaultTelephoneNumber() != null) ? this.getCache().get<TelephoneNumber>(dto.getDefaultTelephoneNumber.getValue(), dto.getIterationContainerId()) : null);
        this.getEmailAddress().resolveList(dto.getEmailAddress(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setGivenName(dto.getGivenName());
        this.setActive(dto.getActive());
        this.setDeprecated(dto.getDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setOrganization((dto.getOrganization() != null) ? this.getCache().get<Organization>(dto.getOrganization.getValue(), dto.getIterationContainerId()) : null);
        this.setOrganizationalUnit(dto.getOrganizationalUnit());
        this.setPassword(dto.getPassword());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setRole((dto.getRole() != null) ? this.getCache().get<PersonRole>(dto.getRole.getValue(), dto.getIterationContainerId()) : null);
        this.setShortName(dto.getShortName());
        this.setSurname(dto.getSurname());
        this.getTelephoneNumber().resolveList(dto.getTelephoneNumber(), dto.getIterationContainerId(), this.getCache());
        this.getUserPreference().resolveList(dto.getUserPreference(), dto.getIterationContainerId(), this.getCache());

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
        dto.getEmailAddress().add(this.getEmailAddress().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setGivenName(this.getGivenName());
        dto.setActive(this.getActive());
        dto.setDeprecated(this.getDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setOrganization(this.getOrganization() != null ? (UUID)this.getOrganization().getIid() : null);
        dto.setOrganizationalUnit(this.getOrganizationalUnit());
        dto.setPassword(this.getPassword());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setRole(this.getRole() != null ? (UUID)this.getRole().getIid() : null);
        dto.setShortName(this.getShortName());
        dto.setSurname(this.getSurname());
        dto.getTelephoneNumber().add(this.getTelephoneNumber().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getUserPreference().add(this.getUserPreference().stream().map(x -> x.getIid()).collect(Collectors.toList()));

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
