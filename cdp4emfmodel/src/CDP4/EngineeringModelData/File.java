/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.Thing;

import CDP4.SiteDirectoryData.CategorizableThing;
import CDP4.SiteDirectoryData.Person;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
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
 * representation of a computer file
 *     </p>
 * 
 *     <p>
 * Note:&#160;A File instance only holds the identification of a File, its owner and an optional lockedBy property. All other properties are held inside a FileRevision.
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
 *   <li>{@link CDP4.EngineeringModelData.File#getLockedBy <em>Locked By</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.File#getFileRevision <em>File Revision</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFile()
 * @model
 * @generated
 */
public interface File extends Thing, CategorizableThing, OwnedThing {
	/**
	 * Returns the value of the '<em><b>Locked By</b></em>' reference.
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
	 * reference to a Person that has locked this File for write / modify access
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locked By</em>' reference.
	 * @see #setLockedBy(Person)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFile_LockedBy()
	 * @model ordered="false"
	 * @generated
	 */
	Person getLockedBy();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.File#getLockedBy <em>Locked By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked By</em>' reference.
	 * @see #getLockedBy()
	 * @generated
	 */
	void setLockedBy(Person value);

	/**
	 * Returns the value of the '<em><b>File Revision</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.FileRevision}.
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
	 * collection of revisions for this File
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Revision</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFile_FileRevision()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<FileRevision> getFileRevision();

} // File
