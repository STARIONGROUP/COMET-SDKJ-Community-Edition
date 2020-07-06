/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.SiteDirectoryData.EmailAddress;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;
import CDP4.SiteDirectoryData.VcardEmailAddressKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Email Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.EmailAddressImpl#getVcardType <em>Vcard Type</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.EmailAddressImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmailAddressImpl extends ThingImpl implements EmailAddress {
	/**
	 * The default value of the '{@link #getVcardType() <em>Vcard Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcardType()
	 * @generated
	 * @ordered
	 */
	protected static final VcardEmailAddressKind VCARD_TYPE_EDEFAULT = VcardEmailAddressKind.WORK;

	/**
	 * The cached value of the '{@link #getVcardType() <em>Vcard Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcardType()
	 * @generated
	 * @ordered
	 */
	protected VcardEmailAddressKind vcardType = VCARD_TYPE_EDEFAULT;

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
	protected EmailAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.EMAIL_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VcardEmailAddressKind getVcardType() {
		return vcardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcardType(VcardEmailAddressKind newVcardType) {
		VcardEmailAddressKind oldVcardType = vcardType;
		vcardType = newVcardType == null ? VCARD_TYPE_EDEFAULT : newVcardType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.EMAIL_ADDRESS__VCARD_TYPE, oldVcardType, vcardType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.EMAIL_ADDRESS__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.EMAIL_ADDRESS__VCARD_TYPE:
				return getVcardType();
			case SiteDirectoryDataPackage.EMAIL_ADDRESS__VALUE:
				return getValue();
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
			case SiteDirectoryDataPackage.EMAIL_ADDRESS__VCARD_TYPE:
				setVcardType((VcardEmailAddressKind)newValue);
				return;
			case SiteDirectoryDataPackage.EMAIL_ADDRESS__VALUE:
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
			case SiteDirectoryDataPackage.EMAIL_ADDRESS__VCARD_TYPE:
				setVcardType(VCARD_TYPE_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.EMAIL_ADDRESS__VALUE:
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
			case SiteDirectoryDataPackage.EMAIL_ADDRESS__VCARD_TYPE:
				return vcardType != VCARD_TYPE_EDEFAULT;
			case SiteDirectoryDataPackage.EMAIL_ADDRESS__VALUE:
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

} //EmailAddressImpl
