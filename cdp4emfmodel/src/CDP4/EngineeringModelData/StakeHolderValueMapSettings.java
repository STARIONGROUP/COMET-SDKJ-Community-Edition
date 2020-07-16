/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.Thing;

import CDP4.SiteDirectoryData.BinaryRelationshipRule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stake Holder Value Map Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.StakeHolderValueMapSettings#getGoalToValueGroupRelationship <em>Goal To Value Group Relationship</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.StakeHolderValueMapSettings#getValueGroupToStakeholderValueRelationship <em>Value Group To Stakeholder Value Relationship</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.StakeHolderValueMapSettings#getStakeholderValueToRequirementRelationship <em>Stakeholder Value To Requirement Relationship</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getStakeHolderValueMapSettings()
 * @model
 * @generated
 */
public interface StakeHolderValueMapSettings extends Thing {
	/**
	 * Returns the value of the '<em><b>Goal To Value Group Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal To Value Group Relationship</em>' reference.
	 * @see #setGoalToValueGroupRelationship(BinaryRelationshipRule)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getStakeHolderValueMapSettings_GoalToValueGroupRelationship()
	 * @model ordered="false"
	 * @generated
	 */
	BinaryRelationshipRule getGoalToValueGroupRelationship();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.StakeHolderValueMapSettings#getGoalToValueGroupRelationship <em>Goal To Value Group Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal To Value Group Relationship</em>' reference.
	 * @see #getGoalToValueGroupRelationship()
	 * @generated
	 */
	void setGoalToValueGroupRelationship(BinaryRelationshipRule value);

	/**
	 * Returns the value of the '<em><b>Value Group To Stakeholder Value Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Group To Stakeholder Value Relationship</em>' reference.
	 * @see #setValueGroupToStakeholderValueRelationship(BinaryRelationshipRule)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getStakeHolderValueMapSettings_ValueGroupToStakeholderValueRelationship()
	 * @model ordered="false"
	 * @generated
	 */
	BinaryRelationshipRule getValueGroupToStakeholderValueRelationship();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.StakeHolderValueMapSettings#getValueGroupToStakeholderValueRelationship <em>Value Group To Stakeholder Value Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Group To Stakeholder Value Relationship</em>' reference.
	 * @see #getValueGroupToStakeholderValueRelationship()
	 * @generated
	 */
	void setValueGroupToStakeholderValueRelationship(BinaryRelationshipRule value);

	/**
	 * Returns the value of the '<em><b>Stakeholder Value To Requirement Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stakeholder Value To Requirement Relationship</em>' reference.
	 * @see #setStakeholderValueToRequirementRelationship(BinaryRelationshipRule)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getStakeHolderValueMapSettings_StakeholderValueToRequirementRelationship()
	 * @model ordered="false"
	 * @generated
	 */
	BinaryRelationshipRule getStakeholderValueToRequirementRelationship();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.StakeHolderValueMapSettings#getStakeholderValueToRequirementRelationship <em>Stakeholder Value To Requirement Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stakeholder Value To Requirement Relationship</em>' reference.
	 * @see #getStakeholderValueToRequirementRelationship()
	 * @generated
	 */
	void setStakeholderValueToRequirementRelationship(BinaryRelationshipRule value);

} // StakeHolderValueMapSettings
