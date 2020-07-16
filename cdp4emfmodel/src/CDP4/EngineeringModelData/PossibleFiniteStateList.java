/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.DefinedThing;

import CDP4.SiteDirectoryData.CategorizableThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Possible Finite State List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <html>
 *   <head>
 * 		<style>
 * 			p {padding:0px; margin:0px;}
 * 		</style>
 * 	</head>
 * 
 *   <body>
 *     <p>
 *       specialization of CategorizableThing that defines a finite ordered 
 *       collection of one or more named States
 *     </p>
 * 
 *     <p>
 *       Note:&#160;A PossibleFiniteStateList may form the basis for later definition of a 
 *       finite state machine.
 *     </p>
 * 
 *     <p>
 *       Example 1: A&#160;PossibleFiniteStateList may be used to define &quot;MissionPhases&quot; with 
 *       the sequence of states &quot;PreLaunch&quot;, &quot;Launch&quot;, &#160;&quot;Ascent&quot;, 
 *       &#160;&quot;TransferOrbit&quot;, &quot;OperationalOrbit&quot;.
 *     </p>
 * 
 *     <p>
 *       Example 2:&#160;A PossibleFiniteStateList may be used to define &quot;SpacecraftModes&quot; 
 *       with states &quot;SafeMode&quot;, &quot;Hibernation&quot;, &quot;Operation&quot;.
 *     </p>
 * 
 *   </body>
 * 
 * </html>
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.PossibleFiniteStateList#getPossibleState <em>Possible State</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.PossibleFiniteStateList#getDefaultState <em>Default State</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getPossibleFiniteStateList()
 * @model
 * @generated
 */
public interface PossibleFiniteStateList extends DefinedThing, CategorizableThing, OwnedThing {
	/**
	 * Returns the value of the '<em><b>Possible State</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.PossibleFiniteState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 * ordered collection of finite states for this PossibleFiniteStateList
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Possible State</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getPossibleFiniteStateList_PossibleState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PossibleFiniteState> getPossibleState();

	/**
	 * Returns the value of the '<em><b>Default State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 *   <body>
	 *     <p>
	 * reference to the PossibleFiniteState that is considered the default state for this PossibleFiniteStateList
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The referenced PossibleFiniteState must be one of the possibleState of this PossibleFiniteStateList.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default State</em>' reference.
	 * @see #setDefaultState(PossibleFiniteState)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getPossibleFiniteStateList_DefaultState()
	 * @model ordered="false"
	 * @generated
	 */
	PossibleFiniteState getDefaultState();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.PossibleFiniteStateList#getDefaultState <em>Default State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default State</em>' reference.
	 * @see #getDefaultState()
	 * @generated
	 */
	void setDefaultState(PossibleFiniteState value);

} // PossibleFiniteStateList
