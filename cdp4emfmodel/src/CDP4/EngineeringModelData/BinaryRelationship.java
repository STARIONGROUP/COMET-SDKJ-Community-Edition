/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.Thing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Relationship</b></em>'.
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
 * representation of a relationship between exactly two Things
 *     </p>
 * 
 *     <p>
 * Note:&#160;This allows very generic relationships to be defined between any two Things. In order to make its use controlled and meaningful the semantics of the relationship should be defined by making the BinaryRelationship a member of a Category and defining an applicable BinaryRelationshipRule.
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
 *   <li>{@link CDP4.EngineeringModelData.BinaryRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.BinaryRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getBinaryRelationship()
 * @model
 * @generated
 */
public interface BinaryRelationship extends Relationship {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
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
	 * reference to the source Thing of this BinaryRelationship
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Thing)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getBinaryRelationship_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Thing getSource();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.BinaryRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Thing value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
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
	 * reference to the target Thing of this BinaryRelationship
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Thing)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getBinaryRelationship_Target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Thing getTarget();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.BinaryRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Thing value);

} // BinaryRelationship
