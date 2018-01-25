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

/**
 * representation of a physical person that is a potential Participant in a       concurrent       engineering       activity
 * Note 1: Person maps to 'person' as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF       RFC       4519</a>).
 * Note 2: Property <i>shortName</i> is used as a user account name       for       E-TM-10-25       implementations.       It       maps       to       LDAP attribute       'uid',       as       defined       in       LDAP       (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF       RFC       4519</a>).
 */
@Container(clazz = SiteDirectory.class, propertyName = "person")
public abstract class AbstractPerson extends AbstractThing implements DeprecatableThing, NamedThing, ShortNamedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_N_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Initializes a new instance of the <code>Person<code/> class.
     *
     * @see Person
     */
    public AbstractPerson() {
        this.emailAddress = new ContainerList<EmailAddress>(this);
        this.telephoneNumber = new ContainerList<TelephoneNumber>(this);
        this.userPreference = new ContainerList<UserPreference>(this);
    }

    /**
     * Initializes a new instance of the <code>Person<code/> class.
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
     * @see Person
     */
    public AbstractPerson(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
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
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>Person<code/>.
     *
     * @see Iterable
     * @see Person
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
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>Person<code/>.
     *
     * @see Iterable
     * @see Person
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.emailAddress);
        containers.Add(this.telephoneNumber);
        containers.Add(this.userPreference);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>Person<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Person<code/>.
     *
     * @see Person
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        Person clone = (Person)this.clone();
        clone.setEmailAddress(cloneContainedThings ? new ContainerList<EmailAddress>(clone) : new ContainerList<EmailAddress>(this.emailAddress, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setTelephoneNumber(cloneContainedThings ? new ContainerList<TelephoneNumber>(clone) : new ContainerList<TelephoneNumber>(this.telephoneNumber, clone));
        clone.setUserPreference(cloneContainedThings ? new ContainerList<UserPreference>(clone) : new ContainerList<UserPreference>(this.userPreference, clone));

        if (cloneContainedThings) {
            clone.getEmailAddress().addAll(this.emailAddress.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getTelephoneNumber().addAll(this.telephoneNumber.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getUserPreference().addAll(this.userPreference.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>Person<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Person<code/>.
     * 
     * @see Person
     */
    @Override
    public Person clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Person)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>Person<code/>.
     *
     * @return A list of potential errors.
     *
     * @see Person
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.givenName.trim().isEmpty()) {
            errorList.add("The property givenName is null or empty.");
        }

        if (this.shortName.trim().isEmpty()) {
            errorList.add("The property shortName is null or empty.");
        }

        if (this.surname.trim().isEmpty()) {
            errorList.add("The property surname is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>Person<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see Person
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Person dto = (cdp4common.dto.Person)dtoThing;

        this.defaultDomain = (dto.getDefaultDomain() != null) ? this.cache.get<DomainOfExpertise>(dto.getDefaultDomain.getValue(), dto.getIterationContainerId()) : null;
        this.defaultEmailAddress = (dto.getDefaultEmailAddress() != null) ? this.cache.get<EmailAddress>(dto.getDefaultEmailAddress.getValue(), dto.getIterationContainerId()) : null;
        this.defaultTelephoneNumber = (dto.getDefaultTelephoneNumber() != null) ? this.cache.get<TelephoneNumber>(dto.getDefaultTelephoneNumber.getValue(), dto.getIterationContainerId()) : null;
        this.emailAddress.resolveList(dto.getEmailAddress(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.givenName = dto.getGivenName();
        this.isActive = dto.getIsActive();
        this.isDeprecated = dto.getIsDeprecated();
        this.modifiedOn = dto.getModifiedOn();
        this.organization = (dto.getOrganization() != null) ? this.cache.get<Organization>(dto.getOrganization.getValue(), dto.getIterationContainerId()) : null;
        this.organizationalUnit = dto.getOrganizationalUnit();
        this.password = dto.getPassword();
        this.revisionNumber = dto.getRevisionNumber();
        this.role = (dto.getRole() != null) ? this.cache.get<PersonRole>(dto.getRole.getValue(), dto.getIterationContainerId()) : null;
        this.shortName = dto.getShortName();
        this.surname = dto.getSurname();
        this.telephoneNumber.resolveList(dto.getTelephoneNumber(), dto.getIterationContainerId(), this.cache);
        this.userPreference.resolveList(dto.getUserPreference(), dto.getIterationContainerId(), this.cache);

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>Person<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see Person
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Person dto = new cdp4common.dto.Person(this.iid, this.revisionNumber);

        dto.setDefaultDomain(this.defaultDomain != null ? (UUID)this.defaultDomain.getIid() : null);
        dto.setDefaultEmailAddress(this.defaultEmailAddress != null ? (UUID)this.defaultEmailAddress.getIid() : null);
        dto.setDefaultTelephoneNumber(this.defaultTelephoneNumber != null ? (UUID)this.defaultTelephoneNumber.getIid() : null);
        dto.getEmailAddress().add(this.emailAddress.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setGivenName(this.givenName);
        dto.setIsActive(this.isActive);
        dto.setIsDeprecated(this.isDeprecated);
        dto.setModifiedOn(this.modifiedOn);
        dto.setOrganization(this.organization != null ? (UUID)this.organization.getIid() : null);
        dto.setOrganizationalUnit(this.organizationalUnit);
        dto.setPassword(this.password);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setRole(this.role != null ? (UUID)this.role.getIid() : null);
        dto.setShortName(this.shortName);
        dto.setSurname(this.surname);
        dto.getTelephoneNumber().add(this.telephoneNumber.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getUserPreference().add(this.userPreference.stream().map(x -> x.Iid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
