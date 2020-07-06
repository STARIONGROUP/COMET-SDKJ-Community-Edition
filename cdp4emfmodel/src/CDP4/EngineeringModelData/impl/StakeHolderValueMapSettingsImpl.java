/**
 */
package CDP4.EngineeringModelData.impl;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.StakeHolderValueMapSettings;

import CDP4.SiteDirectoryData.BinaryRelationshipRule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stake Holder Value Map Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.impl.StakeHolderValueMapSettingsImpl#getGoalToValueGroupRelationship <em>Goal To Value Group Relationship</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.StakeHolderValueMapSettingsImpl#getValueGroupToStakeholderValueRelationship <em>Value Group To Stakeholder Value Relationship</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.impl.StakeHolderValueMapSettingsImpl#getStakeholderValueToRequirementRelationship <em>Stakeholder Value To Requirement Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StakeHolderValueMapSettingsImpl extends ThingImpl implements StakeHolderValueMapSettings {
	/**
	 * The cached value of the '{@link #getGoalToValueGroupRelationship() <em>Goal To Value Group Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalToValueGroupRelationship()
	 * @generated
	 * @ordered
	 */
	protected BinaryRelationshipRule goalToValueGroupRelationship;

	/**
	 * The cached value of the '{@link #getValueGroupToStakeholderValueRelationship() <em>Value Group To Stakeholder Value Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueGroupToStakeholderValueRelationship()
	 * @generated
	 * @ordered
	 */
	protected BinaryRelationshipRule valueGroupToStakeholderValueRelationship;

	/**
	 * The cached value of the '{@link #getStakeholderValueToRequirementRelationship() <em>Stakeholder Value To Requirement Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholderValueToRequirementRelationship()
	 * @generated
	 * @ordered
	 */
	protected BinaryRelationshipRule stakeholderValueToRequirementRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StakeHolderValueMapSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EngineeringModelDataPackage.Literals.STAKE_HOLDER_VALUE_MAP_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryRelationshipRule getGoalToValueGroupRelationship() {
		if (goalToValueGroupRelationship != null && goalToValueGroupRelationship.eIsProxy()) {
			InternalEObject oldGoalToValueGroupRelationship = (InternalEObject)goalToValueGroupRelationship;
			goalToValueGroupRelationship = (BinaryRelationshipRule)eResolveProxy(oldGoalToValueGroupRelationship);
			if (goalToValueGroupRelationship != oldGoalToValueGroupRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__GOAL_TO_VALUE_GROUP_RELATIONSHIP, oldGoalToValueGroupRelationship, goalToValueGroupRelationship));
			}
		}
		return goalToValueGroupRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryRelationshipRule basicGetGoalToValueGroupRelationship() {
		return goalToValueGroupRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalToValueGroupRelationship(BinaryRelationshipRule newGoalToValueGroupRelationship) {
		BinaryRelationshipRule oldGoalToValueGroupRelationship = goalToValueGroupRelationship;
		goalToValueGroupRelationship = newGoalToValueGroupRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__GOAL_TO_VALUE_GROUP_RELATIONSHIP, oldGoalToValueGroupRelationship, goalToValueGroupRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryRelationshipRule getValueGroupToStakeholderValueRelationship() {
		if (valueGroupToStakeholderValueRelationship != null && valueGroupToStakeholderValueRelationship.eIsProxy()) {
			InternalEObject oldValueGroupToStakeholderValueRelationship = (InternalEObject)valueGroupToStakeholderValueRelationship;
			valueGroupToStakeholderValueRelationship = (BinaryRelationshipRule)eResolveProxy(oldValueGroupToStakeholderValueRelationship);
			if (valueGroupToStakeholderValueRelationship != oldValueGroupToStakeholderValueRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__VALUE_GROUP_TO_STAKEHOLDER_VALUE_RELATIONSHIP, oldValueGroupToStakeholderValueRelationship, valueGroupToStakeholderValueRelationship));
			}
		}
		return valueGroupToStakeholderValueRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryRelationshipRule basicGetValueGroupToStakeholderValueRelationship() {
		return valueGroupToStakeholderValueRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueGroupToStakeholderValueRelationship(BinaryRelationshipRule newValueGroupToStakeholderValueRelationship) {
		BinaryRelationshipRule oldValueGroupToStakeholderValueRelationship = valueGroupToStakeholderValueRelationship;
		valueGroupToStakeholderValueRelationship = newValueGroupToStakeholderValueRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__VALUE_GROUP_TO_STAKEHOLDER_VALUE_RELATIONSHIP, oldValueGroupToStakeholderValueRelationship, valueGroupToStakeholderValueRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryRelationshipRule getStakeholderValueToRequirementRelationship() {
		if (stakeholderValueToRequirementRelationship != null && stakeholderValueToRequirementRelationship.eIsProxy()) {
			InternalEObject oldStakeholderValueToRequirementRelationship = (InternalEObject)stakeholderValueToRequirementRelationship;
			stakeholderValueToRequirementRelationship = (BinaryRelationshipRule)eResolveProxy(oldStakeholderValueToRequirementRelationship);
			if (stakeholderValueToRequirementRelationship != oldStakeholderValueToRequirementRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__STAKEHOLDER_VALUE_TO_REQUIREMENT_RELATIONSHIP, oldStakeholderValueToRequirementRelationship, stakeholderValueToRequirementRelationship));
			}
		}
		return stakeholderValueToRequirementRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryRelationshipRule basicGetStakeholderValueToRequirementRelationship() {
		return stakeholderValueToRequirementRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStakeholderValueToRequirementRelationship(BinaryRelationshipRule newStakeholderValueToRequirementRelationship) {
		BinaryRelationshipRule oldStakeholderValueToRequirementRelationship = stakeholderValueToRequirementRelationship;
		stakeholderValueToRequirementRelationship = newStakeholderValueToRequirementRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__STAKEHOLDER_VALUE_TO_REQUIREMENT_RELATIONSHIP, oldStakeholderValueToRequirementRelationship, stakeholderValueToRequirementRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__GOAL_TO_VALUE_GROUP_RELATIONSHIP:
				if (resolve) return getGoalToValueGroupRelationship();
				return basicGetGoalToValueGroupRelationship();
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__VALUE_GROUP_TO_STAKEHOLDER_VALUE_RELATIONSHIP:
				if (resolve) return getValueGroupToStakeholderValueRelationship();
				return basicGetValueGroupToStakeholderValueRelationship();
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__STAKEHOLDER_VALUE_TO_REQUIREMENT_RELATIONSHIP:
				if (resolve) return getStakeholderValueToRequirementRelationship();
				return basicGetStakeholderValueToRequirementRelationship();
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
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__GOAL_TO_VALUE_GROUP_RELATIONSHIP:
				setGoalToValueGroupRelationship((BinaryRelationshipRule)newValue);
				return;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__VALUE_GROUP_TO_STAKEHOLDER_VALUE_RELATIONSHIP:
				setValueGroupToStakeholderValueRelationship((BinaryRelationshipRule)newValue);
				return;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__STAKEHOLDER_VALUE_TO_REQUIREMENT_RELATIONSHIP:
				setStakeholderValueToRequirementRelationship((BinaryRelationshipRule)newValue);
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
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__GOAL_TO_VALUE_GROUP_RELATIONSHIP:
				setGoalToValueGroupRelationship((BinaryRelationshipRule)null);
				return;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__VALUE_GROUP_TO_STAKEHOLDER_VALUE_RELATIONSHIP:
				setValueGroupToStakeholderValueRelationship((BinaryRelationshipRule)null);
				return;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__STAKEHOLDER_VALUE_TO_REQUIREMENT_RELATIONSHIP:
				setStakeholderValueToRequirementRelationship((BinaryRelationshipRule)null);
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
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__GOAL_TO_VALUE_GROUP_RELATIONSHIP:
				return goalToValueGroupRelationship != null;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__VALUE_GROUP_TO_STAKEHOLDER_VALUE_RELATIONSHIP:
				return valueGroupToStakeholderValueRelationship != null;
			case EngineeringModelDataPackage.STAKE_HOLDER_VALUE_MAP_SETTINGS__STAKEHOLDER_VALUE_TO_REQUIREMENT_RELATIONSHIP:
				return stakeholderValueToRequirementRelationship != null;
		}
		return super.eIsSet(featureID);
	}

} //StakeHolderValueMapSettingsImpl
