/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.SiteDirectoryData.DomainOfExpertise;
import CDP4.SiteDirectoryData.Participant;
import CDP4.SiteDirectoryData.ParticipantRole;
import CDP4.SiteDirectoryData.Person;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ParticipantImpl#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ParticipantImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ParticipantImpl#getRole <em>Role</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ParticipantImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ParticipantImpl#getSelectedDomain <em>Selected Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends ThingImpl implements Participant {
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
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected ParticipantRole role;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainOfExpertise> domain;

	/**
	 * The cached value of the '{@link #getSelectedDomain() <em>Selected Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectedDomain()
	 * @generated
	 * @ordered
	 */
	protected DomainOfExpertise selectedDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.PARTICIPANT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PARTICIPANT__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (Person)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.PARTICIPANT__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PARTICIPANT__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRole getRole() {
		if (role != null && role.eIsProxy()) {
			InternalEObject oldRole = (InternalEObject)role;
			role = (ParticipantRole)eResolveProxy(oldRole);
			if (role != oldRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.PARTICIPANT__ROLE, oldRole, role));
			}
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantRole basicGetRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(ParticipantRole newRole) {
		ParticipantRole oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PARTICIPANT__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainOfExpertise> getDomain() {
		if (domain == null) {
			domain = new EObjectResolvingEList<DomainOfExpertise>(DomainOfExpertise.class, this, SiteDirectoryDataPackage.PARTICIPANT__DOMAIN);
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainOfExpertise getSelectedDomain() {
		if (selectedDomain != null && selectedDomain.eIsProxy()) {
			InternalEObject oldSelectedDomain = (InternalEObject)selectedDomain;
			selectedDomain = (DomainOfExpertise)eResolveProxy(oldSelectedDomain);
			if (selectedDomain != oldSelectedDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.PARTICIPANT__SELECTED_DOMAIN, oldSelectedDomain, selectedDomain));
			}
		}
		return selectedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainOfExpertise basicGetSelectedDomain() {
		return selectedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectedDomain(DomainOfExpertise newSelectedDomain) {
		DomainOfExpertise oldSelectedDomain = selectedDomain;
		selectedDomain = newSelectedDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.PARTICIPANT__SELECTED_DOMAIN, oldSelectedDomain, selectedDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.PARTICIPANT__IS_ACTIVE:
				return getIsActive();
			case SiteDirectoryDataPackage.PARTICIPANT__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
			case SiteDirectoryDataPackage.PARTICIPANT__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case SiteDirectoryDataPackage.PARTICIPANT__DOMAIN:
				return getDomain();
			case SiteDirectoryDataPackage.PARTICIPANT__SELECTED_DOMAIN:
				if (resolve) return getSelectedDomain();
				return basicGetSelectedDomain();
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
			case SiteDirectoryDataPackage.PARTICIPANT__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case SiteDirectoryDataPackage.PARTICIPANT__PERSON:
				setPerson((Person)newValue);
				return;
			case SiteDirectoryDataPackage.PARTICIPANT__ROLE:
				setRole((ParticipantRole)newValue);
				return;
			case SiteDirectoryDataPackage.PARTICIPANT__DOMAIN:
				getDomain().clear();
				getDomain().addAll((Collection<? extends DomainOfExpertise>)newValue);
				return;
			case SiteDirectoryDataPackage.PARTICIPANT__SELECTED_DOMAIN:
				setSelectedDomain((DomainOfExpertise)newValue);
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
			case SiteDirectoryDataPackage.PARTICIPANT__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.PARTICIPANT__PERSON:
				setPerson((Person)null);
				return;
			case SiteDirectoryDataPackage.PARTICIPANT__ROLE:
				setRole((ParticipantRole)null);
				return;
			case SiteDirectoryDataPackage.PARTICIPANT__DOMAIN:
				getDomain().clear();
				return;
			case SiteDirectoryDataPackage.PARTICIPANT__SELECTED_DOMAIN:
				setSelectedDomain((DomainOfExpertise)null);
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
			case SiteDirectoryDataPackage.PARTICIPANT__IS_ACTIVE:
				return IS_ACTIVE_EDEFAULT == null ? isActive != null : !IS_ACTIVE_EDEFAULT.equals(isActive);
			case SiteDirectoryDataPackage.PARTICIPANT__PERSON:
				return person != null;
			case SiteDirectoryDataPackage.PARTICIPANT__ROLE:
				return role != null;
			case SiteDirectoryDataPackage.PARTICIPANT__DOMAIN:
				return domain != null && !domain.isEmpty();
			case SiteDirectoryDataPackage.PARTICIPANT__SELECTED_DOMAIN:
				return selectedDomain != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (isActive: ");
		result.append(isActive);
		result.append(')');
		return result.toString();
	}

} //ParticipantImpl
