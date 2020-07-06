/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.CyclicRatioScale;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cyclic Ratio Scale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.CyclicRatioScaleImpl#getModulus <em>Modulus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CyclicRatioScaleImpl extends RatioScaleImpl implements CyclicRatioScale {
	/**
	 * The default value of the '{@link #getModulus() <em>Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulus()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModulus() <em>Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModulus()
	 * @generated
	 * @ordered
	 */
	protected String modulus = MODULUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CyclicRatioScaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.CYCLIC_RATIO_SCALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModulus() {
		return modulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModulus(String newModulus) {
		String oldModulus = modulus;
		modulus = newModulus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.CYCLIC_RATIO_SCALE__MODULUS, oldModulus, modulus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.CYCLIC_RATIO_SCALE__MODULUS:
				return getModulus();
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
			case SiteDirectoryDataPackage.CYCLIC_RATIO_SCALE__MODULUS:
				setModulus((String)newValue);
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
			case SiteDirectoryDataPackage.CYCLIC_RATIO_SCALE__MODULUS:
				setModulus(MODULUS_EDEFAULT);
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
			case SiteDirectoryDataPackage.CYCLIC_RATIO_SCALE__MODULUS:
				return MODULUS_EDEFAULT == null ? modulus != null : !MODULUS_EDEFAULT.equals(modulus);
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
		result.append(" (modulus: ");
		result.append(modulus);
		result.append(')');
		return result.toString();
	}

} //CyclicRatioScaleImpl
