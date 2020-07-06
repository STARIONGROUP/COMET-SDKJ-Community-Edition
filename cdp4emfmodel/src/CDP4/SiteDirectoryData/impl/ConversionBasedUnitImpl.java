/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.ConversionBasedUnit;
import CDP4.SiteDirectoryData.MeasurementUnit;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversion Based Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ConversionBasedUnitImpl#getReferenceUnit <em>Reference Unit</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.ConversionBasedUnitImpl#getConversionFactor <em>Conversion Factor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConversionBasedUnitImpl extends MeasurementUnitImpl implements ConversionBasedUnit {
	/**
	 * The cached value of the '{@link #getReferenceUnit() <em>Reference Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceUnit()
	 * @generated
	 * @ordered
	 */
	protected MeasurementUnit referenceUnit;

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
	protected ConversionBasedUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.CONVERSION_BASED_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnit getReferenceUnit() {
		if (referenceUnit != null && referenceUnit.eIsProxy()) {
			InternalEObject oldReferenceUnit = (InternalEObject)referenceUnit;
			referenceUnit = (MeasurementUnit)eResolveProxy(oldReferenceUnit);
			if (referenceUnit != oldReferenceUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.CONVERSION_BASED_UNIT__REFERENCE_UNIT, oldReferenceUnit, referenceUnit));
			}
		}
		return referenceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnit basicGetReferenceUnit() {
		return referenceUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceUnit(MeasurementUnit newReferenceUnit) {
		MeasurementUnit oldReferenceUnit = referenceUnit;
		referenceUnit = newReferenceUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.CONVERSION_BASED_UNIT__REFERENCE_UNIT, oldReferenceUnit, referenceUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.CONVERSION_BASED_UNIT__CONVERSION_FACTOR, oldConversionFactor, conversionFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.CONVERSION_BASED_UNIT__REFERENCE_UNIT:
				if (resolve) return getReferenceUnit();
				return basicGetReferenceUnit();
			case SiteDirectoryDataPackage.CONVERSION_BASED_UNIT__CONVERSION_FACTOR:
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
			case SiteDirectoryDataPackage.CONVERSION_BASED_UNIT__REFERENCE_UNIT:
				setReferenceUnit((MeasurementUnit)newValue);
				return;
			case SiteDirectoryDataPackage.CONVERSION_BASED_UNIT__CONVERSION_FACTOR:
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
			case SiteDirectoryDataPackage.CONVERSION_BASED_UNIT__REFERENCE_UNIT:
				setReferenceUnit((MeasurementUnit)null);
				return;
			case SiteDirectoryDataPackage.CONVERSION_BASED_UNIT__CONVERSION_FACTOR:
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
			case SiteDirectoryDataPackage.CONVERSION_BASED_UNIT__REFERENCE_UNIT:
				return referenceUnit != null;
			case SiteDirectoryDataPackage.CONVERSION_BASED_UNIT__CONVERSION_FACTOR:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (conversionFactor: ");
		result.append(conversionFactor);
		result.append(')');
		return result.toString();
	}

} //ConversionBasedUnitImpl
