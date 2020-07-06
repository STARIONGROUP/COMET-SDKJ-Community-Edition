/**
 */
package CDP4.EngineeringModelData;

import CDP4.SiteDirectoryData.DomainOfExpertise;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owned Thing</b></em>'.
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
 * representation of a Thing that has a single DomainOfExpertise as an owner
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
 *   <li>{@link CDP4.EngineeringModelData.OwnedThing#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getOwnedThing()
 * @model abstract="true"
 * @generated
 */
public interface OwnedThing extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
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
	 * reference to a DomainOfExpertise that is the owner of this OwnedThing
	 *     </p>
	 * 
	 *     <p>
	 * Note: Ownership in this data model implies the responsibility for the presence and content of this OwnedThing. The owner is always a DomainOfExpertise. The Participant or Participants representing an owner DomainOfExpertise are thus responsible for (i.e. take ownership of)&#160;a coherent set of concerns in a concurrent engineering activity.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(DomainOfExpertise)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getOwnedThing_Owner()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DomainOfExpertise getOwner();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.OwnedThing#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(DomainOfExpertise value);

} // OwnedThing
