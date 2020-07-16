/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.Thing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
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
 * representation of a participant in the team working in a concurrent engineering activity on an EngineeringModel
 *   </body>
 * </html>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.Participant#getIsActive <em>Is Active</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Participant#getPerson <em>Person</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Participant#getRole <em>Role</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Participant#getDomain <em>Domain</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.Participant#getSelectedDomain <em>Selected Domain</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends Thing, ParticipantAffectedAccessThing {
	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
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
	 *     assertion whether this Participant is active in the current 
	 *     EngineeringModel
	 * Note: This allows to set Participants that already started as member of a 
	 *     concurrent engineering team in an inactive role. Once created a 
	 *     Participant cannot be deleted without precautions because this may render 
	 *     earlier created data incomplete.
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(Boolean)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParticipant_IsActive()
	 * @model dataType="CDP4.CommonData.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsActive();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Participant#getIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #getIsActive()
	 * @generated
	 */
	void setIsActive(Boolean value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
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
	 * reference to the Person that is this Participant
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParticipant_Person()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Participant#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
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
	 * reference to the ParticipantRole assigned to this Participant
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see #setRole(ParticipantRole)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParticipant_Role()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ParticipantRole getRole();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Participant#getRole <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(ParticipantRole value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.DomainOfExpertise}.
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
	 * references to the domains of expertise (set of DomainOfExpertise) that this Participant may represent
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;At any moment in a session in an E-TM-10-25 compliant environment a Participant is actively representing one DomainOfExpertise only, see the <i>selectedDomain</i> property. If more than one DomainOfExpertise is specified, he or she may select any of those DomainOfExpertises to switch to, at any time during the session.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParticipant_Domain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<DomainOfExpertise> getDomain();

	/**
	 * Returns the value of the '<em><b>Selected Domain</b></em>' reference.
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
	 * active DomainOfExpertise selected by this Participant
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The selectedDomain must be one from the set of DomainOfExpertise specified in the <i>domain</i> property of this Participant.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selected Domain</em>' reference.
	 * @see #setSelectedDomain(DomainOfExpertise)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getParticipant_SelectedDomain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DomainOfExpertise getSelectedDomain();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.Participant#getSelectedDomain <em>Selected Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Domain</em>' reference.
	 * @see #getSelectedDomain()
	 * @generated
	 */
	void setSelectedDomain(DomainOfExpertise value);

} // Participant
