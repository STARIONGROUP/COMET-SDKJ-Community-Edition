/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.DeprecatableThing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Type</b></em>'.
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
 * representation of the type of a File
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;A File may have more than one FileType, see the note under <i>fileType</i> of File.
 *     </p>
 * 
 *     <p>
 * Note 2: Where available the <i>shortName</i> should be the assigned <a href="http://en.wikipedia.org/wiki/MIME_type">MIME</a>&#160;or <a href="http://en.wikipedia.org/wiki/S/MIME">S/MIME</a> media type name as defined by <a href="http://datatracker.ietf.org/doc/rfc2046/">IETF RFC2046</a>. The official list of media types is maintained by IANA at <a href="http://www.iana.org/assignments/media-types/index.html">http://www.iana.org/assignments/media-types/index.html</a>. The hyperLink should reference the relevant definition in this list.
 *     </p>
 * 
 *     <p>
 * Example:&#160;Example media types are &quot;text/plain&quot;, &quot;text/html&quot;, &#160;&quot;image/png&quot;, &quot;application/vnd.ms-excel.sheet.macroEnabled.12&quot;.
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
 *   <li>{@link CDP4.SiteDirectoryData.FileType#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getFileType()
 * @model
 * @generated
 */
public interface FileType extends DefinedThing, CategorizableThing, DeprecatableThing {
	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
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
	 * representation of the extension of this File
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;This is the character string denoting the file extension on the Microsoft Windows operating system. It should be written entirely in lowercase. The dot that conventionally separates the file name from the file extension is not part of the extension character string.
	 *     </p>
	 * 
	 *     <p>
	 * Example:&#160;Example extension and media type combinations are &quot; &quot;txt&quot;&#160;and &quot;text/plain&quot;, &quot;html&quot; and &quot;text/html&quot;, &#160;&quot;png&quot; and &quot;image/png&quot;, &quot;xlsm&quot; and &quot;application/vnd.ms-excel.sheet.macroEnabled.12&quot;.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getFileType_Extension()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.FileType#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

} // FileType
