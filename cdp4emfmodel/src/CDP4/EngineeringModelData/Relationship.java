/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.Thing;

import CDP4.SiteDirectoryData.CategorizableThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
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
 * representation of a relationship between two or more Things
 *     </p>
 * 
 *     <p>
 * Note:&#160;This allows very generic relationships to be defined in an E-TM-10-25 compatible dataset. In order to make its use controlled and meaningful, the semantics of the relationship should be defined by making the Relationship a member of a Category and defining an applicable BinaryRelationshipRule or MultiRelationshipRule.
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
 *   <li>{@link CDP4.EngineeringModelData.Relationship#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRelationship()
 * @model abstract="true"
 * @generated
 */
public interface Relationship extends Thing, CategorizableThing, OwnedThing {
	/**
	 * Returns the value of the '<em><b>Parameter Value</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.RelationshipParameterValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Value</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRelationship_ParameterValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RelationshipParameterValue> getParameterValue();

} // Relationship
