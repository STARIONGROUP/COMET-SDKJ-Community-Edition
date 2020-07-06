/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.NamedThing;
import CDP4.CommonData.Thing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Natural Language</b></em>'.
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
 * representation of a known natural language
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;This enables implementations to use an enumeration of known natural language names and codes when creating, modifying or validating a concept that needs identification of a natural language, see for example Annotation.
 *     </p>
 * 
 *     <p>
 * Note 2:&#160;The <i>name</i> of this NaturalLanguage is the name of the identified natural language in British English.
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
 *   <li>{@link CDP4.SiteDirectoryData.NaturalLanguage#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.NaturalLanguage#getNativeName <em>Native Name</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getNaturalLanguage()
 * @model
 * @generated
 */
public interface NaturalLanguage extends Thing, NamedThing {
	/**
	 * Returns the value of the '<em><b>Language Code</b></em>' attribute.
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
	 * code that identifies a natural language
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language Code</em>' attribute.
	 * @see #setLanguageCode(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getNaturalLanguage_LanguageCode()
	 * @model dataType="CDP4.CommonData.LanguageCode" required="true" ordered="false"
	 * @generated
	 */
	String getLanguageCode();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.NaturalLanguage#getLanguageCode <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Code</em>' attribute.
	 * @see #getLanguageCode()
	 * @generated
	 */
	void setLanguageCode(String value);

	/**
	 * Returns the value of the '<em><b>Native Name</b></em>' attribute.
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
	 * name of this NaturalLanguage expressed in the identified natural language itself
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Native Name</em>' attribute.
	 * @see #setNativeName(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getNaturalLanguage_NativeName()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getNativeName();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.NaturalLanguage#getNativeName <em>Native Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Native Name</em>' attribute.
	 * @see #getNativeName()
	 * @generated
	 */
	void setNativeName(String value);

} // NaturalLanguage
