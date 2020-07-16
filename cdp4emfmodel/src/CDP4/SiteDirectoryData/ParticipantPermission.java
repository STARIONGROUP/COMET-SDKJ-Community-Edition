/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DeprecatableThing;
import CDP4.CommonData.ParticipantAccessRightKind;
import CDP4.CommonData.Thing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Permission</b></em>'.
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
 * representation of a permission to access a given (sub)set of data in an EngineeringModel
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
 *   <li>{@link CDP4.SiteDirectoryData.ParticipantPermission#getAccessRight <em>Access Right</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.ParticipantPermission#getObjectClass <em>Object Class</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParticipantPermission()
 * @model
 * @generated
 */
public interface ParticipantPermission extends Thing, DeprecatableThing {
	/**
	 * Returns the value of the '<em><b>Access Right</b></em>' attribute.
	 * The literals are from the enumeration {@link CDP4.CommonData.ParticipantAccessRightKind}.
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
	 * definition of the access right to be enabled for this ParticipantPermission
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Right</em>' attribute.
	 * @see CDP4.CommonData.ParticipantAccessRightKind
	 * @see #setAccessRight(ParticipantAccessRightKind)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParticipantPermission_AccessRight()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParticipantAccessRightKind getAccessRight();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ParticipantPermission#getAccessRight <em>Access Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Right</em>' attribute.
	 * @see CDP4.CommonData.ParticipantAccessRightKind
	 * @see #getAccessRight()
	 * @generated
	 */
	void setAccessRight(ParticipantAccessRightKind value);

	/**
	 * Returns the value of the '<em><b>Object Class</b></em>' attribute.
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
	 * definition of the class of objects for which this ParticipantPermission is defined
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Class</em>' attribute.
	 * @see #setObjectClass(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParticipantPermission_ObjectClass()
	 * @model dataType="CDP4.CommonData.ClassKind" required="true" ordered="false"
	 * @generated
	 */
	String getObjectClass();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.ParticipantPermission#getObjectClass <em>Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Class</em>' attribute.
	 * @see #getObjectClass()
	 * @generated
	 */
	void setObjectClass(String value);

} // ParticipantPermission
