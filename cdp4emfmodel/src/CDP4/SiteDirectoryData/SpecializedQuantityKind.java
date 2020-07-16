/**
 */
package CDP4.SiteDirectoryData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialized Quantity Kind</b></em>'.
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
 *     <p>
 *       specialization of QuantityKind that represents a kind of quantity that 
 *       is a specialization of another kind of quantity
 *     </p>
 * 
 *     <p>
 *       Example:&#160;The kinds of quantity &quot;distance&quot;, &quot;width&quot;, &quot;depth&quot;, &quot;radius&quot; 
 *       and &quot;wavelength&quot; can all be specified as specializations of the &quot;length&quot; 
 *       SimpleQuantityKind.
 *     </p>
 * 
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
 *   <li>{@link CDP4.SiteDirectoryData.SpecializedQuantityKind#getGeneral <em>General</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSpecializedQuantityKind()
 * @model
 * @generated
 */
public interface SpecializedQuantityKind extends QuantityKind {
	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
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
	 * reference to the general QuantityKind that this SpecializedQuantityKind is a specialization of
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(QuantityKind)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSpecializedQuantityKind_General()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	QuantityKind getGeneral();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.SpecializedQuantityKind#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(QuantityKind value);

} // SpecializedQuantityKind
