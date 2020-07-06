/**
 */
package CDP4.CommonData;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Thing</b></em>'.
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
 * representation of a Thing that has a human readable name
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
 *   <li>{@link CDP4.CommonData.NamedThing#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see CDP4.CommonData.CommonDataPackage#getNamedThing()
 * @model abstract="true"
 * @generated
 */
public interface NamedThing extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
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
	 *       human readable character string in English by which something can be       referred       to
	 *     </p>
	 * 
	 *     <p>
	 *       Note:&#160;The implied LanguageCode of <i>name</i> is &quot;en-GB&quot;.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CDP4.CommonData.CommonDataPackage#getNamedThing_Name()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.NamedThing#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NamedThing
