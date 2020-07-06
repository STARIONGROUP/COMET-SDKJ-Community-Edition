/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.SiteDirectoryData.QuantityKind;
import CDP4.SiteDirectoryData.QuantityKindFactor;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantity Kind Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.QuantityKindFactorImpl#getQuantityKind <em>Quantity Kind</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.QuantityKindFactorImpl#getExponent <em>Exponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantityKindFactorImpl extends ThingImpl implements QuantityKindFactor {
	/**
	 * The cached value of the '{@link #getQuantityKind() <em>Quantity Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityKind()
	 * @generated
	 * @ordered
	 */
	protected QuantityKind quantityKind;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantityKindFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.QUANTITY_KIND_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityKind getQuantityKind() {
		if (quantityKind != null && quantityKind.eIsProxy()) {
			InternalEObject oldQuantityKind = (InternalEObject)quantityKind;
			quantityKind = (QuantityKind)eResolveProxy(oldQuantityKind);
			if (quantityKind != oldQuantityKind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SiteDirectoryDataPackage.QUANTITY_KIND_FACTOR__QUANTITY_KIND, oldQuantityKind, quantityKind));
			}
		}
		return quantityKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityKind basicGetQuantityKind() {
		return quantityKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityKind(QuantityKind newQuantityKind) {
		QuantityKind oldQuantityKind = quantityKind;
		quantityKind = newQuantityKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.QUANTITY_KIND_FACTOR__QUANTITY_KIND, oldQuantityKind, quantityKind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.QUANTITY_KIND_FACTOR__EXPONENT, oldExponent, exponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.QUANTITY_KIND_FACTOR__QUANTITY_KIND:
				if (resolve) return getQuantityKind();
				return basicGetQuantityKind();
			case SiteDirectoryDataPackage.QUANTITY_KIND_FACTOR__EXPONENT:
				return getExponent();
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
			case SiteDirectoryDataPackage.QUANTITY_KIND_FACTOR__QUANTITY_KIND:
				setQuantityKind((QuantityKind)newValue);
				return;
			case SiteDirectoryDataPackage.QUANTITY_KIND_FACTOR__EXPONENT:
				setExponent((String)newValue);
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
			case SiteDirectoryDataPackage.QUANTITY_KIND_FACTOR__QUANTITY_KIND:
				setQuantityKind((QuantityKind)null);
				return;
			case SiteDirectoryDataPackage.QUANTITY_KIND_FACTOR__EXPONENT:
				setExponent(EXPONENT_EDEFAULT);
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
			case SiteDirectoryDataPackage.QUANTITY_KIND_FACTOR__QUANTITY_KIND:
				return quantityKind != null;
			case SiteDirectoryDataPackage.QUANTITY_KIND_FACTOR__EXPONENT:
				return EXPONENT_EDEFAULT == null ? exponent != null : !EXPONENT_EDEFAULT.equals(exponent);
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
		result.append(" (exponent: ");
		result.append(exponent);
		result.append(')');
		return result.toString();
	}

} //QuantityKindFactorImpl
