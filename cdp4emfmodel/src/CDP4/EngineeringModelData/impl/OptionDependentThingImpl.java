/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.Option;
import CDP4.EngineeringModelData.OptionDependentThing;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option Dependent Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.OptionDependentThingImpl#getExcludeOption <em>Exclude Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OptionDependentThingImpl extends MinimalEObjectImpl.Container implements OptionDependentThing {
	/**
	 * The cached value of the '{@link #getExcludeOption() <em>Exclude Option</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeOption()
	 * @generated
	 * @ordered
	 */
	protected EList<Option> excludeOption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionDependentThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.OPTION_DEPENDENT_THING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getExcludeOption() {
		if (excludeOption == null) {
			excludeOption = new EObjectResolvingEList<Option>(Option.class, this, EngineeringModelDataPackage.OPTION_DEPENDENT_THING__EXCLUDE_OPTION);
		}
		return excludeOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.OPTION_DEPENDENT_THING__EXCLUDE_OPTION:
				return getExcludeOption();
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
			case EngineeringModelDataPackage.OPTION_DEPENDENT_THING__EXCLUDE_OPTION:
				getExcludeOption().clear();
				getExcludeOption().addAll((Collection<? extends Option>)newValue);
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
			case EngineeringModelDataPackage.OPTION_DEPENDENT_THING__EXCLUDE_OPTION:
				getExcludeOption().clear();
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
			case EngineeringModelDataPackage.OPTION_DEPENDENT_THING__EXCLUDE_OPTION:
				return excludeOption != null && !excludeOption.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OptionDependentThingImpl
