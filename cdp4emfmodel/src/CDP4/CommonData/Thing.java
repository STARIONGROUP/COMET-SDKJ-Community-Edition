/**
 */
package CDP4.CommonData;

import CDP4.SiteDirectoryData.DomainOfExpertise;
import CDP4.SiteDirectoryData.Person;

import java.time.OffsetDateTime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
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
 * top level abstract superclass from which all domain concept classes in the model inherit
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
 *   <li>{@link CDP4.CommonData.Thing#getIid <em>Iid</em>}</li>
 *   <li>{@link CDP4.CommonData.Thing#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link CDP4.CommonData.Thing#getClassKind <em>Class Kind</em>}</li>
 *   <li>{@link CDP4.CommonData.Thing#getModifiedOn <em>Modified On</em>}</li>
 *   <li>{@link CDP4.CommonData.Thing#getExcludedPerson <em>Excluded Person</em>}</li>
 *   <li>{@link CDP4.CommonData.Thing#getExcludedDomain <em>Excluded Domain</em>}</li>
 * </ul>
 *
 * @see CDP4.CommonData.CommonDataPackage#getThing()
 * @model abstract="true"
 * @generated
 */
public interface Thing extends EObject {
	/**
	 * Returns the value of the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <html>
	 *   <head>
	 * 		<style>
	 * 			p {padding:0px; margin:0px;}
	 * 		</style>
	 * 	</head>
	 * 
	 *   <body>
	 *     <p>
	 *       Universally Unique Identifier (UUID) that uniquely identifies an 
	 *       instance of Thing
	 *     </p>
	 * 
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iid</em>' attribute.
	 * @see #setIid(String)
	 * @see CDP4.CommonData.CommonDataPackage#getThing_Iid()
	 * @model dataType="CDP4.CommonData.Uuid" required="true" ordered="false"
	 * @generated
	 */
	String getIid();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.Thing#getIid <em>Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iid</em>' attribute.
	 * @see #getIid()
	 * @generated
	 */
	void setIid(String value);

	/**
	 * Returns the value of the '<em><b>Revision Number</b></em>' attribute.
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
	 * revision number of this Thing
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;In this data model a revision numbering approach similar to Subversion is used, see <a href="http://svnbook.red-bean.com/en/1.7/svn-book.html#svn.basic">http://svnbook.red-bean.com/en/1.7/svn-book.html#svn.basic</a>. Therefore the revision number is actually a change set number. At any time that an update to a Thing is made and committed to a persistent data store, the <i>revisionNumber</i> of its TopContainer is incremented by one, and then the <i>revisionNumber</i> of the updated Thing is set to the new TopContainer's <i>revisionNumber</i>. See also TopContainer. When a Thing is first created (in a client application) its <i>revisionNumber</i> is set to zero, implying it has not yet been persisted.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revision Number</em>' attribute.
	 * @see #setRevisionNumber(Integer)
	 * @see CDP4.CommonData.CommonDataPackage#getThing_RevisionNumber()
	 * @model dataType="CDP4.CommonData.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getRevisionNumber();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.Thing#getRevisionNumber <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Number</em>' attribute.
	 * @see #getRevisionNumber()
	 * @generated
	 */
	void setRevisionNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Class Kind</b></em>' attribute.
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
	 * assertion of the ClassKind of this Thing, denoting its actual class
	 *     </p>
	 * 
	 *     <p>
	 * Note: Typically this is used internally by the implementing software to improve classification of instances and optimise performance when moving data between different programming environments. In an object-oriented software engineering environment that supports reflection such information would be redundant.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class Kind</em>' attribute.
	 * @see #setClassKind(String)
	 * @see CDP4.CommonData.CommonDataPackage#getThing_ClassKind()
	 * @model dataType="CDP4.CommonData.ClassKind" required="true" ordered="false"
	 * @generated
	 */
	String getClassKind();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.Thing#getClassKind <em>Class Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Kind</em>' attribute.
	 * @see #getClassKind()
	 * @generated
	 */
	void setClassKind(String value);

	/**
	 * Returns the value of the '<em><b>Modified On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified On</em>' attribute.
	 * @see #setModifiedOn(OffsetDateTime)
	 * @see CDP4.CommonData.CommonDataPackage#getThing_ModifiedOn()
	 * @model dataType="CDP4.CommonData.DateTime" required="true" ordered="false"
	 * @generated
	 */
	OffsetDateTime getModifiedOn();

	/**
	 * Sets the value of the '{@link CDP4.CommonData.Thing#getModifiedOn <em>Modified On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified On</em>' attribute.
	 * @see #getModifiedOn()
	 * @generated
	 */
	void setModifiedOn(OffsetDateTime value);

	/**
	 * Returns the value of the '<em><b>Excluded Person</b></em>' reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Person</em>' reference list.
	 * @see CDP4.CommonData.CommonDataPackage#getThing_ExcludedPerson()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Person> getExcludedPerson();

	/**
	 * Returns the value of the '<em><b>Excluded Domain</b></em>' reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.DomainOfExpertise}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Domain</em>' reference list.
	 * @see CDP4.CommonData.CommonDataPackage#getThing_ExcludedDomain()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DomainOfExpertise> getExcludedDomain();

} // Thing
