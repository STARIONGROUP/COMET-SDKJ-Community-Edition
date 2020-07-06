/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.Thing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telephone Number</b></em>'.
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
 * representation of a telephone number
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
 *   <li>{@link CDP4.SiteDirectoryData.TelephoneNumber#getVcardType <em>Vcard Type</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.TelephoneNumber#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getTelephoneNumber()
 * @model
 * @generated
 */
public interface TelephoneNumber extends Thing {
	/**
	 * Returns the value of the '<em><b>Vcard Type</b></em>' attribute list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.VcardTelephoneNumberKind}.
	 * The literals are from the enumeration {@link CDP4.SiteDirectoryData.VcardTelephoneNumberKind}.
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
	 * representation of the applicable vCard TYPE values
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;Zero or more vCard TYPE&#160;values can be associated to a single telephone number. See VcardTelephoneNumberKind for details.
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;VcardTelephoneNumberKind.WORK, VcardTelephoneNumberKind.VOICE, VcardTelephoneNumberKind.TEXT, VcardTelephoneNumberKind.CELL .
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vcard Type</em>' attribute list.
	 * @see CDP4.SiteDirectoryData.VcardTelephoneNumberKind
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getTelephoneNumber_VcardType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<VcardTelephoneNumberKind> getVcardType();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
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
	 * representation of the actual telephone number of this TelephoneNumber
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The value should follow the URI&#160;specification for international telephone numbers as defined in <a href="http://datatracker.ietf.org/doc/rfc3966/?include_text=1">IETF RFC 3966</a>. Hyphens may be used to improve human readability.
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;<i>vcardType</i> = VcardTelephoneNumberKind.WORK, <i>value</i> = &quot;+31-71-5656565&quot;.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getTelephoneNumber_Value()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.TelephoneNumber#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // TelephoneNumber
