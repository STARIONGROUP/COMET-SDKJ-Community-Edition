/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DeprecatableThing;
import CDP4.CommonData.PersonAccessRightKind;
import CDP4.CommonData.Thing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Permission</b></em>'.
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
 * representation of a permission to access a given (sub)set of data in a SiteDirectory
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
 *   <li>{@link CDP4.SiteDirectoryData.PersonPermission#getAccessRight <em>Access Right</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.PersonPermission#getObjectClass <em>Object Class</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPersonPermission()
 * @model
 * @generated
 */
public interface PersonPermission extends Thing, DeprecatableThing {
	/**
	 * Returns the value of the '<em><b>Access Right</b></em>' attribute.
	 * The literals are from the enumeration {@link CDP4.CommonData.PersonAccessRightKind}.
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
	 * definition of the access right to be enabled for this PersonPermission
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;For PersonPermission the only allowable access rights are:&#160;READ&#160;and MODIFY.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Right</em>' attribute.
	 * @see CDP4.CommonData.PersonAccessRightKind
	 * @see #setAccessRight(PersonAccessRightKind)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPersonPermission_AccessRight()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PersonAccessRightKind getAccessRight();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.PersonPermission#getAccessRight <em>Access Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Right</em>' attribute.
	 * @see CDP4.CommonData.PersonAccessRightKind
	 * @see #getAccessRight()
	 * @generated
	 */
	void setAccessRight(PersonAccessRightKind value);

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
	 * definition of the class of objects for which this PersonPermission is defined
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Class</em>' attribute.
	 * @see #setObjectClass(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getPersonPermission_ObjectClass()
	 * @model dataType="CDP4.CommonData.ClassKind" required="true" ordered="false"
	 * @generated
	 */
	String getObjectClass();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.PersonPermission#getObjectClass <em>Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Class</em>' attribute.
	 * @see #getObjectClass()
	 * @generated
	 */
	void setObjectClass(String value);

} // PersonPermission
