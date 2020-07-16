/**
 */
package CDP4.CommonData;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defined Thing</b></em>'.
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
 * abstract specialization of Thing for all classes that need a human readable definition, i.e. a name and a short name, and optionally explicit textual definitions, aliases and hyperlinks
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
 *   <li>{@link CDP4.CommonData.DefinedThing#getAlias <em>Alias</em>}</li>
 *   <li>{@link CDP4.CommonData.DefinedThing#getDefinition <em>Definition</em>}</li>
 *   <li>{@link CDP4.CommonData.DefinedThing#getHyperLink <em>Hyper Link</em>}</li>
 * </ul>
 *
 * @see CDP4.CommonData.CommonDataPackage#getDefinedThing()
 * @model abstract="true"
 * @generated
 */
public interface DefinedThing extends Thing, NamedThing, ShortNamedThing {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.CommonData.Alias}.
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
	 * alternative human-readable character string for the <i>name</i> of this DefinedThing
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;An alias may be a translation of <i>name</i> in another natural language than British English (the default language code &quot;en-GB&quot;)&#160;or an alternative or synonym in any natural language.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference list.
	 * @see CDP4.CommonData.CommonDataPackage#getDefinedThing_Alias()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Alias> getAlias();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.CommonData.Definition}.
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
	 *     <p>
	 *       textual definition in a given natural language
	 *     </p>
	 * 
	 *     <p>
	 *       Note:&#160;At most one definition shall be given per natural language.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference list.
	 * @see CDP4.CommonData.CommonDataPackage#getDefinedThing_Definition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Definition> getDefinition();

	/**
	 * Returns the value of the '<em><b>Hyper Link</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.CommonData.HyperLink}.
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
	 * representation of a URI&#160;and a descriptive text that convey relevant information about this DefinedThing
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hyper Link</em>' containment reference list.
	 * @see CDP4.CommonData.CommonDataPackage#getDefinedThing_HyperLink()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<HyperLink> getHyperLink();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * definition->isUnique(languageCode)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean hasOneDefinitionPerLanguage(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * {"context" : "DefinedThing",
	 * "name" : null,
	 * "expression": ["isUnique", "definition->languageCode"],
	 * "message": ""}
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean hasOneDefinitionPerLanguage1(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DefinedThing
