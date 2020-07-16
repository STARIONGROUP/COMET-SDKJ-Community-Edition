/**
 */
package CDP4.CommonData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias</b></em>'.
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
 * representation of an alternative human-readable name for a concept
 *     </p>
 * 
 *     <p>
 * Note:&#160;An alias may be a translation of the <i>name</i> of the referring DefinedThing in a given natural language or a synonym in any natural language. The alias name is stored in the <i>content</i> property.
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
 *   <li>{@link CDP4.CommonData.Alias#getIsSynonym <em>Is Synonym</em>}</li>
 * </ul>
 *
 * @see CDP4.CommonData.CommonDataPackage#getAlias()
 * @model
 * @generated
 */
public interface Alias extends Thing, Annotation {
	/**
	 * Returns the value of the '<em><b>Is Synonym</b></em>' attribute.
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
	 *     assertion whether <i>content</i> of this Alias is a synonym for the 
	 *     referring DefinedThing
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Synonym</em>' attribute.
	 * @see #setIsSynonym(Boolean)
	 * @see CDP4.CommonData.CommonDataPackage#getAlias_IsSynonym()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsSynonym();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.Alias#getIsSynonym <em>Is Synonym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Synonym</em>' attribute.
	 * @see #getIsSynonym()
	 * @generated
	 */
	void setIsSynonym(Boolean value);

} // Alias
