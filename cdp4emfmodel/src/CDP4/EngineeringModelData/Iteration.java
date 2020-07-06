/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.Thing;

import CDP4.DiagramData.DiagramCanvas;
import CDP4.DiagramData.SharedStyle;

import CDP4.SiteDirectoryData.IterationSetup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteration</b></em>'.
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
 * representation of an Iteration of an EngineeringModel
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;An iteration is a version of the EngineeringModel that was considered as one complete and coherent step in the development of the EngineeringModel in a concurrent engineering activity. The detailed definition and understanding of the meaning of a &quot;complete and coherent&quot; step depends on the organization and activity that develops the EngineeringModel.
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
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getIterationSetup <em>Iteration Setup</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getSourceIterationIid <em>Source Iteration Iid</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getOption <em>Option</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getPublication <em>Publication</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getPossibleFiniteStateList <em>Possible Finite State List</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getTopElement <em>Top Element</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getElement <em>Element</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getExternalIdentifierMap <em>External Identifier Map</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getRequirementsSpecification <em>Requirements Specification</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getDomainFileStore <em>Domain File Store</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getActualFiniteStateList <em>Actual Finite State List</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getDefaultOption <em>Default Option</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getRuleVerificationList <em>Rule Verification List</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getStakeholder <em>Stakeholder</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getGoal <em>Goal</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getValueGroup <em>Value Group</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getStakeholderValue <em>Stakeholder Value</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getStakeholderValueMap <em>Stakeholder Value Map</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getSharedDiagramStyle <em>Shared Diagram Style</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.Iteration#getDiagramCanvas <em>Diagram Canvas</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration()
 * @model
 * @generated
 */
public interface Iteration extends Thing {
	/**
	 * Returns the value of the '<em><b>Iteration Setup</b></em>' reference.
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
	 * reference to the IterationSetup that contains descriptive information about this Iteration at SiteDirectory level
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iteration Setup</em>' reference.
	 * @see #setIterationSetup(IterationSetup)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_IterationSetup()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IterationSetup getIterationSetup();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.Iteration#getIterationSetup <em>Iteration Setup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteration Setup</em>' reference.
	 * @see #getIterationSetup()
	 * @generated
	 */
	void setIterationSetup(IterationSetup value);

	/**
	 * Returns the value of the '<em><b>Source Iteration Iid</b></em>' attribute.
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
	 * definition of the unique instance identifier of Iteration that was used as the source to create this Iteration
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;This property records the provenance of the Iteration. Except for the first Iteration of an EngineeeringModel any subsequent Iteration is created as a copy of a source Iteration. For the first Iteration the <i>sourceIterationIid</i> is set to <i>null</i>, which means there was no source.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Iteration Iid</em>' attribute.
	 * @see #setSourceIterationIid(String)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_SourceIterationIid()
	 * @model dataType="CDP4.CommonData.Uuid" ordered="false"
	 * @generated
	 */
	String getSourceIterationIid();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.Iteration#getSourceIterationIid <em>Source Iteration Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Iteration Iid</em>' attribute.
	 * @see #getSourceIterationIid()
	 * @generated
	 */
	void setSourceIterationIid(String value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.Option}.
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
	 * collection of Options defined in this Iteration of an EngineeringModel
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Option</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_Option()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Option> getOption();

