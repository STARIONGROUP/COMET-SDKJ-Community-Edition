/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;
import CDP4.CommonData.Thing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Finite State</b></em>'.
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
 * representation of an actual finite state in an ActualFiniteStateList
 *     </p>
 * 
 *     <p>
 * Note:&#160;Such an actual finite state may is composed of as many possible finite states as there are PossibleFiniteStateLists associated to the containing ActualFiniteStateList of this ActualFiniteState. An ActualFiniteState can be associated with a ParameterValueSet for a Parameter (or ParameterOverride) that has a <i>stateDependence</i>, as well as for a ParameterSubscriptionValueSet for such a Parameter or ParameterOverride.
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
 *   <li>{@link CDP4.EngineeringModelData.ActualFiniteState#getPossibleState <em>Possible State</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ActualFiniteState#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getActualFiniteState()
 * @model
 * @generated
 */
public interface ActualFiniteState extends Thing, NamedThing, OwnedThing, ShortNamedThing {
	/**
	 * Returns the value of the '<em><b>Possible State</b></em>' reference list.
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
	 * set of PossibleFiniteStates that define an actual finite state
	 *     <p>
	 * Note:&#160;The set must include one PossibleFiniteState from each of the PossibleFiniteStateLists that is referenced by the containing ActualFiniteStateList.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Possible State</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getActualFiniteState_PossibleState()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<PossibleFiniteState> getPossibleState();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CDP4.EngineeringModelData.ActualFiniteStateKind}.
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
	 * assertion of the kind of ActualFiniteState
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;See definitions for ActualFiniteStateKind.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CDP4.EngineeringModelData.ActualFiniteStateKind
	 * @see #setKind(ActualFiniteStateKind)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getActualFiniteState_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActualFiniteStateKind getKind();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ActualFiniteState#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CDP4.EngineeringModelData.ActualFiniteStateKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ActualFiniteStateKind value);

} // ActualFiniteState
