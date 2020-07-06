/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;
import CDP4.CommonData.Thing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Finite State List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <html>
 *   <head>
 * 		<style>
 * 			p {padding:0px; margin:0px;}
 * 		</style>
 * 	</head>
 *   <body>
 *     <p>
 * representation of a set of actual finite states that can be used to define a finite state dependence for a Parameter
 * 
 *     </p>
 * 
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.ActualFiniteStateList#getPossibleFiniteStateList <em>Possible Finite State List</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ActualFiniteStateList#getActualState <em>Actual State</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getActualFiniteStateList()
 * @model
 * @generated
 */
public interface ActualFiniteStateList extends Thing, NamedThing, OptionDependentThing, OwnedThing, ShortNamedThing {
	/**
	 * Returns the value of the '<em><b>Possible Finite State List</b></em>' reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.PossibleFiniteStateList}.
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
	 * definition of an ordered set of PossibleFiniteStateLists that define the basis for this ActualFiniteStateList
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;Assume that PossibleFiniteStateLists have been defined for &quot;MissionPhase&quot; and &quot;PowerMode&quot;. Now an ActualFiniteStateList could be created that defines &quot;MissionPhase&quot; / &quot;PowerMode&quot; combinations as ActualFiniteStates. A&#160;Parameter may then reference such an ActualFiniteStateList through its <i>stateDependence</i> property, and subsequently ParameterValueSets (and where applicable ParameterSubscriptionValueSets)&#160;for each of the relevant ActualFiniteStates can be created.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Possible Finite State List</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getActualFiniteStateList_PossibleFiniteStateList()
	 * @model required="true"
	 * @generated
	 */
	EList<PossibleFiniteStateList> getPossibleFiniteStateList();

	/**
	 * Returns the value of the '<em><b>Actual State</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ActualFiniteState}.
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
	 * representation of the actual finite states defined for this ActualFiniteStateList
	 *     </p>
	 * 
	 *     <p>
	 * Note 1:&#160;The kind property on ActualFiniteState determines whether an actual finite state is mandatory, optional or forbidden for the <i>valueSet</i> of a Parameter or ParameterOverride.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;It is not required to define an ActualFiniteState for all possible combinations of PossibleFiniteState permitted by the associated PossibleFiniteStateLists. However at least one MANDATORY&#160;ActualFiniteState should be defined (through the <i>kind</i> property). Any combinations that are not explicitly defined are by default regarded as OPTIONAL. Implementations may add such combinations on the fly when a user desires to use them.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual State</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getActualFiniteStateList_ActualState()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ActualFiniteState> getActualState();

} // ActualFiniteStateList
