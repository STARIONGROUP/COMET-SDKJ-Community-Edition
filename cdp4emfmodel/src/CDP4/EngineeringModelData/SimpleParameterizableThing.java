/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.DefinedThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Parameterizable Thing</b></em>'.
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
 * representation of a Thing that can be characterized by one or more parameters with values
 *     </p>
 * 
 *     <p>
 * Note:&#160;In this data model a distinction is made between ElementDefinitions, ElementUsages and NestedElements that are characterized by Parameters with ParameterValueSets using an elaborate structure to support a multi-disciplinary concurrent engineering process, and other concepts that may be characterized by a ParameterType and a SimpleParameterValue. The latter are ParameterizableThings.
 *     </p>
 * 
 *     <p>
 * Example:&#160;An example of a SimpleParameterizableThing is a Requirement.
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
 *   <li>{@link CDP4.EngineeringModelData.SimpleParameterizableThing#getParameterValue <em>Parameter Value</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getSimpleParameterizableThing()
 * @model abstract="true"
 * @generated
 */
public interface SimpleParameterizableThing extends DefinedThing, OwnedThing {
	/**
	 * Returns the value of the '<em><b>Parameter Value</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.SimpleParameterValue}.
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
	 * collection of parameters with values for this SimpleParameterizableThing
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Value</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getSimpleParameterizableThing_ParameterValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SimpleParameterValue> getParameterValue();

} // SimpleParameterizableThing
