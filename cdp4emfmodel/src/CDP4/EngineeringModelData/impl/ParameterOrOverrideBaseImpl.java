/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.ParameterOrOverrideBase;
import CDP4.EngineeringModelData.ParameterSubscription;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Or Override Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.ParameterOrOverrideBaseImpl#getParameterSubscription <em>Parameter Subscription</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParameterOrOverrideBaseImpl extends ParameterBaseImpl implements ParameterOrOverrideBase {
	/**
	 * The cached value of the '{@link #getParameterSubscription() <em>Parameter Subscription</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSubscription()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterSubscription> parameterSubscription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterOrOverrideBaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.PARAMETER_OR_OVERRIDE_BASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterSubscription> getParameterSubscription() {
		if (parameterSubscription == null) {
			parameterSubscription = new EObjectContainmentEList<ParameterSubscription>(ParameterSubscription.class, this, EngineeringModelDataPackage.PARAMETER_OR_OVERRIDE_BASE__PARAMETER_SUBSCRIPTION);
		}
		return parameterSubscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringModelDataPackage.PARAMETER_OR_OVERRIDE_BASE__PARAMETER_SUBSCRIPTION:
				return ((InternalEList<?>)getParameterSubscription()).basicRemove(otherEnd, msgs);
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
			case EngineeringModelDataPackage.PARAMETER_OR_OVERRIDE_BASE__PARAMETER_SUBSCRIPTION:
				return getParameterSubscription();
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
			case EngineeringModelDataPackage.PARAMETER_OR_OVERRIDE_BASE__PARAMETER_SUBSCRIPTION:
				getParameterSubscription().clear();
				getParameterSubscription().addAll((Collection<? extends ParameterSubscription>)newValue);
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
			case EngineeringModelDataPackage.PARAMETER_OR_OVERRIDE_BASE__PARAMETER_SUBSCRIPTION:
				getParameterSubscription().clear();
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
			case EngineeringModelDataPackage.PARAMETER_OR_OVERRIDE_BASE__PARAMETER_SUBSCRIPTION:
				return parameterSubscription != null && !parameterSubscription.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterOrOverrideBaseImpl
