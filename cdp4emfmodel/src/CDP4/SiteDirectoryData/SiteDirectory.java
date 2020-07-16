/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;
import CDP4.CommonData.TimeStampedThing;
import CDP4.CommonData.TopContainer;

import CDP4.ReportingData.SiteDirectoryDataAnnotation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site Directory</b></em>'.
 * <!-- end-user-doc -->
 *
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
 *       resource directory that contains (references to)&#160;the data that is used 
 *       across all models, templates, catalogues and reference data for a 
 *       specific concurrent design centre
 *     </p>
 * 
 *     <p>
 *       Note: Typically one concurrent design centre will deploy a single 
 *       instance of a  SiteDirectory which is then a 
 *       central administrative resource.
 *     </p>
 * 
 *   </body>
 * 
 * </html>
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.SiteDirectoryData.SiteDirectory#getOrganization <em>Organization</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.SiteDirectory#getPerson <em>Person</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.SiteDirectory#getParticipantRole <em>Participant Role</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.SiteDirectory#getDefaultParticipantRole <em>Default Participant Role</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.SiteDirectory#getSiteReferenceDataLibrary <em>Site Reference Data Library</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.SiteDirectory#getModel <em>Model</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.SiteDirectory#getPersonRole <em>Person Role</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.SiteDirectory#getDefaultPersonRole <em>Default Person Role</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.SiteDirectory#getLogEntry <em>Log Entry</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.SiteDirectory#getDomainGroup <em>Domain Group</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.SiteDirectory#getDomain <em>Domain</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.SiteDirectory#getNaturalLanguage <em>Natural Language</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.SiteDirectory#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSiteDirectory()
 * @model
 * @generated
 */
public interface SiteDirectory extends TopContainer, NamedThing, ShortNamedThing, TimeStampedThing {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.Organization}.
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
	 *     specification of the Organizations known in this SiteDirectory
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSiteDirectory_Organization()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Organization> getOrganization();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.Person}.
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
	 *     specification of the Persons known in this SiteDirectory
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSiteDirectory_Person()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Person> getPerson();

	/**
	 * Returns the value of the '<em><b>Participant Role</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.ParticipantRole}.
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
	 * collection of ParticipantRoles defined in this SiteDirectory
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant Role</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSiteDirectory_ParticipantRole()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ParticipantRole> getParticipantRole();

	/**
	 * Returns the value of the '<em><b>Default Participant Role</b></em>' reference.
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
	 * specification of the default ParticipantRole to be used when creating a new Participant in an EngineeringModelSetup
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Participant Role</em>' reference.
	 * @see #setDefaultParticipantRole(ParticipantRole)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSiteDirectory_DefaultParticipantRole()
	 * @model ordered="false"
	 * @generated
	 */
	ParticipantRole getDefaultParticipantRole();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.SiteDirectory#getDefaultParticipantRole <em>Default Participant Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Participant Role</em>' reference.
	 * @see #getDefaultParticipantRole()
	 * @generated
	 */
	void setDefaultParticipantRole(ParticipantRole value);

	/**
	 * Returns the value of the '<em><b>Site Reference Data Library</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.SiteReferenceDataLibrary}.
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
	 *     specification of the ReferenceDataLibraries defined in this     SiteDirectory
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Site Reference Data Library</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSiteDirectory_SiteReferenceDataLibrary()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SiteReferenceDataLibrary> getSiteReferenceDataLibrary();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.EngineeringModelSetup}.
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
	 * specification of the engineering models (EngineeringModelSetups) defined in this SiteDirectory
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;In an implementation of SiteDirectory it may be useful - for performance reasons - to add a cache that contains consolidated information from a collection of models, e.g. the participants with their roles and domains in various concurrent engineering studies.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSiteDirectory_Model()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EngineeringModelSetup> getModel();

	/**
	 * Returns the value of the '<em><b>Person Role</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.PersonRole}.
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
	 * collection of PersonRoles defined in this SiteDirectory
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person Role</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSiteDirectory_PersonRole()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PersonRole> getPersonRole();

	/**
	 * Returns the value of the '<em><b>Default Person Role</b></em>' reference.
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
	 * specification of the default PersonRole to be used when creating a new Person
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Person Role</em>' reference.
	 * @see #setDefaultPersonRole(PersonRole)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSiteDirectory_DefaultPersonRole()
	 * @model ordered="false"
	 * @generated
	 */
	PersonRole getDefaultPersonRole();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.SiteDirectory#getDefaultPersonRole <em>Default Person Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Person Role</em>' reference.
	 * @see #getDefaultPersonRole()
	 * @generated
	 */
	void setDefaultPersonRole(PersonRole value);

	/**
	 * Returns the value of the '<em><b>Log Entry</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.SiteLogEntry}.
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
	 * collection of logbook entries (SiteLogEntry)&#160;for this SiteDirectory
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Entry</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSiteDirectory_LogEntry()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SiteLogEntry> getLogEntry();

	/**
	 * Returns the value of the '<em><b>Domain Group</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.DomainOfExpertiseGroup}.
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
	 * collection of DomainOfExpertiseGroups defined for this SiteDirectory
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Group</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSiteDirectory_DomainGroup()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DomainOfExpertiseGroup> getDomainGroup();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
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
	 * collection of domains of expertise (DomainOfExpertise)&#160;known in this SiteDirectory
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSiteDirectory_Domain()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DomainOfExpertise> getDomain();

	/**
	 * Returns the value of the '<em><b>Natural Language</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.NaturalLanguage}.
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
	 * collection of NaturalLanguages known in this SiteDirectory
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Natural Language</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSiteDirectory_NaturalLanguage()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<NaturalLanguage> getNaturalLanguage();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.ReportingData.SiteDirectoryDataAnnotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getSiteDirectory_Annotation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SiteDirectoryDataAnnotation> getAnnotation();

} // SiteDirectory
