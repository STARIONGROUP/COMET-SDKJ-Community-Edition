/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;
import CDP4.CommonData.TimeStampedThing;

import CDP4.CommonData.impl.TopContainerImpl;

import CDP4.ReportingData.SiteDirectoryDataAnnotation;

import CDP4.SiteDirectoryData.DomainOfExpertise;
import CDP4.SiteDirectoryData.DomainOfExpertiseGroup;
import CDP4.SiteDirectoryData.EngineeringModelSetup;
import CDP4.SiteDirectoryData.NaturalLanguage;
import CDP4.SiteDirectoryData.Organization;
import CDP4.SiteDirectoryData.ParticipantRole;
import CDP4.SiteDirectoryData.Person;
import CDP4.SiteDirectoryData.PersonRole;
import CDP4.SiteDirectoryData.SiteDirectory;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;
import CDP4.SiteDirectoryData.SiteLogEntry;
import CDP4.SiteDirectoryData.SiteReferenceDataLibrary;

import java.time.OffsetDateTime;

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
 * An implementation of the model object '<em><b>Site Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getParticipantRole <em>Participant Role</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getDefaultParticipantRole <em>Default Participant Role</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getSiteReferenceDataLibrary <em>Site Reference Data Library</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getModel <em>Model</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getPersonRole <em>Person Role</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getDefaultPersonRole <em>Default Person Role</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getLogEntry <em>Log Entry</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getDomainGroup <em>Domain Group</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getNaturalLanguage <em>Natural Language</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.SiteDirectoryImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiteDirectoryImpl extends TopContainerImpl implements SiteDirectory {
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
	 * The default value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected static final OffsetDateTime CREATED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected OffsetDateTime createdOn = CREATED_ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected EList<Organization> organization;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> person;

	/**
	 * The cached value of the '{@link #getParticipantRole() <em>Participant Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantRole()
	 * @generated
	 * @ordered
	 */
	protected EList<ParticipantRole> participantRole;

	/**
	 * The cached value of the '{@link #getDefaultParticipantRole() <em>Default Participant Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultParticipantRole()
	 * @generated
	 * @ordered
	 */
	protected ParticipantRole defaultParticipantRole;

	/**
	 * The cached value of the '{@link #getSiteReferenceDataLibrary() <em>Site Reference Data Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiteReferenceDataLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<SiteReferenceDataLibrary> siteReferenceDataLibrary;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EList<EngineeringModelSetup> model;

	/**
	 * The cached value of the '{@link #getPersonRole() <em>Person Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonRole()
	 * @generated
	 * @ordered
	 */
	protected EList<PersonRole> personRole;

	/**
	 * The cached value of the '{@link #getDefaultPersonRole() <em>Default Person Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultPersonRole()
	 * @generated
	 * @ordered
	 */
	protected PersonRole defaultPersonRole;

	/**
	 * The cached value of the '{@link #getLogEntry() <em>Log Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<SiteLogEntry> logEntry;

	/**
	 * The cached value of the '{@link #getDomainGroup() <em>Domain Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainOfExpertiseGroup> domainGroup;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainOfExpertise> domain;

	/**
	 * The cached value of the '{@link #getNaturalLanguage() <em>Natural Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNaturalLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<NaturalLanguage> naturalLanguage;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<SiteDirectoryDataAnnotation> annotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteDirectoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.SITE_DIRECTORY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.SITE_DIRECTORY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.SITE_DIRECTORY__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetDateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedOn(OffsetDateTime newCreatedOn) {
		OffsetDateTime oldCreatedOn = createdOn;
		createdOn = newCreatedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.SITE_DIRECTORY__CREATED_ON, oldCreatedOn, createdOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Organization> getOrganization() {
		if (organization == null) {
			organization = new EObjectContainmentEList<Organization>(Organization.class, this, SiteDirectoryDataPackage.SITE_DIRECTORY__ORGANIZATION);
		}
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPerson() {
		if (person == null) {
			person = new EObjectContainmentEList<Person>(Person.class, this, SiteDirectoryDataPackage.SITE_DIRECTORY__PERSON);
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParticipantRole> getParticipantRole() {
		if (participantRole == null) {
			participantRole = new EObjectContainmentEList<ParticipantRole>(ParticipantRole.class, this, SiteDirectoryDataPackage.SITE_DIRECTORY__PARTICIPANT_ROLE);
		}
		return participantRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRole getDefaultParticipantRole() {
		if (defaultParticipantRole != null && defaultParticipantRole.eIsProxy()) {
			InternalEObject oldDefaultParticipantRole = (InternalEObject)defaultParticipantRole;
			defaultParticipantRole = (ParticipantRole)eResolveProxy(oldDefaultParticipantRole);
			if (defaultParticipantRole != oldDefaultParticipantRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.SITE_DIRECTORY__DEFAULT_PARTICIPANT_ROLE, oldDefaultParticipantRole, defaultParticipantRole));
			}
		}
		return defaultParticipantRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRole basicGetDefaultParticipantRole() {
		return defaultParticipantRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultParticipantRole(ParticipantRole newDefaultParticipantRole) {
		ParticipantRole oldDefaultParticipantRole = defaultParticipantRole;
		defaultParticipantRole = newDefaultParticipantRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.SITE_DIRECTORY__DEFAULT_PARTICIPANT_ROLE, oldDefaultParticipantRole, defaultParticipantRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiteReferenceDataLibrary> getSiteReferenceDataLibrary() {
		if (siteReferenceDataLibrary == null) {
			siteReferenceDataLibrary = new EObjectContainmentEList<SiteReferenceDataLibrary>(SiteReferenceDataLibrary.class, this, SiteDirectoryDataPackage.SITE_DIRECTORY__SITE_REFERENCE_DATA_LIBRARY);
		}
		return siteReferenceDataLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EngineeringModelSetup> getModel() {
		if (model == null) {
			model = new EObjectContainmentEList<EngineeringModelSetup>(EngineeringModelSetup.class, this, SiteDirectoryDataPackage.SITE_DIRECTORY__MODEL);
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PersonRole> getPersonRole() {
		if (personRole == null) {
			personRole = new EObjectContainmentEList<PersonRole>(PersonRole.class, this, SiteDirectoryDataPackage.SITE_DIRECTORY__PERSON_ROLE);
		}
		return personRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRole getDefaultPersonRole() {
		if (defaultPersonRole != null && defaultPersonRole.eIsProxy()) {
			InternalEObject oldDefaultPersonRole = (InternalEObject)defaultPersonRole;
			defaultPersonRole = (PersonRole)eResolveProxy(oldDefaultPersonRole);
			if (defaultPersonRole != oldDefaultPersonRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.SITE_DIRECTORY__DEFAULT_PERSON_ROLE, oldDefaultPersonRole, defaultPersonRole));
			}
		}
		return defaultPersonRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonRole basicGetDefaultPersonRole() {
		return defaultPersonRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultPersonRole(PersonRole newDefaultPersonRole) {
		PersonRole oldDefaultPersonRole = defaultPersonRole;
		defaultPersonRole = newDefaultPersonRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.SITE_DIRECTORY__DEFAULT_PERSON_ROLE, oldDefaultPersonRole, defaultPersonRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiteLogEntry> getLogEntry() {
		if (logEntry == null) {
			logEntry = new EObjectContainmentEList<SiteLogEntry>(SiteLogEntry.class, this, SiteDirectoryDataPackage.SITE_DIRECTORY__LOG_ENTRY);
		}
		return logEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainOfExpertiseGroup> getDomainGroup() {
		if (domainGroup == null) {
			domainGroup = new EObjectContainmentEList<DomainOfExpertiseGroup>(DomainOfExpertiseGroup.class, this, SiteDirectoryDataPackage.SITE_DIRECTORY__DOMAIN_GROUP);
		}
		return domainGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainOfExpertise> getDomain() {
		if (domain == null) {
			domain = new EObjectContainmentEList<DomainOfExpertise>(DomainOfExpertise.class, this, SiteDirectoryDataPackage.SITE_DIRECTORY__DOMAIN);
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NaturalLanguage> getNaturalLanguage() {
		if (naturalLanguage == null) {
			naturalLanguage = new EObjectContainmentEList<NaturalLanguage>(NaturalLanguage.class, this, SiteDirectoryDataPackage.SITE_DIRECTORY__NATURAL_LANGUAGE);
		}
		return naturalLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiteDirectoryDataAnnotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectContainmentEList<SiteDirectoryDataAnnotation>(SiteDirectoryDataAnnotation.class, this, SiteDirectoryDataPackage.SITE_DIRECTORY__ANNOTATION);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SiteDirectoryDataPackage.SITE_DIRECTORY__ORGANIZATION:
				return ((InternalEList<?>)getOrganization()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.SITE_DIRECTORY__PERSON:
				return ((InternalEList<?>)getPerson()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.SITE_DIRECTORY__PARTICIPANT_ROLE:
				return ((InternalEList<?>)getParticipantRole()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.SITE_DIRECTORY__SITE_REFERENCE_DATA_LIBRARY:
				return ((InternalEList<?>)getSiteReferenceDataLibrary()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.SITE_DIRECTORY__MODEL:
				return ((InternalEList<?>)getModel()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.SITE_DIRECTORY__PERSON_ROLE:
				return ((InternalEList<?>)getPersonRole()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.SITE_DIRECTORY__LOG_ENTRY:
				return ((InternalEList<?>)getLogEntry()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DOMAIN_GROUP:
				return ((InternalEList<?>)getDomainGroup()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DOMAIN:
				return ((InternalEList<?>)getDomain()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.SITE_DIRECTORY__NATURAL_LANGUAGE:
				return ((InternalEList<?>)getNaturalLanguage()).basicRemove(otherEnd, msgs);
			case SiteDirectoryDataPackage.SITE_DIRECTORY__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
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
			case SiteDirectoryDataPackage.SITE_DIRECTORY__NAME:
				return getName();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__SHORT_NAME:
				return getShortName();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__CREATED_ON:
				return getCreatedOn();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__ORGANIZATION:
				return getOrganization();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__PERSON:
				return getPerson();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__PARTICIPANT_ROLE:
				return getParticipantRole();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DEFAULT_PARTICIPANT_ROLE:
				if (resolve) return getDefaultParticipantRole();
				return basicGetDefaultParticipantRole();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__SITE_REFERENCE_DATA_LIBRARY:
				return getSiteReferenceDataLibrary();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__MODEL:
				return getModel();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__PERSON_ROLE:
				return getPersonRole();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DEFAULT_PERSON_ROLE:
				if (resolve) return getDefaultPersonRole();
				return basicGetDefaultPersonRole();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__LOG_ENTRY:
				return getLogEntry();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DOMAIN_GROUP:
				return getDomainGroup();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DOMAIN:
				return getDomain();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__NATURAL_LANGUAGE:
				return getNaturalLanguage();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__ANNOTATION:
				return getAnnotation();
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
			case SiteDirectoryDataPackage.SITE_DIRECTORY__NAME:
				setName((String)newValue);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__CREATED_ON:
				setCreatedOn((OffsetDateTime)newValue);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__ORGANIZATION:
				getOrganization().clear();
				getOrganization().addAll((Collection<? extends Organization>)newValue);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__PERSON:
				getPerson().clear();
				getPerson().addAll((Collection<? extends Person>)newValue);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__PARTICIPANT_ROLE:
				getParticipantRole().clear();
				getParticipantRole().addAll((Collection<? extends ParticipantRole>)newValue);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DEFAULT_PARTICIPANT_ROLE:
				setDefaultParticipantRole((ParticipantRole)newValue);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__SITE_REFERENCE_DATA_LIBRARY:
				getSiteReferenceDataLibrary().clear();
				getSiteReferenceDataLibrary().addAll((Collection<? extends SiteReferenceDataLibrary>)newValue);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__MODEL:
				getModel().clear();
				getModel().addAll((Collection<? extends EngineeringModelSetup>)newValue);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__PERSON_ROLE:
				getPersonRole().clear();
				getPersonRole().addAll((Collection<? extends PersonRole>)newValue);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DEFAULT_PERSON_ROLE:
				setDefaultPersonRole((PersonRole)newValue);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__LOG_ENTRY:
				getLogEntry().clear();
				getLogEntry().addAll((Collection<? extends SiteLogEntry>)newValue);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DOMAIN_GROUP:
				getDomainGroup().clear();
				getDomainGroup().addAll((Collection<? extends DomainOfExpertiseGroup>)newValue);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DOMAIN:
				getDomain().clear();
				getDomain().addAll((Collection<? extends DomainOfExpertise>)newValue);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__NATURAL_LANGUAGE:
				getNaturalLanguage().clear();
				getNaturalLanguage().addAll((Collection<? extends NaturalLanguage>)newValue);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends SiteDirectoryDataAnnotation>)newValue);
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
			case SiteDirectoryDataPackage.SITE_DIRECTORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__CREATED_ON:
				setCreatedOn(CREATED_ON_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__ORGANIZATION:
				getOrganization().clear();
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__PERSON:
				getPerson().clear();
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__PARTICIPANT_ROLE:
				getParticipantRole().clear();
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DEFAULT_PARTICIPANT_ROLE:
				setDefaultParticipantRole((ParticipantRole)null);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__SITE_REFERENCE_DATA_LIBRARY:
				getSiteReferenceDataLibrary().clear();
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__MODEL:
				getModel().clear();
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__PERSON_ROLE:
				getPersonRole().clear();
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DEFAULT_PERSON_ROLE:
				setDefaultPersonRole((PersonRole)null);
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__LOG_ENTRY:
				getLogEntry().clear();
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DOMAIN_GROUP:
				getDomainGroup().clear();
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DOMAIN:
				getDomain().clear();
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__NATURAL_LANGUAGE:
				getNaturalLanguage().clear();
				return;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__ANNOTATION:
				getAnnotation().clear();
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
			case SiteDirectoryDataPackage.SITE_DIRECTORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SiteDirectoryDataPackage.SITE_DIRECTORY__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case SiteDirectoryDataPackage.SITE_DIRECTORY__CREATED_ON:
				return CREATED_ON_EDEFAULT == null ? createdOn != null : !CREATED_ON_EDEFAULT.equals(createdOn);
			case SiteDirectoryDataPackage.SITE_DIRECTORY__ORGANIZATION:
				return organization != null && !organization.isEmpty();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__PERSON:
				return person != null && !person.isEmpty();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__PARTICIPANT_ROLE:
				return participantRole != null && !participantRole.isEmpty();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DEFAULT_PARTICIPANT_ROLE:
				return defaultParticipantRole != null;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__SITE_REFERENCE_DATA_LIBRARY:
				return siteReferenceDataLibrary != null && !siteReferenceDataLibrary.isEmpty();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__MODEL:
				return model != null && !model.isEmpty();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__PERSON_ROLE:
				return personRole != null && !personRole.isEmpty();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DEFAULT_PERSON_ROLE:
				return defaultPersonRole != null;
			case SiteDirectoryDataPackage.SITE_DIRECTORY__LOG_ENTRY:
				return logEntry != null && !logEntry.isEmpty();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DOMAIN_GROUP:
				return domainGroup != null && !domainGroup.isEmpty();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__DOMAIN:
				return domain != null && !domain.isEmpty();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__NATURAL_LANGUAGE:
				return naturalLanguage != null && !naturalLanguage.isEmpty();
			case SiteDirectoryDataPackage.SITE_DIRECTORY__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
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
		if (baseClass == NamedThing.class) {
			switch (derivedFeatureID) {
				case SiteDirectoryDataPackage.SITE_DIRECTORY__NAME: return CommonDataPackage.NAMED_THING__NAME;
				default: return -1;
			}
		}
		if (baseClass == ShortNamedThing.class) {
			switch (derivedFeatureID) {
				case SiteDirectoryDataPackage.SITE_DIRECTORY__SHORT_NAME: return CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME;
				default: return -1;
			}
		}
		if (baseClass == TimeStampedThing.class) {
			switch (derivedFeatureID) {
				case SiteDirectoryDataPackage.SITE_DIRECTORY__CREATED_ON: return CommonDataPackage.TIME_STAMPED_THING__CREATED_ON;
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
		if (baseClass == NamedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.NAMED_THING__NAME: return SiteDirectoryDataPackage.SITE_DIRECTORY__NAME;
				default: return -1;
			}
		}
		if (baseClass == ShortNamedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME: return SiteDirectoryDataPackage.SITE_DIRECTORY__SHORT_NAME;
				default: return -1;
			}
		}
		if (baseClass == TimeStampedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.TIME_STAMPED_THING__CREATED_ON: return SiteDirectoryDataPackage.SITE_DIRECTORY__CREATED_ON;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(", createdOn: ");
		result.append(createdOn);
		result.append(')');
		return result.toString();
	}

} //SiteDirectoryImpl
