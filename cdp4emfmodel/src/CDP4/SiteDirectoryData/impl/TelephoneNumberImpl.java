/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;
import CDP4.SiteDirectoryData.TelephoneNumber;
import CDP4.SiteDirectoryData.VcardTelephoneNumberKind;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telephone Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.TelephoneNumberImpl#getVcardType <em>Vcard Type</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.TelephoneNumberImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TelephoneNumberImpl extends ThingImpl implements TelephoneNumber {
	/**
	 * The cached value of the '{@link #getVcardType() <em>Vcard Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcardType()
	 * @generated
	 * @ordered
	 */
	protected EList<VcardTelephoneNumberKind> vcardType;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelephoneNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.TELEPHONE_NUMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VcardTelephoneNumberKind> getVcardType() {
		if (vcardType == null) {
			vcardType = new EDataTypeUniqueEList<VcardTelephoneNumberKind>(VcardTelephoneNumberKind.class, this, SiteDirectoryDataPackage.TELEPHONE_NUMBER__VCARD_TYPE);
		}
		return vcardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.TELEPHONE_NUMBER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.TELEPHONE_NUMBER__VCARD_TYPE:
				return getVcardType();
			case SiteDirectoryDataPackage.TELEPHONE_NUMBER__VALUE:
				return getValue();
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
			case SiteDirectoryDataPackage.TELEPHONE_NUMBER__VCARD_TYPE:
				getVcardType().clear();
				getVcardType().addAll((Collection<? extends VcardTelephoneNumberKind>)newValue);
				return;
			case SiteDirectoryDataPackage.TELEPHONE_NUMBER__VALUE:
				setValue((String)newValue);
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
			case SiteDirectoryDataPackage.TELEPHONE_NUMBER__VCARD_TYPE:
				getVcardType().clear();
				return;
			case SiteDirectoryDataPackage.TELEPHONE_NUMBER__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case SiteDirectoryDataPackage.TELEPHONE_NUMBER__VCARD_TYPE:
				return vcardType != null && !vcardType.isEmpty();
			case SiteDirectoryDataPackage.TELEPHONE_NUMBER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (vcardType: ");
		result.append(vcardType);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //TelephoneNumberImpl
