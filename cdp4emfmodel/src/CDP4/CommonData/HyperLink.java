/**
 */
package CDP4.CommonData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hyper Link</b></em>'.
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
 *     representation of a hyperlink consisting of a URI&#160;and a descriptive text
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
 *   <li>{@link CDP4.CommonData.HyperLink#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see CDP4.CommonData.CommonDataPackage#getHyperLink()
 * @model
 * @generated
 */
public interface HyperLink extends Thing, Annotation {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
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
	 * value of the actual Universal Resource Identifier (URI)
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see CDP4.CommonData.CommonDataPackage#getHyperLink_Uri()
	 * @model dataType="CDP4.CommonData.Uri" required="true" ordered="false"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.HyperLink#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // HyperLink
