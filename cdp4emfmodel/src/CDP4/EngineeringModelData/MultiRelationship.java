/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.Thing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Relationship</b></em>'.
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
 * representation of a relationship between multiple Things
 *     </p>
 * 
 *     <p>
 * Note:&#160;This allows very generic relationships to be defined between any set of Things. In order to make its use controlled and meaningful the semantics of the relationship should be defined by making the MultiRelationship a member of a Category and defining an applicable MultiRelationshipRule.
 *     </p>
 * 
 *     <p>
 * Note 2:&#160;MultiRelationship is a similar concept as what is, in computer science or data modelling, often called an &quot;n-ary&quot; relationship, relation or association.
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
 *   <li>{@link CDP4.EngineeringModelData.MultiRelationship#getRelatedThing <em>Related Thing</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getMultiRelationship()
 * @model
 * @generated
 */
public interface MultiRelationship extends Relationship {
	/**
	 * Returns the value of the '<em><b>Related Thing</b></em>' reference list.
	 * The list contents are of type {@link CDP4.CommonData.Thing}.
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
	 * set of Things that are related by this MultiRelationship
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Thing</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getMultiRelationship_RelatedThing()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Thing> getRelatedThing();

} // MultiRelationship
