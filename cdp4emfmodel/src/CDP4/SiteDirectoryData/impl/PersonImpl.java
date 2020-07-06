/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.DeprecatableThing;
import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.SiteDirectoryData.DomainOfExpertise;
import CDP4.SiteDirectoryData.EmailAddress;
import CDP4.SiteDirectoryData.Organization;
import CDP4.SiteDirectoryData.Person;
import CDP4.SiteDirectoryData.PersonRole;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;
import CDP4.SiteDirectoryData.TelephoneNumber;
import CDP4.SiteDirectoryData.UserPreference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getIsDeprecated <em>Is Deprecated</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getOrganizationalUnit <em>Organizational Unit</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getEmailAddress <em>Email Address</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getTelephoneNumber <em>Telephone Number</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getDefaultDomain <em>Default Domain</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getRole <em>Role</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getSalt <em>Salt</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getDefaultEmailAddress <em>Default Email Address</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getDefaultTelephoneNumber <em>Default Telephone Number</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.PersonImpl#getUserPreference <em>User Preference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends ThingImpl implements Person {
	/**
	 * The default value of the '{@link #getIsDeprecated() <em>Is Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEPRECATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsDeprecated() <em>Is Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeprecated()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDeprecated = IS_DEPRECATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization organization;

	/**
	 * The default value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected static final String GIVEN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGivenName() <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivenName()
	 * @generated
	 * @ordered
	 */
	protected String givenName = GIVEN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected String surname = SURNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizationalUnit() <em>Organizational Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationalUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATIONAL_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizationalUnit() <em>Organizational Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizationalUnit()
	 * @generated
	 * @ordered
	 */
	protected String organizationalUnit = ORGANIZATIONAL_UNIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEmailAddress() <em>Email Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<EmailAddress> emailAddress;

	/**
	 * The cached value of the '{@link #getTelephoneNumber() <em>Telephone Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<TelephoneNumber> telephoneNumber;

	/**
	 * The cached value of the '{@link #getDefaultDomain() <em>Default Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDomain()
	 * @generated
	 * @ordered
	 */
	protected DomainOfExpertise defaultDomain;

	/**
	 * The default value of the '{@link #getIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ACTIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsActive()
	 * @generated
	 * @ordered
	 */
	protected Boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected PersonRole role;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalt() <em>Salt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalt()
	 * @generated
	 * @ordered
	 */
	protected static final String SALT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalt() <em>Salt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalt()
	 * @generated
	 * @ordered
	 */
	protected String salt = SALT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultEmailAddress() <em>Default Email Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected EmailAddress defaultEmailAddress;

	/**
	 * The cached value of the '{@link #getDefaultTelephoneNumber() <em>Default Telephone Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultTelephoneNumber()
	 * @generated
	 * @ordered
	 */
	protected TelephoneNumber defaultTelephoneNumber;

	/**
	 * The cached value of the '{@link #getUserPreference() <em>User Preference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPreference()
	 * @generated
	 * @ordered
	 */
	protected EList<UserPreference> userPreference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDeprecated() {
		return isDeprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeprecated(Boolean newIsDeprecated) {
		Boolean oldIsDeprecated = isDeprecated;
		isDeprecated = newIsDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PERSON__IS_DEPRECATED, oldIsDeprecated, isDeprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PERSON__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		if (organization != null && organization.eIsProxy()) {
			InternalEObject oldOrganization = (InternalEObject)organization;
			organization = (Organization)eResolveProxy(oldOrganization);
			if (organization != oldOrganization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.PERSON__ORGANIZATION, oldOrganization, organization));
			}
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		Organization oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PERSON__ORGANIZATION, oldOrganization, organization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGivenName() {
		return givenName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGivenName(String newGivenName) {
		String oldGivenName = givenName;
		givenName = newGivenName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PERSON__GIVEN_NAME, oldGivenName, givenName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurname(String newSurname) {
		String oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PERSON__SURNAME, oldSurname, surname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganizationalUnit() {
		return organizationalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationalUnit(String newOrganizationalUnit) {
		String oldOrganizationalUnit = organizationalUnit;
		organizationalUnit = newOrganizationalUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PERSON__ORGANIZATIONAL_UNIT, oldOrganizationalUnit, organizationalUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmailAddress> getEmailAddress() {
		if (emailAddress == null) {
			emailAddress = new EObjectContainmentEList<EmailAddress>(EmailAddress.class, this, SiteDirectoryDataPackage.PERSON__EMAIL_ADDRESS);
		}
		return emailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TelephoneNumber> getTelephoneNumber() {
		if (telephoneNumber == null) {
			telephoneNumber = new EObjectContainmentEList<TelephoneNumber>(TelephoneNumber.class, this, SiteDirectoryDataPackage.PERSON__TELEPHONE_NUMBER);
		}
		return telephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainOfExpertise getDefaultDomain() {
		if (defaultDomain != null && defaultDomain.eIsProxy()) {
			InternalEObject oldDefaultDomain = (InternalEObject)defaultDomain;
			defaultDomain = (DomainOfExpertise)eResolveProxy(oldDefaultDomain);
			if (defaultDomain != oldDefaultDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.PERSON__DEFAULT_DOMAIN, oldDefaultDomain, defaultDomain));
			}
		}
		return defaultDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainOfExpertise basicGetDefaultDomain() {
		return defaultDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultDomain(DomainOfExpertise newDefaultDomain) {
		DomainOfExpertise oldDefaultDomain = defaultDomain;
		defaultDomain = newDefaultDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PERSON__DEFAULT_DOMAIN, oldDefaultDomain, defaultDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(Boolean newIsActive) {
		Boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PERSON__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRole getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (PersonRole)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.PERSON__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRole basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(PersonRole newRole) {
		PersonRole oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PERSON__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PERSON__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalt(String newSalt) {
		String oldSalt = salt;
		salt = newSalt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PERSON__SALT, oldSalt, salt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailAddress getDefaultEmailAddress() {
		if (defaultEmailAddress != null && defaultEmailAddress.eIsProxy()) {
			InternalEObject oldDefaultEmailAddress = (InternalEObject)defaultEmailAddress;
			defaultEmailAddress = (EmailAddress)eResolveProxy(oldDefaultEmailAddress);
			if (defaultEmailAddress != oldDefaultEmailAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.PERSON__DEFAULT_EMAIL_ADDRESS, oldDefaultEmailAddress, defaultEmailAddress));
			}
		}
		return defaultEmailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmailAddress basicGetDefaultEmailAddress() {
		return defaultEmailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultEmailAddress(EmailAddress newDefaultEmailAddress) {
		EmailAddress oldDefaultEmailAddress = defaultEmailAddress;
		defaultEmailAddress = newDefaultEmailAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PERSON__DEFAULT_EMAIL_ADDRESS, oldDefaultEmailAddress, defaultEmailAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber getDefaultTelephoneNumber() {
		if (defaultTelephoneNumber != null && defaultTelephoneNumber.eIsProxy()) {
			InternalEObject oldDefaultTelephoneNumber = (InternalEObject)defaultTelephoneNumber;
			defaultTelephoneNumber = (TelephoneNumber)eResolveProxy(oldDefaultTelephoneNumber);
			if (defaultTelephoneNumber != oldDefaultTelephoneNumber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.PERSON__DEFAULT_TELEPHONE_NUMBER, oldDefaultTelephoneNumber, defaultTelephoneNumber));
			}
		}
		return defaultTelephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber basicGetDefaultTelephoneNumber() {
		return defaultTelephoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultTelephoneNumber(TelephoneNumber newDefaultTelephoneNumber) {
		TelephoneNumber oldDefaultTelephoneNumber = defaultTelephoneNumber;
		defaultTelephoneNumber = newDefaultTelephoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PERSON__DEFAULT_TELEPHONE_NUMBER, oldDefaultTelephoneNumber, defaultTelephoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserPreference> getUserPreference() {
		if (userPreference == null) {
			userPreference = new EObjectContainmentEList<UserPreference>(UserPreference.class, this, SiteDirectoryDataPackage.PERSON__USER_PREFERENCE);
		}
		return userPreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SiteDirectoryDataPackage.PERSON__EMAIL_ADDRESS:
				return ((InternalEList<?>)getEmailAddress()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.PERSON__TELEPHONE_NUMBER:
				return ((InternalEList<?>)getTelephoneNumber()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.PERSON__USER_PREFERENCE:
				return ((InternalEList<?>)getUserPreference()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.PERSON__IS_DEPRECATED:
				return getIsDeprecated();
			case SiteDirectoryDataPackage.PERSON__NAME:
				return getName();
			case SiteDirectoryDataPackage.PERSON__SHORT_NAME:
				return getShortName();
			case SiteDirectoryDataPackage.PERSON__ORGANIZATION:
				if (resolve) return getOrganization();
				return basicGetOrganization();
			case SiteDirectoryDataPackage.PERSON__GIVEN_NAME:
				return getGivenName();
			case SiteDirectoryDataPackage.PERSON__SURNAME:
				return getSurname();
			case SiteDirectoryDataPackage.PERSON__ORGANIZATIONAL_UNIT:
				return getOrganizationalUnit();
			case SiteDirectoryDataPackage.PERSON__EMAIL_ADDRESS:
				return getEmailAddress();
			case SiteDirectoryDataPackage.PERSON__TELEPHONE_NUMBER:
				return getTelephoneNumber();
			case SiteDirectoryDataPackage.PERSON__DEFAULT_DOMAIN:
				if (resolve) return getDefaultDomain();
				return basicGetDefaultDomain();
			case SiteDirectoryDataPackage.PERSON__IS_ACTIVE:
				return getIsActive();
			case SiteDirectoryDataPackage.PERSON__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case SiteDirectoryDataPackage.PERSON__PASSWORD:
				return getPassword();
			case SiteDirectoryDataPackage.PERSON__SALT:
				return getSalt();
			case SiteDirectoryDataPackage.PERSON__DEFAULT_EMAIL_ADDRESS:
				if (resolve) return getDefaultEmailAddress();
				return basicGetDefaultEmailAddress();
			case SiteDirectoryDataPackage.PERSON__DEFAULT_TELEPHONE_NUMBER:
				if (resolve) return getDefaultTelephoneNumber();
				return basicGetDefaultTelephoneNumber();
			case SiteDirectoryDataPackage.PERSON__USER_PREFERENCE:
				return getUserPreference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SiteDirectoryDataPackage.PERSON__IS_DEPRECATED:
				setIsDeprecated((Boolean)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__GIVEN_NAME:
				setGivenName((String)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__SURNAME:
				setSurname((String)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__ORGANIZATIONAL_UNIT:
				setOrganizationalUnit((String)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__EMAIL_ADDRESS:
				getEmailAddress().clear();
				getEmailAddress().addAll((Collection<? extends EmailAddress>)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				getTelephoneNumber().addAll((Collection<? extends TelephoneNumber>)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__DEFAULT_DOMAIN:
				setDefaultDomain((DomainOfExpertise)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__ROLE:
				setRole((PersonRole)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__PASSWORD:
				setPassword((String)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__SALT:
				setSalt((String)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__DEFAULT_EMAIL_ADDRESS:
				setDefaultEmailAddress((EmailAddress)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__DEFAULT_TELEPHONE_NUMBER:
				setDefaultTelephoneNumber((TelephoneNumber)newValue);
				return;
			case SiteDirectoryDataPackage.PERSON__USER_PREFERENCE:
				getUserPreference().clear();
				getUserPreference().addAll((Collection<? extends UserPreference>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SiteDirectoryDataPackage.PERSON__IS_DEPRECATED:
				setIsDeprecated(IS_DEPRECATED_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.PERSON__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.PERSON__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case SiteDirectoryDataPackage.PERSON__GIVEN_NAME:
				setGivenName(GIVEN_NAME_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.PERSON__SURNAME:
				setSurname(SURNAME_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.PERSON__ORGANIZATIONAL_UNIT:
				setOrganizationalUnit(ORGANIZATIONAL_UNIT_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.PERSON__EMAIL_ADDRESS:
				getEmailAddress().clear();
				return;
			case SiteDirectoryDataPackage.PERSON__TELEPHONE_NUMBER:
				getTelephoneNumber().clear();
				return;
			case SiteDirectoryDataPackage.PERSON__DEFAULT_DOMAIN:
				setDefaultDomain((DomainOfExpertise)null);
				return;
			case SiteDirectoryDataPackage.PERSON__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.PERSON__ROLE:
				setRole((PersonRole)null);
				return;
			case SiteDirectoryDataPackage.PERSON__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.PERSON__SALT:
				setSalt(SALT_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.PERSON__DEFAULT_EMAIL_ADDRESS:
				setDefaultEmailAddress((EmailAddress)null);
				return;
			case SiteDirectoryDataPackage.PERSON__DEFAULT_TELEPHONE_NUMBER:
				setDefaultTelephoneNumber((TelephoneNumber)null);
				return;
			case SiteDirectoryDataPackage.PERSON__USER_PREFERENCE:
				getUserPreference().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SiteDirectoryDataPackage.PERSON__IS_DEPRECATED:
				return IS_DEPRECATED_EDEFAULT == null ? isDeprecated != null : !IS_DEPRECATED_EDEFAULT.equals(isDeprecated);
			case SiteDirectoryDataPackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SiteDirectoryDataPackage.PERSON__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case SiteDirectoryDataPackage.PERSON__ORGANIZATION:
				return organization != null;
			case SiteDirectoryDataPackage.PERSON__GIVEN_NAME:
				return GIVEN_NAME_EDEFAULT == null ? givenName != null : !GIVEN_NAME_EDEFAULT.equals(givenName);
			case SiteDirectoryDataPackage.PERSON__SURNAME:
				return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
			case SiteDirectoryDataPackage.PERSON__ORGANIZATIONAL_UNIT:
				return ORGANIZATIONAL_UNIT_EDEFAULT == null ? organizationalUnit != null : !ORGANIZATIONAL_UNIT_EDEFAULT.equals(organizationalUnit);
			case SiteDirectoryDataPackage.PERSON__EMAIL_ADDRESS:
				return emailAddress != null && !emailAddress.isEmpty();
			case SiteDirectoryDataPackage.PERSON__TELEPHONE_NUMBER:
				return telephoneNumber != null && !telephoneNumber.isEmpty();
			case SiteDirectoryDataPackage.PERSON__DEFAULT_DOMAIN:
				return defaultDomain != null;
			case SiteDirectoryDataPackage.PERSON__IS_ACTIVE:
				return IS_ACTIVE_EDEFAULT == null ? isActive != null : !IS_ACTIVE_EDEFAULT.equals(isActive);
			case SiteDirectoryDataPackage.PERSON__ROLE:
				return role != null;
			case SiteDirectoryDataPackage.PERSON__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case SiteDirectoryDataPackage.PERSON__SALT:
				return SALT_EDEFAULT == null ? salt != null : !SALT_EDEFAULT.equals(salt);
			case SiteDirectoryDataPackage.PERSON__DEFAULT_EMAIL_ADDRESS:
				return defaultEmailAddress != null;
			case SiteDirectoryDataPackage.PERSON__DEFAULT_TELEPHONE_NUMBER:
				return defaultTelephoneNumber != null;
			case SiteDirectoryDataPackage.PERSON__USER_PREFERENCE:
				return userPreference != null && !userPreference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DeprecatableThing.class) {
			switch (derivedFeatureID) {
				case SiteDirectoryDataPackage.PERSON__IS_DEPRECATED: return CommonDataPackage.DEPRECATABLE_THING__IS_DEPRECATED;
				default: return -1;
			}
		}
		if (baseClass == NamedThing.class) {
			switch (derivedFeatureID) {
				case SiteDirectoryDataPackage.PERSON__NAME: return CommonDataPackage.NAMED_THING__NAME;
				default: return -1;
			}
		}
		if (baseClass == ShortNamedThing.class) {
			switch (derivedFeatureID) {
				case SiteDirectoryDataPackage.PERSON__SHORT_NAME: return CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DeprecatableThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.DEPRECATABLE_THING__IS_DEPRECATED: return SiteDirectoryDataPackage.PERSON__IS_DEPRECATED;
				default: return -1;
			}
		}
		if (baseClass == NamedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.NAMED_THING__NAME: return SiteDirectoryDataPackage.PERSON__NAME;
				default: return -1;
			}
		}
		if (baseClass == ShortNamedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME: return SiteDirectoryDataPackage.PERSON__SHORT_NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isDeprecated: ");
		result.append(isDeprecated);
		result.append(", name: ");
		result.append(name);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(", givenName: ");
		result.append(givenName);
		result.append(", surname: ");
		result.append(surname);
		result.append(", organizationalUnit: ");
		result.append(organizationalUnit);
		result.append(", isActive: ");
		result.append(isActive);
		result.append(", password: ");
		result.append(password);
		result.append(", salt: ");
		result.append(salt);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
