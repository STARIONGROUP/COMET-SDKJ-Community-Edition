/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.DefinedThing;

import CDP4.SiteDirectoryData.CategorizableThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stake Holder Value Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.StakeHolderValueMap#getGoal <em>Goal</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.StakeHolderValueMap#getValueGroup <em>Value Group</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.StakeHolderValueMap#getStakeholderValue <em>Stakeholder Value</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.StakeHolderValueMap#getSettings <em>Settings</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.StakeHolderValueMap#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getStakeHolderValueMap()
 * @model
 * @generated
 */
public interface StakeHolderValueMap extends DefinedThing, CategorizableThing {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getStakeHolderValueMap_Goal()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Goal> getGoal();

	/**
	 * Returns the value of the '<em><b>Value Group</b></em>' reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ValueGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Group</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getStakeHolderValueMap_ValueGroup()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ValueGroup> getValueGroup();

	/**
	 * Returns the value of the '<em><b>Stakeholder Value</b></em>' reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.StakeholderValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stakeholder Value</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getStakeHolderValueMap_StakeholderValue()
	 * @model ordered="false"
	 * @generated
	 */
	EList<StakeholderValue> getStakeholderValue();

	/**
	 * Returns the value of the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings</em>' containment reference.
	 * @see #setSettings(StakeHolderValueMapSettings)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getStakeHolderValueMap_Settings()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StakeHolderValueMapSettings getSettings();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.StakeHolderValueMap#getSettings <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Settings</em>' containment reference.
	 * @see #getSettings()
	 * @generated
	 */
	void setSettings(StakeHolderValueMapSettings value);

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getStakeHolderValueMap_Requirement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Requirement> getRequirement();

} // StakeHolderValueMap
