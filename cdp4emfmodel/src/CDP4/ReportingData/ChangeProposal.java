/**
 */
package CDP4.ReportingData;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.ChangeProposal#getChangeRequest <em>Change Request</em>}</li>
 * </ul>
 *
 * @see CDP4.ReportingData.ReportingDataPackage#getChangeProposal()
 * @model
 * @generated
 */
public interface ChangeProposal extends ModellingAnnotationItem {
	/**
	 * Returns the value of the '<em><b>Change Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Request</em>' reference.
	 * @see #setChangeRequest(ChangeRequest)
	 * @see CDP4.ReportingData.ReportingDataPackage#getChangeProposal_ChangeRequest()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ChangeRequest getChangeRequest();

	/**
	 * Sets the value of the '{@link CDP4.ReportingData.ChangeProposal#getChangeRequest <em>Change Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Request</em>' reference.
	 * @see #getChangeRequest()
	 * @generated
	 */
	void setChangeRequest(ChangeRequest value);

} // ChangeProposal
