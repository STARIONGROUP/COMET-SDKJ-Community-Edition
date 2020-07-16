/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DefinedThing;
import CDP4.CommonData.DeprecatableThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Role</b></em>'.
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
 * representation of the named role of a Person (a user)&#160;that defines the Person's permissions and access rights with respect to data in a SiteDirectory
 *     </p>
 * 
 *     <p>
 * Note:&#160;When creating a new PersonRole, the user shall define PersonPermissions for all ClassKinds that have a <i>defaultPersonAccess</i> equal to PersonAccessRightKind.NONE. For all ClassKinds that have a <i>defaultPersonAccess</i> not equal to PersonAccessRightKind.NONE, a PersonPermission with <i>accessRight</i> equal to <i>defaultPersonAccess</i> for that ClassKind shall be defined. See PersonAccessRightKind for details.
 *     </p>
 * 
 *     <pre>    </pre>
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.PersonRole#getPersonPermission <em>Person Permission</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPersonRole()
 * @model
 * @generated
 */
public interface PersonRole extends DefinedThing, DeprecatableThing {
	/**
	 * Returns the value of the '<em><b>Person Permission</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.PersonPermission}.
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
	 * references to the PersonPermissions assigned to this PersonRole
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Permission</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPersonRole_PersonPermission()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PersonPermission> getPersonPermission();

} // PersonRole
