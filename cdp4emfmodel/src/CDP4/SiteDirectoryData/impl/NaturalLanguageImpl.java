/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.NamedThing;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.SiteDirectoryData.NaturalLanguage;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Natural Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.NaturalLanguageImpl#getName <em>Name</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.NaturalLanguageImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.NaturalLanguageImpl#getNativeName <em>Native Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NaturalLanguageImpl extends ThingImpl implements NaturalLanguage {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageCode() <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageCode() <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected String languageCode = LANGUAGE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNativeName() <em>Native Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeName()
	 * @generated
	 * @ordered
	 */
	protected static final String NATIVE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNativeName() <em>Native Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeName()
	 * @generated
	 * @ordered
	 */
	protected String nativeName = NATIVE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NaturalLanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.NATURAL_LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.NATURAL_LANGUAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageCode(String newLanguageCode) {
		String oldLanguageCode = languageCode;
		languageCode = newLanguageCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.NATURAL_LANGUAGE__LANGUAGE_CODE, oldLanguageCode, languageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNativeName() {
		return nativeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNativeName(String newNativeName) {
		String oldNativeName = nativeName;
		nativeName = newNativeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.NATURAL_LANGUAGE__NATIVE_NAME, oldNativeName, nativeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SiteDirectoryDataPackage.NATURAL_LANGUAGE__NAME:
				return getName();
			case SiteDirectoryDataPackage.NATURAL_LANGUAGE__LANGUAGE_CODE:
				return getLanguageCode();
			case SiteDirectoryDataPackage.NATURAL_LANGUAGE__NATIVE_NAME:
				return getNativeName();
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
			case SiteDirectoryDataPackage.NATURAL_LANGUAGE__NAME:
				setName((String)newValue);
				return;
			case SiteDirectoryDataPackage.NATURAL_LANGUAGE__LANGUAGE_CODE:
				setLanguageCode((String)newValue);
				return;
			case SiteDirectoryDataPackage.NATURAL_LANGUAGE__NATIVE_NAME:
				setNativeName((String)newValue);
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
			case SiteDirectoryDataPackage.NATURAL_LANGUAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.NATURAL_LANGUAGE__LANGUAGE_CODE:
				setLanguageCode(LANGUAGE_CODE_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.NATURAL_LANGUAGE__NATIVE_NAME:
				setNativeName(NATIVE_NAME_EDEFAULT);
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
			case SiteDirectoryDataPackage.NATURAL_LANGUAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SiteDirectoryDataPackage.NATURAL_LANGUAGE__LANGUAGE_CODE:
				return LANGUAGE_CODE_EDEFAULT == null ? languageCode != null : !LANGUAGE_CODE_EDEFAULT.equals(languageCode);
			case SiteDirectoryDataPackage.NATURAL_LANGUAGE__NATIVE_NAME:
				return NATIVE_NAME_EDEFAULT == null ? nativeName != null : !NATIVE_NAME_EDEFAULT.equals(nativeName);
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
		if (baseClass == NamedThing.class) {
			switch (derivedFeatureID) {
				case SiteDirectoryDataPackage.NATURAL_LANGUAGE__NAME: return CommonDataPackage.NAMED_THING__NAME;
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
		if (baseClass == NamedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.NAMED_THING__NAME: return SiteDirectoryDataPackage.NATURAL_LANGUAGE__NAME;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", languageCode: ");
		result.append(languageCode);
		result.append(", nativeName: ");
		result.append(nativeName);
		result.append(')');
		return result.toString();
	}

} //NaturalLanguageImpl
