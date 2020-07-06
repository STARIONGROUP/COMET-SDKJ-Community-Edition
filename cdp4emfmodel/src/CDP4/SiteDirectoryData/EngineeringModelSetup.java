/**
 */
package CDP4.SiteDirectoryData;

import CDP4.CommonData.DefinedThing;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engineering Model Setup</b></em>'.
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
 * representation of the set-up information of a concurrent engineering model
 *     </p>
 * 
 *     <p>
 * Note:&#160;The data that defines a complete engineering model is split over two containers: EngineeringModelSetup and EngineeringModel. The rationale behind this is as follows: the EngineeringModelSetup contains the minimum information needed to provide an overview of all models available on a site and the associated EngineeringModel contains the actual detailed content of the model. In E-TM-10-25 applications it is then possible that all EngineeringModelSetups reside inside the SiteDirectory database and each EngineeringModel resides in its own separate database.
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
 *   <li>{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getParticipant <em>Participant</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getActiveDomain <em>Active Domain</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getKind <em>Kind</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getStudyPhase <em>Study Phase</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getRequiredRdl <em>Required Rdl</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getEngineeringModelIid <em>Engineering Model Iid</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getIterationSetup <em>Iteration Setup</em>}</li>
 *   <li>{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getSourceEngineeringModelSetupIid <em>Source Engineering Model Setup Iid</em>}</li>
 * </ul>
 *
 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEngineeringModelSetup()
 * @model
 * @generated
 */
