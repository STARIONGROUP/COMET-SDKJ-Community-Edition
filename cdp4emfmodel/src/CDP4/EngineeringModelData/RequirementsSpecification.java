/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.DeprecatableThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Specification</b></em>'.
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
 *       representation of a requirements specification
 *     </p>
 * 
 *     <p>
 *       Note:&#160;Requirements in a RequirementsSpecification may be grouped in a 
 *       hierarchy through a RequirementsGroup structure.
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
 *   <li>{@link CDP4.EngineeringModelData.RequirementsSpecification#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRequirementsSpecification()
 * @model
 * @generated
 */
public interface RequirementsSpecification extends RequirementsContainer, DeprecatableThing {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.Requirement}.
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
	 * collection of Requirements in this RequirementsSpecification
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRequirementsSpecification_Requirement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Requirement> getRequirement();

} // RequirementsSpecification
