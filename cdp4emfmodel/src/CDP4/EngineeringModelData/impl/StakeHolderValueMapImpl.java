/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.impl.DefinedThingImpl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.Goal;
import CDP4.EngineeringModelData.Requirement;
import CDP4.EngineeringModelData.StakeHolderValueMap;
import CDP4.EngineeringModelData.StakeHolderValueMapSettings;
import CDP4.EngineeringModelData.StakeholderValue;
import CDP4.EngineeringModelData.ValueGroup;

import CDP4.SiteDirectoryData.CategorizableThing;
import CDP4.SiteDirectoryData.Category;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stake Holder Value Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.StakeHolderValueMapImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.StakeHolderValueMapImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.StakeHolderValueMapImpl#getValueGroup <em>Value Group</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.StakeHolderValueMapImpl#getStakeholderValue <em>Stakeholder Value</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.StakeHolderValueMapImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.StakeHolderValueMapImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StakeHolderValueMapImpl extends DefinedThingImpl implements StakeHolderValueMap {
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
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goal;

	/**
	 * The cached value of the '{@link #getValueGroup() <em>Value Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueGroup> valueGroup;

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
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected StakeHolderValueMapSettings settings;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StakeHolderValueMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.STAKE_HOLDER_VALUE_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectResolvingEList<Category>(Category.class, this, EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getGoal() {
		if (goal == null) {
			goal = new EObjectResolvingEList<Goal>(Goal.class, this, EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__GOAL);
		}
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueGroup> getValueGroup() {
		if (valueGroup == null) {
			valueGroup = new EObjectResolvingEList<ValueGroup>(ValueGroup.class, this, EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__VALUE_GROUP);
		}
		return valueGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StakeholderValue> getStakeholderValue() {
		if (stakeholderValue == null) {
			stakeholderValue = new EObjectResolvingEList<StakeholderValue>(StakeholderValue.class, this, EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__STAKEHOLDER_VALUE);
		}
		return stakeholderValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StakeHolderValueMapSettings getSettings() {
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettings(StakeHolderValueMapSettings newSettings, NotificationChain msgs) {
		StakeHolderValueMapSettings oldSettings = settings;
		settings = newSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__SETTINGS, oldSettings, newSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettings(StakeHolderValueMapSettings newSettings) {
		if (newSettings != settings) {
			NotificationChain msgs = null;
			if (settings != null)
				msgs = ((InternalEObject)settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__SETTINGS, null, msgs);
			if (newSettings != null)
				msgs = ((InternalEObject)newSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__SETTINGS, null, msgs);
			msgs = basicSetSettings(newSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__SETTINGS, newSettings, newSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirement() {
		if (requirement == null) {
			requirement = new EObjectResolvingEList<Requirement>(Requirement.class, this, EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__REQUIREMENT);
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__SETTINGS:
				return basicSetSettings(null, msgs);
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
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__CATEGORY:
				return getCategory();
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__GOAL:
				return getGoal();
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__VALUE_GROUP:
				return getValueGroup();
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__STAKEHOLDER_VALUE:
				return getStakeholderValue();
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__SETTINGS:
				return getSettings();
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__REQUIREMENT:
				return getRequirement();
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
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__GOAL:
				getGoal().clear();
				getGoal().addAll((Collection<? extends Goal>)newValue);
				return;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__VALUE_GROUP:
				getValueGroup().clear();
				getValueGroup().addAll((Collection<? extends ValueGroup>)newValue);
				return;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__STAKEHOLDER_VALUE:
				getStakeholderValue().clear();
				getStakeholderValue().addAll((Collection<? extends StakeholderValue>)newValue);
				return;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__SETTINGS:
				setSettings((StakeHolderValueMapSettings)newValue);
				return;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__REQUIREMENT:
				getRequirement().clear();
				getRequirement().addAll((Collection<? extends Requirement>)newValue);
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
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__CATEGORY:
				getCategory().clear();
				return;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__GOAL:
				getGoal().clear();
				return;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__VALUE_GROUP:
				getValueGroup().clear();
				return;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__STAKEHOLDER_VALUE:
				getStakeholderValue().clear();
				return;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__SETTINGS:
				setSettings((StakeHolderValueMapSettings)null);
				return;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__REQUIREMENT:
				getRequirement().clear();
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
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__CATEGORY:
				return category != null && !category.isEmpty();
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__GOAL:
				return goal != null && !goal.isEmpty();
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__VALUE_GROUP:
				return valueGroup != null && !valueGroup.isEmpty();
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__STAKEHOLDER_VALUE:
				return stakeholderValue != null && !stakeholderValue.isEmpty();
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__SETTINGS:
				return settings != null;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__REQUIREMENT:
				return requirement != null && !requirement.isEmpty();
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
				case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__CATEGORY: return SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY;
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
				case SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY: return EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP__CATEGORY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StakeHolderValueMapImpl
