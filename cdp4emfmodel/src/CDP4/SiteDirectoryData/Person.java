/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DeprecatableThing;
import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;
import CDP4.CommonData.Thing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <html>
 *   <head>
 * 		<style>
 * 			p {padding:0px; margin:0px;}
 * 		</style>
 * 	</head>
 * 
 *   <body>
 *     <p>
 *       representation of a physical person that is a potential Participant in a       concurrent       engineering       activity
 *     </p>
 * 
 *     <p>
 *       Note 1: Person maps to 'person' as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF       RFC       4519</a>).
 *     </p>
 * 
 *     <p>
 *       Note 2:&#160;Property <i>shortName</i> is used as a user account name       for       E-TM-10-25       implementations.       It       maps       to       LDAP&#160;attribute       'uid',       as       defined       in       LDAP       (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF       RFC       4519</a>).
 * 
 *     </p>
 * 
 *   </body>
 * 
 * </html>
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.Person#getOrganization <em>Organization</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Person#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Person#getSurname <em>Surname</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Person#getOrganizationalUnit <em>Organizational Unit</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Person#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Person#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Person#getDefaultDomain <em>Default Domain</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Person#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Person#getRole <em>Role</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Person#getPassword <em>Password</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Person#getSalt <em>Salt</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Person#getDefaultEmailAddress <em>Default Email Address</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Person#getDefaultTelephoneNumber <em>Default Telephone Number</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Person#getUserPreference <em>User Preference</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends Thing, DeprecatableThing, NamedThing, ShortNamedThing {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 *     <p>
	 * optional reference to the Organization that this Person works for
	 *     </p>
	 * 
	 *     <p>
	 * Note: Property <i>organization</i> maps to 'o' or 'organization', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' reference.
	 * @see #setOrganization(Organization)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPerson_Organization()
	 * @model ordered="false"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Person#getOrganization <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 *     <p>
	 * given name of this Person
	 *     </p>
	 * 
	 *     <p>
	 * Note: Property <i>givenName</i> maps to 'givenName', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Given Name</em>' attribute.
	 * @see #setGivenName(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPerson_GivenName()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getGivenName();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Person#getGivenName <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Name</em>' attribute.
	 * @see #getGivenName()
	 * @generated
	 */
	void setGivenName(String value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 *     <p>
	 * surname of this Person
	 *     </p>
	 * 
	 *     <p>
	 * Note: Property <i>surname</i> maps to 'sn' or 'surname', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Surname</em>' attribute.
	 * @see #setSurname(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPerson_Surname()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getSurname();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Person#getSurname <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' attribute.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(String value);

	/**
	 * Returns the value of the '<em><b>Organizational Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 *     <p>
	 * optional organizational unit that this Person belongs to
	 *     </p>
	 * 
	 *     <p>
	 * Note: Property <i>organizationalUnit</i> maps to 'ou' or 'organizationalUnit', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organizational Unit</em>' attribute.
	 * @see #setOrganizationalUnit(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPerson_OrganizationalUnit()
	 * @model dataType="CDP4.CommonData.String" ordered="false"
	 * @generated
	 */
	String getOrganizationalUnit();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Person#getOrganizationalUnit <em>Organizational Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organizational Unit</em>' attribute.
	 * @see #getOrganizationalUnit()
	 * @generated
	 */
	void setOrganizationalUnit(String value);

	/**
	 * Returns the value of the '<em><b>Email Address</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.EmailAddress}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 *     <p>
	 * e-mail address(es) of this Person
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;Each e-mail address shall comply with the SMTP protocol as specified in <a href="http://datatracker.ietf.org/doc/rfc5321/">IETF RFC 5321</a>, i.e. &quot;user-name@domain&quot; or &quot;Full Name &lt;user-name@domain&gt;&quot;.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email Address</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPerson_EmailAddress()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EmailAddress> getEmailAddress();

	/**
	 * Returns the value of the '<em><b>Telephone Number</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.TelephoneNumber}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 *     <p>
	 * telephone number(s) of this Person
	 *     </p>
	 * 
	 *     <p>
	 * Note 1:&#160;The telephone numbers shall be written in the following form:&#160;&#160;&quot;+cc-ac-localnumber&quot;, where cc is the country code and ac is the area code.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;Property <i>telephoneNumber</i> maps to 'telephoneNumber', as defined in LDAP (<a href="http://datatracker.ietf.org/doc/rfc4519/">IETF RFC 4519</a>).
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telephone Number</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPerson_TelephoneNumber()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TelephoneNumber> getTelephoneNumber();

	/**
	 * Returns the value of the '<em><b>Default Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 *     <p>
	 * optional reference to the DomainOfExpertise that this Person represents by default
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Domain</em>' reference.
	 * @see #setDefaultDomain(DomainOfExpertise)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPerson_DefaultDomain()
	 * @model ordered="false"
	 * @generated
	 */
	DomainOfExpertise getDefaultDomain();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Person#getDefaultDomain <em>Default Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Domain</em>' reference.
	 * @see #getDefaultDomain()
	 * @generated
	 */
	void setDefaultDomain(DomainOfExpertise value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 * 
	 *   <body>
	 *     <p>
	 *       assertion whether this Person is still an active member in at least one       concurrent       engineering       team
	 *     </p>
	 * 
	 *     <p>
	 *       Note:&#160;Set to <i>false</i> implies that this Person does no longer       have       access       to       the       E-TM-10-25       environment       and       data       that       is       controlled       via       the       SiteDirectory       containing       the       Person.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(Boolean)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPerson_IsActive()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsActive();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Person#getIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #getIsActive()
	 * @generated
	 */
	void setIsActive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 * reference to the PersonRole assigned to this Person
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(PersonRole)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPerson_Role()
	 * @model ordered="false"
	 * @generated
	 */
	PersonRole getRole();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Person#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(PersonRole value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 *     <p>
	 * optional definition of the password for this Person for use with user authentication handling by an implementation of this data model
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;A server implementation may provide several modes of authentication:&#160;e.g. based on local / self-contained or LDAP&#160;or other network accessible authentication services. The local / self-contained mode would use this password property. The mode using LDAP&#160;or other network accessible services would neglect this password property and use the passwords from the network service.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPerson_Password()
	 * @model dataType="CDP4.CommonData.String" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Person#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Salt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 *     <p>
	 * optional definition of a &quot;salt&quot; to assist with secure authentication handling
	 *     </p>
	 * 
	 *     <p>
	 * Note 1:&#160;See <a href="http://en.wikipedia.org/wiki/Salt_%28cryptography%29">explanation of salt</a> on Wikipedia for more details.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;For security reasons values of this property will only be stored and handled server-side.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Salt</em>' attribute.
	 * @see #setSalt(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPerson_Salt()
	 * @model dataType="CDP4.CommonData.String" ordered="false"
	 * @generated
	 */
	String getSalt();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Person#getSalt <em>Salt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salt</em>' attribute.
	 * @see #getSalt()
	 * @generated
	 */
	void setSalt(String value);

	/**
	 * Returns the value of the '<em><b>Default Email Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 *     <p>
	 * optional reference to the default e-mail address of this Person
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Email Address</em>' reference.
	 * @see #setDefaultEmailAddress(EmailAddress)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPerson_DefaultEmailAddress()
	 * @model ordered="false"
	 * @generated
	 */
	EmailAddress getDefaultEmailAddress();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Person#getDefaultEmailAddress <em>Default Email Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Email Address</em>' reference.
	 * @see #getDefaultEmailAddress()
	 * @generated
	 */
	void setDefaultEmailAddress(EmailAddress value);

	/**
	 * Returns the value of the '<em><b>Default Telephone Number</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 *     <p>
	 * optional reference to the default telephone number of this Person
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Telephone Number</em>' reference.
	 * @see #setDefaultTelephoneNumber(TelephoneNumber)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPerson_DefaultTelephoneNumber()
	 * @model ordered="false"
	 * @generated
	 */
	TelephoneNumber getDefaultTelephoneNumber();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Person#getDefaultTelephoneNumber <em>Default Telephone Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Telephone Number</em>' reference.
	 * @see #getDefaultTelephoneNumber()
	 * @generated
	 */
	void setDefaultTelephoneNumber(TelephoneNumber value);

	/**
	 * Returns the value of the '<em><b>User Preference</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.UserPreference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 *     <p>
	 * set of user-defined preferences of this Person
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;UserPreferences provide a flexible and extensible way to define preferences in the form of key-value pairs&#160;that a Person&#160;can store on an E-TM-10-25 compatible server in order to configure one or more client applications for his or her use.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Preference</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPerson_UserPreference()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<UserPreference> getUserPreference();

} // Person
