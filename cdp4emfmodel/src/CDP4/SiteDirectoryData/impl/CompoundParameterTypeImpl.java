/**
 */
package CDP4.SiteDirectoryData.impl;

import CDP4.SiteDirectoryData.CompoundParameterType;
import CDP4.SiteDirectoryData.ParameterTypeComponent;
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
 * An implementation of the model object '<em><b>Compound Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.impl.CompoundParameterTypeImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.impl.CompoundParameterTypeImpl#getIsFinalized <em>Is Finalized</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompoundParameterTypeImpl extends ParameterTypeImpl implements CompoundParameterType {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterTypeComponent> component;

	/**
	 * The default value of the '{@link #getIsFinalized() <em>Is Finalized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFinalized()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_FINALIZED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsFinalized() <em>Is Finalized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFinalized()
	 * @generated
	 * @ordered
	 */
	protected Boolean isFinalized = IS_FINALIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundParameterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SiteDirectoryDataPackage.Literals.COMPOUND_PARAMETER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterTypeComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<ParameterTypeComponent>(ParameterTypeComponent.class, this, SiteDirectoryDataPackage.COMPOUND_PARAMETER_TYPE__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsFinalized() {
		return isFinalized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinalized(Boolean newIsFinalized) {
		Boolean oldIsFinalized = isFinalized;
		isFinalized = newIsFinalized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SiteDirectoryDataPackage.COMPOUND_PARAMETER_TYPE__IS_FINALIZED, oldIsFinalized, isFinalized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SiteDirectoryDataPackage.COMPOUND_PARAMETER_TYPE__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
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
			case SiteDirectoryDataPackage.COMPOUND_PARAMETER_TYPE__COMPONENT:
				return getComponent();
			case SiteDirectoryDataPackage.COMPOUND_PARAMETER_TYPE__IS_FINALIZED:
				return getIsFinalized();
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
			case SiteDirectoryDataPackage.COMPOUND_PARAMETER_TYPE__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends ParameterTypeComponent>)newValue);
				return;
			case SiteDirectoryDataPackage.COMPOUND_PARAMETER_TYPE__IS_FINALIZED:
				setIsFinalized((Boolean)newValue);
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
			case SiteDirectoryDataPackage.COMPOUND_PARAMETER_TYPE__COMPONENT:
				getComponent().clear();
				return;
			case SiteDirectoryDataPackage.COMPOUND_PARAMETER_TYPE__IS_FINALIZED:
				setIsFinalized(IS_FINALIZED_EDEFAULT);
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
			case SiteDirectoryDataPackage.COMPOUND_PARAMETER_TYPE__COMPONENT:
				return component != null && !component.isEmpty();
			case SiteDirectoryDataPackage.COMPOUND_PARAMETER_TYPE__IS_FINALIZED:
				return IS_FINALIZED_EDEFAULT == null ? isFinalized != null : !IS_FINALIZED_EDEFAULT.equals(isFinalized);
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
		result.append(" (isFinalized: ");
		result.append(isFinalized);
		result.append(')');
		return result.toString();
	}

} //CompoundParameterTypeImpl
