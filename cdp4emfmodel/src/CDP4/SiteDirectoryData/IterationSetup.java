/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.Thing;
import CDP4.CommonData.TimeStampedThing;

import java.time.OffsetDateTime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteration Setup</b></em>'.
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
 * representation of the set-up information of an Iteration in the EngineeringModel associated with the EngineeringModelSetup that contains this IterationInfo
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;An iteration is a version of the associated EngineeringModel that was considered as one complete and coherent step in the development of the EngineeringModel in a concurrent engineering activity. The detailed definition and understanding of the meaning of a &quot;complete and coherent&quot; step depends on the organization and activity that develops the EngineeringModel.
 *     </p>
 * 
 *     <p>
 * Note 2:&#160;In a&#160;concurrent engineering activity the engineering model for the system-of-interest is developed in a number of iterations, where in each iteration the problem specification in the form of the RequirementsSpecification and a design solution in the form of the Options and ElementDefinitions are elaborated and refined. With an iteration the engineering team strives to set one more step in the direction of achieving a converged definition that fulfills the objectives of their activity.
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
 *   <li>{@link CDP4.SiteDirectoryData.IterationSetup#getIterationIid <em>Iteration Iid</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.IterationSetup#getIterationNumber <em>Iteration Number</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.IterationSetup#getDescription <em>Description</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.IterationSetup#getSourceIterationSetup <em>Source Iteration Setup</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.IterationSetup#getFrozenOn <em>Frozen On</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.IterationSetup#getIsDeleted <em>Is Deleted</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getIterationSetup()
 * @model
 * @generated
 */
public interface IterationSetup extends Thing, TimeStampedThing, ParticipantAffectedAccessThing {
	/**
	 * Returns the value of the '<em><b>Iteration Iid</b></em>' attribute.
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
	 * definition of the unique instance identifier of the Iteration in an EngineeringModel to which this IterationSetup pertains
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iteration Iid</em>' attribute.
	 * @see #setIterationIid(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getIterationSetup_IterationIid()
	 * @model dataType="CDP4.CommonData.Uuid" required="true" ordered="false"
	 * @generated
	 */
	String getIterationIid();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.IterationSetup#getIterationIid <em>Iteration Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteration Iid</em>' attribute.
	 * @see #getIterationIid()
	 * @generated
	 */
	void setIterationIid(String value);

	/**
	 * Returns the value of the '<em><b>Iteration Number</b></em>' attribute.
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
	 * number of the Iteration
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;In an implementation the number shall be assigned by the server. The first IterationSetup / Iteration that is created for an EngineeringModelSetup / EngineeringModel shall be 1. Any subsequent IterationSetup / Iteration shall be assigned the next number in the creation sequence.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iteration Number</em>' attribute.
	 * @see #setIterationNumber(Integer)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getIterationSetup_IterationNumber()
	 * @model dataType="CDP4.CommonData.Integer" required="true" ordered="false"
	 * @generated
	 */
	Integer getIterationNumber();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.IterationSetup#getIterationNumber <em>Iteration Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteration Number</em>' attribute.
	 * @see #getIterationNumber()
	 * @generated
	 */
	void setIterationNumber(Integer value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
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
	 * human readable description of the Iteration
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The description should contain information that permits users to quickly select an Iteration that they are searching for.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getIterationSetup_Description()
	 * @model dataType="CDP4.CommonData.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.IterationSetup#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Source Iteration Setup</b></em>' reference.
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
	 * reference to the IterationSetup of the Iteration in an EngineeringModel that was used as the source to create the Iteration to which this IterationSetup pertains
	 *     <p>
	 * Note 1:&#160;For the initial InterationSetup and Interation of an EngineeringModel, i.e. the first Iteration version, <i>sourceIterationSetup</i> is set to <i>null</i>, which means there was no source.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;The <i>sourceIterationSetup</i> must be kept in sync with the <i>sourceIteration</i> property of EngineeringModel.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Iteration Setup</em>' reference.
	 * @see #setSourceIterationSetup(IterationSetup)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getIterationSetup_SourceIterationSetup()
	 * @model ordered="false"
	 * @generated
	 */
	IterationSetup getSourceIterationSetup();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.IterationSetup#getSourceIterationSetup <em>Source Iteration Setup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Iteration Setup</em>' reference.
	 * @see #getSourceIterationSetup()
	 * @generated
	 */
	void setSourceIterationSetup(IterationSetup value);

	/**
	 * Returns the value of the '<em><b>Frozen On</b></em>' attribute.
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
	 * optional definition of the date and time when this Iteration was frozen, i.e. saved with the intention not to be modified thereafter
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frozen On</em>' attribute.
	 * @see #setFrozenOn(OffsetDateTime)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getIterationSetup_FrozenOn()
	 * @model dataType="CDP4.CommonData.DateTime" ordered="false"
	 * @generated
	 */
	OffsetDateTime getFrozenOn();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.IterationSetup#getFrozenOn <em>Frozen On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frozen On</em>' attribute.
	 * @see #getFrozenOn()
	 * @generated
	 */
	void setFrozenOn(OffsetDateTime value);

	/**
	 * Returns the value of the '<em><b>Is Deleted</b></em>' attribute.
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
	 * assertion whether the contents of this iteration have been deleted
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;Deleting the contents of an iteration means removing the Iteration (with <i>iid</i> equal to <i>iterationIid</i>)&#160;and all the objects it contains from the persistent data store. This is useful in order to support clean up of obsolete iterations. Of course by deleting all content data that capture the state of the EngineeringModel at the end of the affected Iteration will be lost, only the descriptive data in IterationSetup remains.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Deleted</em>' attribute.
	 * @see #setIsDeleted(Boolean)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getIterationSetup_IsDeleted()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsDeleted();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.IterationSetup#getIsDeleted <em>Is Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Deleted</em>' attribute.
	 * @see #getIsDeleted()
	 * @generated
	 */
	void setIsDeleted(Boolean value);

} // IterationSetup
