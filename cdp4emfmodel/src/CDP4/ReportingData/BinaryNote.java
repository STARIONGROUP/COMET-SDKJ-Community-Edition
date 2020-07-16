/**
 */
package CDP4.ReportingData;

import CDP4.SiteDirectoryData.FileType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Note</b></em>'.
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
 * Represents a record of points or ideas in the form of a binary flie such as an image, table as an aid to memory
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
 *   <li>{@link CDP4.ReportingData.BinaryNote#getCaption <em>Caption</em>}</li>
 *   <li>{@link CDP4.ReportingData.BinaryNote#getFileType <em>File Type</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getBinaryNote()
 * @model
 * @generated
 */
public interface BinaryNote extends Note {
	/**
	 * Returns the value of the '<em><b>Caption</b></em>' attribute.
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
	 * A human readable title or brief explanation
	 *     </p>
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Caption</em>' attribute.
	 * @see #setCaption(String)
	 * @see CDP4.ReportingData.ReportingDataPackage#getBinaryNote_Caption()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getCaption();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.BinaryNote#getCaption <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' attribute.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(String value);

	/**
	 * Returns the value of the '<em><b>File Type</b></em>' reference.
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
	 * reference to one FileType that defines the type and format of this BinaryNote
	 *     </p>
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Type</em>' reference.
	 * @see #setFileType(FileType)
	 * @see CDP4.ReportingData.ReportingDataPackage#getBinaryNote_FileType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FileType getFileType();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.BinaryNote#getFileType <em>File Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Type</em>' reference.
	 * @see #getFileType()
	 * @generated
	 */
	void setFileType(FileType value);

} // BinaryNote
