/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.OrdinalScale;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ordinal Scale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.OrdinalScaleImpl#getUseShortNameValues <em>Use Short Name Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrdinalScaleImpl extends MeasurementScaleImpl implements OrdinalScale {
	/**
	 * The default value of the '{@link #getUseShortNameValues() <em>Use Short Name Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseShortNameValues()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean USE_SHORT_NAME_VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseShortNameValues() <em>Use Short Name Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseShortNameValues()
	 * @generated
	 * @ordered
	 */
	protected Boolean useShortNameValues = USE_SHORT_NAME_VALUES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrdinalScaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.ORDINAL_SCALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUseShortNameValues() {
		return useShortNameValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseShortNameValues(Boolean newUseShortNameValues) {
		Boolean oldUseShortNameValues = useShortNameValues;
		useShortNameValues = newUseShortNameValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ORDINAL_SCALE__USE_SHORT_NAME_VALUES, oldUseShortNameValues, useShortNameValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.ORDINAL_SCALE__USE_SHORT_NAME_VALUES:
				return getUseShortNameValues();
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
			case SiteDirectoryDataPackage.ORDINAL_SCALE__USE_SHORT_NAME_VALUES:
				setUseShortNameValues((Boolean)newValue);
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
			case SiteDirectoryDataPackage.ORDINAL_SCALE__USE_SHORT_NAME_VALUES:
				setUseShortNameValues(USE_SHORT_NAME_VALUES_EDEFAULT);
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
			case SiteDirectoryDataPackage.ORDINAL_SCALE__USE_SHORT_NAME_VALUES:
				return USE_SHORT_NAME_VALUES_EDEFAULT == null ? useShortNameValues != null : !USE_SHORT_NAME_VALUES_EDEFAULT.equals(useShortNameValues);
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
		result.append(" (useShortNameValues: ");
		result.append(useShortNameValues);
		result.append(')');
		return result.toString();
	}

} //OrdinalScaleImpl
