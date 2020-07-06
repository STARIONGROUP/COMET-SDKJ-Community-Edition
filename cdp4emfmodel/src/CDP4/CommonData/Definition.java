/**
 */
package CDP4.CommonData;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
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
 * representation of a textual definition in a given natural language
 *     </p>
 * 
 *     <p>
 * Note:&#160;The <i>content</i> property holds the actual text of this Definition.
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
 *   <li>{@link CDP4.CommonData.Definition#getCitation <em>Citation</em>}</li>
 *   <li>{@link CDP4.CommonData.Definition#getNote <em>Note</em>}</li>
 *   <li>{@link CDP4.CommonData.Definition#getExample <em>Example</em>}</li>
 * </ul>
 *
 * @see CDP4.CommonData.CommonDataPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends Thing, Annotation {
	/**
	 * Returns the value of the '<em><b>Citation</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.CommonData.Citation}.
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
	 * collection of citations that are relevant to this Definition
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;&#160;The citation &quot;Table 2&quot; of &#160;&quot;ISO 80000-1&quot;. Here &quot;Table 2&quot; is defined as the <i>location</i> property of a Citation, and &quot;ISO&#160;80000-1&quot; is represented by a ReferenceSource, referenced by the <i>source</i> property of the same Citation.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Citation</em>' containment reference list.
	 * @see CDP4.CommonData.CommonDataPackage#getDefinition_Citation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Citation> getCitation();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 * 
	 *   <body>
	 *     possible list of notes providing clarifications or more information about     this     Definition
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' attribute list.
	 * @see CDP4.CommonData.CommonDataPackage#getDefinition_Note()
	 * @model dataType="CDP4.CommonData.String"
	 * @generated
	 */
	EList<String> getNote();

	/**
	 * Returns the value of the '<em><b>Example</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 * 
	 *   <body>
	 *     possible list of examples that illustrate the use of this Definition
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Example</em>' attribute list.
	 * @see CDP4.CommonData.CommonDataPackage#getDefinition_Example()
	 * @model dataType="CDP4.CommonData.String"
	 * @generated
	 */
	EList<String> getExample();

} // Definition
