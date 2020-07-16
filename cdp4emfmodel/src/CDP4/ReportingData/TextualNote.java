/**
 */
package CDP4.ReportingData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textual Note</b></em>'.
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
 * Represents a record of points or ideas in the form of written text as an aid to memory
 *     </p>
 * 
 *   </body>
 * </html>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.TextualNote#getContent <em>Content</em>}</li>
 *   <li>{@link CDP4.ReportingData.TextualNote#getLanguageCode <em>Language Code</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getTextualNote()
 * @model
 * @generated
 */
public interface TextualNote extends Note {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see CDP4.ReportingData.ReportingDataPackage#getTextualNote_Content()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.TextualNote#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Language Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Code</em>' attribute.
	 * @see #setLanguageCode(String)
	 * @see CDP4.ReportingData.ReportingDataPackage#getTextualNote_LanguageCode()
	 * @model dataType="CDP4.CommonData.LanguageCode" required="true" ordered="false"
	 * @generated
	 */
	String getLanguageCode();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.TextualNote#getLanguageCode <em>Language Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Code</em>' attribute.
	 * @see #getLanguageCode()
	 * @generated
	 */
	void setLanguageCode(String value);

} // TextualNote
