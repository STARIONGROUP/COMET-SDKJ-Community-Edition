/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.NamedThing;
import CDP4.CommonData.Thing;
import CDP4.CommonData.TimeStampedThing;

import CDP4.SiteDirectoryData.Participant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
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
 * representation of a named folder in a FileStore that may contain files and other folders
 *     </p>
 * 
 *     <p>
 * Note:&#160;Folders form an acyclic graph.
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
 *   <li>{@link CDP4.EngineeringModelData.Folder#getCreator <em>Creator</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Folder#getContainingFolder <em>Containing Folder</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Folder#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends Thing, NamedThing, OwnedThing, TimeStampedThing {
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
	 * reference to the Participant that has created this Folder
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creator</em>' reference.
	 * @see #setCreator(Participant)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFolder_Creator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Participant getCreator();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.Folder#getCreator <em>Creator</em>}' reference.
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
	 * Note: If the reference is undefined (or null)&#160;the Folder and Folder are considered to be contained by the containing FileStore at the top level.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Containing Folder</em>' reference.
	 * @see #setContainingFolder(Folder)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFolder_ContainingFolder()
	 * @model ordered="false"
	 * @generated
	 */
	Folder getContainingFolder();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.Folder#getContainingFolder <em>Containing Folder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Folder</em>' reference.
	 * @see #getContainingFolder()
	 * @generated
	 */
	void setContainingFolder(Folder value);

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
	 * path to this Folder
	 *     </p>
	 * 
	 *     <p>
	 * Note: The path is derived to be the concatenation of the folder names in the hierarchy specified through <i>containingFolder</i>. This yields a path that is similar to that of <i>&quot;file://&quot;</i> URL starting from the containing FileStore.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getFolder_Path()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.Folder#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // Folder