	/**
	 * Returns the value of the '<em><b>Publication</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.Publication}.
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
	 * collection of Publications that are part of this Iteration of an EngineeringModel
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Publication</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_Publication()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Publication> getPublication();

	/**
	 * Returns the value of the '<em><b>Possible Finite State List</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.PossibleFiniteStateList}.
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
	 * collection of PossibleFiniteStateLists defined for this Iteration of an EngineeringModel
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Possible Finite State List</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_PossibleFiniteStateList()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PossibleFiniteStateList> getPossibleFiniteStateList();

	/**
	 * Returns the value of the '<em><b>Top Element</b></em>' reference.
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
	 * reference to the ElementDefinition that represents the top node of the decomposition of the system-of-interest for this Iteration of an EngineeringModel
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;There is one single topElement for all Options.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top Element</em>' reference.
	 * @see #setTopElement(ElementDefinition)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_TopElement()
	 * @model ordered="false"
	 * @generated
	 */
	ElementDefinition getTopElement();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.Iteration#getTopElement <em>Top Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Element</em>' reference.
	 * @see #getTopElement()
	 * @generated
	 */
	void setTopElement(ElementDefinition value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ElementDefinition}.
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
	 * representation of all ElementDefinitions that represent the system-of-interest for this Iteration of an EngineeringModel
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_Element()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ElementDefinition> getElement();

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.Relationship}.
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
	 * collection of Relationships defined in this Iteration of an EngineeringModel
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_Relationship()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Relationship> getRelationship();

	/**
	 * Returns the value of the '<em><b>External Identifier Map</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ExternalIdentifierMap}.
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
	 * collection of ExternalIdentifierMaps defined in this EngineeringModel
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Identifier Map</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_ExternalIdentifierMap()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ExternalIdentifierMap> getExternalIdentifierMap();

	/**
	 * Returns the value of the '<em><b>Requirements Specification</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.RequirementsSpecification}.
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
	 * collection of RequirementsSpecifications defined in this Iteration of an EngineeringModel
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements Specification</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_RequirementsSpecification()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RequirementsSpecification> getRequirementsSpecification();

	/**
	 * Returns the value of the '<em><b>Domain File Store</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.DomainFileStore}.
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
	 * collection of DomainFileStores in this Iteration
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;Typically there will be one DomainFileStore for each DomainOfExpertise in a particular EngineeringModel, plus one additional CommonFileStore shared by all domains.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain File Store</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_DomainFileStore()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DomainFileStore> getDomainFileStore();

	/**
	 * Returns the value of the '<em><b>Actual Finite State List</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ActualFiniteStateList}.
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
	 * collection of ActualFiniteStateLists defined for this Iteration of an EngineeringModel
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actual Finite State List</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_ActualFiniteStateList()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ActualFiniteStateList> getActualFiniteStateList();

	/**
	 * Returns the value of the '<em><b>Default Option</b></em>' reference.
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
	 * reference to the Option that is considered the default Option for this Iteration
	 *     </p>
	 * 
	 *     <p>
	 * Note: The referenced default Option must be one of the Options defined in the <i>option</i> property of the Iteration.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Option</em>' reference.
	 * @see #setDefaultOption(Option)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_DefaultOption()
	 * @model ordered="false"
	 * @generated
	 */
	Option getDefaultOption();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.Iteration#getDefaultOption <em>Default Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Option</em>' reference.
	 * @see #getDefaultOption()
	 * @generated
	 */
	void setDefaultOption(Option value);

	/**
	 * Returns the value of the '<em><b>Rule Verification List</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.RuleVerificationList}.
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
	 * collection of RuleVerificationLists defined for this Iteration of an EngineeringModel
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule Verification List</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_RuleVerificationList()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RuleVerificationList> getRuleVerificationList();

	/**
	 * Returns the value of the '<em><b>Stakeholder</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.Stakeholder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stakeholder</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_Stakeholder()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Stakeholder> getStakeholder();

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_Goal()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Goal> getGoal();

	/**
	 * Returns the value of the '<em><b>Value Group</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ValueGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Group</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_ValueGroup()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ValueGroup> getValueGroup();

	/**
	 * Returns the value of the '<em><b>Stakeholder Value</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.StakeholderValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stakeholder Value</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_StakeholderValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<StakeholderValue> getStakeholderValue();

	/**
	 * Returns the value of the '<em><b>Stakeholder Value Map</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.StakeHolderValueMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stakeholder Value Map</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_StakeholderValueMap()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<StakeHolderValueMap> getStakeholderValueMap();

	/**
	 * Returns the value of the '<em><b>Shared Diagram Style</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.DiagramData.SharedStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Diagram Style</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_SharedDiagramStyle()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SharedStyle> getSharedDiagramStyle();

	/**
	 * Returns the value of the '<em><b>Diagram Canvas</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.DiagramData.DiagramCanvas}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Canvas</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getIteration_DiagramCanvas()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DiagramCanvas> getDiagramCanvas();

} // Iteration
