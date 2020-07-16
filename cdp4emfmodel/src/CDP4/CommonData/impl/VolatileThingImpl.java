/**
 */
package CDP4.CommonData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.VolatileThing;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volatile Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.CommonData.impl.VolatileThingImpl#getIsVolatile <em>Is Volatile</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VolatileThingImpl extends MinimalEObjectImpl.Container implements VolatileThing {
	/**
	 * The default value of the '{@link #getIsVolatile() <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_VOLATILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsVolatile() <em>Is Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsVolatile()
	 * @generated
	 * @ordered
	 */
	protected Boolean isVolatile = IS_VOLATILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolatileThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonDataPackage.Literals.VOLATILE_THING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsVolatile() {
		return isVolatile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVolatile(Boolean newIsVolatile) {
		Boolean oldIsVolatile = isVolatile;
		isVolatile = newIsVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.VOLATILE_THING__IS_VOLATILE, oldIsVolatile, isVolatile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonDataPackage.VOLATILE_THING__IS_VOLATILE:
				return getIsVolatile();
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
			case CommonDataPackage.VOLATILE_THING__IS_VOLATILE:
				setIsVolatile((Boolean)newValue);
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
			case CommonDataPackage.VOLATILE_THING__IS_VOLATILE:
				setIsVolatile(IS_VOLATILE_EDEFAULT);
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
			case CommonDataPackage.VOLATILE_THING__IS_VOLATILE:
				return IS_VOLATILE_EDEFAULT == null ? isVolatile != null : !IS_VOLATILE_EDEFAULT.equals(isVolatile);
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
		result.append(" (isVolatile: ");
		result.append(isVolatile);
		result.append(')');
		return result.toString();
	}

} //VolatileThingImpl
