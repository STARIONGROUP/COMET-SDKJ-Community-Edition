/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.DefinedThing;

import CDP4.SiteDirectoryData.CategorizableThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Container</b></em>'.
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
 *     abstract superclass that serves as a common reference to both 
 *     RequirementsSpecification and RequirementsGroup
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
 *   <li>{@link CDP4.EngineeringModelData.RequirementsContainer#getGroup <em>Group</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.RequirementsContainer#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRequirementsContainer()
 * @model abstract="true"
 * @generated
 */
public interface RequirementsContainer extends DefinedThing, CategorizableThing, OwnedThing {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.RequirementsGroup}.
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
	 * collection of RequirementsGroups contained by this RequirementsSpecification or RequirementsGroup
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRequirementsContainer_Group()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RequirementsGroup> getGroup();

	/**
	 * Returns the value of the '<em><b>Parameter Value</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.RequirementsContainerParameterValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Value</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getRequirementsContainer_ParameterValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RequirementsContainerParameterValue> getParameterValue();

} // RequirementsContainer
