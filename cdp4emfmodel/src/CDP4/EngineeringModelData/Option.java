/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.DefinedThing;

import CDP4.SiteDirectoryData.CategorizableThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
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
 * representation of an option that is a potential design solution for the system-of-interest being developed in an Iteration of an EngineeringModel
 *     </p>
 * 
 *     <p>
 * Note:&#160;An Option in this context constitutes a design alternative that can be compared with one or more other design alternatives defined in other Options, for example to perform a trade analysis.
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
 *   <li>{@link CDP4.EngineeringModelData.Option#getNestedElement <em>Nested Element</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends DefinedThing, CategorizableThing {
	/**
	 * Returns the value of the '<em><b>Nested Element</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.NestedElement}.
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
	 * collection of NestedElements representing (a part of)&#160;the fully expanded architectural decomposition for this Option
	 *     <p>
	 * Note 1:&#160;NestedElements may be volatile or not, to allow for NestedElements that are only present at runtime or persisted in a data store.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2: Typically a collection of NestedElements is automatically generated at runtime from the implicit composite structure defined by the ElementDefinitions and ElementUsages in this Option.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Element</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getOption_NestedElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<NestedElement> getNestedElement();

} // Option
