/**
 */
package CDP4.ReportingData.impl;

import CDP4.CommonData.Thing;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.ReportingData.ReportingDataPackage;
import CDP4.ReportingData.ThingReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.impl.ThingReferenceImpl#getReferencedRevisionNumber <em>Referenced Revision Number</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.ThingReferenceImpl#getReferencedThing <em>Referenced Thing</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ThingReferenceImpl extends ThingImpl implements ThingReference {
	/**
	 * The default value of the '{@link #getReferencedRevisionNumber() <em>Referenced Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REFERENCED_REVISION_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencedRevisionNumber() <em>Referenced Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected Integer referencedRevisionNumber = REFERENCED_REVISION_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedThing() <em>Referenced Thing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedThing()
	 * @generated
	 * @ordered
	 */
	protected Thing referencedThing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingDataPackage.Literals.THING_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getReferencedRevisionNumber() {
		return referencedRevisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedRevisionNumber(Integer newReferencedRevisionNumber) {
		Integer oldReferencedRevisionNumber = referencedRevisionNumber;
		referencedRevisionNumber = newReferencedRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.THING_REFERENCE__REFERENCED_REVISION_NUMBER, oldReferencedRevisionNumber, referencedRevisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing getReferencedThing() {
		if (referencedThing != null && referencedThing.eIsProxy()) {
			InternalEObject oldReferencedThing = (InternalEObject)referencedThing;
			referencedThing = (Thing)eResolveProxy(oldReferencedThing);
			if (referencedThing != oldReferencedThing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingDataPackage.THING_REFERENCE__REFERENCED_THING, oldReferencedThing, referencedThing));
			}
		}
		return referencedThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thing basicGetReferencedThing() {
		return referencedThing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedThing(Thing newReferencedThing) {
		Thing oldReferencedThing = referencedThing;
		referencedThing = newReferencedThing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.THING_REFERENCE__REFERENCED_THING, oldReferencedThing, referencedThing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportingDataPackage.THING_REFERENCE__REFERENCED_REVISION_NUMBER:
				return getReferencedRevisionNumber();
			case ReportingDataPackage.THING_REFERENCE__REFERENCED_THING:
				if (resolve) return getReferencedThing();
				return basicGetReferencedThing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReportingDataPackage.THING_REFERENCE__REFERENCED_REVISION_NUMBER:
				setReferencedRevisionNumber((Integer)newValue);
				return;
			case ReportingDataPackage.THING_REFERENCE__REFERENCED_THING:
				setReferencedThing((Thing)newValue);
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
			case ReportingDataPackage.THING_REFERENCE__REFERENCED_REVISION_NUMBER:
				setReferencedRevisionNumber(REFERENCED_REVISION_NUMBER_EDEFAULT);
				return;
			case ReportingDataPackage.THING_REFERENCE__REFERENCED_THING:
				setReferencedThing((Thing)null);
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
			case ReportingDataPackage.THING_REFERENCE__REFERENCED_REVISION_NUMBER:
				return REFERENCED_REVISION_NUMBER_EDEFAULT == null ? referencedRevisionNumber != null : !REFERENCED_REVISION_NUMBER_EDEFAULT.equals(referencedRevisionNumber);
			case ReportingDataPackage.THING_REFERENCE__REFERENCED_THING:
				return referencedThing != null;
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
		result.append(" (referencedRevisionNumber: ");
		result.append(referencedRevisionNumber);
		result.append(')');
		return result.toString();
	}

} //ThingReferenceImpl
