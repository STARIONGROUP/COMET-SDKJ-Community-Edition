/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.NamedThing;
import CDP4.CommonData.Thing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Group</b></em>'.
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
 * representation of a group of Parameters within an ElementDefinition
 *     </p>
 * 
 *     <p>
 * Note:&#160;Grouping of parameters is useful in order to manage and facilitate usage of large sets of parameters. Groups may be nested into a hierarchical structure through the <i>containingGroup</i> property.
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
 *   <li>{@link CDP4.EngineeringModelData.ParameterGroup#getContainingGroup <em>Containing Group</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterGroup()
 * @model
 * @generated
 */
public interface ParameterGroup extends Thing, NamedThing {
	/**
	 * Returns the value of the '<em><b>Containing Group</b></em>' reference.
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
	 * reference to a containing ParameterGroup for this ParameterGroup
	 *     </p>
	 * 
	 *     <p>
	 * Note 1:&#160;This property allows creating an arbitrarily deeply nested grouping hierarchy for Parameters. The grouping must be acyclic.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;Leaving this property empty implies that the ParameterGroup is directly attached to the containing ElementDefinition.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Containing Group</em>' reference.
	 * @see #setContainingGroup(ParameterGroup)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getParameterGroup_ContainingGroup()
	 * @model ordered="false"
	 * @generated
	 */
	ParameterGroup getContainingGroup();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ParameterGroup#getContainingGroup <em>Containing Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Group</em>' reference.
	 * @see #getContainingGroup()
	 * @generated
	 */
	void setContainingGroup(ParameterGroup value);

} // ParameterGroup
