/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.NamedThing;
import CDP4.CommonData.Thing;
import CDP4.CommonData.TimeStampedThing;

import CDP4.SiteDirectoryData.FileType;
import CDP4.SiteDirectoryData.Participant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Revision</b></em>'.
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
 * representation of a persisted revision of a File
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;The <i>name</i> property is used to denote the name of the FileRevision and therefore of the File, without any file type extension. So for a Microsoft Windows file the name contains the characters up to (but not including)&#160;the dot that separates the file name from the extension. The file type extension is stored in the associated FileType. Case is preserved in the file name.
 *     </p>
 * 
 *     <p>
 * Note 2: The representation of the actual file content of a FileRevision depends on the implementation technology and is not modeled as an explicit property. It may differ between server and client applications. A server&#160;application (e.g. a combination of a web services processor and a persistent data store)&#160;may store the content partitioned into chunks for reasons of efficiency. A client application may implement an API that provides access to an instance of a retrieved file in a locally accessible file system. There is a FileContentType data type that can be used in code generation or implementation.
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
 *   <li>{@link CDP4.EngineeringModelData.FileRevision#getContentHash <em>Content Hash</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.FileRevision#getCreator <em>Creator</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.FileRevision#getContainingFolder <em>Containing Folder</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.FileRevision#getFileType <em>File Type</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.FileRevision#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFileRevision()
 * @model
 * @generated
 */
public interface FileRevision extends Thing, NamedThing, TimeStampedThing {
	/**
	 * Returns the value of the '<em><b>Content Hash</b></em>' attribute.
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
	 * SHA-1 hash code of the content (byte stream)&#160;of this FileRevision
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The SHA-1 cryptographic hash is described in <a href="http://en.wikipedia.org/wiki/SHA-1">http://en.wikipedia.org/wiki/SHA-1</a>. It provides a unique hash to the file content of the FileRevision and was selected for future compatibility with a GIT&#160;(<a href="http://git-scm.com/">http://git-scm.com/</a>)&#160;version controlled file store. Implementations of E-TM-10-25 need to provide a way to associate a SHA-1 hash to the content of a file. Whether or not the content of two FileRevisions differs can then be determined by just comparing the SHA-1 hashes without the need for having access to the actual file content itself.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Hash</em>' attribute.
	 * @see #setContentHash(String)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFileRevision_ContentHash()
	 * @model dataType="CDP4.CommonData.Sha1HashType" required="true" ordered="false"
	 * @generated
	 */
	String getContentHash();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.FileRevision#getContentHash <em>Content Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Hash</em>' attribute.
	 * @see #getContentHash()
	 * @generated
	 */
	void setContentHash(String value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' reference.
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
	 * reference to the Participant who created this FileRevision
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creator</em>' reference.
	 * @see #setCreator(Participant)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFileRevision_Creator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Participant getCreator();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.FileRevision#getCreator <em>Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(Participant value);

	/**
	 * Returns the value of the '<em><b>Containing Folder</b></em>' reference.
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
	 * optional reference to the containing Folder
	 *     </p>
	 * 
	 *     <p>
	 * Note: If the reference is undefined (or null)&#160;the File and FileRevision are considered to be contained by the containing FileStore at the top level.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Containing Folder</em>' reference.
	 * @see #setContainingFolder(Folder)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFileRevision_ContainingFolder()
	 * @model ordered="false"
	 * @generated
	 */
	Folder getContainingFolder();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.FileRevision#getContainingFolder <em>Containing Folder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Folder</em>' reference.
	 * @see #getContainingFolder()
	 * @generated
	 */
	void setContainingFolder(Folder value);

	/**
	 * Returns the value of the '<em><b>File Type</b></em>' reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.FileType}.
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
	 * reference to one or more FileTypes that define the type and format of this FileRevision
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;A file can have more than one FileType in order to support possible encryption and compression formats. The order in which the FileTypes are defined is the same as the order the formats were applied from the &quot;inside out&quot;, i.e. the first FileType is the normal format of the content, e.g. text or Microsoft Excel, and the subsequent formats are the encryption and/or compression formats, e.g. public-key cryptography standard <a href="http://en.wikipedia.org/wiki/PKCS">PKCS#7</a> and zip.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Type</em>' reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFileRevision_FileType()
	 * @model required="true"
	 * @generated
	 */
	EList<FileType> getFileType();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
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
	 * full path name including folder path and type extension(s)
	 *     </p>
	 * 
	 *     <p>
	 * Note: The path is derived to be the concatenation of the path of the containingFolder (if any)&#160;followed by a forward slash and the name of this FileRevision and then a dot separated concatenation of the extensions of the associated FileTypes. This yields a path that is similar to that of a &quot;file://&quot; URL starting from the containing FileStore.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFileRevision_Path()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.FileRevision#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // FileRevision
