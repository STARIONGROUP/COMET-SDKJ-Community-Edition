/**
 */
package CDP4.CommonData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.TopContainer;

import java.time.OffsetDateTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.CommonData.impl.TopContainerImpl#getLastModifiedOn <em>Last Modified On</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TopContainerImpl extends ThingImpl implements TopContainer {
	/**
	 * The default value of the '{@link #getLastModifiedOn() <em>Last Modified On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedOn()
	 * @generated
	 * @ordered
	 */
	protected static final OffsetDateTime LAST_MODIFIED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModifiedOn() <em>Last Modified On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModifiedOn()
	 * @generated
	 * @ordered
	 */
	protected OffsetDateTime lastModifiedOn = LAST_MODIFIED_ON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonDataPackage.Literals.TOP_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetDateTime getLastModifiedOn() {
		return lastModifiedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModifiedOn(OffsetDateTime newLastModifiedOn) {
		OffsetDateTime oldLastModifiedOn = lastModifiedOn;
		lastModifiedOn = newLastModifiedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.TOP_CONTAINER__LAST_MODIFIED_ON, oldLastModifiedOn, lastModifiedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonDataPackage.TOP_CONTAINER__LAST_MODIFIED_ON:
				return getLastModifiedOn();
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
			case CommonDataPackage.TOP_CONTAINER__LAST_MODIFIED_ON:
				setLastModifiedOn((OffsetDateTime)newValue);
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
			case CommonDataPackage.TOP_CONTAINER__LAST_MODIFIED_ON:
				setLastModifiedOn(LAST_MODIFIED_ON_EDEFAULT);
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
			case CommonDataPackage.TOP_CONTAINER__LAST_MODIFIED_ON:
				return LAST_MODIFIED_ON_EDEFAULT == null ? lastModifiedOn != null : !LAST_MODIFIED_ON_EDEFAULT.equals(lastModifiedOn);
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
		result.append(" (lastModifiedOn: ");
		result.append(lastModifiedOn);
		result.append(')');
		return result.toString();
	}

} //TopContainerImpl
