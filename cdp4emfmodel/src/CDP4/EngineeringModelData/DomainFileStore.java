/**
 */
package CDP4.EngineeringModelData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain File Store</b></em>'.
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
 * domain specific FileStore for use by single DomainOfExpertise
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
 *   <li>{@link CDP4.EngineeringModelData.DomainFileStore#getIsHidden <em>Is Hidden</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getDomainFileStore()
 * @model
 * @generated
 */
public interface DomainFileStore extends FileStore {
	/**
	 * Returns the value of the '<em><b>Is Hidden</b></em>' attribute.
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
	 *       assertion whether the FileStore is hidden or not
	 *     </p>
	 * 
	 *     <p>
	 *       Note:&#160;Hidden means that the FileStore is only visible to the DomainOfExpertise 
	 *       that owns the FileStore and not to any other domain.
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Hidden</em>' attribute.
	 * @see #setIsHidden(Boolean)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getDomainFileStore_IsHidden()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsHidden();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.DomainFileStore#getIsHidden <em>Is Hidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Hidden</em>' attribute.
	 * @see #getIsHidden()
	 * @generated
	 */
	void setIsHidden(Boolean value);

} // DomainFileStore
