/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.NamedThing;
import CDP4.CommonData.Thing;
import CDP4.CommonData.TimeStampedThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Store</b></em>'.
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
 * data container that may hold zero or more (possibly nested)&#160;Folders and Files
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.EngineeringModelData.FileStore#getFolder <em>Folder</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.FileStore#getFile <em>File</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFileStore()
 * @model abstract="true"
 * @generated
 */
public interface FileStore extends Thing, NamedThing, OwnedThing, TimeStampedThing {
	/**
	 * Returns the value of the '<em><b>Folder</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.Folder}.
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
	 * collection of Folders contained by this FileStore
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Folder</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFileStore_Folder()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Folder> getFolder();

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.File}.
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
	 * collection of Files contained by this FileStore
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFileStore_File()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<File> getFile();

} // FileStore
