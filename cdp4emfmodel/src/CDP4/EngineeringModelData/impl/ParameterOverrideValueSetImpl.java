/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.ParameterOverrideValueSet;
import CDP4.EngineeringModelData.ParameterValueSet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Override Value Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterOverrideValueSetImpl#getParameterValueSet <em>Parameter Value Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterOverrideValueSetImpl extends ParameterValueSetBaseImpl implements ParameterOverrideValueSet {
	/**
	 * The cached value of the '{@link #getParameterValueSet() <em>Parameter Value Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValueSet()
	 * @generated
	 * @ordered
	 */
	protected ParameterValueSet parameterValueSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterOverrideValueSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.PARAMETER_OVERRIDE_VALUE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValueSet getParameterValueSet() {
		if (parameterValueSet != null && parameterValueSet.eIsProxy()) {
			InternalEObject oldParameterValueSet = (InternalEObject)parameterValueSet;
			parameterValueSet = (ParameterValueSet)eResolveProxy(oldParameterValueSet);
			if (parameterValueSet != oldParameterValueSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.PARAMETER_OVERRIDE_VALUE_SET__PARAMETER_VALUE_SET, oldParameterValueSet, parameterValueSet));
			}
		}
		return parameterValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterValueSet basicGetParameterValueSet() {
		return parameterValueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterValueSet(ParameterValueSet newParameterValueSet) {
		ParameterValueSet oldParameterValueSet = parameterValueSet;
		parameterValueSet = newParameterValueSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.PARAMETER_OVERRIDE_VALUE_SET__PARAMETER_VALUE_SET, oldParameterValueSet, parameterValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.PARAMETER_OVERRIDE_VALUE_SET__PARAMETER_VALUE_SET:
				if (resolve) return getParameterValueSet();
				return basicGetParameterValueSet();
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
			case EngineeringModelDataPackage.PARAMETER_OVERRIDE_VALUE_SET__PARAMETER_VALUE_SET:
				setParameterValueSet((ParameterValueSet)newValue);
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
			case EngineeringModelDataPackage.PARAMETER_OVERRIDE_VALUE_SET__PARAMETER_VALUE_SET:
				setParameterValueSet((ParameterValueSet)null);
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
			case EngineeringModelDataPackage.PARAMETER_OVERRIDE_VALUE_SET__PARAMETER_VALUE_SET:
				return parameterValueSet != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterOverrideValueSetImpl
