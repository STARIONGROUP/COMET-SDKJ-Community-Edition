/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.impl.DefinedThingImpl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.Stakeholder;
import CDP4.EngineeringModelData.StakeholderValue;

import CDP4.SiteDirectoryData.CategorizableThing;
import CDP4.SiteDirectoryData.Category;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.StakeholderImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.StakeholderImpl#getStakeholderValue <em>Stakeholder Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StakeholderImpl extends DefinedThingImpl implements Stakeholder {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

	/**
	 * The cached value of the '{@link #getStakeholderValue() <em>Stakeholder Value</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholderValue()
	 * @generated
	 * @ordered
	 */
	protected EList<StakeholderValue> stakeholderValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StakeholderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.STAKEHOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectResolvingEList<Category>(Category.class, this, EngineeringModelDataPackage.STAKEHOLDER__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StakeholderValue> getStakeholderValue() {
		if (stakeholderValue == null) {
			stakeholderValue = new EObjectResolvingEList<StakeholderValue>(StakeholderValue.class, this, EngineeringModelDataPackage.STAKEHOLDER__STAKEHOLDER_VALUE);
		}
		return stakeholderValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.STAKEHOLDER__CATEGORY:
				return getCategory();
			case EngineeringModelDataPackage.STAKEHOLDER__STAKEHOLDER_VALUE:
				return getStakeholderValue();
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
			case EngineeringModelDataPackage.STAKEHOLDER__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case EngineeringModelDataPackage.STAKEHOLDER__STAKEHOLDER_VALUE:
				getStakeholderValue().clear();
				getStakeholderValue().addAll((Collection<? extends StakeholderValue>)newValue);
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
			case EngineeringModelDataPackage.STAKEHOLDER__CATEGORY:
				getCategory().clear();
				return;
			case EngineeringModelDataPackage.STAKEHOLDER__STAKEHOLDER_VALUE:
				getStakeholderValue().clear();
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
			case EngineeringModelDataPackage.STAKEHOLDER__CATEGORY:
				return category != null && !category.isEmpty();
			case EngineeringModelDataPackage.STAKEHOLDER__STAKEHOLDER_VALUE:
				return stakeholderValue != null && !stakeholderValue.isEmpty();
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
		if (baseClass == CategorizableThing.class) {
			switch (derivedFeatureID) {
				case EngineeringModelDataPackage.STAKEHOLDER__CATEGORY: return SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY;
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
		if (baseClass == CategorizableThing.class) {
			switch (baseFeatureID) {
				case SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY: return EngineeringModelDataPackage.STAKEHOLDER__CATEGORY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StakeholderImpl
