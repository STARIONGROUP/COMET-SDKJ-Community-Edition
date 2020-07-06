/**
 */
package CDP4.ReportingData;

import CDP4.EngineeringModelData.OwnedThing;

import CDP4.SiteDirectoryData.Participant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Approval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.Approval#getAuthor <em>Author</em>}</li>
 *   <li>{@link CDP4.ReportingData.Approval#getClassification <em>Classification</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getApproval()
 * @model
 * @generated
 */
public interface Approval extends GenericAnnotation, OwnedThing {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(Participant)
	 * @see CDP4.ReportingData.ReportingDataPackage#getApproval_Author()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Participant getAuthor();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.Approval#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Participant value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' attribute.
	 * The literals are from the enumeration {@link CDP4.ReportingData.AnnotationApprovalKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' attribute.
	 * @see CDP4.ReportingData.AnnotationApprovalKind
	 * @see #setClassification(AnnotationApprovalKind)
	 * @see CDP4.ReportingData.ReportingDataPackage#getApproval_Classification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AnnotationApprovalKind getClassification();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.Approval#getClassification <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' attribute.
	 * @see CDP4.ReportingData.AnnotationApprovalKind
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(AnnotationApprovalKind value);

} // Approval
