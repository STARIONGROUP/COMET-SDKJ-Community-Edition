/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.Thing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Kind Factor</b></em>'.
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
 * representation of a QuantityKind and an exponent that together define one factor in a product of powers of QuantityKinds
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.QuantityKindFactor#getQuantityKind <em>Quantity Kind</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.QuantityKindFactor#getExponent <em>Exponent</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getQuantityKindFactor()
 * @model
 * @generated
 */
public interface QuantityKindFactor extends Thing {
	/**
	 * Returns the value of the '<em><b>Quantity Kind</b></em>' reference.
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
	 * reference to the relevant QuantityKind
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity Kind</em>' reference.
	 * @see #setQuantityKind(QuantityKind)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getQuantityKindFactor_QuantityKind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	QuantityKind getQuantityKind();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.QuantityKindFactor#getQuantityKind <em>Quantity Kind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Kind</em>' reference.
	 * @see #getQuantityKind()
	 * @generated
	 */
	void setQuantityKind(QuantityKind value);

	/**
	 * Returns the value of the '<em><b>Exponent</b></em>' attribute.
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
	 * definition of the relevant exponent
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The exponent does not need to be an integer number. There exist cases where fractional exponents are needed.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exponent</em>' attribute.
	 * @see #setExponent(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getQuantityKindFactor_Exponent()
	 * @model dataType="CDP4.CommonData.ParameterValueType" required="true" ordered="false"
	 * @generated
	 */
	String getExponent();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.QuantityKindFactor#getExponent <em>Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exponent</em>' attribute.
	 * @see #getExponent()
	 * @generated
	 */
	void setExponent(String value);

} // QuantityKindFactor
