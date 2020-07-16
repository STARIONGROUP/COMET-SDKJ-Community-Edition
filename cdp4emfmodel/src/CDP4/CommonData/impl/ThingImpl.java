/**
 */
package CDP4.CommonData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.Thing;

import CDP4.SiteDirectoryData.DomainOfExpertise;
import CDP4.SiteDirectoryData.Person;

import java.time.OffsetDateTime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.CommonData.impl.ThingImpl#getIid <em>Iid</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.ThingImpl#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.ThingImpl#getClassKind <em>Class Kind</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.ThingImpl#getModifiedOn <em>Modified On</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.ThingImpl#getExcludedPerson <em>Excluded Person</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.ThingImpl#getExcludedDomain <em>Excluded Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ThingImpl extends MinimalEObjectImpl.Container implements Thing {
	/**
	 * The default value of the '{@link #getIid() <em>Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIid()
	 * @generated
	 * @ordered
	 */
	protected static final String IID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIid() <em>Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIid()
	 * @generated
	 * @ordered
	 */
	protected String iid = IID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REVISION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer revisionNumber = REVISION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassKind() <em>Class Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassKind()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassKind() <em>Class Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassKind()
	 * @generated
	 * @ordered
	 */
	protected String classKind = CLASS_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifiedOn() <em>Modified On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedOn()
	 * @generated
	 * @ordered
	 */
	protected static final OffsetDateTime MODIFIED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedOn() <em>Modified On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedOn()
	 * @generated
	 * @ordered
	 */
	protected OffsetDateTime modifiedOn = MODIFIED_ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExcludedPerson() <em>Excluded Person</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludedPerson()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> excludedPerson;

	/**
	 * The cached value of the '{@link #getExcludedDomain() <em>Excluded Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludedDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainOfExpertise> excludedDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonDataPackage.Literals.THING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIid() {
		return iid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIid(String newIid) {
		String oldIid = iid;
		iid = newIid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.THING__IID, oldIid, iid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRevisionNumber() {
		return revisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionNumber(Integer newRevisionNumber) {
		Integer oldRevisionNumber = revisionNumber;
		revisionNumber = newRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.THING__REVISION_NUMBER, oldRevisionNumber, revisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassKind() {
		return classKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassKind(String newClassKind) {
		String oldClassKind = classKind;
		classKind = newClassKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.THING__CLASS_KIND, oldClassKind, classKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetDateTime getModifiedOn() {
		return modifiedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedOn(OffsetDateTime newModifiedOn) {
		OffsetDateTime oldModifiedOn = modifiedOn;
		modifiedOn = newModifiedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.THING__MODIFIED_ON, oldModifiedOn, modifiedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getExcludedPerson() {
		if (excludedPerson == null) {
			excludedPerson = new EObjectResolvingEList<Person>(Person.class, this, CommonDataPackage.THING__EXCLUDED_PERSON);
		}
		return excludedPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainOfExpertise> getExcludedDomain() {
		if (excludedDomain == null) {
			excludedDomain = new EObjectResolvingEList<DomainOfExpertise>(DomainOfExpertise.class, this, CommonDataPackage.THING__EXCLUDED_DOMAIN);
		}
		return excludedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonDataPackage.THING__IID:
				return getIid();
			case CommonDataPackage.THING__REVISION_NUMBER:
				return getRevisionNumber();
			case CommonDataPackage.THING__CLASS_KIND:
				return getClassKind();
			case CommonDataPackage.THING__MODIFIED_ON:
				return getModifiedOn();
			case CommonDataPackage.THING__EXCLUDED_PERSON:
				return getExcludedPerson();
			case CommonDataPackage.THING__EXCLUDED_DOMAIN:
				return getExcludedDomain();
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
			case CommonDataPackage.THING__IID:
				setIid((String)newValue);
				return;
			case CommonDataPackage.THING__REVISION_NUMBER:
				setRevisionNumber((Integer)newValue);
				return;
			case CommonDataPackage.THING__CLASS_KIND:
				setClassKind((String)newValue);
				return;
			case CommonDataPackage.THING__MODIFIED_ON:
				setModifiedOn((OffsetDateTime)newValue);
				return;
			case CommonDataPackage.THING__EXCLUDED_PERSON:
				getExcludedPerson().clear();
				getExcludedPerson().addAll((Collection<? extends Person>)newValue);
				return;
			case CommonDataPackage.THING__EXCLUDED_DOMAIN:
				getExcludedDomain().clear();
				getExcludedDomain().addAll((Collection<? extends DomainOfExpertise>)newValue);
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
			case CommonDataPackage.THING__IID:
				setIid(IID_EDEFAULT);
				return;
			case CommonDataPackage.THING__REVISION_NUMBER:
				setRevisionNumber(REVISION_NUMBER_EDEFAULT);
				return;
			case CommonDataPackage.THING__CLASS_KIND:
				setClassKind(CLASS_KIND_EDEFAULT);
				return;
			case CommonDataPackage.THING__MODIFIED_ON:
				setModifiedOn(MODIFIED_ON_EDEFAULT);
				return;
			case CommonDataPackage.THING__EXCLUDED_PERSON:
				getExcludedPerson().clear();
				return;
			case CommonDataPackage.THING__EXCLUDED_DOMAIN:
				getExcludedDomain().clear();
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
			case CommonDataPackage.THING__IID:
				return IID_EDEFAULT == null ? iid != null : !IID_EDEFAULT.equals(iid);
			case CommonDataPackage.THING__REVISION_NUMBER:
				return REVISION_NUMBER_EDEFAULT == null ? revisionNumber != null : !REVISION_NUMBER_EDEFAULT.equals(revisionNumber);
			case CommonDataPackage.THING__CLASS_KIND:
				return CLASS_KIND_EDEFAULT == null ? classKind != null : !CLASS_KIND_EDEFAULT.equals(classKind);
			case CommonDataPackage.THING__MODIFIED_ON:
				return MODIFIED_ON_EDEFAULT == null ? modifiedOn != null : !MODIFIED_ON_EDEFAULT.equals(modifiedOn);
			case CommonDataPackage.THING__EXCLUDED_PERSON:
				return excludedPerson != null && !excludedPerson.isEmpty();
			case CommonDataPackage.THING__EXCLUDED_DOMAIN:
				return excludedDomain != null && !excludedDomain.isEmpty();
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
		result.append(" (iid: ");
		result.append(iid);
		result.append(", revisionNumber: ");
		result.append(revisionNumber);
		result.append(", classKind: ");
		result.append(classKind);
		result.append(", modifiedOn: ");
		result.append(modifiedOn);
		result.append(')');
		return result.toString();
	}

} //ThingImpl
