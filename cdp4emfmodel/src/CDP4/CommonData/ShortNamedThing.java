/**
 */
package CDP4.CommonData;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Short Named Thing</b></em>'.
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
 * representation of a Thing that has a short human readable name
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
 *   <li>{@link CDP4.CommonData.ShortNamedThing#getShortName <em>Short Name</em>}</li>
 * </ul>
 *
 * @see CDP4.CommonData.CommonDataPackage#getShortNamedThing()
 * @model abstract="true"
 * @generated
 */
public interface ShortNamedThing extends EObject {
	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
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
	 * short human readable character string in English that preserves the essential aspects of the name by which something can be referred to
	 *     <p>
	 * Note 1:&#160;The implied LanguageCode of <i>shortName</i> is &quot;en-GB&quot;.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;The <i>shortName</i> is meant to be used to refer to something where little space is available, for example to name a domain of expertise, a parameter or a measurement scale or unit in the column header of a table or in a formula.
	 *     </p>
	 * 
	 *     <p>
	 * Note 3:&#160;A <i>shortName</i> may be an acronym or an abbreviated term.
	 *     </p>
	 * 
	 *     <p>
	 * Note 4:&#160;A <i>shortName</i> should not contain any whitespace. Additional constraints are defined for some specializations of ShortNamedThing in order to ensure that the <i>shortName</i> can be used as a variable name in a programming or modelling language.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see CDP4.CommonData.CommonDataPackage#getShortNamedThing_ShortName()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.ShortNamedThing#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

} // ShortNamedThing
