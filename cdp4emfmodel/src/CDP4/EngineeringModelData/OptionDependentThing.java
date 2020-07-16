/**
 */
package CDP4.EngineeringModelData;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Dependent Thing</b></em>'.
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
 *     representation of a Thing that can be included in or excluded from one or     more     Options
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
 *   <li>{@link CDP4.EngineeringModelData.OptionDependentThing#getExcludeOption <em>Exclude Option</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getOptionDependentThing()
 * @model abstract="true"
 * @generated
 */
public interface OptionDependentThing extends EObject {
	/**
	 * Returns the value of the '<em><b>Exclude Option</b></em>' reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.Option}.
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
	 * reference to zero or more Options from which this OptionDependentThing is excluded
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;By default all OptionDependentThings are included in all Options in an EngineeringModel. Only the exclusions are recorded in the data model because this is the most efficient way of storing and handling the option dependency. In client applications it may be more intuitive to show the included Options, but that is a simple transformation.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude Option</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getOptionDependentThing_ExcludeOption()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Option> getExcludeOption();

} // OptionDependentThing
