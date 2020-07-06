/**
 */
package CDP4.EngineeringModelData;

import CDP4.CommonData.TopContainer;

import CDP4.ReportingData.Book;
import CDP4.ReportingData.EngineeringModelDataNote;
import CDP4.ReportingData.ModellingAnnotationItem;

import CDP4.SiteDirectoryData.EngineeringModelSetup;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engineering Model</b></em>'.
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
 * representation of a parametric concurrent engineering model that specifies the problem to be solved and defines one or more (possible) design solutions
 *     </p>
 * 
 *     <p>
 * Note 1:&#160;An&#160;EngineeringModel also references a chain of one or more ReferenceDataLibraries (through the <i>requiredRdl</i> property of the associated EngineeringModelSetup)&#160;that define the reference data that is or can be used in the model.
 *     </p>
 * 
 *     <p>
 * Note 2:&#160;When an EngineeringModel is created for first time, it shall contain one Iteration and one Option (with <i>name</i> and <i>shortName</i> set to &quot;Default&quot;), which shall also be referenced as the <i>defaultOption</i>.
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
 *   <li>{@link CDP4.EngineeringModelData.EngineeringModel#getEngineeringModelSetup <em>Engineering Model Setup</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.EngineeringModel#getCommonFileStore <em>Common File Store</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.EngineeringModel#getLogEntry <em>Log Entry</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.EngineeringModel#getIteration <em>Iteration</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.EngineeringModel#getBook <em>Book</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.EngineeringModel#getGenericNote <em>Generic Note</em>}</li>
 *   <li>{@link CDP4.EngineeringModelData.EngineeringModel#getModellingAnnotation <em>Modelling Annotation</em>}</li>
 * </ul>
 *
 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getEngineeringModel()
 * @model
 * @generated
 */
public interface EngineeringModel extends TopContainer {
	/**
	 * Returns the value of the '<em><b>Engineering Model Setup</b></em>' reference.
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
	 *     reference to the set-up information for this EngineeringModel
	 *   </body>
	 * 
	 * </html>
	 * 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Engineering Model Setup</em>' reference.
	 * @see #setEngineeringModelSetup(EngineeringModelSetup)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getEngineeringModel_EngineeringModelSetup()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EngineeringModelSetup getEngineeringModelSetup();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.EngineeringModel#getEngineeringModelSetup <em>Engineering Model Setup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engineering Model Setup</em>' reference.
	 * @see #getEngineeringModelSetup()
	 * @generated
	 */
	void setEngineeringModelSetup(EngineeringModelSetup value);

	/**
	 * Returns the value of the '<em><b>Common File Store</b></em>' containment reference.
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
	 * representation of the CommonFileStore in this EngineeringModel
	 *     </p>
	 * 
	 *     <p>
	 * Note:&#160;Typically there will be one CommonFileStore shared by all domains in a particular EngineeringModel, plus one DomainFileStore for each DomainOfExpertise.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Common File Store</em>' containment reference.
	 * @see #setCommonFileStore(CommonFileStore)
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getEngineeringModel_CommonFileStore()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	CommonFileStore getCommonFileStore();

	/**
	 * Sets the value of the '{@link CDP4.EngineeringModelData.EngineeringModel#getCommonFileStore <em>Common File Store</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common File Store</em>' containment reference.
	 * @see #getCommonFileStore()
	 * @generated
	 */
	void setCommonFileStore(CommonFileStore value);

	/**
	 * Returns the value of the '<em><b>Log Entry</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.ModelLogEntry}.
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
	 * collection of logbook entries for this EngineeringModel
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Entry</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getEngineeringModel_LogEntry()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModelLogEntry> getLogEntry();

	/**
	 * Returns the value of the '<em><b>Iteration</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.EngineeringModelData.Iteration}.
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
	 * collection of Iterations in this EngineeringModel
	 *     </p>
	 * 
	 *     <p>
	 * Note 1:&#160;An iteration is a version of the EngineeringModel that is considered as one complete and coherent step in the development of the EngineeringModel in a concurrent engineering activity. The detailed definition and understanding of the meaning of a &quot;complete and coherent&quot; step depends on the organization that develops the EngineeringModel.
	 *     </p>
	 * 
	 *     <p>
	 * Note 2:&#160;In a&#160;concurrent engineering activity the engineering model for the system-of-interest is developed in a number of iterations, where in each iteration the problem specification in the form of the RequirementsSpecification and a design solution in the form of the Options and ElementDefinitions are elaborated and refined. With an iteration the engineering team strives to set one more step in the direction of achieving a converged definition that fulfills the objectives of their activity.
	 *     </p>
	 * 
	 *     <p>
	 * Note 3:&#160;In an implementation of E-TM-10-25 the actual Iteration objects may be stored in different partitions in a persistent data store.
	 * 
	 *     </p>
	 * 
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iteration</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getEngineeringModel_Iteration()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Iteration> getIteration();

	/**
	 * Returns the value of the '<em><b>Book</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.ReportingData.Book}.
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
	 * collection of Books in this EngineeringModel
	 *     </p>
	 *   </body>
	 * </html>
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Book</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getEngineeringModel_Book()
	 * @model containment="true"
	 * @generated
	 */
	EList<Book> getBook();

	/**
	 * Returns the value of the '<em><b>Generic Note</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.ReportingData.EngineeringModelDataNote}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Note</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getEngineeringModel_GenericNote()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EngineeringModelDataNote> getGenericNote();

	/**
	 * Returns the value of the '<em><b>Modelling Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.ReportingData.ModellingAnnotationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelling Annotation</em>' containment reference list.
	 * @see CDP4.EngineeringModelData.EngineeringModelDataPackage#getEngineeringModel_ModellingAnnotation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModellingAnnotationItem> getModellingAnnotation();

} // EngineeringModel
