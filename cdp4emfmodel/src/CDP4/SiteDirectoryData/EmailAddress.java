/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.Thing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email Address</b></em>'.
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
 * representation of an e-mail address
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
 *   <li>{@link CDP4.SiteDirectoryData.EmailAddress#getVcardType <em>Vcard Type</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.EmailAddress#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEmailAddress()
 * @model
 * @generated
 */
public interface EmailAddress extends Thing {
	/**
	 * Returns the value of the '<em><b>Vcard Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CDP4.SiteDirectoryData.VcardEmailAddressKind}.
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
	 * Note:&#160;See VcardEmailAddressKind for details.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vcard Type</em>' attribute.
	 * @see CDP4.SiteDirectoryData.VcardEmailAddressKind
	 * @see #setVcardType(VcardEmailAddressKind)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEmailAddress_VcardType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VcardEmailAddressKind getVcardType();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.EmailAddress#getVcardType <em>Vcard Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vcard Type</em>' attribute.
	 * @see CDP4.SiteDirectoryData.VcardEmailAddressKind
	 * @see #getVcardType()
	 * @generated
	 */
	void setVcardType(VcardEmailAddressKind value);

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
	 * representation of the actual e-mail address of this EmailAddress
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The e-mail address value shall comply with the SMTP protocol as specified in <a href="http://datatracker.ietf.org/doc/rfc5321/">IETF RFC 5321</a>, i.e. &quot;user-name@domain&quot; or &quot;Full Name &lt;user-name@domain&gt;&quot;.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEmailAddress_Value()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.EmailAddress#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // EmailAddress
