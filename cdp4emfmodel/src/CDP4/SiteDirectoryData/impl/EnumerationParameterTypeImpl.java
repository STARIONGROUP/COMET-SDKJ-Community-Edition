/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.EnumerationParameterType;
import CDP4.SiteDirectoryData.EnumerationValueDefinition;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.EnumerationParameterTypeImpl#getAllowMultiSelect <em>Allow Multi Select</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.EnumerationParameterTypeImpl#getValueDefinition <em>Value Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationParameterTypeImpl extends ScalarParameterTypeImpl implements EnumerationParameterType {
	/**
	 * The default value of the '{@link #getAllowMultiSelect() <em>Allow Multi Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMultiSelect()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_MULTI_SELECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowMultiSelect() <em>Allow Multi Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMultiSelect()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowMultiSelect = ALLOW_MULTI_SELECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValueDefinition() <em>Value Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationValueDefinition> valueDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationParameterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.ENUMERATION_PARAMETER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAllowMultiSelect() {
		return allowMultiSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowMultiSelect(Boolean newAllowMultiSelect) {
		Boolean oldAllowMultiSelect = allowMultiSelect;
		allowMultiSelect = newAllowMultiSelect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.ENUMERATION_PARAMETER_TYPE__ALLOW_MULTI_SELECT, oldAllowMultiSelect, allowMultiSelect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationValueDefinition> getValueDefinition() {
		if (valueDefinition == null) {
			valueDefinition = new EObjectContainmentEList<EnumerationValueDefinition>(EnumerationValueDefinition.class, this, SiteDirectoryDataPackage.ENUMERATION_PARAMETER_TYPE__VALUE_DEFINITION);
		}
		return valueDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SiteDirectoryDataPackage.ENUMERATION_PARAMETER_TYPE__VALUE_DEFINITION:
				return ((InternalEList<?>)getValueDefinition()).basicRemove(otherEnd, msgs);
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
			case SiteDirectoryDataPackage.ENUMERATION_PARAMETER_TYPE__ALLOW_MULTI_SELECT:
				return getAllowMultiSelect();
			case SiteDirectoryDataPackage.ENUMERATION_PARAMETER_TYPE__VALUE_DEFINITION:
				return getValueDefinition();
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
			case SiteDirectoryDataPackage.ENUMERATION_PARAMETER_TYPE__ALLOW_MULTI_SELECT:
				setAllowMultiSelect((Boolean)newValue);
				return;
			case SiteDirectoryDataPackage.ENUMERATION_PARAMETER_TYPE__VALUE_DEFINITION:
				getValueDefinition().clear();
				getValueDefinition().addAll((Collection<? extends EnumerationValueDefinition>)newValue);
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
			case SiteDirectoryDataPackage.ENUMERATION_PARAMETER_TYPE__ALLOW_MULTI_SELECT:
				setAllowMultiSelect(ALLOW_MULTI_SELECT_EDEFAULT);
				return;
			case SiteDirectoryDataPackage.ENUMERATION_PARAMETER_TYPE__VALUE_DEFINITION:
				getValueDefinition().clear();
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
			case SiteDirectoryDataPackage.ENUMERATION_PARAMETER_TYPE__ALLOW_MULTI_SELECT:
				return ALLOW_MULTI_SELECT_EDEFAULT == null ? allowMultiSelect != null : !ALLOW_MULTI_SELECT_EDEFAULT.equals(allowMultiSelect);
			case SiteDirectoryDataPackage.ENUMERATION_PARAMETER_TYPE__VALUE_DEFINITION:
				return valueDefinition != null && !valueDefinition.isEmpty();
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
		result.append(" (allowMultiSelect: ");
		result.append(allowMultiSelect);
		result.append(')');
		return result.toString();
	}

} //EnumerationParameterTypeImpl
