/**
 */
package CDP4.CommonData.impl;

import CDP4.CommonData.Alias;
import CDP4.CommonData.Annotation;
import CDP4.CommonData.CommonDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.CommonData.impl.AliasImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.AliasImpl#getContent <em>Content</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.AliasImpl#getIsSynonym <em>Is Synonym</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AliasImpl extends ThingImpl implements Alias {
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
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSynonym() <em>Is Synonym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSynonym()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SYNONYM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSynonym() <em>Is Synonym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSynonym()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSynonym = IS_SYNONYM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AliasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonDataPackage.Literals.ALIAS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.ALIAS__LANGUAGE_CODE, oldLanguageCode, languageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.ALIAS__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSynonym() {
		return isSynonym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSynonym(Boolean newIsSynonym) {
		Boolean oldIsSynonym = isSynonym;
		isSynonym = newIsSynonym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.ALIAS__IS_SYNONYM, oldIsSynonym, isSynonym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonDataPackage.ALIAS__LANGUAGE_CODE:
				return getLanguageCode();
			case CommonDataPackage.ALIAS__CONTENT:
				return getContent();
			case CommonDataPackage.ALIAS__IS_SYNONYM:
				return getIsSynonym();
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
			case CommonDataPackage.ALIAS__LANGUAGE_CODE:
				setLanguageCode((String)newValue);
				return;
			case CommonDataPackage.ALIAS__CONTENT:
				setContent((String)newValue);
				return;
			case CommonDataPackage.ALIAS__IS_SYNONYM:
				setIsSynonym((Boolean)newValue);
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
			case CommonDataPackage.ALIAS__LANGUAGE_CODE:
				setLanguageCode(LANGUAGE_CODE_EDEFAULT);
				return;
			case CommonDataPackage.ALIAS__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case CommonDataPackage.ALIAS__IS_SYNONYM:
				setIsSynonym(IS_SYNONYM_EDEFAULT);
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
			case CommonDataPackage.ALIAS__LANGUAGE_CODE:
				return LANGUAGE_CODE_EDEFAULT == null ? languageCode != null : !LANGUAGE_CODE_EDEFAULT.equals(languageCode);
			case CommonDataPackage.ALIAS__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case CommonDataPackage.ALIAS__IS_SYNONYM:
				return IS_SYNONYM_EDEFAULT == null ? isSynonym != null : !IS_SYNONYM_EDEFAULT.equals(isSynonym);
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
		if (baseClass == Annotation.class) {
			switch (derivedFeatureID) {
				case CommonDataPackage.ALIAS__LANGUAGE_CODE: return CommonDataPackage.ANNOTATION__LANGUAGE_CODE;
				case CommonDataPackage.ALIAS__CONTENT: return CommonDataPackage.ANNOTATION__CONTENT;
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
		if (baseClass == Annotation.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.ANNOTATION__LANGUAGE_CODE: return CommonDataPackage.ALIAS__LANGUAGE_CODE;
				case CommonDataPackage.ANNOTATION__CONTENT: return CommonDataPackage.ALIAS__CONTENT;
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
		result.append(" (languageCode: ");
		result.append(languageCode);
		result.append(", content: ");
		result.append(content);
		result.append(", isSynonym: ");
		result.append(isSynonym);
		result.append(')');
		return result.toString();
	}

} //AliasImpl
