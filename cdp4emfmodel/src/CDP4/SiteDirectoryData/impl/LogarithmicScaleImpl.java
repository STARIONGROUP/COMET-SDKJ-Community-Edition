/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.LogarithmBaseKind;
import CDP4.SiteDirectoryData.LogarithmicScale;
import CDP4.SiteDirectoryData.QuantityKind;
import CDP4.SiteDirectoryData.ScaleReferenceQuantityValue;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logarithmic Scale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.LogarithmicScaleImpl#getLogarithmBase <em>Logarithm Base</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.LogarithmicScaleImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.LogarithmicScaleImpl#getExponent <em>Exponent</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.LogarithmicScaleImpl#getReferenceQuantityKind <em>Reference Quantity Kind</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.LogarithmicScaleImpl#getReferenceQuantityValue <em>Reference Quantity Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogarithmicScaleImpl extends MeasurementScaleImpl implements LogarithmicScale {
	/**
	 * The default value of the '{@link #getLogarithmBase() <em>Logarithm Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogarithmBase()
	 * @generated
	 * @ordered
	 */
	protected static final LogarithmBaseKind LOGARITHM_BASE_EDEFAULT = LogarithmBaseKind.NATURAL;

	/**
	 * The cached value of the '{@link #getLogarithmBase() <em>Logarithm Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogarithmBase()
	 * @generated
	 * @ordered
	 */
	protected LogarithmBaseKind logarithmBase = LOGARITHM_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected String factor = FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getExponent() <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExponent()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExponent() <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExponent()
	 * @generated
	 * @ordered
	 */
	protected String exponent = EXPONENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferenceQuantityKind() <em>Reference Quantity Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceQuantityKind()
	 * @generated
	 * @ordered
	 */
	protected QuantityKind referenceQuantityKind;

	/**
	 * The cached value of the '{@link #getReferenceQuantityValue() <em>Reference Quantity Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceQuantityValue()
	 * @generated
	 * @ordered
	 */
	protected ScaleReferenceQuantityValue referenceQuantityValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogarithmicScaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.LOGARITHMIC_SCALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogarithmBaseKind getLogarithmBase() {
		return logarithmBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogarithmBase(LogarithmBaseKind newLogarithmBase) {
		LogarithmBaseKind oldLogarithmBase = logarithmBase;
		logarithmBase = newLogarithmBase == null ? LOGARITHM_BASE_EDEFAULT : newLogarithmBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.LOGARITHMIC_SCALE__LOGARITHM_BASE, oldLogarithmBase, logarithmBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(String newFactor) {
		String oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.LOGARITHMIC_SCALE__FACTOR, oldFactor, factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExponent() {
		return exponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExponent(String newExponent) {
		String oldExponent = exponent;
		exponent = newExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.LOGARITHMIC_SCALE__EXPONENT, oldExponent, exponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityKind getReferenceQuantityKind() {
		if (referenceQuantityKind != null && referenceQuantityKind.eIsProxy()) {
			InternalEObject oldReferenceQuantityKind = (InternalEObject)referenceQuantityKind;
			referenceQuantityKind = (QuantityKind)eResolveProxy(oldReferenceQuantityKind);
			if (referenceQuantityKind != oldReferenceQuantityKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.LOGARITHMIC_SCALE__REFERENCE_QUANTITY_KIND, oldReferenceQuantityKind, referenceQuantityKind));
			}
		}
		return referenceQuantityKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityKind basicGetReferenceQuantityKind() {
		return referenceQuantityKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceQuantityKind(QuantityKind newReferenceQuantityKind) {
		QuantityKind oldReferenceQuantityKind = referenceQuantityKind;
		referenceQuantityKind = newReferenceQuantityKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.LOGARITHMIC_SCALE__REFERENCE_QUANTITY_KIND, oldReferenceQuantityKind, referenceQuantityKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleReferenceQuantityValue getReferenceQuantityValue() {
		return referenceQuantityValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceQuantityValue(ScaleReferenceQuantityValue newReferenceQuantityValue, NotificationChain msgs) {
		ScaleReferenceQuantityValue oldReferenceQuantityValue = referenceQuantityValue;
		referenceQuantityValue = newReferenceQuantityValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.LOGARITHMIC_SCALE__REFERENCE_QUANTITY_VALUE, oldReferenceQuantityValue, newReferenceQuantityValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceQuantityValue(ScaleReferenceQuantityValue newReferenceQuantityValue) {
		if (newReferenceQuantityValue != referenceQuantityValue) {
			NotificationChain msgs = null;
			if (referenceQuantityValue != null)
				msgs = ((InternalEObject)referenceQuantityValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SiteDirectoryDataPackage.LOGARITHMIC_SCALE__REFERENCE_QUANTITY_VALUE, null, msgs);
			if (newReferenceQuantityValue != null)
				msgs = ((InternalEObject)newReferenceQuantityValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SiteDirectoryDataPackage.LOGARITHMIC_SCALE__REFERENCE_QUANTITY_VALUE, null, msgs);
			msgs = basicSetReferenceQuantityValue(newReferenceQuantityValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.LOGARITHMIC_SCALE__REFERENCE_QUANTITY_VALUE, newReferenceQuantityValue, newReferenceQuantityValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__REFERENCE_QUANTITY_VALUE:
				return basicSetReferenceQuantityValue(null, msgs);
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
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__LOGARITHM_BASE:
				return getLogarithmBase();
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__FACTOR:
				return getFactor();
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__EXPONENT:
				return getExponent();
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__REFERENCE_QUANTITY_KIND:
				if (resolve) return getReferenceQuantityKind();
				return basicGetReferenceQuantityKind();
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__REFERENCE_QUANTITY_VALUE:
				return getReferenceQuantityValue();
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
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__LOGARITHM_BASE:
				setLogarithmBase((LogarithmBaseKind)newValue);
				return;
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__FACTOR:
				setFactor((String)newValue);
				return;
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__EXPONENT:
				setExponent((String)newValue);
				return;
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__REFERENCE_QUANTITY_KIND:
				setReferenceQuantityKind((QuantityKind)newValue);
				return;
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__REFERENCE_QUANTITY_VALUE:
				setReferenceQuantityValue((ScaleReferenceQuantityValue)newValue);
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
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__LOGARITHM_BASE:
				setLogarithmBase(LOGARITHM_BASE_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__FACTOR:
				setFactor(FACTOR_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__EXPONENT:
				setExponent(EXPONENT_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__REFERENCE_QUANTITY_KIND:
				setReferenceQuantityKind((QuantityKind)null);
				return;
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__REFERENCE_QUANTITY_VALUE:
				setReferenceQuantityValue((ScaleReferenceQuantityValue)null);
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
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__LOGARITHM_BASE:
				return logarithmBase != LOGARITHM_BASE_EDEFAULT;
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__FACTOR:
				return FACTOR_EDEFAULT == null ? factor != null : !FACTOR_EDEFAULT.equals(factor);
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__EXPONENT:
				return EXPONENT_EDEFAULT == null ? exponent != null : !EXPONENT_EDEFAULT.equals(exponent);
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__REFERENCE_QUANTITY_KIND:
				return referenceQuantityKind != null;
			case SiteDirectoryDataPackage.LOGARITHMIC_SCALE__REFERENCE_QUANTITY_VALUE:
				return referenceQuantityValue != null;
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
		result.append(" (logarithmBase: ");
		result.append(logarithmBase);
		result.append(", factor: ");
		result.append(factor);
		result.append(", exponent: ");
		result.append(exponent);
		result.append(')');
		return result.toString();
	}

} //LogarithmicScaleImpl
