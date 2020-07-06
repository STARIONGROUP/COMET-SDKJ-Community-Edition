/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.DefinedThing;

import CDP4.SiteDirectoryData.CategorizableThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.Stakeholder#getStakeholderValue <em>Stakeholder Value</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getStakeholder()
 * @model
 * @generated
 */
public interface Stakeholder extends DefinedThing, CategorizableThing {
	/**
	 * Returns the value of the '<em><b>Stakeholder Value</b></em>' reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.StakeholderValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stakeholder Value</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getStakeholder_StakeholderValue()
	 * @model ordered="false"
	 * @generated
	 */
	EList<StakeholderValue> getStakeholderValue();

} // Stakeholder
