/**
 */
package CDP4.CommonData.impl;

import CDP4.CommonData.Annotation;
import CDP4.CommonData.Citation;
import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.Definition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.CommonData.impl.DefinitionImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.DefinitionImpl#getContent <em>Content</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.DefinitionImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.DefinitionImpl#getNote <em>Note</em>}</li>
 *   <li>{@link CDP4.CommonData.impl.DefinitionImpl#getExample <em>Example</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionImpl extends ThingImpl implements Definition {
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
	 * The cached value of the '{@link #getCitation() <em>Citation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitation()
	 * @generated
	 * @ordered
	 */
	protected EList<Citation> citation;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<String> note;

	/**
	 * The cached value of the '{@link #getExample() <em>Example</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected EList<String> example;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonDataPackage.Literals.DEFINITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.DEFINITION__LANGUAGE_CODE, oldLanguageCode, languageCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonDataPackage.DEFINITION__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Citation> getCitation() {
		if (citation == null) {
			citation = new EObjectContainmentEList<Citation>(Citation.class, this, CommonDataPackage.DEFINITION__CITATION);
		}
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNote() {
		if (note == null) {
			note = new EDataTypeUniqueEList<String>(String.class, this, CommonDataPackage.DEFINITION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExample() {
		if (example == null) {
			example = new EDataTypeUniqueEList<String>(String.class, this, CommonDataPackage.DEFINITION__EXAMPLE);
		}
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonDataPackage.DEFINITION__CITATION:
				return ((InternalEList<?>)getCitation()).basicRemove(otherEnd, msgs);
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
			case CommonDataPackage.DEFINITION__LANGUAGE_CODE:
				return getLanguageCode();
			case CommonDataPackage.DEFINITION__CONTENT:
				return getContent();
			case CommonDataPackage.DEFINITION__CITATION:
				return getCitation();
			case CommonDataPackage.DEFINITION__NOTE:
				return getNote();
			case CommonDataPackage.DEFINITION__EXAMPLE:
				return getExample();
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
			case CommonDataPackage.DEFINITION__LANGUAGE_CODE:
				setLanguageCode((String)newValue);
				return;
			case CommonDataPackage.DEFINITION__CONTENT:
				setContent((String)newValue);
				return;
			case CommonDataPackage.DEFINITION__CITATION:
				getCitation().clear();
				getCitation().addAll((Collection<? extends Citation>)newValue);
				return;
			case CommonDataPackage.DEFINITION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends String>)newValue);
				return;
			case CommonDataPackage.DEFINITION__EXAMPLE:
				getExample().clear();
				getExample().addAll((Collection<? extends String>)newValue);
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
			case CommonDataPackage.DEFINITION__LANGUAGE_CODE:
				setLanguageCode(LANGUAGE_CODE_EDEFAULT);
				return;
			case CommonDataPackage.DEFINITION__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case CommonDataPackage.DEFINITION__CITATION:
				getCitation().clear();
				return;
			case CommonDataPackage.DEFINITION__NOTE:
				getNote().clear();
				return;
			case CommonDataPackage.DEFINITION__EXAMPLE:
				getExample().clear();
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
			case CommonDataPackage.DEFINITION__LANGUAGE_CODE:
				return LANGUAGE_CODE_EDEFAULT == null ? languageCode != null : !LANGUAGE_CODE_EDEFAULT.equals(languageCode);
			case CommonDataPackage.DEFINITION__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case CommonDataPackage.DEFINITION__CITATION:
				return citation != null && !citation.isEmpty();
			case CommonDataPackage.DEFINITION__NOTE:
				return note != null && !note.isEmpty();
			case CommonDataPackage.DEFINITION__EXAMPLE:
				return example != null && !example.isEmpty();
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
				case CommonDataPackage.DEFINITION__LANGUAGE_CODE: return CommonDataPackage.ANNOTATION__LANGUAGE_CODE;
				case CommonDataPackage.DEFINITION__CONTENT: return CommonDataPackage.ANNOTATION__CONTENT;
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
				case CommonDataPackage.ANNOTATION__LANGUAGE_CODE: return CommonDataPackage.DEFINITION__LANGUAGE_CODE;
				case CommonDataPackage.ANNOTATION__CONTENT: return CommonDataPackage.DEFINITION__CONTENT;
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
		result.append(", note: ");
		result.append(note);
		result.append(", example: ");
		result.append(example);
		result.append(')');
		return result.toString();
	}

} //DefinitionImpl
