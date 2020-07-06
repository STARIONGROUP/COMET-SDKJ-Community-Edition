/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.DeprecatableThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant Role</b></em>'.
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
 * representation of the named role of a Participant that defines the Participant's permissions and access rights with respect to data in an EngineeringModel
 *     </p>
 * 
 *     <p>
 * Note:&#160;When creating a new ParticipantRole, the user shall define ParticipantPermissions for all ClassKinds that have a <i>defaultPersonAccess</i> equal to ParticipantAccessRightKind.NONE. For all ClassKinds that have a <i>defaultParticipantAccess</i> not equal to ParticipantAccessRightKind.NONE, a ParticipantPermission with <i>accessRight</i> equal to <i>defaultParticipantAccess</i> for that ClassKind shall be defined. See ParticipantAccessRightKind for details.
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
 *   <li>{@link CDP4.SiteDirectoryData.ParticipantRole#getParticipantPermission <em>Participant Permission</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParticipantRole()
 * @model
 * @generated
 */
public interface ParticipantRole extends DefinedThing, DeprecatableThing {
	/**
	 * Returns the value of the '<em><b>Participant Permission</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.ParticipantPermission}.
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
	 * references to the ParticipantPermissions assigned to this ParticipantRole
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Permission</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParticipantRole_ParticipantPermission()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParticipantPermission> getParticipantPermission();

} // ParticipantRole