public interface EngineeringModelSetup extends DefinedThing, ParticipantAffectedAccessThing {
	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.Participant}.
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
	 * reference to the actual Participants of the team that is allowed to access this EngineeringModelSetup and associated EngineeringModel
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEngineeringModelSetup_Participant()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Participant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Active Domain</b></em>' reference list.
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
	 * refererence to the active domains of expertise (DomainOfExpertise) for this EngineeringModelSetup and associated EngineeringModel
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;The possible domains of expertise are defined in the SiteDirectory in which this EngineeringModelSetup is contained.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Domain</em>' reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEngineeringModelSetup_ActiveDomain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<DomainOfExpertise> getActiveDomain();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link CDP4.SiteDirectoryData.EngineeringModelKind}.
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
	 * definition of the kind of the engineering model
	 *     </p>
	 * 
	 *     <p>
	 * Note: See EngineeringModelKind for definitions of the different kinds of engineering model.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see CDP4.SiteDirectoryData.EngineeringModelKind
	 * @see #setKind(EngineeringModelKind)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEngineeringModelSetup_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EngineeringModelKind getKind();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see CDP4.SiteDirectoryData.EngineeringModelKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EngineeringModelKind value);

	/**
	 * Returns the value of the '<em><b>Study Phase</b></em>' attribute.
	 * The literals are from the enumeration {@link CDP4.SiteDirectoryData.StudyPhaseKind}.
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
	 * definition of the actual phase that the engineering model is in
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Study Phase</em>' attribute.
	 * @see CDP4.SiteDirectoryData.StudyPhaseKind
	 * @see #setStudyPhase(StudyPhaseKind)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEngineeringModelSetup_StudyPhase()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StudyPhaseKind getStudyPhase();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getStudyPhase <em>Study Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Phase</em>' attribute.
	 * @see CDP4.SiteDirectoryData.StudyPhaseKind
	 * @see #getStudyPhase()
	 * @generated
	 */
	void setStudyPhase(StudyPhaseKind value);

	/**
	 * Returns the value of the '<em><b>Required Rdl</b></em>' containment reference.
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
	 * reference to the (first)&#160;ReferenceDataLibrary that contains reference data for the engineering model
	 *     </p>
	 * 
	 *     <p>
	 * Note 1: Reference data consists of predefined instances that can be used across one or more studies.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2: A chain of more than one ReferenceDataLibrary can be specified by linking to a ReferenceDataLibrary through the <i>requiredRdl</i> property of the associated ReferenceDataLibrary.
	 *     </p>
	 * 
	 *     <p>
	 * Note 3:The ReferenceDataLibraries are loaded in the reverse order of the chain, at runtime when an EngineeringModelSetup is opened. If the same concept (predefined instance)&#160;appears in more than one ReferenceDataLibrary the definition from the last loaded instance overwrites the definition of any earlier loaded instance (TBC!).
	 *     </p>
	 * 
	 *     <p>
	 * Note 4:&#160;Typically an EngineeringModelSetup has 3 ReferenceDataLibraries, as follows:
	 *     </p>
	 * 
	 *     <ol>
	 *       <li>
	 * A &quot;top&quot; ReferenceDataLibrary&#160;that contains predefined data that is common to all concurrent design studies, e.g. SI&#160;quantities and units.
	 *       </li>
	 *       <li>
	 * A &quot;family of applications&quot; ReferenceDataLibrary&#160;that contains predefined data that is common to a family of applications, e.g. spacecraft mission design, space instrument design or system of systems development. Such data may include DomainOfExpertises, ParameterTypes.
	 *       </li>
	 *       <li>
	 * A&#160;&quot;study level&quot; ReferenceDataLibrary&#160;that contains reference data that is particular to a given study.
	 * 
	 *       </li>
	 *     </ol>
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Rdl</em>' containment reference.
	 * @see #setRequiredRdl(ModelReferenceDataLibrary)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEngineeringModelSetup_RequiredRdl()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ModelReferenceDataLibrary getRequiredRdl();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getRequiredRdl <em>Required Rdl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Rdl</em>' containment reference.
	 * @see #getRequiredRdl()
	 * @generated
	 */
	void setRequiredRdl(ModelReferenceDataLibrary value);

	/**
	 * Returns the value of the '<em><b>Engineering Model Iid</b></em>' attribute.
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
	 * definition of the unique instance identifier (<i>iid</i>)&#160;of the associated EngineeringModel instance
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;No direct reference is made to the EngineeringModel instance since it possibly resides in a different persistent data store partition than the EngineeringModelSetup, and it should be possible to load the EngineeringModelSetup without loading the associated EngineeringModel. The EngineeringModel instance is existence dependent on the EngineeringModelSetup instance.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engineering Model Iid</em>' attribute.
	 * @see #setEngineeringModelIid(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEngineeringModelSetup_EngineeringModelIid()
	 * @model dataType="CDP4.CommonData.Uuid" required="true" ordered="false"
	 * @generated
	 */
	String getEngineeringModelIid();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getEngineeringModelIid <em>Engineering Model Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engineering Model Iid</em>' attribute.
	 * @see #getEngineeringModelIid()
	 * @generated
	 */
	void setEngineeringModelIid(String value);

	/**
	 * Returns the value of the '<em><b>Iteration Setup</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.SiteDirectoryData.IterationSetup}.
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
	 * representation of the collection of IterationSetups in this EngineeringModelSetup that records the history of iterations of the associated EngineeringModel
	 *     </p>
	 * 
	 *     <p>
	 * Note 1:&#160;An iteration is a version of the associated EngineeringModel that was considered as one complete step in the development of the EngineeringModel in a concurrent engineering activity.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;The content of each iteration is stored in an instance of EngineeringModel denoted by its <i>iterationNumber</i>. In order to support efficient database implementations a data partitioning technique may be used in the database architecture. The ECSS-E-TM-10-25 application will need to implement a mechanism to retrieve a complete set or a subset of iterations of an EngineeringModel, but this mechanism is not defined in this data model.
	 *     </p>
	 * 
	 *     <p>
	 * Note 3: The record of iterations is kept inside EngineeringModelSetup so that in an implementation only the EngineeringModelSetup needs to be accessed in order to get a list of iterations that are present in the associated EngineeringModel.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iteration Setup</em>' containment reference list.
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEngineeringModelSetup_IterationSetup()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<IterationSetup> getIterationSetup();

	/**
	 * Returns the value of the '<em><b>Source Engineering Model Setup Iid</b></em>' attribute.
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
	 * optional unique identifier that references the source EngineeringModelSetup (and associated EngineeringModel)&#160;that was used as the basis to create this EngineeringModelSetup (and associated EngineeringModel)
	 *     </p>
	 * 
	 *     <p>
	 * Note: This reference should be specified when a new engineering model is created as a copy from an existing (source)&#160;engineering model, and in particular when the source engineering model is a template model (with <i>kind</i> is EngineeringModelKind.TEMPLATE_MODEL).
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Engineering Model Setup Iid</em>' attribute.
	 * @see #setSourceEngineeringModelSetupIid(String)
	 * @see CDP4.SiteDirectoryData.SiteDirectoryDataPackage#getEngineeringModelSetup_SourceEngineeringModelSetupIid()
	 * @model dataType="CDP4.CommonData.Uuid" ordered="false"
	 * @generated
	 */
	String getSourceEngineeringModelSetupIid();

	/**
	 * Sets the value of the '{@link CDP4.SiteDirectoryData.EngineeringModelSetup#getSourceEngineeringModelSetupIid <em>Source Engineering Model Setup Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Engineering Model Setup Iid</em>' attribute.
	 * @see #getSourceEngineeringModelSetupIid()
	 * @generated
	 */
	void setSourceEngineeringModelSetupIid(String value);

} // EngineeringModelSetup
