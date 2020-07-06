/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.DeprecatableThing;

import CDP4.CommonData.impl.DefinedThingImpl;

import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;
import CDP4.SiteDirectoryData.UnitPrefix;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unit Prefix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.UnitPrefixImpl#getIsDeprecated <em>Is Deprecated</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.UnitPrefixImpl#getConversionFactor <em>Conversion Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnitPrefixImpl extends DefinedThingImpl implements UnitPrefix {
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
	 * The default value of the '{@link #getConversionFactor() <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionFactor()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVERSION_FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConversionFactor() <em>Conversion Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionFactor()
	 * @generated
	 * @ordered
	 */
	protected String conversionFactor = CONVERSION_FACTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitPrefixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.UNIT_PREFIX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.UNIT_PREFIX__IS_DEPRECATED, oldIsDeprecated, isDeprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConversionFactor() {
		return conversionFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionFactor(String newConversionFactor) {
		String oldConversionFactor = conversionFactor;
		conversionFactor = newConversionFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.UNIT_PREFIX__CONVERSION_FACTOR, oldConversionFactor, conversionFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.UNIT_PREFIX__IS_DEPRECATED:
				return getIsDeprecated();
			case SiteDirectoryDataPackage.UNIT_PREFIX__CONVERSION_FACTOR:
				return getConversionFactor();
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
			case SiteDirectoryDataPackage.UNIT_PREFIX__IS_DEPRECATED:
				setIsDeprecated((Boolean)newValue);
				return;
			case SiteDirectoryDataPackage.UNIT_PREFIX__CONVERSION_FACTOR:
				setConversionFactor((String)newValue);
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
			case SiteDirectoryDataPackage.UNIT_PREFIX__IS_DEPRECATED:
				setIsDeprecated(IS_DEPRECATED_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.UNIT_PREFIX__CONVERSION_FACTOR:
				setConversionFactor(CONVERSION_FACTOR_EDEFAULT);
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
			case SiteDirectoryDataPackage.UNIT_PREFIX__IS_DEPRECATED:
				return IS_DEPRECATED_EDEFAULT == null ? isDeprecated != null : !IS_DEPRECATED_EDEFAULT.equals(isDeprecated);
			case SiteDirectoryDataPackage.UNIT_PREFIX__CONVERSION_FACTOR:
				return CONVERSION_FACTOR_EDEFAULT == null ? conversionFactor != null : !CONVERSION_FACTOR_EDEFAULT.equals(conversionFactor);
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
				case SiteDirectoryDataPackage.UNIT_PREFIX__IS_DEPRECATED: return CommonDataPackage.DEPRECATABLE_THING__IS_DEPRECATED;
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
				case CommonDataPackage.DEPRECATABLE_THING__IS_DEPRECATED: return SiteDirectoryDataPackage.UNIT_PREFIX__IS_DEPRECATED;
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
		result.append(", conversionFactor: ");
		result.append(conversionFactor);
		result.append(')');
		return result.toString();
	}

} //UnitPrefixImpl
