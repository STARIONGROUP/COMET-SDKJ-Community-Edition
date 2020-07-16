/**
 */
package CDP4.ReportingData;

import CDP4.SiteDirectoryData.Participant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engineering Model Data Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.EngineeringModelDataAnnotation#getRelatedThing <em>Related Thing</em>}</li>
 *   <li>{@link CDP4.ReportingData.EngineeringModelDataAnnotation#getAuthor <em>Author</em>}</li>
 *   <li>{@link CDP4.ReportingData.EngineeringModelDataAnnotation#getPrimaryAnnotatedThing <em>Primary Annotated Thing</em>}</li>
 *   <li>{@link CDP4.ReportingData.EngineeringModelDataAnnotation#getDiscussion <em>Discussion</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getEngineeringModelDataAnnotation()
 * @model abstract="true"
 * @generated
 */
public interface EngineeringModelDataAnnotation extends GenericAnnotation {
	/**
	 * Returns the value of the '<em><b>Related Thing</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.ReportingData.ModellingThingReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Thing</em>' containment reference list.
	 * @see CDP4.ReportingData.ReportingDataPackage#getEngineeringModelDataAnnotation_RelatedThing()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ModellingThingReference> getRelatedThing();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Participant)
	 * @see CDP4.ReportingData.ReportingDataPackage#getEngineeringModelDataAnnotation_Author()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Participant getAuthor();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.EngineeringModelDataAnnotation#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Participant value);

	/**
	 * Returns the value of the '<em><b>Primary Annotated Thing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Annotated Thing</em>' reference.
	 * @see #setPrimaryAnnotatedThing(ModellingThingReference)
	 * @see CDP4.ReportingData.ReportingDataPackage#getEngineeringModelDataAnnotation_PrimaryAnnotatedThing()
	 * @model ordered="false"
	 * @generated
	 */
	ModellingThingReference getPrimaryAnnotatedThing();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.EngineeringModelDataAnnotation#getPrimaryAnnotatedThing <em>Primary Annotated Thing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Annotated Thing</em>' reference.
	 * @see #getPrimaryAnnotatedThing()
	 * @generated
	 */
	void setPrimaryAnnotatedThing(ModellingThingReference value);

	/**
	 * Returns the value of the '<em><b>Discussion</b></em>' containment reference list.
	 * The list contents are of type {@link CDP4.ReportingData.EngineeringModelDataDiscussionItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussion</em>' containment reference list.
	 * @see CDP4.ReportingData.ReportingDataPackage#getEngineeringModelDataAnnotation_Discussion()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<EngineeringModelDataDiscussionItem> getDiscussion();

} // EngineeringModelDataAnnotation
