/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.NamedThing;
import CDP4.CommonData.Thing;

import CDP4.SiteDirectoryData.ReferenceSource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Identifier Map</b></em>'.
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
 * representation of a mapping that relates E-TM-10-25 instance UUIDs to identifiers of corresponding items in an external tool / model
 *     </p>
 * 
 *     <p>
 * Note: The purpose of such a correspondence mapping is to provide the data to reduce as much as possible the loss of information when performing round trip import / export data transfer between an E-TM-10-25 compliant model and a model in the format of an external tool.
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
 *   <li>{@link CDP4.EngineeringModelData.ExternalIdentifierMap#getCorrespondence <em>Correspondence</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalModelName <em>External Model Name</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalToolName <em>External Tool Name</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalToolVersion <em>External Tool Version</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalFormat <em>External Format</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getExternalIdentifierMap()
 * @model
 * @generated
 */
public interface ExternalIdentifierMap extends Thing, NamedThing, OwnedThing {
	/**
	 * Returns the value of the '<em><b>Correspondence</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.IdCorrespondence}.
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
	 * set of internal Uuid to external identifier correspondence mappings
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Correspondence</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getExternalIdentifierMap_Correspondence()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<IdCorrespondence> getCorrespondence();

	/**
	 * Returns the value of the '<em><b>External Model Name</b></em>' attribute.
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
	 * name of the external model
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Model Name</em>' attribute.
	 * @see #setExternalModelName(String)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getExternalIdentifierMap_ExternalModelName()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getExternalModelName();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalModelName <em>External Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Model Name</em>' attribute.
	 * @see #getExternalModelName()
	 * @generated
	 */
	void setExternalModelName(String value);

	/**
	 * Returns the value of the '<em><b>External Tool Name</b></em>' attribute.
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
	 * name of the external tool
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Tool Name</em>' attribute.
	 * @see #setExternalToolName(String)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getExternalIdentifierMap_ExternalToolName()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getExternalToolName();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalToolName <em>External Tool Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Tool Name</em>' attribute.
	 * @see #getExternalToolName()
	 * @generated
	 */
	void setExternalToolName(String value);

	/**
	 * Returns the value of the '<em><b>External Tool Version</b></em>' attribute.
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
	 * optional representation of the version of the external tool
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Tool Version</em>' attribute.
	 * @see #setExternalToolVersion(String)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getExternalIdentifierMap_ExternalToolVersion()
	 * @model dataType="CDP4.CommonData.String" ordered="false"
	 * @generated
	 */
	String getExternalToolVersion();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalToolVersion <em>External Tool Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Tool Version</em>' attribute.
	 * @see #getExternalToolVersion()
	 * @generated
	 */
	void setExternalToolVersion(String value);

	/**
	 * Returns the value of the '<em><b>External Format</b></em>' reference.
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
	 * optional reference to a ReferenceSource that specifies the format of the external model
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Format</em>' reference.
	 * @see #setExternalFormat(ReferenceSource)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getExternalIdentifierMap_ExternalFormat()
	 * @model ordered="false"
	 * @generated
	 */
	ReferenceSource getExternalFormat();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.ExternalIdentifierMap#getExternalFormat <em>External Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Format</em>' reference.
	 * @see #getExternalFormat()
	 * @generated
	 */
	void setExternalFormat(ReferenceSource value);

} // ExternalIdentifierMap
